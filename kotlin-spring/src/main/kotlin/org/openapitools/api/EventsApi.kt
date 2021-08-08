package org.openapitools.api

import org.openapitools.model.BadEventQueueIdError
import org.openapitools.model.JsonSuccess
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
class EventsApiController() {


    @DeleteMapping(
        value = ["/events"],
        produces = ["application/json"]
    )
    fun deleteQueue(@NotNull  @RequestParam(value = "queue_id", required = true) queueId: kotlin.String
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/events"],
        produces = ["application/json"]
    )
    fun getEvents(@NotNull  @RequestParam(value = "queue_id", required = true) queueId: kotlin.String
, @RequestParam(value = "last_event_id", required = false) lastEventId: kotlin.Int?
, @RequestParam(value = "dont_block", required = false, defaultValue="false") dontBlock: kotlin.Boolean
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
