package org.openapitools.server

import com.codahale.metrics.Slf4jReporter
import com.typesafe.config.ConfigFactory
import io.ktor.application.Application
import io.ktor.application.ApplicationStopping
import io.ktor.application.install
import io.ktor.application.log
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.AutoHeadResponse
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.features.HSTS
import io.ktor.gson.GsonConverter
import io.ktor.http.ContentType
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Locations
import io.ktor.metrics.Metrics
import io.ktor.routing.Routing
import java.util.concurrent.TimeUnit
import io.ktor.util.KtorExperimentalAPI
import io.ktor.auth.Authentication
import io.ktor.auth.oauth
import org.openapitools.server.infrastructure.ApiKeyCredential
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.infrastructure.apiKeyAuth
import org.openapitools.server.apis.AuthenticationApi
import org.openapitools.server.apis.DraftsApi
import org.openapitools.server.apis.MessagesApi
import org.openapitools.server.apis.RealTimeEventsApi
import org.openapitools.server.apis.ServerAndOrganizationsApi
import org.openapitools.server.apis.StreamsApi
import org.openapitools.server.apis.UsersApi
import org.openapitools.server.apis.WebhooksApi


@KtorExperimentalAPI
internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
fun Application.main() {
    install(DefaultHeaders)
    install(Metrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
                .outputTo(log)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see http://ktor.io/features/autoheadresponse.html
    install(HSTS, ApplicationHstsConfiguration()) // see http://ktor.io/features/hsts.html
    install(Compression, ApplicationCompressionConfiguration()) // see http://ktor.io/features/compression.html
    install(Locations) // see http://ktor.io/features/locations.html
    install(Authentication) {
        basic("BasicAuth") {
        validate { credentials ->
            // TODO: "Apply your basic authentication functionality."
            // Accessible in-method via call.principal<UserIdPrincipal>()
            if (credentials.name == "Swagger" && "Codegen" == credentials.password) {
                UserIdPrincipal(credentials.name)
            } else {
                null
            }
        }
    }
    install(Routing) {
        AuthenticationApi()
        DraftsApi()
        MessagesApi()
        RealTimeEventsApi()
        ServerAndOrganizationsApi()
        StreamsApi()
        UsersApi()
        WebhooksApi()
    }


    environment.monitor.subscribe(ApplicationStopping)
    {
        HTTP.client.close()
    }
}
