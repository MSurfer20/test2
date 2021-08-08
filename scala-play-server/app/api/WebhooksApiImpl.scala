package api

import model.InlineResponse200

/**
  * Provides a default implementation for [[WebhooksApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
class WebhooksApiImpl extends WebhooksApi {
  /**
    * @inheritdoc
    */
  override def zulipOutgoingWebhooks(): InlineResponse200 = {
    // TODO: Implement better logic

    InlineResponse200(None, None, None, None, None, None)
  }
}
