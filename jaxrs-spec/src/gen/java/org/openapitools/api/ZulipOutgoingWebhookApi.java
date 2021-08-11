package org.openapitools.api;

import org.openapitools.model.InlineResponse200;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/zulip-outgoing-webhook")
@Api(description = "the zulip-outgoing-webhook API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class ZulipOutgoingWebhookApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Outgoing webhooks", notes = "Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. ", response = InlineResponse200.class, tags={ "webhooks" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success ", response = InlineResponse200.class)
    })
    public Response zulipOutgoingWebhooks() {
        return Response.ok().entity("magic!").build();
    }
}
