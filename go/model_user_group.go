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

// UserGroup Object containing the user group's attributes. 
type UserGroup struct {
	// The name of the user group. 
	Name *string `json:"name,omitempty"`
	// The description of the user group. 
	Description *string `json:"description,omitempty"`
	// Array containing the id of the users who are members of this user group. 
	Members *[]int32 `json:"members,omitempty"`
	// The ID of the user group. 
	Id *int32 `json:"id,omitempty"`
}

// NewUserGroup instantiates a new UserGroup object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUserGroup() *UserGroup {
	this := UserGroup{}
	return &this
}

// NewUserGroupWithDefaults instantiates a new UserGroup object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUserGroupWithDefaults() *UserGroup {
	this := UserGroup{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *UserGroup) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserGroup) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *UserGroup) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *UserGroup) SetName(v string) {
	o.Name = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *UserGroup) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserGroup) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *UserGroup) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *UserGroup) SetDescription(v string) {
	o.Description = &v
}

// GetMembers returns the Members field value if set, zero value otherwise.
func (o *UserGroup) GetMembers() []int32 {
	if o == nil || o.Members == nil {
		var ret []int32
		return ret
	}
	return *o.Members
}

// GetMembersOk returns a tuple with the Members field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserGroup) GetMembersOk() (*[]int32, bool) {
	if o == nil || o.Members == nil {
		return nil, false
	}
	return o.Members, true
}

// HasMembers returns a boolean if a field has been set.
func (o *UserGroup) HasMembers() bool {
	if o != nil && o.Members != nil {
		return true
	}

	return false
}

// SetMembers gets a reference to the given []int32 and assigns it to the Members field.
func (o *UserGroup) SetMembers(v []int32) {
	o.Members = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *UserGroup) GetId() int32 {
	if o == nil || o.Id == nil {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserGroup) GetIdOk() (*int32, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *UserGroup) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *UserGroup) SetId(v int32) {
	o.Id = &v
}

func (o UserGroup) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Description != nil {
		toSerialize["description"] = o.Description
	}
	if o.Members != nil {
		toSerialize["members"] = o.Members
	}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	return json.Marshal(toSerialize)
}

type NullableUserGroup struct {
	value *UserGroup
	isSet bool
}

func (v NullableUserGroup) Get() *UserGroup {
	return v.value
}

func (v *NullableUserGroup) Set(val *UserGroup) {
	v.value = val
	v.isSet = true
}

func (v NullableUserGroup) IsSet() bool {
	return v.isSet
}

func (v *NullableUserGroup) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUserGroup(val *UserGroup) *NullableUserGroup {
	return &NullableUserGroup{value: val, isSet: true}
}

func (v NullableUserGroup) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUserGroup) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


