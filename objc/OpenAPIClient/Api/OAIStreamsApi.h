#import <Foundation/Foundation.h>
#import "OAICodedError.h"
#import "OAIJsonError.h"
#import "OAIJsonSuccess.h"
#import "OAIJsonSuccessBase.h"
#import "OAINonExistingStreamError.h"
#import "OAIOneOfObjectObject.h"
#import "OAIOneOfStringInteger.h"
#import "OAIApi.h"

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



@interface OAIStreamsApi: NSObject <OAIApi>

extern NSString* kOAIStreamsApiErrorDomain;
extern NSInteger kOAIStreamsApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Archive a stream
/// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
///
/// @param streamId The ID of the stream to access. 
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccess*
-(NSURLSessionTask*) archiveStreamWithStreamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;


/// Create BigBlueButton video call
/// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
///
/// 
///  code:200 message:"Success."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) createBigBlueButtonVideoCallWithCompletionHandler: 
    (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Delete a topic
/// Delete all messages in a topic.  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`  Topics are a field on messages (not an independent data structure), so deleting all the messages in the topic deletes the topic from Zulip. 
///
/// @param streamId The ID of the stream to access. 
/// @param topicName The name of the topic to delete. 
/// 
///  code:200 message:"Success.",
///  code:400 message:"Error."
///
/// @return OAIJsonSuccess*
-(NSURLSessionTask*) deleteTopicWithStreamId: (NSNumber*) streamId
    topicName: (NSString*) topicName
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;


/// Get stream ID
/// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
///
/// @param stream The name of the stream to access. 
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) getStreamIdWithStream: (NSString*) stream
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Get topics in a stream
/// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
///
/// @param streamId The ID of the stream to access. 
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) getStreamTopicsWithStreamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Get all streams
/// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
///
/// @param includePublic Include all public streams.  (optional) (default to @(YES))
/// @param includeWebPublic Include all web public streams.  (optional) (default to @(NO))
/// @param includeSubscribed Include all streams that the user is subscribed to.  (optional) (default to @(YES))
/// @param includeAllActive Include all active streams. The user must have administrative privileges to use this parameter.  (optional) (default to @(NO))
/// @param includeDefault Include all default streams for the user&#39;s realm.  (optional) (default to @(NO))
/// @param includeOwnerSubscribed If the user is a bot, include all streams that the bot&#39;s owner is subscribed to.  (optional) (default to @(NO))
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) getStreamsWithIncludePublic: (NSNumber*) includePublic
    includeWebPublic: (NSNumber*) includeWebPublic
    includeSubscribed: (NSNumber*) includeSubscribed
    includeAllActive: (NSNumber*) includeAllActive
    includeDefault: (NSNumber*) includeDefault
    includeOwnerSubscribed: (NSNumber*) includeOwnerSubscribed
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Get the subscribers of a stream
/// Get all users subscribed to a stream.  `Get {{ api_url }}/v1/streams/{stream_id}/members` 
///
/// @param streamId The ID of the stream to access. 
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) getSubscribersWithStreamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Get subscription status
/// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
///
/// @param userId The target user&#39;s ID. 
/// @param streamId The ID of the stream to access. 
/// 
///  code:200 message:"Success"
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) getSubscriptionStatusWithUserId: (NSNumber*) userId
    streamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Get subscribed streams
/// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
///
/// @param includeSubscribers Whether each returned stream object should include a &#x60;subscribers&#x60; field containing a list of the user IDs of its subscribers.  (This may be significantly slower in organizations with thousands of users subscribed to many streams.)  **Changes**: New in Zulip 2.1.0.  (optional) (default to @(NO))
/// 
///  code:200 message:"Success."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) getSubscriptionsWithIncludeSubscribers: (NSNumber*) includeSubscribers
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Topic muting
/// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
///
/// @param topic The topic to (un)mute. Note that the request will succeed regardless of whether any messages have been sent to the specified topic. 
/// @param op Whether to mute (&#x60;add&#x60;) or unmute (&#x60;remove&#x60;) the provided topic. 
/// @param stream The name of the stream to access.  (optional)
/// @param streamId The ID of the stream to access.  (optional)
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccess*
-(NSURLSessionTask*) muteTopicWithTopic: (NSString*) topic
    op: (NSString*) op
    stream: (NSString*) stream
    streamId: (NSNumber*) streamId
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;


/// Subscribe to a stream
/// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
///
/// @param subscriptions A list of dictionaries containing the key &#x60;name&#x60; and value specifying the name of the stream to subscribe. If the stream does not exist a new stream is created. The description of the stream created can be specified by setting the dictionary key &#x60;description&#x60; with an appropriate value. 
/// @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
/// @param authorizationErrorsFatal A boolean specifying whether authorization errors (such as when the requesting user is not authorized to access a private stream) should be considered fatal or not. When &#x60;True&#x60;, an authorization error is reported as such. When set to &#x60;False&#x60;, the response will be a 200 and any streams where the request encountered an authorization error will be listed in the &#x60;unauthorized&#x60; key.  (optional) (default to @(YES))
/// @param announce If one of the streams specified did not exist previously and is thus craeted by this call, this determines whether [notification bot](/help/configure-notification-bot) will send an announcement about the new stream&#39;s creation.  (optional) (default to @(NO))
/// @param inviteOnly As described above, this endpoint will create a new stream if passed a stream name that doesn&#39;t already exist.  This parameters and the ones that follow are used to request an initial configuration of a created stream; they are ignored for streams that already exist.  This parameter determines whether any newly created streams will be private streams.  (optional) (default to @(NO))
/// @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
/// @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional) (default to @1)
/// @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
/// 
///  code:200 message:"Success.",
///  code:400 message:"Success."
///
/// @return OAIOneOfObjectObject*
-(NSURLSessionTask*) subscribeWithSubscriptions: (NSArray<NSObject*>*) subscriptions
    principals: (NSArray<OAIOneOfStringInteger>*) principals
    authorizationErrorsFatal: (NSNumber*) authorizationErrorsFatal
    announce: (NSNumber*) announce
    inviteOnly: (NSNumber*) inviteOnly
    historyPublicToSubscribers: (NSNumber*) historyPublicToSubscribers
    streamPostPolicy: (NSNumber*) streamPostPolicy
    messageRetentionDays: (OAIOneOfStringInteger*) messageRetentionDays
    completionHandler: (void (^)(OAIOneOfObjectObject* output, NSError* error)) handler;


