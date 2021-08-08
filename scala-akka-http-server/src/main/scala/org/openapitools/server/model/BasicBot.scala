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
*/
final case class BasicBot (
  userId: Option[AnyType],
  fullName: Option[AnyType],
  apiKey: Option[AnyType],
  defaultSendingStream: Option[AnyType],
  defaultEventsRegisterStream: Option[AnyType],
  defaultAllPublicStreams: Option[AnyType],
  avatarUrl: Option[AnyType],
  ownerId: Option[AnyType],
  services: Option[AnyType]
)

