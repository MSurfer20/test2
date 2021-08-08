# GetMessagesAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvatarUrl** | Pointer to **interface{}** |  | [optional] 
**Client** | Pointer to **interface{}** |  | [optional] 
**Content** | Pointer to **interface{}** |  | [optional] 
**ContentType** | Pointer to **interface{}** |  | [optional] 
**DisplayRecipient** | Pointer to **interface{}** |  | [optional] 
**Id** | Pointer to **interface{}** |  | [optional] 
**IsMeMessage** | Pointer to **interface{}** |  | [optional] 
**Reactions** | Pointer to **interface{}** |  | [optional] 
**RecipientId** | Pointer to **interface{}** |  | [optional] 
**SenderEmail** | Pointer to **interface{}** |  | [optional] 
**SenderFullName** | Pointer to **interface{}** |  | [optional] 
**SenderId** | Pointer to **interface{}** |  | [optional] 
**SenderRealmStr** | Pointer to **interface{}** |  | [optional] 
**StreamId** | Pointer to **interface{}** |  | [optional] 
**Subject** | Pointer to **interface{}** |  | [optional] 
**TopicLinks** | Pointer to **interface{}** |  | [optional] 
**Submessages** | Pointer to **interface{}** |  | [optional] 
**Timestamp** | Pointer to **interface{}** |  | [optional] 
**Type** | Pointer to **interface{}** |  | [optional] 
**Flags** | Pointer to **[]string** | The user&#39;s [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags  | [optional] 
**LastEditTimestamp** | Pointer to **int32** | The UNIX timestamp for when the message was last edited, in UTC seconds.  | [optional] 
**MatchContent** | Pointer to **string** | Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 
**MatchSubject** | Pointer to **string** | Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with &#x60;&lt;span class&#x3D;\&quot;highlight\&quot;&gt;&#x60; elements wrapping the matches for the search keywords.  | [optional] 

## Methods

### NewGetMessagesAllOf

`func NewGetMessagesAllOf() *GetMessagesAllOf`

NewGetMessagesAllOf instantiates a new GetMessagesAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetMessagesAllOfWithDefaults

`func NewGetMessagesAllOfWithDefaults() *GetMessagesAllOf`

NewGetMessagesAllOfWithDefaults instantiates a new GetMessagesAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvatarUrl

`func (o *GetMessagesAllOf) GetAvatarUrl() interface{}`

GetAvatarUrl returns the AvatarUrl field if non-nil, zero value otherwise.

### GetAvatarUrlOk

`func (o *GetMessagesAllOf) GetAvatarUrlOk() (*interface{}, bool)`

GetAvatarUrlOk returns a tuple with the AvatarUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarUrl

`func (o *GetMessagesAllOf) SetAvatarUrl(v interface{})`

SetAvatarUrl sets AvatarUrl field to given value.

### HasAvatarUrl

`func (o *GetMessagesAllOf) HasAvatarUrl() bool`

HasAvatarUrl returns a boolean if a field has been set.

### SetAvatarUrlNil

`func (o *GetMessagesAllOf) SetAvatarUrlNil(b bool)`

 SetAvatarUrlNil sets the value for AvatarUrl to be an explicit nil

### UnsetAvatarUrl
`func (o *GetMessagesAllOf) UnsetAvatarUrl()`

UnsetAvatarUrl ensures that no value is present for AvatarUrl, not even an explicit nil
### GetClient

`func (o *GetMessagesAllOf) GetClient() interface{}`

GetClient returns the Client field if non-nil, zero value otherwise.

### GetClientOk

`func (o *GetMessagesAllOf) GetClientOk() (*interface{}, bool)`

GetClientOk returns a tuple with the Client field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClient

`func (o *GetMessagesAllOf) SetClient(v interface{})`

SetClient sets Client field to given value.

### HasClient

`func (o *GetMessagesAllOf) HasClient() bool`

HasClient returns a boolean if a field has been set.

### SetClientNil

`func (o *GetMessagesAllOf) SetClientNil(b bool)`

 SetClientNil sets the value for Client to be an explicit nil

### UnsetClient
`func (o *GetMessagesAllOf) UnsetClient()`

UnsetClient ensures that no value is present for Client, not even an explicit nil
### GetContent

