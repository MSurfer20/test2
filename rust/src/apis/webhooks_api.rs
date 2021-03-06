/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};


/// struct for typed errors of method `zulip_outgoing_webhooks`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ZulipOutgoingWebhooksError {
    UnknownValue(serde_json::Value),
}


/// Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
pub async fn zulip_outgoing_webhooks(configuration: &configuration::Configuration, ) -> Result<crate::models::InlineResponse200, Error<ZulipOutgoingWebhooksError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/zulip-outgoing-webhook", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ZulipOutgoingWebhooksError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