/// Unsubscribe from a stream
/// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
///
/// @param subscriptions A list of stream names to unsubscribe from. This parameter is called &#x60;streams&#x60; in our Python API. 
/// @param principals A list of user ids (preferred) or Zulip display email addresses of the users to be subscribed to or unsubscribed from the streams specified in the &#x60;subscriptions&#x60; parameter. If not provided, then the requesting user/bot is subscribed.  **Changes**: The integer format is new in Zulip 3.0 (feature level 9).  (optional)
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) unsubscribeWithSubscriptions: (NSArray<NSString*>*) subscriptions
    principals: (NSArray<OAIOneOfStringInteger>*) principals
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Update a stream
/// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
///
/// @param streamId The ID of the stream to access. 
/// @param _description The new description for the stream. Limited Zulip markdown is allowed in this field.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
/// @param varNewName The new name for the stream.  **Changes**: Removed unnecessary JSON-encoding of this parameter in Zulip 4.0 (feature level 64).  (optional)
/// @param isPrivate Change whether the stream is a private stream.  (optional)
/// @param isAnnouncementOnly Whether the stream is limited to announcements.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use   &#x60;stream_post_policy&#x60; instead.  (optional)
/// @param streamPostPolicy Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  (optional) (default to @1)
/// @param historyPublicToSubscribers Whether the stream&#39;s message history should be available to newly subscribed members, or users can only access messages they actually received while subscribed to the stream.  Corresponds to the [shared history](/help/stream-permissions) option in documentation.  (optional)
/// @param messageRetentionDays Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  Two special string format values are supported:  * \&quot;realm_default\&quot; &#x3D;&gt; Return to the organization-level setting. * \&quot;forever\&quot; &#x3D;&gt; Retain messages forever.  **Changes**: New in Zulip 3.0 (feature level 17).  (optional)
/// 
///  code:200 message:"Success.",
///  code:400 message:"Bad request."
///
/// @return OAIJsonSuccess*
-(NSURLSessionTask*) updateStreamWithStreamId: (NSNumber*) streamId
    _description: (NSString*) _description
    varNewName: (NSString*) varNewName
    isPrivate: (NSNumber*) isPrivate
    isAnnouncementOnly: (NSNumber*) isAnnouncementOnly
    streamPostPolicy: (NSNumber*) streamPostPolicy
    historyPublicToSubscribers: (NSNumber*) historyPublicToSubscribers
    messageRetentionDays: (OAIOneOfStringInteger*) messageRetentionDays
    completionHandler: (void (^)(OAIJsonSuccess* output, NSError* error)) handler;


/// Update subscription settings
/// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
///
/// @param subscriptionData A list of objects that describe the changes that should be applied in each subscription. Each object represents a subscription, and must have a &#x60;stream_id&#x60; key that identifies the stream, as well as the &#x60;property&#x60; being modified and its new &#x60;value&#x60;.  The possible values for each &#x60;property&#x60; and &#x60;value&#x60; pairs are:  * &#x60;color&#x60; (string): the hex value of the user&#39;s display color for the stream. * &#x60;is_muted&#x60; (boolean): whether the stream is   [muted](/help/mute-a-stream).  Prior to Zulip 2.1, this feature was   represented by the more confusingly named &#x60;in_home_view&#x60; (with the   opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;); for   backwards-compatibility, modern Zulip still accepts that value. * &#x60;pin_to_top&#x60; (boolean): whether to pin the stream at the top of the stream list. * &#x60;desktop_notifications&#x60; (boolean): whether to show desktop notifications     for all messages sent to the stream. * &#x60;audible_notifications&#x60; (boolean): whether to play a sound   notification for all messages sent to the stream. * &#x60;push_notifications&#x60; (boolean): whether to trigger a mobile push     notification for all messages sent to the stream. * &#x60;email_notifications&#x60; (boolean): whether to trigger an email     notification for all messages sent to the stream. 
/// 
///  code:200 message:"Success."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) updateSubscriptionSettingsWithSubscriptionData: (NSArray<NSObject*>*) subscriptionData
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;


/// Update subscriptions
/// Update which streams you are are subscribed to. 
///
/// @param delete A list of stream names to unsubscribe from.  (optional)
/// @param add A list of objects describing which streams to subscribe to, optionally including per-user subscription parameters (e.g. color) and if the stream is to be created, its description.  (optional)
/// 
///  code:200 message:"Success."
///
/// @return OAIJsonSuccessBase*
-(NSURLSessionTask*) updateSubscriptionsWithDelete: (NSArray<NSString*>*) delete
    add: (NSArray<NSObject*>*) add
    completionHandler: (void (^)(OAIJsonSuccessBase* output, NSError* error)) handler;



@end
