package model

import play.api.libs.json._

/**
  * Dictionary containing details of a single hotspot. 
  * @param delay The delay after which the user should be shown the hotspot. 
  * @param name The name of the hotspot. 
  * @param title The title of the hotspot, as will be displayed to the user. 
  * @param description The description of the hotspot, as will be displayed to the user. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class Hotspot(
  delay: Option[BigDecimal],
  name: Option[String],
  title: Option[String],
  description: Option[String]
)

object Hotspot {
  implicit lazy val hotspotJsonFormat: Format[Hotspot] = Json.format[Hotspot]
}