`func (o *GetMessagesAllOf) GetContent() interface{}`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *GetMessagesAllOf) GetContentOk() (*interface{}, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *GetMessagesAllOf) SetContent(v interface{})`

SetContent sets Content field to given value.

### HasContent

`func (o *GetMessagesAllOf) HasContent() bool`

HasContent returns a boolean if a field has been set.

### SetContentNil

`func (o *GetMessagesAllOf) SetContentNil(b bool)`

 SetContentNil sets the value for Content to be an explicit nil

### UnsetContent
`func (o *GetMessagesAllOf) UnsetContent()`

UnsetContent ensures that no value is present for Content, not even an explicit nil
### GetContentType

`func (o *GetMessagesAllOf) GetContentType() interface{}`

GetContentType returns the ContentType field if non-nil, zero value otherwise.

### GetContentTypeOk

`func (o *GetMessagesAllOf) GetContentTypeOk() (*interface{}, bool)`

GetContentTypeOk returns a tuple with the ContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentType

`func (o *GetMessagesAllOf) SetContentType(v interface{})`

SetContentType sets ContentType field to given value.

### HasContentType

`func (o *GetMessagesAllOf) HasContentType() bool`

HasContentType returns a boolean if a field has been set.

### SetContentTypeNil

`func (o *GetMessagesAllOf) SetContentTypeNil(b bool)`

 SetContentTypeNil sets the value for ContentType to be an explicit nil

### UnsetContentType
`func (o *GetMessagesAllOf) UnsetContentType()`

UnsetContentType ensures that no value is present for ContentType, not even an explicit nil
### GetDisplayRecipient

`func (o *GetMessagesAllOf) GetDisplayRecipient() interface{}`

GetDisplayRecipient returns the DisplayRecipient field if non-nil, zero value otherwise.

### GetDisplayRecipientOk

`func (o *GetMessagesAllOf) GetDisplayRecipientOk() (*interface{}, bool)`

GetDisplayRecipientOk returns a tuple with the DisplayRecipient field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayRecipient

`func (o *GetMessagesAllOf) SetDisplayRecipient(v interface{})`

SetDisplayRecipient sets DisplayRecipient field to given value.

### HasDisplayRecipient

`func (o *GetMessagesAllOf) HasDisplayRecipient() bool`

HasDisplayRecipient returns a boolean if a field has been set.

### SetDisplayRecipientNil

`func (o *GetMessagesAllOf) SetDisplayRecipientNil(b bool)`

 SetDisplayRecipientNil sets the value for DisplayRecipient to be an explicit nil

### UnsetDisplayRecipient
`func (o *GetMessagesAllOf) UnsetDisplayRecipient()`

UnsetDisplayRecipient ensures that no value is present for DisplayRecipient, not even an explicit nil
### GetId

`func (o *GetMessagesAllOf) GetId() interface{}`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetMessagesAllOf) GetIdOk() (*interface{}, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetMessagesAllOf) SetId(v interface{})`

SetId sets Id field to given value.

### HasId

`func (o *GetMessagesAllOf) HasId() bool`

HasId returns a boolean if a field has been set.

### SetIdNil

`func (o *GetMessagesAllOf) SetIdNil(b bool)`

 SetIdNil sets the value for Id to be an explicit nil

### UnsetId
`func (o *GetMessagesAllOf) UnsetId()`

UnsetId ensures that no value is present for Id, not even an explicit nil
### GetIsMeMessage

`func (o *GetMessagesAllOf) GetIsMeMessage() interface{}`

GetIsMeMessage returns the IsMeMessage field if non-nil, zero value otherwise.

### GetIsMeMessageOk

`func (o *GetMessagesAllOf) GetIsMeMessageOk() (*interface{}, bool)`

GetIsMeMessageOk returns a tuple with the IsMeMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMeMessage

`func (o *GetMessagesAllOf) SetIsMeMessage(v interface{})`

SetIsMeMessage sets IsMeMessage field to given value.

### HasIsMeMessage

`func (o *GetMessagesAllOf) HasIsMeMessage() bool`

HasIsMeMessage returns a boolean if a field has been set.

### SetIsMeMessageNil

`func (o *GetMessagesAllOf) SetIsMeMessageNil(b bool)`

 SetIsMeMessageNil sets the value for IsMeMessage to be an explicit nil

### UnsetIsMeMessage
`func (o *GetMessagesAllOf) UnsetIsMeMessage()`

UnsetIsMeMessage ensures that no value is present for IsMeMessage, not even an explicit nil
### GetReactions

`func (o *GetMessagesAllOf) GetReactions() interface{}`

GetReactions returns the Reactions field if non-nil, zero value otherwise.

### GetReactionsOk

