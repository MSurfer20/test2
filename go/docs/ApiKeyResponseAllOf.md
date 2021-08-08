# ApiKeyResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | Pointer to **interface{}** |  | [optional] 
**Msg** | Pointer to **interface{}** |  | [optional] 
**ApiKey** | **string** | The API key that can be used to authenticate as the requested user.  | 
**Email** | **string** | The email address of the user who owns the API key  | 

## Methods

### NewApiKeyResponseAllOf

`func NewApiKeyResponseAllOf(apiKey string, email string, ) *ApiKeyResponseAllOf`

NewApiKeyResponseAllOf instantiates a new ApiKeyResponseAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiKeyResponseAllOfWithDefaults

`func NewApiKeyResponseAllOfWithDefaults() *ApiKeyResponseAllOf`

NewApiKeyResponseAllOfWithDefaults instantiates a new ApiKeyResponseAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *ApiKeyResponseAllOf) GetResult() interface{}`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ApiKeyResponseAllOf) GetResultOk() (*interface{}, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ApiKeyResponseAllOf) SetResult(v interface{})`

SetResult sets Result field to given value.

### HasResult

`func (o *ApiKeyResponseAllOf) HasResult() bool`

HasResult returns a boolean if a field has been set.

### SetResultNil

`func (o *ApiKeyResponseAllOf) SetResultNil(b bool)`

 SetResultNil sets the value for Result to be an explicit nil

### UnsetResult
`func (o *ApiKeyResponseAllOf) UnsetResult()`

UnsetResult ensures that no value is present for Result, not even an explicit nil
### GetMsg

`func (o *ApiKeyResponseAllOf) GetMsg() interface{}`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *ApiKeyResponseAllOf) GetMsgOk() (*interface{}, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *ApiKeyResponseAllOf) SetMsg(v interface{})`

SetMsg sets Msg field to given value.

### HasMsg

`func (o *ApiKeyResponseAllOf) HasMsg() bool`

HasMsg returns a boolean if a field has been set.

### SetMsgNil

`func (o *ApiKeyResponseAllOf) SetMsgNil(b bool)`

 SetMsgNil sets the value for Msg to be an explicit nil

### UnsetMsg
`func (o *ApiKeyResponseAllOf) UnsetMsg()`

UnsetMsg ensures that no value is present for Msg, not even an explicit nil
### GetApiKey

`func (o *ApiKeyResponseAllOf) GetApiKey() string`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *ApiKeyResponseAllOf) GetApiKeyOk() (*string, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *ApiKeyResponseAllOf) SetApiKey(v string)`

SetApiKey sets ApiKey field to given value.


### GetEmail

`func (o *ApiKeyResponseAllOf) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ApiKeyResponseAllOf) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ApiKeyResponseAllOf) SetEmail(v string)`

SetEmail sets Email field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


