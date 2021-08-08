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
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.response.*
import org.openapitools.server.Paths
import io.ktor.locations.*
import io.ktor.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.models.CodedError
import org.openapitools.server.models.JsonError
import org.openapitools.server.models.JsonSuccess
import org.openapitools.server.models.JsonSuccessBase
import org.openapitools.server.models.NonExistingStreamError
import org.openapitools.server.models.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.server.models.OneOfLessThanStringCommaIntegerGreaterThan

@KtorExperimentalLocationsAPI
fun Route.StreamsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    delete<Paths.archiveStream> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.createBigBlueButtonVideoCall> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getStreamId> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getStreamTopics> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getStreams> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getSubscriptionStatus> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getSubscriptions> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    patch<Paths.muteTopic> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.subscribe> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    delete<Paths.unsubscribe> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    patch<Paths.updateStream> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.updateSubscriptionSettings> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    patch<Paths.updateSubscriptions> {
        call.respond(HttpStatusCode.NotImplemented)
    }

}