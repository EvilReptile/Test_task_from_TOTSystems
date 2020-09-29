// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/Test_task_from_TOTSystems/conf/routes
// @DATE:Tue Sep 29 14:22:02 MSK 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:11
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list"})
        }
      """
    )
  
    // @LINE:12
    def listPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.listPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "list"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseUploadController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def uploadPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.uploadPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:8
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UploadController.upload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseCRUDController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.delete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
    // @LINE:16
    def select: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.select",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "select"})
        }
      """
    )
  
    // @LINE:15
    def selectPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.selectPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "select"})
        }
      """
    )
  
    // @LINE:25
    def insert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.insert",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
        }
      """
    )
  
    // @LINE:24
    def insertPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.insertPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
        }
      """
    )
  
    // @LINE:19
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.update",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:18
    def updatePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.updatePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:21
    def deletePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.deletePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
  }


}
