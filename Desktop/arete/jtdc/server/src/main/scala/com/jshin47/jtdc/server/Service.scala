package com.jshin47.jtdc.server

import akka.actor.ActorSystem
import akka.http.scaladsl.server.Directives
import akka.stream.ActorMaterializer
import com.jshin47.jtdc.server.route._
import com.jshin47.shared.serialization.PrickleExtras

/**
  * Created by justin on 5/7/16.
  */
class Service(implicit val system:ActorSystem, val mat: ActorMaterializer)
  extends ApiRoutes
    with RenderedRoutes
    with ScalaTagsSupport
    with StaticResourceRoutes
    with WebSocketRoutes
    with Directives
    with AutowireApiRouting
    with PrickleExtras
{

  val routes = allApiRoutes ~ allResRoutes ~ allSocketsRoutes ~ allRenderedRoutes

}
