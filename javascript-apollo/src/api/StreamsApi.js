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
import CodedError from '../model/CodedError';
import JsonError from '../model/JsonError';
import JsonSuccess from '../model/JsonSuccess';
import JsonSuccessBase from '../model/JsonSuccessBase';
import NonExistingStreamError from '../model/NonExistingStreamError';
import OneOfobjectobject from '../model/OneOfobjectobject';
import OneOfstringinteger from '../model/OneOfstringinteger';

/**
* Streams service.
* @module api/StreamsApi
* @version 1.0.0
*/
export default class StreamsApi extends ApiClient {

    /**
    * Constructs a new StreamsApi. 
    * @alias module:api/StreamsApi
    * @class
    */
    constructor() {
      super();
      this.baseURL = null;
    }


    /**
     * Archive a stream
     * [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
     * @param {Number} streamId The ID of the stream to access. 
     * @return {Promise<JsonSuccess>}
     */
    async archiveStream(streamId) {
      let postBody = null;
      // verify the required parameter 'streamId' is set
      if (streamId === undefined || streamId === null) {
        throw new Error("Missing the required parameter 'streamId' when calling archiveStream");
      }

      let pathParams = {
        'stream_id': streamId
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
        '/streams/{stream_id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Create BigBlueButton video call
     * Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
     * @return {Promise<JsonSuccessBase>}
     */
    async createBigBlueButtonVideoCall() {
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
      let returnType = JsonSuccessBase;

      return this.callApi(
        '/calls/bigbluebutton/create', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get stream ID
     * Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
     * @param {String} stream The name of the stream to access. 
     * @return {Promise<JsonSuccessBase>}
     */
    async getStreamId(stream) {
      let postBody = null;
      // verify the required parameter 'stream' is set
      if (stream === undefined || stream === null) {
        throw new Error("Missing the required parameter 'stream' when calling getStreamId");
      }

      let pathParams = {
      };
      let queryParams = {
        'stream': stream
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
        '/get_stream_id', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get topics in a stream
     * Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
     * @param {Number} streamId The ID of the stream to access. 
     * @return {Promise<JsonSuccessBase>}
     */
    async getStreamTopics(streamId) {
      let postBody = null;
      // verify the required parameter 'streamId' is set
      if (streamId === undefined || streamId === null) {
        throw new Error("Missing the required parameter 'streamId' when calling getStreamTopics");
      }

      let pathParams = {
        'stream_id': streamId
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
        '/users/me/{stream_id}/topics', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get all streams
     * Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.includePublic Include all public streams.  (default to true)
     * @param {Boolean} opts.includeWebPublic Include all web public streams.  (default to false)
     * @param {Boolean} opts.includeSubscribed Include all streams that the user is subscribed to.  (default to true)
     * @param {Boolean} opts.includeAllActive Include all active streams. The user must have administrative privileges to use this parameter.  (default to false)
     * @param {Boolean} opts.includeDefault Include all default streams for the user's realm.  (default to false)
     * @param {Boolean} opts.includeOwnerSubscribed If the user is a bot, include all streams that the bot's owner is subscribed to.  (default to false)
     * @return {Promise<JsonSuccessBase>}
     */
    async getStreams(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'include_public': opts['includePublic'],
        'include_web_public': opts['includeWebPublic'],
        'include_subscribed': opts['includeSubscribed'],
        'include_all_active': opts['includeAllActive'],
        'include_default': opts['includeDefault'],
        'include_owner_subscribed': opts['includeOwnerSubscribed']
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
        '/streams', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get subscription status
     * Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
     * @param {Number} userId The target user's ID. 
     * @param {Number} streamId The ID of the stream to access. 
     * @return {Promise<JsonSuccessBase>}
     */
    async getSubscriptionStatus(userId, streamId) {
      let postBody = null;
      // verify the required parameter 'userId' is set
      if (userId === undefined || userId === null) {
        throw new Error("Missing the required parameter 'userId' when calling getSubscriptionStatus");
      }
      // verify the required parameter 'streamId' is set
      if (streamId === undefined || streamId === null) {
        throw new Error("Missing the required parameter 'streamId' when calling getSubscriptionStatus");
      }

      let pathParams = {
        'user_id': userId,
        'stream_id': streamId
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
        '/users/{user_id}/subscriptions/{stream_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Get subscribed streams
     * Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.includeSubscribers Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (default to false)
     * @return {Promise<JsonSuccessBase>}
     */
    async getSubscriptions(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'include_subscribers': opts['includeSubscribers']
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
        '/users/me/subscriptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Topic muting
     * This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
     * @param {String} topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
     * @param {String} op Whether to mute (`add`) or unmute (`remove`) the provided topic. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.stream The name of the stream to access. 
     * @param {Number} opts.streamId The ID of the stream to access. 
     * @return {Promise<JsonSuccess>}
     */
    async muteTopic(topic, op, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'topic' is set
      if (topic === undefined || topic === null) {
        throw new Error("Missing the required parameter 'topic' when calling muteTopic");
      }
      // verify the required parameter 'op' is set
      if (op === undefined || op === null) {
        throw new Error("Missing the required parameter 'op' when calling muteTopic");
      }

      let pathParams = {
      };
      let queryParams = {
        'stream': opts['stream'],
        'stream_id': opts['streamId'],
        'topic': topic,
        'op': op
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
        '/users/me/subscriptions/muted_topics', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Subscribe to a stream
     * Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
     * @param {Array.<Object>} subscriptions A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
     * @param {Object} opts Optional parameters
     * @param {Array.<OneOfstringinteger>} opts.principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @param {Boolean} opts.authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (default to true)
     * @param {Boolean} opts.announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (default to false)
     * @param {Boolean} opts.inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (default to false)
     * @param {Boolean} opts.historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param {Number} opts.streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (default to 1)
     * @param {OneOfstringinteger} opts.messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     * @return {Promise<OneOfobjectobject>}
     */
    async subscribe(subscriptions, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'subscriptions' is set
      if (subscriptions === undefined || subscriptions === null) {
        throw new Error("Missing the required parameter 'subscriptions' when calling subscribe");
      }

      let pathParams = {
      };
      let queryParams = {
        'subscriptions': this.buildCollectionParam(subscriptions, 'multi'),
        'principals': this.buildCollectionParam(opts['principals'], 'multi'),
        'authorization_errors_fatal': opts['authorizationErrorsFatal'],
        'announce': opts['announce'],
        'invite_only': opts['inviteOnly'],
        'history_public_to_subscribers': opts['historyPublicToSubscribers'],
        'stream_post_policy': opts['streamPostPolicy'],
        'message_retention_days': opts['messageRetentionDays']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/1.0.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = OneOfobjectobject;

      return this.callApi(
        '/users/me/subscriptions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Unsubscribe from a stream
     * Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
     * @param {Array.<String>} subscriptions A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
     * @param {Object} opts Optional parameters
     * @param {Array.<OneOfstringinteger>} opts.principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9). 
     * @return {Promise<JsonSuccessBase>}
     */
    async unsubscribe(subscriptions, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'subscriptions' is set
      if (subscriptions === undefined || subscriptions === null) {
        throw new Error("Missing the required parameter 'subscriptions' when calling unsubscribe");
      }

      let pathParams = {
      };
      let queryParams = {
        'subscriptions': this.buildCollectionParam(subscriptions, 'multi'),
        'principals': this.buildCollectionParam(opts['principals'], 'multi')
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
        '/users/me/subscriptions', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Update a stream
     * Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
     * @param {Number} streamId The ID of the stream to access. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param {String} opts.newName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64). 
     * @param {Boolean} opts.isPrivate Change whether the stream is a private stream. 
     * @param {Boolean} opts.isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead. 
     * @param {Number} opts.streamPostPolicy Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (default to 1)
     * @param {Boolean} opts.historyPublicToSubscribers Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation. 
     * @param {OneOfstringinteger} opts.messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
     * @return {Promise<JsonSuccess>}
     */
    async updateStream(streamId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'streamId' is set
      if (streamId === undefined || streamId === null) {
        throw new Error("Missing the required parameter 'streamId' when calling updateStream");
      }

      let pathParams = {
        'stream_id': streamId
      };
      let queryParams = {
        'description': opts['description'],
        'new_name': opts['newName'],
        'is_private': opts['isPrivate'],
        'is_announcement_only': opts['isAnnouncementOnly'],
        'stream_post_policy': opts['streamPostPolicy'],
        'history_public_to_subscribers': opts['historyPublicToSubscribers'],
        'message_retention_days': opts['messageRetentionDays']
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
        '/streams/{stream_id}', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Update subscription settings
     * This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
     * @param {Array.<Object>} subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
     * @return {Promise<JsonSuccessBase>}
     */
    async updateSubscriptionSettings(subscriptionData) {
      let postBody = null;
      // verify the required parameter 'subscriptionData' is set
      if (subscriptionData === undefined || subscriptionData === null) {
        throw new Error("Missing the required parameter 'subscriptionData' when calling updateSubscriptionSettings");
      }

      let pathParams = {
      };
      let queryParams = {
        'subscription_data': this.buildCollectionParam(subscriptionData, 'multi')
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
        '/users/me/subscriptions/properties', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Update subscriptions
     * Update which streams you are are subscribed to. 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts._delete A list of stream names to unsubscribe from. 
     * @param {Array.<Object>} opts.add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description. 
     * @return {Promise<JsonSuccessBase>}
     */
    async updateSubscriptions(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'delete': this.buildCollectionParam(opts['_delete'], 'multi'),
        'add': this.buildCollectionParam(opts['add'], 'multi')
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
        '/users/me/subscriptions', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


}