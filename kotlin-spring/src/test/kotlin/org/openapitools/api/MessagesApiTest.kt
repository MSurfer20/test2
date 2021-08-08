package org.openapitools.api

import org.openapitools.model.AnyType
import org.openapitools.model.CodedError
import org.openapitools.model.InvalidMessageError
import org.openapitools.model.JsonSuccess
import org.openapitools.model.JsonSuccessBase
import org.openapitools.model.OneOfLessThanObjectCommaObjectGreaterThan
import org.openapitools.model.OneOfLessThanStringCommaIntegerGreaterThan
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class MessagesApiTest {

    
    private val api: MessagesApiController = MessagesApiController()

    
    /**
    * Add an emoji reaction
    *
    * Add an [emoji reaction](/help/emoji-reactions) to a message.  &#x60;POST {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun addReactionTest() {
        val messageId:kotlin.Int? = null
        val emojiName:kotlin.String? = null
        val emojiCode:kotlin.String? = null
        val reactionType:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.addReaction(messageId!!, emojiName!!, emojiCode!!, reactionType!!)

        // TODO: test validations
    }
    
    /**
    * Check if messages match a narrow
    *
    * Check whether a set of messages match a [narrow](/api/construct-narrow).  &#x60;GET {{ api_url }}/v1/messages/matches_narrow&#x60;  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the &#x60;match_subject&#x60; and &#x60;match_content&#x60; objects is designed to match those of &#x60;GET /messages&#x60;, so that a client can splice these fields into a &#x60;message&#x60; object received from &#x60;GET /events&#x60; and end up with an extended message object identical to how a &#x60;GET /messages&#x60; for the current narrow would have returned the message. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun checkMessagesMatchNarrowTest() {
        val msgIds:kotlin.collections.List<kotlin.Int>? = null
        val narrow:kotlin.collections.List<kotlin.Any>? = null
        val response: ResponseEntity<AnyType> = api.checkMessagesMatchNarrow(msgIds!!, narrow!!)

        // TODO: test validations
    }
    
    /**
    * Delete a message
    *
    * Permanently delete a message.  &#x60;DELETE {{ api_url }}/v1/messages/{msg_id}&#x60;  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun deleteMessageTest() {
        val messageId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.deleteMessage(messageId!!)

        // TODO: test validations
    }
    
    /**
    * Get a message&#39;s edit history
    *
    * Fetch the message edit history of a previously edited message.  &#x60;GET {{ api_url }}/v1/messages/{message_id}/history&#x60;  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getMessageHistoryTest() {
        val messageId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getMessageHistory(messageId!!)

        // TODO: test validations
    }
    
    /**
    * Get messages
    *
    * Fetch message history from a Zulip server.  &#x60;GET {{ api_url }}/v1/messages&#x60;  This &#x60;GET /api/v1/messages&#x60; endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip&#39;s powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user&#39;s message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an &#x60;anchor&#x60; message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the &#x60;num_before&#x60; and &#x60;num_after&#x60; limits.  We recommend using &#x60;num_before &lt;&#x3D; 1000&#x60; and &#x60;num_after &lt;&#x3D; 1000&#x60; to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getMessagesTest() {
        val numBefore:kotlin.Int? = null
        val numAfter:kotlin.Int? = null
        val anchor:OneOfLessThanStringCommaIntegerGreaterThan? = null
        val narrow:kotlin.collections.List<kotlin.Any>? = null
        val clientGravatar:kotlin.Boolean? = null
        val applyMarkdown:kotlin.Boolean? = null
        val useFirstUnreadAnchor:kotlin.Boolean? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getMessages(numBefore!!, numAfter!!, anchor!!, narrow!!, clientGravatar!!, applyMarkdown!!, useFirstUnreadAnchor!!)

        // TODO: test validations
    }
    
    /**
    * Get a message&#39;s raw Markdown
    *
    * Get the raw content of a message.  &#x60;GET {{ api_url }}/v1/messages/{msg_id}&#x60;  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message&#39;s raw Markdown (e.g. for pre-filling a message-editing UI). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getRawMessageTest() {
        val messageId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccessBase> = api.getRawMessage(messageId!!)

        // TODO: test validations
    }
    
    /**
    * Remove an emoji reaction
    *
    * Remove an [emoji reaction](/help/emoji-reactions) from a message.  &#x60;DELETE {{ api_url }}/v1/messages/{message_id}/reactions&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun removeReactionTest() {
        val messageId:kotlin.Int? = null
        val emojiName:kotlin.String? = null
        val emojiCode:kotlin.String? = null
        val reactionType:kotlin.String? = null
        val response: ResponseEntity<JsonSuccess> = api.removeReaction(messageId!!, emojiName!!, emojiCode!!, reactionType!!)

        // TODO: test validations
    }
    
    /**
    * Render message
    *
    * Render a message to HTML.  &#x60;POST {{ api_url }}/v1/messages/render&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun renderMessageTest() {
        val content:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.renderMessage(content!!)

        // TODO: test validations
    }
    
    /**
    * Send a message
    *
    * Send a stream or a private message.  &#x60;POST {{ api_url }}/v1/messages&#x60; 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun sendMessageTest() {
        val type:kotlin.String? = null
        val to:kotlin.collections.List<kotlin.Int>? = null
        val content:kotlin.String? = null
        val topic:kotlin.String? = null
        val queueId:kotlin.String? = null
        val localId:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.sendMessage(type!!, to!!, content!!, topic!!, queueId!!, localId!!)

        // TODO: test validations
    }
    
    /**
    * Edit a message
    *
    * Edit/update the content or topic of a message.  &#x60;PATCH {{ api_url }}/v1/messages/{msg_id}&#x60;  &#x60;{msg_id}&#x60; in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to &#x60;✔ {original_topic}&#x60;.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateMessageTest() {
        val messageId:kotlin.Int? = null
        val topic:kotlin.String? = null
        val propagateMode:kotlin.String? = null
        val sendNotificationToOldThread:kotlin.Boolean? = null
        val sendNotificationToNewThread:kotlin.Boolean? = null
        val content:kotlin.String? = null
        val streamId:kotlin.Int? = null
        val response: ResponseEntity<JsonSuccess> = api.updateMessage(messageId!!, topic!!, propagateMode!!, sendNotificationToOldThread!!, sendNotificationToNewThread!!, content!!, streamId!!)

        // TODO: test validations
    }
    
    /**
    * Update personal message flags
    *
    * Add or remove personal message flags like &#x60;read&#x60; and &#x60;starred&#x60; on a collection of message IDs.  &#x60;POST {{ api_url }}/v1/messages/flags&#x60;  For updating the &#x60;read&#x60; flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updateMessageFlagsTest() {
        val messages:kotlin.collections.List<kotlin.Int>? = null
        val op:kotlin.String? = null
        val flag:kotlin.String? = null
        val response: ResponseEntity<JsonSuccessBase> = api.updateMessageFlags(messages!!, op!!, flag!!)

        // TODO: test validations
    }
    
}
