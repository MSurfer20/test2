/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.BadEventQueueIdError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.OneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError;
import org.openapitools.model.OneOfRateLimitedError;
import org.openapitools.model.OneOfUserDeactivatedErrorRealmDeactivatedError;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 * API tests for RealTimeEventsApi 
 */
public class RealTimeEventsApiTest {


    private RealTimeEventsApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://example.zulipchat.com/api/v1", RealTimeEventsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Delete an event queue
     *
     * Delete a previously registered queue.  &#x60;DELETE {{ api_url }}/v1/events&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQueueTest() {
        String queueId = null;
        //JsonSuccess response = api.deleteQueue(queueId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Get events from an event queue
     *
     * &#x60;GET {{ api_url }}/v1/events&#x60;  This endpoint allows you to receive new events from [a registered event queue](/api/register-queue).  Long-lived clients should use the &#x60;event_queue_longpoll_timeout_seconds&#x60; property returned by &#x60;POST /register&#x60; as the client-side HTTP request timeout for calls to this endpoint.  It is guaranteed to be higher than heartbeat frequency and should be respected by clients to avoid breaking when heartbeat frequency increases. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() {
        String queueId = null;
        Integer lastEventId = null;
        Boolean dontBlock = null;
        //JsonSuccessBase response = api.getEvents(queueId, lastEventId, dontBlock);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void realTimePostTest() {
        List<String> eventTypes = null;
        List<List<String>> narrow = null;
        Boolean allPublicStreams = null;
        //api.realTimePost(eventTypes, narrow, allPublicStreams);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Register an event queue
     *
     * &#x60;POST {{ api_url }}/v1/register&#x60;  This powerful endpoint can be used to register a Zulip \&quot;event queue\&quot; (subscribed to certain types of \&quot;events\&quot;, or updates to the messages and other Zulip data the current user has access to), as well as to fetch the current state of that data.  (&#x60;register&#x60; also powers the &#x60;call_on_each_event&#x60; Python API, and is intended primarily for complex applications for which the more convenient &#x60;call_on_each_event&#x60; API is insufficient).  This endpoint returns a &#x60;queue_id&#x60; and a &#x60;last_event_id&#x60;; these can be used in subsequent calls to the [\&quot;events\&quot; endpoint](/api/get-events) to request events from the Zulip server using long-polling.  The server will queue events for up to 10 minutes of inactivity. After 10 minutes, your event queue will be garbage-collected.  The server will send &#x60;heartbeat&#x60; events every minute, which makes it easy to implement a robust client that does not miss events unless the client loses network connectivity with the Zulip server for 10 minutes or longer.  Once the server garbage-collects your event queue, the server will [return an error](/api/get-events#bad_event_queue_id-errors) with a code of &#x60;BAD_EVENT_QUEUE_ID&#x60; if you try to fetch events from the event queue.  Your software will need to handle that error condition by re-initializing itself (e.g. this is what triggers your browser reloading the Zulip web app when your laptop comes back online after being offline for more than 10 minutes).  When prototyping with this API, we recommend first calling &#x60;register&#x60; with no &#x60;event_types&#x60; parameter to see all the available data from all supported event types.  Before using your client in production, you should set appropriate &#x60;event_types&#x60; and &#x60;fetch_event_types&#x60; filters so that your client only requests the data it needs.  A few minutes doing this often saves 90% of the total bandwidth and other resources consumed by a client using this API.  See the [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html) if you need deeper details about how the Zulip event queue system works, avoids clients needing to worry about large classes of potentially messy races, etc. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registerQueueTest() {
        Boolean applyMarkdown = null;
        Boolean clientGravatar = null;
        Boolean slimPresence = null;
        List<String> eventTypes = null;
        Boolean allPublicStreams = null;
        Boolean includeSubscribers = null;
        Object clientCapabilities = null;
        List<String> fetchEventTypes = null;
        List<List<String>> narrow = null;
        //JsonSuccessBase response = api.registerQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Error handling
     *
     * Common error to many endpoints 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restErrorHandlingTest() {
        //api.restErrorHandling();
        
        // TODO: test validations
        
        
    }
    
}
