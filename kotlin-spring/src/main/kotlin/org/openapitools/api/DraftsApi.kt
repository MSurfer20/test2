package org.openapitools.api

import org.openapitools.model.CodedError
import org.openapitools.model.Draft
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
class DraftsApiController() {


    @PostMapping(
        value = ["/drafts"],
        produces = ["application/json"]
    )
    fun createDrafts( @RequestParam(value = "drafts", required = false) drafts: kotlin.collections.List<Draft>?
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @DeleteMapping(
        value = ["/drafts/{draft_id}"],
        produces = ["application/json"]
    )
    fun deleteDraft( @PathVariable("draft_id") draftId: kotlin.Int
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @PatchMapping(
        value = ["/drafts/{draft_id}"],
        produces = ["application/json"]
    )
    fun editDraft( @PathVariable("draft_id") draftId: kotlin.Int
,@NotNull  @RequestParam(value = "draft", required = true) draft: Draft
): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @GetMapping(
        value = ["/drafts"],
        produces = ["application/json"]
    )
    fun getDrafts(): ResponseEntity<JsonSuccess> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
