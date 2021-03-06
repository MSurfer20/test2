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

package io.swagger.client.model
import play.api.libs.json._

case class Draft (
            /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
                  id: Option[Int],
                  `type`:  Option[Draft&#x60;type&#x60;Enum.Draft&#x60;type&#x60;Enum],
            /* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */
                  to: Seq[Int],
            /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
                  topic: String,
            /* The body of the draft. Should not contain null bytes.  */
                  content: String,
            /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
                  timestamp: Option[Number]
)

object Draft {
implicit val format: Format[Draft] = Json.format
}

object Draft&#x60;type&#x60;Enum extends Enumeration {
  val   , stream, private = Value
  type Draft&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[Draft&#x60;type&#x60;Enum.type])
}
