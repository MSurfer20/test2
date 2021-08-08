package org.openapitools.api

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
class RealmApiController() {


    @PostMapping(
        value = ["/realm/playgrounds"],
        produces = ["application/json"]
    )
    fun addCodePlayground(@NotNull  @RequestParam(value = "name", required = true) name: kotlin.String
,@NotNull  @RequestParam(value = "pygments_language", required = true) pygmentsLanguage: kotlin.String
,@NotNull  @RequestParam(value = "url_prefix", required = true) urlPrefix: kotlin.String
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/realm/filters"],
        produces = ["application/json"]
    )
    fun addLinkifier(@NotNull  @RequestParam(value = "pattern", required = true) pattern: kotlin.String
,@NotNull  @RequestParam(value = "url_format_string", required = true) urlFormatString: kotlin.String
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/realm/profile_fields"],
        produces = ["application/json"]
    )
    fun createCustomProfileField(@NotNull  @RequestParam(value = "field_type", required = true) fieldType: kotlin.Int
, @RequestParam(value = "name", required = false) name: kotlin.String?
, @RequestParam(value = "hint", required = false) hint: kotlin.String?
, @RequestParam(value = "field_data", required = false) fieldData: kotlin.Any?
): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/realm/emoji"],
        produces = ["application/json"]
    )
    fun getCustomEmoji(): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/realm/profile_fields"],
        produces = ["application/json"]
    )
    fun getCustomProfileFields(): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/realm/linkifiers"],
        produces = ["application/json"]
    )
    fun getLinkifiers(): ResponseEntity<JsonSuccessBase> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/realm/playgrounds/{playground_id}"],
        produces = ["application/json"]
    )
    fun removeCodePlayground( @PathVariable("playground_id") playgroundId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/realm/filters/{filter_id}"],
        produces = ["application/json"]
    )
    fun removeLinkifier( @PathVariable("filter_id") filterId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/realm/profile_fields"],
        produces = ["application/json"]
    )
    fun reorderCustomProfileFields(@NotNull  @RequestParam(value = "order", required = true) order: kotlin.collections.List<kotlin.Int>
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/realm/filters/{filter_id}"],
        produces = ["application/json"]
    )
    fun updateLinkifier( @PathVariable("filter_id") filterId: kotlin.Int
,@NotNull  @RequestParam(value = "pattern", required = true) pattern: kotlin.String
,@NotNull  @RequestParam(value = "url_format_string", required = true) urlFormatString: kotlin.String
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PostMapping(
        value = ["/realm/emoji/{emoji_name}"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun uploadCustomEmoji( @PathVariable("emoji_name") emojiName: kotlin.String
, @Valid @RequestPart("file") filename: org.springframework.core.io.Resource?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
