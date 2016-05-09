import sbt._
import sbt.Keys._

object CommonAutoPlugin extends AutoPlugin {
  override def requires: Plugins = plugins.JvmPlugin

  override def trigger: PluginTrigger = allRequirements

  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = Seq(

    scalaVersion          := "2.11.8",

    organization          := "com.jshin47",

    scalacOptions         := Seq(
      "-encoding", "UTF-8",
      "-Xexperimental",
      "-language:postfixOps",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-Xlint",
      "-Ywarn-dead-code"
    ),

    resolvers ++= Seq(
      Resolver.bintrayRepo("mfglabs", "maven"),
      Resolver.bintrayRepo("scalaz", "releases"),
      Resolver.bintrayRepo("underscoreio", "training"),
      Resolver.bintrayRepo("denigma", "denigma-releases"),
      Resolver.sonatypeRepo("public"),
      Resolver.sonatypeRepo("snapshots"),
      Resolver.sonatypeRepo("releases")
    )

  )

  lazy val generatedScalaJsJavascriptResources = TaskKey[Seq[File]]("All the javascripts, including maps")
  lazy val copyWebJarResources = taskKey[Unit]("Copy resources from WebJars")
}