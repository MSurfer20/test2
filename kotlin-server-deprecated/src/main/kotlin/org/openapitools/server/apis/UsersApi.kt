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
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.post
import io.ktor.routing.put
import io.ktor.routing.route

import org.openapitools.server.Paths
import org.openapitools.server.infrastructure.ApiPrincipal


import org.openapitools.server.models.AnyType
import org.openapitools.server.models.CodedError
import org.openapitools.server.models.JsonError
import org.openapitools.server.models.JsonSuccess
import org.openapitools.server.models.JsonSuccessBase
import org.openapitools.server.models.OneOfLessThanObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.server.models.OneOfLessThanObjectCommaObjectGreaterThan

@KtorExperimentalLocationsAPI
fun Route.UsersApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    route("/users") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/user_groups/create") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    delete<Paths.deactivateOwnUser> {  _: Paths.deactivateOwnUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    delete<Paths.deactivateUser> {  _: Paths.deactivateUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getAttachments> {  _: Paths.getAttachments ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getOwnUser> {  _: Paths.getOwnUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getUser> {  _: Paths.getUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getUserByEmail> {  _: Paths.getUserByEmail ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getUserGroups> {  _: Paths.getUserGroups ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getUserPresence> {  _: Paths.getUserPresence ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    get<Paths.getUsers> {  _: Paths.getUsers ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    route("/users/me/muted_users/{muted_user_id}") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/users/{user_id}/reactivate") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    delete<Paths.removeUserGroup> {  _: Paths.removeUserGroup ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    route("/typing") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    delete<Paths.unmuteUser> {  _: Paths.unmuteUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }


    route("/settings/display") {
        patch {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/settings/notifications") {
        patch {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/users/{user_id}") {
        patch {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/user_groups/{user_group_id}") {
        patch {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }


    route("/user_groups/{user_group_id}/members") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }

}
