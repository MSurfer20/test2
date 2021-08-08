package org.openapitools.server.model


/**
 * @param userId The user id of the bot.  for example: ''null''
 * @param fullName The full name of the bot.  for example: ''null''
 * @param apiKey The API key of the bot which it uses to make API requests.  for example: ''null''
 * @param defaultSendingStream The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  for example: ''null''
 * @param defaultEventsRegisterStream The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  for example: ''null''
 * @param defaultAllPublicStreams Whether the bot can send messages to all streams by default.  for example: ''null''
 * @param avatarUrl The URL of the bot's avatar.  for example: ''null''
 * @param ownerId The user id of the bot's owner.  Null if the bot has no owner.  for example: ''null''
 * @param services The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  for example: ''null''
*/
final case class BasicBotBase (
  userId: Option[Int],
  fullName: Option[String],
  apiKey: Option[String],
  defaultSendingStream: Option[String],
  defaultEventsRegisterStream: Option[String],
  defaultAllPublicStreams: Option[Boolean],
  avatarUrl: Option[String],
  ownerId: Option[Int],
  services: Option[Seq[OneOfobjectobject]]
)

