package org.openapitools.api

import org.openapitools.model.JsonError
import org.openapitools.model.JsonSuccess
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
class TypingApiController() {


    @PostMapping(
        value = ["/typing"],
        produces = ["application/json"]
    )
    fun setTypingStatus(@NotNull  @RequestParam(value = "op", required = true) op: kotlin.String
,@NotNull  @RequestParam(value = "to", required = true) to: kotlin.collections.List<kotlin.Int>
, @RequestParam(value = "type", required = false, defaultValue="private") type: kotlin.String
, @RequestParam(value = "topic", required = false) topic: kotlin.String?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
