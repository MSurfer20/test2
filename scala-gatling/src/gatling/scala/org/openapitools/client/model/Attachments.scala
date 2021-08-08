
package org.openapitools.client.model


case class Attachments (
    /* The unique ID for the attachment.  */
    _id: Option[Integer],
    /* Name of the uploaded file.  */
    _name: Option[String],
    /* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */
    _pathId: Option[String],
    /* Size of the file in bytes.  */
    _size: Option[Integer],
    /* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */
    _createTime: Option[Integer],
    /* Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  */
    _messages: Option[List[AttachmentsMessages]]
)
object Attachments {
    def toStringBody(var_id: Object, var_name: Object, var_pathId: Object, var_size: Object, var_createTime: Object, var_messages: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"pathId":$var_pathId,"size":$var_size,"createTime":$var_createTime,"messages":$var_messages
        | }
        """.stripMargin
}
