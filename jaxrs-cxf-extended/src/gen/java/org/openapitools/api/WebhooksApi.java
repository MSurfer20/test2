package org.openapitools.api;

import org.openapitools.model.InlineResponse200;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("/zulip-outgoing-webhook")
@Api(value = "/", description = "")
public interface WebhooksApi  {

    /**
     * Outgoing webhooks
     *
     * Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
     *
     */
    @POST
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Outgoing webhooks", tags={ "webhooks" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success ", response = InlineResponse200.class) })
    public InlineResponse200 zulipOutgoingWebhooks();
}

