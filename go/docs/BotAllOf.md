# BotAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | Pointer to **interface{}** |  | [optional] 
**FullName** | Pointer to **interface{}** |  | [optional] 
**ApiKey** | Pointer to **interface{}** |  | [optional] 
**DefaultSendingStream** | Pointer to **interface{}** |  | [optional] 
**DefaultEventsRegisterStream** | Pointer to **interface{}** |  | [optional] 
**DefaultAllPublicStreams** | Pointer to **interface{}** |  | [optional] 
**AvatarUrl** | Pointer to **interface{}** |  | [optional] 
**OwnerId** | Pointer to **interface{}** |  | [optional] 
**Services** | Pointer to **interface{}** |  | [optional] 
**Email** | Pointer to **string** | The email of the bot.  | [optional] 
**BotType** | Pointer to **NullableInt32** | An integer describing the type of bot: * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  | [optional] 
**IsActive** | Pointer to **bool** | A boolean describing whether the user account has been deactivated.  | [optional] 

## Methods

### NewBotAllOf

`func NewBotAllOf() *BotAllOf`

NewBotAllOf instantiates a new BotAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBotAllOfWithDefaults

`func NewBotAllOfWithDefaults() *BotAllOf`

NewBotAllOfWithDefaults instantiates a new BotAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserId

`func (o *BotAllOf) GetUserId() interface{}`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *BotAllOf) GetUserIdOk() (*interface{}, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *BotAllOf) SetUserId(v interface{})`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *BotAllOf) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### SetUserIdNil

`func (o *BotAllOf) SetUserIdNil(b bool)`

 SetUserIdNil sets the value for UserId to be an explicit nil

### UnsetUserId
`func (o *BotAllOf) UnsetUserId()`

UnsetUserId ensures that no value is present for UserId, not even an explicit nil
### GetFullName

`func (o *BotAllOf) GetFullName() interface{}`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *BotAllOf) GetFullNameOk() (*interface{}, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *BotAllOf) SetFullName(v interface{})`

SetFullName sets FullName field to given value.

### HasFullName

`func (o *BotAllOf) HasFullName() bool`

HasFullName returns a boolean if a field has been set.

### SetFullNameNil

`func (o *BotAllOf) SetFullNameNil(b bool)`

 SetFullNameNil sets the value for FullName to be an explicit nil

### UnsetFullName
`func (o *BotAllOf) UnsetFullName()`

UnsetFullName ensures that no value is present for FullName, not even an explicit nil
### GetApiKey

