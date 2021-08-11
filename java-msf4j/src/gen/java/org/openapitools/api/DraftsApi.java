package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DraftsApiService;
import org.openapitools.api.factories.DraftsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/drafts")


@io.swagger.annotations.Api(description = "the drafts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen")
public class DraftsApi  {
   private final DraftsApiService delegate = DraftsApiServiceFactory.getDraftsApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create drafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccess.class) })
    public Response createDrafts(@ApiParam(value = "A JSON-encoded list of containing new draft objects. ") @QueryParam("drafts") List<Draft> drafts
)
    throws NotFoundException {
        return delegate.createDrafts(drafts);
    }
    @DELETE
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a draft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.", response = JsonSuccess.class) })
    public Response deleteDraft(@ApiParam(value = "The ID of the draft you want to delete. ",required=true) @PathParam("draft_id") Integer draftId
)
    throws NotFoundException {
        return delegate.deleteDraft(draftId);
    }
    @PATCH
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit a draft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.", response = JsonSuccess.class) })
    public Response editDraft(@ApiParam(value = "The ID of the draft to be edited. ",required=true) @PathParam("draft_id") Integer draftId
,@ApiParam(value = "A JSON-encoded object containing a replacement draft object for this ID. ",required=true) @QueryParam("draft") Draft draft
)
    throws NotFoundException {
        return delegate.editDraft(draftId,draft);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get drafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response getDrafts()
    throws NotFoundException {
        return delegate.getDrafts();
    }
}
