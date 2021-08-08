# GetMessages

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

### NewGetMessages

`func NewGetMessages() *GetMessages`

NewGetMessages instantiates a new GetMessages object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetMessagesWithDefaults

`func NewGetMessagesWithDefaults() *GetMessages`

NewGetMessagesWithDefaults instantiates a new GetMessages object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvatarUrl

`func (o *GetMessages) GetAvatarUrl() interface{}`

GetAvatarUrl returns the AvatarUrl field if non-nil, zero value otherwise.

### GetAvatarUrlOk

`func (o *GetMessages) GetAvatarUrlOk() (*interface{}, bool)`

GetAvatarUrlOk returns a tuple with the AvatarUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarUrl

`func (o *GetMessages) SetAvatarUrl(v interface{})`

SetAvatarUrl sets AvatarUrl field to given value.

### HasAvatarUrl

`func (o *GetMessages) HasAvatarUrl() bool`

HasAvatarUrl returns a boolean if a field has been set.

### SetAvatarUrlNil

`func (o *GetMessages) SetAvatarUrlNil(b bool)`

 SetAvatarUrlNil sets the value for AvatarUrl to be an explicit nil

### UnsetAvatarUrl
`func (o *GetMessages) UnsetAvatarUrl()`

UnsetAvatarUrl ensures that no value is present for AvatarUrl, not even an explicit nil
### GetClient

`func (o *GetMessages) GetClient() interface{}`

GetClient returns the Client field if non-nil, zero value otherwise.

### GetClientOk

`func (o *GetMessages) GetClientOk() (*interface{}, bool)`

GetClientOk returns a tuple with the Client field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClient

`func (o *GetMessages) SetClient(v interface{})`

SetClient sets Client field to given value.

### HasClient

`func (o *GetMessages) HasClient() bool`

HasClient returns a boolean if a field has been set.

### SetClientNil

`func (o *GetMessages) SetClientNil(b bool)`

 SetClientNil sets the value for Client to be an explicit nil

### UnsetClient
`func (o *GetMessages) UnsetClient()`

UnsetClient ensures that no value is present for Client, not even an explicit nil
### GetContent

`func (o *GetMessages) GetContent() interface{}`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *GetMessages) GetContentOk() (*interface{}, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *GetMessages) SetContent(v interface{})`

SetContent sets Content field to given value.

### HasContent

`func (o *GetMessages) HasContent() bool`

HasContent returns a boolean if a field has been set.

### SetContentNil

`func (o *GetMessages) SetContentNil(b bool)`

 SetContentNil sets the value for Content to be an explicit nil

### UnsetContent
`func (o *GetMessages) UnsetContent()`

UnsetContent ensures that no value is present for Content, not even an explicit nil
### GetContentType

`func (o *GetMessages) GetContentType() interface{}`

GetContentType returns the ContentType field if non-nil, zero value otherwise.

### GetContentTypeOk

`func (o *GetMessages) GetContentTypeOk() (*interface{}, bool)`

GetContentTypeOk returns a tuple with the ContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentType

`func (o *GetMessages) SetContentType(v interface{})`

SetContentType sets ContentType field to given value.

### HasContentType

`func (o *GetMessages) HasContentType() bool`

HasContentType returns a boolean if a field has been set.

### SetContentTypeNil

`func (o *GetMessages) SetContentTypeNil(b bool)`

 SetContentTypeNil sets the value for ContentType to be an explicit nil

### UnsetContentType
`func (o *GetMessages) UnsetContentType()`

UnsetContentType ensures that no value is present for ContentType, not even an explicit nil
### GetDisplayRecipient

`func (o *GetMessages) GetDisplayRecipient() interface{}`

GetDisplayRecipient returns the DisplayRecipient field if non-nil, zero value otherwise.

### GetDisplayRecipientOk

`func (o *GetMessages) GetDisplayRecipientOk() (*interface{}, bool)`

GetDisplayRecipientOk returns a tuple with the DisplayRecipient field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayRecipient

`func (o *GetMessages) SetDisplayRecipient(v interface{})`

SetDisplayRecipient sets DisplayRecipient field to given value.

### HasDisplayRecipient

`func (o *GetMessages) HasDisplayRecipient() bool`

HasDisplayRecipient returns a boolean if a field has been set.

### SetDisplayRecipientNil

`func (o *GetMessages) SetDisplayRecipientNil(b bool)`

 SetDisplayRecipientNil sets the value for DisplayRecipient to be an explicit nil

### UnsetDisplayRecipient
`func (o *GetMessages) UnsetDisplayRecipient()`

UnsetDisplayRecipient ensures that no value is present for DisplayRecipient, not even an explicit nil
### GetId

`func (o *GetMessages) GetId() interface{}`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GetMessages) GetIdOk() (*interface{}, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GetMessages) SetId(v interface{})`

