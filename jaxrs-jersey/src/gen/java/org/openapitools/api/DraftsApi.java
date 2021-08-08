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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/drafts")


@io.swagger.annotations.Api(description = "the drafts API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-08T21:12:08.960239Z[Etc/UTC]")
public class DraftsApi  {
   private final DraftsApiService delegate;

   public DraftsApi(@Context ServletConfig servletContext) {
      DraftsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DraftsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DraftsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DraftsApiServiceFactory.getDraftsApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create drafts", notes = "Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response createDrafts(@ApiParam(value = "A JSON-encoded list of containing new draft objects. ") @QueryParam("drafts") @Valid  List<Draft> drafts,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createDrafts(drafts, securityContext);
    }
    @DELETE
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a draft", notes = "Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.", response = JsonError.class)
    })
    public Response deleteDraft(@ApiParam(value = "The ID of the draft you want to delete. ", required = true) @PathParam("draft_id") @NotNull  Integer draftId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteDraft(draftId, securityContext);
    }
    @PATCH
    @Path("/{draft_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Edit a draft", notes = "Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found.", response = JsonError.class)
    })
    public Response editDraft(@ApiParam(value = "The ID of the draft to be edited. ", required = true) @PathParam("draft_id") @NotNull  Integer draftId,@ApiParam(value = "A JSON-encoded object containing a replacement draft object for this ID. ", required = true) @QueryParam("draft") @NotNull @Valid  Draft draft,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.editDraft(draftId, draft, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get drafts", notes = "Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` ", response = JsonSuccess.class, tags={ "drafts", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class)
    })
    public Response getDrafts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDrafts(securityContext);
    }
}
