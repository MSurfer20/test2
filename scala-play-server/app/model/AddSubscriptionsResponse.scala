package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AddSubscriptionsResponse.
  * @param subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  * @param alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  * @param unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:23:09.886767Z[Etc/UTC]")
case class AddSubscriptionsResponse(
  result: OasAnyTypeNotMapped,
  msg: OasAnyTypeNotMapped,
  subscribed: Option[Map[String, List[String]]],
  alreadySubscribed: Option[Map[String, List[String]]],
  unauthorized: Option[List[String]]
)

object AddSubscriptionsResponse {
  implicit lazy val addSubscriptionsResponseJsonFormat: Format[AddSubscriptionsResponse] = Json.format[AddSubscriptionsResponse]
}

