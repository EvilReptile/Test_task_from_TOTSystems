// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/test_task_from_totsystems/conf/routes
// @DATE:Tue Sep 29 01:01:34 MSK 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:9
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def uploadPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.uploadPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:10
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.upload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:12
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list"})
        }
      """
    )
  
    // @LINE:13
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
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseCRUDController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.delete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
    // @LINE:17
    def select: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.select",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "select"})
        }
      """
    )
  
    // @LINE:16
    def selectPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.selectPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "select"})
        }
      """
    )
  
    // @LINE:26
    def insert: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.insert",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
        }
      """
    )
  
    // @LINE:25
    def insertPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.insertPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "insert"})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.update",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:19
    def updatePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CRUDController.updatePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:22
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
