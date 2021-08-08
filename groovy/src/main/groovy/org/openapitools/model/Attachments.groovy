package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AttachmentsMessages;

@Canonical
class Attachments {
    /* The unique ID for the attachment.  */
    Integer id
    /* Name of the uploaded file.  */
    String name
    /* A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  */
    String pathId
    /* Size of the file in bytes.  */
    Integer size
    /* Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  */
    Integer createTime
    /* Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  */
    List<AttachmentsMessages> messages = new ArrayList<AttachmentsMessages>()
}
