// workaround for https://github.com/scala/bug/issues/10870
// TODO use Scala 2.12.10
// https://github.com/scala/scala/pull/7996
// https://github.com/scala/bug/issues/11665
scalaVersion := "2.12.4"

resolvers ++= Seq(
  "sonatype staging" at "https://oss.sonatype.org/content/repositories/staging",
  "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.5.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
