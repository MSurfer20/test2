# Subscriptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StreamId** | Pointer to **int32** | The unique ID of a stream.  | [optional] 
**Name** | Pointer to **string** | The name of a stream.  | [optional] 
**Description** | Pointer to **string** | The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description.  | [optional] 
**RenderedDescription** | Pointer to **string** | A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  | [optional] 
**DateCreated** | Pointer to **int32** | The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  | [optional] 
**InviteOnly** | Pointer to **bool** | Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  | [optional] 
**Subscribers** | Pointer to **[]int32** | A list of user IDs of users who are also subscribed to a given stream. Included only if &#x60;include_subscribers&#x60; is &#x60;true&#x60;.  | [optional] 
**DesktopNotifications** | Pointer to **NullableBool** | A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream.  | [optional] 
**EmailNotifications** | Pointer to **NullableBool** | A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream.  | [optional] 
**WildcardMentionsNotify** | Pointer to **NullableBool** | A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream.  | [optional] 
**PushNotifications** | Pointer to **NullableBool** | A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream.  | [optional] 
**AudibleNotifications** | Pointer to **NullableBool** | A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream.  | [optional] 
**PinToTop** | Pointer to **bool** | A boolean specifying whether the given stream has been pinned to the top.  | [optional] 
**EmailAddress** | Pointer to **string** | Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email).  | [optional] 
**IsMuted** | Pointer to **bool** | Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in &#x60;All messages&#x60; view (previously known as &#x60;Home&#x60; view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named &#x60;in_home_view&#x60; (with the opposite value, &#x60;in_home_view&#x3D;!is_muted&#x60;).  | [optional] 
**InHomeView** | Pointer to **bool** | Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available.  | [optional] 
**IsAnnouncementOnly** | Pointer to **bool** | Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead.  | [optional] 
**IsWebPublic** | Pointer to **bool** | Whether the stream has been configured to allow unauthenticated access to its message history from the web.  | [optional] 
**Role** | Pointer to **int32** | The user&#39;s role within the stream (distinct from the user&#39;s [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 &#x3D;&gt; Stream administrator. * 50 &#x3D;&gt; Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31).  | [optional] 
**Color** | Pointer to **string** | The user&#39;s personal color for the stream.  | [optional] 
**StreamPostPolicy** | Pointer to **int32** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] 
**MessageRetentionDays** | Pointer to **NullableInt32** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 
**HistoryPublicToSubscribers** | Pointer to **bool** | Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future.  | [optional] 
**FirstMessageId** | Pointer to **NullableInt32** | The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  | [optional] 
**StreamWeeklyTraffic** | Pointer to **NullableInt32** | The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic.  | [optional] 

## Methods

### NewSubscriptions

`func NewSubscriptions() *Subscriptions`

NewSubscriptions instantiates a new Subscriptions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSubscriptionsWithDefaults

`func NewSubscriptionsWithDefaults() *Subscriptions`

NewSubscriptionsWithDefaults instantiates a new Subscriptions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStreamId

`func (o *Subscriptions) GetStreamId() int32`

GetStreamId returns the StreamId field if non-nil, zero value otherwise.

### GetStreamIdOk

`func (o *Subscriptions) GetStreamIdOk() (*int32, bool)`

GetStreamIdOk returns a tuple with the StreamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamId

`func (o *Subscriptions) SetStreamId(v int32)`

SetStreamId sets StreamId field to given value.

### HasStreamId

`func (o *Subscriptions) HasStreamId() bool`

HasStreamId returns a boolean if a field has been set.

### GetName

