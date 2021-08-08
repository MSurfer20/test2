package org.openapitools.server.model


/**
 * @param userId  for example: ''null''
 * @param fullName  for example: ''null''
 * @param apiKey  for example: ''null''
 * @param defaultSendingStream  for example: ''null''
 * @param defaultEventsRegisterStream  for example: ''null''
 * @param defaultAllPublicStreams  for example: ''null''
 * @param avatarUrl  for example: ''null''
 * @param ownerId  for example: ''null''
 * @param services  for example: ''null''
 * @param email The email of the bot.  for example: ''null''
 * @param botType An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  for example: ''null''
 * @param isActive A boolean describing whether the user account has been deactivated.  for example: ''null''
*/
final case class Bot (
  userId: Option[AnyType],
  fullName: Option[AnyType],
  apiKey: Option[AnyType],
  defaultSendingStream: Option[AnyType],
  defaultEventsRegisterStream: Option[AnyType],
  defaultAllPublicStreams: Option[AnyType],
  avatarUrl: Option[AnyType],
  ownerId: Option[AnyType],
  services: Option[AnyType],
  email: Option[String],
  botType: Option[Int],
  isActive: Option[Boolean]
)

