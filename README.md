# hello-weblogic
Hello World app in Scala for deployment on WebLogic AS

The purpose if this project is to build a simple "Hello World" app with Scala and SBT and deploy to a WebLogic application server.

### Requirements

SBT >= 1.0.0 (I used 1.0.2)

### Usage

* Clone the project
* Run `sbt package`
* Deploy `target/scala-2.12/hello-weblogic_2.10-0.1.war` to WebLogic (Google how to do this).
* Go to the deployment URL and _voilà_!

![Screenshot](/screenshot.png?raw=true "Screenshot")

