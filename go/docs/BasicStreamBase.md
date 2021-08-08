# BasicStreamBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StreamId** | Pointer to **int32** | The unique ID of the stream.  | [optional] 
**Name** | Pointer to **string** | The name of the stream.  | [optional] 
**Description** | Pointer to **string** | The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream&#39;s description.  | [optional] 
**DateCreated** | Pointer to **int32** | The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30).  | [optional] 
**InviteOnly** | Pointer to **bool** | Specifies whether the stream is private or not. Only people who have been invited can access a private stream.  | [optional] 
**RenderedDescription** | Pointer to **string** | The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message.  | [optional] 
**IsWebPublic** | Pointer to **bool** | Whether the stream has been configured to allow unauthenticated access to its message history from the web.  | [optional] 
**StreamPostPolicy** | Pointer to **int32** | Policy for which users can post messages to the stream.  * 1 &#x3D;&gt; Any user can post. * 2 &#x3D;&gt; Only administrators can post. * 3 &#x3D;&gt; Only full members can post. * 4 &#x3D;&gt; Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous &#x60;is_announcement_only&#x60; boolean.  | [optional] 
**MessageRetentionDays** | Pointer to **NullableInt32** | Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * &#x60;null&#x60;, the default, means the stream will inherit the organization   level setting. * &#x60;-1&#x60; encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17).  | [optional] 
**HistoryPublicToSubscribers** | Pointer to **bool** | Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only&#x3D;False implies history_public_to_subscribers&#x3D;True), but clients should not make that assumption, as we may change that behavior in the future.  | [optional] 
**FirstMessageId** | Pointer to **NullableInt32** | The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \&quot;more topics\&quot; widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history.  | [optional] 
**IsAnnouncementOnly** | Pointer to **bool** | Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use &#x60;stream_post_policy&#x60; instead.  | [optional] 

## Methods

### NewBasicStreamBase

`func NewBasicStreamBase() *BasicStreamBase`

NewBasicStreamBase instantiates a new BasicStreamBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBasicStreamBaseWithDefaults

`func NewBasicStreamBaseWithDefaults() *BasicStreamBase`

NewBasicStreamBaseWithDefaults instantiates a new BasicStreamBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStreamId

`func (o *BasicStreamBase) GetStreamId() int32`

GetStreamId returns the StreamId field if non-nil, zero value otherwise.

### GetStreamIdOk

`func (o *BasicStreamBase) GetStreamIdOk() (*int32, bool)`

GetStreamIdOk returns a tuple with the StreamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamId

`func (o *BasicStreamBase) SetStreamId(v int32)`

SetStreamId sets StreamId field to given value.

### HasStreamId

`func (o *BasicStreamBase) HasStreamId() bool`

HasStreamId returns a boolean if a field has been set.

### GetName