`func (o *Subscriptions) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Subscriptions) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Subscriptions) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Subscriptions) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *Subscriptions) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Subscriptions) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Subscriptions) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Subscriptions) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetRenderedDescription

`func (o *Subscriptions) GetRenderedDescription() string`

GetRenderedDescription returns the RenderedDescription field if non-nil, zero value otherwise.

### GetRenderedDescriptionOk

`func (o *Subscriptions) GetRenderedDescriptionOk() (*string, bool)`

GetRenderedDescriptionOk returns a tuple with the RenderedDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRenderedDescription

`func (o *Subscriptions) SetRenderedDescription(v string)`

SetRenderedDescription sets RenderedDescription field to given value.

### HasRenderedDescription

`func (o *Subscriptions) HasRenderedDescription() bool`

HasRenderedDescription returns a boolean if a field has been set.

### GetDateCreated

`func (o *Subscriptions) GetDateCreated() int32`

GetDateCreated returns the DateCreated field if non-nil, zero value otherwise.

### GetDateCreatedOk

`func (o *Subscriptions) GetDateCreatedOk() (*int32, bool)`

GetDateCreatedOk returns a tuple with the DateCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateCreated

`func (o *Subscriptions) SetDateCreated(v int32)`

SetDateCreated sets DateCreated field to given value.

### HasDateCreated

`func (o *Subscriptions) HasDateCreated() bool`

HasDateCreated returns a boolean if a field has been set.

### GetInviteOnly

`func (o *Subscriptions) GetInviteOnly() bool`

GetInviteOnly returns the InviteOnly field if non-nil, zero value otherwise.

### GetInviteOnlyOk

`func (o *Subscriptions) GetInviteOnlyOk() (*bool, bool)`

GetInviteOnlyOk returns a tuple with the InviteOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteOnly

`func (o *Subscriptions) SetInviteOnly(v bool)`

SetInviteOnly sets InviteOnly field to given value.

### HasInviteOnly

`func (o *Subscriptions) HasInviteOnly() bool`

HasInviteOnly returns a boolean if a field has been set.

### GetSubscribers

`func (o *Subscriptions) GetSubscribers() []int32`

GetSubscribers returns the Subscribers field if non-nil, zero value otherwise.

### GetSubscribersOk

`func (o *Subscriptions) GetSubscribersOk() (*[]int32, bool)`

GetSubscribersOk returns a tuple with the Subscribers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribers

`func (o *Subscriptions) SetSubscribers(v []int32)`

SetSubscribers sets Subscribers field to given value.

### HasSubscribers

`func (o *Subscriptions) HasSubscribers() bool`

HasSubscribers returns a boolean if a field has been set.

### GetDesktopNotifications

`func (o *Subscriptions) GetDesktopNotifications() bool`

GetDesktopNotifications returns the DesktopNotifications field if non-nil, zero value otherwise.

### GetDesktopNotificationsOk

`func (o *Subscriptions) GetDesktopNotificationsOk() (*bool, bool)`

GetDesktopNotificationsOk returns a tuple with the DesktopNotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDesktopNotifications

`func (o *Subscriptions) SetDesktopNotifications(v bool)`

SetDesktopNotifications sets DesktopNotifications field to given value.

### HasDesktopNotifications

`func (o *Subscriptions) HasDesktopNotifications() bool`

HasDesktopNotifications returns a boolean if a field has been set.

### SetDesktopNotificationsNil

`func (o *Subscriptions) SetDesktopNotificationsNil(b bool)`

 SetDesktopNotificationsNil sets the value for DesktopNotifications to be an explicit nil

### UnsetDesktopNotifications
`func (o *Subscriptions) UnsetDesktopNotifications()`

UnsetDesktopNotifications ensures that no value is present for DesktopNotifications, not even an explicit nil
### GetEmailNotifications

`func (o *Subscriptions) GetEmailNotifications() bool`

GetEmailNotifications returns the EmailNotifications field if non-nil, zero value otherwise.

### GetEmailNotificationsOk

`func (o *Subscriptions) GetEmailNotificationsOk() (*bool, bool)`

GetEmailNotificationsOk returns a tuple with the EmailNotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailNotifications

`func (o *Subscriptions) SetEmailNotifications(v bool)`

SetEmailNotifications sets EmailNotifications field to given value.

### HasEmailNotifications

`func (o *Subscriptions) HasEmailNotifications() bool`

HasEmailNotifications returns a boolean if a field has been set.

### SetEmailNotificationsNil

`func (o *Subscriptions) SetEmailNotificationsNil(b bool)`

 SetEmailNotificationsNil sets the value for EmailNotifications to be an explicit nil

### UnsetEmailNotifications
`func (o *Subscriptions) UnsetEmailNotifications()`

UnsetEmailNotifications ensures that no value is present for EmailNotifications, not even an explicit nil
### GetWildcardMentionsNotify

`func (o *Subscriptions) GetWildcardMentionsNotify() bool`

GetWildcardMentionsNotify returns the WildcardMentionsNotify field if non-nil, zero value otherwise.

### GetWildcardMentionsNotifyOk

`func (o *Subscriptions) GetWildcardMentionsNotifyOk() (*bool, bool)`

GetWildcardMentionsNotifyOk returns a tuple with the WildcardMentionsNotify field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWildcardMentionsNotify

`func (o *Subscriptions) SetWildcardMentionsNotify(v bool)`

SetWildcardMentionsNotify sets WildcardMentionsNotify field to given value.

### HasWildcardMentionsNotify

`func (o *Subscriptions) HasWildcardMentionsNotify() bool`

HasWildcardMentionsNotify returns a boolean if a field has been set.

### SetWildcardMentionsNotifyNil

`func (o *Subscriptions) SetWildcardMentionsNotifyNil(b bool)`

 SetWildcardMentionsNotifyNil sets the value for WildcardMentionsNotify to be an explicit nil

### UnsetWildcardMentionsNotify
`func (o *Subscriptions) UnsetWildcardMentionsNotify()`

UnsetWildcardMentionsNotify ensures that no value is present for WildcardMentionsNotify, not even an explicit nil
### GetPushNotifications

`func (o *Subscriptions) GetPushNotifications() bool`

GetPushNotifications returns the PushNotifications field if non-nil, zero value otherwise.

### GetPushNotificationsOk

`func (o *Subscriptions) GetPushNotificationsOk() (*bool, bool)`

GetPushNotificationsOk returns a tuple with the PushNotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPushNotifications

`func (o *Subscriptions) SetPushNotifications(v bool)`

SetPushNotifications sets PushNotifications field to given value.

### HasPushNotifications

`func (o *Subscriptions) HasPushNotifications() bool`

HasPushNotifications returns a boolean if a field has been set.

### SetPushNotificationsNil

`func (o *Subscriptions) SetPushNotificationsNil(b bool)`

 SetPushNotificationsNil sets the value for PushNotifications to be an explicit nil

### UnsetPushNotifications
`func (o *Subscriptions) UnsetPushNotifications()`

UnsetPushNotifications ensures that no value is present for PushNotifications, not even an explicit nil
### GetAudibleNotifications

`func (o *Subscriptions) GetAudibleNotifications() bool`

GetAudibleNotifications returns the AudibleNotifications field if non-nil, zero value otherwise.

### GetAudibleNotificationsOk

`func (o *Subscriptions) GetAudibleNotificationsOk() (*bool, bool)`

GetAudibleNotificationsOk returns a tuple with the AudibleNotifications field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudibleNotifications

`func (o *Subscriptions) SetAudibleNotifications(v bool)`

SetAudibleNotifications sets AudibleNotifications field to given value.

### HasAudibleNotifications

`func (o *Subscriptions) HasAudibleNotifications() bool`

HasAudibleNotifications returns a boolean if a field has been set.

### SetAudibleNotificationsNil

`func (o *Subscriptions) SetAudibleNotificationsNil(b bool)`

 SetAudibleNotificationsNil sets the value for AudibleNotifications to be an explicit nil

### UnsetAudibleNotifications
`func (o *Subscriptions) UnsetAudibleNotifications()`

UnsetAudibleNotifications ensures that no value is present for AudibleNotifications, not even an explicit nil
### GetPinToTop

`func (o *Subscriptions) GetPinToTop() bool`

GetPinToTop returns the PinToTop field if non-nil, zero value otherwise.

### GetPinToTopOk

`func (o *Subscriptions) GetPinToTopOk() (*bool, bool)`

GetPinToTopOk returns a tuple with the PinToTop field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinToTop

`func (o *Subscriptions) SetPinToTop(v bool)`

SetPinToTop sets PinToTop field to given value.

### HasPinToTop

`func (o *Subscriptions) HasPinToTop() bool`

HasPinToTop returns a boolean if a field has been set.

### GetEmailAddress

`func (o *Subscriptions) GetEmailAddress() string`

GetEmailAddress returns the EmailAddress field if non-nil, zero value otherwise.

### GetEmailAddressOk

`func (o *Subscriptions) GetEmailAddressOk() (*string, bool)`

GetEmailAddressOk returns a tuple with the EmailAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailAddress

`func (o *Subscriptions) SetEmailAddress(v string)`

SetEmailAddress sets EmailAddress field to given value.

### HasEmailAddress

`func (o *Subscriptions) HasEmailAddress() bool`

HasEmailAddress returns a boolean if a field has been set.

### GetIsMuted

`func (o *Subscriptions) GetIsMuted() bool`

GetIsMuted returns the IsMuted field if non-nil, zero value otherwise.

### GetIsMutedOk

`func (o *Subscriptions) GetIsMutedOk() (*bool, bool)`

GetIsMutedOk returns a tuple with the IsMuted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMuted

`func (o *Subscriptions) SetIsMuted(v bool)`

SetIsMuted sets IsMuted field to given value.

### HasIsMuted

`func (o *Subscriptions) HasIsMuted() bool`

HasIsMuted returns a boolean if a field has been set.

### GetInHomeView

`func (o *Subscriptions) GetInHomeView() bool`

GetInHomeView returns the InHomeView field if non-nil, zero value otherwise.

### GetInHomeViewOk

`func (o *Subscriptions) GetInHomeViewOk() (*bool, bool)`

GetInHomeViewOk returns a tuple with the InHomeView field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInHomeView

`func (o *Subscriptions) SetInHomeView(v bool)`

SetInHomeView sets InHomeView field to given value.

### HasInHomeView

`func (o *Subscriptions) HasInHomeView() bool`

HasInHomeView returns a boolean if a field has been set.

### GetIsAnnouncementOnly

`func (o *Subscriptions) GetIsAnnouncementOnly() bool`

GetIsAnnouncementOnly returns the IsAnnouncementOnly field if non-nil, zero value otherwise.

### GetIsAnnouncementOnlyOk

`func (o *Subscriptions) GetIsAnnouncementOnlyOk() (*bool, bool)`

GetIsAnnouncementOnlyOk returns a tuple with the IsAnnouncementOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAnnouncementOnly

`func (o *Subscriptions) SetIsAnnouncementOnly(v bool)`

SetIsAnnouncementOnly sets IsAnnouncementOnly field to given value.

### HasIsAnnouncementOnly

`func (o *Subscriptions) HasIsAnnouncementOnly() bool`

HasIsAnnouncementOnly returns a boolean if a field has been set.

### GetIsWebPublic

`func (o *Subscriptions) GetIsWebPublic() bool`

GetIsWebPublic returns the IsWebPublic field if non-nil, zero value otherwise.

### GetIsWebPublicOk

`func (o *Subscriptions) GetIsWebPublicOk() (*bool, bool)`

GetIsWebPublicOk returns a tuple with the IsWebPublic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsWebPublic

`func (o *Subscriptions) SetIsWebPublic(v bool)`

SetIsWebPublic sets IsWebPublic field to given value.

### HasIsWebPublic

`func (o *Subscriptions) HasIsWebPublic() bool`

HasIsWebPublic returns a boolean if a field has been set.

### GetRole

`func (o *Subscriptions) GetRole() int32`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *Subscriptions) GetRoleOk() (*int32, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *Subscriptions) SetRole(v int32)`

