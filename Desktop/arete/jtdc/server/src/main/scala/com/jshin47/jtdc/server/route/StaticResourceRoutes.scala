package com.jshin47.jtdc.server.route

import akka.http.scaladsl.server.{Directives, Route}

/**
  * Created by justin on 5/7/16.
  */
trait StaticResourceRoutes {

  this: Directives ⇒

  val allResRoutes = pathPrefix("assets")(getFromResourceDirectory("assets"))
}
