# InlineResponse200

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BotEmail** | Pointer to **string** | Email of the bot user.  | [optional] 
**BotFullName** | Pointer to **string** | The full name of the bot user.  | [optional] 
**Data** | Pointer to **string** | The message content, in raw Markdown format (not rendered to HTML).  | [optional] 
**Trigger** | Pointer to **string** | What aspect of the message triggered the outgoing webhook notification. Possible values include &#x60;private_message&#x60; and &#x60;mention&#x60;.  | [optional] 
**Token** | Pointer to **string** | A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the &#x60;zuliprc&#x60; file downloaded when creating the bot.  | [optional] 
**Message** | Pointer to [**MessagesBase**](MessagesBase.md) | A dict containing details on the message that triggered the outgoing webhook, in the format used by [&#x60;GET /messages&#x60;](/api/get-messages).  | [optional] 

## Methods

### NewInlineResponse200

`func NewInlineResponse200() *InlineResponse200`

NewInlineResponse200 instantiates a new InlineResponse200 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInlineResponse200WithDefaults

`func NewInlineResponse200WithDefaults() *InlineResponse200`

NewInlineResponse200WithDefaults instantiates a new InlineResponse200 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBotEmail

`func (o *InlineResponse200) GetBotEmail() string`

GetBotEmail returns the BotEmail field if non-nil, zero value otherwise.

### GetBotEmailOk

`func (o *InlineResponse200) GetBotEmailOk() (*string, bool)`

GetBotEmailOk returns a tuple with the BotEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotEmail

`func (o *InlineResponse200) SetBotEmail(v string)`

SetBotEmail sets BotEmail field to given value.

### HasBotEmail

`func (o *InlineResponse200) HasBotEmail() bool`

HasBotEmail returns a boolean if a field has been set.

### GetBotFullName

`func (o *InlineResponse200) GetBotFullName() string`

GetBotFullName returns the BotFullName field if non-nil, zero value otherwise.

### GetBotFullNameOk

`func (o *InlineResponse200) GetBotFullNameOk() (*string, bool)`

GetBotFullNameOk returns a tuple with the BotFullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotFullName

`func (o *InlineResponse200) SetBotFullName(v string)`

SetBotFullName sets BotFullName field to given value.

### HasBotFullName

`func (o *InlineResponse200) HasBotFullName() bool`

HasBotFullName returns a boolean if a field has been set.

### GetData

`func (o *InlineResponse200) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *InlineResponse200) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *InlineResponse200) SetData(v string)`

SetData sets Data field to given value.

### HasData

`func (o *InlineResponse200) HasData() bool`

HasData returns a boolean if a field has been set.

### GetTrigger

`func (o *InlineResponse200) GetTrigger() string`

GetTrigger returns the Trigger field if non-nil, zero value otherwise.

### GetTriggerOk

`func (o *InlineResponse200) GetTriggerOk() (*string, bool)`

GetTriggerOk returns a tuple with the Trigger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrigger

`func (o *InlineResponse200) SetTrigger(v string)`

SetTrigger sets Trigger field to given value.

### HasTrigger

`func (o *InlineResponse200) HasTrigger() bool`

HasTrigger returns a boolean if a field has been set.

### GetToken

`func (o *InlineResponse200) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *InlineResponse200) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *InlineResponse200) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *InlineResponse200) HasToken() bool`

HasToken returns a boolean if a field has been set.

### GetMessage

`func (o *InlineResponse200) GetMessage() MessagesBase`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *InlineResponse200) GetMessageOk() (*MessagesBase, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *InlineResponse200) SetMessage(v MessagesBase)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *InlineResponse200) HasMessage() bool`

HasMessage returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


