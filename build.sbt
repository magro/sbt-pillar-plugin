sbtPlugin := true

name := "sbt-pillar-plugin"

description := "sbt plugin for cassandra schema/data migrations using pillar (https://github.com/comeara/pillar)"

organization := "io.ino"

homepage := Some(url("https://github.com/inoio/sbt-pillar-plugin"))

version := "1.0.1-magro.02"

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := "2.10.4"

scalacOptions += "-target:jvm-1.7"

resolvers += "bintray-magro" at "http://dl.bintray.com/magro/maven"

libraryDependencies += "com.chrisomeara" %% "pillar" % "2.0.1-magro.01"

// fix broken dependenxy in pillar until https://github.com/comeara/pillar/pull/14 is merged
libraryDependencies += "org.clapper" %% "argot" % "1.0.3"

// Maven publishing info
publishMavenStyle := true

//publishTo := {
//  val nexus = "https://oss.sonatype.org/"
//  if (version.value.trim.endsWith("SNAPSHOT"))
//    Some("snapshots" at nexus + "content/repositories/snapshots")
//  else
//    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
//}
//
//pomExtra := (
//  <url>https://github.com/inoio/sbt-pillar-plugin</url>
//  <scm>
//    <url>git@github.com:inoio/sbt-pillar-plugin.git</url>
//    <connection>scm:git:git@github.com:inoio/sbt-pillar-plugin.git</connection>
//  </scm>
//  <developers>
//    <developer>
//      <id>martin.grotzke</id>
//      <name>Martin Grotzke</name>
//      <url>https://github.com/magro</url>
//    </developer>
//  </developers>)

bintray.Plugin.bintrayPublishSettings

// Maven publishing info
publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

publishTo := Some("bintray-magro-sbt-pillar-plugin" at "https://api.bintray.com/content/magro/maven/sbt-pillar-plugin")

pomExtra := (
  <url>https://github.com/magro/sbt-pillar-plugin</url>
    <scm>
      <url>git@github.com:magro/sbt-pillar-plugin.git</url>
      <connection>scm:git:git@github.com:magro/sbt-pillar-plugin.git</connection>
    </scm>
    <developers>
      <developer>
        <id>martin.grotzke</id>
        <name>Martin Grotzke</name>
        <url>https://github.com/magro</url>
      </developer>
    </developers>)