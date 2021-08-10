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

@Path("/calls/bigbluebutton/create")
@Api(description = "the calls API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-10T11:44:56.462938Z[Etc/UTC]")public class CallsApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Create BigBlueButton video call", notes = "Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. ", response = JsonSuccessBase.class, tags={ "streams" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class)
    })
    public Response createBigBlueButtonVideoCall() {
        return Response.ok().entity("magic!").build();
    }
}
