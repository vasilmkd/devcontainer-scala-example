lazy val root = project.in(file("."))
  .settings(
    name := "devcontainer-scala-example",
    scalaVersion := "3.8.3",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.20" % Test,
      "org.scalameta" %% "munit" % "1.3.0" % Test
    )
  )
