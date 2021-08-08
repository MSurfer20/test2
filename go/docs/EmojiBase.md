# EmojiBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmojiCode** | Pointer to **string** | A unique identifier, defining the specific emoji codepoint requested, within the namespace of the &#x60;reaction_type&#x60;.  For example, for &#x60;unicode_emoji&#x60;, this will be an encoding of the Unicode codepoint; for &#x60;realm_emoji&#x60;, it&#39;ll be the ID of the realm emoji.  | [optional] 
**EmojiName** | Pointer to **string** | Name of the emoji.  | [optional] 
**ReactionType** | Pointer to **string** | One of the following values:  * &#x60;unicode_emoji&#x60;: Unicode emoji (&#x60;emoji_code&#x60; will be its Unicode   codepoint). * &#x60;realm_emoji&#x60;: [Custom emoji](/help/add-custom-emoji).   (&#x60;emoji_code&#x60; will be its ID). * &#x60;zulip_extra_emoji&#x60;: Special emoji included with Zulip.  Exists to   namespace the &#x60;zulip&#x60; emoji.  | [optional] 

## Methods

### NewEmojiBase

`func NewEmojiBase() *EmojiBase`

NewEmojiBase instantiates a new EmojiBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEmojiBaseWithDefaults

`func NewEmojiBaseWithDefaults() *EmojiBase`

NewEmojiBaseWithDefaults instantiates a new EmojiBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmojiCode

`func (o *EmojiBase) GetEmojiCode() string`

GetEmojiCode returns the EmojiCode field if non-nil, zero value otherwise.

### GetEmojiCodeOk

`func (o *EmojiBase) GetEmojiCodeOk() (*string, bool)`

GetEmojiCodeOk returns a tuple with the EmojiCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmojiCode

`func (o *EmojiBase) SetEmojiCode(v string)`

SetEmojiCode sets EmojiCode field to given value.

### HasEmojiCode

`func (o *EmojiBase) HasEmojiCode() bool`

HasEmojiCode returns a boolean if a field has been set.

### GetEmojiName

`func (o *EmojiBase) GetEmojiName() string`

GetEmojiName returns the EmojiName field if non-nil, zero value otherwise.

### GetEmojiNameOk

`func (o *EmojiBase) GetEmojiNameOk() (*string, bool)`

GetEmojiNameOk returns a tuple with the EmojiName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmojiName

`func (o *EmojiBase) SetEmojiName(v string)`

SetEmojiName sets EmojiName field to given value.

### HasEmojiName

`func (o *EmojiBase) HasEmojiName() bool`

HasEmojiName returns a boolean if a field has been set.

### GetReactionType

`func (o *EmojiBase) GetReactionType() string`

GetReactionType returns the ReactionType field if non-nil, zero value otherwise.

### GetReactionTypeOk

`func (o *EmojiBase) GetReactionTypeOk() (*string, bool)`

GetReactionTypeOk returns a tuple with the ReactionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReactionType

`func (o *EmojiBase) SetReactionType(v string)`

SetReactionType sets ReactionType field to given value.

### HasReactionType

`func (o *EmojiBase) HasReactionType() bool`

HasReactionType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


