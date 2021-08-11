package org.openapitools.api;

import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/typing")
@Api(description = "the typing API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class TypingApi {

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "Set \"typing\" status", notes = "Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. ", response = JsonSuccess.class, tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = JsonSuccess.class),
        @ApiResponse(code = 400, message = "Bad request.", response = JsonError.class)
    })
    public Response setTypingStatus(@QueryParam("op") @NotNull   @ApiParam("Whether the user has started (&#x60;start&#x60;) or stopped (&#x60;stop&#x60;) to type. ")  String op,@QueryParam("to") @NotNull   @ApiParam("For &#39;private&#39; type it is the user_ids of the recipients of the message being typed. Send a JSON-encoded list of user_ids. (Use a list even if there is only one recipient.)  For &#39;stream&#39; type it is a single element list containing ID of stream in which the message is being typed.  **Changes**: Before Zulip 2.0, this parameter accepted only a JSON-encoded list of email addresses.  Support for the email address-based format was removed in Zulip 3.0 (feature level 11). ")  List<Integer> to,@QueryParam("type")  @DefaultValue("private")  @ApiParam("Type of the message being composed. ")  String type,@QueryParam("topic")   @ApiParam("Topic to which message is being typed. Required for the &#39;stream&#39; type. Ignored in case of &#39;private&#39; type. ")  String topic) {
        return Response.ok().entity("magic!").build();
    }
}
