// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/test_task_from_totsystems/conf/routes
// @DATE:Tue Sep 29 01:01:34 MSK 2020


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
