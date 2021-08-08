package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.api.DraftsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/drafts")
@RequestScoped

@Api(description = "the drafts API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")

public class DraftsApi  {

  @Context SecurityContext securityContext;

  @Inject DraftsApiService delegate;


    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create drafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response createDrafts(@ApiParam(value = "A JSON-encoded list of containing new draft objects. ")  @QueryParam("drafts") List<Draft> drafts) {
        return delegate.createDrafts(drafts, securityContext);
    }

    @DELETE
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a draft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    public Response deleteDraft(@ApiParam(value = "The ID of the draft you want to delete. ",required=true) @PathParam("draft_id") Integer draftId) {
        return delegate.deleteDraft(draftId, securityContext);
    }

    @PATCH
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit a draft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    public Response editDraft(@ApiParam(value = "The ID of the draft to be edited. ",required=true) @PathParam("draft_id") Integer draftId,  @NotNull @ApiParam(value = "A JSON-encoded object containing a replacement draft object for this ID. ",required=true)  @QueryParam("draft") Draft draft) {
        return delegate.editDraft(draftId, draft, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get drafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response getDrafts() {
        return delegate.getDrafts(securityContext);
    }
}
