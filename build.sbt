organization := "com.futurechimps"

scalatraWithJRebel

name := "Todolist"

version := "0.2.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.3.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-scalate" % "2.3.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-json" % "2.3.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-commands" % "2.3.0-SNAPSHOT",
  "org.json4s"   %% "json4s-jackson" % "3.2.6",
  "org.scalatra" %% "scalatra-specs2" % "2.3.0-SNAPSHOT" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.13" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.0.1.v20130408" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "container;provided;test"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"