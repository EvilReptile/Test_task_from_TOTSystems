// @GENERATOR:play-routes-compiler
// @SOURCE:/home/chameleon/Project/Scala/Test_task_from_TOTSystems/conf/routes
// @DATE:Tue Sep 29 14:22:02 MSK 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  UploadController_1: controllers.UploadController,
  // @LINE:11
  MainController_2: controllers.MainController,
  // @LINE:15
  CRUDController_0: controllers.CRUDController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    UploadController_1: controllers.UploadController,
    // @LINE:11
    MainController_2: controllers.MainController,
    // @LINE:15
    CRUDController_0: controllers.CRUDController
  ) = this(errorHandler, UploadController_1, MainController_2, CRUDController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UploadController_1, MainController_2, CRUDController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
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
  private[this] lazy val controllers_UploadController_uploadPost0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_UploadController_uploadPost0_invoker = createInvoker(
    UploadController_1.uploadPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UploadController",
      "uploadPost",
      Nil,
      "POST",
      this.prefix + """upload""",
      """ API реализация загрузки файлов с данными и подгрузке данных в БД""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UploadController_upload1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_UploadController_upload1_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_MainController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list")))
  )
  private[this] lazy val controllers_MainController_list2_invoker = createInvoker(
    MainController_2.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "list",
      Nil,
      "GET",
      this.prefix + """list""",
      """ API реализация получения данных истории""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MainController_listPost3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list")))
  )
  private[this] lazy val controllers_MainController_listPost3_invoker = createInvoker(
    MainController_2.listPost,
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

  // @LINE:15
  private[this] lazy val controllers_CRUDController_selectPost4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("select")))
  )
  private[this] lazy val controllers_CRUDController_selectPost4_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_CRUDController_select5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("select")))
  )
  private[this] lazy val controllers_CRUDController_select5_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_CRUDController_updatePost6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_CRUDController_updatePost6_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_CRUDController_update7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_CRUDController_update7_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_CRUDController_deletePost8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_CRUDController_deletePost8_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_CRUDController_delete9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_CRUDController_delete9_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_CRUDController_insertPost10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert")))
  )
  private[this] lazy val controllers_CRUDController_insertPost10_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_CRUDController_insert11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("insert")))
  )
  private[this] lazy val controllers_CRUDController_insert11_invoker = createInvoker(
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
    case controllers_UploadController_uploadPost0_route(params@_) =>
      call { 
        controllers_UploadController_uploadPost0_invoker.call(UploadController_1.uploadPost)
      }
  
    // @LINE:8
    case controllers_UploadController_upload1_route(params@_) =>
      call { 
        controllers_UploadController_upload1_invoker.call(UploadController_1.upload)
      }
  
    // @LINE:11
    case controllers_MainController_list2_route(params@_) =>
      call { 
        controllers_MainController_list2_invoker.call(MainController_2.list)
      }
  
    // @LINE:12
    case controllers_MainController_listPost3_route(params@_) =>
      call { 
        controllers_MainController_listPost3_invoker.call(MainController_2.listPost)
      }
  
    // @LINE:15
    case controllers_CRUDController_selectPost4_route(params@_) =>
      call { 
        controllers_CRUDController_selectPost4_invoker.call(CRUDController_0.selectPost)
      }
  
    // @LINE:16
    case controllers_CRUDController_select5_route(params@_) =>
      call { 
        controllers_CRUDController_select5_invoker.call(CRUDController_0.select)
      }
  
    // @LINE:18
    case controllers_CRUDController_updatePost6_route(params@_) =>
      call { 
        controllers_CRUDController_updatePost6_invoker.call(CRUDController_0.updatePost)
      }
  
    // @LINE:19
    case controllers_CRUDController_update7_route(params@_) =>
      call { 
        controllers_CRUDController_update7_invoker.call(CRUDController_0.update)
      }
  
    // @LINE:21
    case controllers_CRUDController_deletePost8_route(params@_) =>
      call { 
        controllers_CRUDController_deletePost8_invoker.call(CRUDController_0.deletePost)
      }
  
    // @LINE:22
    case controllers_CRUDController_delete9_route(params@_) =>
      call { 
        controllers_CRUDController_delete9_invoker.call(CRUDController_0.delete)
      }
  
    // @LINE:24
    case controllers_CRUDController_insertPost10_route(params@_) =>
      call { 
        controllers_CRUDController_insertPost10_invoker.call(CRUDController_0.insertPost)
      }
  
    // @LINE:25
    case controllers_CRUDController_insert11_route(params@_) =>
      call { 
        controllers_CRUDController_insert11_invoker.call(CRUDController_0.insert)
      }
  }
}
