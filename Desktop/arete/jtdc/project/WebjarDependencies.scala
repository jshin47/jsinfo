import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

object WebjarDependencies {

  private object allJsDependencies {

    lazy val        webjarReact   =   "org.webjars.bower"         %    "react"                           % version.react      / "react-with-addons.js"              minified "react-with-addons.min.js"                                     commonJSName "React"
    lazy val       webjarReact2   =   "org.webjars.bower"         %    "react"                           % version.react      / "react-dom.js"                      minified "react-dom.min.js"         dependsOn    "react-with-addons.js" commonJSName "ReactDOM"
    lazy val           webjarjq   =   "org.webjars"               %    "jquery"                          % version.jQuery     / "jquery.js"                         minified s"jquery.min.js"
    lazy val           webjarbs   =   "org.webjars"               %    "bootstrap"                       % version.bootstrap  / s"bootstrap.js"                      minified s"bootstrap.min.js"         dependsOn    "jquery.js" commonJSName  "bootstrap"
    lazy val        webjarchart   =   "org.webjars"               %    "chartjs"                         % version.chartjs    / "Chart.js"                          minified "Chart.min.js"
    lazy val         webjarl4js   =   "org.webjars"               %    "log4javascript"                  % version.log4js     / "js/log4javascript_uncompressed.js" minified "js/log4javascript.js"
    lazy val         webjard3js   =   "org.webjars"               %    "d3js"                            % version.d3         / s"d3.js"
    lazy val         bs_sidebar   = ( "org.webjars"               %    "bootstrap-sidebar"              % version.bs_sidebar intransitive())  / "js/sidebar.js" dependsOn s"bootstrap.js"
    lazy val  bs_bootstrap3diag   =  ("org.webjars.bower"         %    "bootstrap3-dialog"               % version.bs_bootstrap3diag intransitive()) / "dist/js/bootstrap-dialog.js" dependsOn s"bootstrap.js"
    lazy val        bs_material   =  ("org.webjars"               %    "bootstrap-material-design"       % version.bs_material  intransitive() )  / "js/material.js" dependsOn s"bootstrap.js"

    def apply() = Seq(webjarl4js, webjarReact2, webjarReact, webjard3js, webjarchart, webjarbs, webjarjq, bs_sidebar, bs_material)
  }

  private object allNonJsDependencies {

    val           webjarFontAwesome   =        "org.webjars"                                         %    "font-awesome"                                                          % version.fa
    val                       dagre   =        "org.webjars.bower"                                   %    "dagre"                                                                 % version.dagre
    val                     dagreD3   =        "org.webjars.bower"                                   %    "dagre-d3"                                                              % version.dagreD3
    val                     cloudD3   =        "org.webjars.bower"                                   %    "d3-cloud"                                                              % version.cloudD3
    val                  timelineD3   =        "org.webjars.bower"                                   %    "github-com-piotr-gawlowski-d3-timeline"                                % version.timelineD3
    val                       tipD3   =        "org.webjars.bower"                                   %    "d3-tip"                                                                % version.tipD3
    //val                      ironEl   =        "org.webjars.bower"                                   %    "iron-elements"                                                         % version.ironEl
    val                      mathis   =        "org.webjars.bower"                                   %    "mathjs"                                                                % version.mathis
    val                         mdi   =        "org.webjars.bower"                                   %    "mdi"                                                                   % version.mdl
    val                bs_typeahead   =        "org.webjars.bower"                                   %    "bootstrap3-typeahead"                                                  % version.bs_typeahead
    val           bs_typeahead_extd   =        "org.webjars.bower"                                   %    "bootstrap3-typeahead-extended"                                         % version.bs_typeahead_extd
    val               bs_tokenfield   =        "org.webjars"                                         %    "bootstrap-tokenfield"                                                  % version.bs_tokenfield
    val              bootstrap_sass   =        "org.webjars"                                         %    "bootstrap-sass"                                                        % version.bootstrap_sass
    val            bs_admintemplate   =        "org.webjars.bower"                                   %    "github-com-puikinsh-Bootstrap-Admin-Template"                          % version.bs_admintemplate
    val           bs_bootswatchTmpl   =        "org.webjars"                                         %    "bootswatch"                                                            % version.bs_bootswatchTmpl
    val                   bs_notify   =        "org.webjars"                                         %    "bootstrap-notify"                                                      % version.bs_notify
    val                   bs_slider   =        "org.webjars"                                         %    "bootstrap-slider"                                                      % version.bs_slider

    def apply() = Seq (
      webjarFontAwesome,
        mdi
    )
  }

  val js = allJsDependencies()
  val notJs = allNonJsDependencies()

  private object version {
    val                            d3 =  "3.5.12"
    val                            fa =  "4.6.1"
    val                         react =  "0.14.7"
    val                        log4js =  "1.4.10"
    val                        jQuery =  "1.11.1"
    val                     bootstrap =  "3.3.6"
    val                       chartjs =  "1.0.1"
    val                      momentjs =  "0.1.4"
    val                       element =  "0.5.3"
    val                       materui =  "0.14.4"
    val                        radium =  "0.16.6"
    val                    classnames =  "2.2.0"
    val                         dagre =  "0.7.4"
    val                       dagreD3 =  "0.4.17"
    val                       cloudD3 =  "1.2.1"
    val                    timelineD3 =  "0.0.5"
    val                         tipD3 =  "0.6.7"
    val                        ironEl =  "1.0.10"
    val                        mathis =  "3.2.0"
    val                           mdl =  "1.5.54"
    val             bs_bootstrap3diag =  "1.34.4"
    val                  bs_typeahead =  "3.1.1"
    val             bs_typeahead_extd =  "3.0.7"
    val                 bs_tokenfield =  "0.12.1"
    val                    bs_sidebar =  "0.2.2"
    val                bootstrap_sass =  "3.3.6"
    val              bs_admintemplate =  "2.3.1"
    val             bs_bootswatchTmpl =  "3.3.5+4"
    val                     bs_notify =  "3.1.3"
    val                   bs_material =  "0.5.9"
    val                     bs_slider =  "5.3.1"
  }

}