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
pub struct MessagesBaseTopicLinks {
    /// The original link text present in the topic. 
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
    /// The expanded target url which the link points to. 
    #[serde(rename = "url", skip_serializing_if = "Option::is_none")]
    pub url: Option<String>,
}

impl MessagesBaseTopicLinks {
    pub fn new() -> MessagesBaseTopicLinks {
        MessagesBaseTopicLinks {
            text: None,
            url: None,
        }
    }
}


