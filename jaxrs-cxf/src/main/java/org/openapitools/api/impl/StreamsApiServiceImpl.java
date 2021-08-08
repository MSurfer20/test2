package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CodedError;
import org.openapitools.model.JsonError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
import org.openapitools.model.NonExistingStreamError;
import org.openapitools.model.OneOfobjectobject;
import org.openapitools.model.OneOfstringinteger;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Zulip REST API
 *
 * <p>Powerful open source group chat 
 *
 */
public class StreamsApiServiceImpl implements StreamsApi {
    /**
     * Archive a stream
     *
     * [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     */
    public JsonSuccess archiveStream(Integer streamId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Create BigBlueButton video call
     *
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     *
     */
    public JsonSuccessBase createBigBlueButtonVideoCall() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get stream ID
     *
     * Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
     *
     */
    public JsonSuccessBase getStreamId(String stream) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get topics in a stream
     *
     * Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
     *
     */
    public JsonSuccessBase getStreamTopics(Integer streamId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get all streams
     *
     * Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
     *
     */
    public JsonSuccessBase getStreams(Boolean includePublic, Boolean includeWebPublic, Boolean includeSubscribed, Boolean includeAllActive, Boolean includeDefault, Boolean includeOwnerSubscribed) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get subscription status
     *
     * Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
     *
     */
    public JsonSuccessBase getSubscriptionStatus(Integer userId, Integer streamId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get subscribed streams
     *
     * Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
     *
     */
    public JsonSuccessBase getSubscriptions(Boolean includeSubscribers) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Topic muting
     *
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
     *
     */
    public JsonSuccess muteTopic(String topic, String op, String stream, Integer streamId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Subscribe to a stream
     *
     * Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
     *
     */
    public OneOfobjectobject subscribe(List<Object> subscriptions, List<OneOfstringinteger> principals, Boolean authorizationErrorsFatal, Boolean announce, Boolean inviteOnly, Boolean historyPublicToSubscribers, Integer streamPostPolicy, OneOfstringinteger messageRetentionDays) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Unsubscribe from a stream
     *
     * Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
     *
     */
    public JsonSuccessBase unsubscribe(List<String> subscriptions, List<OneOfstringinteger> principals) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Update a stream
     *
     * Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
     *
     */
    public JsonSuccess updateStream(Integer streamId, String description, String newName, Boolean isPrivate, Boolean isAnnouncementOnly, Integer streamPostPolicy, Boolean historyPublicToSubscribers, OneOfstringinteger messageRetentionDays) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Update subscription settings
     *
     * This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
     *
     */
    public JsonSuccessBase updateSubscriptionSettings(List<Object> subscriptionData) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Update subscriptions
     *
     * Update which streams you are are subscribed to. 
     *
     */
    public JsonSuccessBase updateSubscriptions(List<String> delete, List<Object> add) {
        // TODO: Implement...
        
        return null;
    }
    
}

