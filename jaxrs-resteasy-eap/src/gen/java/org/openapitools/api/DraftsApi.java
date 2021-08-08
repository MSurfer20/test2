package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/drafts")


@io.swagger.annotations.Api(description = "the drafts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2021-08-08T21:20:09.368890Z[Etc/UTC]")
public interface DraftsApi  {
   
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create drafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response createDrafts(  @QueryParam("drafts") List<Draft> drafts,@Context SecurityContext securityContext);
    @DELETE
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a draft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    public Response deleteDraft( @PathParam("draft_id") Integer draftId,@Context SecurityContext securityContext);
    @PATCH
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit a draft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    public Response editDraft( @PathParam("draft_id") Integer draftId, @NotNull  @QueryParam("draft") Draft draft,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get drafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public Response getDrafts(@Context SecurityContext securityContext);
}
