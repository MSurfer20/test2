package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-08-08T20:45:49.166589Z[Etc/UTC]")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[AuthenticationApi].to[AuthenticationApiImpl],
    bind[MessagesApi].to[MessagesApiImpl],
    bind[RealTimeEventsApi].to[RealTimeEventsApiImpl],
    bind[ServerAndOrganizationsApi].to[ServerAndOrganizationsApiImpl],
    bind[StreamsApi].to[StreamsApiImpl],
    bind[UsersApi].to[UsersApiImpl],
    bind[WebhooksApi].to[WebhooksApiImpl]
  )
}