SetId sets Id field to given value.

### HasId

`func (o *GetMessages) HasId() bool`

HasId returns a boolean if a field has been set.

### SetIdNil

`func (o *GetMessages) SetIdNil(b bool)`

 SetIdNil sets the value for Id to be an explicit nil

### UnsetId
`func (o *GetMessages) UnsetId()`

UnsetId ensures that no value is present for Id, not even an explicit nil
### GetIsMeMessage

`func (o *GetMessages) GetIsMeMessage() interface{}`

GetIsMeMessage returns the IsMeMessage field if non-nil, zero value otherwise.

### GetIsMeMessageOk

`func (o *GetMessages) GetIsMeMessageOk() (*interface{}, bool)`

GetIsMeMessageOk returns a tuple with the IsMeMessage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMeMessage

`func (o *GetMessages) SetIsMeMessage(v interface{})`

SetIsMeMessage sets IsMeMessage field to given value.

### HasIsMeMessage

`func (o *GetMessages) HasIsMeMessage() bool`

HasIsMeMessage returns a boolean if a field has been set.

### SetIsMeMessageNil

`func (o *GetMessages) SetIsMeMessageNil(b bool)`

 SetIsMeMessageNil sets the value for IsMeMessage to be an explicit nil

### UnsetIsMeMessage
`func (o *GetMessages) UnsetIsMeMessage()`

UnsetIsMeMessage ensures that no value is present for IsMeMessage, not even an explicit nil
### GetReactions

`func (o *GetMessages) GetReactions() interface{}`

GetReactions returns the Reactions field if non-nil, zero value otherwise.

### GetReactionsOk

`func (o *GetMessages) GetReactionsOk() (*interface{}, bool)`

GetReactionsOk returns a tuple with the Reactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactions

`func (o *GetMessages) SetReactions(v interface{})`

SetReactions sets Reactions field to given value.

### HasReactions

`func (o *GetMessages) HasReactions() bool`

HasReactions returns a boolean if a field has been set.

### SetReactionsNil

`func (o *GetMessages) SetReactionsNil(b bool)`

 SetReactionsNil sets the value for Reactions to be an explicit nil

### UnsetReactions
`func (o *GetMessages) UnsetReactions()`

UnsetReactions ensures that no value is present for Reactions, not even an explicit nil
### GetRecipientId

`func (o *GetMessages) GetRecipientId() interface{}`

GetRecipientId returns the RecipientId field if non-nil, zero value otherwise.

### GetRecipientIdOk

`func (o *GetMessages) GetRecipientIdOk() (*interface{}, bool)`

GetRecipientIdOk returns a tuple with the RecipientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientId

`func (o *GetMessages) SetRecipientId(v interface{})`

SetRecipientId sets RecipientId field to given value.

### HasRecipientId

`func (o *GetMessages) HasRecipientId() bool`

HasRecipientId returns a boolean if a field has been set.

### SetRecipientIdNil

`func (o *GetMessages) SetRecipientIdNil(b bool)`

 SetRecipientIdNil sets the value for RecipientId to be an explicit nil

### UnsetRecipientId
`func (o *GetMessages) UnsetRecipientId()`

UnsetRecipientId ensures that no value is present for RecipientId, not even an explicit nil
### GetSenderEmail

`func (o *GetMessages) GetSenderEmail() interface{}`

GetSenderEmail returns the SenderEmail field if non-nil, zero value otherwise.

### GetSenderEmailOk

`func (o *GetMessages) GetSenderEmailOk() (*interface{}, bool)`

GetSenderEmailOk returns a tuple with the SenderEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderEmail

`func (o *GetMessages) SetSenderEmail(v interface{})`

SetSenderEmail sets SenderEmail field to given value.

### HasSenderEmail

`func (o *GetMessages) HasSenderEmail() bool`

HasSenderEmail returns a boolean if a field has been set.

### SetSenderEmailNil

`func (o *GetMessages) SetSenderEmailNil(b bool)`

 SetSenderEmailNil sets the value for SenderEmail to be an explicit nil

### UnsetSenderEmail
`func (o *GetMessages) UnsetSenderEmail()`

UnsetSenderEmail ensures that no value is present for SenderEmail, not even an explicit nil
### GetSenderFullName

`func (o *GetMessages) GetSenderFullName() interface{}`

GetSenderFullName returns the SenderFullName field if non-nil, zero value otherwise.

### GetSenderFullNameOk

`func (o *GetMessages) GetSenderFullNameOk() (*interface{}, bool)`

GetSenderFullNameOk returns a tuple with the SenderFullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderFullName

