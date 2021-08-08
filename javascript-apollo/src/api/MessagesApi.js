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
 *
 */



import ApiClient from "../ApiClient";
import AnyType from '../model/AnyType';
import CodedError from '../model/CodedError';
import InvalidMessageError from '../model/InvalidMessageError';
import JsonSuccess from '../model/JsonSuccess';
import JsonSuccessBase from '../model/JsonSuccessBase';
import OneOfobjectobject from '../model/OneOfobjectobject';
import OneOfstringinteger from '../model/OneOfstringinteger';

/**
* Messages service.
* @module api/MessagesApi
* @version 1.0.0
*/
export default class MessagesApi extends ApiClient {

    /**
    * Constructs a new MessagesApi. 
    * @alias module:api/MessagesApi
    * @class
    */
    constructor() {
      super();
      this.baseURL = null;
    }


    /**
     * Add an emoji reaction
     * Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
     * @param {Number} messageId The target message's ID. 
     * @param {String} emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
     * @param {String} opts.reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
     * @return {Promise<JsonSuccess>}
     */
    async addReaction(messageId, emojiName, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'messageId' is set
      if (messageId === undefined || messageId === null) {
        throw new Error("Missing the required parameter 'messageId' when calling addReaction");
      }
      // verify the required parameter 'emojiName' is set
      if (emojiName === undefined || emojiName === null) {
        throw new Error("Missing the required parameter 'emojiName' when calling addReaction");
      }

      let pathParams = {
        'message_id': messageId
      };
      let queryParams = {
        'emoji_name': emojiName,
        'emoji_code': opts['emojiCode'],
        'reaction_type': opts['reactionType']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/messages/{message_id}/reactions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Check if messages match a narrow
     * Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
     * @param {Array.<Number>} msgIds List of IDs for the messages to check.
     * @param {Array.<Object>} narrow A structure defining the narrow to check against. See how to [construct a narrow](/api/construct-narrow).
     * @return {Promise<AnyType>}
     */
    async checkMessagesMatchNarrow(msgIds, narrow) {
      let postBody = null;
      // verify the required parameter 'msgIds' is set
      if (msgIds === undefined || msgIds === null) {
        throw new Error("Missing the required parameter 'msgIds' when calling checkMessagesMatchNarrow");
      }
      // verify the required parameter 'narrow' is set
      if (narrow === undefined || narrow === null) {
        throw new Error("Missing the required parameter 'narrow' when calling checkMessagesMatchNarrow");
      }

      let pathParams = {
      };
      let queryParams = {
        'msg_ids': this.buildCollectionParam(msgIds, 'multi'),
        'narrow': this.buildCollectionParam(narrow, 'multi')
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AnyType;

      return this.callApi(
        '/messages/matches_narrow', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Delete a message
     * Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
     * @param {Number} messageId The target message's ID. 
     * @return {Promise<JsonSuccess>}
     */
    async deleteMessage(messageId) {
      let postBody = null;
      // verify the required parameter 'messageId' is set
      if (messageId === undefined || messageId === null) {
        throw new Error("Missing the required parameter 'messageId' when calling deleteMessage");
      }

      let pathParams = {
        'message_id': messageId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/messages/{message_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get public temporary URL
     * Get a temporary URL for access to the file that doesn't require authentication. 
     * @param {Number} realmIdStr The realm id. 
     * @param {String} filename Path to the URL. 
     * @return {Promise<JsonSuccessBase>}
     */
    async getFileTemporaryUrl(realmIdStr, filename) {
      let postBody = null;
      // verify the required parameter 'realmIdStr' is set
      if (realmIdStr === undefined || realmIdStr === null) {
        throw new Error("Missing the required parameter 'realmIdStr' when calling getFileTemporaryUrl");
      }
      // verify the required parameter 'filename' is set
      if (filename === undefined || filename === null) {
        throw new Error("Missing the required parameter 'filename' when calling getFileTemporaryUrl");
      }

      let pathParams = {
        'realm_id_str': realmIdStr,
        'filename': filename
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/user_uploads/{realm_id_str}/{filename}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get a message's edit history
     * Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
     * @param {Number} messageId The target message's ID. 
     * @return {Promise<JsonSuccessBase>}
     */
    async getMessageHistory(messageId) {
      let postBody = null;
      // verify the required parameter 'messageId' is set
      if (messageId === undefined || messageId === null) {
        throw new Error("Missing the required parameter 'messageId' when calling getMessageHistory");
      }

      let pathParams = {
        'message_id': messageId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/messages/{message_id}/history', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get messages
     * Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
     * @param {Number} numBefore The number of messages with IDs less than the anchor to retrieve. 
     * @param {Number} numAfter The number of messages with IDs greater than the anchor to retrieve. 
     * @param {Object} opts Optional parameters
     * @param {OneOfstringinteger} opts.anchor Integer message ID to anchor fetching of new messages. Supports special string values for when the client wants the server to compute the anchor to use:  * `newest`: The most recent message. * `oldest`: The oldest message. * `first_unread`: The oldest unread message matching the   query, if any; otherwise, the most recent message.  The special values of `'newest'` and `'oldest'` are also supported for anchoring the query at the most recent or oldest messages.  **Changes**: String values are new in Zulip 3.0 (feature level 1).  The   `first_unread` functionality was supported in Zulip 2.1.x   and older by not sending anchor and using use_first_unread_anchor.    In Zulip 2.1.x and older, `oldest` can be emulated with   `anchor=0`, and `newest` with `anchor=10000000000000000`   (that specific large value works around a bug in Zulip   2.1.x and older in the `found_newest` return value). 
     * @param {Array.<Object>} opts.narrow The narrow where you want to fetch the messages from. See how to [construct a narrow](/api/construct-narrow). 
     * @param {Boolean} opts.clientGravatar Whether the client supports computing gravatars URLs.  If enabled, `avatar_url` will be included in the response only if there is a Zulip avatar, and will be `null` for users who are using gravatar as their avatar.  This option significantly reduces the compressed size of user data, since gravatar URLs are long, random strings and thus do not compress well. The `client_gravatar` field is set to `true` if clients can compute their own gravatars.  (default to false)
     * @param {Boolean} opts.applyMarkdown If `true`, message content is returned in the rendered HTML format. If `false`, message content is returned in the raw Markdown-format text that user entered.  (default to true)
     * @param {Boolean} opts.useFirstUnreadAnchor Legacy way to specify `anchor=\"first_unread\"` in Zulip 2.1.x and older.  Whether to use the (computed by the server) first unread message matching the narrow as the `anchor`.  Mutually exclusive with `anchor`.  **Changes**: Deprecated in Zulip 3.0, replaced by `anchor=\"first_unread\"` instead.  (default to false)
     * @return {Promise<JsonSuccessBase>}
     */
    async getMessages(numBefore, numAfter, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'numBefore' is set
      if (numBefore === undefined || numBefore === null) {
        throw new Error("Missing the required parameter 'numBefore' when calling getMessages");
      }
      // verify the required parameter 'numAfter' is set
      if (numAfter === undefined || numAfter === null) {
        throw new Error("Missing the required parameter 'numAfter' when calling getMessages");
      }

      let pathParams = {
      };
      let queryParams = {
        'anchor': opts['anchor'],
        'num_before': numBefore,
        'num_after': numAfter,
        'narrow': this.buildCollectionParam(opts['narrow'], 'multi'),
        'client_gravatar': opts['clientGravatar'],
        'apply_markdown': opts['applyMarkdown'],
        'use_first_unread_anchor': opts['useFirstUnreadAnchor']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/messages', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get a message's raw Markdown
     * Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
     * @param {Number} messageId The target message's ID. 
     * @return {Promise<JsonSuccessBase>}
     */
    async getRawMessage(messageId) {
      let postBody = null;
      // verify the required parameter 'messageId' is set
      if (messageId === undefined || messageId === null) {
        throw new Error("Missing the required parameter 'messageId' when calling getRawMessage");
      }

      let pathParams = {
        'message_id': messageId
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/messages/{message_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Mark all messages as read
     * Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
     * @return {Promise<JsonSuccess>}
     */
    async markAllAsRead() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/mark_all_as_read', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Mark messages in a stream as read
     * Mark all the unread messages in a stream as read. 
     * @param {Number} streamId The ID of the stream to access. 
     * @return {Promise<JsonSuccess>}
     */
    async markStreamAsRead(streamId) {
      let postBody = null;
      // verify the required parameter 'streamId' is set
      if (streamId === undefined || streamId === null) {
        throw new Error("Missing the required parameter 'streamId' when calling markStreamAsRead");
      }

      let pathParams = {
      };
      let queryParams = {
        'stream_id': streamId
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/mark_stream_as_read', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Mark messages in a topic as read
     * Mark all the unread messages in a topic as read. 
     * @param {Number} streamId The ID of the stream to access. 
     * @param {String} topicName The name of the topic whose messages should be marked as read. 
     * @return {Promise<JsonSuccess>}
     */
    async markTopicAsRead(streamId, topicName) {
      let postBody = null;
      // verify the required parameter 'streamId' is set
      if (streamId === undefined || streamId === null) {
        throw new Error("Missing the required parameter 'streamId' when calling markTopicAsRead");
      }
      // verify the required parameter 'topicName' is set
      if (topicName === undefined || topicName === null) {
        throw new Error("Missing the required parameter 'topicName' when calling markTopicAsRead");
      }

      let pathParams = {
      };
      let queryParams = {
        'stream_id': streamId,
        'topic_name': topicName
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/mark_topic_as_read', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Remove an emoji reaction
     * Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
     * @param {Number} messageId The target message's ID. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.emojiName The target emoji's human-readable name.  To find an emoji's name, hover over a message to reveal three icons on the right, then click the smiley face icon. Images of available reaction emojis appear. Hover over the emoji you want, and note that emoji's text name. 
     * @param {String} opts.emojiCode A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For most API clients, you won't need this, but it's important for Zulip apps to handle rare corner cases when adding/removing votes on an emoji reaction added previously by another user.  If the existing reaction was added when the Zulip server was using a previous version of the emoji data mapping between Unicode codepoints and human-readable names, sending the `emoji_code` in the data for the original reaction allows the Zulip server to correctly interpret your upvote as an upvote rather than a reaction with a \"diffenent\" emoji. 
     * @param {String} opts.reactionType If an app is adding/removing a vote on an existing reaction, it should pass this parameter using the value the server provided for the existing reaction for specificity.  Supported values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode codepoint). * `realm_emoji`: Custom emoji. (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to    namespace the `zulip` emoji.  **Changes**: In Zulip 3.0 (feature level 2), this become optional for [custom emoji](/help/add-custom-emoji); previously, this endpoint assumed `unicode_emoji` if this parameter was not specified. 
     * @return {Promise<JsonSuccess>}
     */
    async removeReaction(messageId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'messageId' is set
      if (messageId === undefined || messageId === null) {
        throw new Error("Missing the required parameter 'messageId' when calling removeReaction");
      }

      let pathParams = {
        'message_id': messageId
      };
      let queryParams = {
        'emoji_name': opts['emojiName'],
        'emoji_code': opts['emojiCode'],
        'reaction_type': opts['reactionType']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/messages/{message_id}/reactions', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Render message
     * Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
     * @param {String} content The content of the message. Maximum message size of 10000 bytes. 
     * @return {Promise<JsonSuccessBase>}
     */
    async renderMessage(content) {
      let postBody = null;
      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling renderMessage");
      }

      let pathParams = {
      };
      let queryParams = {
        'content': content
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/messages/render', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Send a message
     * Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
     * @param {String} type The type of message to be sent. `private` for a private message and `stream` for a stream message. 
     * @param {Array.<Number>} to For stream messages, either the name or integer ID of the stream. For private messages, either a list containing integer user IDs or a list containing string email addresses.  **Changes**: Support for using user/stream IDs was added in Zulip 2.0.0. 
     * @param {String} content The content of the message. Maximum message size of 10000 bytes. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.topic The topic of the message. Only required for stream messages (`type=\"stream\"`), ignored otherwise.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
     * @param {String} opts.queueId For clients supporting [local echo](https://zulip.readthedocs.io/en/latest/subsystems/sending-messages.html#local-echo), the [event queue](/api/register-queue) ID for the client.  If passed, `local_id` is required.  If the message is successfully sent, the server will include `local_id` in the `message` event that the client with this `queue_id` will receive notifying it of the new message via [`GET /events`](/api/get-events).  This lets the client know unambiguously that it should replace the locally echoed message, rather than adding this new message (which would be correct if the user had sent the new message from another device). 
     * @param {String} opts.localId For clients supporting local echo, a unique string-format identifier chosen freely by the client; the server will pass it back to the client without inspecting it, as described in the `queue_id` description. 
     * @return {Promise<JsonSuccessBase>}
     */
    async sendMessage(type, to, content, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'type' is set
      if (type === undefined || type === null) {
        throw new Error("Missing the required parameter 'type' when calling sendMessage");
      }
      // verify the required parameter 'to' is set
      if (to === undefined || to === null) {
        throw new Error("Missing the required parameter 'to' when calling sendMessage");
      }
      // verify the required parameter 'content' is set
      if (content === undefined || content === null) {
        throw new Error("Missing the required parameter 'content' when calling sendMessage");
      }

      let pathParams = {
      };
      let queryParams = {
        'type': type,
        'to': this.buildCollectionParam(to, 'multi'),
        'content': content,
        'topic': opts['topic'],
        'queue_id': opts['queueId'],
        'local_id': opts['localId']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/messages', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Edit a message
     * Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
     * @param {Number} messageId The target message's ID. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.topic The topic to move the message(s) to, to request changing the topic. Should only be sent when changing the topic, and will throw an error if the target message is not a stream message.  Maximum length of 60 characters.  **Changes**: New in Zulip 2.0.  Previous Zulip releases encoded this as `subject`, which is currently a deprecated alias. 
     * @param {String} opts.propagateMode Which message(s) should be edited: just the one indicated in `message_id`, messages in the same topic that had been sent after this one, or all of them.  Only the default value of `change_one` is valid when editing only the content of a message.  This parameter determines both which messages get moved and also whether clients that are currently narrowed to the topic containing the message should navigate or adjust their compose box recipient to point to the post-edit stream/topic.  (default to 'change_one')
     * @param {Boolean} opts.sendNotificationToOldThread Whether to send breadcrumb message to the old thread to notify users where the messages were moved to.  **Changes**: New in Zulip 3.0 (feature level 9).  (default to true)
     * @param {Boolean} opts.sendNotificationToNewThread Whether to send a notification message to the new thread to notify users where the messages came from.  **Changes**: New in Zulip 3.0 (feature level 9).  (default to true)
     * @param {String} opts.content The content of the message. Maximum message size of 10000 bytes. 
     * @param {Number} opts.streamId The stream ID to move the message(s) to, to request moving messages to another stream.  Should only be sent when changing the stream, and will throw an error if the target message is not a stream message. 
     * @return {Promise<JsonSuccess>}
     */
    async updateMessage(messageId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'messageId' is set
      if (messageId === undefined || messageId === null) {
        throw new Error("Missing the required parameter 'messageId' when calling updateMessage");
      }

      let pathParams = {
        'message_id': messageId
      };
      let queryParams = {
        'topic': opts['topic'],
        'propagate_mode': opts['propagateMode'],
        'send_notification_to_old_thread': opts['sendNotificationToOldThread'],
        'send_notification_to_new_thread': opts['sendNotificationToNewThread'],
        'content': opts['content'],
        'stream_id': opts['streamId']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccess;

      return this.callApi(
        '/messages/{message_id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Update personal message flags
     * Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
     * @param {Array.<Number>} messages An array containing the IDs of the target messages. 
     * @param {String} op Whether to `add` the flag or `remove` it. 
     * @param {String} flag The flag that should be added/removed. 
     * @return {Promise<JsonSuccessBase>}
     */
    async updateMessageFlags(messages, op, flag) {
      let postBody = null;
      // verify the required parameter 'messages' is set
      if (messages === undefined || messages === null) {
        throw new Error("Missing the required parameter 'messages' when calling updateMessageFlags");
      }
      // verify the required parameter 'op' is set
      if (op === undefined || op === null) {
        throw new Error("Missing the required parameter 'op' when calling updateMessageFlags");
      }
      // verify the required parameter 'flag' is set
      if (flag === undefined || flag === null) {
        throw new Error("Missing the required parameter 'flag' when calling updateMessageFlags");
      }

      let pathParams = {
      };
      let queryParams = {
        'messages': this.buildCollectionParam(messages, 'multi'),
        'op': op,
        'flag': flag
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/messages/flags', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Upload a file
     * Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
     * @param {Object} opts Optional parameters
     * @param {File} opts.filename 
     * @return {Promise<JsonSuccessBase>}
     */
    async uploadFile(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
        'filename': opts['filename']
      };

      let authNames = [];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json'];
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/user_uploads', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


}