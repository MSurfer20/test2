package org.openapitools.api;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.GetStreamIdApiService;

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
@Path("/get_stream_id")
@RequestScoped

@Api(description = "the get_stream_id API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen")

public class GetStreamIdApi  {

  @Context SecurityContext securityContext;

  @Inject GetStreamIdApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get stream ID", notes = "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = CodedError.class) })
    public Response getStreamId( @NotNull @ApiParam(value = "The name of the stream to access. ",required=true)  @QueryParam("stream") String stream) {
        return delegate.getStreamId(stream, securityContext);
    }
}
