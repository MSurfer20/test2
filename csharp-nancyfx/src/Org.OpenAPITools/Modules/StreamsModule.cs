using System;
using Nancy;
using Nancy.ModelBinding;
using System.Collections.Generic;
using Sharpility.Base;
using Org.OpenAPITools._api_v1.Models;
using Org.OpenAPITools._api_v1.Utils;
using NodaTime;

namespace Org.OpenAPITools._api_v1.Modules
{ 
    /// <summary>
    /// Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
    /// </summary>
    public enum MuteTopicOpEnum
    {
        add = 1, 
        remove = 2
    };


    /// <summary>
    /// Module processing requests of Streams domain.
    /// </summary>
    public sealed class StreamsModule : NancyModule
    {
        /// <summary>
        /// Sets up HTTP methods mappings.
        /// </summary>
        /// <param name="service">Service handling requests</param>
        public StreamsModule(StreamsService service) : base("/api/v1")
        { 
            Delete["/streams/{stream_id}"] = parameters =>
            {
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Path);
                Preconditions.IsNotNull(streamId, "Required parameter: 'streamId' is missing at 'ArchiveStream'");
                
                return service.ArchiveStream(Context, streamId);
            };

            Get["/calls/bigbluebutton/create"] = parameters =>
            {
                
                return service.CreateBigBlueButtonVideoCall(Context);
            };

            Get["/get_stream_id"] = parameters =>
            {
                var stream = Parameters.ValueOf<string>(parameters, Context.Request, "stream", ParameterType.Query);
                Preconditions.IsNotNull(stream, "Required parameter: 'stream' is missing at 'GetStreamId'");
                
                return service.GetStreamId(Context, stream);
            };

            Get["/users/me/{stream_id}/topics"] = parameters =>
            {
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Path);
                Preconditions.IsNotNull(streamId, "Required parameter: 'streamId' is missing at 'GetStreamTopics'");
                
                return service.GetStreamTopics(Context, streamId);
            };

            Get["/streams"] = parameters =>
            {
                var includePublic = Parameters.ValueOf<bool?>(parameters, Context.Request, "includePublic", ParameterType.Query);
                var includeWebPublic = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeWebPublic", ParameterType.Query);
                var includeSubscribed = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeSubscribed", ParameterType.Query);
                var includeAllActive = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeAllActive", ParameterType.Query);
                var includeDefault = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeDefault", ParameterType.Query);
                var includeOwnerSubscribed = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeOwnerSubscribed", ParameterType.Query);
                return service.GetStreams(Context, includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
            };

            Get["/users/{user_id}/subscriptions/{stream_id}"] = parameters =>
            {
                var userId = Parameters.ValueOf<int?>(parameters, Context.Request, "userId", ParameterType.Path);
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Path);
                Preconditions.IsNotNull(userId, "Required parameter: 'userId' is missing at 'GetSubscriptionStatus'");
                
                Preconditions.IsNotNull(streamId, "Required parameter: 'streamId' is missing at 'GetSubscriptionStatus'");
                
                return service.GetSubscriptionStatus(Context, userId, streamId);
            };

            Get["/users/me/subscriptions"] = parameters =>
            {
                var includeSubscribers = Parameters.ValueOf<bool?>(parameters, Context.Request, "includeSubscribers", ParameterType.Query);
                return service.GetSubscriptions(Context, includeSubscribers);
            };

            Patch["/users/me/subscriptions/muted_topics"] = parameters =>
            {
                var topic = Parameters.ValueOf<string>(parameters, Context.Request, "topic", ParameterType.Query);
                var op = Parameters.ValueOf<MuteTopicOpEnum?>(parameters, Context.Request, "op", ParameterType.Query);
                var stream = Parameters.ValueOf<string>(parameters, Context.Request, "stream", ParameterType.Query);
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Query);
                Preconditions.IsNotNull(topic, "Required parameter: 'topic' is missing at 'MuteTopic'");
                
                Preconditions.IsNotNull(op, "Required parameter: 'op' is missing at 'MuteTopic'");
                
