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

// CodedErrorBaseAllOf struct for CodedErrorBaseAllOf
type CodedErrorBaseAllOf struct {
	Result interface{} `json:"result,omitempty"`
	Msg interface{} `json:"msg,omitempty"`
	// A string that identifies the error. 
	Code *string `json:"code,omitempty"`
}

// NewCodedErrorBaseAllOf instantiates a new CodedErrorBaseAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCodedErrorBaseAllOf() *CodedErrorBaseAllOf {
	this := CodedErrorBaseAllOf{}
	return &this
}

// NewCodedErrorBaseAllOfWithDefaults instantiates a new CodedErrorBaseAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCodedErrorBaseAllOfWithDefaults() *CodedErrorBaseAllOf {
	this := CodedErrorBaseAllOf{}
	return &this
}

// GetResult returns the Result field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CodedErrorBaseAllOf) GetResult() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CodedErrorBaseAllOf) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *CodedErrorBaseAllOf) HasResult() bool {
	if o != nil && o.Result != nil {
		return true
	}

	return false
}

// SetResult gets a reference to the given interface{} and assigns it to the Result field.
func (o *CodedErrorBaseAllOf) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CodedErrorBaseAllOf) GetMsg() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CodedErrorBaseAllOf) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// HasMsg returns a boolean if a field has been set.
func (o *CodedErrorBaseAllOf) HasMsg() bool {
	if o != nil && o.Msg != nil {
		return true
	}

	return false
}

// SetMsg gets a reference to the given interface{} and assigns it to the Msg field.
func (o *CodedErrorBaseAllOf) SetMsg(v interface{}) {
	o.Msg = v
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *CodedErrorBaseAllOf) GetCode() string {
	if o == nil || o.Code == nil {
		var ret string
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CodedErrorBaseAllOf) GetCodeOk() (*string, bool) {
	if o == nil || o.Code == nil {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *CodedErrorBaseAllOf) HasCode() bool {
	if o != nil && o.Code != nil {
		return true
	}

	return false
}

// SetCode gets a reference to the given string and assigns it to the Code field.
func (o *CodedErrorBaseAllOf) SetCode(v string) {
	o.Code = &v
}

func (o CodedErrorBaseAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Result != nil {
		toSerialize["result"] = o.Result
	}
	if o.Msg != nil {
		toSerialize["msg"] = o.Msg
	}
	if o.Code != nil {
		toSerialize["code"] = o.Code
	}
	return json.Marshal(toSerialize)
}

type NullableCodedErrorBaseAllOf struct {
	value *CodedErrorBaseAllOf
	isSet bool
}

func (v NullableCodedErrorBaseAllOf) Get() *CodedErrorBaseAllOf {
	return v.value
}

func (v *NullableCodedErrorBaseAllOf) Set(val *CodedErrorBaseAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableCodedErrorBaseAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableCodedErrorBaseAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCodedErrorBaseAllOf(val *CodedErrorBaseAllOf) *NullableCodedErrorBaseAllOf {
	return &NullableCodedErrorBaseAllOf{value: val, isSet: true}
}

func (v NullableCodedErrorBaseAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCodedErrorBaseAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

