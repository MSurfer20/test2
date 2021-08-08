package org.openapitools.server.model


/**
 * @param streamId  for example: ''null''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param dateCreated  for example: ''null''
 * @param inviteOnly  for example: ''null''
 * @param renderedDescription  for example: ''null''
 * @param isWebPublic  for example: ''null''
 * @param streamPostPolicy  for example: ''null''
 * @param messageRetentionDays  for example: ''null''
 * @param historyPublicToSubscribers  for example: ''null''
 * @param firstMessageId  for example: ''null''
 * @param isAnnouncementOnly  for example: ''null''
*/
final case class BasicStream (
  streamId: Option[AnyType],
  name: Option[AnyType],
  description: Option[AnyType],
  dateCreated: Option[AnyType],
  inviteOnly: Option[AnyType],
  renderedDescription: Option[AnyType],
  isWebPublic: Option[AnyType],
  streamPostPolicy: Option[AnyType],
  messageRetentionDays: Option[AnyType],
  historyPublicToSubscribers: Option[AnyType],
  firstMessageId: Option[AnyType],
  isAnnouncementOnly: Option[AnyType]
)

