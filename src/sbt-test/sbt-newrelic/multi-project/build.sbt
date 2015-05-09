lazy val p1 = project.in(file("p1")).enablePlugins(JavaAppPackaging, NewRelic).settings(name := "p1")

lazy val p2 = project.in(file("p2")).enablePlugins(JavaAppPackaging, NewRelic).settings(name := "p2")

lazy val p3 = project.in(file("p3")).enablePlugins(JavaAppPackaging).settings(name := "p3")
