// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/Test_task_from_TOTSystems/conf/routes
// @DATE:Tue Sep 29 14:22:02 MSK 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
