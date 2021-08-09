package api

import play.api.libs.json._
import model.InlineResponse200

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-09T21:37:15.417726Z[Etc/UTC]")
trait WebhooksApi {
  /**
    * Outgoing webhooks
    * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    */
  def zulipOutgoingWebhooks(): InlineResponse200
}
