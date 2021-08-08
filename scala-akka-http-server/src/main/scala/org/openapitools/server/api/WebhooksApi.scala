package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.InlineResponse200


class WebhooksApi(
    webhooksService: WebhooksApiService,
    webhooksMarshaller: WebhooksApiMarshaller
) {

  
  import webhooksMarshaller._

  lazy val route: Route =
    path("zulip-outgoing-webhook") { 
      post {  
            webhooksService.zulipOutgoingWebhooks()
      }
    }
}


trait WebhooksApiService {

  def zulipOutgoingWebhooks200(responseInlineResponse200: InlineResponse200)(implicit toEntityMarshallerInlineResponse200: ToEntityMarshaller[InlineResponse200]): Route =
    complete((200, responseInlineResponse200))
  /**
   * Code: 200, Message: Success , DataType: InlineResponse200
   */
  def zulipOutgoingWebhooks()
      (implicit toEntityMarshallerInlineResponse200: ToEntityMarshaller[InlineResponse200]): Route

}

trait WebhooksApiMarshaller {


  implicit def toEntityMarshallerInlineResponse200: ToEntityMarshaller[InlineResponse200]

}

