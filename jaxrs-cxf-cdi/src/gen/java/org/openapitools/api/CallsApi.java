package org.openapitools.api;

import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.CallsApiService;

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
@Path("/calls/bigbluebutton/create")
@RequestScoped

@Api(description = "the calls API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")

public class CallsApi  {

  @Context SecurityContext securityContext;

  @Inject CallsApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Create BigBlueButton video call", notes = "Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response createBigBlueButtonVideoCall() {
        return delegate.createBigBlueButtonVideoCall(securityContext);
    }
}
