// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/test_task_from_totsystems/conf/routes
// @DATE:Tue Sep 29 01:01:34 MSK 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMainController MainController = new controllers.ReverseMainController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCRUDController CRUDController = new controllers.ReverseCRUDController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMainController MainController = new controllers.javascript.ReverseMainController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCRUDController CRUDController = new controllers.javascript.ReverseCRUDController(RoutesPrefix.byNamePrefix());
  }

}
