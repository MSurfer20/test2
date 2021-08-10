package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EventsApiService;
import org.openapitools.api.factories.EventsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/events")


@io.swagger.annotations.Api(description = "the events API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class EventsApi  {
   private final EventsApiService delegate;

   public EventsApi(@Context ServletConfig servletContext) {
      EventsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EventsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EventsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = EventsApiServiceFactory.getEventsApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an event queue", notes = "Delete a previously registered queue.  `DELETE {{ api_url }}/v1/events` ", response = JsonSuccess.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class)
    })
    public Response deleteQueue(@ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ", required = true) @QueryParam("queue_id") @NotNull  String queueId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteQueue(queueId, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get events from an event queue", notes = "`GET {{ api_url }}/v1/events`  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the `event_queue_longpoll_timeout_seconds` property returned by `POST /register` as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. ", response = JsonSuccessBase.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccessBase.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = BadEventQueueIdError.class)
    })
    public Response getEvents(@ApiParam(value = "The ID of an event queue that was previously registered via `POST /api/v1/register` (see [Register a queue](/api/register-queue)). ", required = true) @QueryParam("queue_id") @NotNull  String queueId,@ApiParam(value = "The highest event ID in this queue that you've received and wish to acknowledge. See the [code for `call_on_each_event`](https://github.com/zulip/python-zulip-api/blob/master/zulip/zulip/__init__.py) in the [zulip Python module](https://github.com/zulip/python-zulip-api) for an example implementation of correctly processing each event exactly once. ") @QueryParam("last_event_id")  Integer lastEventId,@ApiParam(value = "Set to `true` if the client is requesting a nonblocking reply. If not specified, the request will block until either a new event is available or a few minutes have passed, in which case the server will send the client a heartbeat event. ", defaultValue = "false") @DefaultValue("false") @QueryParam("dont_block")  Boolean dontBlock,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getEvents(queueId, lastEventId, dontBlock, securityContext);
    }
}
