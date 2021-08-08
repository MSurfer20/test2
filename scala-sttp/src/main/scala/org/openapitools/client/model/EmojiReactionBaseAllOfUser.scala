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


  /**
   * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
   */
case class EmojiReactionBaseAllOfUser(
  /* ID of the user.  */
  id: Option[Int] = None,
  /* Email of the user.  */
  email: Option[String] = None,
  /* Full name of the user.  */
  fullName: Option[String] = None,
  /* Whether the user is a mirror dummy.  */
  isMirrorDummy: Option[Boolean] = None
)

