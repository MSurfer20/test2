package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.AuthenticationApi
import org.openapitools.server.api.MessagesApi
import org.openapitools.server.api.RealTimeEventsApi
import org.openapitools.server.api.ServerAndOrganizationsApi
import org.openapitools.server.api.StreamsApi
import org.openapitools.server.api.UsersApi
import org.openapitools.server.api.WebhooksApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

class Controller(authentication: AuthenticationApi, messages: MessagesApi, realTimeEvents: RealTimeEventsApi, serverAndOrganizations: ServerAndOrganizationsApi, streams: StreamsApi, users: UsersApi, webhooks: WebhooksApi)(implicit system: ActorSystem, materializer: ActorMaterializer) {

    lazy val routes: Route = authentication.route ~ messages.route ~ realTimeEvents.route ~ serverAndOrganizations.route ~ streams.route ~ users.route ~ webhooks.route 

    Http().bindAndHandle(routes, "0.0.0.0", 9000)
}