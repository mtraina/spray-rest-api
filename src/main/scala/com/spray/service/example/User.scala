package com.spray.service.example

import spray.json._

/**
 * Created by Matteo on 07/12/14.
 */
case class User(name :String, age :Int)

object UserJsonProtocol extends DefaultJsonProtocol {
  implicit val userJsonFormat = jsonFormat2(User)
}