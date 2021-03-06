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

// RealmDomain Object containing details of the newly added domain. 
type RealmDomain struct {
	// The new allowed domain. 
	Domain *string `json:"domain,omitempty"`
	// Whether subdomains are allowed for this domain. 
	AllowSubdomains *bool `json:"allow_subdomains,omitempty"`
}

// NewRealmDomain instantiates a new RealmDomain object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRealmDomain() *RealmDomain {
	this := RealmDomain{}
	return &this
}

// NewRealmDomainWithDefaults instantiates a new RealmDomain object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRealmDomainWithDefaults() *RealmDomain {
	this := RealmDomain{}
	return &this
}

// GetDomain returns the Domain field value if set, zero value otherwise.
func (o *RealmDomain) GetDomain() string {
	if o == nil || o.Domain == nil {
		var ret string
		return ret
	}
	return *o.Domain
}

// GetDomainOk returns a tuple with the Domain field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RealmDomain) GetDomainOk() (*string, bool) {
	if o == nil || o.Domain == nil {
		return nil, false
	}
	return o.Domain, true
}

// HasDomain returns a boolean if a field has been set.
func (o *RealmDomain) HasDomain() bool {
	if o != nil && o.Domain != nil {
		return true
	}

	return false
}

// SetDomain gets a reference to the given string and assigns it to the Domain field.
func (o *RealmDomain) SetDomain(v string) {
	o.Domain = &v
}

// GetAllowSubdomains returns the AllowSubdomains field value if set, zero value otherwise.
func (o *RealmDomain) GetAllowSubdomains() bool {
	if o == nil || o.AllowSubdomains == nil {
		var ret bool
		return ret
	}
	return *o.AllowSubdomains
}

// GetAllowSubdomainsOk returns a tuple with the AllowSubdomains field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RealmDomain) GetAllowSubdomainsOk() (*bool, bool) {
	if o == nil || o.AllowSubdomains == nil {
		return nil, false
	}
	return o.AllowSubdomains, true
}

// HasAllowSubdomains returns a boolean if a field has been set.
func (o *RealmDomain) HasAllowSubdomains() bool {
	if o != nil && o.AllowSubdomains != nil {
		return true
	}

	return false
}

// SetAllowSubdomains gets a reference to the given bool and assigns it to the AllowSubdomains field.
func (o *RealmDomain) SetAllowSubdomains(v bool) {
	o.AllowSubdomains = &v
}

func (o RealmDomain) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Domain != nil {
		toSerialize["domain"] = o.Domain
	}
	if o.AllowSubdomains != nil {
		toSerialize["allow_subdomains"] = o.AllowSubdomains
	}
	return json.Marshal(toSerialize)
}

type NullableRealmDomain struct {
	value *RealmDomain
	isSet bool
}

func (v NullableRealmDomain) Get() *RealmDomain {
	return v.value
}

func (v *NullableRealmDomain) Set(val *RealmDomain) {
	v.value = val
	v.isSet = true
}

func (v NullableRealmDomain) IsSet() bool {
	return v.isSet
}

func (v *NullableRealmDomain) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRealmDomain(val *RealmDomain) *NullableRealmDomain {
	return &NullableRealmDomain{value: val, isSet: true}
}

func (v NullableRealmDomain) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRealmDomain) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