                return service.MuteTopic(Context, topic, op, stream, streamId);
            };

            Post["/users/me/subscriptions"] = parameters =>
            {
                var subscriptions = Parameters.ValueOf<List<Object>>(parameters, Context.Request, "subscriptions", ParameterType.Query);
                var principals = Parameters.ValueOf<List<OneOfstringinteger>>(parameters, Context.Request, "principals", ParameterType.Query);
                var authorizationErrorsFatal = Parameters.ValueOf<bool?>(parameters, Context.Request, "authorizationErrorsFatal", ParameterType.Query);
                var announce = Parameters.ValueOf<bool?>(parameters, Context.Request, "announce", ParameterType.Query);
                var inviteOnly = Parameters.ValueOf<bool?>(parameters, Context.Request, "inviteOnly", ParameterType.Query);
                var historyPublicToSubscribers = Parameters.ValueOf<bool?>(parameters, Context.Request, "historyPublicToSubscribers", ParameterType.Query);
                var streamPostPolicy = Parameters.ValueOf<int?>(parameters, Context.Request, "streamPostPolicy", ParameterType.Query);
                var messageRetentionDays = Parameters.ValueOf<OneOfstringinteger>(parameters, Context.Request, "messageRetentionDays", ParameterType.Query);
                Preconditions.IsNotNull(subscriptions, "Required parameter: 'subscriptions' is missing at 'Subscribe'");
                
                return service.Subscribe(Context, subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
            };

            Delete["/users/me/subscriptions"] = parameters =>
            {
                var subscriptions = Parameters.ValueOf<List<string>>(parameters, Context.Request, "subscriptions", ParameterType.Query);
                var principals = Parameters.ValueOf<List<OneOfstringinteger>>(parameters, Context.Request, "principals", ParameterType.Query);
                Preconditions.IsNotNull(subscriptions, "Required parameter: 'subscriptions' is missing at 'Unsubscribe'");
                
                return service.Unsubscribe(Context, subscriptions, principals);
            };

            Patch["/streams/{stream_id}"] = parameters =>
            {
                var streamId = Parameters.ValueOf<int?>(parameters, Context.Request, "streamId", ParameterType.Path);
                var description = Parameters.ValueOf<string>(parameters, Context.Request, "description", ParameterType.Query);
                var newName = Parameters.ValueOf<string>(parameters, Context.Request, "newName", ParameterType.Query);
                var isPrivate = Parameters.ValueOf<bool?>(parameters, Context.Request, "isPrivate", ParameterType.Query);
                var isAnnouncementOnly = Parameters.ValueOf<bool?>(parameters, Context.Request, "isAnnouncementOnly", ParameterType.Query);
                var streamPostPolicy = Parameters.ValueOf<int?>(parameters, Context.Request, "streamPostPolicy", ParameterType.Query);
                var historyPublicToSubscribers = Parameters.ValueOf<bool?>(parameters, Context.Request, "historyPublicToSubscribers", ParameterType.Query);
                var messageRetentionDays = Parameters.ValueOf<OneOfstringinteger>(parameters, Context.Request, "messageRetentionDays", ParameterType.Query);
                Preconditions.IsNotNull(streamId, "Required parameter: 'streamId' is missing at 'UpdateStream'");
                
                return service.UpdateStream(Context, streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
            };

            Post["/users/me/subscriptions/properties"] = parameters =>
            {
                var subscriptionData = Parameters.ValueOf<List<Object>>(parameters, Context.Request, "subscriptionData", ParameterType.Query);
                Preconditions.IsNotNull(subscriptionData, "Required parameter: 'subscriptionData' is missing at 'UpdateSubscriptionSettings'");
                
                return service.UpdateSubscriptionSettings(Context, subscriptionData);
            };

            Patch["/users/me/subscriptions"] = parameters =>
            {
                var delete = Parameters.ValueOf<List<string>>(parameters, Context.Request, "delete", ParameterType.Query);
                var add = Parameters.ValueOf<List<Object>>(parameters, Context.Request, "add", ParameterType.Query);
                return service.UpdateSubscriptions(Context, delete, add);
            };
        }
    }

    /// <summary>
    /// Service handling Streams requests.
    /// </summary>
    public interface StreamsService
    {
        /// <summary>
        /// [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess ArchiveStream(NancyContext context, int? streamId);

        /// <summary>
        /// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase CreateBigBlueButtonVideoCall(NancyContext context);

        /// <summary>
        /// Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="stream">The name of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetStreamId(NancyContext context, string stream);

        /// <summary>
        /// Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetStreamTopics(NancyContext context, int? streamId);

        /// <summary>
        /// Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="includePublic">Include all public streams.  (optional, default to true)</param>
        /// <param name="includeWebPublic">Include all web public streams.  (optional, default to false)</param>
        /// <param name="includeSubscribed">Include all streams that the user is subscribed to.  (optional, default to true)</param>
        /// <param name="includeAllActive">Include all active streams. The user must have administrative privileges to use this parameter.  (optional, default to false)</param>
        /// <param name="includeDefault">Include all default streams for the user&#39;s realm.  (optional, default to false)</param>
        /// <param name="includeOwnerSubscribed">If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  (optional, default to false)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetStreams(NancyContext context, bool? includePublic, bool? includeWebPublic, bool? includeSubscribed, bool? includeAllActive, bool? includeDefault, bool? includeOwnerSubscribed);

        /// <summary>
        /// Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="userId">The target user&#39;s ID. </param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetSubscriptionStatus(NancyContext context, int? userId, int? streamId);

        /// <summary>
        /// Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="includeSubscribers">Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional, default to false)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase GetSubscriptions(NancyContext context, bool? includeSubscribers);

        /// <summary>
        /// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="topic">The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. </param>
        /// <param name="op">Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. </param>
        /// <param name="stream">The name of the stream to access.  (optional)</param>
        /// <param name="streamId">The ID of the stream to access.  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess MuteTopic(NancyContext context, string topic, MuteTopicOpEnum? op, string stream, int? streamId);

        /// <summary>
        /// Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="subscriptions">A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)</param>
        /// <param name="authorizationErrorsFatal">A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  (optional, default to true)</param>
        /// <param name="announce">If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  (optional, default to false)</param>
        /// <param name="inviteOnly">As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional, default to false)</param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)</param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional, default to 1)</param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)</param>
        /// <returns>OneOfobjectobject</returns>
        OneOfobjectobject Subscribe(NancyContext context, List<Object> subscriptions, List<OneOfstringinteger> principals, bool? authorizationErrorsFatal, bool? announce, bool? inviteOnly, bool? historyPublicToSubscribers, int? streamPostPolicy, OneOfstringinteger messageRetentionDays);

        /// <summary>
        /// Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="subscriptions">A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. </param>
        /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase Unsubscribe(NancyContext context, List<string> subscriptions, List<OneOfstringinteger> principals);

        /// <summary>
        /// Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="streamId">The ID of the stream to access. </param>
        /// <param name="description">The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)</param>
        /// <param name="newName">The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)</param>
        /// <param name="isPrivate">Change whether the stream is a private stream.  (optional)</param>
        /// <param name="isAnnouncementOnly">Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  (optional)</param>
        /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional, default to 1)</param>
        /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)</param>
        /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)</param>
        /// <returns>JsonSuccess</returns>
        JsonSuccess UpdateStream(NancyContext context, int? streamId, string description, string newName, bool? isPrivate, bool? isAnnouncementOnly, int? streamPostPolicy, bool? historyPublicToSubscribers, OneOfstringinteger messageRetentionDays);

        /// <summary>
        /// This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="subscriptionData">A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. </param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateSubscriptionSettings(NancyContext context, List<Object> subscriptionData);

        /// <summary>
        /// Update which streams you are are subscribed to. 
        /// </summary>
        /// <param name="context">Context of request</param>
        /// <param name="delete">A list of stream names to unsubscribe from.  (optional)</param>
        /// <param name="add">A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)</param>
        /// <returns>JsonSuccessBase</returns>
        JsonSuccessBase UpdateSubscriptions(NancyContext context, List<string> delete, List<Object> add);
    }

    /// <summary>
    /// Abstraction of StreamsService.
    /// </summary>
    public abstract class AbstractStreamsService: StreamsService
    {
        public virtual JsonSuccess ArchiveStream(NancyContext context, int? streamId)
        {
            return ArchiveStream(streamId);
        }

        public virtual JsonSuccessBase CreateBigBlueButtonVideoCall(NancyContext context)
        {
            return CreateBigBlueButtonVideoCall();
        }

        public virtual JsonSuccessBase GetStreamId(NancyContext context, string stream)
        {
            return GetStreamId(stream);
        }

        public virtual JsonSuccessBase GetStreamTopics(NancyContext context, int? streamId)
        {
            return GetStreamTopics(streamId);
        }

        public virtual JsonSuccessBase GetStreams(NancyContext context, bool? includePublic, bool? includeWebPublic, bool? includeSubscribed, bool? includeAllActive, bool? includeDefault, bool? includeOwnerSubscribed)
        {
            return GetStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
        }

        public virtual JsonSuccessBase GetSubscriptionStatus(NancyContext context, int? userId, int? streamId)
        {
            return GetSubscriptionStatus(userId, streamId);
        }

        public virtual JsonSuccessBase GetSubscriptions(NancyContext context, bool? includeSubscribers)
        {
            return GetSubscriptions(includeSubscribers);
        }

        public virtual JsonSuccess MuteTopic(NancyContext context, string topic, MuteTopicOpEnum? op, string stream, int? streamId)
        {
            return MuteTopic(topic, op, stream, streamId);
        }

        public virtual OneOfobjectobject Subscribe(NancyContext context, List<Object> subscriptions, List<OneOfstringinteger> principals, bool? authorizationErrorsFatal, bool? announce, bool? inviteOnly, bool? historyPublicToSubscribers, int? streamPostPolicy, OneOfstringinteger messageRetentionDays)
        {
            return Subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
        }

        public virtual JsonSuccessBase Unsubscribe(NancyContext context, List<string> subscriptions, List<OneOfstringinteger> principals)
        {
            return Unsubscribe(subscriptions, principals);
        }

        public virtual JsonSuccess UpdateStream(NancyContext context, int? streamId, string description, string newName, bool? isPrivate, bool? isAnnouncementOnly, int? streamPostPolicy, bool? historyPublicToSubscribers, OneOfstringinteger messageRetentionDays)
        {
            return UpdateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
        }

        public virtual JsonSuccessBase UpdateSubscriptionSettings(NancyContext context, List<Object> subscriptionData)
        {
            return UpdateSubscriptionSettings(subscriptionData);
        }

        public virtual JsonSuccessBase UpdateSubscriptions(NancyContext context, List<string> delete, List<Object> add)
        {
            return UpdateSubscriptions(delete, add);
        }

        protected abstract JsonSuccess ArchiveStream(int? streamId);

        protected abstract JsonSuccessBase CreateBigBlueButtonVideoCall();

        protected abstract JsonSuccessBase GetStreamId(string stream);

        protected abstract JsonSuccessBase GetStreamTopics(int? streamId);

        protected abstract JsonSuccessBase GetStreams(bool? includePublic, bool? includeWebPublic, bool? includeSubscribed, bool? includeAllActive, bool? includeDefault, bool? includeOwnerSubscribed);

        protected abstract JsonSuccessBase GetSubscriptionStatus(int? userId, int? streamId);

        protected abstract JsonSuccessBase GetSubscriptions(bool? includeSubscribers);

        protected abstract JsonSuccess MuteTopic(string topic, MuteTopicOpEnum? op, string stream, int? streamId);

        protected abstract OneOfobjectobject Subscribe(List<Object> subscriptions, List<OneOfstringinteger> principals, bool? authorizationErrorsFatal, bool? announce, bool? inviteOnly, bool? historyPublicToSubscribers, int? streamPostPolicy, OneOfstringinteger messageRetentionDays);

        protected abstract JsonSuccessBase Unsubscribe(List<string> subscriptions, List<OneOfstringinteger> principals);

        protected abstract JsonSuccess UpdateStream(int? streamId, string description, string newName, bool? isPrivate, bool? isAnnouncementOnly, int? streamPostPolicy, bool? historyPublicToSubscribers, OneOfstringinteger messageRetentionDays);

        protected abstract JsonSuccessBase UpdateSubscriptionSettings(List<Object> subscriptionData);

        protected abstract JsonSuccessBase UpdateSubscriptions(List<string> delete, List<Object> add);
    }

}
