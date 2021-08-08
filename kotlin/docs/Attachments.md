
# Attachments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.Int** | The unique ID for the attachment.  |  [optional]
**name** | **kotlin.String** | Name of the uploaded file.  |  [optional]
**pathId** | **kotlin.String** | A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;.  |  [optional]
**size** | **kotlin.Int** | Size of the file in bytes.  |  [optional]
**createTime** | **kotlin.Int** | Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  |  [optional]
**messages** | [**kotlin.collections.List&lt;AttachmentsMessages&gt;**](AttachmentsMessages.md) | Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  |  [optional]



