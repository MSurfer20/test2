# EmojiReactionBaseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserId** | Pointer to **int32** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  | [optional] 
**User** | Pointer to [**EmojiReactionBaseAllOfUser**](EmojiReactionBaseAllOfUser.md) |  | [optional] 

## Methods

### NewEmojiReactionBaseAllOf

`func NewEmojiReactionBaseAllOf() *EmojiReactionBaseAllOf`

NewEmojiReactionBaseAllOf instantiates a new EmojiReactionBaseAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEmojiReactionBaseAllOfWithDefaults

`func NewEmojiReactionBaseAllOfWithDefaults() *EmojiReactionBaseAllOf`

NewEmojiReactionBaseAllOfWithDefaults instantiates a new EmojiReactionBaseAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserId

`func (o *EmojiReactionBaseAllOf) GetUserId() int32`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *EmojiReactionBaseAllOf) GetUserIdOk() (*int32, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *EmojiReactionBaseAllOf) SetUserId(v int32)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *EmojiReactionBaseAllOf) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetUser

`func (o *EmojiReactionBaseAllOf) GetUser() EmojiReactionBaseAllOfUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *EmojiReactionBaseAllOf) GetUserOk() (*EmojiReactionBaseAllOfUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *EmojiReactionBaseAllOf) SetUser(v EmojiReactionBaseAllOfUser)`

SetUser sets User field to given value.

### HasUser

`func (o *EmojiReactionBaseAllOf) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


