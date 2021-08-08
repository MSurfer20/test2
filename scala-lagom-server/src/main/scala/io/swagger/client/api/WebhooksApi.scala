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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.InlineResponse200

trait WebhooksApi extends Service {


  final override def descriptor = {
    import Service._
    named("WebhooksApi").withCalls(
      restCall(Method.POST, "/zulip-outgoing-webhook", zulipOutgoingWebhooks _)
    ).withAutoAcl(true)
  }


  /**
    * Outgoing webhooks
    * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    * 
    * @return InlineResponse200
    */
  def zulipOutgoingWebhooks(): ServiceCall[NotUsed ,InlineResponse200]
  

  }
