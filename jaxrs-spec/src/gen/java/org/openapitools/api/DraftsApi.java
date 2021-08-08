package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/drafts")
@Api(description = "the drafts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:25.585041Z[Etc/UTC]")public class DraftsApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Create drafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response createDrafts(@QueryParam("drafts")   @ApiParam("A JSON-encoded list of containing new draft objects. ")  List<Draft> drafts) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{draft_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a draft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class)
    })
    public Response deleteDraft(@PathParam("draft_id") @ApiParam("The ID of the draft you want to delete. ") Integer draftId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{draft_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit a draft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class)
    })
    public Response editDraft(@PathParam("draft_id") @ApiParam("The ID of the draft to be edited. ") Integer draftId,@QueryParam("draft") @NotNull   @ApiParam("A JSON-encoded object containing a replacement draft object for this ID. ")  Draft draft) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get drafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response getDrafts() {
        return Response.ok().entity("magic!").build();
    }
}
