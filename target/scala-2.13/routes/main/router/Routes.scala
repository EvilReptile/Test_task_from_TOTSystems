// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/test_task_from_totsystems/conf/routes
// @DATE:Tue Sep 29 13:41:29 MSK 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Assets_2: controllers.Assets,
  // @LINE:9
  UploadController_1: controllers.UploadController,
  // @LINE:12
  MainController_3: controllers.MainController,
  // @LINE:16
  CRUDController_0: controllers.CRUDController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Assets_2: controllers.Assets,
    // @LINE:9
    UploadController_1: controllers.UploadController,
    // @LINE:12
    MainController_3: controllers.MainController,
    // @LINE:16
    CRUDController_0: controllers.CRUDController
  ) = this(errorHandler, Assets_2, UploadController_1, MainController_3, CRUDController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, UploadController_1, MainController_3, CRUDController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.UploadController.uploadPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.UploadController.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list""", """controllers.MainController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list""", """controllers.MainController.listPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """select""", """controllers.CRUDController.selectPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """select""", """controllers.CRUDController.select"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.CRUDController.updatePost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.CRUDController.update"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.CRUDController.deletePost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.CRUDController.delete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insert""", """controllers.CRUDController.insertPost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """insert""", """controllers.CRUDController.insert"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UploadController_uploadPost1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_UploadController_uploadPost1_invoker = createInvoker(
    UploadController_1.uploadPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "uploadPost",
      Nil,
      "POST",
      this.prefix + """upload""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UploadController_upload2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_UploadController_upload2_invoker = createInvoker(
    UploadController_1.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "upload",
      Nil,
      "GET",
      this.prefix + """upload""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MainController_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list")))
  )
  private[this] lazy val controllers_MainController_list3_invoker = createInvoker(
    MainController_3.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "list",
      Nil,
      "GET",
      this.prefix + """list""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MainController_listPost4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list")))
  )
  private[this] lazy val controllers_MainController_listPost4_invoker = createInvoker(
    MainController_3.listPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "listPost",
      Nil,
      "POST",
      this.prefix + """list""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CRUDController_selectPost5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("select")))
  )
  private[this] lazy val controllers_CRUDController_selectPost5_invoker = createInvoker(
    CRUDController_0.selectPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "selectPost",
      Nil,
      "POST",
      this.prefix + """select""",
      """ Api реализация CRUD для работы с БД""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_CRUDController_select6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("select")))
  )
  private[this] lazy val controllers_CRUDController_select6_invoker = createInvoker(
    CRUDController_0.select,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "select",
      Nil,
      "GET",
      this.prefix + """select""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_CRUDController_updatePost7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_CRUDController_updatePost7_invoker = createInvoker(
    CRUDController_0.updatePost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "updatePost",
      Nil,
      "POST",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CRUDController_update8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_CRUDController_update8_invoker = createInvoker(
    CRUDController_0.update,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "update",
      Nil,
      "GET",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CRUDController_deletePost9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_CRUDController_deletePost9_invoker = createInvoker(
    CRUDController_0.deletePost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "deletePost",
      Nil,
      "POST",
      this.prefix + """delete""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CRUDController_delete10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_CRUDController_delete10_invoker = createInvoker(
    CRUDController_0.delete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "delete",
      Nil,
      "GET",
      this.prefix + """delete""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_CRUDController_insertPost11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert")))
  )
  private[this] lazy val controllers_CRUDController_insertPost11_invoker = createInvoker(
    CRUDController_0.insertPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "insertPost",
      Nil,
      "POST",
      this.prefix + """insert""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CRUDController_insert12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert")))
  )
  private[this] lazy val controllers_CRUDController_insert12_invoker = createInvoker(
    CRUDController_0.insert,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CRUDController",
      "insert",
      Nil,
      "GET",
      this.prefix + """insert""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:9
    case controllers_UploadController_uploadPost1_route(params@_) =>
      call { 
        controllers_UploadController_uploadPost1_invoker.call(UploadController_1.uploadPost)
      }
  
    // @LINE:10
    case controllers_UploadController_upload2_route(params@_) =>
      call { 
        controllers_UploadController_upload2_invoker.call(UploadController_1.upload)
      }
  
    // @LINE:12
    case controllers_MainController_list3_route(params@_) =>
      call { 
        controllers_MainController_list3_invoker.call(MainController_3.list)
      }
  
    // @LINE:13
    case controllers_MainController_listPost4_route(params@_) =>
      call { 
        controllers_MainController_listPost4_invoker.call(MainController_3.listPost)
      }
  
    // @LINE:16
    case controllers_CRUDController_selectPost5_route(params@_) =>
      call { 
        controllers_CRUDController_selectPost5_invoker.call(CRUDController_0.selectPost)
      }
  
    // @LINE:17
    case controllers_CRUDController_select6_route(params@_) =>
      call { 
        controllers_CRUDController_select6_invoker.call(CRUDController_0.select)
      }
  
    // @LINE:19
    case controllers_CRUDController_updatePost7_route(params@_) =>
      call { 
        controllers_CRUDController_updatePost7_invoker.call(CRUDController_0.updatePost)
      }
  
    // @LINE:20
    case controllers_CRUDController_update8_route(params@_) =>
      call { 
        controllers_CRUDController_update8_invoker.call(CRUDController_0.update)
      }
  
    // @LINE:22
    case controllers_CRUDController_deletePost9_route(params@_) =>
      call { 
        controllers_CRUDController_deletePost9_invoker.call(CRUDController_0.deletePost)
      }
  
    // @LINE:23
    case controllers_CRUDController_delete10_route(params@_) =>
      call { 
        controllers_CRUDController_delete10_invoker.call(CRUDController_0.delete)
      }
  
    // @LINE:25
    case controllers_CRUDController_insertPost11_route(params@_) =>
      call { 
        controllers_CRUDController_insertPost11_invoker.call(CRUDController_0.insertPost)
      }
  
    // @LINE:26
    case controllers_CRUDController_insert12_route(params@_) =>
      call { 
        controllers_CRUDController_insert12_invoker.call(CRUDController_0.insert)
      }
  }
}
