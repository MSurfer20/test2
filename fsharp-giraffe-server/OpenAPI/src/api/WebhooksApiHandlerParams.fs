namespace OpenAPI

open OpenAPI.Model.InlineResponse200
open System.Collections.Generic
open System

module WebhooksApiHandlerParams = 


    
    type ZulipOutgoingWebhooksStatusCode200Response = {
      content:InlineResponse200;
      
    }
    type ZulipOutgoingWebhooksResult = ZulipOutgoingWebhooksStatusCode200 of ZulipOutgoingWebhooksStatusCode200Response

    