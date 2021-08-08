# Attachments

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **isize** | The unique ID for the attachment.  | [optional] [default to None]
**name** | **String** | Name of the uploaded file.  | [optional] [default to None]
**path_id** | **String** | A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`.  | [optional] [default to None]
**size** | **isize** | Size of the file in bytes.  | [optional] [default to None]
**create_time** | **isize** | Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number.  | [optional] [default to None]
**messages** | [**Vec<models::AttachmentsMessages>**](Attachments_messages.md) | Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


