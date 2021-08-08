/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// EmojiReactionBaseUser : Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct EmojiReactionBaseUser {
    /// ID of the user. 
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Email of the user. 
    #[serde(rename = "email", skip_serializing_if = "Option::is_none")]
    pub email: Option<String>,
    /// Full name of the user. 
    #[serde(rename = "full_name", skip_serializing_if = "Option::is_none")]
    pub full_name: Option<String>,
    /// Whether the user is a mirror dummy. 
    #[serde(rename = "is_mirror_dummy", skip_serializing_if = "Option::is_none")]
    pub is_mirror_dummy: Option<bool>,
}

impl EmojiReactionBaseUser {
    /// Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
    pub fn new() -> EmojiReactionBaseUser {
        EmojiReactionBaseUser {
            id: None,
            email: None,
            full_name: None,
            is_mirror_dummy: None,
        }
    }
}


