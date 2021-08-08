package org.openapitools.api;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;

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

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface RealTimeEventsApi  {

    /**
     * Delete an event queue
     *
     * Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
     *
     */
    @DELETE
    @Path("/events")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an event queue", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    public JsonSuccess deleteQueue(@QueryParam("queue_id") String queueId);

    /**
     * Get events from an event queue
     *
     * &#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     *
     */
    @GET
    @Path("/events")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get events from an event queue", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class) })
    public JsonSuccessBase getEvents(@QueryParam("queue_id") String queueId, @QueryParam("last_event_id") Integer lastEventId, @QueryParam("dont_block") @DefaultValue("false")Boolean dontBlock);

    @POST
    @Path("/real-time")
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success") })
    public void realTimePost(@QueryParam("event_types") List<String> eventTypes, @QueryParam("narrow") List<List<String>> narrow, @QueryParam("all_public_streams") @DefaultValue("false")Boolean allPublicStreams);

    /**
     * Register an event queue
     *
     * &#x60;POST {{ api_url }}/v1/register&#x60;  This powerful endpoint can be used to register a Zulip \&quot;event queue\&quot; (subscribed to certain types of \&quot;events\&quot;, or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (&#x60;register&#x60; also powers the &#x60;call_on_each_event&#x60; Python API, and is intended primarily for complex applications for which the more convenient &#x60;call_on_each_event&#x60; API is insufficient).  This endpoint returns a &#x60;queue_id&#x60; and a &#x60;last_event_id&#x60;; these can be used in subsequent calls to the [\&quot;events\&quot; endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send &#x60;heartbeat&#x60; events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of &#x60;BAD_EVENT_QUEUE_ID&#x60; if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling &#x60;register&#x60; with no &#x60;event_types&#x60; parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate &#x60;event_types&#x60; and &#x60;fetch_event_types&#x60; filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     *
     */
    @POST
    @Path("/register")
    @Produces({ "application/json" })
    @ApiOperation(value = "Register an event queue", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class) })
    public JsonSuccessBase registerQueue(@QueryParam("apply_markdown") @DefaultValue("false")Boolean applyMarkdown, @QueryParam("client_gravatar") @DefaultValue("false")Boolean clientGravatar, @QueryParam("slim_presence") @DefaultValue("false")Boolean slimPresence, @QueryParam("event_types") List<String> eventTypes, @QueryParam("all_public_streams") @DefaultValue("false")Boolean allPublicStreams, @QueryParam("include_subscribers") @DefaultValue("false")Boolean includeSubscribers, @QueryParam("client_capabilities") Object clientCapabilities, @QueryParam("fetch_event_types") List<String> fetchEventTypes, @QueryParam("narrow") List<List<String>> narrow);

    /**
     * Error handling
     *
     * Common error to many endpoints 
     *
     */
    @POST
    @Path("/rest-error-handling")
    @Produces({ "application/json" })
    @ApiOperation(value = "Error handling", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Bad request. ", response = OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.class),
        @ApiResponse(code = 401, message = "Unauthorized. ", response = OneOfUserDeactivatedErrorRealmDeactivatedError.class),
        @ApiResponse(code = 429, message = "Rate limit exceeded. ", response = OneOfRateLimitedError.class) })
    public void restErrorHandling();
}

