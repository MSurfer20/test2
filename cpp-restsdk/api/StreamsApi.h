/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * StreamsApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_StreamsApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_StreamsApi_H_


#include "../ApiClient.h"

#include "CodedError.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "JsonSuccessBase.h"
#include "NonExistingStreamError.h"
#include "Object.h"
#include "OneOfobjectobject.h"
#include "OneOfstringinteger.h"
#include <cpprest/details/basic_types.h>


#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  StreamsApi 
{
public:

    explicit StreamsApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~StreamsApi();

    /// <summary>
    /// Archive a stream
    /// </summary>
    /// <remarks>
    /// [Archive the stream](/help/archive-a-stream) with the ID &#x60;stream_id&#x60;.  &#x60;DELETE {{ api_url }}/v1/streams/{stream_id}&#x60; 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    pplx::task<std::shared_ptr<JsonSuccess>> archiveStream(
        int32_t streamId
    ) const;
    /// <summary>
    /// Create BigBlueButton video call
    /// </summary>
    /// <remarks>
    /// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
    /// </remarks>
    pplx::task<std::shared_ptr<JsonSuccessBase>> createBigBlueButtonVideoCall(
    ) const;
    /// <summary>
    /// Delete a topic
    /// </summary>
    /// <remarks>
    /// Delete all messages in a topic.  &#x60;POST {{ api_url }}/v1/streams/{stream_id}/delete_topic&#x60;  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    /// <param name="topicName">The name of the topic to delete. </param>
    pplx::task<std::shared_ptr<JsonSuccess>> deleteTopic(
        int32_t streamId,
        utility::string_t topicName
    ) const;
    /// <summary>
    /// Get stream ID
    /// </summary>
    /// <remarks>
    /// Get the unique ID of a given stream.  &#x60;GET {{ api_url }}/v1/get_stream_id&#x60; 
    /// </remarks>
    /// <param name="stream">The name of the stream to access. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getStreamId(
        utility::string_t stream
    ) const;
    /// <summary>
    /// Get topics in a stream
    /// </summary>
    /// <remarks>
    /// Get all the topics in a specific stream  &#x60;GET {{ api_url }}/v1/users/me/{stream_id}/topics&#x60; 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getStreamTopics(
        int32_t streamId
    ) const;
    /// <summary>
    /// Get all streams
    /// </summary>
    /// <remarks>
    /// Get all streams that the user has access to.  &#x60;GET {{ api_url }}/v1/streams&#x60; 
    /// </remarks>
    /// <param name="includePublic">Include all public streams.  (optional, default to false)</param>
    /// <param name="includeWebPublic">Include all web public streams.  (optional, default to false)</param>
    /// <param name="includeSubscribed">Include all streams that the user is subscribed to.  (optional, default to false)</param>
    /// <param name="includeAllActive">Include all active streams. The user must have administrative privileges to use this parameter.  (optional, default to false)</param>
    /// <param name="includeDefault">Include all default streams for the user&#39;s realm.  (optional, default to false)</param>
    /// <param name="includeOwnerSubscribed">If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  (optional, default to false)</param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getStreams(
        boost::optional<bool> includePublic,
        boost::optional<bool> includeWebPublic,
        boost::optional<bool> includeSubscribed,
        boost::optional<bool> includeAllActive,
        boost::optional<bool> includeDefault,
        boost::optional<bool> includeOwnerSubscribed
    ) const;
    /// <summary>
    /// Get the subscribers of a stream
    /// </summary>
    /// <remarks>
    /// Get all users subscribed to a stream.  &#x60;Get {{ api_url }}/v1/streams/{stream_id}/members&#x60; 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getSubscribers(
        int32_t streamId
    ) const;
    /// <summary>
    /// Get subscription status
    /// </summary>
    /// <remarks>
    /// Check whether a user is subscribed to a stream.  &#x60;GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}&#x60;  **Changes**: New in Zulip 3.0 (feature level 11). 
    /// </remarks>
    /// <param name="userId">The target user&#39;s ID. </param>
    /// <param name="streamId">The ID of the stream to access. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getSubscriptionStatus(
        int32_t userId,
        int32_t streamId
    ) const;
    /// <summary>
    /// Get subscribed streams
    /// </summary>
    /// <remarks>
    /// Get all streams that the user is subscribed to.  &#x60;GET {{ api_url }}/v1/users/me/subscriptions&#x60; 
    /// </remarks>
    /// <param name="includeSubscribers">Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional, default to false)</param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> getSubscriptions(
        boost::optional<bool> includeSubscribers
    ) const;
    /// <summary>
    /// Topic muting
    /// </summary>
    /// <remarks>
    /// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user&#39;s unread count totals.  &#x60;PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics&#x60; 
    /// </remarks>
    /// <param name="topic">The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. </param>
    /// <param name="op">Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. </param>
    /// <param name="stream">The name of the stream to access.  (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="streamId">The ID of the stream to access.  (optional, default to 0)</param>
    pplx::task<std::shared_ptr<JsonSuccess>> muteTopic(
        utility::string_t topic,
        utility::string_t op,
        boost::optional<utility::string_t> stream,
        boost::optional<int32_t> streamId
    ) const;
    /// <summary>
    /// Subscribe to a stream
    /// </summary>
    /// <remarks>
    /// Subscribe one or more users to one or more streams.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions&#x60;  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like &#x60;invite_only&#x60; detailed below. 
    /// </remarks>
    /// <param name="subscriptions">A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. </param>
    /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional, default to std::vector&lt;std::shared_ptr&lt;OneOfstringinteger&gt;&gt;())</param>
    /// <param name="authorizationErrorsFatal">A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  (optional, default to false)</param>
    /// <param name="announce">If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  (optional, default to false)</param>
    /// <param name="inviteOnly">As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional, default to false)</param>
    /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional, default to false)</param>
    /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional, default to 0)</param>
    /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional, default to nullptr)</param>
    pplx::task<std::shared_ptr<OneOfobjectobject>> subscribe(
        std::vector<std::shared_ptr<Object>> subscriptions,
        boost::optional<std::vector<std::shared_ptr<OneOfstringinteger>>> principals,
        boost::optional<bool> authorizationErrorsFatal,
        boost::optional<bool> announce,
        boost::optional<bool> inviteOnly,
        boost::optional<bool> historyPublicToSubscribers,
        boost::optional<int32_t> streamPostPolicy,
        boost::optional<std::shared_ptr<OneOfstringinteger>> messageRetentionDays
    ) const;
    /// <summary>
    /// Unsubscribe from a stream
    /// </summary>
    /// <remarks>
    /// Unsubscribe yourself or other users from one or more streams.  &#x60;DELETE {{ api_url }}/v1/users/me/subscriptions&#x60; 
    /// </remarks>
    /// <param name="subscriptions">A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. </param>
    /// <param name="principals">A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional, default to std::vector&lt;std::shared_ptr&lt;OneOfstringinteger&gt;&gt;())</param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> unsubscribe(
        std::vector<utility::string_t> subscriptions,
        boost::optional<std::vector<std::shared_ptr<OneOfstringinteger>>> principals
    ) const;
    /// <summary>
    /// Update a stream
    /// </summary>
    /// <remarks>
    /// Configure the stream with the ID &#x60;stream_id&#x60;.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  &#x60;PATCH {{ api_url }}/v1/streams/{stream_id}&#x60; 
    /// </remarks>
    /// <param name="streamId">The ID of the stream to access. </param>
    /// <param name="description">The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="newName">The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="isPrivate">Change whether the stream is a private stream.  (optional, default to false)</param>
    /// <param name="isAnnouncementOnly">Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  (optional, default to false)</param>
    /// <param name="streamPostPolicy">Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional, default to 0)</param>
    /// <param name="historyPublicToSubscribers">Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional, default to false)</param>
    /// <param name="messageRetentionDays">Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional, default to nullptr)</param>
    pplx::task<std::shared_ptr<JsonSuccess>> updateStream(
        int32_t streamId,
        boost::optional<utility::string_t> description,
        boost::optional<utility::string_t> newName,
        boost::optional<bool> isPrivate,
        boost::optional<bool> isAnnouncementOnly,
        boost::optional<int32_t> streamPostPolicy,
        boost::optional<bool> historyPublicToSubscribers,
        boost::optional<std::shared_ptr<OneOfstringinteger>> messageRetentionDays
    ) const;
    /// <summary>
    /// Update subscription settings
    /// </summary>
    /// <remarks>
    /// This endpoint is used to update the user&#39;s personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  &#x60;POST {{ api_url }}/v1/users/me/subscriptions/properties&#x60; 
    /// </remarks>
    /// <param name="subscriptionData">A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. </param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> updateSubscriptionSettings(
        std::vector<std::shared_ptr<Object>> subscriptionData
    ) const;
    /// <summary>
    /// Update subscriptions
    /// </summary>
    /// <remarks>
    /// Update which streams you are are subscribed to. 
    /// </remarks>
    /// <param name="r_delete">A list of stream names to unsubscribe from.  (optional, default to std::vector&lt;std::shared_ptr&lt;utility::string_t&gt;&gt;())</param>
    /// <param name="add">A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional, default to std::vector&lt;std::shared_ptr&lt;Object&gt;&gt;())</param>
    pplx::task<std::shared_ptr<JsonSuccessBase>> updateSubscriptions(
        boost::optional<std::vector<utility::string_t>> r_delete,
        boost::optional<std::vector<std::shared_ptr<Object>>> add
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_StreamsApi_H_ */

