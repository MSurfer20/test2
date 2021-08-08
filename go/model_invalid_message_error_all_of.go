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

// InvalidMessageErrorAllOf struct for InvalidMessageErrorAllOf
type InvalidMessageErrorAllOf struct {
	Result interface{} `json:"result,omitempty"`
	Msg interface{} `json:"msg,omitempty"`
	// The raw content of the message. 
	RawContent *string `json:"raw_content,omitempty"`
}

// NewInvalidMessageErrorAllOf instantiates a new InvalidMessageErrorAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInvalidMessageErrorAllOf() *InvalidMessageErrorAllOf {
	this := InvalidMessageErrorAllOf{}
	return &this
}

// NewInvalidMessageErrorAllOfWithDefaults instantiates a new InvalidMessageErrorAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInvalidMessageErrorAllOfWithDefaults() *InvalidMessageErrorAllOf {
	this := InvalidMessageErrorAllOf{}
	return &this
}

// GetResult returns the Result field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvalidMessageErrorAllOf) GetResult() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvalidMessageErrorAllOf) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *InvalidMessageErrorAllOf) HasResult() bool {
	if o != nil && o.Result != nil {
		return true
	}

	return false
}

// SetResult gets a reference to the given interface{} and assigns it to the Result field.
func (o *InvalidMessageErrorAllOf) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *InvalidMessageErrorAllOf) GetMsg() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *InvalidMessageErrorAllOf) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// HasMsg returns a boolean if a field has been set.
func (o *InvalidMessageErrorAllOf) HasMsg() bool {
	if o != nil && o.Msg != nil {
		return true
	}

	return false
}

// SetMsg gets a reference to the given interface{} and assigns it to the Msg field.
func (o *InvalidMessageErrorAllOf) SetMsg(v interface{}) {
	o.Msg = v
}

// GetRawContent returns the RawContent field value if set, zero value otherwise.
func (o *InvalidMessageErrorAllOf) GetRawContent() string {
	if o == nil || o.RawContent == nil {
		var ret string
		return ret
	}
	return *o.RawContent
}

// GetRawContentOk returns a tuple with the RawContent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InvalidMessageErrorAllOf) GetRawContentOk() (*string, bool) {
	if o == nil || o.RawContent == nil {
		return nil, false
	}
	return o.RawContent, true
}

// HasRawContent returns a boolean if a field has been set.
func (o *InvalidMessageErrorAllOf) HasRawContent() bool {
	if o != nil && o.RawContent != nil {
		return true
	}

	return false
}

// SetRawContent gets a reference to the given string and assigns it to the RawContent field.
func (o *InvalidMessageErrorAllOf) SetRawContent(v string) {
	o.RawContent = &v
}

func (o InvalidMessageErrorAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Result != nil {
		toSerialize["result"] = o.Result
	}
	if o.Msg != nil {
		toSerialize["msg"] = o.Msg
	}
	if o.RawContent != nil {
		toSerialize["raw_content"] = o.RawContent
	}
	return json.Marshal(toSerialize)
}

type NullableInvalidMessageErrorAllOf struct {
	value *InvalidMessageErrorAllOf
	isSet bool
}

func (v NullableInvalidMessageErrorAllOf) Get() *InvalidMessageErrorAllOf {
	return v.value
}

func (v *NullableInvalidMessageErrorAllOf) Set(val *InvalidMessageErrorAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableInvalidMessageErrorAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableInvalidMessageErrorAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInvalidMessageErrorAllOf(val *InvalidMessageErrorAllOf) *NullableInvalidMessageErrorAllOf {
	return &NullableInvalidMessageErrorAllOf{value: val, isSet: true}
}

func (v NullableInvalidMessageErrorAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInvalidMessageErrorAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


