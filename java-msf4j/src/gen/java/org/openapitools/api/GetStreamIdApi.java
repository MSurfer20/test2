package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.GetStreamIdApiService;
import org.openapitools.api.factories.GetStreamIdApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonSuccessBase;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/get_stream_id")


@io.swagger.annotations.Api(description = "the get_stream_id API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T20:39:29.446170Z[Etc/UTC]")
public class GetStreamIdApi  {
   private final GetStreamIdApiService delegate = GetStreamIdApiServiceFactory.getGetStreamIdApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get stream ID", notes = "Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonSuccessBase.class) })
    public Response getStreamId(@ApiParam(value = "The name of the stream to access. ",required=true) @QueryParam("stream") String stream
)
    throws NotFoundException {
        return delegate.getStreamId(stream);
    }
}
