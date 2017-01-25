
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/pzq317/Desktop/play-scala/conf/routes
// @DATE:Sun Nov 27 14:35:28 PHT 2016


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