`func (o *GetMessagesAllOf) GetReactionsOk() (*interface{}, bool)`

GetReactionsOk returns a tuple with the Reactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactions

`func (o *GetMessagesAllOf) SetReactions(v interface{})`

SetReactions sets Reactions field to given value.

### HasReactions

`func (o *GetMessagesAllOf) HasReactions() bool`

HasReactions returns a boolean if a field has been set.

### SetReactionsNil

`func (o *GetMessagesAllOf) SetReactionsNil(b bool)`

 SetReactionsNil sets the value for Reactions to be an explicit nil

### UnsetReactions
`func (o *GetMessagesAllOf) UnsetReactions()`

UnsetReactions ensures that no value is present for Reactions, not even an explicit nil
### GetRecipientId

`func (o *GetMessagesAllOf) GetRecipientId() interface{}`

GetRecipientId returns the RecipientId field if non-nil, zero value otherwise.

### GetRecipientIdOk

`func (o *GetMessagesAllOf) GetRecipientIdOk() (*interface{}, bool)`

GetRecipientIdOk returns a tuple with the RecipientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientId

`func (o *GetMessagesAllOf) SetRecipientId(v interface{})`

SetRecipientId sets RecipientId field to given value.

### HasRecipientId

`func (o *GetMessagesAllOf) HasRecipientId() bool`

HasRecipientId returns a boolean if a field has been set.

### SetRecipientIdNil

`func (o *GetMessagesAllOf) SetRecipientIdNil(b bool)`

 SetRecipientIdNil sets the value for RecipientId to be an explicit nil

### UnsetRecipientId
`func (o *GetMessagesAllOf) UnsetRecipientId()`

UnsetRecipientId ensures that no value is present for RecipientId, not even an explicit nil
### GetSenderEmail

`func (o *GetMessagesAllOf) GetSenderEmail() interface{}`

GetSenderEmail returns the SenderEmail field if non-nil, zero value otherwise.

### GetSenderEmailOk

`func (o *GetMessagesAllOf) GetSenderEmailOk() (*interface{}, bool)`

GetSenderEmailOk returns a tuple with the SenderEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderEmail

`func (o *GetMessagesAllOf) SetSenderEmail(v interface{})`

SetSenderEmail sets SenderEmail field to given value.

### HasSenderEmail

`func (o *GetMessagesAllOf) HasSenderEmail() bool`

HasSenderEmail returns a boolean if a field has been set.

### SetSenderEmailNil

`func (o *GetMessagesAllOf) SetSenderEmailNil(b bool)`

 SetSenderEmailNil sets the value for SenderEmail to be an explicit nil

### UnsetSenderEmail
`func (o *GetMessagesAllOf) UnsetSenderEmail()`

UnsetSenderEmail ensures that no value is present for SenderEmail, not even an explicit nil
### GetSenderFullName

`func (o *GetMessagesAllOf) GetSenderFullName() interface{}`

GetSenderFullName returns the SenderFullName field if non-nil, zero value otherwise.

### GetSenderFullNameOk

`func (o *GetMessagesAllOf) GetSenderFullNameOk() (*interface{}, bool)`

GetSenderFullNameOk returns a tuple with the SenderFullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderFullName

`func (o *GetMessagesAllOf) SetSenderFullName(v interface{})`

SetSenderFullName sets SenderFullName field to given value.

### HasSenderFullName

`func (o *GetMessagesAllOf) HasSenderFullName() bool`

HasSenderFullName returns a boolean if a field has been set.

### SetSenderFullNameNil

`func (o *GetMessagesAllOf) SetSenderFullNameNil(b bool)`

 SetSenderFullNameNil sets the value for SenderFullName to be an explicit nil

### UnsetSenderFullName
`func (o *GetMessagesAllOf) UnsetSenderFullName()`

UnsetSenderFullName ensures that no value is present for SenderFullName, not even an explicit nil
### GetSenderId

`func (o *GetMessagesAllOf) GetSenderId() interface{}`

GetSenderId returns the SenderId field if non-nil, zero value otherwise.

### GetSenderIdOk

`func (o *GetMessagesAllOf) GetSenderIdOk() (*interface{}, bool)`

GetSenderIdOk returns a tuple with the SenderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderId

`func (o *GetMessagesAllOf) SetSenderId(v interface{})`

SetSenderId sets SenderId field to given value.

### HasSenderId

`func (o *GetMessagesAllOf) HasSenderId() bool`

HasSenderId returns a boolean if a field has been set.