SetRole sets Role field to given value.

### HasRole

`func (o *Subscriptions) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetColor

`func (o *Subscriptions) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *Subscriptions) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *Subscriptions) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *Subscriptions) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetStreamPostPolicy

`func (o *Subscriptions) GetStreamPostPolicy() int32`

GetStreamPostPolicy returns the StreamPostPolicy field if non-nil, zero value otherwise.

### GetStreamPostPolicyOk

`func (o *Subscriptions) GetStreamPostPolicyOk() (*int32, bool)`

GetStreamPostPolicyOk returns a tuple with the StreamPostPolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamPostPolicy

`func (o *Subscriptions) SetStreamPostPolicy(v int32)`

SetStreamPostPolicy sets StreamPostPolicy field to given value.

### HasStreamPostPolicy

`func (o *Subscriptions) HasStreamPostPolicy() bool`

HasStreamPostPolicy returns a boolean if a field has been set.

### GetMessageRetentionDays

`func (o *Subscriptions) GetMessageRetentionDays() int32`

GetMessageRetentionDays returns the MessageRetentionDays field if non-nil, zero value otherwise.

### GetMessageRetentionDaysOk

`func (o *Subscriptions) GetMessageRetentionDaysOk() (*int32, bool)`

GetMessageRetentionDaysOk returns a tuple with the MessageRetentionDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageRetentionDays

