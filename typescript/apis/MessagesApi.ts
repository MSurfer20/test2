// TODO: better import syntax?
import { BaseAPIRequestFactory, RequiredError } from './baseapi';
import {Configuration} from '../configuration';
import { RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {isCodeInRange} from '../util';

import { AnyType } from '../models/AnyType';
import { CodedError } from '../models/CodedError';
import { InvalidMessageError } from '../models/InvalidMessageError';
import { InvalidMessageError | CodedError } from '../models/InvalidMessageError | CodedError';
import { JsonSuccess } from '../models/JsonSuccess';
import { JsonSuccessBase } from '../models/JsonSuccessBase';
import { NonExistingStreamError | CodedError } from '../models/NonExistingStreamError | CodedError';
import { String | number } from '../models/string | number';

/**
 * no description
 */
export class MessagesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Add an emoji reaction
     * @param messageId The target message&#39;s ID. 
     * @param emojiName The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
     * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
     * @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
     */
    public async addReaction(messageId: number, emojiName: string, emojiCode?: string, reactionType?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messageId' is not null or undefined
        if (messageId === null || messageId === undefined) {
            throw new RequiredError('Required parameter messageId was null or undefined when calling addReaction.');
        }


        // verify required parameter 'emojiName' is not null or undefined
        if (emojiName === null || emojiName === undefined) {
            throw new RequiredError('Required parameter emojiName was null or undefined when calling addReaction.');
        }




        // Path Params
        const localVarPath = '/messages/{message_id}/reactions'
            .replace('{' + 'message_id' + '}', encodeURIComponent(String(messageId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (emojiName !== undefined) {
            requestContext.setQueryParam("emoji_name", ObjectSerializer.serialize(emojiName, "string", ""));
        }
        if (emojiCode !== undefined) {
            requestContext.setQueryParam("emoji_code", ObjectSerializer.serialize(emojiCode, "string", ""));
        }
        if (reactionType !== undefined) {
            requestContext.setQueryParam("reaction_type", ObjectSerializer.serialize(reactionType, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
     * Check if messages match a narrow
     * @param msgIds List of IDs for the messages to check.
     * @param narrow A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
     */
    public async checkMessagesMatchNarrow(msgIds: Array<number>, narrow: Array<any>, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'msgIds' is not null or undefined
        if (msgIds === null || msgIds === undefined) {
            throw new RequiredError('Required parameter msgIds was null or undefined when calling checkMessagesMatchNarrow.');
        }


        // verify required parameter 'narrow' is not null or undefined
        if (narrow === null || narrow === undefined) {
            throw new RequiredError('Required parameter narrow was null or undefined when calling checkMessagesMatchNarrow.');
        }


        // Path Params
        const localVarPath = '/messages/matches_narrow';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (msgIds !== undefined) {
            requestContext.setQueryParam("msg_ids", ObjectSerializer.serialize(msgIds, "Array<number>", ""));
        }
        if (narrow !== undefined) {
            requestContext.setQueryParam("narrow", ObjectSerializer.serialize(narrow, "Array<any>", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     * Delete a message
     * @param messageId The target message&#39;s ID. 
     */
    public async deleteMessage(messageId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messageId' is not null or undefined
        if (messageId === null || messageId === undefined) {
            throw new RequiredError('Required parameter messageId was null or undefined when calling deleteMessage.');
        }


        // Path Params
        const localVarPath = '/messages/{message_id}'
            .replace('{' + 'message_id' + '}', encodeURIComponent(String(messageId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get a temporary URL for access to the file that doesn't require authentication. 
     * Get public temporary URL
     * @param realmIdStr The realm id. 
     * @param filename Path to the URL. 
     */
    public async getFileTemporaryUrl(realmIdStr: number, filename: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'realmIdStr' is not null or undefined
        if (realmIdStr === null || realmIdStr === undefined) {
            throw new RequiredError('Required parameter realmIdStr was null or undefined when calling getFileTemporaryUrl.');
        }


        // verify required parameter 'filename' is not null or undefined
        if (filename === null || filename === undefined) {
            throw new RequiredError('Required parameter filename was null or undefined when calling getFileTemporaryUrl.');
        }


        // Path Params
        const localVarPath = '/user_uploads/{realm_id_str}/{filename}'
            .replace('{' + 'realm_id_str' + '}', encodeURIComponent(String(realmIdStr)))
            .replace('{' + 'filename' + '}', encodeURIComponent(String(filename)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     * Get a message's edit history
     * @param messageId The target message&#39;s ID. 
     */
    public async getMessageHistory(messageId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messageId' is not null or undefined
        if (messageId === null || messageId === undefined) {
            throw new RequiredError('Required parameter messageId was null or undefined when calling getMessageHistory.');
        }


        // Path Params
        const localVarPath = '/messages/{message_id}/history'
            .replace('{' + 'message_id' + '}', encodeURIComponent(String(messageId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     * Get messages
     * @param numBefore The number of messages with IDs less than the anchor to retrieve. 
     * @param numAfter The number of messages with IDs greater than the anchor to retrieve. 
     * @param anchor Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * &#x60;newest&#x60;: The most recent message. * &#x60;oldest&#x60;: The oldest message. * &#x60;first_unread&#x60;: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of &#x60;&#39;newest&#39;&#x60; and &#x60;&#39;oldest&#39;&#x60; are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   &#x60;first_unread&#x60; functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, &#x60;oldest&#x60; can be emulated with   &#x60;anchor&#x3D;0&#x60;, and &#x60;newest&#x60; with &#x60;anchor&#x3D;10000000000000000&#x60;   (that specific large value works around a bug in Zulip   2.1.x and older in the &#x60;found_newest&#x60; return value). 
     * @param narrow The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
     * @param clientGravatar Whether the client supports computing gravatars URLs.  If enabled, &#x60;avatar_url&#x60; will be included in the response only if there is a Zulip avatar, and will be &#x60;null&#x60; for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The &#x60;client_gravatar&#x60; field is set to &#x60;true&#x60; if clients can compute their own gravatars. 
     * @param applyMarkdown If &#x60;true&#x60;, message content is returned in the rendered HTML format. If &#x60;false&#x60;, message content is returned in the raw Markdown-format text that user entered. 
     * @param useFirstUnreadAnchor Legacy way to specify &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the &#x60;anchor&#x60;.  Mutually exclusive with &#x60;anchor&#x60;.  **Changes**: Deprecated in Zulip 3.0, replaced by &#x60;anchor&#x3D;\&quot;first_unread\&quot;&#x60; instead. 
     */
    public async getMessages(numBefore: number, numAfter: number, anchor?: string | number, narrow?: Array<any>, clientGravatar?: boolean, applyMarkdown?: boolean, useFirstUnreadAnchor?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'numBefore' is not null or undefined
        if (numBefore === null || numBefore === undefined) {
            throw new RequiredError('Required parameter numBefore was null or undefined when calling getMessages.');
        }


        // verify required parameter 'numAfter' is not null or undefined
        if (numAfter === null || numAfter === undefined) {
            throw new RequiredError('Required parameter numAfter was null or undefined when calling getMessages.');
        }







        // Path Params
        const localVarPath = '/messages';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (anchor !== undefined) {
            requestContext.setQueryParam("anchor", ObjectSerializer.serialize(anchor, "string | number", ""));
        }
        if (numBefore !== undefined) {
            requestContext.setQueryParam("num_before", ObjectSerializer.serialize(numBefore, "number", ""));
        }
        if (numAfter !== undefined) {
            requestContext.setQueryParam("num_after", ObjectSerializer.serialize(numAfter, "number", ""));
        }
        if (narrow !== undefined) {
            requestContext.setQueryParam("narrow", ObjectSerializer.serialize(narrow, "Array<any>", ""));
        }
        if (clientGravatar !== undefined) {
            requestContext.setQueryParam("client_gravatar", ObjectSerializer.serialize(clientGravatar, "boolean", ""));
        }
        if (applyMarkdown !== undefined) {
            requestContext.setQueryParam("apply_markdown", ObjectSerializer.serialize(applyMarkdown, "boolean", ""));
        }
        if (useFirstUnreadAnchor !== undefined) {
            requestContext.setQueryParam("use_first_unread_anchor", ObjectSerializer.serialize(useFirstUnreadAnchor, "boolean", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
     * Get a message's raw Markdown
     * @param messageId The target message&#39;s ID. 
     */
    public async getRawMessage(messageId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messageId' is not null or undefined
        if (messageId === null || messageId === undefined) {
            throw new RequiredError('Required parameter messageId was null or undefined when calling getRawMessage.');
        }


        // Path Params
        const localVarPath = '/messages/{message_id}'
            .replace('{' + 'message_id' + '}', encodeURIComponent(String(messageId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
     * Mark all messages as read
     */
    public async markAllAsRead(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/mark_all_as_read';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Mark all the unread messages in a stream as read. 
     * Mark messages in a stream as read
     * @param streamId The ID of the stream to access. 
     */
    public async markStreamAsRead(streamId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new RequiredError('Required parameter streamId was null or undefined when calling markStreamAsRead.');
        }


        // Path Params
        const localVarPath = '/mark_stream_as_read';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (streamId !== undefined) {
            requestContext.setQueryParam("stream_id", ObjectSerializer.serialize(streamId, "number", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Mark all the unread messages in a topic as read. 
     * Mark messages in a topic as read
     * @param streamId The ID of the stream to access. 
     * @param topicName The name of the topic whose messages should be marked as read. 
     */
    public async markTopicAsRead(streamId: number, topicName: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'streamId' is not null or undefined
        if (streamId === null || streamId === undefined) {
            throw new RequiredError('Required parameter streamId was null or undefined when calling markTopicAsRead.');
        }


        // verify required parameter 'topicName' is not null or undefined
        if (topicName === null || topicName === undefined) {
            throw new RequiredError('Required parameter topicName was null or undefined when calling markTopicAsRead.');
        }


        // Path Params
        const localVarPath = '/mark_topic_as_read';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (streamId !== undefined) {
            requestContext.setQueryParam("stream_id", ObjectSerializer.serialize(streamId, "number", ""));
        }
        if (topicName !== undefined) {
            requestContext.setQueryParam("topic_name", ObjectSerializer.serialize(topicName, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
     * Remove an emoji reaction
     * @param messageId The target message&#39;s ID. 
     * @param emojiName The target emoji&#39;s human-readable name.  To find an emoji&#39;s name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji&#39;s text name. 
     * @param emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For most API clients, you won&#39;t need this, but it&#39;s important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the &#x60;emoji_code&#x60; in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \&quot;diffenent\&quot; emoji. 
     * @param reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode codepoint). * &#x60;realm_emoji&#x60;: Custom emoji. (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to    namespace the &#x60;zulip&#x60; emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed &#x60;unicode_emoji&#x60; if this parameter was not specified. 
     */
    public async removeReaction(messageId: number, emojiName?: string, emojiCode?: string, reactionType?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messageId' is not null or undefined
        if (messageId === null || messageId === undefined) {
            throw new RequiredError('Required parameter messageId was null or undefined when calling removeReaction.');
        }





        // Path Params
        const localVarPath = '/messages/{message_id}/reactions'
            .replace('{' + 'message_id' + '}', encodeURIComponent(String(messageId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (emojiName !== undefined) {
            requestContext.setQueryParam("emoji_name", ObjectSerializer.serialize(emojiName, "string", ""));
        }
        if (emojiCode !== undefined) {
            requestContext.setQueryParam("emoji_code", ObjectSerializer.serialize(emojiCode, "string", ""));
        }
        if (reactionType !== undefined) {
            requestContext.setQueryParam("reaction_type", ObjectSerializer.serialize(reactionType, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
     * Render message
     * @param content The content of the message. Maximum message size of 10000 bytes. 
     */
    public async renderMessage(content: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new RequiredError('Required parameter content was null or undefined when calling renderMessage.');
        }


        // Path Params
        const localVarPath = '/messages/render';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (content !== undefined) {
            requestContext.setQueryParam("content", ObjectSerializer.serialize(content, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
     * Send a message
     * @param type The type of message to be sent. &#x60;private&#x60; for a private message and &#x60;stream&#x60; for a stream message. 
     * @param to For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
     * @param content The content of the message. Maximum message size of 10000 bytes. 
     * @param topic The topic of the message. Only required for stream messages (&#x60;type&#x3D;\&quot;stream\&quot;&#x60;), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
     * @param queueId For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, &#x60;local_id&#x60; is required.  If the message is successfully sent, the server will include &#x60;local_id&#x60; in the &#x60;message&#x60; event that the client with this &#x60;queue_id&#x60; will receive notifying it of the new message via [&#x60;GET /events&#x60;](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
     * @param localId For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the &#x60;queue_id&#x60; description. 
     */
    public async sendMessage(type: 'private' | 'stream', to: Array<number>, content: string, topic?: string, queueId?: string, localId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'type' is not null or undefined
        if (type === null || type === undefined) {
            throw new RequiredError('Required parameter type was null or undefined when calling sendMessage.');
        }


        // verify required parameter 'to' is not null or undefined
        if (to === null || to === undefined) {
            throw new RequiredError('Required parameter to was null or undefined when calling sendMessage.');
        }


        // verify required parameter 'content' is not null or undefined
        if (content === null || content === undefined) {
            throw new RequiredError('Required parameter content was null or undefined when calling sendMessage.');
        }





        // Path Params
        const localVarPath = '/messages';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (type !== undefined) {
            requestContext.setQueryParam("type", ObjectSerializer.serialize(type, "'private' | 'stream'", ""));
        }
        if (to !== undefined) {
            requestContext.setQueryParam("to", ObjectSerializer.serialize(to, "Array<number>", ""));
        }
        if (content !== undefined) {
            requestContext.setQueryParam("content", ObjectSerializer.serialize(content, "string", ""));
        }
        if (topic !== undefined) {
            requestContext.setQueryParam("topic", ObjectSerializer.serialize(topic, "string", ""));
        }
        if (queueId !== undefined) {
            requestContext.setQueryParam("queue_id", ObjectSerializer.serialize(queueId, "string", ""));
        }
        if (localId !== undefined) {
            requestContext.setQueryParam("local_id", ObjectSerializer.serialize(localId, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     * Edit a message
     * @param messageId The target message&#39;s ID. 
     * @param topic The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as &#x60;subject&#x60;, which is currently a deprecated alias. 
     * @param propagateMode Which message(s) should be edited: just the one indicated in &#x60;message_id&#x60;, messages in the same topic that had been sent after this one, or all of them.  Only the default value of &#x60;change_one&#x60; is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic. 
     * @param sendNotificationToOldThread Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9). 
     * @param sendNotificationToNewThread Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9). 
     * @param content The content of the message. Maximum message size of 10000 bytes. 
     * @param streamId The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
     */
    public async updateMessage(messageId: number, topic?: string, propagateMode?: 'change_one' | 'change_later' | 'change_all', sendNotificationToOldThread?: boolean, sendNotificationToNewThread?: boolean, content?: string, streamId?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messageId' is not null or undefined
        if (messageId === null || messageId === undefined) {
            throw new RequiredError('Required parameter messageId was null or undefined when calling updateMessage.');
        }








        // Path Params
        const localVarPath = '/messages/{message_id}'
            .replace('{' + 'message_id' + '}', encodeURIComponent(String(messageId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (topic !== undefined) {
            requestContext.setQueryParam("topic", ObjectSerializer.serialize(topic, "string", ""));
        }
        if (propagateMode !== undefined) {
            requestContext.setQueryParam("propagate_mode", ObjectSerializer.serialize(propagateMode, "'change_one' | 'change_later' | 'change_all'", ""));
        }
        if (sendNotificationToOldThread !== undefined) {
            requestContext.setQueryParam("send_notification_to_old_thread", ObjectSerializer.serialize(sendNotificationToOldThread, "boolean", ""));
        }
        if (sendNotificationToNewThread !== undefined) {
            requestContext.setQueryParam("send_notification_to_new_thread", ObjectSerializer.serialize(sendNotificationToNewThread, "boolean", ""));
        }
        if (content !== undefined) {
            requestContext.setQueryParam("content", ObjectSerializer.serialize(content, "string", ""));
        }
        if (streamId !== undefined) {
            requestContext.setQueryParam("stream_id", ObjectSerializer.serialize(streamId, "number", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     * Update personal message flags
     * @param messages An array containing the IDs of the target messages. 
     * @param op Whether to &#x60;add&#x60; the flag or &#x60;remove&#x60; it. 
     * @param flag The flag that should be added/removed. 
     */
    public async updateMessageFlags(messages: Array<number>, op: 'add' | 'remove', flag: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'messages' is not null or undefined
        if (messages === null || messages === undefined) {
            throw new RequiredError('Required parameter messages was null or undefined when calling updateMessageFlags.');
        }


        // verify required parameter 'op' is not null or undefined
        if (op === null || op === undefined) {
            throw new RequiredError('Required parameter op was null or undefined when calling updateMessageFlags.');
        }


        // verify required parameter 'flag' is not null or undefined
        if (flag === null || flag === undefined) {
            throw new RequiredError('Required parameter flag was null or undefined when calling updateMessageFlags.');
        }


        // Path Params
        const localVarPath = '/messages/flags';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (messages !== undefined) {
            requestContext.setQueryParam("messages", ObjectSerializer.serialize(messages, "Array<number>", ""));
        }
        if (op !== undefined) {
            requestContext.setQueryParam("op", ObjectSerializer.serialize(op, "'add' | 'remove'", ""));
        }
        if (flag !== undefined) {
            requestContext.setQueryParam("flag", ObjectSerializer.serialize(flag, "string", ""));
        }

        // Header Params

        // Form Params


        // Body Params

        // Apply auth methods

        return requestContext;
    }

    /**
     * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     * Upload a file
     * @param filename 
     */
    public async uploadFile(filename?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/user_uploads';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params

        // Header Params

        // Form Params
        let localVarFormParams = new FormData();

        if (filename !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('filename', filename, filename.name);
        }
        requestContext.setBody(localVarFormParams);

        // Body Params

        // Apply auth methods

        return requestContext;
    }

}

export class MessagesApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to addReaction
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async addReaction(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CodedError", ""
            ) as CodedError;
            throw new ApiException<CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to checkMessagesMatchNarrow
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async checkMessagesMatchNarrow(response: ResponseContext): Promise<AnyType > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AnyType = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnyType", ""
            ) as AnyType;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AnyType = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AnyType", ""
            ) as AnyType;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to deleteMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async deleteMessage(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: InvalidMessageError | CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InvalidMessageError | CodedError", ""
            ) as InvalidMessageError | CodedError;
            throw new ApiException<InvalidMessageError | CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getFileTemporaryUrl
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getFileTemporaryUrl(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getMessageHistory
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getMessageHistory(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: InvalidMessageError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InvalidMessageError", ""
            ) as InvalidMessageError;
            throw new ApiException<InvalidMessageError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getMessages
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getMessages(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to getRawMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async getRawMessage(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: InvalidMessageError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "InvalidMessageError", ""
            ) as InvalidMessageError;
            throw new ApiException<InvalidMessageError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to markAllAsRead
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async markAllAsRead(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to markStreamAsRead
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async markStreamAsRead(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to markTopicAsRead
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async markTopicAsRead(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to removeReaction
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async removeReaction(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CodedError", ""
            ) as CodedError;
            throw new ApiException<CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to renderMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async renderMessage(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to sendMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async sendMessage(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: NonExistingStreamError | CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "NonExistingStreamError | CodedError", ""
            ) as NonExistingStreamError | CodedError;
            throw new ApiException<NonExistingStreamError | CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateMessage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateMessage(response: ResponseContext): Promise<JsonSuccess > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: CodedError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "CodedError", ""
            ) as CodedError;
            throw new ApiException<CodedError>(400, body);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccess = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccess", ""
            ) as JsonSuccess;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to updateMessageFlags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async updateMessageFlags(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to uploadFile
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async uploadFile(response: ResponseContext): Promise<JsonSuccessBase > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: JsonSuccessBase = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "JsonSuccessBase", ""
            ) as JsonSuccessBase;
            return body;
        }

        let body = response.body || "";
        throw new ApiException<string>(response.httpStatusCode, "Unknown API Status Code!\nBody: \"" + body + "\"");
    }

}
