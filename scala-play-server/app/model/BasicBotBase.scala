package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BasicBotBase.
  * @param userId The user id of the bot. 
  * @param fullName The full name of the bot. 
  * @param apiKey The API key of the bot which it uses to make API requests. 
  * @param defaultSendingStream The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
  * @param defaultEventsRegisterStream The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
  * @param defaultAllPublicStreams Whether the bot can send messages to all streams by default. 
  * @param avatarUrl The URL of the bot's avatar. 
  * @param ownerId The user id of the bot's owner.  Null if the bot has no owner. 
  * @param services The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T21:15:31.623147Z[Etc/UTC]")
case class BasicBotBase(
  userId: Option[Int],
  fullName: Option[String],
  apiKey: Option[String],
  defaultSendingStream: Option[String],
  defaultEventsRegisterStream: Option[String],
  defaultAllPublicStreams: Option[Boolean],
  avatarUrl: Option[String],
  ownerId: Option[Int],
  services: Option[List[OneOfobjectobject]]
)

object BasicBotBase {
  implicit lazy val basicBotBaseJsonFormat: Format[BasicBotBase] = Json.format[BasicBotBase]
}

