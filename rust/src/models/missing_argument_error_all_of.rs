/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// MissingArgumentErrorAllOf : ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct MissingArgumentErrorAllOf {
    #[serde(rename = "result", skip_serializing_if = "Option::is_none")]
    pub result: Option<serde_json::Value>,
    #[serde(rename = "msg", skip_serializing_if = "Option::is_none")]
    pub msg: Option<serde_json::Value>,
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<serde_json::Value>,
    /// It contains the information about the missing parameter. 
    #[serde(rename = "var_name", skip_serializing_if = "Option::is_none")]
    pub var_name: Option<String>,
}

impl MissingArgumentErrorAllOf {
    /// ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
    pub fn new() -> MissingArgumentErrorAllOf {
        MissingArgumentErrorAllOf {
            result: None,
            msg: None,
            code: None,
            var_name: None,
        }
    }
}


