package org.openapitools.api;

import org.openapitools.model.InlineResponse200;
import org.openapitools.api.ZulipOutgoingWebhookApiService;

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
@Path("/zulip-outgoing-webhook")
@RequestScoped

@Api(description = "the zulip-outgoing-webhook API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-10T11:44:42.621439Z[Etc/UTC]")

public class ZulipOutgoingWebhookApi  {

  @Context SecurityContext securityContext;

  @Inject ZulipOutgoingWebhookApiService delegate;


    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Outgoing webhooks", notes = "Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. ", response = InlineResponse200.class, tags={ "webhooks" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success ", response = InlineResponse200.class) })
    public Response zulipOutgoingWebhooks() {
        return delegate.zulipOutgoingWebhooks(securityContext);
    }
}
