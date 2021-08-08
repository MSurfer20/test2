/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * API version: 1.0.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// AddSubscriptionsResponseAllOf struct for AddSubscriptionsResponseAllOf
type AddSubscriptionsResponseAllOf struct {
	Result interface{} `json:"result,omitempty"`
	Msg interface{} `json:"msg,omitempty"`
	// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
	Subscribed *map[string][]string `json:"subscribed,omitempty"`
	// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
	AlreadySubscribed *map[string][]string `json:"already_subscribed,omitempty"`
	// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
	Unauthorized *[]string `json:"unauthorized,omitempty"`
}

// NewAddSubscriptionsResponseAllOf instantiates a new AddSubscriptionsResponseAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddSubscriptionsResponseAllOf() *AddSubscriptionsResponseAllOf {
	this := AddSubscriptionsResponseAllOf{}
	return &this
}

// NewAddSubscriptionsResponseAllOfWithDefaults instantiates a new AddSubscriptionsResponseAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddSubscriptionsResponseAllOfWithDefaults() *AddSubscriptionsResponseAllOf {
	this := AddSubscriptionsResponseAllOf{}
	return &this
}

// GetResult returns the Result field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *AddSubscriptionsResponseAllOf) GetResult() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *AddSubscriptionsResponseAllOf) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *AddSubscriptionsResponseAllOf) HasResult() bool {
	if o != nil && o.Result != nil {
		return true
	}

	return false
}

// SetResult gets a reference to the given interface{} and assigns it to the Result field.
func (o *AddSubscriptionsResponseAllOf) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *AddSubscriptionsResponseAllOf) GetMsg() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *AddSubscriptionsResponseAllOf) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// HasMsg returns a boolean if a field has been set.
func (o *AddSubscriptionsResponseAllOf) HasMsg() bool {
	if o != nil && o.Msg != nil {
		return true
	}

	return false
}

// SetMsg gets a reference to the given interface{} and assigns it to the Msg field.
func (o *AddSubscriptionsResponseAllOf) SetMsg(v interface{}) {
	o.Msg = v
}

// GetSubscribed returns the Subscribed field value if set, zero value otherwise.
func (o *AddSubscriptionsResponseAllOf) GetSubscribed() map[string][]string {
	if o == nil || o.Subscribed == nil {
		var ret map[string][]string
		return ret
	}
	return *o.Subscribed
}

// GetSubscribedOk returns a tuple with the Subscribed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddSubscriptionsResponseAllOf) GetSubscribedOk() (*map[string][]string, bool) {
	if o == nil || o.Subscribed == nil {
		return nil, false
	}
	return o.Subscribed, true
}

// HasSubscribed returns a boolean if a field has been set.
func (o *AddSubscriptionsResponseAllOf) HasSubscribed() bool {
	if o != nil && o.Subscribed != nil {
		return true
	}

	return false
}

// SetSubscribed gets a reference to the given map[string][]string and assigns it to the Subscribed field.
func (o *AddSubscriptionsResponseAllOf) SetSubscribed(v map[string][]string) {
	o.Subscribed = &v
}

// GetAlreadySubscribed returns the AlreadySubscribed field value if set, zero value otherwise.
func (o *AddSubscriptionsResponseAllOf) GetAlreadySubscribed() map[string][]string {
	if o == nil || o.AlreadySubscribed == nil {
		var ret map[string][]string
		return ret
	}
	return *o.AlreadySubscribed
}

// GetAlreadySubscribedOk returns a tuple with the AlreadySubscribed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddSubscriptionsResponseAllOf) GetAlreadySubscribedOk() (*map[string][]string, bool) {
	if o == nil || o.AlreadySubscribed == nil {
		return nil, false
	}
	return o.AlreadySubscribed, true
}

// HasAlreadySubscribed returns a boolean if a field has been set.
func (o *AddSubscriptionsResponseAllOf) HasAlreadySubscribed() bool {
	if o != nil && o.AlreadySubscribed != nil {
		return true
	}

	return false
}

// SetAlreadySubscribed gets a reference to the given map[string][]string and assigns it to the AlreadySubscribed field.
func (o *AddSubscriptionsResponseAllOf) SetAlreadySubscribed(v map[string][]string) {
	o.AlreadySubscribed = &v
}

// GetUnauthorized returns the Unauthorized field value if set, zero value otherwise.
func (o *AddSubscriptionsResponseAllOf) GetUnauthorized() []string {
	if o == nil || o.Unauthorized == nil {
		var ret []string
		return ret
	}
	return *o.Unauthorized
}

// GetUnauthorizedOk returns a tuple with the Unauthorized field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AddSubscriptionsResponseAllOf) GetUnauthorizedOk() (*[]string, bool) {
	if o == nil || o.Unauthorized == nil {
		return nil, false
	}
	return o.Unauthorized, true
}

// HasUnauthorized returns a boolean if a field has been set.
func (o *AddSubscriptionsResponseAllOf) HasUnauthorized() bool {
	if o != nil && o.Unauthorized != nil {
		return true
	}

	return false
}

// SetUnauthorized gets a reference to the given []string and assigns it to the Unauthorized field.
func (o *AddSubscriptionsResponseAllOf) SetUnauthorized(v []string) {
	o.Unauthorized = &v
}

func (o AddSubscriptionsResponseAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Result != nil {
		toSerialize["result"] = o.Result
	}
	if o.Msg != nil {
		toSerialize["msg"] = o.Msg
	}
	if o.Subscribed != nil {
		toSerialize["subscribed"] = o.Subscribed
	}
	if o.AlreadySubscribed != nil {
		toSerialize["already_subscribed"] = o.AlreadySubscribed
	}
	if o.Unauthorized != nil {
		toSerialize["unauthorized"] = o.Unauthorized
	}
	return json.Marshal(toSerialize)
}

type NullableAddSubscriptionsResponseAllOf struct {
	value *AddSubscriptionsResponseAllOf
	isSet bool
}

func (v NullableAddSubscriptionsResponseAllOf) Get() *AddSubscriptionsResponseAllOf {
	return v.value
}

func (v *NullableAddSubscriptionsResponseAllOf) Set(val *AddSubscriptionsResponseAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableAddSubscriptionsResponseAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableAddSubscriptionsResponseAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddSubscriptionsResponseAllOf(val *AddSubscriptionsResponseAllOf) *NullableAddSubscriptionsResponseAllOf {
	return &NullableAddSubscriptionsResponseAllOf{value: val, isSet: true}
}

func (v NullableAddSubscriptionsResponseAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddSubscriptionsResponseAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