`func (o *GetMessages) SetSenderFullName(v interface{})`

SetSenderFullName sets SenderFullName field to given value.

### HasSenderFullName

`func (o *GetMessages) HasSenderFullName() bool`

HasSenderFullName returns a boolean if a field has been set.

### SetSenderFullNameNil

`func (o *GetMessages) SetSenderFullNameNil(b bool)`

 SetSenderFullNameNil sets the value for SenderFullName to be an explicit nil

### UnsetSenderFullName
`func (o *GetMessages) UnsetSenderFullName()`

UnsetSenderFullName ensures that no value is present for SenderFullName, not even an explicit nil
### GetSenderId

`func (o *GetMessages) GetSenderId() interface{}`

GetSenderId returns the SenderId field if non-nil, zero value otherwise.

### GetSenderIdOk

`func (o *GetMessages) GetSenderIdOk() (*interface{}, bool)`

GetSenderIdOk returns a tuple with the SenderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderId

`func (o *GetMessages) SetSenderId(v interface{})`

SetSenderId sets SenderId field to given value.

### HasSenderId

`func (o *GetMessages) HasSenderId() bool`

HasSenderId returns a boolean if a field has been set.

### SetSenderIdNil

`func (o *GetMessages) SetSenderIdNil(b bool)`

 SetSenderIdNil sets the value for SenderId to be an explicit nil

### UnsetSenderId
`func (o *GetMessages) UnsetSenderId()`

UnsetSenderId ensures that no value is present for SenderId, not even an explicit nil
### GetSenderRealmStr

`func (o *GetMessages) GetSenderRealmStr() interface{}`

GetSenderRealmStr returns the SenderRealmStr field if non-nil, zero value otherwise.

### GetSenderRealmStrOk

`func (o *GetMessages) GetSenderRealmStrOk() (*interface{}, bool)`

GetSenderRealmStrOk returns a tuple with the SenderRealmStr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSenderRealmStr

`func (o *GetMessages) SetSenderRealmStr(v interface{})`

SetSenderRealmStr sets SenderRealmStr field to given value.

### HasSenderRealmStr

`func (o *GetMessages) HasSenderRealmStr() bool`

HasSenderRealmStr returns a boolean if a field has been set.

### SetSenderRealmStrNil

`func (o *GetMessages) SetSenderRealmStrNil(b bool)`

 SetSenderRealmStrNil sets the value for SenderRealmStr to be an explicit nil

### UnsetSenderRealmStr
`func (o *GetMessages) UnsetSenderRealmStr()`

UnsetSenderRealmStr ensures that no value is present for SenderRealmStr, not even an explicit nil
### GetStreamId

`func (o *GetMessages) GetStreamId() interface{}`

GetStreamId returns the StreamId field if non-nil, zero value otherwise.

### GetStreamIdOk

`func (o *GetMessages) GetStreamIdOk() (*interface{}, bool)`

GetStreamIdOk returns a tuple with the StreamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStreamId

`func (o *GetMessages) SetStreamId(v interface{})`

SetStreamId sets StreamId field to given value.

### HasStreamId

`func (o *GetMessages) HasStreamId() bool`

HasStreamId returns a boolean if a field has been set.

### SetStreamIdNil

`func (o *GetMessages) SetStreamIdNil(b bool)`

 SetStreamIdNil sets the value for StreamId to be an explicit nil

### UnsetStreamId
`func (o *GetMessages) UnsetStreamId()`

UnsetStreamId ensures that no value is present for StreamId, not even an explicit nil
### GetSubject

