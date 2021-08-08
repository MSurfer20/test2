# AddSubscriptionsResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Result** | Pointer to **interface{}** |  | [optional] 
**Msg** | Pointer to **interface{}** |  | [optional] 
**Subscribed** | Pointer to **map[string][]string** | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query.  | [optional] 
**AlreadySubscribed** | Pointer to **map[string][]string** | A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to.  | [optional] 
**Unauthorized** | Pointer to **[]string** | A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if &#x60;authorization_errors_fatal&#x3D;false&#x60;.  | [optional] 

## Methods

### NewAddSubscriptionsResponseAllOf

`func NewAddSubscriptionsResponseAllOf() *AddSubscriptionsResponseAllOf`

NewAddSubscriptionsResponseAllOf instantiates a new AddSubscriptionsResponseAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAddSubscriptionsResponseAllOfWithDefaults

`func NewAddSubscriptionsResponseAllOfWithDefaults() *AddSubscriptionsResponseAllOf`

NewAddSubscriptionsResponseAllOfWithDefaults instantiates a new AddSubscriptionsResponseAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetResult

`func (o *AddSubscriptionsResponseAllOf) GetResult() interface{}`

GetResult returns the Result field if non-nil, zero value otherwise.

### GetResultOk

`func (o *AddSubscriptionsResponseAllOf) GetResultOk() (*interface{}, bool)`

GetResultOk returns a tuple with the Result field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResult

`func (o *AddSubscriptionsResponseAllOf) SetResult(v interface{})`

SetResult sets Result field to given value.

### HasResult

`func (o *AddSubscriptionsResponseAllOf) HasResult() bool`

HasResult returns a boolean if a field has been set.

### SetResultNil

`func (o *AddSubscriptionsResponseAllOf) SetResultNil(b bool)`

 SetResultNil sets the value for Result to be an explicit nil

### UnsetResult
`func (o *AddSubscriptionsResponseAllOf) UnsetResult()`

UnsetResult ensures that no value is present for Result, not even an explicit nil
### GetMsg

`func (o *AddSubscriptionsResponseAllOf) GetMsg() interface{}`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *AddSubscriptionsResponseAllOf) GetMsgOk() (*interface{}, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *AddSubscriptionsResponseAllOf) SetMsg(v interface{})`

SetMsg sets Msg field to given value.

### HasMsg

`func (o *AddSubscriptionsResponseAllOf) HasMsg() bool`

HasMsg returns a boolean if a field has been set.

### SetMsgNil

`func (o *AddSubscriptionsResponseAllOf) SetMsgNil(b bool)`

 SetMsgNil sets the value for Msg to be an explicit nil

### UnsetMsg
`func (o *AddSubscriptionsResponseAllOf) UnsetMsg()`

UnsetMsg ensures that no value is present for Msg, not even an explicit nil
### GetSubscribed

`func (o *AddSubscriptionsResponseAllOf) GetSubscribed() map[string][]string`

GetSubscribed returns the Subscribed field if non-nil, zero value otherwise.

### GetSubscribedOk

`func (o *AddSubscriptionsResponseAllOf) GetSubscribedOk() (*map[string][]string, bool)`

GetSubscribedOk returns a tuple with the Subscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscribed

`func (o *AddSubscriptionsResponseAllOf) SetSubscribed(v map[string][]string)`

SetSubscribed sets Subscribed field to given value.

### HasSubscribed

`func (o *AddSubscriptionsResponseAllOf) HasSubscribed() bool`

HasSubscribed returns a boolean if a field has been set.

### GetAlreadySubscribed

`func (o *AddSubscriptionsResponseAllOf) GetAlreadySubscribed() map[string][]string`

GetAlreadySubscribed returns the AlreadySubscribed field if non-nil, zero value otherwise.

### GetAlreadySubscribedOk

`func (o *AddSubscriptionsResponseAllOf) GetAlreadySubscribedOk() (*map[string][]string, bool)`

GetAlreadySubscribedOk returns a tuple with the AlreadySubscribed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlreadySubscribed

`func (o *AddSubscriptionsResponseAllOf) SetAlreadySubscribed(v map[string][]string)`

SetAlreadySubscribed sets AlreadySubscribed field to given value.

### HasAlreadySubscribed

`func (o *AddSubscriptionsResponseAllOf) HasAlreadySubscribed() bool`

HasAlreadySubscribed returns a boolean if a field has been set.

### GetUnauthorized

`func (o *AddSubscriptionsResponseAllOf) GetUnauthorized() []string`

GetUnauthorized returns the Unauthorized field if non-nil, zero value otherwise.

### GetUnauthorizedOk

`func (o *AddSubscriptionsResponseAllOf) GetUnauthorizedOk() (*[]string, bool)`

GetUnauthorizedOk returns a tuple with the Unauthorized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnauthorized

`func (o *AddSubscriptionsResponseAllOf) SetUnauthorized(v []string)`

SetUnauthorized sets Unauthorized field to given value.

### HasUnauthorized

`func (o *AddSubscriptionsResponseAllOf) HasUnauthorized() bool`

HasUnauthorized returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


