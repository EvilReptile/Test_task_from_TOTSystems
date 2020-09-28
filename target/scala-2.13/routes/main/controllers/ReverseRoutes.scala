// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/test_task_from_totsystems/conf/routes
// @DATE:Tue Sep 29 01:01:34 MSK 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:9
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def uploadPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:10
    def upload(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:12
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "list")
    }
  
    // @LINE:13
    def listPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "list")
    }
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:16
  class ReverseCRUDController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def delete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:17
    def select(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "select")
    }
  
    // @LINE:16
    def selectPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "select")
    }
  
    // @LINE:26
    def insert(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "insert")
    }
  
    // @LINE:25
    def insertPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "insert")
    }
  
    // @LINE:20
    def update(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:19
    def updatePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:22
    def deletePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete")
    }
  
  }


}
