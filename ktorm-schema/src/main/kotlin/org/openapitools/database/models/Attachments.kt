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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Dictionary containing details of a file uploaded by a user. 
 * @param id The unique ID for the attachment. 
 * @param name Name of the uploaded file. 
 * @param pathId A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
 * @param size Size of the file in bytes. 
 * @param createTime Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
 * @param messages Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
 */
object Attachmentss : BaseTable<Attachments>("Attachments") {
    val id = int("id") /* null */ /* The unique ID for the attachment.  */
    val name = text("name") /* null */ /* Name of the uploaded file.  */
    val pathId = text("path_id") /* null */ /* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */
    val size = int("size") /* null */ /* Size of the file in bytes.  */
    val createTime = int("create_time") /* null */ /* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */

    /**
     * Create an entity of type Attachments from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Attachments(
        id = row[id]  /* kotlin.Int? */ /* The unique ID for the attachment.  */,
        name = row[name]  /* kotlin.String? */ /* Name of the uploaded file.  */,
        pathId = row[pathId]  /* kotlin.String? */ /* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */,
        size = row[size]  /* kotlin.Int? */ /* Size of the file in bytes.  */,
        createTime = row[createTime]  /* kotlin.Int? */ /* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */,
        messages = emptyList() /* kotlin.Array<AttachmentsMessages>? */ /* Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  */
    )

    /**
    * Assign all the columns from the entity of type Attachments to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Attachments()
    * database.update(Attachmentss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Attachments) {
        this.apply {
            set(Attachmentss.id, entity.id)
            set(Attachmentss.name, entity.name)
            set(Attachmentss.pathId, entity.pathId)
            set(Attachmentss.size, entity.size)
            set(Attachmentss.createTime, entity.createTime)
        }
    }

}


object AttachmentsAttachmentsMessages : BaseTable<Pair<kotlin.Long, kotlin.Long>>("AttachmentsAttachmentsMessages") {
    val attachments = long("attachments")
    val attachmentsMessages = long("attachmentsMessages")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[attachments] ?: 0, row[attachmentsMessages] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(AttachmentsAttachmentsMessages.attachments, entity.first)
            set(AttachmentsAttachmentsMessages.attachmentsMessages, entity.second)
        }
    }

}

