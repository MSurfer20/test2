/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class InlineResponse200 (
  // Email of the bot user. 
  botEmail: Option[String] = None,
  // The full name of the bot user. 
  botFullName: Option[String] = None,
  // The message content, in raw Markdown format (not rendered to HTML). 
  data: Option[String] = None,
  // What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
  trigger: Option[String] = None,
  // A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
  token: Option[String] = None,
  // A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
  message: Option[MessagesBase] = None
)