### SetSenderIdNil

`func (o *GetMessagesAllOf) SetSenderIdNil(b bool)`

 SetSenderIdNil sets the value for SenderId to be an explicit nil

### UnsetSenderId
`func (o *GetMessagesAllOf) UnsetSenderId()`

UnsetSenderId ensures that no value is present for SenderId, not even an explicit nil
### GetSenderRealmStr

`func (o *GetMessagesAllOf) GetSenderRealmStr() interface{}`

GetSenderRealmStr returns the SenderRealmStr field if non-nil, zero value otherwise.

### GetSenderRealmStrOk

`func (o *GetMessagesAllOf) GetSenderRealmStrOk() (*interface{}, bool)`

GetSenderRealmStrOk returns a tuple with the SenderRealmStr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderRealmStr

`func (o *GetMessagesAllOf) SetSenderRealmStr(v interface{})`

SetSenderRealmStr sets SenderRealmStr field to given value.

### HasSenderRealmStr

`func (o *GetMessagesAllOf) HasSenderRealmStr() bool`

HasSenderRealmStr returns a boolean if a field has been set.

### SetSenderRealmStrNil

`func (o *GetMessagesAllOf) SetSenderRealmStrNil(b bool)`

 SetSenderRealmStrNil sets the value for SenderRealmStr to be an explicit nil

### UnsetSenderRealmStr
`func (o *GetMessagesAllOf) UnsetSenderRealmStr()`

UnsetSenderRealmStr ensures that no value is present for SenderRealmStr, not even an explicit nil
### GetStreamId

`func (o *GetMessagesAllOf) GetStreamId() interface{}`

GetStreamId returns the StreamId field if non-nil, zero value otherwise.

### GetStreamIdOk

`func (o *GetMessagesAllOf) GetStreamIdOk() (*interface{}, bool)`

GetStreamIdOk returns a tuple with the StreamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamId

`func (o *GetMessagesAllOf) SetStreamId(v interface{})`

SetStreamId sets StreamId field to given value.

### HasStreamId

`func (o *GetMessagesAllOf) HasStreamId() bool`

HasStreamId returns a boolean if a field has been set.

### SetStreamIdNil

`func (o *GetMessagesAllOf) SetStreamIdNil(b bool)`

 SetStreamIdNil sets the value for StreamId to be an explicit nil

### UnsetStreamId
`func (o *GetMessagesAllOf) UnsetStreamId()`

UnsetStreamId ensures that no value is present for StreamId, not even an explicit nil
### GetSubject

`func (o *GetMessagesAllOf) GetSubject() interface{}`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *GetMessagesAllOf) GetSubjectOk() (*interface{}, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *GetMessagesAllOf) SetSubject(v interface{})`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *GetMessagesAllOf) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### SetSubjectNil

`func (o *GetMessagesAllOf) SetSubjectNil(b bool)`

 SetSubjectNil sets the value for Subject to be an explicit nil

### UnsetSubject
`func (o *GetMessagesAllOf) UnsetSubject()`

UnsetSubject ensures that no value is present for Subject, not even an explicit nil
### GetTopicLinks

`func (o *GetMessagesAllOf) GetTopicLinks() interface{}`

GetTopicLinks returns the TopicLinks field if non-nil, zero value otherwise.

### GetTopicLinksOk

`func (o *GetMessagesAllOf) GetTopicLinksOk() (*interface{}, bool)`

GetTopicLinksOk returns a tuple with the TopicLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopicLinks

`func (o *GetMessagesAllOf) SetTopicLinks(v interface{})`

SetTopicLinks sets TopicLinks field to given value.

### HasTopicLinks

`func (o *GetMessagesAllOf) HasTopicLinks() bool`

HasTopicLinks returns a boolean if a field has been set.

### SetTopicLinksNil

`func (o *GetMessagesAllOf) SetTopicLinksNil(b bool)`

 SetTopicLinksNil sets the value for TopicLinks to be an explicit nil

### UnsetTopicLinks
`func (o *GetMessagesAllOf) UnsetTopicLinks()`

UnsetTopicLinks ensures that no value is present for TopicLinks, not even an explicit nil
### GetSubmessages

`func (o *GetMessagesAllOf) GetSubmessages() interface{}`

GetSubmessages returns the Submessages field if non-nil, zero value otherwise.

### GetSubmessagesOk

`func (o *GetMessagesAllOf) GetSubmessagesOk() (*interface{}, bool)`

GetSubmessagesOk returns a tuple with the Submessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmessages

`func (o *GetMessagesAllOf) SetSubmessages(v interface{})`

SetSubmessages sets Submessages field to given value.

### HasSubmessages

`func (o *GetMessagesAllOf) HasSubmessages() bool`

HasSubmessages returns a boolean if a field has been set.

### SetSubmessagesNil

`func (o *GetMessagesAllOf) SetSubmessagesNil(b bool)`

 SetSubmessagesNil sets the value for Submessages to be an explicit nil

### UnsetSubmessages
`func (o *GetMessagesAllOf) UnsetSubmessages()`

UnsetSubmessages ensures that no value is present for Submessages, not even an explicit nil
### GetTimestamp

`func (o *GetMessagesAllOf) GetTimestamp() interface{}`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *GetMessagesAllOf) GetTimestampOk() (*interface{}, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *GetMessagesAllOf) SetTimestamp(v interface{})`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *GetMessagesAllOf) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### SetTimestampNil

