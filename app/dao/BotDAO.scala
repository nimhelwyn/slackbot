package dao

import db.MockDb

class BotDAO {

  private val db = new MockDb

  def get(key: String): Option[String] ={
    db.values.get(key)
  }

}
