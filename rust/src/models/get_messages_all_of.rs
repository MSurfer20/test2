/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetMessagesAllOf {
    #[serde(rename = "avatar_url", skip_serializing_if = "Option::is_none")]
    pub avatar_url: Option<serde_json::Value>,
    #[serde(rename = "client", skip_serializing_if = "Option::is_none")]
    pub client: Option<serde_json::Value>,
    #[serde(rename = "content", skip_serializing_if = "Option::is_none")]
    pub content: Option<serde_json::Value>,
    #[serde(rename = "content_type", skip_serializing_if = "Option::is_none")]
    pub content_type: Option<serde_json::Value>,
    #[serde(rename = "display_recipient", skip_serializing_if = "Option::is_none")]
    pub display_recipient: Option<serde_json::Value>,
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<serde_json::Value>,
    #[serde(rename = "is_me_message", skip_serializing_if = "Option::is_none")]
    pub is_me_message: Option<serde_json::Value>,
    #[serde(rename = "reactions", skip_serializing_if = "Option::is_none")]
    pub reactions: Option<serde_json::Value>,
    #[serde(rename = "recipient_id", skip_serializing_if = "Option::is_none")]
    pub recipient_id: Option<serde_json::Value>,
    #[serde(rename = "sender_email", skip_serializing_if = "Option::is_none")]
    pub sender_email: Option<serde_json::Value>,
    #[serde(rename = "sender_full_name", skip_serializing_if = "Option::is_none")]
    pub sender_full_name: Option<serde_json::Value>,
    #[serde(rename = "sender_id", skip_serializing_if = "Option::is_none")]
    pub sender_id: Option<serde_json::Value>,
    #[serde(rename = "sender_realm_str", skip_serializing_if = "Option::is_none")]
    pub sender_realm_str: Option<serde_json::Value>,
    #[serde(rename = "stream_id", skip_serializing_if = "Option::is_none")]
    pub stream_id: Option<serde_json::Value>,
    #[serde(rename = "subject", skip_serializing_if = "Option::is_none")]
    pub subject: Option<serde_json::Value>,
    #[serde(rename = "topic_links", skip_serializing_if = "Option::is_none")]
    pub topic_links: Option<serde_json::Value>,
    #[serde(rename = "submessages", skip_serializing_if = "Option::is_none")]
    pub submessages: Option<serde_json::Value>,
    #[serde(rename = "timestamp", skip_serializing_if = "Option::is_none")]
    pub timestamp: Option<serde_json::Value>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub _type: Option<serde_json::Value>,
    /// The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
    #[serde(rename = "flags", skip_serializing_if = "Option::is_none")]
    pub flags: Option<Vec<String>>,
    /// The UNIX timestamp for when the message was last edited, in UTC seconds. 
    #[serde(rename = "last_edit_timestamp", skip_serializing_if = "Option::is_none")]
    pub last_edit_timestamp: Option<i32>,
    /// Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    #[serde(rename = "match_content", skip_serializing_if = "Option::is_none")]
    pub match_content: Option<String>,
    /// Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    #[serde(rename = "match_subject", skip_serializing_if = "Option::is_none")]
    pub match_subject: Option<String>,
}

impl GetMessagesAllOf {
    pub fn new() -> GetMessagesAllOf {
        GetMessagesAllOf {
            avatar_url: None,
            client: None,
            content: None,
            content_type: None,
            display_recipient: None,
            id: None,
            is_me_message: None,
            reactions: None,
            recipient_id: None,
            sender_email: None,
            sender_full_name: None,
            sender_id: None,
            sender_realm_str: None,
            stream_id: None,
            subject: None,
            topic_links: None,
            submessages: None,
            timestamp: None,
            _type: None,
            flags: None,
            last_edit_timestamp: None,
            match_content: None,
            match_subject: None,
        }
    }
}

