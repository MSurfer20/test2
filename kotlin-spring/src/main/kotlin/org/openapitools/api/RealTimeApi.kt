package org.openapitools.api

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
class RealTimeApiController() {


    @PostMapping(
        value = ["/real-time"]
    )
    fun realTimePost( @RequestParam(value = "event_types", required = false) eventTypes: kotlin.collections.List<kotlin.String>?
, @RequestParam(value = "narrow", required = false) narrow: kotlin.collections.List<kotlin.collections.List<kotlin.String>>?
, @RequestParam(value = "all_public_streams", required = false, defaultValue="false") allPublicStreams: kotlin.Boolean
): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
