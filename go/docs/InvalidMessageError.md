# InvalidMessageError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **interface{}** |  | 
**Msg** | **interface{}** |  | 
**RawContent** | Pointer to **string** | The raw content of the message.  | [optional] 

## Methods

### NewInvalidMessageError

`func NewInvalidMessageError(result interface{}, msg interface{}, ) *InvalidMessageError`

NewInvalidMessageError instantiates a new InvalidMessageError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInvalidMessageErrorWithDefaults

`func NewInvalidMessageErrorWithDefaults() *InvalidMessageError`

NewInvalidMessageErrorWithDefaults instantiates a new InvalidMessageError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *InvalidMessageError) GetResult() interface{}`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *InvalidMessageError) GetResultOk() (*interface{}, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *InvalidMessageError) SetResult(v interface{})`

SetResult sets Result field to given value.


### SetResultNil

`func (o *InvalidMessageError) SetResultNil(b bool)`

 SetResultNil sets the value for Result to be an explicit nil

### UnsetResult
`func (o *InvalidMessageError) UnsetResult()`

UnsetResult ensures that no value is present for Result, not even an explicit nil
### GetMsg

`func (o *InvalidMessageError) GetMsg() interface{}`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *InvalidMessageError) GetMsgOk() (*interface{}, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *InvalidMessageError) SetMsg(v interface{})`

SetMsg sets Msg field to given value.


### SetMsgNil

`func (o *InvalidMessageError) SetMsgNil(b bool)`

 SetMsgNil sets the value for Msg to be an explicit nil

### UnsetMsg
`func (o *InvalidMessageError) UnsetMsg()`

UnsetMsg ensures that no value is present for Msg, not even an explicit nil
### GetRawContent

`func (o *InvalidMessageError) GetRawContent() string`

GetRawContent returns the RawContent field if non-nil, zero value otherwise.

### GetRawContentOk

`func (o *InvalidMessageError) GetRawContentOk() (*string, bool)`

GetRawContentOk returns a tuple with the RawContent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawContent

`func (o *InvalidMessageError) SetRawContent(v string)`

SetRawContent sets RawContent field to given value.

### HasRawContent

`func (o *InvalidMessageError) HasRawContent() bool`

HasRawContent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


