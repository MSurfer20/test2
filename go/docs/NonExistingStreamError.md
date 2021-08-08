# NonExistingStreamError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **interface{}** |  | 
**Msg** | **interface{}** |  | 
**Code** | Pointer to **interface{}** |  | [optional] 
**Stream** | Pointer to **string** | The name of the stream that could not be found.  | [optional] 

## Methods

### NewNonExistingStreamError

`func NewNonExistingStreamError(result interface{}, msg interface{}, ) *NonExistingStreamError`

NewNonExistingStreamError instantiates a new NonExistingStreamError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNonExistingStreamErrorWithDefaults

`func NewNonExistingStreamErrorWithDefaults() *NonExistingStreamError`

NewNonExistingStreamErrorWithDefaults instantiates a new NonExistingStreamError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *NonExistingStreamError) GetResult() interface{}`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *NonExistingStreamError) GetResultOk() (*interface{}, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *NonExistingStreamError) SetResult(v interface{})`

SetResult sets Result field to given value.


### SetResultNil

`func (o *NonExistingStreamError) SetResultNil(b bool)`

 SetResultNil sets the value for Result to be an explicit nil

### UnsetResult
`func (o *NonExistingStreamError) UnsetResult()`

UnsetResult ensures that no value is present for Result, not even an explicit nil
### GetMsg

`func (o *NonExistingStreamError) GetMsg() interface{}`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *NonExistingStreamError) GetMsgOk() (*interface{}, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *NonExistingStreamError) SetMsg(v interface{})`

SetMsg sets Msg field to given value.


### SetMsgNil

`func (o *NonExistingStreamError) SetMsgNil(b bool)`

 SetMsgNil sets the value for Msg to be an explicit nil

### UnsetMsg
`func (o *NonExistingStreamError) UnsetMsg()`

UnsetMsg ensures that no value is present for Msg, not even an explicit nil
### GetCode

`func (o *NonExistingStreamError) GetCode() interface{}`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *NonExistingStreamError) GetCodeOk() (*interface{}, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *NonExistingStreamError) SetCode(v interface{})`

SetCode sets Code field to given value.

### HasCode

`func (o *NonExistingStreamError) HasCode() bool`

HasCode returns a boolean if a field has been set.

### SetCodeNil

`func (o *NonExistingStreamError) SetCodeNil(b bool)`

 SetCodeNil sets the value for Code to be an explicit nil

### UnsetCode
`func (o *NonExistingStreamError) UnsetCode()`

UnsetCode ensures that no value is present for Code, not even an explicit nil
### GetStream

`func (o *NonExistingStreamError) GetStream() string`

GetStream returns the Stream field if non-nil, zero value otherwise.

### GetStreamOk

`func (o *NonExistingStreamError) GetStreamOk() (*string, bool)`

GetStreamOk returns a tuple with the Stream field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStream

`func (o *NonExistingStreamError) SetStream(v string)`

SetStream sets Stream field to given value.

### HasStream

`func (o *NonExistingStreamError) HasStream() bool`

HasStream returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


