/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Archive a stream
* [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
*
* streamUnderscoreid Integer The ID of the stream to access. 
* returns JsonSuccess
* */
const archive_stream = ({ streamUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        streamUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create BigBlueButton video call
* Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
*
* returns JsonSuccessBase
* */
const create_big_blue_button_video_call = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get stream ID
* Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
*
* stream String The name of the stream to access. 
* returns JsonSuccessBase
* */
const get_stream_id = ({ stream }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        stream,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get topics in a stream
* Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
*
* streamUnderscoreid Integer The ID of the stream to access. 
* returns JsonSuccessBase
* */
const get_stream_topics = ({ streamUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        streamUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get all streams
* Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
*
* includeUnderscorepublic Boolean Include all public streams.  (optional)
* includeUnderscorewebUnderscorepublic Boolean Include all web public streams.  (optional)
* includeUnderscoresubscribed Boolean Include all streams that the user is subscribed to.  (optional)
* includeUnderscoreallUnderscoreactive Boolean Include all active streams. The user must have administrative privileges to use this parameter.  (optional)
* includeUnderscoredefault Boolean Include all default streams for the user's realm.  (optional)
* includeUnderscoreownerUnderscoresubscribed Boolean If the user is a bot, include all streams that the bot's owner is subscribed to.  (optional)
* returns JsonSuccessBase
* */
const get_streams = ({ includeUnderscorepublic, includeUnderscorewebUnderscorepublic, includeUnderscoresubscribed, includeUnderscoreallUnderscoreactive, includeUnderscoredefault, includeUnderscoreownerUnderscoresubscribed }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        includeUnderscorepublic,
        includeUnderscorewebUnderscorepublic,
        includeUnderscoresubscribed,
        includeUnderscoreallUnderscoreactive,
        includeUnderscoredefault,
        includeUnderscoreownerUnderscoresubscribed,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get subscription status
* Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
*
* userUnderscoreid Integer The target user's ID. 
* streamUnderscoreid Integer The ID of the stream to access. 
* returns JsonSuccessBase
* */
const get_subscription_status = ({ userUnderscoreid, streamUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
        streamUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get subscribed streams
* Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
*
* includeUnderscoresubscribers Boolean Whether each returned stream object should include a `subscribers` field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional)
* returns JsonSuccessBase
* */
const get_subscriptions = ({ includeUnderscoresubscribers }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        includeUnderscoresubscribers,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Topic muting
* This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
*
* topic String The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
* op String Whether to mute (`add`) or unmute (`remove`) the provided topic. 
* stream String The name of the stream to access.  (optional)
* streamUnderscoreid Integer The ID of the stream to access.  (optional)
* returns JsonSuccess
* */
const mute_topic = ({ topic, op, stream, streamUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        topic,
        op,
        stream,
        streamUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Subscribe to a stream
* Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
*
* subscriptions List A list of dictionaries containing the key `name` and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key `description` with an appropriate value. 
* principals List A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
* authorizationUnderscoreerrorsUnderscorefatal Boolean A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When `True`, an authorization error is reported as such. When set to `False`, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the `unauthorized` key.  (optional)
* announce Boolean If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream's creation.  (optional)
* inviteUnderscoreonly Boolean As described above, this endpoint will create a new stream if passed a stream name that doesn't already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional)
* historyUnderscorepublicUnderscoretoUnderscoresubscribers Boolean Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
* streamUnderscorepostUnderscorepolicy Integer Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional)
* messageUnderscoreretentionUnderscoredays oneOf<string,integer> Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
* returns oneOf<object,object>
* */
const subscribe = ({ subscriptions, principals, authorizationUnderscoreerrorsUnderscorefatal, announce, inviteUnderscoreonly, historyUnderscorepublicUnderscoretoUnderscoresubscribers, streamUnderscorepostUnderscorepolicy, messageUnderscoreretentionUnderscoredays }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        subscriptions,
        principals,
        authorizationUnderscoreerrorsUnderscorefatal,
        announce,
        inviteUnderscoreonly,
        historyUnderscorepublicUnderscoretoUnderscoresubscribers,
        streamUnderscorepostUnderscorepolicy,
        messageUnderscoreretentionUnderscoredays,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unsubscribe from a stream
* Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
*
* subscriptions List A list of stream names to unsubscribe from. This parameter is called `streams` in our Python API. 
* principals List A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the `subscriptions` parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
* returns JsonSuccessBase
* */
const unsubscribe = ({ subscriptions, principals }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        subscriptions,
        principals,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update a stream
* Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
*
* streamUnderscoreid Integer The ID of the stream to access. 
* description String The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
* newUnderscorename String The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
* isUnderscoreprivate Boolean Change whether the stream is a private stream.  (optional)
* isUnderscoreannouncementUnderscoreonly Boolean Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   `stream_post_policy` instead.  (optional)
* streamUnderscorepostUnderscorepolicy Integer Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean.  (optional)
* historyUnderscorepublicUnderscoretoUnderscoresubscribers Boolean Whether the stream's message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
* messageUnderscoreretentionUnderscoredays oneOf<string,integer> Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \"realm_default\" => Return to the organization-level setting. * \"forever\" => Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
* returns JsonSuccess
* */
const update_stream = ({ streamUnderscoreid, description, newUnderscorename, isUnderscoreprivate, isUnderscoreannouncementUnderscoreonly, streamUnderscorepostUnderscorepolicy, historyUnderscorepublicUnderscoretoUnderscoresubscribers, messageUnderscoreretentionUnderscoredays }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        streamUnderscoreid,
        description,
        newUnderscorename,
        isUnderscoreprivate,
        isUnderscoreannouncementUnderscoreonly,
        streamUnderscorepostUnderscorepolicy,
        historyUnderscorepublicUnderscoretoUnderscoresubscribers,
        messageUnderscoreretentionUnderscoredays,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update subscription settings
* This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
*
* subscriptionUnderscoredata List A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a `stream_id` key that identifies the stream, as well as the `property` being modified and its new `value`.  The possible values for each `property` and `value` pairs are:  * `color` (string): the hex value of the user's display color for the stream. * `is_muted` (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named `in_home_view` (with the   opposite value, `in_home_view=!is_muted`); for   backwards-compatibility, modern Zulip still accepts that value. * `pin_to_top` (boolean): whether to pin the stream at the top of the stream list. * `desktop_notifications` (boolean): whether to show desktop notifications     for all messages sent to the stream. * `audible_notifications` (boolean): whether to play a sound   notification for all messages sent to the stream. * `push_notifications` (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * `email_notifications` (boolean): whether to trigger an email     notification for all messages sent to the stream. 
* returns JsonSuccessBase
* */
const update_subscription_settings = ({ subscriptionUnderscoredata }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        subscriptionUnderscoredata,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update subscriptions
* Update which streams you are are subscribed to. 
*
* _delete List A list of stream names to unsubscribe from.  (optional)
* add List A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)
* returns JsonSuccessBase
* */
const update_subscriptions = ({ _delete, add }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        _delete,
        add,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  archive_stream,
  create_big_blue_button_video_call,
  get_stream_id,
  get_stream_topics,
  get_streams,
  get_subscription_status,
  get_subscriptions,
  mute_topic,
  subscribe,
  unsubscribe,
  update_stream,
  update_subscription_settings,
  update_subscriptions,
};
