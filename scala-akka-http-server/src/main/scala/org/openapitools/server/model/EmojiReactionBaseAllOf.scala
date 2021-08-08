package org.openapitools.server.model


/**
 * @param userId The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future.  for example: ''null''
 * @param user  for example: ''null''
*/
final case class EmojiReactionBaseAllOf (
  userId: Option[Int],
  user: Option[EmojiReactionBaseAllOfUser]
)

