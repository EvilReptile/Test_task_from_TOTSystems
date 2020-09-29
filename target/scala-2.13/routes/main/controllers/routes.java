// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/Test_task_from_TOTSystems/conf/routes
// @DATE:Tue Sep 29 14:22:02 MSK 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMainController MainController = new controllers.ReverseMainController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUploadController UploadController = new controllers.ReverseUploadController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCRUDController CRUDController = new controllers.ReverseCRUDController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMainController MainController = new controllers.javascript.ReverseMainController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUploadController UploadController = new controllers.javascript.ReverseUploadController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCRUDController CRUDController = new controllers.javascript.ReverseCRUDController(RoutesPrefix.byNamePrefix());
  }

}
