package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonSuccessBase;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/get_stream_id")
@Api(description = "the get_stream_id API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class GetStreamIdApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get stream ID", notes = "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class)
    })
    public Response getStreamId(@QueryParam("stream") @NotNull   @ApiParam("The name of the stream to access. ")  String stream) {
        return Response.ok().entity("magic!").build();
    }
}
