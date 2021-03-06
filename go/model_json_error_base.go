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

// JsonErrorBase struct for JsonErrorBase
type JsonErrorBase struct {
	Result string `json:"result"`
	Msg string `json:"msg"`
}

// NewJsonErrorBase instantiates a new JsonErrorBase object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewJsonErrorBase(result string, msg string) *JsonErrorBase {
	this := JsonErrorBase{}
	this.Result = result
	this.Msg = msg
	return &this
}

// NewJsonErrorBaseWithDefaults instantiates a new JsonErrorBase object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewJsonErrorBaseWithDefaults() *JsonErrorBase {
	this := JsonErrorBase{}
	return &this
}

// GetResult returns the Result field value
func (o *JsonErrorBase) GetResult() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Result
}

// GetResultOk returns a tuple with the Result field value
// and a boolean to check if the value has been set.
func (o *JsonErrorBase) GetResultOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Result, true
}

// SetResult sets field value
func (o *JsonErrorBase) SetResult(v string) {
	o.Result = v
}

// GetMsg returns the Msg field value
func (o *JsonErrorBase) GetMsg() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value
// and a boolean to check if the value has been set.
func (o *JsonErrorBase) GetMsgOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Msg, true
}

// SetMsg sets field value
func (o *JsonErrorBase) SetMsg(v string) {
	o.Msg = v
}

func (o JsonErrorBase) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["result"] = o.Result
	}
	if true {
		toSerialize["msg"] = o.Msg
	}
	return json.Marshal(toSerialize)
}

type NullableJsonErrorBase struct {
	value *JsonErrorBase
	isSet bool
}

func (v NullableJsonErrorBase) Get() *JsonErrorBase {
	return v.value
}

func (v *NullableJsonErrorBase) Set(val *JsonErrorBase) {
	v.value = val
	v.isSet = true
}

func (v NullableJsonErrorBase) IsSet() bool {
	return v.isSet
}

func (v *NullableJsonErrorBase) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJsonErrorBase(val *JsonErrorBase) *NullableJsonErrorBase {
	return &NullableJsonErrorBase{value: val, isSet: true}
}

func (v NullableJsonErrorBase) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJsonErrorBase) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


