package services


import dao.BotDAO
import javax.inject._
import play.api.Logger
import play.api.inject.ApplicationLifecycle

import scala.concurrent.Future


class BotService @Inject()(dao: BotDAO) {

  def init : String = {
    "Bot initialized"
  }

  def getResponse(message: String) = {
    val words: Array[String] = message.replaceAll("[^a-zA-Z0-9_]", " ").split(" ")
    val defaultMessage: String = "Sorry I don't have an answer for this, try something else"

  }


}
