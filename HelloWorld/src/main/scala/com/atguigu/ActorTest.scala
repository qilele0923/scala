package com.atguigu

import scala.actors.Actor

/**
  * Created by qi on  2018-08-25 21:11
  */

object MyActor1 extends Actor{
  override def act(): Unit = {
    for(i <- 1 to 10){
      println("actor-1 "+i)
      Thread.sleep(2000)
    }
  }
}

object MyActor2 extends Actor{
  override def act(): Unit = {
    for(i <- 1 to 10){
      println("actor-2 "+i)
      Thread.sleep(2000)
    }
  }
}



object ActorTest extends  App {
  MyActor1.start()
  MyActor2.start()

}
