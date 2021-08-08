package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ZulipOutgoingWebhookApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.InlineResponse200;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/zulip-outgoing-webhook")


@io.swagger.annotations.Api(description = "the zulip-outgoing-webhook API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-08T21:12:17.400215Z[Etc/UTC]")
public class ZulipOutgoingWebhookApi  {

    @Inject ZulipOutgoingWebhookApiService service;

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Outgoing webhooks", notes = "Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. ", response = InlineResponse200.class, tags={ "webhooks", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success ", response = InlineResponse200.class) })
    public Response zulipOutgoingWebhooks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.zulipOutgoingWebhooks(securityContext);
    }
}
