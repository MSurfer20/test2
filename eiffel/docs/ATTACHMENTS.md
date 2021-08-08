# ATTACHMENTS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The unique ID for the attachment.  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Name of the uploaded file.  | [optional] [default to null]
**path_id** | [**STRING_32**](STRING_32.md) | A representation of the path of the file within the repository of user-uploaded files.  If the &#x60;path_id&#x60; of a file is &#x60;{realm_id}/ab/cdef/temp_file.py&#x60;, its URL will be: &#x60;{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py&#x60;.  | [optional] [default to null]
**size** | **INTEGER_32** | Size of the file in bytes.  | [optional] [default to null]
**create_time** | **INTEGER_32** | Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  | [optional] [default to null]
**messages** | [**LIST [ATTACHMENTS_MESSAGES]**](Attachments_messages.md) | Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


