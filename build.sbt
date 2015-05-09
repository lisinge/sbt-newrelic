organization := "com.gilt.sbt"

name := "sbt-newrelic"

sbtPlugin := true

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-encoding", "UTF-8"
)

javaVersionPrefix in javaVersionCheck := Some("1.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.1" % "provided")

ScriptedPlugin.scriptedSettings

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-XX:MaxPermSize=256M", "-Dplugin.version=" + version.value)
}

scriptedBufferLog := false

version := "git describe --tags --dirty --always".!!.stripPrefix("v").trim

publishMavenStyle := false

bintrayOrganization := Some("giltgroupe")

bintrayPackageLabels := Seq("sbt", "newrelic", "sbt-native-packager")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
