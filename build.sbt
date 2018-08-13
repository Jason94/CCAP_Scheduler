val ScalatraVersion = "2.6.3"

organization := "gov.wicourts"

name := "Scheduler"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.6"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "io.cucumber" % "cucumber-core" % "2.0.1" % "test",
  "io.cucumber" %% "cucumber-scala" % "2.0.1" % "test",
  "io.cucumber" % "cucumber-jvm" % "2.0.1" % "test",
  "io.cucumber" % "cucumber-junit" % "2.0.1" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

enablePlugins(ScalatraPlugin)
enablePlugins(CucumberPlugin)

CucumberPlugin.glue := "gov/wicourts/cucumber"
