name := "akka-http-helloworld"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.1"


libraryDependencies ++= {
  val akkaHttpVersion = "10.0.3"
  Seq(
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
  )
}