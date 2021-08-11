package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AddSubscriptionsResponse_allOf.
  * @param subscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  * @param alreadySubscribed A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  * @param unauthorized A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
case class AddSubscriptionsResponseAllOf(
  result: Option[OasAnyTypeNotMapped],
  msg: Option[OasAnyTypeNotMapped],
  subscribed: Option[Map[String, List[String]]],
  alreadySubscribed: Option[Map[String, List[String]]],
  unauthorized: Option[List[String]]
)

object AddSubscriptionsResponseAllOf {
  implicit lazy val addSubscriptionsResponseAllOfJsonFormat: Format[AddSubscriptionsResponseAllOf] = Json.format[AddSubscriptionsResponseAllOf]
}

