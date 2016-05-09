package com.jshin47.jtdc.server.route

import akka.http.scaladsl.server.{Directives, Route}
import akka.stream.ActorMaterializer
import com.jshin47.jtdc.api.ApiDef

trait ApiRoutes {

  this: AutowireApiRouting with Directives ⇒

  implicit def mat: ActorMaterializer

  val allApiRoutes: Route = {

    pathPrefix("api") {
      completeWithAutowire(server.route[ApiDef](null))
    }

  }
}
