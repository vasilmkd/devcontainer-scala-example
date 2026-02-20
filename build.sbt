lazy val root = project.in(file("."))
  .settings(
    name := "devcontainer-scala-example",
    scalaVersion := "3.8.1",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.19" % Test,
      "org.scalameta" %% "munit" % "1.2.2" % Test
    )
  )
