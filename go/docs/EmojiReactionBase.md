# EmojiReactionBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmojiCode** | Pointer to **string** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] 
**EmojiName** | Pointer to **string** | Name of the emoji.  | [optional] 
**ReactionType** | Pointer to **string** | One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] 
**UserId** | Pointer to **int32** | The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The &#x60;user&#x60; object is deprecated and will be removed in the future.  | [optional] 
**User** | Pointer to [**EmojiReactionBaseAllOfUser**](EmojiReactionBaseAllOfUser.md) |  | [optional] 

## Methods

### NewEmojiReactionBase

`func NewEmojiReactionBase() *EmojiReactionBase`

NewEmojiReactionBase instantiates a new EmojiReactionBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEmojiReactionBaseWithDefaults

`func NewEmojiReactionBaseWithDefaults() *EmojiReactionBase`

NewEmojiReactionBaseWithDefaults instantiates a new EmojiReactionBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmojiCode

`func (o *EmojiReactionBase) GetEmojiCode() string`

GetEmojiCode returns the EmojiCode field if non-nil, zero value otherwise.

### GetEmojiCodeOk

`func (o *EmojiReactionBase) GetEmojiCodeOk() (*string, bool)`

GetEmojiCodeOk returns a tuple with the EmojiCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmojiCode

`func (o *EmojiReactionBase) SetEmojiCode(v string)`

SetEmojiCode sets EmojiCode field to given value.

### HasEmojiCode

`func (o *EmojiReactionBase) HasEmojiCode() bool`

HasEmojiCode returns a boolean if a field has been set.

### GetEmojiName

`func (o *EmojiReactionBase) GetEmojiName() string`

GetEmojiName returns the EmojiName field if non-nil, zero value otherwise.

### GetEmojiNameOk

`func (o *EmojiReactionBase) GetEmojiNameOk() (*string, bool)`

GetEmojiNameOk returns a tuple with the EmojiName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmojiName

`func (o *EmojiReactionBase) SetEmojiName(v string)`

SetEmojiName sets EmojiName field to given value.

### HasEmojiName

`func (o *EmojiReactionBase) HasEmojiName() bool`

HasEmojiName returns a boolean if a field has been set.

### GetReactionType

`func (o *EmojiReactionBase) GetReactionType() string`

GetReactionType returns the ReactionType field if non-nil, zero value otherwise.

### GetReactionTypeOk

`func (o *EmojiReactionBase) GetReactionTypeOk() (*string, bool)`

GetReactionTypeOk returns a tuple with the ReactionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactionType

`func (o *EmojiReactionBase) SetReactionType(v string)`

SetReactionType sets ReactionType field to given value.

### HasReactionType

`func (o *EmojiReactionBase) HasReactionType() bool`

HasReactionType returns a boolean if a field has been set.

### GetUserId

`func (o *EmojiReactionBase) GetUserId() int32`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *EmojiReactionBase) GetUserIdOk() (*int32, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *EmojiReactionBase) SetUserId(v int32)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *EmojiReactionBase) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetUser

`func (o *EmojiReactionBase) GetUser() EmojiReactionBaseAllOfUser`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *EmojiReactionBase) GetUserOk() (*EmojiReactionBaseAllOfUser, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *EmojiReactionBase) SetUser(v EmojiReactionBaseAllOfUser)`

SetUser sets User field to given value.

### HasUser

`func (o *EmojiReactionBase) HasUser() bool`

HasUser returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