`func (o *Subscriptions) SetMessageRetentionDays(v int32)`

SetMessageRetentionDays sets MessageRetentionDays field to given value.

### HasMessageRetentionDays

`func (o *Subscriptions) HasMessageRetentionDays() bool`

HasMessageRetentionDays returns a boolean if a field has been set.

### SetMessageRetentionDaysNil

`func (o *Subscriptions) SetMessageRetentionDaysNil(b bool)`

 SetMessageRetentionDaysNil sets the value for MessageRetentionDays to be an explicit nil

### UnsetMessageRetentionDays
`func (o *Subscriptions) UnsetMessageRetentionDays()`

UnsetMessageRetentionDays ensures that no value is present for MessageRetentionDays, not even an explicit nil
### GetHistoryPublicToSubscribers

`func (o *Subscriptions) GetHistoryPublicToSubscribers() bool`

GetHistoryPublicToSubscribers returns the HistoryPublicToSubscribers field if non-nil, zero value otherwise.

### GetHistoryPublicToSubscribersOk

`func (o *Subscriptions) GetHistoryPublicToSubscribersOk() (*bool, bool)`

GetHistoryPublicToSubscribersOk returns a tuple with the HistoryPublicToSubscribers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHistoryPublicToSubscribers

`func (o *Subscriptions) SetHistoryPublicToSubscribers(v bool)`

