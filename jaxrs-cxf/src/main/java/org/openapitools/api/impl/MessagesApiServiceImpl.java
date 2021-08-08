package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.CodedError;
import java.io.File;
import org.openapitools.model.InvalidMessageError;
import org.openapitools.model.JsonSuccess;
import org.openapitools.model.JsonSuccessBase;
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
public class MessagesApiServiceImpl implements MessagesApi {
    /**
     * Add an emoji reaction
     *
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
     *
     */
    public JsonSuccess addReaction(Integer messageId, String emojiName, String emojiCode, String reactionType) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Check if messages match a narrow
     *
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
     *
     */
    public Object checkMessagesMatchNarrow(List<Integer> msgIds, List<Object> narrow) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Delete a message
     *
     * Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     *
     */
    public JsonSuccess deleteMessage(Integer messageId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get public temporary URL
     *
     * Get a temporary URL for access to the file that doesn&#39;t require authentication. 
     *
     */
    public JsonSuccessBase getFileTemporaryUrl(Integer realmIdStr, String filename) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get a message&#39;s edit history
     *
     * Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     *
     */
    public JsonSuccessBase getMessageHistory(Integer messageId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get messages
     *
     * Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     *
     */
    public JsonSuccessBase getMessages(Integer numBefore, Integer numAfter, OneOfstringinteger anchor, List<Object> narrow, Boolean clientGravatar, Boolean applyMarkdown, Boolean useFirstUnreadAnchor) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Get a message&#39;s raw Markdown
     *
     * Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
     *
     */
    public JsonSuccessBase getRawMessage(Integer messageId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Mark all messages as read
     *
     * Marks all of the current user&#39;s unread messages as read.  &#x60;POST {{ api_url }}/v1/mark_all_as_read&#x60; 
     *
     */
    public JsonSuccess markAllAsRead() {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Mark messages in a stream as read
     *
     * Mark all the unread messages in a stream as read. 
     *
     */
    public JsonSuccess markStreamAsRead(Integer streamId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Mark messages in a topic as read
     *
     * Mark all the unread messages in a topic as read. 
     *
     */
    public JsonSuccess markTopicAsRead(Integer streamId, String topicName) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Remove an emoji reaction
     *
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
     *
     */
    public JsonSuccess removeReaction(Integer messageId, String emojiName, String emojiCode, String reactionType) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Render message
     *
     * Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
     *
     */
    public JsonSuccessBase renderMessage(String content) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Send a message
     *
     * Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
     *
     */
    public JsonSuccessBase sendMessage(String type, List<Integer> to, String content, String topic, String queueId, String localId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Edit a message
     *
     * Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     *
     */
    public JsonSuccess updateMessage(Integer messageId, String topic, String propagateMode, Boolean sendNotificationToOldThread, Boolean sendNotificationToNewThread, String content, Integer streamId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Update personal message flags
     *
     * Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     *
     */
    public JsonSuccessBase updateMessageFlags(List<Integer> messages, String op, String flag) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Upload a file
     *
     * Upload a single file and get the corresponding URI.  &#x60;POST {{ api_url }}/v1/user_uploads&#x60;  Initially, only you will be able to access the link.  To share the uploaded file, you&#39;ll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     *
     */
    public JsonSuccessBase uploadFile( Attachment filenameDetail) {
        // TODO: Implement...
        
        return null;
    }
    
}

