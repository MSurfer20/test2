package org.openapitools.server.model


/**
 * @param emojiCode  for example: ''null''
 * @param emojiName  for example: ''null''
 * @param reactionType  for example: ''null''
 * @param userId  for example: ''null''
 * @param user  for example: ''null''
*/
final case class EmojiReaction (
  emojiCode: Option[AnyType],
  emojiName: Option[AnyType],
  reactionType: Option[AnyType],
  userId: Option[AnyType],
  user: Option[AnyType]
)

