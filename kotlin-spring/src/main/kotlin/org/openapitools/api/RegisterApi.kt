package org.openapitools.api

import org.openapitools.model.JsonSuccessBase
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
class RegisterApiController() {


    @PostMapping(
        value = ["/register"],
        produces = ["application/json"]
    )
    fun registerQueue( @RequestParam(value = "apply_markdown", required = false, defaultValue="false") applyMarkdown: kotlin.Boolean
, @RequestParam(value = "client_gravatar", required = false, defaultValue="false") clientGravatar: kotlin.Boolean
, @RequestParam(value = "slim_presence", required = false, defaultValue="false") slimPresence: kotlin.Boolean
, @RequestParam(value = "event_types", required = false) eventTypes: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "all_public_streams", required = false, defaultValue="false") allPublicStreams: kotlin.Boolean
, @RequestParam(value = "include_subscribers", required = false, defaultValue="false") includeSubscribers: kotlin.Boolean
, @RequestParam(value = "client_capabilities", required = false) clientCapabilities: kotlin.Any?
, @RequestParam(value = "fetch_event_types", required = false) fetchEventTypes: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "narrow", required = false) narrow: kotlin.collections.List<kotlin.collections.List<kotlin.String>>?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
