package org.openapitools.api

import org.openapitools.model.CodedError
import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
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
class StreamsApiController() {


    @DeleteMapping(
        value = ["/streams/{stream_id}"],
        produces = ["application/json"]
    )
    fun archiveStream( @PathVariable("stream_id") streamId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/streams"],
        produces = ["application/json"]
    )
    fun getStreams( @RequestParam(value = "include_public", required = false, defaultValue="true") includePublic: kotlin.Boolean
, @RequestParam(value = "include_web_public", required = false, defaultValue="false") includeWebPublic: kotlin.Boolean
, @RequestParam(value = "include_subscribed", required = false, defaultValue="true") includeSubscribed: kotlin.Boolean
, @RequestParam(value = "include_all_active", required = false, defaultValue="false") includeAllActive: kotlin.Boolean
, @RequestParam(value = "include_default", required = false, defaultValue="false") includeDefault: kotlin.Boolean
, @RequestParam(value = "include_owner_subscribed", required = false, defaultValue="false") includeOwnerSubscribed: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/streams/{stream_id}"],
        produces = ["application/json"]
    )
    fun updateStream( @PathVariable("stream_id") streamId: kotlin.Int
, @RequestParam(value = "description", required = false) description: kotlin.String?
, @RequestParam(value = "new_name", required = false) newName: kotlin.String?
, @RequestParam(value = "is_private", required = false) isPrivate: kotlin.Boolean?
, @RequestParam(value = "is_announcement_only", required = false) isAnnouncementOnly: kotlin.Boolean?
, @RequestParam(value = "stream_post_policy", required = false, defaultValue="1") streamPostPolicy: kotlin.Int
, @RequestParam(value = "history_public_to_subscribers", required = false) historyPublicToSubscribers: kotlin.Boolean?
, @RequestParam(value = "message_retention_days", required = false) messageRetentionDays: OneOfLessThanStringCommaIntegerGreaterThan?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
