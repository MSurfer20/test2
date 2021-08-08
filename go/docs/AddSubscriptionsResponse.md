# AddSubscriptionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | **interface{}** |  | 
**Msg** | **interface{}** |  | 
**Subscribed** | Pointer to **map[string][]string** | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] 
**AlreadySubscribed** | Pointer to **map[string][]string** | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] 
**Unauthorized** | Pointer to **[]string** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] 

## Methods

### NewAddSubscriptionsResponse

`func NewAddSubscriptionsResponse(result interface{}, msg interface{}, ) *AddSubscriptionsResponse`

NewAddSubscriptionsResponse instantiates a new AddSubscriptionsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAddSubscriptionsResponseWithDefaults

`func NewAddSubscriptionsResponseWithDefaults() *AddSubscriptionsResponse`

NewAddSubscriptionsResponseWithDefaults instantiates a new AddSubscriptionsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *AddSubscriptionsResponse) GetResult() interface{}`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *AddSubscriptionsResponse) GetResultOk() (*interface{}, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *AddSubscriptionsResponse) SetResult(v interface{})`

SetResult sets Result field to given value.


### SetResultNil

`func (o *AddSubscriptionsResponse) SetResultNil(b bool)`

 SetResultNil sets the value for Result to be an explicit nil

### UnsetResult
`func (o *AddSubscriptionsResponse) UnsetResult()`

UnsetResult ensures that no value is present for Result, not even an explicit nil
### GetMsg

`func (o *AddSubscriptionsResponse) GetMsg() interface{}`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *AddSubscriptionsResponse) GetMsgOk() (*interface{}, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *AddSubscriptionsResponse) SetMsg(v interface{})`

SetMsg sets Msg field to given value.


### SetMsgNil

`func (o *AddSubscriptionsResponse) SetMsgNil(b bool)`

 SetMsgNil sets the value for Msg to be an explicit nil

### UnsetMsg
`func (o *AddSubscriptionsResponse) UnsetMsg()`

UnsetMsg ensures that no value is present for Msg, not even an explicit nil
### GetSubscribed

`func (o *AddSubscriptionsResponse) GetSubscribed() map[string][]string`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *AddSubscriptionsResponse) GetSubscribedOk() (*map[string][]string, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *AddSubscriptionsResponse) SetSubscribed(v map[string][]string)`

SetSubscribed sets Subscribed field to given value.

### HasSubscribed

`func (o *AddSubscriptionsResponse) HasSubscribed() bool`

HasSubscribed returns a boolean if a field has been set.

### GetAlreadySubscribed

`func (o *AddSubscriptionsResponse) GetAlreadySubscribed() map[string][]string`

GetAlreadySubscribed returns the AlreadySubscribed field if non-nil, zero value otherwise.

### GetAlreadySubscribedOk

`func (o *AddSubscriptionsResponse) GetAlreadySubscribedOk() (*map[string][]string, bool)`

GetAlreadySubscribedOk returns a tuple with the AlreadySubscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlreadySubscribed

`func (o *AddSubscriptionsResponse) SetAlreadySubscribed(v map[string][]string)`

SetAlreadySubscribed sets AlreadySubscribed field to given value.

### HasAlreadySubscribed

`func (o *AddSubscriptionsResponse) HasAlreadySubscribed() bool`

HasAlreadySubscribed returns a boolean if a field has been set.

### GetUnauthorized

`func (o *AddSubscriptionsResponse) GetUnauthorized() []string`

GetUnauthorized returns the Unauthorized field if non-nil, zero value otherwise.

### GetUnauthorizedOk

`func (o *AddSubscriptionsResponse) GetUnauthorizedOk() (*[]string, bool)`

GetUnauthorizedOk returns a tuple with the Unauthorized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnauthorized

`func (o *AddSubscriptionsResponse) SetUnauthorized(v []string)`

SetUnauthorized sets Unauthorized field to given value.

### HasUnauthorized

`func (o *AddSubscriptionsResponse) HasUnauthorized() bool`

HasUnauthorized returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


