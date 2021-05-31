libraryDependencies ++= Seq(
  "org.wvlet.airframe"  %% "airframe-launcher" % "19.11.1"
)

enablePlugins(PackPlugin)
packMain := Map("hello" -> "command.Main")
