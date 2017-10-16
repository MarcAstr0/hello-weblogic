name := "hello-weblogic"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"

enablePlugins(TomcatPlugin)