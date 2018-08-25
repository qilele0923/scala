package com.atguigu

import scala.actors.Actor

/**
  * Created by qi on  2018-08-25 21:42
  */
class YourActor extends Actor{
  override def act(): Unit = {
    loop{
      react{
        case "start"=>{
          println("starting.............")
          Thread.sleep(5000)
          println("started")
        }

        case "stop" =>{
          println("stopping...........")
          Thread.sleep(5000)
          println("stopped")
        }
      }
    }
  }
}

object YourActor {
  def main(args: Array[String]): Unit = {
    val actor = new YourActor
    actor.start()
    actor ! "start"
    actor ! "stop"
    println("消息发送完成")
  }
}