`func (o *BotAllOf) GetApiKey() interface{}`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *BotAllOf) GetApiKeyOk() (*interface{}, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *BotAllOf) SetApiKey(v interface{})`

SetApiKey sets ApiKey field to given value.

### HasApiKey

`func (o *BotAllOf) HasApiKey() bool`

HasApiKey returns a boolean if a field has been set.

### SetApiKeyNil

`func (o *BotAllOf) SetApiKeyNil(b bool)`

 SetApiKeyNil sets the value for ApiKey to be an explicit nil

### UnsetApiKey
`func (o *BotAllOf) UnsetApiKey()`

UnsetApiKey ensures that no value is present for ApiKey, not even an explicit nil
### GetDefaultSendingStream

`func (o *BotAllOf) GetDefaultSendingStream() interface{}`

GetDefaultSendingStream returns the DefaultSendingStream field if non-nil, zero value otherwise.

### GetDefaultSendingStreamOk

`func (o *BotAllOf) GetDefaultSendingStreamOk() (*interface{}, bool)`

GetDefaultSendingStreamOk returns a tuple with the DefaultSendingStream field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultSendingStream

`func (o *BotAllOf) SetDefaultSendingStream(v interface{})`

SetDefaultSendingStream sets DefaultSendingStream field to given value.

### HasDefaultSendingStream

`func (o *BotAllOf) HasDefaultSendingStream() bool`

HasDefaultSendingStream returns a boolean if a field has been set.

### SetDefaultSendingStreamNil

`func (o *BotAllOf) SetDefaultSendingStreamNil(b bool)`

 SetDefaultSendingStreamNil sets the value for DefaultSendingStream to be an explicit nil

### UnsetDefaultSendingStream
`func (o *BotAllOf) UnsetDefaultSendingStream()`

UnsetDefaultSendingStream ensures that no value is present for DefaultSendingStream, not even an explicit nil
### GetDefaultEventsRegisterStream

`func (o *BotAllOf) GetDefaultEventsRegisterStream() interface{}`

GetDefaultEventsRegisterStream returns the DefaultEventsRegisterStream field if non-nil, zero value otherwise.

### GetDefaultEventsRegisterStreamOk

`func (o *BotAllOf) GetDefaultEventsRegisterStreamOk() (*interface{}, bool)`

GetDefaultEventsRegisterStreamOk returns a tuple with the DefaultEventsRegisterStream field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultEventsRegisterStream

`func (o *BotAllOf) SetDefaultEventsRegisterStream(v interface{})`

SetDefaultEventsRegisterStream sets DefaultEventsRegisterStream field to given value.

### HasDefaultEventsRegisterStream

`func (o *BotAllOf) HasDefaultEventsRegisterStream() bool`

HasDefaultEventsRegisterStream returns a boolean if a field has been set.

### SetDefaultEventsRegisterStreamNil

`func (o *BotAllOf) SetDefaultEventsRegisterStreamNil(b bool)`

 SetDefaultEventsRegisterStreamNil sets the value for DefaultEventsRegisterStream to be an explicit nil

### UnsetDefaultEventsRegisterStream
`func (o *BotAllOf) UnsetDefaultEventsRegisterStream()`

UnsetDefaultEventsRegisterStream ensures that no value is present for DefaultEventsRegisterStream, not even an explicit nil
### GetDefaultAllPublicStreams

`func (o *BotAllOf) GetDefaultAllPublicStreams() interface{}`

GetDefaultAllPublicStreams returns the DefaultAllPublicStreams field if non-nil, zero value otherwise.

### GetDefaultAllPublicStreamsOk

`func (o *BotAllOf) GetDefaultAllPublicStreamsOk() (*interface{}, bool)`

GetDefaultAllPublicStreamsOk returns a tuple with the DefaultAllPublicStreams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultAllPublicStreams

`func (o *BotAllOf) SetDefaultAllPublicStreams(v interface{})`

SetDefaultAllPublicStreams sets DefaultAllPublicStreams field to given value.

### HasDefaultAllPublicStreams

`func (o *BotAllOf) HasDefaultAllPublicStreams() bool`

HasDefaultAllPublicStreams returns a boolean if a field has been set.

### SetDefaultAllPublicStreamsNil

`func (o *BotAllOf) SetDefaultAllPublicStreamsNil(b bool)`

 SetDefaultAllPublicStreamsNil sets the value for DefaultAllPublicStreams to be an explicit nil

### UnsetDefaultAllPublicStreams
`func (o *BotAllOf) UnsetDefaultAllPublicStreams()`

UnsetDefaultAllPublicStreams ensures that no value is present for DefaultAllPublicStreams, not even an explicit nil
### GetAvatarUrl

`func (o *BotAllOf) GetAvatarUrl() interface{}`

GetAvatarUrl returns the AvatarUrl field if non-nil, zero value otherwise.

### GetAvatarUrlOk

`func (o *BotAllOf) GetAvatarUrlOk() (*interface{}, bool)`

GetAvatarUrlOk returns a tuple with the AvatarUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarUrl

`func (o *BotAllOf) SetAvatarUrl(v interface{})`

SetAvatarUrl sets AvatarUrl field to given value.

### HasAvatarUrl

`func (o *BotAllOf) HasAvatarUrl() bool`

HasAvatarUrl returns a boolean if a field has been set.

### SetAvatarUrlNil

`func (o *BotAllOf) SetAvatarUrlNil(b bool)`

 SetAvatarUrlNil sets the value for AvatarUrl to be an explicit nil

### UnsetAvatarUrl
`func (o *BotAllOf) UnsetAvatarUrl()`

UnsetAvatarUrl ensures that no value is present for AvatarUrl, not even an explicit nil
### GetOwnerId

`func (o *BotAllOf) GetOwnerId() interface{}`

GetOwnerId returns the OwnerId field if non-nil, zero value otherwise.

### GetOwnerIdOk

`func (o *BotAllOf) GetOwnerIdOk() (*interface{}, bool)`

GetOwnerIdOk returns a tuple with the OwnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwnerId

`func (o *BotAllOf) SetOwnerId(v interface{})`

SetOwnerId sets OwnerId field to given value.

### HasOwnerId

`func (o *BotAllOf) HasOwnerId() bool`

HasOwnerId returns a boolean if a field has been set.

### SetOwnerIdNil

`func (o *BotAllOf) SetOwnerIdNil(b bool)`

 SetOwnerIdNil sets the value for OwnerId to be an explicit nil

### UnsetOwnerId
`func (o *BotAllOf) UnsetOwnerId()`

UnsetOwnerId ensures that no value is present for OwnerId, not even an explicit nil
### GetServices

`func (o *BotAllOf) GetServices() interface{}`

GetServices returns the Services field if non-nil, zero value otherwise.

### GetServicesOk

`func (o *BotAllOf) GetServicesOk() (*interface{}, bool)`

GetServicesOk returns a tuple with the Services field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServices

`func (o *BotAllOf) SetServices(v interface{})`

SetServices sets Services field to given value.

### HasServices

`func (o *BotAllOf) HasServices() bool`

HasServices returns a boolean if a field has been set.

### SetServicesNil

`func (o *BotAllOf) SetServicesNil(b bool)`

 SetServicesNil sets the value for Services to be an explicit nil

### UnsetServices
`func (o *BotAllOf) UnsetServices()`

UnsetServices ensures that no value is present for Services, not even an explicit nil
### GetEmail

`func (o *BotAllOf) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *BotAllOf) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *BotAllOf) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *BotAllOf) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetBotType

`func (o *BotAllOf) GetBotType() int32`

GetBotType returns the BotType field if non-nil, zero value otherwise.

### GetBotTypeOk

`func (o *BotAllOf) GetBotTypeOk() (*int32, bool)`

GetBotTypeOk returns a tuple with the BotType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotType

`func (o *BotAllOf) SetBotType(v int32)`

SetBotType sets BotType field to given value.

### HasBotType

`func (o *BotAllOf) HasBotType() bool`

HasBotType returns a boolean if a field has been set.

### SetBotTypeNil

`func (o *BotAllOf) SetBotTypeNil(b bool)`

 SetBotTypeNil sets the value for BotType to be an explicit nil

### UnsetBotType
`func (o *BotAllOf) UnsetBotType()`

UnsetBotType ensures that no value is present for BotType, not even an explicit nil
### GetIsActive

`func (o *BotAllOf) GetIsActive() bool`

GetIsActive returns the IsActive field if non-nil, zero value otherwise.

### GetIsActiveOk

`func (o *BotAllOf) GetIsActiveOk() (*bool, bool)`

GetIsActiveOk returns a tuple with the IsActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsActive

`func (o *BotAllOf) SetIsActive(v bool)`

SetIsActive sets IsActive field to given value.

### HasIsActive

`func (o *BotAllOf) HasIsActive() bool`

HasIsActive returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


