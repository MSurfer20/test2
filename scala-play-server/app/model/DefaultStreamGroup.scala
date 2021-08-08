package model

import play.api.libs.json._

/**
  * Dictionary containing details of a default stream group. 
  * @param name Name of the default stream group. 
  * @param description Description of the default stream group. 
  * @param id id of the default stream group. 
  * @param streams Array containing details about the streams in the default stream group. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class DefaultStreamGroup(
  name: Option[String],
  description: Option[String],
  id: Option[Int],
  streams: Option[List[BasicStream]]
)

object DefaultStreamGroup {
  implicit lazy val defaultStreamGroupJsonFormat: Format[DefaultStreamGroup] = Json.format[DefaultStreamGroup]
}

