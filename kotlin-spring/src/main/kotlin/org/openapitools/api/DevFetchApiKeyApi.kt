package org.openapitools.api

import org.openapitools.model.ApiKeyResponse
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
class DevFetchApiKeyApiController() {


    @PostMapping(
        value = ["/dev_fetch_api_key"],
        produces = ["application/json"]
    )
    fun devFetchApiKey(@NotNull  @RequestParam(value = "username", required = true) username: kotlin.String
): ResponseEntity<ApiKeyResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
