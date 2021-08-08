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
package org.openapitools.client.api

import org.openapitools.client.model.InlineResponse200
import org.openapitools.client.core.JsonSupport._
import sttp.client._
import sttp.model.Method

object WebhooksApi {

def apply(baseUrl: String = "https://example.zulipchat.com/api/v1") = new WebhooksApi(baseUrl)
}

class WebhooksApi(baseUrl: String) {

  /**
   * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
   * 
   * Expected answers:
   *   code 200 : InlineResponse200 (Success )
   */
  def zulipOutgoingWebhooks(
): Request[Either[ResponseError[Exception], InlineResponse200], Nothing] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/zulip-outgoing-webhook")
      .contentType("application/json")
      .response(asJson[InlineResponse200])

}
