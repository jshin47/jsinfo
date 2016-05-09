package com.jshin47.jtdc.server.route

import akka.http.scaladsl.server.Directives
import com.jshin47.jtdc.server.view.PageTemplate

/**
  * Created by justin on 5/7/16.
  */
trait RenderedRoutes {

  this: Directives with ScalaTagsSupport ⇒

  val allRenderedRoutes = pathEndOrSingleSlash {
    get {
      extractRequestContext { implicit ctx ⇒
        complete(PageTemplate())
      }
    }
  }

}
