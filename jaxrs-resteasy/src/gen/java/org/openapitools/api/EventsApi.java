package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EventsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

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

@Path("/events")


@io.swagger.annotations.Api(description = "the events API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-08-10T11:44:49.803797Z[Etc/UTC]")
public class EventsApi  {

    @Inject EventsApiService service;

    @DELETE
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an event queue", notes = "Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` ", response = JsonSuccess.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    public Response deleteQueue( @NotNull  @QueryParam("queue_id") String queueId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteQueue(queueId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get events from an event queue", notes = "`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. ", response = JsonSuccessBase.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    public Response getEvents( @NotNull  @QueryParam("queue_id") String queueId,  @QueryParam("last_event_id") Integer lastEventId,  @DefaultValue("false") @QueryParam("dont_block") Boolean dontBlock,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getEvents(queueId,lastEventId,dontBlock,securityContext);
    }
}
