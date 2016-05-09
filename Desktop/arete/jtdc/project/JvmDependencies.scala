

object JvmDependencies {

  import sbt._

  object all {

    ///  ********************* AKKA **************************************************************************************************************************************************

    val                   akkaActor   =        "com.typesafe.akka"                                   %%   "akka-actor"                            %   version.akka
    val                   akkaSlf4j   =        "com.typesafe.akka"                                   %%   "akka-slf4j"                            %   version.akka
    val            akkaClusterTools   =        "com.typesafe.akka"                                   %%   "akka-cluster-tools"                    %   version.akka
    val          akkaClusterMetrics   =        "com.typesafe.akka"                                   %%   "akka-cluster-metrics"                  %   version.akka
    val                akkaSharding   =        "com.typesafe.akka"                                   %%   "akka-cluster-sharding"                 %   version.akka
    val                    akkaHttp   =        "com.typesafe.akka"                                   %%   "akka-http-experimental"                %   version.akka
    val         akkaDistributedData   =        "com.typesafe.akka"                                   %%   "akka-distributed-data-experimental"    %   version.akka
    val             akkaCorePersist   =        "com.typesafe.akka"                                   %%   "akka-persistence"                      %   version.akka
    val                   akkaQuery   =        "com.typesafe.akka"                                   %%   "akka-persistence-query-experimental"   %   version.akka

    ///  ***************** PICKLING **************************************************************************************************************************************************

    val                     prickle   =        "com.github.benhutchison"                             %%   "prickle"                               %   version.prickle
    val                   boopickle   =        "me.chrons"                                           %%   "boopickle"                             %   version.booPickle
    val                    autowire   =        "com.lihaoyi"                                         %%   "autowire"                              %   version.autowire

    ///  ************* JAR LOCATING **************************************************************************************************************************************************

    val               webjarlocator   =        "org.webjars"                                         %    "webjars-locator"                       %   version.webjarloc

    ///  *************** FUNCTIONAL **************************************************************************************************************************************************

    val                      scalaz   =        "org.scalaz"                                          %%   "scalaz-core"                           %   version.scalaz
    val                      doodle   =        "underscoreio"                                        %%   "doodle"                                %   version.doodle
    ///  ******** XML SERIALIZATION **************************************************************************************************************************************************

    val                    scalaXml   =        "org.scala-lang.modules"                              %%   "scala-xml"                             %   version.scalaxml

    ///  ************** COMMAND LINE *************************************************************************************************************************************************

    val                       scopt   =        "com.github.scopt"                                    %%   "scopt"                                 %   version.scopt

    ///  ****************** LENSING **************************************************************************************************************************************************

    val                 monacleCore   =        "com.github.japgolly.fork.monocle"                    %%   "monocle-core"                          %   version.monocle
    val                     monaKro   =        "com.github.japgolly.fork.monocle"                    %%   "monocle-macro"                         %   version.monocle

    ///  ****************** TESTING **************************************************************************************************************************************************

    val                dockerclient   =        "se.marcuslonnberg"                                   %%   "scala-docker"                          %   version.dockermachine
    val                     qemumgr   =        "org.anarres.qemu"                                    %    "qemu-manager"                          %   version.qemumanager
    val                    qemuexec   =        "org.anarres.qemu"                                    %    "qemu-exec"                             %   version.qemuexec
    val                     qemuapi   =        "org.anarres.qemu"                                    %    "qemu-qapi"                             %   version.qemuqapi
    val                     qemuimg   =        "org.anarres.qemu"                                    %    "qemu-image"                            %   version.qemuimg

    ///  ****************** TESTING **************************************************************************************************************************************************

    val                   scalaTest   =        "org.scalatest"                                       %%   "scalatest"                             %   version.scalaTest    %  Test
    val                     mockito   =        "org.mockito"                                         %    "mockito-core"                          %   version.mockito      %  Test
    val                   scalaMock   =        "org.scalamock"                                       %%   "scalamock-scalatest-support"           %   version.scalaMock    %  Test

    ///  ****************** LOGGING **************************************************************************************************************************************************

    val                      l4japi   =        "org.apache.logging.log4j"                            %    "log4j-api"                             %   version.log4j
    val                     l4jcore   =        "org.apache.logging.log4j"                            %    "log4j-core"                            %   version.log4j
    val                l4jslf4jImpl   =        "org.apache.logging.log4j"                            %    "log4j-slf4j-impl"                      %   version.log4j        %  Runtime
    val                       slf4s   =        "org.slf4s"                                           %%   "slf4s-api"                             %   version.slf4s
  }

  val akka = Seq(
    all.akkaClusterMetrics,
    all.akkaClusterTools,
    all.akkaActor,
    all.akkaCorePersist,
    all.akkaHttp,
    all.akkaDistributedData,
    all.akkaSlf4j,
    all.akkaSharding,
    all.akkaQuery
  )

  val serverPickling = Seq(
    all.prickle,
    all.boopickle,
    all.autowire
  )

  val testing = Seq(
    all.scalaMock,
    all.mockito,
    all.scalaTest
  )

  val mgmt = Seq(
    all.dockerclient,
    all.qemuapi,
    all.qemuexec,
    all.qemumgr,
    all.qemuimg
  )

  val logging = Seq(
    all.l4japi,
    all.l4jcore,
    all.l4jslf4jImpl,
    all.slf4s
  )

  val lensing = Seq(
    all.monacleCore,
    all.monaKro,
    all.doodle
  )

  val serialization = Seq(all.scalaXml)
  val   commandLine = Seq(all.scopt)
  val   jarlocating = Seq(all.webjarlocator)
  val    functional = Seq(all.scalaz)

  private object version {

    val                      doodle   =        "0.5.1"
    val                       slf4s   =        "1.7.12"
    val                       log4j   =        "2.3"
    val                   scalaTest   =        "3.0.0-M15"
    val                   scalaMock   =        "3.2.2"
    val                     mockito   =        "1.10.19"
    val                        akka   =        "2.4.4"
    val                       scopt   =        "3.3.0"
    val                     monocle   =        "1.2.0"
    val                      scalaz   =        "7.2.1"
    val                       scala   =        "2.11.8"
    val                   booPickle   =        "1.1.2"
    val                   cassandra   =        "0.11"
    val                    inmemory   =        "1.2.11"
    val                    scalaxml   =        "1.0.5"
    val                   parboiled   =        "2.1.1"
    val                   shapeless   =        "2.2.5"
    val                   webjarloc   =        "0.23"
    val                     prickle   =        "1.1.5"
    val                    autowire   =        "0.2.5"
    val               dockermachine   =        "0.5.0"
    val                 qemumanager   =        "1.0.6"
    val                    qemuqapi   =        "1.0.6"
    val                     qemuimg   =        "1.0.6"
    val                    qemuexec   =        "1.0.6"
  }

}