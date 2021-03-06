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

// BadEventQueueIdErrorAllOf struct for BadEventQueueIdErrorAllOf
type BadEventQueueIdErrorAllOf struct {
	Result interface{} `json:"result,omitempty"`
	Msg interface{} `json:"msg,omitempty"`
	Code interface{} `json:"code,omitempty"`
	// The string that identifies the invalid event queue. 
	QueueId *string `json:"queue_id,omitempty"`
}

// NewBadEventQueueIdErrorAllOf instantiates a new BadEventQueueIdErrorAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBadEventQueueIdErrorAllOf() *BadEventQueueIdErrorAllOf {
	this := BadEventQueueIdErrorAllOf{}
	return &this
}

// NewBadEventQueueIdErrorAllOfWithDefaults instantiates a new BadEventQueueIdErrorAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBadEventQueueIdErrorAllOfWithDefaults() *BadEventQueueIdErrorAllOf {
	this := BadEventQueueIdErrorAllOf{}
	return &this
}

// GetResult returns the Result field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BadEventQueueIdErrorAllOf) GetResult() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Result
}

// GetResultOk returns a tuple with the Result field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BadEventQueueIdErrorAllOf) GetResultOk() (*interface{}, bool) {
	if o == nil || o.Result == nil {
		return nil, false
	}
	return &o.Result, true
}

// HasResult returns a boolean if a field has been set.
func (o *BadEventQueueIdErrorAllOf) HasResult() bool {
	if o != nil && o.Result != nil {
		return true
	}

	return false
}

// SetResult gets a reference to the given interface{} and assigns it to the Result field.
func (o *BadEventQueueIdErrorAllOf) SetResult(v interface{}) {
	o.Result = v
}

// GetMsg returns the Msg field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BadEventQueueIdErrorAllOf) GetMsg() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Msg
}

// GetMsgOk returns a tuple with the Msg field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BadEventQueueIdErrorAllOf) GetMsgOk() (*interface{}, bool) {
	if o == nil || o.Msg == nil {
		return nil, false
	}
	return &o.Msg, true
}

// HasMsg returns a boolean if a field has been set.
func (o *BadEventQueueIdErrorAllOf) HasMsg() bool {
	if o != nil && o.Msg != nil {
		return true
	}

	return false
}

// SetMsg gets a reference to the given interface{} and assigns it to the Msg field.
func (o *BadEventQueueIdErrorAllOf) SetMsg(v interface{}) {
	o.Msg = v
}

// GetCode returns the Code field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BadEventQueueIdErrorAllOf) GetCode() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BadEventQueueIdErrorAllOf) GetCodeOk() (*interface{}, bool) {
	if o == nil || o.Code == nil {
		return nil, false
	}
	return &o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *BadEventQueueIdErrorAllOf) HasCode() bool {
	if o != nil && o.Code != nil {
		return true
	}

	return false
}

// SetCode gets a reference to the given interface{} and assigns it to the Code field.
func (o *BadEventQueueIdErrorAllOf) SetCode(v interface{}) {
	o.Code = v
}

// GetQueueId returns the QueueId field value if set, zero value otherwise.
func (o *BadEventQueueIdErrorAllOf) GetQueueId() string {
	if o == nil || o.QueueId == nil {
		var ret string
		return ret
	}
	return *o.QueueId
}

// GetQueueIdOk returns a tuple with the QueueId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BadEventQueueIdErrorAllOf) GetQueueIdOk() (*string, bool) {
	if o == nil || o.QueueId == nil {
		return nil, false
	}
	return o.QueueId, true
}

// HasQueueId returns a boolean if a field has been set.
func (o *BadEventQueueIdErrorAllOf) HasQueueId() bool {
	if o != nil && o.QueueId != nil {
		return true
	}

	return false
}

// SetQueueId gets a reference to the given string and assigns it to the QueueId field.
func (o *BadEventQueueIdErrorAllOf) SetQueueId(v string) {
	o.QueueId = &v
}

func (o BadEventQueueIdErrorAllOf) MarshalJSON() ([]byte, error) {
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
	if o.QueueId != nil {
		toSerialize["queue_id"] = o.QueueId
	}
	return json.Marshal(toSerialize)
}

type NullableBadEventQueueIdErrorAllOf struct {
	value *BadEventQueueIdErrorAllOf
	isSet bool
}

func (v NullableBadEventQueueIdErrorAllOf) Get() *BadEventQueueIdErrorAllOf {
	return v.value
}

func (v *NullableBadEventQueueIdErrorAllOf) Set(val *BadEventQueueIdErrorAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableBadEventQueueIdErrorAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableBadEventQueueIdErrorAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBadEventQueueIdErrorAllOf(val *BadEventQueueIdErrorAllOf) *NullableBadEventQueueIdErrorAllOf {
	return &NullableBadEventQueueIdErrorAllOf{value: val, isSet: true}
}

func (v NullableBadEventQueueIdErrorAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBadEventQueueIdErrorAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


