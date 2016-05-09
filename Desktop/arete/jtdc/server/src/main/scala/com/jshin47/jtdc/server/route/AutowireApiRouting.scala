package com.jshin47.jtdc.server.route

import akka.http.scaladsl.server.Directives
import akka.stream.Materializer
import autowire.Server
import com.jshin47.shared.serialization.{PrickleAutowireSerializationSupport, PrickleExtras}
import prickle.{Pickler, Unpickle, Unpickler}

/**
  * Created by justin on 5/7/16.
  */
trait AutowireApiRouting {

  this: Directives with PrickleExtras ⇒

  val server = new Server[String, Unpickler, Pickler] with PrickleAutowireSerializationSupport

  def completeWithAutowire[T](router: autowire.Core.Router[String])(implicit mat: Materializer) = {
    path(Segments) { s ⇒
     entity(as[String]) { str ⇒
      complete {
        router {
          autowire.Core.Request(s, Unpickle[Map[String, String]].fromString(str).get)
        }
      }
     }
    }
  }


}
