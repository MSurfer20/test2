/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// MessagesBase : Object containing details of the message. 



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct MessagesBase {
    /// The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
    #[serde(rename = "avatar_url", skip_serializing_if = "Option::is_none")]
    pub avatar_url: Option<String>,
    /// A Zulip \"client\" string, describing what Zulip client sent the message. 
    #[serde(rename = "client", skip_serializing_if = "Option::is_none")]
    pub client: Option<String>,
    /// The content/body of the message. 
    #[serde(rename = "content", skip_serializing_if = "Option::is_none")]
    pub content: Option<String>,
    /// The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
    #[serde(rename = "content_type", skip_serializing_if = "Option::is_none")]
    pub content_type: Option<String>,
    /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    #[serde(rename = "display_recipient", skip_serializing_if = "Option::is_none")]
    pub display_recipient: Option<Box<crate::models::OneOfstringarray>>,
    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    #[serde(rename = "is_me_message", skip_serializing_if = "Option::is_none")]
    pub is_me_message: Option<bool>,
    /// Data on any reactions to the message. 
    #[serde(rename = "reactions", skip_serializing_if = "Option::is_none")]
    pub reactions: Option<Vec<crate::models::EmojiReaction>>,
    /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    #[serde(rename = "recipient_id", skip_serializing_if = "Option::is_none")]
    pub recipient_id: Option<i32>,
    /// The Zulip display email address of the message's sender. 
    #[serde(rename = "sender_email", skip_serializing_if = "Option::is_none")]
    pub sender_email: Option<String>,
    /// The full name of the message's sender. 
    #[serde(rename = "sender_full_name", skip_serializing_if = "Option::is_none")]
    pub sender_full_name: Option<String>,
    /// The user ID of the message's sender. 
    #[serde(rename = "sender_id", skip_serializing_if = "Option::is_none")]
    pub sender_id: Option<i32>,
    /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
    #[serde(rename = "sender_realm_str", skip_serializing_if = "Option::is_none")]
    pub sender_realm_str: Option<String>,
    /// Only present for stream messages; the ID of the stream. 
    #[serde(rename = "stream_id", skip_serializing_if = "Option::is_none")]
    pub stream_id: Option<i32>,
    /// The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
    #[serde(rename = "subject", skip_serializing_if = "Option::is_none")]
    pub subject: Option<String>,
    /// Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
    #[serde(rename = "topic_links", skip_serializing_if = "Option::is_none")]
    pub topic_links: Option<Vec<crate::models::MessagesBaseTopicLinks>>,
    /// Data used for certain experimental Zulip integrations. 
    #[serde(rename = "submessages", skip_serializing_if = "Option::is_none")]
    pub submessages: Option<Vec<String>>,
    /// The UNIX timestamp for when the message was sent, in UTC seconds. 
    #[serde(rename = "timestamp", skip_serializing_if = "Option::is_none")]
    pub timestamp: Option<i32>,
    /// The type of the message: `stream` or `private`. 
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub _type: Option<String>,
}

impl MessagesBase {
    /// Object containing details of the message. 
    pub fn new() -> MessagesBase {
        MessagesBase {
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
        }
    }
}


