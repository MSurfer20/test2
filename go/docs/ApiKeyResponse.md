# ApiKeyResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **interface{}** |  | 
**Msg** | **interface{}** |  | 
**ApiKey** | **string** | The API key that can be used to authenticate as the requested user.  | 
**Email** | **string** | The email address of the user who owns the API key  | 

## Methods

### NewApiKeyResponse

`func NewApiKeyResponse(result interface{}, msg interface{}, apiKey string, email string, ) *ApiKeyResponse`

NewApiKeyResponse instantiates a new ApiKeyResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewApiKeyResponseWithDefaults

`func NewApiKeyResponseWithDefaults() *ApiKeyResponse`

NewApiKeyResponseWithDefaults instantiates a new ApiKeyResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *ApiKeyResponse) GetResult() interface{}`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *ApiKeyResponse) GetResultOk() (*interface{}, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *ApiKeyResponse) SetResult(v interface{})`

SetResult sets Result field to given value.


### SetResultNil

`func (o *ApiKeyResponse) SetResultNil(b bool)`

 SetResultNil sets the value for Result to be an explicit nil

### UnsetResult
`func (o *ApiKeyResponse) UnsetResult()`

UnsetResult ensures that no value is present for Result, not even an explicit nil
### GetMsg

`func (o *ApiKeyResponse) GetMsg() interface{}`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *ApiKeyResponse) GetMsgOk() (*interface{}, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *ApiKeyResponse) SetMsg(v interface{})`

SetMsg sets Msg field to given value.


### SetMsgNil

`func (o *ApiKeyResponse) SetMsgNil(b bool)`

 SetMsgNil sets the value for Msg to be an explicit nil

### UnsetMsg
`func (o *ApiKeyResponse) UnsetMsg()`

UnsetMsg ensures that no value is present for Msg, not even an explicit nil
### GetApiKey

`func (o *ApiKeyResponse) GetApiKey() string`

GetApiKey returns the ApiKey field if non-nil, zero value otherwise.

### GetApiKeyOk

`func (o *ApiKeyResponse) GetApiKeyOk() (*string, bool)`

GetApiKeyOk returns a tuple with the ApiKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiKey

`func (o *ApiKeyResponse) SetApiKey(v string)`

SetApiKey sets ApiKey field to given value.


### GetEmail

`func (o *ApiKeyResponse) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ApiKeyResponse) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ApiKeyResponse) SetEmail(v string)`

SetEmail sets Email field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


