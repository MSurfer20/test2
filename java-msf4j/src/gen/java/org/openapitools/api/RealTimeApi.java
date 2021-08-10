package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RealTimeApiService;
import org.openapitools.api.factories.RealTimeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/real-time")


@io.swagger.annotations.Api(description = "the real-time API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-08-10T11:44:15.430476Z[Etc/UTC]")
public class RealTimeApi  {
   private final RealTimeApiService delegate = RealTimeApiServiceFactory.getRealTimeApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "(Ignored) ", response = Void.class, tags={ "real_time_events", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class) })
    public Response realTimePost(@ApiParam(value = "A JSON-encoded array indicating which types of events you're interested in. Values that you might find useful include:    * **message** (messages)   * **subscription** (changes in your subscriptions)   * **realm_user** (changes to users in the organization and     their properties, such as their name).  If you do not specify this parameter, you will receive all events, and have to filter out the events not relevant to your client in your client code.  For most applications, one is only interested in messages, so one specifies: `event_types=['message']`  Event types not supported by the server are ignored, in order to simplify the implementation of client apps that support multiple server versions. ") @QueryParam("event_types") List<String> eventTypes
,@ApiParam(value = "A JSON-encoded array of arrays of length 2 indicating the narrow for which you'd like to receive events for. For instance, to receive events for the stream `Denmark`, you would specify `narrow=[['stream', 'Denmark']]`.  Another example is `narrow=[['is', 'private']]` for private messages. Default is `[]`. ") @QueryParam("narrow") List<List<String>> narrow
,@ApiParam(value = "Whether you would like to request message events from all public streams.  Useful for workflow bots that you'd like to see all new messages sent to public streams.  (You can also subscribe the user to private streams). ", defaultValue="false") @DefaultValue("false") @QueryParam("all_public_streams") Boolean allPublicStreams
)
    throws NotFoundException {
        return delegate.realTimePost(eventTypes,narrow,allPublicStreams);
    }
}