`func (o *GetMessages) GetSubject() interface{}`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *GetMessages) GetSubjectOk() (*interface{}, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *GetMessages) SetSubject(v interface{})`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *GetMessages) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### SetSubjectNil

`func (o *GetMessages) SetSubjectNil(b bool)`

 SetSubjectNil sets the value for Subject to be an explicit nil

### UnsetSubject
`func (o *GetMessages) UnsetSubject()`

UnsetSubject ensures that no value is present for Subject, not even an explicit nil
### GetTopicLinks

`func (o *GetMessages) GetTopicLinks() interface{}`

GetTopicLinks returns the TopicLinks field if non-nil, zero value otherwise.

### GetTopicLinksOk

`func (o *GetMessages) GetTopicLinksOk() (*interface{}, bool)`

GetTopicLinksOk returns a tuple with the TopicLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopicLinks

`func (o *GetMessages) SetTopicLinks(v interface{})`

SetTopicLinks sets TopicLinks field to given value.

### HasTopicLinks

`func (o *GetMessages) HasTopicLinks() bool`

HasTopicLinks returns a boolean if a field has been set.

### SetTopicLinksNil

`func (o *GetMessages) SetTopicLinksNil(b bool)`

 SetTopicLinksNil sets the value for TopicLinks to be an explicit nil

### UnsetTopicLinks
`func (o *GetMessages) UnsetTopicLinks()`

UnsetTopicLinks ensures that no value is present for TopicLinks, not even an explicit nil
### GetSubmessages

`func (o *GetMessages) GetSubmessages() interface{}`

GetSubmessages returns the Submessages field if non-nil, zero value otherwise.

### GetSubmessagesOk

`func (o *GetMessages) GetSubmessagesOk() (*interface{}, bool)`

GetSubmessagesOk returns a tuple with the Submessages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubmessages

`func (o *GetMessages) SetSubmessages(v interface{})`

SetSubmessages sets Submessages field to given value.

### HasSubmessages

`func (o *GetMessages) HasSubmessages() bool`

HasSubmessages returns a boolean if a field has been set.

### SetSubmessagesNil

`func (o *GetMessages) SetSubmessagesNil(b bool)`

 SetSubmessagesNil sets the value for Submessages to be an explicit nil

### UnsetSubmessages
`func (o *GetMessages) UnsetSubmessages()`

UnsetSubmessages ensures that no value is present for Submessages, not even an explicit nil
### GetTimestamp

`func (o *GetMessages) GetTimestamp() interface{}`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *GetMessages) GetTimestampOk() (*interface{}, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *GetMessages) SetTimestamp(v interface{})`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *GetMessages) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### SetTimestampNil

`func (o *GetMessages) SetTimestampNil(b bool)`

 SetTimestampNil sets the value for Timestamp to be an explicit nil

### UnsetTimestamp
`func (o *GetMessages) UnsetTimestamp()`

UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
### GetType

`func (o *GetMessages) GetType() interface{}`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *GetMessages) GetTypeOk() (*interface{}, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *GetMessages) SetType(v interface{})`

SetType sets Type field to given value.

### HasType

`func (o *GetMessages) HasType() bool`

HasType returns a boolean if a field has been set.

### SetTypeNil

`func (o *GetMessages) SetTypeNil(b bool)`

 SetTypeNil sets the value for Type to be an explicit nil

### UnsetType
`func (o *GetMessages) UnsetType()`

UnsetType ensures that no value is present for Type, not even an explicit nil
### GetFlags

`func (o *GetMessages) GetFlags() []string`

GetFlags returns the Flags field if non-nil, zero value otherwise.

### GetFlagsOk

`func (o *GetMessages) GetFlagsOk() (*[]string, bool)`

GetFlagsOk returns a tuple with the Flags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlags

`func (o *GetMessages) SetFlags(v []string)`

SetFlags sets Flags field to given value.

### HasFlags

`func (o *GetMessages) HasFlags() bool`

HasFlags returns a boolean if a field has been set.

### GetLastEditTimestamp

`func (o *GetMessages) GetLastEditTimestamp() int32`

GetLastEditTimestamp returns the LastEditTimestamp field if non-nil, zero value otherwise.

### GetLastEditTimestampOk

`func (o *GetMessages) GetLastEditTimestampOk() (*int32, bool)`

GetLastEditTimestampOk returns a tuple with the LastEditTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastEditTimestamp

`func (o *GetMessages) SetLastEditTimestamp(v int32)`

SetLastEditTimestamp sets LastEditTimestamp field to given value.

### HasLastEditTimestamp

`func (o *GetMessages) HasLastEditTimestamp() bool`

HasLastEditTimestamp returns a boolean if a field has been set.

### GetMatchContent

`func (o *GetMessages) GetMatchContent() string`

GetMatchContent returns the MatchContent field if non-nil, zero value otherwise.

### GetMatchContentOk

`func (o *GetMessages) GetMatchContentOk() (*string, bool)`

GetMatchContentOk returns a tuple with the MatchContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchContent

`func (o *GetMessages) SetMatchContent(v string)`

SetMatchContent sets MatchContent field to given value.

### HasMatchContent

`func (o *GetMessages) HasMatchContent() bool`

HasMatchContent returns a boolean if a field has been set.

### GetMatchSubject

`func (o *GetMessages) GetMatchSubject() string`

GetMatchSubject returns the MatchSubject field if non-nil, zero value otherwise.

### GetMatchSubjectOk

`func (o *GetMessages) GetMatchSubjectOk() (*string, bool)`

GetMatchSubjectOk returns a tuple with the MatchSubject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchSubject

`func (o *GetMessages) SetMatchSubject(v string)`

SetMatchSubject sets MatchSubject field to given value.

### HasMatchSubject

`func (o *GetMessages) HasMatchSubject() bool`

HasMatchSubject returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


