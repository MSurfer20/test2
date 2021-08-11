package org.openapitools.api;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/events")
@Api(description = "the events API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class EventsApi {

    @DELETE
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an event queue", notes = "Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` ", response = JsonSuccess.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class)
    })
    public Response deleteQueue(@QueryParam("queue_id") @NotNull   @ApiParam("The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). ")  String queueId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get events from an event queue", notes = "`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. ", response = JsonSuccessBase.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class)
    })
    public Response getEvents(@QueryParam("queue_id") @NotNull   @ApiParam("The ID of an event queue that was previously registered via &#x60;POST /api/v1/register&#x60; (see [Register a queue](/api/register-queue)). ")  String queueId,@QueryParam("last_event_id")   @ApiParam("The highest event ID in this queue that you&#39;ve received and wish to acknowledge. See the [code for &#x60;call_on_each_event&#x60;](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. ")  Integer lastEventId,@QueryParam("dont_block")  @DefaultValue("false")  @ApiParam("Set to &#x60;true&#x60; if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. ")  Boolean dontBlock) {
        return Response.ok().entity("magic!").build();
    }
}
