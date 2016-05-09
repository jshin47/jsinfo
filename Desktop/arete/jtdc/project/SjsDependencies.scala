import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object SjsDependencies {

  
  
  object all {

    ///  ***************** PICKLING **************************************************************************************************************************************************

    val                   jsprickle   =   "com.github.benhutchison"                              ~>   "prickle"                                v version.prickle
    val                  jboopickle   =    "me.chrons"                                           ~>    "boopickle"                             v version.booPickle
    val                    autowire   =    "com.lihaoyi"                                         ~>    "autowire"                              v version.autowire
    val                    upickler   =    "com.lihaoyi"                                         ~>    "upickle"                               v version.upickle

    ///  ***************** LENSING ***************************************************************************************************************************************************

    val                    monocle1   =    "com.github.japgolly.fork.monocle"                    ~>    "monocle-core"                          v version.monocle
    val                    monocle2   =    "com.github.japgolly.fork.monocle"                    ~>    "monocle-macro"                         v version.monocle
    val              scalaReactExtm   =    "com.github.japgolly.scalajs-react"                   ~>    "ext-monocle"                           v version.scalaJsReact

    ///  ***************** REACTIVE **************************************************************************************************************************************************

    val                  scalaReact   =    "com.github.japgolly.scalajs-react"                   ~>    "core"                                  v version.scalaJsReact
    val             scalaReactExtra   =    "com.github.japgolly.scalajs-react"                   ~>    "extra"                                 v version.scalaJsReact
    val                scalaReact72   =    "com.github.japgolly.scalajs-react"                   ~>    "ext-scalaz72"                          v version.scalaJsReact
    val                scalaCssCore   =    "com.github.japgolly.scalacss"                        ~>    "core"                                  v version.scalaCss
    val                       monix   =    "io.monix"                                            ~>    "monix-reactive"                        v version.monix
    val                 reactocomps   =    "com.github.chandu0101.scalajs-react-components"      ~>    "core"                                  v version.reactComps
    val                       diode   =    "me.chrons"                                           ~>    "diode"                                 v version.diode
    val                  diodereact   =    "me.chrons"                                           ~>    "diode-react"                           v version.diode
    val                scalaCssExtR   =    "com.github.japgolly.scalacss"                        ~>    "ext-react"                             v version.scalaCss
    val                          rx   =    "com.lihaoyi"                                         ~>    "scalarx"                               v version.scalarx
    val                         sri   =    "com.github.chandu0101.sri"                           ~>    "web"                                   v version.sri
    val                       relay   =    "com.github.chandu0101.sri"                           ~>    "relay"                                 v version.sri
    val                       paths   =    "eu.unicredit"                                        ~>    "paths-scala-js"                        v version.paths
    ///  *************** FUNCTIONAL **************************************************************************************************************************************************

    val                  parboiled2   =    "com.github.karasiq"                                  ~>    "parboiled"                             v version.parboiled
    val                      zzzzzz   =    "org.scalaz"                                          ~>    "scalaz-core"                           v version.scalaz

    ///  ***************** DATABIND **************************************************************************************************************************************************

    val                         dom   =    "org.scala-js"                                        ~>    "scalajs-dom"                           v version.scalajsDom
    val               scalajsJquery   =    "be.doeraene"                                         ~>    "scalajs-jquery"                        v version.scalajsJquery
    val                 scaladgetjs   =    "fr.iscpif"                                           ~>    "scaladget"                             v version.scaladget
    val         scalajsJqueryFacade   =    "org.querki"                                          ~>    "jquery-facade"                         v version.scalajsJqueryFacade
    val                   bindingJs   =    "org.denigma"                                         ~>    "binding"                               v version.scalaJsBinding
    val                   bindingCt   =    "org.denigma"                                         ~>    "binding-controls"                      v version.scalaJsBindingControls
    val                    momentjs   =    "io.github.widok"                                     ~>    "scala-js-momentjs"                     v version.scalajsMoment
    val                   scalatags   =    "com.lihaoyi"                                         ~>    "scalatags"                             v version.scalatags
    val                      widok    =    "io.github.widok"                                     ~>    "widok"                                 v version.widok
    val                       woot    =    "com.dallaway.richard"                                ~>    "woot-model"                            v version.woot

    ///  ****************** LOGGING **************************************************************************************************************************************************
    val                    slogging   =    "biz.enef"                                            ~>    "slogging"                              v version.slogging

    ///  **************** SHAPELESS **************************************************************************************************************************************************

    val                   shapeless   =    "com.chuusai"                                         ~>    "shapeless"                             v version.shapeless

    ///  ***************** DATA ******************************************************************************************************************************************************

    val              randoNyayaProp   =    "com.github.japgolly.nyaya"                           ~>    "nyaya-prop"                            v version.nyaya
    val               randoNyayaGen   =    "com.github.japgolly.nyaya"                           ~>    "nyaya-gen"                             v version.nyaya
    val              randoNyayaTest   =    "com.github.japgolly.nyaya"                           ~>    "nyaya-test"                            v version.nyaya

    ///  ***************** AUDIOVID **************************************************************************************************************************************************

    val                          d3   =    "org.singlespaced"                                    ~>    "scalajs-d3"                            v version.scalajsD3
    val                     videojs   =    "com.github.karasiq"                                  ~>    "scalajs-videojs"                       v version.scalaJsVideo
    val                    markeSjs   =    "com.github.karasiq"                                  ~>    "scalajs-marked"                        v version.scalajsMarked



  }

  import all._

  val pickling =

    Sjses(jsprickle, jboopickle, autowire, upickler)

  val lensing =

    Sjses(monocle1, monocle2, scalaReactExtm)

  val css =

    Sjses(scalaCssCore)

  val reactjs =

    Sjses(
      scalaReact,
      scalaReactExtra,
      scalaReact72,
      scalaCssCore,
      reactocomps,
      diode,
      diodereact,
      scalaCssExtR,
      sri,
      relay,
      paths
    )

  val reactive =

    Sjses(
      monix,
      diode,
      rx
    )

  val functional =

    Sjses(parboiled2, zzzzzz)

  val tagsAndDom =

    Sjses(scalatags)

  val databind   =

    Sjses(dom, scalajsJquery, scalajsJqueryFacade, scaladgetjs, momentjs, scalatags, widok, bindingCt, bindingJs)

  val logging =

    Sjses(all.slogging)

  val shapeless =

    Sjses(all.shapeless)

  val audiovideo =

    Sjses(d3, videojs, markeSjs)

  val data =

    Sjses(randoNyayaGen, randoNyayaProp, randoNyayaTest)


  private object version {

    val                        woot   =        "0.1.1"
    val                      doodle   =        "0.5.1"
    val                       widok   =        "0.2.2"
    val                       paths   =        "0.4.4"
    val                       nyaya   =        "0.7.0"
    val                     scalarx   =        "0.3.1"
    val                       slf4s   =        "1.7.12"
    val                       log4j   =        "2.3"
    val                   scalaTest   =        "3.0.0-M15"
    val                   scalaMock   =        "3.2.2"
    val                     mockito   =        "1.10.19"
    val                        akka   =        "2.4.3"
    val                        kryo   =        "0.4.1"
    val                scalaJsReact   =        "0.11.0"
    val                    scalaCss   =        "0.4.1"
    val                       diode   =        "0.5.1"
    val                     upickle   =        "0.3.9"
    val                      supler   =        "0.3.0"
    val                   scalatags   =        "0.5.2"
    val                     reactJs   =        "15.0.1"
    val                       scopt   =        "3.3.0"
    val                     monocle   =        "1.2.0"
    val                      scalaz   =        "7.2.1"
    val                      monifu   =        "1.1"
    val                       monix   =        "2.0-M2"
    val                          d3   =        "3.5.5-1"
    val                          fa   =        "4.3.0-1"
    val                sjsbootstrap   =        "1.0.1"
    val                       scala   =        "2.11.8"
    val                    scalaDom   =        "0.9.0"
    val                scalajsReact   =        "0.10.4"
    val                    scalaCSS   =        "0.3.1"
    val                      log4js   =        "1.4.10"
    val                    autowire   =        "0.2.5"
    val                   booPickle   =        "1.1.2"
    val                       uTest   =        "0.3.1"
    val                       react   =        "0.14.7"
    val                  reactComps   =        "0.4.1"
    val                      jQuery   =        "1.11.1"
    val                   bootstrap   =        "3.3.2"
    val                     chartjs   =        "1.0.1"
    val                 playScripts   =        "0.4.0"
    val              scalaJsBinding   =        "0.8.6"
    val      scalaJsBindingControls   =        "0.0.14"
    val                   scaladget   =        "0.7.0"
    val                    paradise   =        "2.1.0"
    val                   cassandra   =        "0.11"
    val                    inmemory   =        "1.2.11"
    val                    momentjs   =        "0.1.4"
    val                  scalajsDom   =        "0.9.0"
    val                    slogging   =        "0.3"
    val               scalajsJquery   =        "0.9.0"
    val         scalajsJqueryFacade   =        "0.10"
    val                   scalajsD3   =        "0.3.3"
    val                scalaJsVideo   =        "1.0.2"
    val               scalajsMarked   =        "1.0.1"
    val               scalajsMoment   =        "0.1.4"
    val                    scalaxml   =        "1.0.5"
    val                   parboiled   =        "2.1.1-SNAPSHOT"
    val                   shapeless   =        "2.2.5"
    val                   webjarloc   =        "0.23"
    val                     prickle   =        "1.1.5"
    val                      mdLite   =        "0.1.0-SNAPSHOT"
    val                         sri   =        "0.4.0"
  }

  trait WrapsSjsDependencies {
    def toSettingsDefinition(): Def.SettingsDefinition
  }

  case class Sjs(org: String, sjsartifact: String, v: String) extends WrapsSjsDependencies {
    
    override def toSettingsDefinition(): Def.SettingsDefinition = Def.SettingsDefinition.wrapSettingsDefinition(
      libraryDependencies += org %%% sjsartifact % v
    )

    def +(sjs: Sjs) = Sjses(this, sjs)
  }
  
  object Sjs {
    def apply(org: String, f: SjsArtifactory): Sjs = Sjs(org, f.thisArtifact, f.v)
    def apply(unvd: UnversionedSjs, v: String): Sjs = Sjs(unvd.thisOrg, unvd.thisArtifact, v)
  }

  case class Sjses(sjs: Sjs*) extends WrapsSjsDependencies {
    override def toSettingsDefinition(): Def.SettingsDefinition = Def.SettingsDefinition.wrapSettingsDefinition(
      libraryDependencies ++= sjs.map { s ⇒
        s.org %%% s.sjsartifact % s.v
      }
    )

    def ++(eses: Sjs*) : Sjses = Sjses(this.sjs.toSeq ++ eses.toSeq:_*)
    def ++(eses: Sjses): Sjses = Sjses(this.sjs.toSeq ++ eses.sjs: _*)
  }
  
  case class SjsArtifactory(thisArtifact: String, v: String)

  case class UnversionedSjs(thisOrg: String, thisArtifact: String) {

    def v(versionNo: String) = Sjs(this, versionNo)

  }
  
  implicit class StringSjsDependencySupport(_this: String) {
    
    def ~>(f: SjsArtifactory) =
      Sjs(_this, f)
    
    def v(version: String) =
      SjsArtifactory(_this, version)
    
    def ~>(a: String) = UnversionedSjs(_this, a)
    
  }
  
}