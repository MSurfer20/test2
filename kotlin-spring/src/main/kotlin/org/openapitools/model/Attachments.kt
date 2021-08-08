package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AttachmentsMessages
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Dictionary containing details of a file uploaded by a user. 
 * @param id The unique ID for the attachment. 
 * @param name Name of the uploaded file. 
 * @param pathId A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
 * @param size Size of the file in bytes. 
 * @param createTime Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
 * @param messages Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
 */
data class Attachments(

    @field:JsonProperty("id") val id: kotlin.Int? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("path_id") val pathId: kotlin.String? = null,

    @field:JsonProperty("size") val size: kotlin.Int? = null,

    @field:JsonProperty("create_time") val createTime: kotlin.Int? = null,

    @field:Valid
    @field:JsonProperty("messages") val messages: kotlin.collections.List<AttachmentsMessages>? = null
) {

}

