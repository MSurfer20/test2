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

import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.NonExistingStreamError;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 * API tests for StreamsApi.
 */
public class StreamsApiTest {

    private StreamsApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://example.zulipchat.com/api/v1", StreamsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Archive a stream
     *
     * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void archiveStreamTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer streamId = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccess response = api.archiveStream(streamId);
        // TODO: complete test assertions
    }
    
    /**
     * Create BigBlueButton video call
     *
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createBigBlueButtonVideoCallTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.createBigBlueButtonVideoCall();
        // TODO: complete test assertions
    }
    
    /**
     * Get stream ID
     *
     * Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getStreamIdTest() throws Exception {
        // TODO: assign appropriate parameter values
        String stream = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.getStreamId(stream);
        // TODO: complete test assertions
    }
    
    /**
     * Get topics in a stream
     *
     * Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getStreamTopicsTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer streamId = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.getStreamTopics(streamId);
        // TODO: complete test assertions
    }
    
    /**
     * Get all streams
     *
     * Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getStreamsTest() throws Exception {
        // TODO: assign appropriate parameter values
        Boolean includePublic = null;
        Boolean includeWebPublic = null;
        Boolean includeSubscribed = null;
        Boolean includeAllActive = null;
        Boolean includeDefault = null;
        Boolean includeOwnerSubscribed = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.getStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
        // TODO: complete test assertions
    }
    
    /**
     * Get subscription status
     *
     * Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getSubscriptionStatusTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer userId = null;
        Integer streamId = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.getSubscriptionStatus(userId, streamId);
        // TODO: complete test assertions
    }
    
    /**
     * Get subscribed streams
     *
     * Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getSubscriptionsTest() throws Exception {
        // TODO: assign appropriate parameter values
        Boolean includeSubscribers = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.getSubscriptions(includeSubscribers);
        // TODO: complete test assertions
    }
    
    /**
     * Topic muting
     *
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void muteTopicTest() throws Exception {
        // TODO: assign appropriate parameter values
        String topic = null;
        String op = null;
        String stream = null;
        Integer streamId = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccess response = api.muteTopic(topic, op, stream, streamId);
        // TODO: complete test assertions
    }
    
    /**
     * Subscribe to a stream
     *
     * Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void subscribeTest() throws Exception {
        // TODO: assign appropriate parameter values
        List<Object> subscriptions = null;
        List<OneOfstringinteger> principals = null;
        Boolean authorizationErrorsFatal = null;
        Boolean announce = null;
        Boolean inviteOnly = null;
        Boolean historyPublicToSubscribers = null;
        Integer streamPostPolicy = null;
        OneOfstringinteger messageRetentionDays = null;

        // TODO: delete this line and uncomment the next
        // OneOfobjectobject response = api.subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
        // TODO: complete test assertions
    }
    
    /**
     * Unsubscribe from a stream
     *
     * Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void unsubscribeTest() throws Exception {
        // TODO: assign appropriate parameter values
        List<String> subscriptions = null;
        List<OneOfstringinteger> principals = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.unsubscribe(subscriptions, principals);
        // TODO: complete test assertions
    }
    
    /**
     * Update a stream
     *
     * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void updateStreamTest() throws Exception {
        // TODO: assign appropriate parameter values
        Integer streamId = null;
        String description = null;
        String newName = null;
        Boolean isPrivate = null;
        Boolean isAnnouncementOnly = null;
        Integer streamPostPolicy = null;
        Boolean historyPublicToSubscribers = null;
        OneOfstringinteger messageRetentionDays = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccess response = api.updateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
        // TODO: complete test assertions
    }
    
    /**
     * Update subscription settings
     *
     * This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void updateSubscriptionSettingsTest() throws Exception {
        // TODO: assign appropriate parameter values
        List<Object> subscriptionData = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.updateSubscriptionSettings(subscriptionData);
        // TODO: complete test assertions
    }
    
    /**
     * Update subscriptions
     *
     * Update which streams you are are subscribed to. 
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void updateSubscriptionsTest() throws Exception {
        // TODO: assign appropriate parameter values
        List<String> delete = null;
        List<Object> add = null;

        // TODO: delete this line and uncomment the next
        // JsonSuccessBase response = api.updateSubscriptions(delete, add);
        // TODO: complete test assertions
    }
    
}
