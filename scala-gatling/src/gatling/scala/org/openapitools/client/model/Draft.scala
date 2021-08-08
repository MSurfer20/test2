
package org.openapitools.client.model


case class Draft (
    /* The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited.  */
    _id: Option[Integer],
    /* The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages).  */
    _type: String,
    /* An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array.  */
    _to: List[Integer],
    /* For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes.  */
    _topic: String,
    /* The body of the draft. Should not contain null bytes.  */
    _content: String,
    /* A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server.  */
    _timestamp: Option[Number]
)
object Draft {
    def toStringBody(var_id: Object, var_type: Object, var_to: Object, var_topic: Object, var_content: Object, var_timestamp: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"to":$var_to,"topic":$var_topic,"content":$var_content,"timestamp":$var_timestamp
        | }
        """.stripMargin
}
