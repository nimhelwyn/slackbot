package controllers

import javax.inject._
import play.api.mvc._
import services.BotService

import scala.concurrent.ExecutionContext

class BotController @Inject()(botService: BotService, cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  def index = Action { implicit request: Request[AnyContent] =>
    Ok(botService.init)
  }

  def getMessage = Action { implicit request: Request[AnyContent] =>
    Ok("asd")
  }

  def saveMessage = {

  }

}
