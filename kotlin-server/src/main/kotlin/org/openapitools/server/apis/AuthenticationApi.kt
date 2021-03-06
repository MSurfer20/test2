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
import org.openapitools.server.models.ApiKeyResponse

@KtorExperimentalLocationsAPI
fun Route.AuthenticationApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    post<Paths.devFetchApiKey> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    post<Paths.fetchApiKey> {
        call.respond(HttpStatusCode.NotImplemented)
    }

}
