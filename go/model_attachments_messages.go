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

// AttachmentsMessages struct for AttachmentsMessages
type AttachmentsMessages struct {
	// Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
	DateSent *int32 `json:"date_sent,omitempty"`
	// The unique message ID.  Messages should always be displayed sorted by ID. 
	Id *int32 `json:"id,omitempty"`
}

// NewAttachmentsMessages instantiates a new AttachmentsMessages object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAttachmentsMessages() *AttachmentsMessages {
	this := AttachmentsMessages{}
	return &this
}

// NewAttachmentsMessagesWithDefaults instantiates a new AttachmentsMessages object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAttachmentsMessagesWithDefaults() *AttachmentsMessages {
	this := AttachmentsMessages{}
	return &this
}

// GetDateSent returns the DateSent field value if set, zero value otherwise.
func (o *AttachmentsMessages) GetDateSent() int32 {
	if o == nil || o.DateSent == nil {
		var ret int32
		return ret
	}
	return *o.DateSent
}

// GetDateSentOk returns a tuple with the DateSent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AttachmentsMessages) GetDateSentOk() (*int32, bool) {
	if o == nil || o.DateSent == nil {
		return nil, false
	}
	return o.DateSent, true
}

// HasDateSent returns a boolean if a field has been set.
func (o *AttachmentsMessages) HasDateSent() bool {
	if o != nil && o.DateSent != nil {
		return true
	}

	return false
}

// SetDateSent gets a reference to the given int32 and assigns it to the DateSent field.
func (o *AttachmentsMessages) SetDateSent(v int32) {
	o.DateSent = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *AttachmentsMessages) GetId() int32 {
	if o == nil || o.Id == nil {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AttachmentsMessages) GetIdOk() (*int32, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *AttachmentsMessages) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *AttachmentsMessages) SetId(v int32) {
	o.Id = &v
}

func (o AttachmentsMessages) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.DateSent != nil {
		toSerialize["date_sent"] = o.DateSent
	}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	return json.Marshal(toSerialize)
}

type NullableAttachmentsMessages struct {
	value *AttachmentsMessages
	isSet bool
}

func (v NullableAttachmentsMessages) Get() *AttachmentsMessages {
	return v.value
}

func (v *NullableAttachmentsMessages) Set(val *AttachmentsMessages) {
	v.value = val
	v.isSet = true
}

func (v NullableAttachmentsMessages) IsSet() bool {
	return v.isSet
}

func (v *NullableAttachmentsMessages) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAttachmentsMessages(val *AttachmentsMessages) *NullableAttachmentsMessages {
	return &NullableAttachmentsMessages{value: val, isSet: true}
}

func (v NullableAttachmentsMessages) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAttachmentsMessages) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


