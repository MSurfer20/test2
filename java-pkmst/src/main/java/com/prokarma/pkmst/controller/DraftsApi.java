/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CodedError;
import com.prokarma.pkmst.model.Draft;
import com.prokarma.pkmst.model.JsonError;
import com.prokarma.pkmst.model.JsonSuccess;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen")
@Api(value = "Drafts", description = "the Drafts API")
public interface DraftsApi {

    @ApiOperation(value = "Create drafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    @PostMapping(
        value = "/drafts",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> createDrafts(@ApiParam(value = "A JSON-encoded list of containing new draft objects. ")  @RequestParam(value = "drafts", required = false) List<Draft> drafts, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Delete a draft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    @DeleteMapping(
        value = "/drafts/{draft_id}",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> deleteDraft(@ApiParam(value = "The ID of the draft you want to delete. ",required=true ) @PathVariable("draft_id") Integer draftId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Edit a draft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    @PatchMapping(
        value = "/drafts/{draft_id}",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> editDraft(@ApiParam(value = "The ID of the draft to be edited. ",required=true ) @PathVariable("draft_id") Integer draftId,@ApiParam(value = "A JSON-encoded object containing a replacement draft object for this ID. ", required = true)  @RequestParam(value = "draft", required = true) Draft draft, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get drafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    @GetMapping(
        value = "/drafts",
        produces = { "application/json" }
    )
    ResponseEntity<JsonSuccess> getDrafts( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
