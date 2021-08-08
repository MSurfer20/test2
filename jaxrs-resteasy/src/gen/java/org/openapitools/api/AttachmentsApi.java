package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AttachmentsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonSuccessBase;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/attachments")


@io.swagger.annotations.Api(description = "the attachments API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T20:40:06.005587Z[Etc/UTC]")
public class AttachmentsApi  {

    @Inject AttachmentsApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get attachments", notes = "Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` ", response = JsonSuccessBase.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getAttachments(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAttachments(securityContext);
    }
}
