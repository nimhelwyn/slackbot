package controllers

import javax.inject._
import play.api.mvc._

import scala.concurrent.ExecutionContext

class BotController @Inject()(cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action { implicit request: Request[AnyContent] =>
    Ok("asd")
  }

  def getMessage = Action { implicit request: Request[AnyContent] =>
    Ok("asd")
  }

  def saveMessage = {

  }

}
