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
pub struct CodedErrorAllOf {
    #[serde(rename = "result", skip_serializing_if = "Option::is_none")]
    pub result: Option<serde_json::Value>,
    #[serde(rename = "msg", skip_serializing_if = "Option::is_none")]
    pub msg: Option<serde_json::Value>,
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<serde_json::Value>,
}

impl CodedErrorAllOf {
    pub fn new() -> CodedErrorAllOf {
        CodedErrorAllOf {
            result: None,
            msg: None,
            code: None,
        }
    }
}


