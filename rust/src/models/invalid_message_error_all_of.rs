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
pub struct InvalidMessageErrorAllOf {
    #[serde(rename = "result", skip_serializing_if = "Option::is_none")]
    pub result: Option<serde_json::Value>,
    #[serde(rename = "msg", skip_serializing_if = "Option::is_none")]
    pub msg: Option<serde_json::Value>,
    /// The raw content of the message. 
    #[serde(rename = "raw_content", skip_serializing_if = "Option::is_none")]
    pub raw_content: Option<String>,
}

impl InvalidMessageErrorAllOf {
    pub fn new() -> InvalidMessageErrorAllOf {
        InvalidMessageErrorAllOf {
            result: None,
            msg: None,
            raw_content: None,
        }
    }
}

