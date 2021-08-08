package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CallsApiService;
import org.openapitools.api.factories.CallsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/calls/bigbluebutton/create")


@io.swagger.annotations.Api(description = "the calls API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-08T20:41:44.271935Z[Etc/UTC]")
public class CallsApi  {
   private final CallsApiService delegate = CallsApiServiceFactory.getCallsApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create BigBlueButton video call", notes = "Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. ", response = JsonSuccessBase.class, tags={ "streams", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response createBigBlueButtonVideoCall()
    throws NotFoundException {
        return delegate.createBigBlueButtonVideoCall();
    }
}
