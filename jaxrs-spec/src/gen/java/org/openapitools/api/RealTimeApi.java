package org.openapitools.api;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/real-time")
@Api(description = "the real-time API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-08-08T21:12:21.729821Z[Etc/UTC]")public class RealTimeApi {

    @POST
    @ApiOperation(value = "", notes = "(Ignored) ", response = Void.class, tags={ "real_time_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class)
    })
    public Response realTimePost(@QueryParam("event_types")   @ApiParam("A JSON-encoded array indicating which types of events you&#39;re interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: &#x60;event_types&#x3D;[&#39;message&#39;]&#x60;  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. ")  List<String> eventTypes,@QueryParam("narrow")   @ApiParam("A JSON-encoded array of arrays of length 2 indicating the narrow for which you&#39;d like to receive events for. For instance, to receive events for the stream &#x60;Denmark&#x60;, you would specify &#x60;narrow&#x3D;[[&#39;stream&#39;, &#39;Denmark&#39;]]&#x60;.  Another example is &#x60;narrow&#x3D;[[&#39;is&#39;, &#39;private&#39;]]&#x60; for private messages. Default is &#x60;[]&#x60;. ")  List<List<String>> narrow,@QueryParam("all_public_streams")  @DefaultValue("false")  @ApiParam("Whether you would like to request message events from all public streams.  Useful for workflow bots that you&#39;d like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). ")  Boolean allPublicStreams) {
        return Response.ok().entity("magic!").build();
    }
}
