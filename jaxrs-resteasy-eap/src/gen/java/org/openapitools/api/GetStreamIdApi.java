package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/get_stream_id")


@io.swagger.annotations.Api(description = "the get_stream_id API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen")
public interface GetStreamIdApi  {
   
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get stream ID", notes = "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response getStreamId( @NotNull  @QueryParam("stream") String stream,@Context SecurityContext securityContext);
}