SetHistoryPublicToSubscribers sets HistoryPublicToSubscribers field to given value.

### HasHistoryPublicToSubscribers

`func (o *Subscriptions) HasHistoryPublicToSubscribers() bool`

HasHistoryPublicToSubscribers returns a boolean if a field has been set.

### GetFirstMessageId

`func (o *Subscriptions) GetFirstMessageId() int32`

GetFirstMessageId returns the FirstMessageId field if non-nil, zero value otherwise.

### GetFirstMessageIdOk

`func (o *Subscriptions) GetFirstMessageIdOk() (*int32, bool)`

GetFirstMessageIdOk returns a tuple with the FirstMessageId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstMessageId

`func (o *Subscriptions) SetFirstMessageId(v int32)`

SetFirstMessageId sets FirstMessageId field to given value.

### HasFirstMessageId

`func (o *Subscriptions) HasFirstMessageId() bool`

HasFirstMessageId returns a boolean if a field has been set.

### SetFirstMessageIdNil

`func (o *Subscriptions) SetFirstMessageIdNil(b bool)`

 SetFirstMessageIdNil sets the value for FirstMessageId to be an explicit nil

### UnsetFirstMessageId
`func (o *Subscriptions) UnsetFirstMessageId()`

UnsetFirstMessageId ensures that no value is present for FirstMessageId, not even an explicit nil
### GetStreamWeeklyTraffic

`func (o *Subscriptions) GetStreamWeeklyTraffic() int32`

GetStreamWeeklyTraffic returns the StreamWeeklyTraffic field if non-nil, zero value otherwise.

### GetStreamWeeklyTrafficOk

`func (o *Subscriptions) GetStreamWeeklyTrafficOk() (*int32, bool)`

GetStreamWeeklyTrafficOk returns a tuple with the StreamWeeklyTraffic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamWeeklyTraffic

`func (o *Subscriptions) SetStreamWeeklyTraffic(v int32)`

SetStreamWeeklyTraffic sets StreamWeeklyTraffic field to given value.

### HasStreamWeeklyTraffic

`func (o *Subscriptions) HasStreamWeeklyTraffic() bool`

HasStreamWeeklyTraffic returns a boolean if a field has been set.

### SetStreamWeeklyTrafficNil

`func (o *Subscriptions) SetStreamWeeklyTrafficNil(b bool)`

 SetStreamWeeklyTrafficNil sets the value for StreamWeeklyTraffic to be an explicit nil

### UnsetStreamWeeklyTraffic
`func (o *Subscriptions) UnsetStreamWeeklyTraffic()`

UnsetStreamWeeklyTraffic ensures that no value is present for StreamWeeklyTraffic, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


