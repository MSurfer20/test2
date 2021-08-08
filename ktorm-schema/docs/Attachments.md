
# Table `Attachments` 
(mapped from: Attachments)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The unique ID for the attachment.  |  [optional]
**name** | name | text |  | **kotlin.String** | Name of the uploaded file.  |  [optional]
**pathId** | path_id | text |  | **kotlin.String** | A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;.  |  [optional]
**size** | size | int |  | **kotlin.Int** | Size of the file in bytes.  |  [optional]
**createTime** | create_time | int |  | **kotlin.Int** | Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  |  [optional]
**messages** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AttachmentsMessages&gt;**](AttachmentsMessages.md) | Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  |  [optional]







# **Table `AttachmentsAttachmentsMessages`**
(mapped from: AttachmentsAttachmentsMessages)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
attachments | attachments | long | | kotlin.Long | Primary Key | *one*
attachmentsMessages | attachmentsMessages | long | | kotlin.Long | Foreign Key | *many*



