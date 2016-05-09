package com.jshin47.jtdc.server.route

import akka.http.scaladsl.server.Directives

/**
  * Created by justin on 5/7/16.
  */
trait WebSocketRoutes {

  this: Directives ⇒

  val allSocketsRoutes = path("server-logs")(throw new NotImplementedError())

}
