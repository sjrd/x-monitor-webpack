package com.superfund.x.monitor

import io.circe._
import io.circe.parser._
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("Main")
object Main {
  @JSExport
  def init(): Unit = {
    case class A(name: String)
    val json = parse("""{"name": "Bob"}""").getOrElse(Json.Null)
    println(json)
    println(json.hcursor.downField("name"))
    println(json.hcursor.downField("name").as[String])
  }
}