`func (o *BasicStreamBase) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BasicStreamBase) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BasicStreamBase) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BasicStreamBase) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *BasicStreamBase) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BasicStreamBase) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BasicStreamBase) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BasicStreamBase) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDateCreated

`func (o *BasicStreamBase) GetDateCreated() int32`

GetDateCreated returns the DateCreated field if non-nil, zero value otherwise.

### GetDateCreatedOk

`func (o *BasicStreamBase) GetDateCreatedOk() (*int32, bool)`

GetDateCreatedOk returns a tuple with the DateCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateCreated

`func (o *BasicStreamBase) SetDateCreated(v int32)`

SetDateCreated sets DateCreated field to given value.

### HasDateCreated

`func (o *BasicStreamBase) HasDateCreated() bool`

HasDateCreated returns a boolean if a field has been set.

### GetInviteOnly

`func (o *BasicStreamBase) GetInviteOnly() bool`

GetInviteOnly returns the InviteOnly field if non-nil, zero value otherwise.

### GetInviteOnlyOk

`func (o *BasicStreamBase) GetInviteOnlyOk() (*bool, bool)`

GetInviteOnlyOk returns a tuple with the InviteOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInviteOnly

`func (o *BasicStreamBase) SetInviteOnly(v bool)`

SetInviteOnly sets InviteOnly field to given value.

### HasInviteOnly

`func (o *BasicStreamBase) HasInviteOnly() bool`

HasInviteOnly returns a boolean if a field has been set.

### GetRenderedDescription

`func (o *BasicStreamBase) GetRenderedDescription() string`

GetRenderedDescription returns the RenderedDescription field if non-nil, zero value otherwise.

### GetRenderedDescriptionOk

`func (o *BasicStreamBase) GetRenderedDescriptionOk() (*string, bool)`

GetRenderedDescriptionOk returns a tuple with the RenderedDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRenderedDescription

`func (o *BasicStreamBase) SetRenderedDescription(v string)`

SetRenderedDescription sets RenderedDescription field to given value.

### HasRenderedDescription

`func (o *BasicStreamBase) HasRenderedDescription() bool`

HasRenderedDescription returns a boolean if a field has been set.

### GetIsWebPublic

`func (o *BasicStreamBase) GetIsWebPublic() bool`

GetIsWebPublic returns the IsWebPublic field if non-nil, zero value otherwise.

### GetIsWebPublicOk

`func (o *BasicStreamBase) GetIsWebPublicOk() (*bool, bool)`

GetIsWebPublicOk returns a tuple with the IsWebPublic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsWebPublic

`func (o *BasicStreamBase) SetIsWebPublic(v bool)`

SetIsWebPublic sets IsWebPublic field to given value.

### HasIsWebPublic

`func (o *BasicStreamBase) HasIsWebPublic() bool`

HasIsWebPublic returns a boolean if a field has been set.

### GetStreamPostPolicy

`func (o *BasicStreamBase) GetStreamPostPolicy() int32`

GetStreamPostPolicy returns the StreamPostPolicy field if non-nil, zero value otherwise.

### GetStreamPostPolicyOk

`func (o *BasicStreamBase) GetStreamPostPolicyOk() (*int32, bool)`

GetStreamPostPolicyOk returns a tuple with the StreamPostPolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamPostPolicy

`func (o *BasicStreamBase) SetStreamPostPolicy(v int32)`

SetStreamPostPolicy sets StreamPostPolicy field to given value.

### HasStreamPostPolicy

`func (o *BasicStreamBase) HasStreamPostPolicy() bool`

HasStreamPostPolicy returns a boolean if a field has been set.

### GetMessageRetentionDays

`func (o *BasicStreamBase) GetMessageRetentionDays() int32`

GetMessageRetentionDays returns the MessageRetentionDays field if non-nil, zero value otherwise.

### GetMessageRetentionDaysOk

`func (o *BasicStreamBase) GetMessageRetentionDaysOk() (*int32, bool)`

GetMessageRetentionDaysOk returns a tuple with the MessageRetentionDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageRetentionDays

`func (o *BasicStreamBase) SetMessageRetentionDays(v int32)`

SetMessageRetentionDays sets MessageRetentionDays field to given value.

### HasMessageRetentionDays

`func (o *BasicStreamBase) HasMessageRetentionDays() bool`

HasMessageRetentionDays returns a boolean if a field has been set.

### SetMessageRetentionDaysNil

`func (o *BasicStreamBase) SetMessageRetentionDaysNil(b bool)`

 SetMessageRetentionDaysNil sets the value for MessageRetentionDays to be an explicit nil

### UnsetMessageRetentionDays
`func (o *BasicStreamBase) UnsetMessageRetentionDays()`

UnsetMessageRetentionDays ensures that no value is present for MessageRetentionDays, not even an explicit nil
### GetHistoryPublicToSubscribers

`func (o *BasicStreamBase) GetHistoryPublicToSubscribers() bool`

GetHistoryPublicToSubscribers returns the HistoryPublicToSubscribers field if non-nil, zero value otherwise.

### GetHistoryPublicToSubscribersOk

`func (o *BasicStreamBase) GetHistoryPublicToSubscribersOk() (*bool, bool)`

GetHistoryPublicToSubscribersOk returns a tuple with the HistoryPublicToSubscribers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHistoryPublicToSubscribers

`func (o *BasicStreamBase) SetHistoryPublicToSubscribers(v bool)`

SetHistoryPublicToSubscribers sets HistoryPublicToSubscribers field to given value.

### HasHistoryPublicToSubscribers

`func (o *BasicStreamBase) HasHistoryPublicToSubscribers() bool`

HasHistoryPublicToSubscribers returns a boolean if a field has been set.

### GetFirstMessageId

`func (o *BasicStreamBase) GetFirstMessageId() int32`

GetFirstMessageId returns the FirstMessageId field if non-nil, zero value otherwise.

### GetFirstMessageIdOk

`func (o *BasicStreamBase) GetFirstMessageIdOk() (*int32, bool)`

GetFirstMessageIdOk returns a tuple with the FirstMessageId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstMessageId

`func (o *BasicStreamBase) SetFirstMessageId(v int32)`

SetFirstMessageId sets FirstMessageId field to given value.

### HasFirstMessageId

`func (o *BasicStreamBase) HasFirstMessageId() bool`

HasFirstMessageId returns a boolean if a field has been set.

### SetFirstMessageIdNil

`func (o *BasicStreamBase) SetFirstMessageIdNil(b bool)`

 SetFirstMessageIdNil sets the value for FirstMessageId to be an explicit nil

### UnsetFirstMessageId
`func (o *BasicStreamBase) UnsetFirstMessageId()`

UnsetFirstMessageId ensures that no value is present for FirstMessageId, not even an explicit nil
### GetIsAnnouncementOnly

`func (o *BasicStreamBase) GetIsAnnouncementOnly() bool`

GetIsAnnouncementOnly returns the IsAnnouncementOnly field if non-nil, zero value otherwise.

### GetIsAnnouncementOnlyOk

`func (o *BasicStreamBase) GetIsAnnouncementOnlyOk() (*bool, bool)`

GetIsAnnouncementOnlyOk returns a tuple with the IsAnnouncementOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAnnouncementOnly

`func (o *BasicStreamBase) SetIsAnnouncementOnly(v bool)`

SetIsAnnouncementOnly sets IsAnnouncementOnly field to given value.

### HasIsAnnouncementOnly

`func (o *BasicStreamBase) HasIsAnnouncementOnly() bool`

HasIsAnnouncementOnly returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


