package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RealTimeApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;

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

@Path("/real-time")


@io.swagger.annotations.Api(description = "the real-time API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-10T11:44:49.803797Z[Etc/UTC]")
public class RealTimeApi  {

    @Inject RealTimeApiService service;

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "(Ignored) ", response = Void.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class) })
    public Response realTimePost(  @QueryParam("event_types") List<String> eventTypes,  @QueryParam("narrow") List<List<String>> narrow,  @DefaultValue("false") @QueryParam("all_public_streams") Boolean allPublicStreams,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.realTimePost(eventTypes,narrow,allPublicStreams,securityContext);
    }
}
