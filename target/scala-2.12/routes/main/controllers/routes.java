// @GENERATOR:play-routes-compiler
// @SOURCE:/home/miki/IdeaProjects/slackbot/conf/routes
// @DATE:Thu Sep 17 13:56:22 CEST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseBotController BotController = new controllers.ReverseBotController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseBotController BotController = new controllers.javascript.ReverseBotController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
