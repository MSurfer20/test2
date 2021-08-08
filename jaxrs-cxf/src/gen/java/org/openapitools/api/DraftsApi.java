package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.Draft;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("/drafts")
@Api(value = "/", description = "")
public interface DraftsApi  {

    /**
     * Create drafts
     *
     * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;POST {{ api_url }}/v1/drafts&#x60; 
     *
     */
    @POST
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create drafts", tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public JsonSuccess createDrafts(@QueryParam("drafts")  List<Draft> drafts);

    /**
     * Delete a draft
     *
     * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a &#x60;drafts&#x60; event.  &#x60;DELETE {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     */
    @DELETE
    @Path("/{draft_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a draft", tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    public JsonSuccess deleteDraft(@PathParam("draft_id") Integer draftId);

    /**
     * Edit a draft
     *
     * Edit a draft on the server. The edit will be automatically synchronized to other clients via &#x60;drafts&#x60; events.  &#x60;PATCH {{ api_url }}/v1/drafts/{draft_id}&#x60; 
     *
     */
    @PATCH
    @Path("/{draft_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit a draft", tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 404, message = "Not Found.", response = JsonError.class) })
    public JsonSuccess editDraft(@PathParam("draft_id") Integer draftId, @QueryParam("draft") @NotNull  Draft draft);

    /**
     * Get drafts
     *
     * Fetch all drafts for the current user.  &#x60;GET {{ api_url }}/v1/drafts&#x60; 
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get drafts", tags={ "drafts" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class) })
    public JsonSuccess getDrafts();
}