`func (o *GetMessagesAllOf) SetTimestampNil(b bool)`

 SetTimestampNil sets the value for Timestamp to be an explicit nil

### UnsetTimestamp
`func (o *GetMessagesAllOf) UnsetTimestamp()`

UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
### GetType

`func (o *GetMessagesAllOf) GetType() interface{}`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetMessagesAllOf) GetTypeOk() (*interface{}, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetMessagesAllOf) SetType(v interface{})`

SetType sets Type field to given value.

### HasType

`func (o *GetMessagesAllOf) HasType() bool`

HasType returns a boolean if a field has been set.

### SetTypeNil

`func (o *GetMessagesAllOf) SetTypeNil(b bool)`

 SetTypeNil sets the value for Type to be an explicit nil

### UnsetType
`func (o *GetMessagesAllOf) UnsetType()`

UnsetType ensures that no value is present for Type, not even an explicit nil
### GetFlags

`func (o *GetMessagesAllOf) GetFlags() []string`

GetFlags returns the Flags field if non-nil, zero value otherwise.

### GetFlagsOk

`func (o *GetMessagesAllOf) GetFlagsOk() (*[]string, bool)`

GetFlagsOk returns a tuple with the Flags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlags

`func (o *GetMessagesAllOf) SetFlags(v []string)`

SetFlags sets Flags field to given value.

### HasFlags

`func (o *GetMessagesAllOf) HasFlags() bool`

HasFlags returns a boolean if a field has been set.

### GetLastEditTimestamp

`func (o *GetMessagesAllOf) GetLastEditTimestamp() int32`

GetLastEditTimestamp returns the LastEditTimestamp field if non-nil, zero value otherwise.

### GetLastEditTimestampOk

`func (o *GetMessagesAllOf) GetLastEditTimestampOk() (*int32, bool)`

GetLastEditTimestampOk returns a tuple with the LastEditTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastEditTimestamp

`func (o *GetMessagesAllOf) SetLastEditTimestamp(v int32)`

SetLastEditTimestamp sets LastEditTimestamp field to given value.

### HasLastEditTimestamp

`func (o *GetMessagesAllOf) HasLastEditTimestamp() bool`

HasLastEditTimestamp returns a boolean if a field has been set.

### GetMatchContent

`func (o *GetMessagesAllOf) GetMatchContent() string`

GetMatchContent returns the MatchContent field if non-nil, zero value otherwise.

### GetMatchContentOk

`func (o *GetMessagesAllOf) GetMatchContentOk() (*string, bool)`

GetMatchContentOk returns a tuple with the MatchContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchContent

`func (o *GetMessagesAllOf) SetMatchContent(v string)`

SetMatchContent sets MatchContent field to given value.

### HasMatchContent

`func (o *GetMessagesAllOf) HasMatchContent() bool`

HasMatchContent returns a boolean if a field has been set.

### GetMatchSubject

`func (o *GetMessagesAllOf) GetMatchSubject() string`

GetMatchSubject returns the MatchSubject field if non-nil, zero value otherwise.

### GetMatchSubjectOk

`func (o *GetMessagesAllOf) GetMatchSubjectOk() (*string, bool)`

GetMatchSubjectOk returns a tuple with the MatchSubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchSubject

`func (o *GetMessagesAllOf) SetMatchSubject(v string)`

SetMatchSubject sets MatchSubject field to given value.

### HasMatchSubject

`func (o *GetMessagesAllOf) HasMatchSubject() bool`

HasMatchSubject returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


