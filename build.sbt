name := "web-router"

//version := "2017.5.0-SNAPSHOT"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.11"

val scala212 = "2.12.2"

scalaVersion := scala211

crossScalaVersions := Seq(scala211, scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

//deps

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core" % "2017.4.23-beta" % Provided,
  "scalajs-react-interface" %%% "universal" % "2017.5.2-beta" % Provided)

//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-react-interface"

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-react-interface")

bintrayRepository := "maven"

publishArtifact in Test := false

//Test
scalaJSModuleKind in Test := ModuleKind.CommonJSModule
resolvers += Resolver.bintrayRepo("scalajs-react-interface", "maven")
libraryDependencies ++= Seq(
  "org.scalatest" %%% "scalatest" % "3.0.0" % Test,
  "scalajs-react-interface" %%% "web" % "2017.3.26-beta" % Test)

scalaJSStage in Global := FastOptStage
