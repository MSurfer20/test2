package org.openapitools.api;

import org.openapitools.model.JsonSuccessBase;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/attachments")
@Api(description = "the attachments API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class AttachmentsApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get attachments", notes = "Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` ", response = JsonSuccessBase.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response getAttachments() {
        return Response.ok().entity("magic!").build();
    }
}
