package org.openapitools.api;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.api.EventsApiService;

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
@Path("/events")
@RequestScoped

@Api(description = "the events API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-08-09T21:33:58.385931Z[Etc/UTC]")

public class EventsApi  {

  @Context SecurityContext securityContext;

  @Inject EventsApiService delegate;


    @DELETE
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an event queue", notes = "Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` ", response = JsonSuccess.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    public Response deleteQueue( @NotNull @ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ",required=true)  @QueryParam("queue_id") String queueId) {
        return delegate.deleteQueue(queueId, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get events from an event queue", notes = "`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. ", response = JsonSuccessBase.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    public Response getEvents( @NotNull @ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ",required=true)  @QueryParam("queue_id") String queueId, @ApiParam(value = "The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. ")  @QueryParam("last_event_id") Integer lastEventId, @ApiParam(value = "Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. ", defaultValue="false") @DefaultValue("false")  @QueryParam("dont_block") Boolean dontBlock) {
        return delegate.getEvents(queueId, lastEventId, dontBlock, securityContext);
    }
}
