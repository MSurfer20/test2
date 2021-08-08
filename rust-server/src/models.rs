#![allow(unused_qualifications)]

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct AddSubscriptionsResponse {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    #[serde(rename = "subscribed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subscribed: Option<std::collections::HashMap<String, Vec<String>>>,

    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    #[serde(rename = "already_subscribed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub already_subscribed: Option<std::collections::HashMap<String, Vec<String>>>,

    /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
    #[serde(rename = "unauthorized")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub unauthorized: Option<Vec<String>>,

}

impl AddSubscriptionsResponse {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> AddSubscriptionsResponse {
        AddSubscriptionsResponse {
            result: result,
            msg: msg,
            subscribed: None,
            already_subscribed: None,
            unauthorized: None,
        }
    }
}

/// Converts the AddSubscriptionsResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for AddSubscriptionsResponse {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping subscribed in query parameter serialization
        // Skipping subscribed in query parameter serialization

        // Skipping already_subscribed in query parameter serialization
        // Skipping already_subscribed in query parameter serialization


        if let Some(ref unauthorized) = self.unauthorized {
            params.push("unauthorized".to_string());
            params.push(unauthorized.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a AddSubscriptionsResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for AddSubscriptionsResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub subscribed: Vec<std::collections::HashMap<String, Vec<String>>>,
            pub already_subscribed: Vec<std::collections::HashMap<String, Vec<String>>>,
            pub unauthorized: Vec<Vec<String>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing AddSubscriptionsResponse".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in AddSubscriptionsResponse".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in AddSubscriptionsResponse".to_string()),
                    "subscribed" => return std::result::Result::Err("Parsing a container in this style is not supported in AddSubscriptionsResponse".to_string()),
                    "already_subscribed" => return std::result::Result::Err("Parsing a container in this style is not supported in AddSubscriptionsResponse".to_string()),
                    "unauthorized" => return std::result::Result::Err("Parsing a container in this style is not supported in AddSubscriptionsResponse".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing AddSubscriptionsResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(AddSubscriptionsResponse {
            result: std::result::Result::Err("Nullable types not supported in AddSubscriptionsResponse".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in AddSubscriptionsResponse".to_string())?,
            subscribed: intermediate_rep.subscribed.into_iter().next(),
            already_subscribed: intermediate_rep.already_subscribed.into_iter().next(),
            unauthorized: intermediate_rep.unauthorized.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<AddSubscriptionsResponse> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<AddSubscriptionsResponse>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<AddSubscriptionsResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for AddSubscriptionsResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<AddSubscriptionsResponse> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <AddSubscriptionsResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into AddSubscriptionsResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct AddSubscriptionsResponseAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    #[serde(rename = "subscribed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subscribed: Option<std::collections::HashMap<String, Vec<String>>>,

    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    #[serde(rename = "already_subscribed")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub already_subscribed: Option<std::collections::HashMap<String, Vec<String>>>,

    /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
    #[serde(rename = "unauthorized")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub unauthorized: Option<Vec<String>>,

}

impl AddSubscriptionsResponseAllOf {
    pub fn new() -> AddSubscriptionsResponseAllOf {
        AddSubscriptionsResponseAllOf {
            result: None,
            msg: None,
            subscribed: None,
            already_subscribed: None,
            unauthorized: None,
        }
    }
}

/// Converts the AddSubscriptionsResponseAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for AddSubscriptionsResponseAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping subscribed in query parameter serialization
        // Skipping subscribed in query parameter serialization

        // Skipping already_subscribed in query parameter serialization
        // Skipping already_subscribed in query parameter serialization


        if let Some(ref unauthorized) = self.unauthorized {
            params.push("unauthorized".to_string());
            params.push(unauthorized.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a AddSubscriptionsResponseAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for AddSubscriptionsResponseAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub subscribed: Vec<std::collections::HashMap<String, Vec<String>>>,
            pub already_subscribed: Vec<std::collections::HashMap<String, Vec<String>>>,
            pub unauthorized: Vec<Vec<String>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing AddSubscriptionsResponseAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in AddSubscriptionsResponseAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in AddSubscriptionsResponseAllOf".to_string()),
                    "subscribed" => return std::result::Result::Err("Parsing a container in this style is not supported in AddSubscriptionsResponseAllOf".to_string()),
                    "already_subscribed" => return std::result::Result::Err("Parsing a container in this style is not supported in AddSubscriptionsResponseAllOf".to_string()),
                    "unauthorized" => return std::result::Result::Err("Parsing a container in this style is not supported in AddSubscriptionsResponseAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing AddSubscriptionsResponseAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(AddSubscriptionsResponseAllOf {
            result: std::result::Result::Err("Nullable types not supported in AddSubscriptionsResponseAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in AddSubscriptionsResponseAllOf".to_string())?,
            subscribed: intermediate_rep.subscribed.into_iter().next(),
            already_subscribed: intermediate_rep.already_subscribed.into_iter().next(),
            unauthorized: intermediate_rep.unauthorized.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<AddSubscriptionsResponseAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<AddSubscriptionsResponseAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<AddSubscriptionsResponseAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for AddSubscriptionsResponseAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<AddSubscriptionsResponseAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <AddSubscriptionsResponseAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into AddSubscriptionsResponseAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ApiKeyResponse {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    /// The API key that can be used to authenticate as the requested user. 
    #[serde(rename = "api_key")]
    pub api_key: String,

    /// The email address of the user who owns the API key 
    #[serde(rename = "email")]
    pub email: String,

}

impl ApiKeyResponse {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, api_key: String, email: String, ) -> ApiKeyResponse {
        ApiKeyResponse {
            result: result,
            msg: msg,
            api_key: api_key,
            email: email,
        }
    }
}

/// Converts the ApiKeyResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for ApiKeyResponse {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization


        params.push("api_key".to_string());
        params.push(self.api_key.to_string());


        params.push("email".to_string());
        params.push(self.email.to_string());

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ApiKeyResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ApiKeyResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub api_key: Vec<String>,
            pub email: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ApiKeyResponse".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in ApiKeyResponse".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in ApiKeyResponse".to_string()),
                    "api_key" => intermediate_rep.api_key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "email" => intermediate_rep.email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ApiKeyResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ApiKeyResponse {
            result: std::result::Result::Err("Nullable types not supported in ApiKeyResponse".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in ApiKeyResponse".to_string())?,
            api_key: intermediate_rep.api_key.into_iter().next().ok_or("api_key missing in ApiKeyResponse".to_string())?,
            email: intermediate_rep.email.into_iter().next().ok_or("email missing in ApiKeyResponse".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ApiKeyResponse> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<ApiKeyResponse>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ApiKeyResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ApiKeyResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<ApiKeyResponse> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ApiKeyResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ApiKeyResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ApiKeyResponseAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    /// The API key that can be used to authenticate as the requested user. 
    #[serde(rename = "api_key")]
    pub api_key: String,

    /// The email address of the user who owns the API key 
    #[serde(rename = "email")]
    pub email: String,

}

impl ApiKeyResponseAllOf {
    pub fn new(api_key: String, email: String, ) -> ApiKeyResponseAllOf {
        ApiKeyResponseAllOf {
            result: None,
            msg: None,
            api_key: api_key,
            email: email,
        }
    }
}

/// Converts the ApiKeyResponseAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for ApiKeyResponseAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization


        params.push("api_key".to_string());
        params.push(self.api_key.to_string());


        params.push("email".to_string());
        params.push(self.email.to_string());

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ApiKeyResponseAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ApiKeyResponseAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub api_key: Vec<String>,
            pub email: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ApiKeyResponseAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in ApiKeyResponseAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in ApiKeyResponseAllOf".to_string()),
                    "api_key" => intermediate_rep.api_key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "email" => intermediate_rep.email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ApiKeyResponseAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ApiKeyResponseAllOf {
            result: std::result::Result::Err("Nullable types not supported in ApiKeyResponseAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in ApiKeyResponseAllOf".to_string())?,
            api_key: intermediate_rep.api_key.into_iter().next().ok_or("api_key missing in ApiKeyResponseAllOf".to_string())?,
            email: intermediate_rep.email.into_iter().next().ok_or("email missing in ApiKeyResponseAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ApiKeyResponseAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<ApiKeyResponseAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ApiKeyResponseAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ApiKeyResponseAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<ApiKeyResponseAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ApiKeyResponseAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ApiKeyResponseAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Dictionary containing details of a file uploaded by a user. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Attachments {
    /// The unique ID for the attachment. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// Name of the uploaded file. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
    #[serde(rename = "path_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub path_id: Option<String>,

    /// Size of the file in bytes. 
    #[serde(rename = "size")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub size: Option<isize>,

    /// Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
    #[serde(rename = "create_time")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub create_time: Option<isize>,

    /// Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
    #[serde(rename = "messages")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub messages: Option<Vec<models::AttachmentsMessages>>,

}

impl Attachments {
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

/// Converts the Attachments value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Attachments {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref path_id) = self.path_id {
            params.push("path_id".to_string());
            params.push(path_id.to_string());
        }


        if let Some(ref size) = self.size {
            params.push("size".to_string());
            params.push(size.to_string());
        }


        if let Some(ref create_time) = self.create_time {
            params.push("create_time".to_string());
            params.push(create_time.to_string());
        }

        // Skipping messages in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Attachments value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Attachments {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<isize>,
            pub name: Vec<String>,
            pub path_id: Vec<String>,
            pub size: Vec<isize>,
            pub create_time: Vec<isize>,
            pub messages: Vec<Vec<models::AttachmentsMessages>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Attachments".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "path_id" => intermediate_rep.path_id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "size" => intermediate_rep.size.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "create_time" => intermediate_rep.create_time.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "messages" => return std::result::Result::Err("Parsing a container in this style is not supported in Attachments".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Attachments".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Attachments {
            id: intermediate_rep.id.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            path_id: intermediate_rep.path_id.into_iter().next(),
            size: intermediate_rep.size.into_iter().next(),
            create_time: intermediate_rep.create_time.into_iter().next(),
            messages: intermediate_rep.messages.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Attachments> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Attachments>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Attachments>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Attachments - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Attachments> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Attachments as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Attachments - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct AttachmentsMessages {
    /// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
    #[serde(rename = "date_sent")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_sent: Option<isize>,

    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

}

impl AttachmentsMessages {
    pub fn new() -> AttachmentsMessages {
        AttachmentsMessages {
            date_sent: None,
            id: None,
        }
    }
}

/// Converts the AttachmentsMessages value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for AttachmentsMessages {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref date_sent) = self.date_sent {
            params.push("date_sent".to_string());
            params.push(date_sent.to_string());
        }


        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a AttachmentsMessages value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for AttachmentsMessages {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub date_sent: Vec<isize>,
            pub id: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing AttachmentsMessages".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "date_sent" => intermediate_rep.date_sent.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing AttachmentsMessages".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(AttachmentsMessages {
            date_sent: intermediate_rep.date_sent.into_iter().next(),
            id: intermediate_rep.id.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<AttachmentsMessages> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<AttachmentsMessages>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<AttachmentsMessages>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for AttachmentsMessages - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<AttachmentsMessages> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <AttachmentsMessages as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into AttachmentsMessages - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BadEventQueueIdError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

    /// The string that identifies the invalid event queue. 
    #[serde(rename = "queue_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub queue_id: Option<String>,

}

impl BadEventQueueIdError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> BadEventQueueIdError {
        BadEventQueueIdError {
            result: result,
            msg: msg,
            code: None,
            queue_id: None,
        }
    }
}

/// Converts the BadEventQueueIdError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BadEventQueueIdError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization


        if let Some(ref queue_id) = self.queue_id {
            params.push("queue_id".to_string());
            params.push(queue_id.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BadEventQueueIdError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BadEventQueueIdError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
            pub queue_id: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BadEventQueueIdError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BadEventQueueIdError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BadEventQueueIdError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BadEventQueueIdError".to_string()),
                    "queue_id" => intermediate_rep.queue_id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing BadEventQueueIdError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BadEventQueueIdError {
            result: std::result::Result::Err("Nullable types not supported in BadEventQueueIdError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in BadEventQueueIdError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in BadEventQueueIdError".to_string())?,
            queue_id: intermediate_rep.queue_id.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BadEventQueueIdError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BadEventQueueIdError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BadEventQueueIdError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BadEventQueueIdError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BadEventQueueIdError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BadEventQueueIdError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BadEventQueueIdError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BadEventQueueIdErrorAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

    /// The string that identifies the invalid event queue. 
    #[serde(rename = "queue_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub queue_id: Option<String>,

}

impl BadEventQueueIdErrorAllOf {
    pub fn new() -> BadEventQueueIdErrorAllOf {
        BadEventQueueIdErrorAllOf {
            result: None,
            msg: None,
            code: None,
            queue_id: None,
        }
    }
}

/// Converts the BadEventQueueIdErrorAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BadEventQueueIdErrorAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization


        if let Some(ref queue_id) = self.queue_id {
            params.push("queue_id".to_string());
            params.push(queue_id.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BadEventQueueIdErrorAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BadEventQueueIdErrorAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
            pub queue_id: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BadEventQueueIdErrorAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BadEventQueueIdErrorAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BadEventQueueIdErrorAllOf".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BadEventQueueIdErrorAllOf".to_string()),
                    "queue_id" => intermediate_rep.queue_id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing BadEventQueueIdErrorAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BadEventQueueIdErrorAllOf {
            result: std::result::Result::Err("Nullable types not supported in BadEventQueueIdErrorAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in BadEventQueueIdErrorAllOf".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in BadEventQueueIdErrorAllOf".to_string())?,
            queue_id: intermediate_rep.queue_id.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BadEventQueueIdErrorAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BadEventQueueIdErrorAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BadEventQueueIdErrorAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BadEventQueueIdErrorAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BadEventQueueIdErrorAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BadEventQueueIdErrorAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BadEventQueueIdErrorAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BasicBot {
    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "api_key")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub api_key: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_sending_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_sending_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_events_register_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_events_register_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_all_public_streams")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_all_public_streams: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub owner_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "services")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub services: Option<swagger::Nullable<serde_json::Value>>,

}

impl BasicBot {
    pub fn new() -> BasicBot {
        BasicBot {
            user_id: None,
            full_name: None,
            api_key: None,
            default_sending_stream: None,
            default_events_register_stream: None,
            default_all_public_streams: None,
            avatar_url: None,
            owner_id: None,
            services: None,
        }
    }
}

/// Converts the BasicBot value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BasicBot {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping user_id in query parameter serialization

        // Skipping full_name in query parameter serialization

        // Skipping api_key in query parameter serialization

        // Skipping default_sending_stream in query parameter serialization

        // Skipping default_events_register_stream in query parameter serialization

        // Skipping default_all_public_streams in query parameter serialization

        // Skipping avatar_url in query parameter serialization

        // Skipping owner_id in query parameter serialization

        // Skipping services in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BasicBot value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BasicBot {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub user_id: Vec<serde_json::Value>,
            pub full_name: Vec<serde_json::Value>,
            pub api_key: Vec<serde_json::Value>,
            pub default_sending_stream: Vec<serde_json::Value>,
            pub default_events_register_stream: Vec<serde_json::Value>,
            pub default_all_public_streams: Vec<serde_json::Value>,
            pub avatar_url: Vec<serde_json::Value>,
            pub owner_id: Vec<serde_json::Value>,
            pub services: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BasicBot".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "api_key" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "default_sending_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "default_events_register_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "default_all_public_streams" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    "services" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBot".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BasicBot".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BasicBot {
            user_id: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            full_name: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            api_key: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            default_sending_stream: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            default_events_register_stream: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            default_all_public_streams: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            avatar_url: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            owner_id: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
            services: std::result::Result::Err("Nullable types not supported in BasicBot".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BasicBot> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BasicBot>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BasicBot>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BasicBot - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BasicBot> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BasicBot as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BasicBot - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BasicBotAllOf {
    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "api_key")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub api_key: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_sending_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_sending_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_events_register_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_events_register_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_all_public_streams")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_all_public_streams: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub owner_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "services")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub services: Option<swagger::Nullable<serde_json::Value>>,

}

impl BasicBotAllOf {
    pub fn new() -> BasicBotAllOf {
        BasicBotAllOf {
            user_id: None,
            full_name: None,
            api_key: None,
            default_sending_stream: None,
            default_events_register_stream: None,
            default_all_public_streams: None,
            avatar_url: None,
            owner_id: None,
            services: None,
        }
    }
}

/// Converts the BasicBotAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BasicBotAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping user_id in query parameter serialization

        // Skipping full_name in query parameter serialization

        // Skipping api_key in query parameter serialization

        // Skipping default_sending_stream in query parameter serialization

        // Skipping default_events_register_stream in query parameter serialization

        // Skipping default_all_public_streams in query parameter serialization

        // Skipping avatar_url in query parameter serialization

        // Skipping owner_id in query parameter serialization

        // Skipping services in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BasicBotAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BasicBotAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub user_id: Vec<serde_json::Value>,
            pub full_name: Vec<serde_json::Value>,
            pub api_key: Vec<serde_json::Value>,
            pub default_sending_stream: Vec<serde_json::Value>,
            pub default_events_register_stream: Vec<serde_json::Value>,
            pub default_all_public_streams: Vec<serde_json::Value>,
            pub avatar_url: Vec<serde_json::Value>,
            pub owner_id: Vec<serde_json::Value>,
            pub services: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BasicBotAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "api_key" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "default_sending_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "default_events_register_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "default_all_public_streams" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    "services" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BasicBotAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BasicBotAllOf {
            user_id: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            full_name: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            api_key: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            default_sending_stream: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            default_events_register_stream: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            default_all_public_streams: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            avatar_url: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            owner_id: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
            services: std::result::Result::Err("Nullable types not supported in BasicBotAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BasicBotAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BasicBotAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BasicBotAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BasicBotAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BasicBotAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BasicBotAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BasicBotAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BasicBotBase {
    /// The user id of the bot. 
    #[serde(rename = "user_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<isize>,

    /// The full name of the bot. 
    #[serde(rename = "full_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<String>,

    /// The API key of the bot which it uses to make API requests. 
    #[serde(rename = "api_key")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub api_key: Option<String>,

    /// The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
    #[serde(rename = "default_sending_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_sending_stream: Option<swagger::Nullable<String>>,

    /// The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
    #[serde(rename = "default_events_register_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_events_register_stream: Option<swagger::Nullable<String>>,

    /// Whether the bot can send messages to all streams by default. 
    #[serde(rename = "default_all_public_streams")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_all_public_streams: Option<bool>,

    /// The URL of the bot's avatar. 
    #[serde(rename = "avatar_url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<String>,

    /// The user id of the bot's owner.  Null if the bot has no owner. 
    #[serde(rename = "owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub owner_id: Option<swagger::Nullable<isize>>,

    /// The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
    #[serde(rename = "services")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub services: Option<Vec<swagger::OneOf2<serde_json::Value,serde_json::Value>>>,

}

impl BasicBotBase {
    pub fn new() -> BasicBotBase {
        BasicBotBase {
            user_id: None,
            full_name: None,
            api_key: None,
            default_sending_stream: None,
            default_events_register_stream: None,
            default_all_public_streams: None,
            avatar_url: None,
            owner_id: None,
            services: None,
        }
    }
}

/// Converts the BasicBotBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BasicBotBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref user_id) = self.user_id {
            params.push("user_id".to_string());
            params.push(user_id.to_string());
        }


        if let Some(ref full_name) = self.full_name {
            params.push("full_name".to_string());
            params.push(full_name.to_string());
        }


        if let Some(ref api_key) = self.api_key {
            params.push("api_key".to_string());
            params.push(api_key.to_string());
        }


        if let Some(ref default_sending_stream) = self.default_sending_stream {
            params.push("default_sending_stream".to_string());
            params.push(default_sending_stream.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref default_events_register_stream) = self.default_events_register_stream {
            params.push("default_events_register_stream".to_string());
            params.push(default_events_register_stream.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref default_all_public_streams) = self.default_all_public_streams {
            params.push("default_all_public_streams".to_string());
            params.push(default_all_public_streams.to_string());
        }


        if let Some(ref avatar_url) = self.avatar_url {
            params.push("avatar_url".to_string());
            params.push(avatar_url.to_string());
        }


        if let Some(ref owner_id) = self.owner_id {
            params.push("owner_id".to_string());
            params.push(owner_id.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }

        // Skipping services in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BasicBotBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BasicBotBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub user_id: Vec<isize>,
            pub full_name: Vec<String>,
            pub api_key: Vec<String>,
            pub default_sending_stream: Vec<String>,
            pub default_events_register_stream: Vec<String>,
            pub default_all_public_streams: Vec<bool>,
            pub avatar_url: Vec<String>,
            pub owner_id: Vec<isize>,
            pub services: Vec<Vec<swagger::OneOf2<serde_json::Value,serde_json::Value>>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BasicBotBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "user_id" => intermediate_rep.user_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "full_name" => intermediate_rep.full_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "api_key" => intermediate_rep.api_key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "default_sending_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotBase".to_string()),
                    "default_events_register_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotBase".to_string()),
                    "default_all_public_streams" => intermediate_rep.default_all_public_streams.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "avatar_url" => intermediate_rep.avatar_url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicBotBase".to_string()),
                    "services" => return std::result::Result::Err("Parsing a container in this style is not supported in BasicBotBase".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BasicBotBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BasicBotBase {
            user_id: intermediate_rep.user_id.into_iter().next(),
            full_name: intermediate_rep.full_name.into_iter().next(),
            api_key: intermediate_rep.api_key.into_iter().next(),
            default_sending_stream: std::result::Result::Err("Nullable types not supported in BasicBotBase".to_string())?,
            default_events_register_stream: std::result::Result::Err("Nullable types not supported in BasicBotBase".to_string())?,
            default_all_public_streams: intermediate_rep.default_all_public_streams.into_iter().next(),
            avatar_url: intermediate_rep.avatar_url.into_iter().next(),
            owner_id: std::result::Result::Err("Nullable types not supported in BasicBotBase".to_string())?,
            services: intermediate_rep.services.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BasicBotBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BasicBotBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BasicBotBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BasicBotBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BasicBotBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BasicBotBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BasicBotBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BasicStream {
    #[serde(rename = "stream_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "description")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "date_created")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_created: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "invite_only")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub invite_only: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "rendered_description")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub rendered_description: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_web_public")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_web_public: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "stream_post_policy")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_post_policy: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "message_retention_days")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message_retention_days: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "history_public_to_subscribers")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub history_public_to_subscribers: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "first_message_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub first_message_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_announcement_only")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_announcement_only: Option<swagger::Nullable<serde_json::Value>>,

}

impl BasicStream {
    pub fn new() -> BasicStream {
        BasicStream {
            stream_id: None,
            name: None,
            description: None,
            date_created: None,
            invite_only: None,
            rendered_description: None,
            is_web_public: None,
            stream_post_policy: None,
            message_retention_days: None,
            history_public_to_subscribers: None,
            first_message_id: None,
            is_announcement_only: None,
        }
    }
}

/// Converts the BasicStream value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BasicStream {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping stream_id in query parameter serialization

        // Skipping name in query parameter serialization

        // Skipping description in query parameter serialization

        // Skipping date_created in query parameter serialization

        // Skipping invite_only in query parameter serialization

        // Skipping rendered_description in query parameter serialization

        // Skipping is_web_public in query parameter serialization

        // Skipping stream_post_policy in query parameter serialization

        // Skipping message_retention_days in query parameter serialization

        // Skipping history_public_to_subscribers in query parameter serialization

        // Skipping first_message_id in query parameter serialization

        // Skipping is_announcement_only in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BasicStream value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BasicStream {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub stream_id: Vec<serde_json::Value>,
            pub name: Vec<serde_json::Value>,
            pub description: Vec<serde_json::Value>,
            pub date_created: Vec<serde_json::Value>,
            pub invite_only: Vec<serde_json::Value>,
            pub rendered_description: Vec<serde_json::Value>,
            pub is_web_public: Vec<serde_json::Value>,
            pub stream_post_policy: Vec<serde_json::Value>,
            pub message_retention_days: Vec<serde_json::Value>,
            pub history_public_to_subscribers: Vec<serde_json::Value>,
            pub first_message_id: Vec<serde_json::Value>,
            pub is_announcement_only: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BasicStream".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "stream_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "description" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "date_created" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "invite_only" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "rendered_description" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "is_web_public" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "stream_post_policy" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "message_retention_days" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "history_public_to_subscribers" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "first_message_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    "is_announcement_only" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStream".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BasicStream".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BasicStream {
            stream_id: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            name: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            description: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            date_created: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            invite_only: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            rendered_description: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            is_web_public: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            stream_post_policy: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            message_retention_days: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            history_public_to_subscribers: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            first_message_id: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
            is_announcement_only: std::result::Result::Err("Nullable types not supported in BasicStream".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BasicStream> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BasicStream>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BasicStream>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BasicStream - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BasicStream> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BasicStream as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BasicStream - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BasicStreamAllOf {
    #[serde(rename = "stream_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "description")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "date_created")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_created: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "invite_only")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub invite_only: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "rendered_description")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub rendered_description: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_web_public")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_web_public: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "stream_post_policy")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_post_policy: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "message_retention_days")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message_retention_days: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "history_public_to_subscribers")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub history_public_to_subscribers: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "first_message_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub first_message_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_announcement_only")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_announcement_only: Option<swagger::Nullable<serde_json::Value>>,

}

impl BasicStreamAllOf {
    pub fn new() -> BasicStreamAllOf {
        BasicStreamAllOf {
            stream_id: None,
            name: None,
            description: None,
            date_created: None,
            invite_only: None,
            rendered_description: None,
            is_web_public: None,
            stream_post_policy: None,
            message_retention_days: None,
            history_public_to_subscribers: None,
            first_message_id: None,
            is_announcement_only: None,
        }
    }
}

/// Converts the BasicStreamAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BasicStreamAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping stream_id in query parameter serialization

        // Skipping name in query parameter serialization

        // Skipping description in query parameter serialization

        // Skipping date_created in query parameter serialization

        // Skipping invite_only in query parameter serialization

        // Skipping rendered_description in query parameter serialization

        // Skipping is_web_public in query parameter serialization

        // Skipping stream_post_policy in query parameter serialization

        // Skipping message_retention_days in query parameter serialization

        // Skipping history_public_to_subscribers in query parameter serialization

        // Skipping first_message_id in query parameter serialization

        // Skipping is_announcement_only in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BasicStreamAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BasicStreamAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub stream_id: Vec<serde_json::Value>,
            pub name: Vec<serde_json::Value>,
            pub description: Vec<serde_json::Value>,
            pub date_created: Vec<serde_json::Value>,
            pub invite_only: Vec<serde_json::Value>,
            pub rendered_description: Vec<serde_json::Value>,
            pub is_web_public: Vec<serde_json::Value>,
            pub stream_post_policy: Vec<serde_json::Value>,
            pub message_retention_days: Vec<serde_json::Value>,
            pub history_public_to_subscribers: Vec<serde_json::Value>,
            pub first_message_id: Vec<serde_json::Value>,
            pub is_announcement_only: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BasicStreamAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "stream_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "description" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "date_created" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "invite_only" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "rendered_description" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "is_web_public" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "stream_post_policy" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "message_retention_days" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "history_public_to_subscribers" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "first_message_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    "is_announcement_only" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing BasicStreamAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BasicStreamAllOf {
            stream_id: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            name: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            description: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            date_created: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            invite_only: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            rendered_description: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            is_web_public: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            stream_post_policy: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            message_retention_days: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            history_public_to_subscribers: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            first_message_id: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
            is_announcement_only: std::result::Result::Err("Nullable types not supported in BasicStreamAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BasicStreamAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BasicStreamAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BasicStreamAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BasicStreamAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BasicStreamAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BasicStreamAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BasicStreamAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing basic details about the stream. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BasicStreamBase {
    /// The unique ID of the stream. 
    #[serde(rename = "stream_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<isize>,

    /// The name of the stream. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    #[serde(rename = "date_created")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_created: Option<isize>,

    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    #[serde(rename = "invite_only")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub invite_only: Option<bool>,

    /// The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    #[serde(rename = "rendered_description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub rendered_description: Option<String>,

    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    #[serde(rename = "is_web_public")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_web_public: Option<bool>,

    /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    #[serde(rename = "stream_post_policy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_post_policy: Option<isize>,

    /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    #[serde(rename = "message_retention_days")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message_retention_days: Option<swagger::Nullable<isize>>,

    /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    #[serde(rename = "history_public_to_subscribers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub history_public_to_subscribers: Option<bool>,

    /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    #[serde(rename = "first_message_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub first_message_id: Option<swagger::Nullable<isize>>,

    /// Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    #[serde(rename = "is_announcement_only")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_announcement_only: Option<bool>,

}

impl BasicStreamBase {
    pub fn new() -> BasicStreamBase {
        BasicStreamBase {
            stream_id: None,
            name: None,
            description: None,
            date_created: None,
            invite_only: None,
            rendered_description: None,
            is_web_public: None,
            stream_post_policy: None,
            message_retention_days: None,
            history_public_to_subscribers: None,
            first_message_id: None,
            is_announcement_only: None,
        }
    }
}

/// Converts the BasicStreamBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BasicStreamBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref stream_id) = self.stream_id {
            params.push("stream_id".to_string());
            params.push(stream_id.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }


        if let Some(ref date_created) = self.date_created {
            params.push("date_created".to_string());
            params.push(date_created.to_string());
        }


        if let Some(ref invite_only) = self.invite_only {
            params.push("invite_only".to_string());
            params.push(invite_only.to_string());
        }


        if let Some(ref rendered_description) = self.rendered_description {
            params.push("rendered_description".to_string());
            params.push(rendered_description.to_string());
        }


        if let Some(ref is_web_public) = self.is_web_public {
            params.push("is_web_public".to_string());
            params.push(is_web_public.to_string());
        }


        if let Some(ref stream_post_policy) = self.stream_post_policy {
            params.push("stream_post_policy".to_string());
            params.push(stream_post_policy.to_string());
        }


        if let Some(ref message_retention_days) = self.message_retention_days {
            params.push("message_retention_days".to_string());
            params.push(message_retention_days.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref history_public_to_subscribers) = self.history_public_to_subscribers {
            params.push("history_public_to_subscribers".to_string());
            params.push(history_public_to_subscribers.to_string());
        }


        if let Some(ref first_message_id) = self.first_message_id {
            params.push("first_message_id".to_string());
            params.push(first_message_id.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref is_announcement_only) = self.is_announcement_only {
            params.push("is_announcement_only".to_string());
            params.push(is_announcement_only.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BasicStreamBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BasicStreamBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub stream_id: Vec<isize>,
            pub name: Vec<String>,
            pub description: Vec<String>,
            pub date_created: Vec<isize>,
            pub invite_only: Vec<bool>,
            pub rendered_description: Vec<String>,
            pub is_web_public: Vec<bool>,
            pub stream_post_policy: Vec<isize>,
            pub message_retention_days: Vec<isize>,
            pub history_public_to_subscribers: Vec<bool>,
            pub first_message_id: Vec<isize>,
            pub is_announcement_only: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BasicStreamBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "stream_id" => intermediate_rep.stream_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "date_created" => intermediate_rep.date_created.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "invite_only" => intermediate_rep.invite_only.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "rendered_description" => intermediate_rep.rendered_description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_web_public" => intermediate_rep.is_web_public.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "stream_post_policy" => intermediate_rep.stream_post_policy.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "message_retention_days" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamBase".to_string()),
                    "history_public_to_subscribers" => intermediate_rep.history_public_to_subscribers.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "first_message_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BasicStreamBase".to_string()),
                    "is_announcement_only" => intermediate_rep.is_announcement_only.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing BasicStreamBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BasicStreamBase {
            stream_id: intermediate_rep.stream_id.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
            date_created: intermediate_rep.date_created.into_iter().next(),
            invite_only: intermediate_rep.invite_only.into_iter().next(),
            rendered_description: intermediate_rep.rendered_description.into_iter().next(),
            is_web_public: intermediate_rep.is_web_public.into_iter().next(),
            stream_post_policy: intermediate_rep.stream_post_policy.into_iter().next(),
            message_retention_days: std::result::Result::Err("Nullable types not supported in BasicStreamBase".to_string())?,
            history_public_to_subscribers: intermediate_rep.history_public_to_subscribers.into_iter().next(),
            first_message_id: std::result::Result::Err("Nullable types not supported in BasicStreamBase".to_string())?,
            is_announcement_only: intermediate_rep.is_announcement_only.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BasicStreamBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BasicStreamBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BasicStreamBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BasicStreamBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BasicStreamBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BasicStreamBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BasicStreamBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Bot {
    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "api_key")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub api_key: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_sending_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_sending_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_events_register_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_events_register_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_all_public_streams")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_all_public_streams: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub owner_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "services")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub services: Option<swagger::Nullable<serde_json::Value>>,

    /// The email of the bot. 
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    #[serde(rename = "bot_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_type: Option<swagger::Nullable<isize>>,

    /// A boolean describing whether the user account has been deactivated. 
    #[serde(rename = "is_active")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_active: Option<bool>,

}

impl Bot {
    pub fn new() -> Bot {
        Bot {
            user_id: None,
            full_name: None,
            api_key: None,
            default_sending_stream: None,
            default_events_register_stream: None,
            default_all_public_streams: None,
            avatar_url: None,
            owner_id: None,
            services: None,
            email: None,
            bot_type: None,
            is_active: None,
        }
    }
}

/// Converts the Bot value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Bot {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping user_id in query parameter serialization

        // Skipping full_name in query parameter serialization

        // Skipping api_key in query parameter serialization

        // Skipping default_sending_stream in query parameter serialization

        // Skipping default_events_register_stream in query parameter serialization

        // Skipping default_all_public_streams in query parameter serialization

        // Skipping avatar_url in query parameter serialization

        // Skipping owner_id in query parameter serialization

        // Skipping services in query parameter serialization


        if let Some(ref email) = self.email {
            params.push("email".to_string());
            params.push(email.to_string());
        }


        if let Some(ref bot_type) = self.bot_type {
            params.push("bot_type".to_string());
            params.push(bot_type.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref is_active) = self.is_active {
            params.push("is_active".to_string());
            params.push(is_active.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Bot value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Bot {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub user_id: Vec<serde_json::Value>,
            pub full_name: Vec<serde_json::Value>,
            pub api_key: Vec<serde_json::Value>,
            pub default_sending_stream: Vec<serde_json::Value>,
            pub default_events_register_stream: Vec<serde_json::Value>,
            pub default_all_public_streams: Vec<serde_json::Value>,
            pub avatar_url: Vec<serde_json::Value>,
            pub owner_id: Vec<serde_json::Value>,
            pub services: Vec<serde_json::Value>,
            pub email: Vec<String>,
            pub bot_type: Vec<isize>,
            pub is_active: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Bot".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "api_key" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "default_sending_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "default_events_register_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "default_all_public_streams" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "services" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "email" => intermediate_rep.email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "bot_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Bot".to_string()),
                    "is_active" => intermediate_rep.is_active.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Bot".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Bot {
            user_id: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            full_name: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            api_key: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            default_sending_stream: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            default_events_register_stream: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            default_all_public_streams: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            avatar_url: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            owner_id: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            services: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            email: intermediate_rep.email.into_iter().next(),
            bot_type: std::result::Result::Err("Nullable types not supported in Bot".to_string())?,
            is_active: intermediate_rep.is_active.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Bot> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Bot>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Bot>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Bot - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Bot> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Bot as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Bot - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing details of a bot. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct BotAllOf {
    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "api_key")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub api_key: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_sending_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_sending_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_events_register_stream")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_events_register_stream: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "default_all_public_streams")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub default_all_public_streams: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub owner_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "services")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub services: Option<swagger::Nullable<serde_json::Value>>,

    /// The email of the bot. 
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    #[serde(rename = "bot_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_type: Option<swagger::Nullable<isize>>,

    /// A boolean describing whether the user account has been deactivated. 
    #[serde(rename = "is_active")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_active: Option<bool>,

}

impl BotAllOf {
    pub fn new() -> BotAllOf {
        BotAllOf {
            user_id: None,
            full_name: None,
            api_key: None,
            default_sending_stream: None,
            default_events_register_stream: None,
            default_all_public_streams: None,
            avatar_url: None,
            owner_id: None,
            services: None,
            email: None,
            bot_type: None,
            is_active: None,
        }
    }
}

/// Converts the BotAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for BotAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping user_id in query parameter serialization

        // Skipping full_name in query parameter serialization

        // Skipping api_key in query parameter serialization

        // Skipping default_sending_stream in query parameter serialization

        // Skipping default_events_register_stream in query parameter serialization

        // Skipping default_all_public_streams in query parameter serialization

        // Skipping avatar_url in query parameter serialization

        // Skipping owner_id in query parameter serialization

        // Skipping services in query parameter serialization


        if let Some(ref email) = self.email {
            params.push("email".to_string());
            params.push(email.to_string());
        }


        if let Some(ref bot_type) = self.bot_type {
            params.push("bot_type".to_string());
            params.push(bot_type.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref is_active) = self.is_active {
            params.push("is_active".to_string());
            params.push(is_active.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a BotAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for BotAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub user_id: Vec<serde_json::Value>,
            pub full_name: Vec<serde_json::Value>,
            pub api_key: Vec<serde_json::Value>,
            pub default_sending_stream: Vec<serde_json::Value>,
            pub default_events_register_stream: Vec<serde_json::Value>,
            pub default_all_public_streams: Vec<serde_json::Value>,
            pub avatar_url: Vec<serde_json::Value>,
            pub owner_id: Vec<serde_json::Value>,
            pub services: Vec<serde_json::Value>,
            pub email: Vec<String>,
            pub bot_type: Vec<isize>,
            pub is_active: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing BotAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "api_key" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "default_sending_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "default_events_register_stream" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "default_all_public_streams" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "services" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "email" => intermediate_rep.email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "bot_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in BotAllOf".to_string()),
                    "is_active" => intermediate_rep.is_active.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing BotAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(BotAllOf {
            user_id: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            full_name: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            api_key: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            default_sending_stream: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            default_events_register_stream: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            default_all_public_streams: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            avatar_url: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            owner_id: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            services: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            email: intermediate_rep.email.into_iter().next(),
            bot_type: std::result::Result::Err("Nullable types not supported in BotAllOf".to_string())?,
            is_active: intermediate_rep.is_active.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<BotAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<BotAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<BotAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for BotAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<BotAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <BotAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into BotAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CodedError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

}

impl CodedError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> CodedError {
        CodedError {
            result: result,
            msg: msg,
            code: None,
        }
    }
}

/// Converts the CodedError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for CodedError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CodedError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CodedError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CodedError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CodedError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CodedError {
            result: std::result::Result::Err("Nullable types not supported in CodedError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in CodedError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in CodedError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CodedError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CodedError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CodedError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CodedError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CodedError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CodedError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CodedError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CodedErrorAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

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

/// Converts the CodedErrorAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for CodedErrorAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CodedErrorAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CodedErrorAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CodedErrorAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorAllOf".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CodedErrorAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CodedErrorAllOf {
            result: std::result::Result::Err("Nullable types not supported in CodedErrorAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in CodedErrorAllOf".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in CodedErrorAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CodedErrorAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CodedErrorAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CodedErrorAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CodedErrorAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CodedErrorAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CodedErrorAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CodedErrorAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CodedErrorBase {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    /// A string that identifies the error. 
    #[serde(rename = "code")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<String>,

}

impl CodedErrorBase {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> CodedErrorBase {
        CodedErrorBase {
            result: result,
            msg: msg,
            code: None,
        }
    }
}

/// Converts the CodedErrorBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for CodedErrorBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization


        if let Some(ref code) = self.code {
            params.push("code".to_string());
            params.push(code.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CodedErrorBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CodedErrorBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CodedErrorBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorBase".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorBase".to_string()),
                    "code" => intermediate_rep.code.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CodedErrorBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CodedErrorBase {
            result: std::result::Result::Err("Nullable types not supported in CodedErrorBase".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in CodedErrorBase".to_string())?,
            code: intermediate_rep.code.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CodedErrorBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CodedErrorBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CodedErrorBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CodedErrorBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CodedErrorBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CodedErrorBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CodedErrorBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CodedErrorBaseAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    /// A string that identifies the error. 
    #[serde(rename = "code")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<String>,

}

impl CodedErrorBaseAllOf {
    pub fn new() -> CodedErrorBaseAllOf {
        CodedErrorBaseAllOf {
            result: None,
            msg: None,
            code: None,
        }
    }
}

/// Converts the CodedErrorBaseAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for CodedErrorBaseAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization


        if let Some(ref code) = self.code {
            params.push("code".to_string());
            params.push(code.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CodedErrorBaseAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CodedErrorBaseAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CodedErrorBaseAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorBaseAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CodedErrorBaseAllOf".to_string()),
                    "code" => intermediate_rep.code.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CodedErrorBaseAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CodedErrorBaseAllOf {
            result: std::result::Result::Err("Nullable types not supported in CodedErrorBaseAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in CodedErrorBaseAllOf".to_string())?,
            code: intermediate_rep.code.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CodedErrorBaseAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CodedErrorBaseAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CodedErrorBaseAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CodedErrorBaseAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CodedErrorBaseAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CodedErrorBaseAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CodedErrorBaseAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Dictionary containing the details of a custom profile field configured for this organization. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CustomProfileField {
    /// The ID of the custom profile field.  This will be referenced in custom the profile fields section of user objects. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// An integer indicating the type of the custom profile field, which determines how it is configured and displayed to users.  See the [Add custom profile fields](/help/add-custom-profile-fields) article for details on what each type means.  * **1**: Short text * **2**: Long text * **3**: List of options * **4**: Date picker * **5**: Link * **6**: Person picker * **7**: External account 
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub type_: Option<isize>,

    /// Custom profile fields are displayed in both settings UI and UI showing users' profiles in increasing `order`. 
    #[serde(rename = "order")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub order: Option<isize>,

    /// The name of the custom profile field. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The help text to be displayed for the custom profile field in user-facing settings UI for configuring custom profile fields. 
    #[serde(rename = "hint")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub hint: Option<String>,

    /// Field types 3 (List of options) and 7 (External account) support storing additional configuration for the field type in the `field_data` attribute.  For field type 3 (List of options), this attribute is a JSON dictionary defining the choices and the order they will be displayed in the dropdown UI for individual users to select an option.  The interface for field type 7 is not yet stabilized. 
    #[serde(rename = "field_data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub field_data: Option<String>,

}

impl CustomProfileField {
    pub fn new() -> CustomProfileField {
        CustomProfileField {
            id: None,
            type_: None,
            order: None,
            name: None,
            hint: None,
            field_data: None,
        }
    }
}

/// Converts the CustomProfileField value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for CustomProfileField {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref type_) = self.type_ {
            params.push("type".to_string());
            params.push(type_.to_string());
        }


        if let Some(ref order) = self.order {
            params.push("order".to_string());
            params.push(order.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref hint) = self.hint {
            params.push("hint".to_string());
            params.push(hint.to_string());
        }


        if let Some(ref field_data) = self.field_data {
            params.push("field_data".to_string());
            params.push(field_data.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CustomProfileField value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CustomProfileField {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<isize>,
            pub type_: Vec<isize>,
            pub order: Vec<isize>,
            pub name: Vec<String>,
            pub hint: Vec<String>,
            pub field_data: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CustomProfileField".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "type" => intermediate_rep.type_.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "order" => intermediate_rep.order.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "hint" => intermediate_rep.hint.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "field_data" => intermediate_rep.field_data.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing CustomProfileField".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CustomProfileField {
            id: intermediate_rep.id.into_iter().next(),
            type_: intermediate_rep.type_.into_iter().next(),
            order: intermediate_rep.order.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            hint: intermediate_rep.hint.into_iter().next(),
            field_data: intermediate_rep.field_data.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CustomProfileField> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CustomProfileField>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CustomProfileField>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CustomProfileField - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CustomProfileField> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CustomProfileField as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CustomProfileField - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Dictionary containing details of a default stream group. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct DefaultStreamGroup {
    /// Name of the default stream group. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// Description of the default stream group. 
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// id of the default stream group. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// Array containing details about the streams in the default stream group. 
    #[serde(rename = "streams")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub streams: Option<Vec<models::BasicStream>>,

}

impl DefaultStreamGroup {
    pub fn new() -> DefaultStreamGroup {
        DefaultStreamGroup {
            name: None,
            description: None,
            id: None,
            streams: None,
        }
    }
}

/// Converts the DefaultStreamGroup value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for DefaultStreamGroup {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }


        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }

        // Skipping streams in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a DefaultStreamGroup value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for DefaultStreamGroup {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub name: Vec<String>,
            pub description: Vec<String>,
            pub id: Vec<isize>,
            pub streams: Vec<Vec<models::BasicStream>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing DefaultStreamGroup".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "streams" => return std::result::Result::Err("Parsing a container in this style is not supported in DefaultStreamGroup".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing DefaultStreamGroup".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(DefaultStreamGroup {
            name: intermediate_rep.name.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
            id: intermediate_rep.id.into_iter().next(),
            streams: intermediate_rep.streams.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<DefaultStreamGroup> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<DefaultStreamGroup>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<DefaultStreamGroup>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for DefaultStreamGroup - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<DefaultStreamGroup> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <DefaultStreamGroup as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into DefaultStreamGroup - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct EmojiReaction {
    #[serde(rename = "emoji_code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emoji_code: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "emoji_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emoji_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "reaction_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reaction_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "user")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<swagger::Nullable<serde_json::Value>>,

}

impl EmojiReaction {
    pub fn new() -> EmojiReaction {
        EmojiReaction {
            emoji_code: None,
            emoji_name: None,
            reaction_type: None,
            user_id: None,
            user: None,
        }
    }
}

/// Converts the EmojiReaction value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for EmojiReaction {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping emoji_code in query parameter serialization

        // Skipping emoji_name in query parameter serialization

        // Skipping reaction_type in query parameter serialization

        // Skipping user_id in query parameter serialization

        // Skipping user in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a EmojiReaction value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for EmojiReaction {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub emoji_code: Vec<serde_json::Value>,
            pub emoji_name: Vec<serde_json::Value>,
            pub reaction_type: Vec<serde_json::Value>,
            pub user_id: Vec<serde_json::Value>,
            pub user: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing EmojiReaction".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "emoji_code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReaction".to_string()),
                    "emoji_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReaction".to_string()),
                    "reaction_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReaction".to_string()),
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReaction".to_string()),
                    "user" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReaction".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing EmojiReaction".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(EmojiReaction {
            emoji_code: std::result::Result::Err("Nullable types not supported in EmojiReaction".to_string())?,
            emoji_name: std::result::Result::Err("Nullable types not supported in EmojiReaction".to_string())?,
            reaction_type: std::result::Result::Err("Nullable types not supported in EmojiReaction".to_string())?,
            user_id: std::result::Result::Err("Nullable types not supported in EmojiReaction".to_string())?,
            user: std::result::Result::Err("Nullable types not supported in EmojiReaction".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<EmojiReaction> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<EmojiReaction>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<EmojiReaction>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for EmojiReaction - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<EmojiReaction> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <EmojiReaction as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into EmojiReaction - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct EmojiReactionAllOf {
    #[serde(rename = "emoji_code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emoji_code: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "emoji_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emoji_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "reaction_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reaction_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "user")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<swagger::Nullable<serde_json::Value>>,

}

impl EmojiReactionAllOf {
    pub fn new() -> EmojiReactionAllOf {
        EmojiReactionAllOf {
            emoji_code: None,
            emoji_name: None,
            reaction_type: None,
            user_id: None,
            user: None,
        }
    }
}

/// Converts the EmojiReactionAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for EmojiReactionAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping emoji_code in query parameter serialization

        // Skipping emoji_name in query parameter serialization

        // Skipping reaction_type in query parameter serialization

        // Skipping user_id in query parameter serialization

        // Skipping user in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a EmojiReactionAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for EmojiReactionAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub emoji_code: Vec<serde_json::Value>,
            pub emoji_name: Vec<serde_json::Value>,
            pub reaction_type: Vec<serde_json::Value>,
            pub user_id: Vec<serde_json::Value>,
            pub user: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing EmojiReactionAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "emoji_code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReactionAllOf".to_string()),
                    "emoji_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReactionAllOf".to_string()),
                    "reaction_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReactionAllOf".to_string()),
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReactionAllOf".to_string()),
                    "user" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in EmojiReactionAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing EmojiReactionAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(EmojiReactionAllOf {
            emoji_code: std::result::Result::Err("Nullable types not supported in EmojiReactionAllOf".to_string())?,
            emoji_name: std::result::Result::Err("Nullable types not supported in EmojiReactionAllOf".to_string())?,
            reaction_type: std::result::Result::Err("Nullable types not supported in EmojiReactionAllOf".to_string())?,
            user_id: std::result::Result::Err("Nullable types not supported in EmojiReactionAllOf".to_string())?,
            user: std::result::Result::Err("Nullable types not supported in EmojiReactionAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<EmojiReactionAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<EmojiReactionAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<EmojiReactionAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for EmojiReactionAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<EmojiReactionAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <EmojiReactionAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into EmojiReactionAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct EmojiReactionBase {
    /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
    #[serde(rename = "emoji_code")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emoji_code: Option<String>,

    /// Name of the emoji. 
    #[serde(rename = "emoji_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub emoji_name: Option<String>,

    /// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    #[serde(rename = "reaction_type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reaction_type: Option<String>,

    /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
    #[serde(rename = "user_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<isize>,

    #[serde(rename = "user")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user: Option<models::EmojiReactionBaseUser>,

}

impl EmojiReactionBase {
    pub fn new() -> EmojiReactionBase {
        EmojiReactionBase {
            emoji_code: None,
            emoji_name: None,
            reaction_type: None,
            user_id: None,
            user: None,
        }
    }
}

/// Converts the EmojiReactionBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for EmojiReactionBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref emoji_code) = self.emoji_code {
            params.push("emoji_code".to_string());
            params.push(emoji_code.to_string());
        }


        if let Some(ref emoji_name) = self.emoji_name {
            params.push("emoji_name".to_string());
            params.push(emoji_name.to_string());
        }


        if let Some(ref reaction_type) = self.reaction_type {
            params.push("reaction_type".to_string());
            params.push(reaction_type.to_string());
        }


        if let Some(ref user_id) = self.user_id {
            params.push("user_id".to_string());
            params.push(user_id.to_string());
        }

        // Skipping user in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a EmojiReactionBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for EmojiReactionBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub emoji_code: Vec<String>,
            pub emoji_name: Vec<String>,
            pub reaction_type: Vec<String>,
            pub user_id: Vec<isize>,
            pub user: Vec<models::EmojiReactionBaseUser>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing EmojiReactionBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "emoji_code" => intermediate_rep.emoji_code.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "emoji_name" => intermediate_rep.emoji_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "reaction_type" => intermediate_rep.reaction_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "user_id" => intermediate_rep.user_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "user" => intermediate_rep.user.push(<models::EmojiReactionBaseUser as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing EmojiReactionBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(EmojiReactionBase {
            emoji_code: intermediate_rep.emoji_code.into_iter().next(),
            emoji_name: intermediate_rep.emoji_name.into_iter().next(),
            reaction_type: intermediate_rep.reaction_type.into_iter().next(),
            user_id: intermediate_rep.user_id.into_iter().next(),
            user: intermediate_rep.user.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<EmojiReactionBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<EmojiReactionBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<EmojiReactionBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for EmojiReactionBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<EmojiReactionBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <EmojiReactionBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into EmojiReactionBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct EmojiReactionBaseUser {
    /// ID of the user. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// Email of the user. 
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// Full name of the user. 
    #[serde(rename = "full_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<String>,

    /// Whether the user is a mirror dummy. 
    #[serde(rename = "is_mirror_dummy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_mirror_dummy: Option<bool>,

}

impl EmojiReactionBaseUser {
    pub fn new() -> EmojiReactionBaseUser {
        EmojiReactionBaseUser {
            id: None,
            email: None,
            full_name: None,
            is_mirror_dummy: None,
        }
    }
}

/// Converts the EmojiReactionBaseUser value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for EmojiReactionBaseUser {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref email) = self.email {
            params.push("email".to_string());
            params.push(email.to_string());
        }


        if let Some(ref full_name) = self.full_name {
            params.push("full_name".to_string());
            params.push(full_name.to_string());
        }


        if let Some(ref is_mirror_dummy) = self.is_mirror_dummy {
            params.push("is_mirror_dummy".to_string());
            params.push(is_mirror_dummy.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a EmojiReactionBaseUser value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for EmojiReactionBaseUser {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<isize>,
            pub email: Vec<String>,
            pub full_name: Vec<String>,
            pub is_mirror_dummy: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing EmojiReactionBaseUser".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "email" => intermediate_rep.email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "full_name" => intermediate_rep.full_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_mirror_dummy" => intermediate_rep.is_mirror_dummy.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing EmojiReactionBaseUser".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(EmojiReactionBaseUser {
            id: intermediate_rep.id.into_iter().next(),
            email: intermediate_rep.email.into_iter().next(),
            full_name: intermediate_rep.full_name.into_iter().next(),
            is_mirror_dummy: intermediate_rep.is_mirror_dummy.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<EmojiReactionBaseUser> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<EmojiReactionBaseUser>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<EmojiReactionBaseUser>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for EmojiReactionBaseUser - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<EmojiReactionBaseUser> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <EmojiReactionBaseUser as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into EmojiReactionBaseUser - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// The ID of the event.  Events appear in increasing order but may not be consecutive. 
#[derive(Debug, Clone, PartialEq, PartialOrd, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct EventIdSchema(i32);

impl std::convert::From<i32> for EventIdSchema {
    fn from(x: i32) -> Self {
        EventIdSchema(x)
    }
}

impl std::convert::From<EventIdSchema> for i32 {
    fn from(x: EventIdSchema) -> Self {
        x.0
    }
}

impl std::ops::Deref for EventIdSchema {
    type Target = i32;
    fn deref(&self) -> &i32 {
        &self.0
    }
}

impl std::ops::DerefMut for EventIdSchema {
    fn deref_mut(&mut self) -> &mut i32 {
        &mut self.0
    }
}


/// The event's type, relevant both for client-side dispatch and server-side filtering by event type in [POST /register](/api/register-queue). 
#[derive(Debug, Clone, PartialEq, PartialOrd, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct EventTypeSchema(String);

impl std::convert::From<String> for EventTypeSchema {
    fn from(x: String) -> Self {
        EventTypeSchema(x)
    }
}

impl std::string::ToString for EventTypeSchema {
    fn to_string(&self) -> String {
       self.0.to_string()
    }
}

impl std::str::FromStr for EventTypeSchema {
    type Err = std::string::ParseError;
    fn from_str(x: &str) -> std::result::Result<Self, Self::Err> {
        std::result::Result::Ok(EventTypeSchema(x.to_string()))
    }
}

impl std::convert::From<EventTypeSchema> for String {
    fn from(x: EventTypeSchema) -> Self {
        x.0
    }
}

impl std::ops::Deref for EventTypeSchema {
    type Target = String;
    fn deref(&self) -> &String {
        &self.0
    }
}

impl std::ops::DerefMut for EventTypeSchema {
    fn deref_mut(&mut self) -> &mut String {
        &mut self.0
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct GetMessages {
    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "client")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "display_recipient")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub display_recipient: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_me_message")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_me_message: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "reactions")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reactions: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "recipient_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub recipient_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_realm_str")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_realm_str: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "stream_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "subject")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "topic_links")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub topic_links: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "submessages")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub submessages: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "timestamp")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub type_: Option<swagger::Nullable<serde_json::Value>>,

    /// The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
    #[serde(rename = "flags")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub flags: Option<Vec<String>>,

    /// The UNIX timestamp for when the message was last edited, in UTC seconds. 
    #[serde(rename = "last_edit_timestamp")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub last_edit_timestamp: Option<isize>,

    /// Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    #[serde(rename = "match_content")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub match_content: Option<String>,

    /// Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    #[serde(rename = "match_subject")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub match_subject: Option<String>,

}

impl GetMessages {
    pub fn new() -> GetMessages {
        GetMessages {
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
            type_: None,
            flags: None,
            last_edit_timestamp: None,
            match_content: None,
            match_subject: None,
        }
    }
}

/// Converts the GetMessages value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for GetMessages {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping avatar_url in query parameter serialization

        // Skipping client in query parameter serialization

        // Skipping content in query parameter serialization

        // Skipping content_type in query parameter serialization

        // Skipping display_recipient in query parameter serialization

        // Skipping id in query parameter serialization

        // Skipping is_me_message in query parameter serialization

        // Skipping reactions in query parameter serialization

        // Skipping recipient_id in query parameter serialization

        // Skipping sender_email in query parameter serialization

        // Skipping sender_full_name in query parameter serialization

        // Skipping sender_id in query parameter serialization

        // Skipping sender_realm_str in query parameter serialization

        // Skipping stream_id in query parameter serialization

        // Skipping subject in query parameter serialization

        // Skipping topic_links in query parameter serialization

        // Skipping submessages in query parameter serialization

        // Skipping timestamp in query parameter serialization

        // Skipping type in query parameter serialization


        if let Some(ref flags) = self.flags {
            params.push("flags".to_string());
            params.push(flags.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }


        if let Some(ref last_edit_timestamp) = self.last_edit_timestamp {
            params.push("last_edit_timestamp".to_string());
            params.push(last_edit_timestamp.to_string());
        }


        if let Some(ref match_content) = self.match_content {
            params.push("match_content".to_string());
            params.push(match_content.to_string());
        }


        if let Some(ref match_subject) = self.match_subject {
            params.push("match_subject".to_string());
            params.push(match_subject.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a GetMessages value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for GetMessages {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub avatar_url: Vec<serde_json::Value>,
            pub client: Vec<serde_json::Value>,
            pub content: Vec<serde_json::Value>,
            pub content_type: Vec<serde_json::Value>,
            pub display_recipient: Vec<serde_json::Value>,
            pub id: Vec<serde_json::Value>,
            pub is_me_message: Vec<serde_json::Value>,
            pub reactions: Vec<serde_json::Value>,
            pub recipient_id: Vec<serde_json::Value>,
            pub sender_email: Vec<serde_json::Value>,
            pub sender_full_name: Vec<serde_json::Value>,
            pub sender_id: Vec<serde_json::Value>,
            pub sender_realm_str: Vec<serde_json::Value>,
            pub stream_id: Vec<serde_json::Value>,
            pub subject: Vec<serde_json::Value>,
            pub topic_links: Vec<serde_json::Value>,
            pub submessages: Vec<serde_json::Value>,
            pub timestamp: Vec<serde_json::Value>,
            pub type_: Vec<serde_json::Value>,
            pub flags: Vec<Vec<String>>,
            pub last_edit_timestamp: Vec<isize>,
            pub match_content: Vec<String>,
            pub match_subject: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing GetMessages".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "client" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "content" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "content_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "display_recipient" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "is_me_message" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "reactions" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "recipient_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "sender_email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "sender_full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "sender_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "sender_realm_str" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "stream_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "subject" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "topic_links" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "submessages" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "timestamp" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessages".to_string()),
                    "flags" => return std::result::Result::Err("Parsing a container in this style is not supported in GetMessages".to_string()),
                    "last_edit_timestamp" => intermediate_rep.last_edit_timestamp.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "match_content" => intermediate_rep.match_content.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "match_subject" => intermediate_rep.match_subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing GetMessages".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(GetMessages {
            avatar_url: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            client: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            content: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            content_type: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            display_recipient: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            id: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            is_me_message: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            reactions: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            recipient_id: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            sender_email: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            sender_full_name: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            sender_id: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            sender_realm_str: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            stream_id: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            subject: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            topic_links: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            submessages: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            timestamp: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            type_: std::result::Result::Err("Nullable types not supported in GetMessages".to_string())?,
            flags: intermediate_rep.flags.into_iter().next(),
            last_edit_timestamp: intermediate_rep.last_edit_timestamp.into_iter().next(),
            match_content: intermediate_rep.match_content.into_iter().next(),
            match_subject: intermediate_rep.match_subject.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<GetMessages> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<GetMessages>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<GetMessages>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for GetMessages - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<GetMessages> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <GetMessages as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into GetMessages - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct GetMessagesAllOf {
    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "client")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "display_recipient")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub display_recipient: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_me_message")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_me_message: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "reactions")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reactions: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "recipient_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub recipient_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_realm_str")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_realm_str: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "stream_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "subject")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "topic_links")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub topic_links: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "submessages")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub submessages: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "timestamp")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub type_: Option<swagger::Nullable<serde_json::Value>>,

    /// The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
    #[serde(rename = "flags")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub flags: Option<Vec<String>>,

    /// The UNIX timestamp for when the message was last edited, in UTC seconds. 
    #[serde(rename = "last_edit_timestamp")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub last_edit_timestamp: Option<isize>,

    /// Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    #[serde(rename = "match_content")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub match_content: Option<String>,

    /// Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
    #[serde(rename = "match_subject")]
    #[serde(skip_serializing_if="Option::is_none")]
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
            type_: None,
            flags: None,
            last_edit_timestamp: None,
            match_content: None,
            match_subject: None,
        }
    }
}

/// Converts the GetMessagesAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for GetMessagesAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping avatar_url in query parameter serialization

        // Skipping client in query parameter serialization

        // Skipping content in query parameter serialization

        // Skipping content_type in query parameter serialization

        // Skipping display_recipient in query parameter serialization

        // Skipping id in query parameter serialization

        // Skipping is_me_message in query parameter serialization

        // Skipping reactions in query parameter serialization

        // Skipping recipient_id in query parameter serialization

        // Skipping sender_email in query parameter serialization

        // Skipping sender_full_name in query parameter serialization

        // Skipping sender_id in query parameter serialization

        // Skipping sender_realm_str in query parameter serialization

        // Skipping stream_id in query parameter serialization

        // Skipping subject in query parameter serialization

        // Skipping topic_links in query parameter serialization

        // Skipping submessages in query parameter serialization

        // Skipping timestamp in query parameter serialization

        // Skipping type in query parameter serialization


        if let Some(ref flags) = self.flags {
            params.push("flags".to_string());
            params.push(flags.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }


        if let Some(ref last_edit_timestamp) = self.last_edit_timestamp {
            params.push("last_edit_timestamp".to_string());
            params.push(last_edit_timestamp.to_string());
        }


        if let Some(ref match_content) = self.match_content {
            params.push("match_content".to_string());
            params.push(match_content.to_string());
        }


        if let Some(ref match_subject) = self.match_subject {
            params.push("match_subject".to_string());
            params.push(match_subject.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a GetMessagesAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for GetMessagesAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub avatar_url: Vec<serde_json::Value>,
            pub client: Vec<serde_json::Value>,
            pub content: Vec<serde_json::Value>,
            pub content_type: Vec<serde_json::Value>,
            pub display_recipient: Vec<serde_json::Value>,
            pub id: Vec<serde_json::Value>,
            pub is_me_message: Vec<serde_json::Value>,
            pub reactions: Vec<serde_json::Value>,
            pub recipient_id: Vec<serde_json::Value>,
            pub sender_email: Vec<serde_json::Value>,
            pub sender_full_name: Vec<serde_json::Value>,
            pub sender_id: Vec<serde_json::Value>,
            pub sender_realm_str: Vec<serde_json::Value>,
            pub stream_id: Vec<serde_json::Value>,
            pub subject: Vec<serde_json::Value>,
            pub topic_links: Vec<serde_json::Value>,
            pub submessages: Vec<serde_json::Value>,
            pub timestamp: Vec<serde_json::Value>,
            pub type_: Vec<serde_json::Value>,
            pub flags: Vec<Vec<String>>,
            pub last_edit_timestamp: Vec<isize>,
            pub match_content: Vec<String>,
            pub match_subject: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing GetMessagesAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "client" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "content" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "content_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "display_recipient" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "is_me_message" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "reactions" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "recipient_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "sender_email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "sender_full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "sender_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "sender_realm_str" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "stream_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "subject" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "topic_links" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "submessages" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "timestamp" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in GetMessagesAllOf".to_string()),
                    "flags" => return std::result::Result::Err("Parsing a container in this style is not supported in GetMessagesAllOf".to_string()),
                    "last_edit_timestamp" => intermediate_rep.last_edit_timestamp.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "match_content" => intermediate_rep.match_content.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "match_subject" => intermediate_rep.match_subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing GetMessagesAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(GetMessagesAllOf {
            avatar_url: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            client: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            content: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            content_type: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            display_recipient: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            id: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            is_me_message: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            reactions: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            recipient_id: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            sender_email: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            sender_full_name: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            sender_id: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            sender_realm_str: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            stream_id: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            subject: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            topic_links: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            submessages: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            timestamp: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            type_: std::result::Result::Err("Nullable types not supported in GetMessagesAllOf".to_string())?,
            flags: intermediate_rep.flags.into_iter().next(),
            last_edit_timestamp: intermediate_rep.last_edit_timestamp.into_iter().next(),
            match_content: intermediate_rep.match_content.into_iter().next(),
            match_subject: intermediate_rep.match_subject.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<GetMessagesAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<GetMessagesAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<GetMessagesAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for GetMessagesAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<GetMessagesAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <GetMessagesAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into GetMessagesAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Dictionary containing details of a single hotspot. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Hotspot {
    /// The delay after which the user should be shown the hotspot. 
    #[serde(rename = "delay")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub delay: Option<f64>,

    /// The name of the hotspot. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The title of the hotspot, as will be displayed to the user. 
    #[serde(rename = "title")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub title: Option<String>,

    /// The description of the hotspot, as will be displayed to the user. 
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

}

impl Hotspot {
    pub fn new() -> Hotspot {
        Hotspot {
            delay: None,
            name: None,
            title: None,
            description: None,
        }
    }
}

/// Converts the Hotspot value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Hotspot {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref delay) = self.delay {
            params.push("delay".to_string());
            params.push(delay.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref title) = self.title {
            params.push("title".to_string());
            params.push(title.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Hotspot value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Hotspot {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub delay: Vec<f64>,
            pub name: Vec<String>,
            pub title: Vec<String>,
            pub description: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Hotspot".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "delay" => intermediate_rep.delay.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "title" => intermediate_rep.title.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Hotspot".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Hotspot {
            delay: intermediate_rep.delay.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            title: intermediate_rep.title.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Hotspot> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Hotspot>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Hotspot>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Hotspot - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Hotspot> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Hotspot as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Hotspot - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// This is an example of the JSON payload that the Zulip server will `POST` to your server 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InlineResponse200 {
    /// Email of the bot user. 
    #[serde(rename = "bot_email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_email: Option<String>,

    /// The full name of the bot user. 
    #[serde(rename = "bot_full_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_full_name: Option<String>,

    /// The message content, in raw Markdown format (not rendered to HTML). 
    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<String>,

    /// What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
    #[serde(rename = "trigger")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub trigger: Option<String>,

    /// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
    #[serde(rename = "token")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub token: Option<String>,

    /// A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
    #[serde(rename = "message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message: Option<MessagesBase>,

}

impl InlineResponse200 {
    pub fn new() -> InlineResponse200 {
        InlineResponse200 {
            bot_email: None,
            bot_full_name: None,
            data: None,
            trigger: None,
            token: None,
            message: None,
        }
    }
}

/// Converts the InlineResponse200 value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for InlineResponse200 {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref bot_email) = self.bot_email {
            params.push("bot_email".to_string());
            params.push(bot_email.to_string());
        }


        if let Some(ref bot_full_name) = self.bot_full_name {
            params.push("bot_full_name".to_string());
            params.push(bot_full_name.to_string());
        }


        if let Some(ref data) = self.data {
            params.push("data".to_string());
            params.push(data.to_string());
        }


        if let Some(ref trigger) = self.trigger {
            params.push("trigger".to_string());
            params.push(trigger.to_string());
        }


        if let Some(ref token) = self.token {
            params.push("token".to_string());
            params.push(token.to_string());
        }

        // Skipping message in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InlineResponse200 value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InlineResponse200 {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub bot_email: Vec<String>,
            pub bot_full_name: Vec<String>,
            pub data: Vec<String>,
            pub trigger: Vec<String>,
            pub token: Vec<String>,
            pub message: Vec<MessagesBase>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InlineResponse200".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "bot_email" => intermediate_rep.bot_email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "bot_full_name" => intermediate_rep.bot_full_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "data" => intermediate_rep.data.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "trigger" => intermediate_rep.trigger.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "token" => intermediate_rep.token.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "message" => intermediate_rep.message.push(<MessagesBase as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing InlineResponse200".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(InlineResponse200 {
            bot_email: intermediate_rep.bot_email.into_iter().next(),
            bot_full_name: intermediate_rep.bot_full_name.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            trigger: intermediate_rep.trigger.into_iter().next(),
            token: intermediate_rep.token.into_iter().next(),
            message: intermediate_rep.message.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<InlineResponse200> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InlineResponse200>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InlineResponse200>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InlineResponse200 - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<InlineResponse200> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InlineResponse200 as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into InlineResponse200 - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InvalidApiKeyError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

}

impl InvalidApiKeyError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> InvalidApiKeyError {
        InvalidApiKeyError {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the InvalidApiKeyError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for InvalidApiKeyError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InvalidApiKeyError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InvalidApiKeyError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InvalidApiKeyError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in InvalidApiKeyError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in InvalidApiKeyError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing InvalidApiKeyError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(InvalidApiKeyError {
            result: std::result::Result::Err("Nullable types not supported in InvalidApiKeyError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in InvalidApiKeyError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<InvalidApiKeyError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InvalidApiKeyError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InvalidApiKeyError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InvalidApiKeyError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<InvalidApiKeyError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InvalidApiKeyError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into InvalidApiKeyError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InvalidMessageError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    /// The raw content of the message. 
    #[serde(rename = "raw_content")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub raw_content: Option<String>,

}

impl InvalidMessageError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> InvalidMessageError {
        InvalidMessageError {
            result: result,
            msg: msg,
            raw_content: None,
        }
    }
}

/// Converts the InvalidMessageError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for InvalidMessageError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization


        if let Some(ref raw_content) = self.raw_content {
            params.push("raw_content".to_string());
            params.push(raw_content.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InvalidMessageError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InvalidMessageError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub raw_content: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InvalidMessageError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in InvalidMessageError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in InvalidMessageError".to_string()),
                    "raw_content" => intermediate_rep.raw_content.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing InvalidMessageError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(InvalidMessageError {
            result: std::result::Result::Err("Nullable types not supported in InvalidMessageError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in InvalidMessageError".to_string())?,
            raw_content: intermediate_rep.raw_content.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<InvalidMessageError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InvalidMessageError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InvalidMessageError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InvalidMessageError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<InvalidMessageError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InvalidMessageError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into InvalidMessageError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct InvalidMessageErrorAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    /// The raw content of the message. 
    #[serde(rename = "raw_content")]
    #[serde(skip_serializing_if="Option::is_none")]
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

/// Converts the InvalidMessageErrorAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for InvalidMessageErrorAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization


        if let Some(ref raw_content) = self.raw_content {
            params.push("raw_content".to_string());
            params.push(raw_content.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a InvalidMessageErrorAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for InvalidMessageErrorAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub raw_content: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing InvalidMessageErrorAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in InvalidMessageErrorAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in InvalidMessageErrorAllOf".to_string()),
                    "raw_content" => intermediate_rep.raw_content.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing InvalidMessageErrorAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(InvalidMessageErrorAllOf {
            result: std::result::Result::Err("Nullable types not supported in InvalidMessageErrorAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in InvalidMessageErrorAllOf".to_string())?,
            raw_content: intermediate_rep.raw_content.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<InvalidMessageErrorAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<InvalidMessageErrorAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<InvalidMessageErrorAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for InvalidMessageErrorAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<InvalidMessageErrorAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <InvalidMessageErrorAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into InvalidMessageErrorAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

}

impl JsonError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> JsonError {
        JsonError {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the JsonError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in JsonError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in JsonError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonError {
            result: std::result::Result::Err("Nullable types not supported in JsonError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in JsonError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonErrorBase {
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "result")]
    pub result: String,

    #[serde(rename = "msg")]
    pub msg: String,

}

impl JsonErrorBase {
    pub fn new(result: String, msg: String, ) -> JsonErrorBase {
        JsonErrorBase {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the JsonErrorBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonErrorBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        params.push("result".to_string());
        params.push(self.result.to_string());


        params.push("msg".to_string());
        params.push(self.msg.to_string());

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonErrorBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonErrorBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<String>,
            pub msg: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonErrorBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => intermediate_rep.result.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "msg" => intermediate_rep.msg.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonErrorBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonErrorBase {
            result: intermediate_rep.result.into_iter().next().ok_or("result missing in JsonErrorBase".to_string())?,
            msg: intermediate_rep.msg.into_iter().next().ok_or("msg missing in JsonErrorBase".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonErrorBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonErrorBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonErrorBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonErrorBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonErrorBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonErrorBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonErrorBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonErrorBaseAllOf {
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "result")]
    pub result: String,

    #[serde(rename = "msg")]
    pub msg: String,

}

impl JsonErrorBaseAllOf {
    pub fn new(result: String, msg: String, ) -> JsonErrorBaseAllOf {
        JsonErrorBaseAllOf {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the JsonErrorBaseAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonErrorBaseAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        params.push("result".to_string());
        params.push(self.result.to_string());


        params.push("msg".to_string());
        params.push(self.msg.to_string());

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonErrorBaseAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonErrorBaseAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<String>,
            pub msg: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonErrorBaseAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => intermediate_rep.result.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "msg" => intermediate_rep.msg.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonErrorBaseAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonErrorBaseAllOf {
            result: intermediate_rep.result.into_iter().next().ok_or("result missing in JsonErrorBaseAllOf".to_string())?,
            msg: intermediate_rep.msg.into_iter().next().ok_or("msg missing in JsonErrorBaseAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonErrorBaseAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonErrorBaseAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonErrorBaseAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonErrorBaseAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonErrorBaseAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonErrorBaseAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonErrorBaseAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonResponseBase {
    #[serde(rename = "result")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<String>,

}

impl JsonResponseBase {
    pub fn new() -> JsonResponseBase {
        JsonResponseBase {
            result: None,
        }
    }
}

/// Converts the JsonResponseBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonResponseBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref result) = self.result {
            params.push("result".to_string());
            params.push(result.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonResponseBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonResponseBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonResponseBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => intermediate_rep.result.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonResponseBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonResponseBase {
            result: intermediate_rep.result.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonResponseBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonResponseBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonResponseBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonResponseBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonResponseBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonResponseBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonResponseBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonSuccess {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

}

impl JsonSuccess {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> JsonSuccess {
        JsonSuccess {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the JsonSuccess value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonSuccess {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonSuccess value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonSuccess {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonSuccess".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in JsonSuccess".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in JsonSuccess".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonSuccess".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonSuccess {
            result: std::result::Result::Err("Nullable types not supported in JsonSuccess".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in JsonSuccess".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonSuccess> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonSuccess>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonSuccess>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonSuccess - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonSuccess> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonSuccess as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonSuccess - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonSuccessAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

}

impl JsonSuccessAllOf {
    pub fn new() -> JsonSuccessAllOf {
        JsonSuccessAllOf {
            result: None,
            msg: None,
        }
    }
}

/// Converts the JsonSuccessAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonSuccessAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonSuccessAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonSuccessAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonSuccessAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in JsonSuccessAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in JsonSuccessAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonSuccessAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonSuccessAllOf {
            result: std::result::Result::Err("Nullable types not supported in JsonSuccessAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in JsonSuccessAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonSuccessAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonSuccessAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonSuccessAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonSuccessAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonSuccessAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonSuccessAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonSuccessAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonSuccessBase {
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "result")]
    pub result: String,

    #[serde(rename = "msg")]
    pub msg: String,

}

impl JsonSuccessBase {
    pub fn new(result: String, msg: String, ) -> JsonSuccessBase {
        JsonSuccessBase {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the JsonSuccessBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonSuccessBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        params.push("result".to_string());
        params.push(self.result.to_string());


        params.push("msg".to_string());
        params.push(self.msg.to_string());

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonSuccessBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonSuccessBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<String>,
            pub msg: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonSuccessBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => intermediate_rep.result.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "msg" => intermediate_rep.msg.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonSuccessBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonSuccessBase {
            result: intermediate_rep.result.into_iter().next().ok_or("result missing in JsonSuccessBase".to_string())?,
            msg: intermediate_rep.msg.into_iter().next().ok_or("msg missing in JsonSuccessBase".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonSuccessBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonSuccessBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonSuccessBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonSuccessBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonSuccessBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonSuccessBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonSuccessBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct JsonSuccessBaseAllOf {
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "result")]
    pub result: String,

    #[serde(rename = "msg")]
    pub msg: String,

}

impl JsonSuccessBaseAllOf {
    pub fn new(result: String, msg: String, ) -> JsonSuccessBaseAllOf {
        JsonSuccessBaseAllOf {
            result: result,
            msg: msg,
        }
    }
}

/// Converts the JsonSuccessBaseAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for JsonSuccessBaseAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        params.push("result".to_string());
        params.push(self.result.to_string());


        params.push("msg".to_string());
        params.push(self.msg.to_string());

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a JsonSuccessBaseAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for JsonSuccessBaseAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<String>,
            pub msg: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing JsonSuccessBaseAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => intermediate_rep.result.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "msg" => intermediate_rep.msg.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing JsonSuccessBaseAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(JsonSuccessBaseAllOf {
            result: intermediate_rep.result.into_iter().next().ok_or("result missing in JsonSuccessBaseAllOf".to_string())?,
            msg: intermediate_rep.msg.into_iter().next().ok_or("msg missing in JsonSuccessBaseAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<JsonSuccessBaseAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<JsonSuccessBaseAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<JsonSuccessBaseAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for JsonSuccessBaseAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<JsonSuccessBaseAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <JsonSuccessBaseAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into JsonSuccessBaseAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Messages {
    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "client")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "display_recipient")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub display_recipient: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_me_message")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_me_message: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "reactions")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reactions: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "recipient_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub recipient_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_realm_str")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_realm_str: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "stream_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "subject")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "topic_links")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub topic_links: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "submessages")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub submessages: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "timestamp")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub type_: Option<swagger::Nullable<serde_json::Value>>,

}

impl Messages {
    pub fn new() -> Messages {
        Messages {
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
            type_: None,
        }
    }
}

/// Converts the Messages value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Messages {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping avatar_url in query parameter serialization

        // Skipping client in query parameter serialization

        // Skipping content in query parameter serialization

        // Skipping content_type in query parameter serialization

        // Skipping display_recipient in query parameter serialization

        // Skipping id in query parameter serialization

        // Skipping is_me_message in query parameter serialization

        // Skipping reactions in query parameter serialization

        // Skipping recipient_id in query parameter serialization

        // Skipping sender_email in query parameter serialization

        // Skipping sender_full_name in query parameter serialization

        // Skipping sender_id in query parameter serialization

        // Skipping sender_realm_str in query parameter serialization

        // Skipping stream_id in query parameter serialization

        // Skipping subject in query parameter serialization

        // Skipping topic_links in query parameter serialization

        // Skipping submessages in query parameter serialization

        // Skipping timestamp in query parameter serialization

        // Skipping type in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Messages value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Messages {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub avatar_url: Vec<serde_json::Value>,
            pub client: Vec<serde_json::Value>,
            pub content: Vec<serde_json::Value>,
            pub content_type: Vec<serde_json::Value>,
            pub display_recipient: Vec<serde_json::Value>,
            pub id: Vec<serde_json::Value>,
            pub is_me_message: Vec<serde_json::Value>,
            pub reactions: Vec<serde_json::Value>,
            pub recipient_id: Vec<serde_json::Value>,
            pub sender_email: Vec<serde_json::Value>,
            pub sender_full_name: Vec<serde_json::Value>,
            pub sender_id: Vec<serde_json::Value>,
            pub sender_realm_str: Vec<serde_json::Value>,
            pub stream_id: Vec<serde_json::Value>,
            pub subject: Vec<serde_json::Value>,
            pub topic_links: Vec<serde_json::Value>,
            pub submessages: Vec<serde_json::Value>,
            pub timestamp: Vec<serde_json::Value>,
            pub type_: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Messages".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "client" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "content" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "content_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "display_recipient" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "is_me_message" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "reactions" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "recipient_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "sender_email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "sender_full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "sender_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "sender_realm_str" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "stream_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "subject" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "topic_links" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "submessages" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "timestamp" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    "type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Messages".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Messages".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Messages {
            avatar_url: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            client: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            content: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            content_type: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            display_recipient: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            id: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            is_me_message: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            reactions: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            recipient_id: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            sender_email: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            sender_full_name: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            sender_id: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            sender_realm_str: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            stream_id: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            subject: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            topic_links: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            submessages: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            timestamp: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
            type_: std::result::Result::Err("Nullable types not supported in Messages".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Messages> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Messages>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Messages>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Messages - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Messages> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Messages as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Messages - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct MessagesAllOf {
    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "client")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "content_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "display_recipient")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub display_recipient: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_me_message")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_me_message: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "reactions")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reactions: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "recipient_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub recipient_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "sender_realm_str")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_realm_str: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "stream_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "subject")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "topic_links")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub topic_links: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "submessages")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub submessages: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "timestamp")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub type_: Option<swagger::Nullable<serde_json::Value>>,

}

impl MessagesAllOf {
    pub fn new() -> MessagesAllOf {
        MessagesAllOf {
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
            type_: None,
        }
    }
}

/// Converts the MessagesAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for MessagesAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping avatar_url in query parameter serialization

        // Skipping client in query parameter serialization

        // Skipping content in query parameter serialization

        // Skipping content_type in query parameter serialization

        // Skipping display_recipient in query parameter serialization

        // Skipping id in query parameter serialization

        // Skipping is_me_message in query parameter serialization

        // Skipping reactions in query parameter serialization

        // Skipping recipient_id in query parameter serialization

        // Skipping sender_email in query parameter serialization

        // Skipping sender_full_name in query parameter serialization

        // Skipping sender_id in query parameter serialization

        // Skipping sender_realm_str in query parameter serialization

        // Skipping stream_id in query parameter serialization

        // Skipping subject in query parameter serialization

        // Skipping topic_links in query parameter serialization

        // Skipping submessages in query parameter serialization

        // Skipping timestamp in query parameter serialization

        // Skipping type in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a MessagesAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for MessagesAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub avatar_url: Vec<serde_json::Value>,
            pub client: Vec<serde_json::Value>,
            pub content: Vec<serde_json::Value>,
            pub content_type: Vec<serde_json::Value>,
            pub display_recipient: Vec<serde_json::Value>,
            pub id: Vec<serde_json::Value>,
            pub is_me_message: Vec<serde_json::Value>,
            pub reactions: Vec<serde_json::Value>,
            pub recipient_id: Vec<serde_json::Value>,
            pub sender_email: Vec<serde_json::Value>,
            pub sender_full_name: Vec<serde_json::Value>,
            pub sender_id: Vec<serde_json::Value>,
            pub sender_realm_str: Vec<serde_json::Value>,
            pub stream_id: Vec<serde_json::Value>,
            pub subject: Vec<serde_json::Value>,
            pub topic_links: Vec<serde_json::Value>,
            pub submessages: Vec<serde_json::Value>,
            pub timestamp: Vec<serde_json::Value>,
            pub type_: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing MessagesAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "client" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "content" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "content_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "display_recipient" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "is_me_message" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "reactions" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "recipient_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "sender_email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "sender_full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "sender_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "sender_realm_str" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "stream_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "subject" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "topic_links" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "submessages" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "timestamp" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    "type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing MessagesAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(MessagesAllOf {
            avatar_url: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            client: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            content: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            content_type: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            display_recipient: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            id: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            is_me_message: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            reactions: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            recipient_id: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            sender_email: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            sender_full_name: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            sender_id: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            sender_realm_str: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            stream_id: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            subject: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            topic_links: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            submessages: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            timestamp: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
            type_: std::result::Result::Err("Nullable types not supported in MessagesAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<MessagesAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<MessagesAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<MessagesAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for MessagesAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<MessagesAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <MessagesAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into MessagesAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing details of the message. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct MessagesBase {
    /// The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<String>>,

    /// A Zulip \"client\" string, describing what Zulip client sent the message. 
    #[serde(rename = "client")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<String>,

    /// The content/body of the message. 
    #[serde(rename = "content")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content: Option<String>,

    /// The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
    #[serde(rename = "content_type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub content_type: Option<String>,

    /// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
    #[serde(rename = "display_recipient")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub display_recipient: Option<swagger::OneOf2<String,Vec<serde_json::Value>>>,

    /// The unique message ID.  Messages should always be displayed sorted by ID. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
    #[serde(rename = "is_me_message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_me_message: Option<bool>,

    /// Data on any reactions to the message. 
    #[serde(rename = "reactions")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub reactions: Option<Vec<models::EmojiReaction>>,

    /// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
    #[serde(rename = "recipient_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub recipient_id: Option<isize>,

    /// The Zulip display email address of the message's sender. 
    #[serde(rename = "sender_email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_email: Option<String>,

    /// The full name of the message's sender. 
    #[serde(rename = "sender_full_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_full_name: Option<String>,

    /// The user ID of the message's sender. 
    #[serde(rename = "sender_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_id: Option<isize>,

    /// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
    #[serde(rename = "sender_realm_str")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub sender_realm_str: Option<String>,

    /// Only present for stream messages; the ID of the stream. 
    #[serde(rename = "stream_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<isize>,

    /// The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
    #[serde(rename = "subject")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
    #[serde(rename = "topic_links")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub topic_links: Option<Vec<models::MessagesBaseTopicLinks>>,

    /// Data used for certain experimental Zulip integrations. 
    #[serde(rename = "submessages")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub submessages: Option<Vec<String>>,

    /// The UNIX timestamp for when the message was sent, in UTC seconds. 
    #[serde(rename = "timestamp")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp: Option<isize>,

    /// The type of the message: `stream` or `private`. 
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub type_: Option<String>,

}

impl MessagesBase {
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
            type_: None,
        }
    }
}

/// Converts the MessagesBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for MessagesBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref avatar_url) = self.avatar_url {
            params.push("avatar_url".to_string());
            params.push(avatar_url.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref client) = self.client {
            params.push("client".to_string());
            params.push(client.to_string());
        }


        if let Some(ref content) = self.content {
            params.push("content".to_string());
            params.push(content.to_string());
        }


        if let Some(ref content_type) = self.content_type {
            params.push("content_type".to_string());
            params.push(content_type.to_string());
        }

        // Skipping display_recipient in query parameter serialization


        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref is_me_message) = self.is_me_message {
            params.push("is_me_message".to_string());
            params.push(is_me_message.to_string());
        }

        // Skipping reactions in query parameter serialization


        if let Some(ref recipient_id) = self.recipient_id {
            params.push("recipient_id".to_string());
            params.push(recipient_id.to_string());
        }


        if let Some(ref sender_email) = self.sender_email {
            params.push("sender_email".to_string());
            params.push(sender_email.to_string());
        }


        if let Some(ref sender_full_name) = self.sender_full_name {
            params.push("sender_full_name".to_string());
            params.push(sender_full_name.to_string());
        }


        if let Some(ref sender_id) = self.sender_id {
            params.push("sender_id".to_string());
            params.push(sender_id.to_string());
        }


        if let Some(ref sender_realm_str) = self.sender_realm_str {
            params.push("sender_realm_str".to_string());
            params.push(sender_realm_str.to_string());
        }


        if let Some(ref stream_id) = self.stream_id {
            params.push("stream_id".to_string());
            params.push(stream_id.to_string());
        }


        if let Some(ref subject) = self.subject {
            params.push("subject".to_string());
            params.push(subject.to_string());
        }

        // Skipping topic_links in query parameter serialization


        if let Some(ref submessages) = self.submessages {
            params.push("submessages".to_string());
            params.push(submessages.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }


        if let Some(ref timestamp) = self.timestamp {
            params.push("timestamp".to_string());
            params.push(timestamp.to_string());
        }


        if let Some(ref type_) = self.type_ {
            params.push("type".to_string());
            params.push(type_.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a MessagesBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for MessagesBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub avatar_url: Vec<String>,
            pub client: Vec<String>,
            pub content: Vec<String>,
            pub content_type: Vec<String>,
            pub display_recipient: Vec<swagger::OneOf2<String,Vec<serde_json::Value>>>,
            pub id: Vec<isize>,
            pub is_me_message: Vec<bool>,
            pub reactions: Vec<Vec<models::EmojiReaction>>,
            pub recipient_id: Vec<isize>,
            pub sender_email: Vec<String>,
            pub sender_full_name: Vec<String>,
            pub sender_id: Vec<isize>,
            pub sender_realm_str: Vec<String>,
            pub stream_id: Vec<isize>,
            pub subject: Vec<String>,
            pub topic_links: Vec<Vec<models::MessagesBaseTopicLinks>>,
            pub submessages: Vec<Vec<String>>,
            pub timestamp: Vec<isize>,
            pub type_: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing MessagesBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MessagesBase".to_string()),
                    "client" => intermediate_rep.client.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "content" => intermediate_rep.content.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "content_type" => intermediate_rep.content_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "display_recipient" => intermediate_rep.display_recipient.push(<swagger::OneOf2<String,Vec<serde_json::Value>> as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_me_message" => intermediate_rep.is_me_message.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "reactions" => return std::result::Result::Err("Parsing a container in this style is not supported in MessagesBase".to_string()),
                    "recipient_id" => intermediate_rep.recipient_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "sender_email" => intermediate_rep.sender_email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "sender_full_name" => intermediate_rep.sender_full_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "sender_id" => intermediate_rep.sender_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "sender_realm_str" => intermediate_rep.sender_realm_str.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "stream_id" => intermediate_rep.stream_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "topic_links" => return std::result::Result::Err("Parsing a container in this style is not supported in MessagesBase".to_string()),
                    "submessages" => return std::result::Result::Err("Parsing a container in this style is not supported in MessagesBase".to_string()),
                    "timestamp" => intermediate_rep.timestamp.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "type" => intermediate_rep.type_.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing MessagesBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(MessagesBase {
            avatar_url: std::result::Result::Err("Nullable types not supported in MessagesBase".to_string())?,
            client: intermediate_rep.client.into_iter().next(),
            content: intermediate_rep.content.into_iter().next(),
            content_type: intermediate_rep.content_type.into_iter().next(),
            display_recipient: intermediate_rep.display_recipient.into_iter().next(),
            id: intermediate_rep.id.into_iter().next(),
            is_me_message: intermediate_rep.is_me_message.into_iter().next(),
            reactions: intermediate_rep.reactions.into_iter().next(),
            recipient_id: intermediate_rep.recipient_id.into_iter().next(),
            sender_email: intermediate_rep.sender_email.into_iter().next(),
            sender_full_name: intermediate_rep.sender_full_name.into_iter().next(),
            sender_id: intermediate_rep.sender_id.into_iter().next(),
            sender_realm_str: intermediate_rep.sender_realm_str.into_iter().next(),
            stream_id: intermediate_rep.stream_id.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            topic_links: intermediate_rep.topic_links.into_iter().next(),
            submessages: intermediate_rep.submessages.into_iter().next(),
            timestamp: intermediate_rep.timestamp.into_iter().next(),
            type_: intermediate_rep.type_.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<MessagesBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<MessagesBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<MessagesBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for MessagesBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<MessagesBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <MessagesBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into MessagesBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct MessagesBaseTopicLinks {
    /// The original link text present in the topic. 
    #[serde(rename = "text")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub text: Option<String>,

    /// The expanded target url which the link points to. 
    #[serde(rename = "url")]
    #[serde(skip_serializing_if="Option::is_none")]
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

/// Converts the MessagesBaseTopicLinks value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for MessagesBaseTopicLinks {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref text) = self.text {
            params.push("text".to_string());
            params.push(text.to_string());
        }


        if let Some(ref url) = self.url {
            params.push("url".to_string());
            params.push(url.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a MessagesBaseTopicLinks value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for MessagesBaseTopicLinks {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub text: Vec<String>,
            pub url: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing MessagesBaseTopicLinks".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "text" => intermediate_rep.text.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "url" => intermediate_rep.url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing MessagesBaseTopicLinks".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(MessagesBaseTopicLinks {
            text: intermediate_rep.text.into_iter().next(),
            url: intermediate_rep.url.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<MessagesBaseTopicLinks> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<MessagesBaseTopicLinks>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<MessagesBaseTopicLinks>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for MessagesBaseTopicLinks - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<MessagesBaseTopicLinks> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <MessagesBaseTopicLinks as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into MessagesBaseTopicLinks - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct MissingArgumentError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

    /// It contains the information about the missing parameter. 
    #[serde(rename = "var_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub var_name: Option<String>,

}

impl MissingArgumentError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> MissingArgumentError {
        MissingArgumentError {
            result: result,
            msg: msg,
            code: None,
            var_name: None,
        }
    }
}

/// Converts the MissingArgumentError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for MissingArgumentError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization


        if let Some(ref var_name) = self.var_name {
            params.push("var_name".to_string());
            params.push(var_name.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a MissingArgumentError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for MissingArgumentError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
            pub var_name: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing MissingArgumentError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MissingArgumentError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MissingArgumentError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MissingArgumentError".to_string()),
                    "var_name" => intermediate_rep.var_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing MissingArgumentError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(MissingArgumentError {
            result: std::result::Result::Err("Nullable types not supported in MissingArgumentError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in MissingArgumentError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in MissingArgumentError".to_string())?,
            var_name: intermediate_rep.var_name.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<MissingArgumentError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<MissingArgumentError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<MissingArgumentError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for MissingArgumentError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<MissingArgumentError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <MissingArgumentError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into MissingArgumentError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct MissingArgumentErrorAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

    /// It contains the information about the missing parameter. 
    #[serde(rename = "var_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub var_name: Option<String>,

}

impl MissingArgumentErrorAllOf {
    pub fn new() -> MissingArgumentErrorAllOf {
        MissingArgumentErrorAllOf {
            result: None,
            msg: None,
            code: None,
            var_name: None,
        }
    }
}

/// Converts the MissingArgumentErrorAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for MissingArgumentErrorAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization


        if let Some(ref var_name) = self.var_name {
            params.push("var_name".to_string());
            params.push(var_name.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a MissingArgumentErrorAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for MissingArgumentErrorAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
            pub var_name: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing MissingArgumentErrorAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MissingArgumentErrorAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MissingArgumentErrorAllOf".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in MissingArgumentErrorAllOf".to_string()),
                    "var_name" => intermediate_rep.var_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing MissingArgumentErrorAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(MissingArgumentErrorAllOf {
            result: std::result::Result::Err("Nullable types not supported in MissingArgumentErrorAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in MissingArgumentErrorAllOf".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in MissingArgumentErrorAllOf".to_string())?,
            var_name: intermediate_rep.var_name.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<MissingArgumentErrorAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<MissingArgumentErrorAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<MissingArgumentErrorAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for MissingArgumentErrorAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<MissingArgumentErrorAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <MissingArgumentErrorAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into MissingArgumentErrorAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct NonExistingStreamError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

    /// The name of the stream that could not be found. 
    #[serde(rename = "stream")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream: Option<String>,

}

impl NonExistingStreamError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> NonExistingStreamError {
        NonExistingStreamError {
            result: result,
            msg: msg,
            code: None,
            stream: None,
        }
    }
}

/// Converts the NonExistingStreamError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for NonExistingStreamError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization


        if let Some(ref stream) = self.stream {
            params.push("stream".to_string());
            params.push(stream.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a NonExistingStreamError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for NonExistingStreamError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
            pub stream: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing NonExistingStreamError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in NonExistingStreamError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in NonExistingStreamError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in NonExistingStreamError".to_string()),
                    "stream" => intermediate_rep.stream.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing NonExistingStreamError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(NonExistingStreamError {
            result: std::result::Result::Err("Nullable types not supported in NonExistingStreamError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in NonExistingStreamError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in NonExistingStreamError".to_string())?,
            stream: intermediate_rep.stream.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<NonExistingStreamError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<NonExistingStreamError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<NonExistingStreamError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for NonExistingStreamError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<NonExistingStreamError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <NonExistingStreamError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into NonExistingStreamError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct NonExistingStreamErrorAllOf {
    #[serde(rename = "result")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub result: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "msg")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub msg: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

    /// The name of the stream that could not be found. 
    #[serde(rename = "stream")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream: Option<String>,

}

impl NonExistingStreamErrorAllOf {
    pub fn new() -> NonExistingStreamErrorAllOf {
        NonExistingStreamErrorAllOf {
            result: None,
            msg: None,
            code: None,
            stream: None,
        }
    }
}

/// Converts the NonExistingStreamErrorAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for NonExistingStreamErrorAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization


        if let Some(ref stream) = self.stream {
            params.push("stream".to_string());
            params.push(stream.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a NonExistingStreamErrorAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for NonExistingStreamErrorAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
            pub stream: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing NonExistingStreamErrorAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in NonExistingStreamErrorAllOf".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in NonExistingStreamErrorAllOf".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in NonExistingStreamErrorAllOf".to_string()),
                    "stream" => intermediate_rep.stream.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing NonExistingStreamErrorAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(NonExistingStreamErrorAllOf {
            result: std::result::Result::Err("Nullable types not supported in NonExistingStreamErrorAllOf".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in NonExistingStreamErrorAllOf".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in NonExistingStreamErrorAllOf".to_string())?,
            stream: intermediate_rep.stream.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<NonExistingStreamErrorAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<NonExistingStreamErrorAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<NonExistingStreamErrorAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for NonExistingStreamErrorAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<NonExistingStreamErrorAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <NonExistingStreamErrorAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into NonExistingStreamErrorAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Presence {
    /// The client's platform name. 
    #[serde(rename = "client")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub client: Option<String>,

    /// The status of the user on this client. It is either `idle` or `active`. 
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "status")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub status: Option<String>,

    /// The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
    #[serde(rename = "timestamp")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timestamp: Option<isize>,

    /// Whether the client is capable of showing mobile/push notifications to the user. 
    #[serde(rename = "pushable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pushable: Option<bool>,

}

impl Presence {
    pub fn new() -> Presence {
        Presence {
            client: None,
            status: None,
            timestamp: None,
            pushable: None,
        }
    }
}

/// Converts the Presence value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Presence {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref client) = self.client {
            params.push("client".to_string());
            params.push(client.to_string());
        }


        if let Some(ref status) = self.status {
            params.push("status".to_string());
            params.push(status.to_string());
        }


        if let Some(ref timestamp) = self.timestamp {
            params.push("timestamp".to_string());
            params.push(timestamp.to_string());
        }


        if let Some(ref pushable) = self.pushable {
            params.push("pushable".to_string());
            params.push(pushable.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Presence value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Presence {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub client: Vec<String>,
            pub status: Vec<String>,
            pub timestamp: Vec<isize>,
            pub pushable: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Presence".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "client" => intermediate_rep.client.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "status" => intermediate_rep.status.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "timestamp" => intermediate_rep.timestamp.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "pushable" => intermediate_rep.pushable.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Presence".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Presence {
            client: intermediate_rep.client.into_iter().next(),
            status: intermediate_rep.status.into_iter().next(),
            timestamp: intermediate_rep.timestamp.into_iter().next(),
            pushable: intermediate_rep.pushable.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Presence> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Presence>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Presence>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Presence - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Presence> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Presence as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Presence - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct RateLimitedError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

}

impl RateLimitedError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> RateLimitedError {
        RateLimitedError {
            result: result,
            msg: msg,
            code: None,
        }
    }
}

/// Converts the RateLimitedError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for RateLimitedError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a RateLimitedError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for RateLimitedError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing RateLimitedError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RateLimitedError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RateLimitedError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RateLimitedError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing RateLimitedError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(RateLimitedError {
            result: std::result::Result::Err("Nullable types not supported in RateLimitedError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in RateLimitedError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in RateLimitedError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<RateLimitedError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<RateLimitedError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<RateLimitedError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for RateLimitedError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<RateLimitedError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <RateLimitedError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into RateLimitedError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct RealmDeactivatedError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

}

impl RealmDeactivatedError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> RealmDeactivatedError {
        RealmDeactivatedError {
            result: result,
            msg: msg,
            code: None,
        }
    }
}

/// Converts the RealmDeactivatedError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for RealmDeactivatedError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a RealmDeactivatedError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for RealmDeactivatedError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing RealmDeactivatedError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmDeactivatedError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmDeactivatedError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmDeactivatedError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing RealmDeactivatedError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(RealmDeactivatedError {
            result: std::result::Result::Err("Nullable types not supported in RealmDeactivatedError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in RealmDeactivatedError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in RealmDeactivatedError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<RealmDeactivatedError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<RealmDeactivatedError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<RealmDeactivatedError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for RealmDeactivatedError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<RealmDeactivatedError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <RealmDeactivatedError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into RealmDeactivatedError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing details of the newly added domain. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct RealmDomain {
    /// The new allowed domain. 
    #[serde(rename = "domain")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub domain: Option<String>,

    /// Whether subdomains are allowed for this domain. 
    #[serde(rename = "allow_subdomains")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub allow_subdomains: Option<bool>,

}

impl RealmDomain {
    pub fn new() -> RealmDomain {
        RealmDomain {
            domain: None,
            allow_subdomains: None,
        }
    }
}

/// Converts the RealmDomain value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for RealmDomain {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref domain) = self.domain {
            params.push("domain".to_string());
            params.push(domain.to_string());
        }


        if let Some(ref allow_subdomains) = self.allow_subdomains {
            params.push("allow_subdomains".to_string());
            params.push(allow_subdomains.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a RealmDomain value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for RealmDomain {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub domain: Vec<String>,
            pub allow_subdomains: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing RealmDomain".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "domain" => intermediate_rep.domain.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "allow_subdomains" => intermediate_rep.allow_subdomains.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing RealmDomain".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(RealmDomain {
            domain: intermediate_rep.domain.into_iter().next(),
            allow_subdomains: intermediate_rep.allow_subdomains.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<RealmDomain> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<RealmDomain>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<RealmDomain>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for RealmDomain - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<RealmDomain> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <RealmDomain as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into RealmDomain - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct RealmEmoji {
    /// The ID for this emoji, same as the object's key. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<String>,

    /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The path relative to the organization's URL where the emoji's image can be found. 
    #[serde(rename = "source_url")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub source_url: Option<String>,

    /// Whether the emoji has been deactivated or not. 
    #[serde(rename = "deactivated")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub deactivated: Option<bool>,

    /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
    #[serde(rename = "author_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub author_id: Option<swagger::Nullable<isize>>,

}

impl RealmEmoji {
    pub fn new() -> RealmEmoji {
        RealmEmoji {
            id: None,
            name: None,
            source_url: None,
            deactivated: None,
            author_id: None,
        }
    }
}

/// Converts the RealmEmoji value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for RealmEmoji {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref source_url) = self.source_url {
            params.push("source_url".to_string());
            params.push(source_url.to_string());
        }


        if let Some(ref deactivated) = self.deactivated {
            params.push("deactivated".to_string());
            params.push(deactivated.to_string());
        }


        if let Some(ref author_id) = self.author_id {
            params.push("author_id".to_string());
            params.push(author_id.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a RealmEmoji value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for RealmEmoji {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<String>,
            pub name: Vec<String>,
            pub source_url: Vec<String>,
            pub deactivated: Vec<bool>,
            pub author_id: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing RealmEmoji".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "source_url" => intermediate_rep.source_url.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "deactivated" => intermediate_rep.deactivated.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "author_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmEmoji".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing RealmEmoji".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(RealmEmoji {
            id: intermediate_rep.id.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            source_url: intermediate_rep.source_url.into_iter().next(),
            deactivated: intermediate_rep.deactivated.into_iter().next(),
            author_id: std::result::Result::Err("Nullable types not supported in RealmEmoji".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<RealmEmoji> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<RealmEmoji>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<RealmEmoji>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for RealmEmoji - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<RealmEmoji> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <RealmEmoji as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into RealmEmoji - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing details about a realm export. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct RealmExport {
    /// The id of the export. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// The id of the user who did the export. 
    #[serde(rename = "acting_user_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub acting_user_id: Option<isize>,

    /// The UNIX timestamp of when the export was made. 
    #[serde(rename = "export_time")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub export_time: Option<f64>,

    /// The timestamp of when the export was deleted. Null if it wasn't. 
    #[serde(rename = "deleted_timestamp")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub deleted_timestamp: Option<swagger::Nullable<f64>>,

    /// The timestamp of when the export failed. Null if it didn't. 
    #[serde(rename = "failed_timestamp")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub failed_timestamp: Option<swagger::Nullable<f64>>,

    /// The URL of the export. `null` if there's no URL. 
    #[serde(rename = "export_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub export_url: Option<swagger::Nullable<String>>,

    /// Whether the export is pending or not. 
    #[serde(rename = "pending")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pending: Option<bool>,

}

impl RealmExport {
    pub fn new() -> RealmExport {
        RealmExport {
            id: None,
            acting_user_id: None,
            export_time: None,
            deleted_timestamp: None,
            failed_timestamp: None,
            export_url: None,
            pending: None,
        }
    }
}

/// Converts the RealmExport value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for RealmExport {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref acting_user_id) = self.acting_user_id {
            params.push("acting_user_id".to_string());
            params.push(acting_user_id.to_string());
        }


        if let Some(ref export_time) = self.export_time {
            params.push("export_time".to_string());
            params.push(export_time.to_string());
        }


        if let Some(ref deleted_timestamp) = self.deleted_timestamp {
            params.push("deleted_timestamp".to_string());
            params.push(deleted_timestamp.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref failed_timestamp) = self.failed_timestamp {
            params.push("failed_timestamp".to_string());
            params.push(failed_timestamp.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref export_url) = self.export_url {
            params.push("export_url".to_string());
            params.push(export_url.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref pending) = self.pending {
            params.push("pending".to_string());
            params.push(pending.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a RealmExport value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for RealmExport {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<isize>,
            pub acting_user_id: Vec<isize>,
            pub export_time: Vec<f64>,
            pub deleted_timestamp: Vec<f64>,
            pub failed_timestamp: Vec<f64>,
            pub export_url: Vec<String>,
            pub pending: Vec<bool>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing RealmExport".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "acting_user_id" => intermediate_rep.acting_user_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "export_time" => intermediate_rep.export_time.push(<f64 as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "deleted_timestamp" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmExport".to_string()),
                    "failed_timestamp" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmExport".to_string()),
                    "export_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in RealmExport".to_string()),
                    "pending" => intermediate_rep.pending.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing RealmExport".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(RealmExport {
            id: intermediate_rep.id.into_iter().next(),
            acting_user_id: intermediate_rep.acting_user_id.into_iter().next(),
            export_time: intermediate_rep.export_time.into_iter().next(),
            deleted_timestamp: std::result::Result::Err("Nullable types not supported in RealmExport".to_string())?,
            failed_timestamp: std::result::Result::Err("Nullable types not supported in RealmExport".to_string())?,
            export_url: std::result::Result::Err("Nullable types not supported in RealmExport".to_string())?,
            pending: intermediate_rep.pending.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<RealmExport> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<RealmExport>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<RealmExport>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for RealmExport - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<RealmExport> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <RealmExport as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into RealmExport - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing details about a realm playground. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct RealmPlayground {
    /// The unique ID for the realm playground. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

    /// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The name of the Pygments language lexer for that programming language. 
    #[serde(rename = "pygments_language")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pygments_language: Option<String>,

    /// The url prefix for the playground. 
    #[serde(rename = "url_prefix")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub url_prefix: Option<String>,

}

impl RealmPlayground {
    pub fn new() -> RealmPlayground {
        RealmPlayground {
            id: None,
            name: None,
            pygments_language: None,
            url_prefix: None,
        }
    }
}

/// Converts the RealmPlayground value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for RealmPlayground {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref pygments_language) = self.pygments_language {
            params.push("pygments_language".to_string());
            params.push(pygments_language.to_string());
        }


        if let Some(ref url_prefix) = self.url_prefix {
            params.push("url_prefix".to_string());
            params.push(url_prefix.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a RealmPlayground value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for RealmPlayground {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub id: Vec<isize>,
            pub name: Vec<String>,
            pub pygments_language: Vec<String>,
            pub url_prefix: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing RealmPlayground".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "pygments_language" => intermediate_rep.pygments_language.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "url_prefix" => intermediate_rep.url_prefix.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing RealmPlayground".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(RealmPlayground {
            id: intermediate_rep.id.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            pygments_language: intermediate_rep.pygments_language.into_iter().next(),
            url_prefix: intermediate_rep.url_prefix.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<RealmPlayground> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<RealmPlayground>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<RealmPlayground>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for RealmPlayground - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<RealmPlayground> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <RealmPlayground as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into RealmPlayground - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Subscriptions {
    /// The unique ID of a stream. 
    #[serde(rename = "stream_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_id: Option<isize>,

    /// The name of a stream. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
    #[serde(rename = "rendered_description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub rendered_description: Option<String>,

    /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
    #[serde(rename = "date_created")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_created: Option<isize>,

    /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
    #[serde(rename = "invite_only")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub invite_only: Option<bool>,

    /// A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
    #[serde(rename = "subscribers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subscribers: Option<Vec<i32>>,

    /// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
    #[serde(rename = "desktop_notifications")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub desktop_notifications: Option<swagger::Nullable<bool>>,

    /// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
    #[serde(rename = "email_notifications")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email_notifications: Option<swagger::Nullable<bool>>,

    /// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
    #[serde(rename = "wildcard_mentions_notify")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub wildcard_mentions_notify: Option<swagger::Nullable<bool>>,

    /// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
    #[serde(rename = "push_notifications")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub push_notifications: Option<swagger::Nullable<bool>>,

    /// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
    #[serde(rename = "audible_notifications")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub audible_notifications: Option<swagger::Nullable<bool>>,

    /// A boolean specifying whether the given stream has been pinned to the top. 
    #[serde(rename = "pin_to_top")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub pin_to_top: Option<bool>,

    /// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
    #[serde(rename = "email_address")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email_address: Option<String>,

    /// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
    #[serde(rename = "is_muted")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_muted: Option<bool>,

    /// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
    #[serde(rename = "in_home_view")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub in_home_view: Option<bool>,

    /// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
    #[serde(rename = "is_announcement_only")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_announcement_only: Option<bool>,

    /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
    #[serde(rename = "is_web_public")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_web_public: Option<bool>,

    /// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "role")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub role: Option<isize>,

    /// The user's personal color for the stream. 
    #[serde(rename = "color")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub color: Option<String>,

    /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
    #[serde(rename = "stream_post_policy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_post_policy: Option<isize>,

    /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
    #[serde(rename = "message_retention_days")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub message_retention_days: Option<swagger::Nullable<isize>>,

    /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
    #[serde(rename = "history_public_to_subscribers")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub history_public_to_subscribers: Option<bool>,

    /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
    #[serde(rename = "first_message_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub first_message_id: Option<swagger::Nullable<isize>>,

    /// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
    #[serde(rename = "stream_weekly_traffic")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stream_weekly_traffic: Option<swagger::Nullable<isize>>,

}

impl Subscriptions {
    pub fn new() -> Subscriptions {
        Subscriptions {
            stream_id: None,
            name: None,
            description: None,
            rendered_description: None,
            date_created: None,
            invite_only: None,
            subscribers: None,
            desktop_notifications: None,
            email_notifications: None,
            wildcard_mentions_notify: None,
            push_notifications: None,
            audible_notifications: None,
            pin_to_top: None,
            email_address: None,
            is_muted: None,
            in_home_view: None,
            is_announcement_only: None,
            is_web_public: None,
            role: None,
            color: None,
            stream_post_policy: None,
            message_retention_days: None,
            history_public_to_subscribers: None,
            first_message_id: None,
            stream_weekly_traffic: None,
        }
    }
}

/// Converts the Subscriptions value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Subscriptions {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref stream_id) = self.stream_id {
            params.push("stream_id".to_string());
            params.push(stream_id.to_string());
        }


        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }


        if let Some(ref rendered_description) = self.rendered_description {
            params.push("rendered_description".to_string());
            params.push(rendered_description.to_string());
        }


        if let Some(ref date_created) = self.date_created {
            params.push("date_created".to_string());
            params.push(date_created.to_string());
        }


        if let Some(ref invite_only) = self.invite_only {
            params.push("invite_only".to_string());
            params.push(invite_only.to_string());
        }


        if let Some(ref subscribers) = self.subscribers {
            params.push("subscribers".to_string());
            params.push(subscribers.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }


        if let Some(ref desktop_notifications) = self.desktop_notifications {
            params.push("desktop_notifications".to_string());
            params.push(desktop_notifications.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref email_notifications) = self.email_notifications {
            params.push("email_notifications".to_string());
            params.push(email_notifications.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref wildcard_mentions_notify) = self.wildcard_mentions_notify {
            params.push("wildcard_mentions_notify".to_string());
            params.push(wildcard_mentions_notify.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref push_notifications) = self.push_notifications {
            params.push("push_notifications".to_string());
            params.push(push_notifications.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref audible_notifications) = self.audible_notifications {
            params.push("audible_notifications".to_string());
            params.push(audible_notifications.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref pin_to_top) = self.pin_to_top {
            params.push("pin_to_top".to_string());
            params.push(pin_to_top.to_string());
        }


        if let Some(ref email_address) = self.email_address {
            params.push("email_address".to_string());
            params.push(email_address.to_string());
        }


        if let Some(ref is_muted) = self.is_muted {
            params.push("is_muted".to_string());
            params.push(is_muted.to_string());
        }


        if let Some(ref in_home_view) = self.in_home_view {
            params.push("in_home_view".to_string());
            params.push(in_home_view.to_string());
        }


        if let Some(ref is_announcement_only) = self.is_announcement_only {
            params.push("is_announcement_only".to_string());
            params.push(is_announcement_only.to_string());
        }


        if let Some(ref is_web_public) = self.is_web_public {
            params.push("is_web_public".to_string());
            params.push(is_web_public.to_string());
        }


        if let Some(ref role) = self.role {
            params.push("role".to_string());
            params.push(role.to_string());
        }


        if let Some(ref color) = self.color {
            params.push("color".to_string());
            params.push(color.to_string());
        }


        if let Some(ref stream_post_policy) = self.stream_post_policy {
            params.push("stream_post_policy".to_string());
            params.push(stream_post_policy.to_string());
        }


        if let Some(ref message_retention_days) = self.message_retention_days {
            params.push("message_retention_days".to_string());
            params.push(message_retention_days.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref history_public_to_subscribers) = self.history_public_to_subscribers {
            params.push("history_public_to_subscribers".to_string());
            params.push(history_public_to_subscribers.to_string());
        }


        if let Some(ref first_message_id) = self.first_message_id {
            params.push("first_message_id".to_string());
            params.push(first_message_id.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref stream_weekly_traffic) = self.stream_weekly_traffic {
            params.push("stream_weekly_traffic".to_string());
            params.push(stream_weekly_traffic.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Subscriptions value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Subscriptions {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub stream_id: Vec<isize>,
            pub name: Vec<String>,
            pub description: Vec<String>,
            pub rendered_description: Vec<String>,
            pub date_created: Vec<isize>,
            pub invite_only: Vec<bool>,
            pub subscribers: Vec<Vec<i32>>,
            pub desktop_notifications: Vec<bool>,
            pub email_notifications: Vec<bool>,
            pub wildcard_mentions_notify: Vec<bool>,
            pub push_notifications: Vec<bool>,
            pub audible_notifications: Vec<bool>,
            pub pin_to_top: Vec<bool>,
            pub email_address: Vec<String>,
            pub is_muted: Vec<bool>,
            pub in_home_view: Vec<bool>,
            pub is_announcement_only: Vec<bool>,
            pub is_web_public: Vec<bool>,
            pub role: Vec<isize>,
            pub color: Vec<String>,
            pub stream_post_policy: Vec<isize>,
            pub message_retention_days: Vec<isize>,
            pub history_public_to_subscribers: Vec<bool>,
            pub first_message_id: Vec<isize>,
            pub stream_weekly_traffic: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Subscriptions".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "stream_id" => intermediate_rep.stream_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "rendered_description" => intermediate_rep.rendered_description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "date_created" => intermediate_rep.date_created.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "invite_only" => intermediate_rep.invite_only.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "subscribers" => return std::result::Result::Err("Parsing a container in this style is not supported in Subscriptions".to_string()),
                    "desktop_notifications" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "email_notifications" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "wildcard_mentions_notify" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "push_notifications" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "audible_notifications" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "pin_to_top" => intermediate_rep.pin_to_top.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "email_address" => intermediate_rep.email_address.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_muted" => intermediate_rep.is_muted.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "in_home_view" => intermediate_rep.in_home_view.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_announcement_only" => intermediate_rep.is_announcement_only.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_web_public" => intermediate_rep.is_web_public.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "role" => intermediate_rep.role.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "color" => intermediate_rep.color.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "stream_post_policy" => intermediate_rep.stream_post_policy.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "message_retention_days" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "history_public_to_subscribers" => intermediate_rep.history_public_to_subscribers.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "first_message_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    "stream_weekly_traffic" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Subscriptions".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Subscriptions".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Subscriptions {
            stream_id: intermediate_rep.stream_id.into_iter().next(),
            name: intermediate_rep.name.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
            rendered_description: intermediate_rep.rendered_description.into_iter().next(),
            date_created: intermediate_rep.date_created.into_iter().next(),
            invite_only: intermediate_rep.invite_only.into_iter().next(),
            subscribers: intermediate_rep.subscribers.into_iter().next(),
            desktop_notifications: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            email_notifications: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            wildcard_mentions_notify: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            push_notifications: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            audible_notifications: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            pin_to_top: intermediate_rep.pin_to_top.into_iter().next(),
            email_address: intermediate_rep.email_address.into_iter().next(),
            is_muted: intermediate_rep.is_muted.into_iter().next(),
            in_home_view: intermediate_rep.in_home_view.into_iter().next(),
            is_announcement_only: intermediate_rep.is_announcement_only.into_iter().next(),
            is_web_public: intermediate_rep.is_web_public.into_iter().next(),
            role: intermediate_rep.role.into_iter().next(),
            color: intermediate_rep.color.into_iter().next(),
            stream_post_policy: intermediate_rep.stream_post_policy.into_iter().next(),
            message_retention_days: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            history_public_to_subscribers: intermediate_rep.history_public_to_subscribers.into_iter().next(),
            first_message_id: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
            stream_weekly_traffic: std::result::Result::Err("Nullable types not supported in Subscriptions".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Subscriptions> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Subscriptions>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Subscriptions>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Subscriptions - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Subscriptions> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Subscriptions as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Subscriptions - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// A typical successful JSON response may look like
#[derive(Debug, Clone, PartialEq, PartialOrd, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct SuccessDescription(serde_json::Value);

impl std::convert::From<serde_json::Value> for SuccessDescription {
    fn from(x: serde_json::Value) -> Self {
        SuccessDescription(x)
    }
}

impl std::convert::From<SuccessDescription> for serde_json::Value {
    fn from(x: SuccessDescription) -> Self {
        x.0
    }
}

impl std::ops::Deref for SuccessDescription {
    type Target = serde_json::Value;
    fn deref(&self) -> &serde_json::Value {
        &self.0
    }
}

impl std::ops::DerefMut for SuccessDescription {
    fn deref_mut(&mut self) -> &mut serde_json::Value {
        &mut self.0
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct User {
    #[serde(rename = "email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_bot")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_bot: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_version")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_version: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_admin")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_admin: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_owner")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_owner: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_billing_admin")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_billing_admin: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "role")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub role: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "bot_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "bot_owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_owner_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_active")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_active: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_guest")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_guest: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "timezone")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timezone: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "date_joined")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_joined: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "delivery_email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub delivery_email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "profile_data")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub profile_data: Option<swagger::Nullable<serde_json::Value>>,

}

impl User {
    pub fn new() -> User {
        User {
            email: None,
            is_bot: None,
            avatar_url: None,
            avatar_version: None,
            full_name: None,
            is_admin: None,
            is_owner: None,
            is_billing_admin: None,
            role: None,
            bot_type: None,
            user_id: None,
            bot_owner_id: None,
            is_active: None,
            is_guest: None,
            timezone: None,
            date_joined: None,
            delivery_email: None,
            profile_data: None,
        }
    }
}

/// Converts the User value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for User {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping email in query parameter serialization

        // Skipping is_bot in query parameter serialization

        // Skipping avatar_url in query parameter serialization

        // Skipping avatar_version in query parameter serialization

        // Skipping full_name in query parameter serialization

        // Skipping is_admin in query parameter serialization

        // Skipping is_owner in query parameter serialization

        // Skipping is_billing_admin in query parameter serialization

        // Skipping role in query parameter serialization

        // Skipping bot_type in query parameter serialization

        // Skipping user_id in query parameter serialization

        // Skipping bot_owner_id in query parameter serialization

        // Skipping is_active in query parameter serialization

        // Skipping is_guest in query parameter serialization

        // Skipping timezone in query parameter serialization

        // Skipping date_joined in query parameter serialization

        // Skipping delivery_email in query parameter serialization

        // Skipping profile_data in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a User value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for User {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub email: Vec<serde_json::Value>,
            pub is_bot: Vec<serde_json::Value>,
            pub avatar_url: Vec<serde_json::Value>,
            pub avatar_version: Vec<serde_json::Value>,
            pub full_name: Vec<serde_json::Value>,
            pub is_admin: Vec<serde_json::Value>,
            pub is_owner: Vec<serde_json::Value>,
            pub is_billing_admin: Vec<serde_json::Value>,
            pub role: Vec<serde_json::Value>,
            pub bot_type: Vec<serde_json::Value>,
            pub user_id: Vec<serde_json::Value>,
            pub bot_owner_id: Vec<serde_json::Value>,
            pub is_active: Vec<serde_json::Value>,
            pub is_guest: Vec<serde_json::Value>,
            pub timezone: Vec<serde_json::Value>,
            pub date_joined: Vec<serde_json::Value>,
            pub delivery_email: Vec<serde_json::Value>,
            pub profile_data: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing User".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "is_bot" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "avatar_version" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "is_admin" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "is_owner" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "is_billing_admin" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "role" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "bot_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "bot_owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "is_active" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "is_guest" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "timezone" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "date_joined" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "delivery_email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    "profile_data" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in User".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing User".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(User {
            email: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            is_bot: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            avatar_url: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            avatar_version: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            full_name: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            is_admin: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            is_owner: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            is_billing_admin: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            role: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            bot_type: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            user_id: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            bot_owner_id: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            is_active: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            is_guest: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            timezone: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            date_joined: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            delivery_email: std::result::Result::Err("Nullable types not supported in User".to_string())?,
            profile_data: std::result::Result::Err("Nullable types not supported in User".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<User> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<User>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<User>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for User - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<User> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <User as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into User - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct UserAllOf {
    #[serde(rename = "email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_bot")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_bot: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "avatar_version")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_version: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "full_name")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_admin")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_admin: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_owner")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_owner: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_billing_admin")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_billing_admin: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "role")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub role: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "bot_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_type: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "user_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "bot_owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_owner_id: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_active")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_active: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "is_guest")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_guest: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "timezone")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timezone: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "date_joined")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_joined: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "delivery_email")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub delivery_email: Option<swagger::Nullable<serde_json::Value>>,

    #[serde(rename = "profile_data")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub profile_data: Option<swagger::Nullable<serde_json::Value>>,

}

impl UserAllOf {
    pub fn new() -> UserAllOf {
        UserAllOf {
            email: None,
            is_bot: None,
            avatar_url: None,
            avatar_version: None,
            full_name: None,
            is_admin: None,
            is_owner: None,
            is_billing_admin: None,
            role: None,
            bot_type: None,
            user_id: None,
            bot_owner_id: None,
            is_active: None,
            is_guest: None,
            timezone: None,
            date_joined: None,
            delivery_email: None,
            profile_data: None,
        }
    }
}

/// Converts the UserAllOf value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for UserAllOf {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping email in query parameter serialization

        // Skipping is_bot in query parameter serialization

        // Skipping avatar_url in query parameter serialization

        // Skipping avatar_version in query parameter serialization

        // Skipping full_name in query parameter serialization

        // Skipping is_admin in query parameter serialization

        // Skipping is_owner in query parameter serialization

        // Skipping is_billing_admin in query parameter serialization

        // Skipping role in query parameter serialization

        // Skipping bot_type in query parameter serialization

        // Skipping user_id in query parameter serialization

        // Skipping bot_owner_id in query parameter serialization

        // Skipping is_active in query parameter serialization

        // Skipping is_guest in query parameter serialization

        // Skipping timezone in query parameter serialization

        // Skipping date_joined in query parameter serialization

        // Skipping delivery_email in query parameter serialization

        // Skipping profile_data in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a UserAllOf value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for UserAllOf {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub email: Vec<serde_json::Value>,
            pub is_bot: Vec<serde_json::Value>,
            pub avatar_url: Vec<serde_json::Value>,
            pub avatar_version: Vec<serde_json::Value>,
            pub full_name: Vec<serde_json::Value>,
            pub is_admin: Vec<serde_json::Value>,
            pub is_owner: Vec<serde_json::Value>,
            pub is_billing_admin: Vec<serde_json::Value>,
            pub role: Vec<serde_json::Value>,
            pub bot_type: Vec<serde_json::Value>,
            pub user_id: Vec<serde_json::Value>,
            pub bot_owner_id: Vec<serde_json::Value>,
            pub is_active: Vec<serde_json::Value>,
            pub is_guest: Vec<serde_json::Value>,
            pub timezone: Vec<serde_json::Value>,
            pub date_joined: Vec<serde_json::Value>,
            pub delivery_email: Vec<serde_json::Value>,
            pub profile_data: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing UserAllOf".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "is_bot" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "avatar_version" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "full_name" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "is_admin" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "is_owner" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "is_billing_admin" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "role" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "bot_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "user_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "bot_owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "is_active" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "is_guest" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "timezone" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "date_joined" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "delivery_email" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    "profile_data" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserAllOf".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing UserAllOf".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(UserAllOf {
            email: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            is_bot: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            avatar_url: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            avatar_version: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            full_name: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            is_admin: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            is_owner: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            is_billing_admin: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            role: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            bot_type: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            user_id: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            bot_owner_id: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            is_active: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            is_guest: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            timezone: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            date_joined: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            delivery_email: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
            profile_data: std::result::Result::Err("Nullable types not supported in UserAllOf".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<UserAllOf> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<UserAllOf>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<UserAllOf>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for UserAllOf - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<UserAllOf> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <UserAllOf as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into UserAllOf - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// A dictionary containing basic data on a given Zulip user. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct UserBase {
    /// The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
    #[serde(rename = "email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub email: Option<String>,

    /// A boolean specifying whether the user is a bot or full account. 
    #[serde(rename = "is_bot")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_bot: Option<bool>,

    /// URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
    #[serde(rename = "avatar_url")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_url: Option<swagger::Nullable<String>>,

    /// Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
    #[serde(rename = "avatar_version")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub avatar_version: Option<isize>,

    /// Full name of the user or bot, used for all display purposes. 
    #[serde(rename = "full_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub full_name: Option<String>,

    /// A boolean specifying whether the user is an organization administrator. 
    #[serde(rename = "is_admin")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_admin: Option<bool>,

    /// A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
    #[serde(rename = "is_owner")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_owner: Option<bool>,

    /// A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
    #[serde(rename = "is_billing_admin")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_billing_admin: Option<bool>,

    /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "role")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub role: Option<isize>,

    /// An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    #[serde(rename = "bot_type")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_type: Option<swagger::Nullable<isize>>,

    /// The unique ID of the user. 
    #[serde(rename = "user_id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub user_id: Option<isize>,

    /// If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
    #[serde(rename = "bot_owner_id")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bot_owner_id: Option<swagger::Nullable<isize>>,

    /// A boolean specifying whether the user account has been deactivated. 
    #[serde(rename = "is_active")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_active: Option<bool>,

    /// A boolean specifying whether the user is a guest user. 
    #[serde(rename = "is_guest")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub is_guest: Option<bool>,

    /// The time zone of the user. 
    #[serde(rename = "timezone")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub timezone: Option<String>,

    /// The time the user account was created. 
    #[serde(rename = "date_joined")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub date_joined: Option<String>,

    /// The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
    #[serde(rename = "delivery_email")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub delivery_email: Option<String>,

    /// A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
    #[serde(rename = "profile_data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub profile_data: Option<std::collections::HashMap<String, serde_json::Value>>,

}

impl UserBase {
    pub fn new() -> UserBase {
        UserBase {
            email: None,
            is_bot: None,
            avatar_url: None,
            avatar_version: None,
            full_name: None,
            is_admin: None,
            is_owner: None,
            is_billing_admin: None,
            role: None,
            bot_type: None,
            user_id: None,
            bot_owner_id: None,
            is_active: None,
            is_guest: None,
            timezone: None,
            date_joined: None,
            delivery_email: None,
            profile_data: None,
        }
    }
}

/// Converts the UserBase value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for UserBase {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref email) = self.email {
            params.push("email".to_string());
            params.push(email.to_string());
        }


        if let Some(ref is_bot) = self.is_bot {
            params.push("is_bot".to_string());
            params.push(is_bot.to_string());
        }


        if let Some(ref avatar_url) = self.avatar_url {
            params.push("avatar_url".to_string());
            params.push(avatar_url.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref avatar_version) = self.avatar_version {
            params.push("avatar_version".to_string());
            params.push(avatar_version.to_string());
        }


        if let Some(ref full_name) = self.full_name {
            params.push("full_name".to_string());
            params.push(full_name.to_string());
        }


        if let Some(ref is_admin) = self.is_admin {
            params.push("is_admin".to_string());
            params.push(is_admin.to_string());
        }


        if let Some(ref is_owner) = self.is_owner {
            params.push("is_owner".to_string());
            params.push(is_owner.to_string());
        }


        if let Some(ref is_billing_admin) = self.is_billing_admin {
            params.push("is_billing_admin".to_string());
            params.push(is_billing_admin.to_string());
        }


        if let Some(ref role) = self.role {
            params.push("role".to_string());
            params.push(role.to_string());
        }


        if let Some(ref bot_type) = self.bot_type {
            params.push("bot_type".to_string());
            params.push(bot_type.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref user_id) = self.user_id {
            params.push("user_id".to_string());
            params.push(user_id.to_string());
        }


        if let Some(ref bot_owner_id) = self.bot_owner_id {
            params.push("bot_owner_id".to_string());
            params.push(bot_owner_id.as_ref().map_or("null".to_string(), |x| x.to_string()));
        }


        if let Some(ref is_active) = self.is_active {
            params.push("is_active".to_string());
            params.push(is_active.to_string());
        }


        if let Some(ref is_guest) = self.is_guest {
            params.push("is_guest".to_string());
            params.push(is_guest.to_string());
        }


        if let Some(ref timezone) = self.timezone {
            params.push("timezone".to_string());
            params.push(timezone.to_string());
        }


        if let Some(ref date_joined) = self.date_joined {
            params.push("date_joined".to_string());
            params.push(date_joined.to_string());
        }


        if let Some(ref delivery_email) = self.delivery_email {
            params.push("delivery_email".to_string());
            params.push(delivery_email.to_string());
        }

        // Skipping profile_data in query parameter serialization
        // Skipping profile_data in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a UserBase value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for UserBase {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub email: Vec<String>,
            pub is_bot: Vec<bool>,
            pub avatar_url: Vec<String>,
            pub avatar_version: Vec<isize>,
            pub full_name: Vec<String>,
            pub is_admin: Vec<bool>,
            pub is_owner: Vec<bool>,
            pub is_billing_admin: Vec<bool>,
            pub role: Vec<isize>,
            pub bot_type: Vec<isize>,
            pub user_id: Vec<isize>,
            pub bot_owner_id: Vec<isize>,
            pub is_active: Vec<bool>,
            pub is_guest: Vec<bool>,
            pub timezone: Vec<String>,
            pub date_joined: Vec<String>,
            pub delivery_email: Vec<String>,
            pub profile_data: Vec<std::collections::HashMap<String, serde_json::Value>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing UserBase".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "email" => intermediate_rep.email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_bot" => intermediate_rep.is_bot.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "avatar_url" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserBase".to_string()),
                    "avatar_version" => intermediate_rep.avatar_version.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "full_name" => intermediate_rep.full_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_admin" => intermediate_rep.is_admin.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_owner" => intermediate_rep.is_owner.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_billing_admin" => intermediate_rep.is_billing_admin.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "role" => intermediate_rep.role.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "bot_type" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserBase".to_string()),
                    "user_id" => intermediate_rep.user_id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "bot_owner_id" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserBase".to_string()),
                    "is_active" => intermediate_rep.is_active.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "is_guest" => intermediate_rep.is_guest.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "timezone" => intermediate_rep.timezone.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "date_joined" => intermediate_rep.date_joined.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "delivery_email" => intermediate_rep.delivery_email.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "profile_data" => return std::result::Result::Err("Parsing a container in this style is not supported in UserBase".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing UserBase".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(UserBase {
            email: intermediate_rep.email.into_iter().next(),
            is_bot: intermediate_rep.is_bot.into_iter().next(),
            avatar_url: std::result::Result::Err("Nullable types not supported in UserBase".to_string())?,
            avatar_version: intermediate_rep.avatar_version.into_iter().next(),
            full_name: intermediate_rep.full_name.into_iter().next(),
            is_admin: intermediate_rep.is_admin.into_iter().next(),
            is_owner: intermediate_rep.is_owner.into_iter().next(),
            is_billing_admin: intermediate_rep.is_billing_admin.into_iter().next(),
            role: intermediate_rep.role.into_iter().next(),
            bot_type: std::result::Result::Err("Nullable types not supported in UserBase".to_string())?,
            user_id: intermediate_rep.user_id.into_iter().next(),
            bot_owner_id: std::result::Result::Err("Nullable types not supported in UserBase".to_string())?,
            is_active: intermediate_rep.is_active.into_iter().next(),
            is_guest: intermediate_rep.is_guest.into_iter().next(),
            timezone: intermediate_rep.timezone.into_iter().next(),
            date_joined: intermediate_rep.date_joined.into_iter().next(),
            delivery_email: intermediate_rep.delivery_email.into_iter().next(),
            profile_data: intermediate_rep.profile_data.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<UserBase> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<UserBase>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<UserBase>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for UserBase - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<UserBase> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <UserBase as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into UserBase - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct UserDeactivatedError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

}

impl UserDeactivatedError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> UserDeactivatedError {
        UserDeactivatedError {
            result: result,
            msg: msg,
            code: None,
        }
    }
}

/// Converts the UserDeactivatedError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for UserDeactivatedError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a UserDeactivatedError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for UserDeactivatedError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing UserDeactivatedError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserDeactivatedError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserDeactivatedError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserDeactivatedError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing UserDeactivatedError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(UserDeactivatedError {
            result: std::result::Result::Err("Nullable types not supported in UserDeactivatedError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in UserDeactivatedError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in UserDeactivatedError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<UserDeactivatedError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<UserDeactivatedError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<UserDeactivatedError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for UserDeactivatedError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<UserDeactivatedError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <UserDeactivatedError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into UserDeactivatedError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


/// Object containing the user group's attributes. 
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct UserGroup {
    /// The name of the user group. 
    #[serde(rename = "name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub name: Option<String>,

    /// The description of the user group. 
    #[serde(rename = "description")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub description: Option<String>,

    /// Array containing the id of the users who are members of this user group. 
    #[serde(rename = "members")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub members: Option<Vec<i32>>,

    /// The ID of the user group. 
    #[serde(rename = "id")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub id: Option<isize>,

}

impl UserGroup {
    pub fn new() -> UserGroup {
        UserGroup {
            name: None,
            description: None,
            members: None,
            id: None,
        }
    }
}

/// Converts the UserGroup value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for UserGroup {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];

        if let Some(ref name) = self.name {
            params.push("name".to_string());
            params.push(name.to_string());
        }


        if let Some(ref description) = self.description {
            params.push("description".to_string());
            params.push(description.to_string());
        }


        if let Some(ref members) = self.members {
            params.push("members".to_string());
            params.push(members.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",").to_string());
        }


        if let Some(ref id) = self.id {
            params.push("id".to_string());
            params.push(id.to_string());
        }

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a UserGroup value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for UserGroup {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub name: Vec<String>,
            pub description: Vec<String>,
            pub members: Vec<Vec<i32>>,
            pub id: Vec<isize>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing UserGroup".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "name" => intermediate_rep.name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "description" => intermediate_rep.description.push(<String as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    "members" => return std::result::Result::Err("Parsing a container in this style is not supported in UserGroup".to_string()),
                    "id" => intermediate_rep.id.push(<isize as std::str::FromStr>::from_str(val).map_err(|x| format!("{}", x))?),
                    _ => return std::result::Result::Err("Unexpected key while parsing UserGroup".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(UserGroup {
            name: intermediate_rep.name.into_iter().next(),
            description: intermediate_rep.description.into_iter().next(),
            members: intermediate_rep.members.into_iter().next(),
            id: intermediate_rep.id.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<UserGroup> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<UserGroup>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<UserGroup>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for UserGroup - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<UserGroup> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <UserGroup as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into UserGroup - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct UserNotAuthorizedError {
    #[serde(rename = "result")]
    pub result: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "msg")]
    pub msg: swagger::Nullable<serde_json::Value>,

    #[serde(rename = "code")]
    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub code: Option<swagger::Nullable<serde_json::Value>>,

}

impl UserNotAuthorizedError {
    pub fn new(result: swagger::Nullable<serde_json::Value>, msg: swagger::Nullable<serde_json::Value>, ) -> UserNotAuthorizedError {
        UserNotAuthorizedError {
            result: result,
            msg: msg,
            code: None,
        }
    }
}

/// Converts the UserNotAuthorizedError value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for UserNotAuthorizedError {
    fn to_string(&self) -> String {
        let mut params: Vec<String> = vec![];
        // Skipping result in query parameter serialization

        // Skipping msg in query parameter serialization

        // Skipping code in query parameter serialization

        params.join(",").to_string()
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a UserNotAuthorizedError value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for UserNotAuthorizedError {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        #[derive(Default)]
        // An intermediate representation of the struct to use for parsing.
        struct IntermediateRep {
            pub result: Vec<serde_json::Value>,
            pub msg: Vec<serde_json::Value>,
            pub code: Vec<serde_json::Value>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',').into_iter();
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing UserNotAuthorizedError".to_string())
            };

            if let Some(key) = key_result {
                match key {
                    "result" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserNotAuthorizedError".to_string()),
                    "msg" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserNotAuthorizedError".to_string()),
                    "code" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in UserNotAuthorizedError".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing UserNotAuthorizedError".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(UserNotAuthorizedError {
            result: std::result::Result::Err("Nullable types not supported in UserNotAuthorizedError".to_string())?,
            msg: std::result::Result::Err("Nullable types not supported in UserNotAuthorizedError".to_string())?,
            code: std::result::Result::Err("Nullable types not supported in UserNotAuthorizedError".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<UserNotAuthorizedError> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<UserNotAuthorizedError>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<UserNotAuthorizedError>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for UserNotAuthorizedError - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<UserNotAuthorizedError> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <UserNotAuthorizedError as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into UserNotAuthorizedError - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}

