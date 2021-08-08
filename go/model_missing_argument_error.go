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

// MissingArgumentError struct for MissingArgumentError
type MissingArgumentError struct {
	Result interface{} `json:"result"`
	Msg interface{} `json:"msg"`
	Code interface{} `json:"code,omitempty"`
	// It contains the information about the missing parameter. 
	VarName *string `json:"var_name,omitempty"`
}

// NewMissingArgumentError instantiates a new MissingArgumentError object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMissingArgumentError(result interface{}, msg interface{}) *MissingArgumentError {
	this := MissingArgumentError{}
	this.Result = result
	this.Msg = msg
	return &this
}

// NewMissingArgumentErrorWithDefaults instantiates a new MissingArgumentError object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMissingArgumentErrorWithDefaults() *MissingArgumentError {
	this := MissingArgumentError{}
	return &this
}

// GetResult returns the Result field value
// If the value is explicit nil, the zero value for interface{} will be returned
func (o *MissingArgumentError) GetResult() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}

	return o.Result
}

// GetResultOk returns a tuple with the Result field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MissingArgumentError) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// SetResult sets field value
func (o *MissingArgumentError) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value
// If the value is explicit nil, the zero value for interface{} will be returned
func (o *MissingArgumentError) GetMsg() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}

	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MissingArgumentError) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// SetMsg sets field value
func (o *MissingArgumentError) SetMsg(v interface{}) {
	o.Msg = v
}

// GetCode returns the Code field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *MissingArgumentError) GetCode() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MissingArgumentError) GetCodeOk() (*interface{}, bool) {
	if o == nil || o.Code == nil {
		return nil, false
	}
	return &o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *MissingArgumentError) HasCode() bool {
	if o != nil && o.Code != nil {
		return true
	}

	return false
}

// SetCode gets a reference to the given interface{} and assigns it to the Code field.
func (o *MissingArgumentError) SetCode(v interface{}) {
	o.Code = v
}

// GetVarName returns the VarName field value if set, zero value otherwise.
func (o *MissingArgumentError) GetVarName() string {
	if o == nil || o.VarName == nil {
		var ret string
		return ret
	}
	return *o.VarName
}

// GetVarNameOk returns a tuple with the VarName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MissingArgumentError) GetVarNameOk() (*string, bool) {
	if o == nil || o.VarName == nil {
		return nil, false
	}
	return o.VarName, true
}

// HasVarName returns a boolean if a field has been set.
func (o *MissingArgumentError) HasVarName() bool {
	if o != nil && o.VarName != nil {
		return true
	}

	return false
}

// SetVarName gets a reference to the given string and assigns it to the VarName field.
func (o *MissingArgumentError) SetVarName(v string) {
	o.VarName = &v
}

func (o MissingArgumentError) MarshalJSON() ([]byte, error) {
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

type NullableMissingArgumentError struct {
	value *MissingArgumentError
	isSet bool
}

func (v NullableMissingArgumentError) Get() *MissingArgumentError {
	return v.value
}

func (v *NullableMissingArgumentError) Set(val *MissingArgumentError) {
	v.value = val
	v.isSet = true
}

func (v NullableMissingArgumentError) IsSet() bool {
	return v.isSet
}

func (v *NullableMissingArgumentError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMissingArgumentError(val *MissingArgumentError) *NullableMissingArgumentError {
	return &NullableMissingArgumentError{value: val, isSet: true}
}

func (v NullableMissingArgumentError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMissingArgumentError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


