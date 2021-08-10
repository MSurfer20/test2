package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.TypingApiService;
import org.openapitools.api.factories.TypingApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

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

@Path("/typing")


@io.swagger.annotations.Api(description = "the typing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-08-10T11:44:46.274064Z[Etc/UTC]")
public class TypingApi  {
   private final TypingApiService delegate;

   public TypingApi(@Context ServletConfig servletContext) {
      TypingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TypingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TypingApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TypingApiServiceFactory.getTypingApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Set \"typing\" status", notes = "Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. ", response = JsonSuccess.class, tags={ "users", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response setTypingStatus(@ApiParam(value = "Whether the user has started (`start`) or stopped (`stop`) to type. ", required = true, allowableValues="start, stop") @QueryParam("op") @NotNull  String op,@ApiParam(value = "For 'private' type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For 'stream' type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). ", required = true) @QueryParam("to") @NotNull @Valid  List<Integer> to,@ApiParam(value = "Type of the message being composed. ", allowableValues="private, stream", defaultValue = "private") @DefaultValue("private") @QueryParam("type")  String type,@ApiParam(value = "Topic to which message is being typed. Required for the 'stream' type. Ignored in case of 'private' type. ") @QueryParam("topic")  String topic,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.setTypingStatus(op, to, type, topic, securityContext);
    }
}
