/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// Attachments : Dictionary containing details of a file uploaded by a user. 



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct Attachments {
    /// The unique ID for the attachment. 
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Name of the uploaded file. 
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
    #[serde(rename = "path_id", skip_serializing_if = "Option::is_none")]
    pub path_id: Option<String>,
    /// Size of the file in bytes. 
    #[serde(rename = "size", skip_serializing_if = "Option::is_none")]
    pub size: Option<i32>,
    /// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
    #[serde(rename = "create_time", skip_serializing_if = "Option::is_none")]
    pub create_time: Option<i32>,
    /// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
    #[serde(rename = "messages", skip_serializing_if = "Option::is_none")]
    pub messages: Option<Vec<crate::models::AttachmentsMessages>>,
}

impl Attachments {
    /// Dictionary containing details of a file uploaded by a user. 
    pub fn new() -> Attachments {
        Attachments {
            id: None,
            name: None,
            path_id: None,
            size: None,
            create_time: None,
            messages: None,
        }
    }
}


