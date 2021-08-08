package org.openapitools.api;

import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.ServerSettingsApiService;

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
@Path("/server_settings")
@RequestScoped

@Api(description = "the server_settings API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-08T21:19:56.888133Z[Etc/UTC]")

public class ServerSettingsApi  {

  @Context SecurityContext securityContext;

  @Inject ServerSettingsApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get server settings", notes = "Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). ", response = JsonSuccessBase.class, tags={ "server_and_organizations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public Response getServerSettings() {
        return delegate.getServerSettings(securityContext);
    }
}
