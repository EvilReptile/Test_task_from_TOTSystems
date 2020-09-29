// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/Test_task_from_TOTSystems/conf/routes
// @DATE:Wed Sep 30 01:30:53 MSK 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:11
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def list(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "list")
    }
  
    // @LINE:12
    def listPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "list")
    }
  
  }

  // @LINE:7
  class ReverseUploadController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def uploadPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:8
    def upload(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "upload")
    }
  
  }

  // @LINE:15
  class ReverseCRUDController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def delete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:16
    def select(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "select")
    }
  
    // @LINE:15
    def selectPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "select")
    }
  
    // @LINE:25
    def insert(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "insert")
    }
  
    // @LINE:19
    def update(secid:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("secid", secid)))
    }
  
    // @LINE:24
    def insertPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "insert")
    }
  
    // @LINE:18
    def updatePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:21
    def deletePost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete")
    }
  
  }


}
