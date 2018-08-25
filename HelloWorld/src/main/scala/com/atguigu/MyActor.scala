package com.atguigu

import scala.actors.Actor

/**
  * Created by qi on  2018-08-25 21:35
  */
class MyActor extends Actor{
  override def act(): Unit = {
    while(true){
      receive {
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

object MyActor {
  def main(args: Array[String]): Unit = {
    val actor = new MyActor
    actor.start()

    actor ! "start"
    actor ! "stop"
    println("发送消息完成")
  }
}