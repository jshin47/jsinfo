package com.jshin47.jtdc.server.view

/**
  * Created by justin on 5/7/16.
  */
object PageTemplate {

  import java.nio.charset.StandardCharsets

  import akka.http.scaladsl.model.HttpMethods
  import akka.http.scaladsl.server.RequestContext

  import scalatags.Text.all._

  def apply(pageTitle: String = "Justin Shin") = {

    lazy val title = "title".tag[String]

    html(
      head(
        meta(charset := StandardCharsets.UTF_8.name.toLowerCase),
        title(pageTitle)
      ),
      body(
        script(`type` := "text/javascript", src := "assets/client-jsdeps.js"),
        script(`type` := "text/javascript", src := "assets/client-fastopt.js"),
        script(raw(s"com.jshin47.jtdc.client.Main().main()"))
      )
    )

  }

}
