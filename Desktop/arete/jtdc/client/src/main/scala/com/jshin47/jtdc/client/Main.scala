package com.jshin47.jtdc.client

import japgolly.scalajs.react.{ReactComponentB, ReactDOM}

import scala.scalajs.js.annotation.JSExport
import scalacss.Defaults._
import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry
import org.scalajs.dom
import japgolly.scalajs.react.extra.router._
import japgolly.scalajs.react.vdom.prefix_<^._
import chandu0101.scalajs.react.components.Implicits._

import scala.scalajs.js.JSApp


object Main extends JSApp {


  @JSExport
  override def main(): Unit = {
    GlobalRegistry.addToDocumentOnRegistration()


  }

}
