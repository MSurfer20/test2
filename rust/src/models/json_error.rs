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
pub struct JsonError {
    #[serde(rename = "result")]
    pub result: Option<serde_json::Value>,
    #[serde(rename = "msg")]
    pub msg: Option<serde_json::Value>,
}

impl JsonError {
    pub fn new(result: Option<serde_json::Value>, msg: Option<serde_json::Value>) -> JsonError {
        JsonError {
            result,
            msg,
        }
    }
}


