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
import org.openapitools.server.models.AnyType
import org.openapitools.server.models.CodedError
import org.openapitools.server.models.InvalidMessageError
import org.openapitools.server.models.JsonSuccess
import org.openapitools.server.models.JsonSuccessBase
import org.openapitools.server.models.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.server.models.OneOfLessThanStringCommaIntegerGreaterThan

@KtorExperimentalLocationsAPI
fun Route.MessagesApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    post<Paths.addReaction> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.checkMessagesMatchNarrow> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    delete<Paths.deleteMessage> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getFileTemporaryUrl> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getMessageHistory> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getMessages> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    get<Paths.getRawMessage> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.markAllAsRead> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.markStreamAsRead> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.markTopicAsRead> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    delete<Paths.removeReaction> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.renderMessage> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.sendMessage> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    patch<Paths.updateMessage> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.updateMessageFlags> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.uploadFile> {
        call.respond(HttpStatusCode.NotImplemented)
    }

}
