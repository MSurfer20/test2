package org.openapitools.api

import org.openapitools.model.AnyType
import org.openapitools.model.CodedError
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.NonExistingStreamError
import org.openapitools.model.OneOfLessThanObjectCommaObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanStringCommaIntegerGreaterThan
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/v1}")
class UsersApiController() {


    @PostMapping(
        value = ["/users"],
        produces = ["application/json"]
    )
    fun createUser(@NotNull  @RequestParam(value = "email", required = true) email: kotlin.String
,@NotNull  @RequestParam(value = "password", required = true) password: kotlin.String
,@NotNull  @RequestParam(value = "full_name", required = true) fullName: kotlin.String
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/users/me"],
        produces = ["application/json"]
    )
    fun deactivateOwnUser(): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/users/{user_id}"],
        produces = ["application/json"]
    )
    fun deactivateUser( @PathVariable("user_id") userId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/me"],
        produces = ["application/json"]
    )
    fun getOwnUser(): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/me/{stream_id}/topics"],
        produces = ["application/json"]
    )
    fun getStreamTopics( @PathVariable("stream_id") streamId: kotlin.Int
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/{user_id}/subscriptions/{stream_id}"],
        produces = ["application/json"]
    )
    fun getSubscriptionStatus( @PathVariable("user_id") userId: kotlin.Int
, @PathVariable("stream_id") streamId: kotlin.Int
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/me/subscriptions"],
        produces = ["application/json"]
    )
    fun getSubscriptions( @RequestParam(value = "include_subscribers", required = false, defaultValue="false") includeSubscribers: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/{user_id}"],
        produces = ["application/json"]
    )
    fun getUser( @PathVariable("user_id") userId: kotlin.Int
, @RequestParam(value = "client_gravatar", required = false, defaultValue="false") clientGravatar: kotlin.Boolean
, @RequestParam(value = "include_custom_profile_fields", required = false, defaultValue="false") includeCustomProfileFields: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/{email}"],
        produces = ["application/json"]
    )
    fun getUserByEmail( @PathVariable("email") email: kotlin.String
, @RequestParam(value = "client_gravatar", required = false, defaultValue="false") clientGravatar: kotlin.Boolean
, @RequestParam(value = "include_custom_profile_fields", required = false, defaultValue="false") includeCustomProfileFields: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users/{user_id_or_email}/presence"],
        produces = ["application/json"]
    )
    fun getUserPresence( @PathVariable("user_id_or_email") userIdOrEmail: kotlin.String
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/users"],
        produces = ["application/json"]
    )
    fun getUsers( @RequestParam(value = "client_gravatar", required = false, defaultValue="false") clientGravatar: kotlin.Boolean
, @RequestParam(value = "include_custom_profile_fields", required = false, defaultValue="false") includeCustomProfileFields: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/users/me/subscriptions/muted_topics"],
        produces = ["application/json"]
    )
    fun muteTopic(@NotNull  @RequestParam(value = "topic", required = true) topic: kotlin.String
,@NotNull  @RequestParam(value = "op", required = true) op: kotlin.String
, @RequestParam(value = "stream", required = false) stream: kotlin.String?
, @RequestParam(value = "stream_id", required = false) streamId: kotlin.Int?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/users/me/muted_users/{muted_user_id}"],
        produces = ["application/json"]
    )
    fun muteUser( @PathVariable("muted_user_id") mutedUserId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/users/{user_id}/reactivate"],
        produces = ["application/json"]
    )
    fun reactivateUser( @PathVariable("user_id") userId: kotlin.Int
): ResponseEntity<AnyType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/users/me/subscriptions"],
        produces = ["application/json"]
    )
    fun subscribe(@NotNull  @RequestParam(value = "subscriptions", required = true) subscriptions: kotlin.collections.List<kotlin.Any>
, @RequestParam(value = "principals", required = false) principals: kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan>?
, @RequestParam(value = "authorization_errors_fatal", required = false, defaultValue="true") authorizationErrorsFatal: kotlin.Boolean
, @RequestParam(value = "announce", required = false, defaultValue="false") announce: kotlin.Boolean
, @RequestParam(value = "invite_only", required = false, defaultValue="false") inviteOnly: kotlin.Boolean
, @RequestParam(value = "history_public_to_subscribers", required = false) historyPublicToSubscribers: kotlin.Boolean?
, @RequestParam(value = "stream_post_policy", required = false, defaultValue="1") streamPostPolicy: kotlin.Int
, @RequestParam(value = "message_retention_days", required = false) messageRetentionDays: OneOfLessThanStringCommaIntegerGreaterThan?
): ResponseEntity<OneOfLessThanObjectCommaObjectGreaterThan> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/users/me/muted_users/{muted_user_id}"],
        produces = ["application/json"]
    )
    fun unmuteUser( @PathVariable("muted_user_id") mutedUserId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/users/me/subscriptions"],
        produces = ["application/json"]
    )
    fun unsubscribe(@NotNull  @RequestParam(value = "subscriptions", required = true) subscriptions: kotlin.collections.List<kotlin.String>
, @RequestParam(value = "principals", required = false) principals: kotlin.collections.List<OneOfLessThanStringCommaIntegerGreaterThan>?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/users/me/subscriptions/properties"],
        produces = ["application/json"]
    )
    fun updateSubscriptionSettings(@NotNull  @RequestParam(value = "subscription_data", required = true) subscriptionData: kotlin.collections.List<kotlin.Any>
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/users/me/subscriptions"],
        produces = ["application/json"]
    )
    fun updateSubscriptions( @RequestParam(value = "delete", required = false) delete: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "add", required = false) add: kotlin.collections.List<kotlin.Any>?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/users/{user_id}"],
        produces = ["application/json"]
    )
    fun updateUser( @PathVariable("user_id") userId: kotlin.Int
, @RequestParam(value = "full_name", required = false) fullName: kotlin.String?
, @RequestParam(value = "role", required = false) role: kotlin.Int?
, @RequestParam(value = "profile_data", required = false) profileData: kotlin.collections.List<kotlin.Any>?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
