/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-08T21:15:36.024879Z[Etc/UTC]")
@Validated
@Api(value = "drafts", description = "the drafts API")
public interface DraftsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /drafts : Create drafts
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
     *
     * @param drafts A JSON-encoded list of containing new draft objects.  (optional)
     * @return Success. (status code 200)
     *         or Bad request. (status code 400)
     */
    @ApiOperation(value = "Create drafts", nickname = "createDrafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @PostMapping(
        value = "/drafts",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> createDrafts(@ApiParam(value = "A JSON-encoded list of containing new draft objects. ") @Valid @RequestParam(value = "drafts", required = false) List<Draft> drafts) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /drafts/{draft_id} : Delete a draft
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     * @param draftId The ID of the draft you want to delete.  (required)
     * @return Success. (status code 200)
     *         or Not Found. (status code 404)
     */
    @ApiOperation(value = "Delete a draft", nickname = "deleteDraft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    @DeleteMapping(
        value = "/drafts/{draft_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> deleteDraft(@ApiParam(value = "The ID of the draft you want to delete. ",required=true) @PathVariable("draft_id") Integer draftId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /drafts/{draft_id} : Edit a draft
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     * @param draftId The ID of the draft to be edited.  (required)
     * @param draft A JSON-encoded object containing a replacement draft object for this ID.  (required)
     * @return Success. (status code 200)
     *         or Not Found. (status code 404)
     */
    @ApiOperation(value = "Edit a draft", nickname = "editDraft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    @PatchMapping(
        value = "/drafts/{draft_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> editDraft(@ApiParam(value = "The ID of the draft to be edited. ",required=true) @PathVariable("draft_id") Integer draftId,@NotNull @ApiParam(value = "A JSON-encoded object containing a replacement draft object for this ID. ", required = true) @Valid Draft draft) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /drafts : Get drafts
     * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
     *
     * @return Success. (status code 200)
     */
    @ApiOperation(value = "Get drafts", nickname = "getDrafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @GetMapping(
        value = "/drafts",
        produces = { "application/json" }
    )
    default ResponseEntity<JsonSuccess> getDrafts() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
