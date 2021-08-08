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

// JsonSuccessAllOf struct for JsonSuccessAllOf
type JsonSuccessAllOf struct {
	Result interface{} `json:"result,omitempty"`
	Msg interface{} `json:"msg,omitempty"`
}

// NewJsonSuccessAllOf instantiates a new JsonSuccessAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJsonSuccessAllOf() *JsonSuccessAllOf {
	this := JsonSuccessAllOf{}
	return &this
}

// NewJsonSuccessAllOfWithDefaults instantiates a new JsonSuccessAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJsonSuccessAllOfWithDefaults() *JsonSuccessAllOf {
	this := JsonSuccessAllOf{}
	return &this
}

// GetResult returns the Result field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *JsonSuccessAllOf) GetResult() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *JsonSuccessAllOf) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *JsonSuccessAllOf) HasResult() bool {
	if o != nil && o.Result != nil {
		return true
	}

	return false
}

// SetResult gets a reference to the given interface{} and assigns it to the Result field.
func (o *JsonSuccessAllOf) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *JsonSuccessAllOf) GetMsg() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *JsonSuccessAllOf) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// HasMsg returns a boolean if a field has been set.
func (o *JsonSuccessAllOf) HasMsg() bool {
	if o != nil && o.Msg != nil {
		return true
	}

	return false
}

// SetMsg gets a reference to the given interface{} and assigns it to the Msg field.
func (o *JsonSuccessAllOf) SetMsg(v interface{}) {
	o.Msg = v
}

func (o JsonSuccessAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Result != nil {
		toSerialize["result"] = o.Result
	}
	if o.Msg != nil {
		toSerialize["msg"] = o.Msg
	}
	return json.Marshal(toSerialize)
}

type NullableJsonSuccessAllOf struct {
	value *JsonSuccessAllOf
	isSet bool
}

func (v NullableJsonSuccessAllOf) Get() *JsonSuccessAllOf {
	return v.value
}

func (v *NullableJsonSuccessAllOf) Set(val *JsonSuccessAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableJsonSuccessAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableJsonSuccessAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJsonSuccessAllOf(val *JsonSuccessAllOf) *NullableJsonSuccessAllOf {
	return &NullableJsonSuccessAllOf{value: val, isSet: true}
}

func (v NullableJsonSuccessAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJsonSuccessAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


