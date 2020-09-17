// @GENERATOR:play-routes-compiler
// @SOURCE:/home/miki/IdeaProjects/slackbot/conf/routes
// @DATE:Thu Sep 17 13:56:22 CEST 2020


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
