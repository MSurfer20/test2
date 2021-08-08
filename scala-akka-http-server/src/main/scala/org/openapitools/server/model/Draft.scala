package org.openapitools.server.model


/**
 * A dictionary for representing a message draft. 
 *
 * @param id The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  for example: ''null''
 * @param `type` The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  for example: ''null''
 * @param to An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  for example: ''null''
 * @param topic For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  for example: ''null''
 * @param content The body of the draft. Should not contain null bytes.  for example: ''null''
 * @param timestamp A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  for example: ''1595479019''
*/
final case class Draft (
  id: Option[Int],
  `type`: String,
  to: Seq[Int],
  topic: String,
  content: String,
  timestamp: Option[Double]
)

