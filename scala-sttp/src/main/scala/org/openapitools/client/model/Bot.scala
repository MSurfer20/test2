/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


case class Bot(
  userId: Option[AnyType] = None,
  fullName: Option[AnyType] = None,
  apiKey: Option[AnyType] = None,
  defaultSendingStream: Option[AnyType] = None,
  defaultEventsRegisterStream: Option[AnyType] = None,
  defaultAllPublicStreams: Option[AnyType] = None,
  avatarUrl: Option[AnyType] = None,
  ownerId: Option[AnyType] = None,
  services: Option[AnyType] = None,
  /* The email of the bot.  */
  email: Option[String] = None,
  /* An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
  botType: Option[Int] = None,
  /* A boolean describing whether the user account has been deactivated.  */
  isActive: Option[Boolean] = None
)


