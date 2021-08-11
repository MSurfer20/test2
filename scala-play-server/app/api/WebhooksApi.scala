package api

import play.api.libs.json._
import model.InlineResponse200

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"))
trait WebhooksApi {
  /**
    * Outgoing webhooks
    * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
    */
  def zulipOutgoingWebhooks(): InlineResponse200
}
