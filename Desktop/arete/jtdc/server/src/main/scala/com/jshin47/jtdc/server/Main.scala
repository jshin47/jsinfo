package com.jshin47.jtdc.server

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory

object Main extends App {

  val configuration = ConfigFactory.load()

  implicit val system:               ActorSystem  =  ActorSystem("app", configuration)
  implicit val materializer:   ActorMaterializer  =  ActorMaterializer()
           val service:                 Service   =  new Service()

  import system.dispatcher

  Http().bindAndHandle(service.routes, interface = "0.0.0.0", port = 1234) onSuccess {
    case _ ⇒ system.log.info(s"Http server started on port 1234")
  }

}
