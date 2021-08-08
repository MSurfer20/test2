/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// RealmPlayground : Object containing details about a realm playground. 



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct RealmPlayground {
    /// The unique ID for the realm playground. 
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// The name of the Pygments language lexer for that programming language. 
    #[serde(rename = "pygments_language", skip_serializing_if = "Option::is_none")]
    pub pygments_language: Option<String>,
    /// The url prefix for the playground. 
    #[serde(rename = "url_prefix", skip_serializing_if = "Option::is_none")]
    pub url_prefix: Option<String>,
}

impl RealmPlayground {
    /// Object containing details about a realm playground. 
    pub fn new() -> RealmPlayground {
        RealmPlayground {
            id: None,
            name: None,
            pygments_language: None,
            url_prefix: None,
        }
    }
}

