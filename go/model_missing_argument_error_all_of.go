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

// MissingArgumentErrorAllOf ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
type MissingArgumentErrorAllOf struct {
	Result interface{} `json:"result,omitempty"`
	Msg interface{} `json:"msg,omitempty"`
	Code interface{} `json:"code,omitempty"`
	// It contains the information about the missing parameter. 
	VarName *string `json:"var_name,omitempty"`
}

// NewMissingArgumentErrorAllOf instantiates a new MissingArgumentErrorAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMissingArgumentErrorAllOf() *MissingArgumentErrorAllOf {
	this := MissingArgumentErrorAllOf{}
	return &this
}

// NewMissingArgumentErrorAllOfWithDefaults instantiates a new MissingArgumentErrorAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMissingArgumentErrorAllOfWithDefaults() *MissingArgumentErrorAllOf {
	this := MissingArgumentErrorAllOf{}
	return &this
}

// GetResult returns the Result field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *MissingArgumentErrorAllOf) GetResult() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MissingArgumentErrorAllOf) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *MissingArgumentErrorAllOf) HasResult() bool {
	if o != nil && o.Result != nil {
		return true
	}

	return false
}

// SetResult gets a reference to the given interface{} and assigns it to the Result field.
func (o *MissingArgumentErrorAllOf) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *MissingArgumentErrorAllOf) GetMsg() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MissingArgumentErrorAllOf) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// HasMsg returns a boolean if a field has been set.
func (o *MissingArgumentErrorAllOf) HasMsg() bool {
	if o != nil && o.Msg != nil {
		return true
	}

	return false
}

// SetMsg gets a reference to the given interface{} and assigns it to the Msg field.
func (o *MissingArgumentErrorAllOf) SetMsg(v interface{}) {
	o.Msg = v
}

// GetCode returns the Code field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *MissingArgumentErrorAllOf) GetCode() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MissingArgumentErrorAllOf) GetCodeOk() (*interface{}, bool) {
	if o == nil || o.Code == nil {
		return nil, false
	}
	return &o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *MissingArgumentErrorAllOf) HasCode() bool {
	if o != nil && o.Code != nil {
		return true
	}

	return false
}

// SetCode gets a reference to the given interface{} and assigns it to the Code field.
func (o *MissingArgumentErrorAllOf) SetCode(v interface{}) {
	o.Code = v
}

// GetVarName returns the VarName field value if set, zero value otherwise.
func (o *MissingArgumentErrorAllOf) GetVarName() string {
	if o == nil || o.VarName == nil {
		var ret string
		return ret
	}
	return *o.VarName
}

// GetVarNameOk returns a tuple with the VarName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MissingArgumentErrorAllOf) GetVarNameOk() (*string, bool) {
	if o == nil || o.VarName == nil {
		return nil, false
	}
	return o.VarName, true
}

// HasVarName returns a boolean if a field has been set.
func (o *MissingArgumentErrorAllOf) HasVarName() bool {
	if o != nil && o.VarName != nil {
		return true
	}

	return false
}

// SetVarName gets a reference to the given string and assigns it to the VarName field.
func (o *MissingArgumentErrorAllOf) SetVarName(v string) {
	o.VarName = &v
}

func (o MissingArgumentErrorAllOf) MarshalJSON() ([]byte, error) {
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
	if o.VarName != nil {
		toSerialize["var_name"] = o.VarName
	}
	return json.Marshal(toSerialize)
}

type NullableMissingArgumentErrorAllOf struct {
	value *MissingArgumentErrorAllOf
	isSet bool
}

func (v NullableMissingArgumentErrorAllOf) Get() *MissingArgumentErrorAllOf {
	return v.value
}

func (v *NullableMissingArgumentErrorAllOf) Set(val *MissingArgumentErrorAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableMissingArgumentErrorAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableMissingArgumentErrorAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMissingArgumentErrorAllOf(val *MissingArgumentErrorAllOf) *NullableMissingArgumentErrorAllOf {
	return &NullableMissingArgumentErrorAllOf{value: val, isSet: true}
}

func (v NullableMissingArgumentErrorAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMissingArgumentErrorAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


