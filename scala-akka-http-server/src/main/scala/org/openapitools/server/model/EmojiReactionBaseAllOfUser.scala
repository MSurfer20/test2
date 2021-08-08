package org.openapitools.server.model


/**
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 *
 * @param id ID of the user.  for example: ''null''
 * @param email Email of the user.  for example: ''null''
 * @param fullName Full name of the user.  for example: ''null''
 * @param isMirrorDummy Whether the user is a mirror dummy.  for example: ''null''
*/
final case class EmojiReactionBaseAllOfUser (
  id: Option[Int],
  email: Option[String],
  fullName: Option[String],
  isMirrorDummy: Option[Boolean]
)

