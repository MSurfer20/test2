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

// RealmPlayground Object containing details about a realm playground. 
type RealmPlayground struct {
	// The unique ID for the realm playground. 
	Id *int32 `json:"id,omitempty"`
	// The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
	Name *string `json:"name,omitempty"`
	// The name of the Pygments language lexer for that programming language. 
	PygmentsLanguage *string `json:"pygments_language,omitempty"`
	// The url prefix for the playground. 
	UrlPrefix *string `json:"url_prefix,omitempty"`
}

// NewRealmPlayground instantiates a new RealmPlayground object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRealmPlayground() *RealmPlayground {
	this := RealmPlayground{}
	return &this
}

// NewRealmPlaygroundWithDefaults instantiates a new RealmPlayground object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRealmPlaygroundWithDefaults() *RealmPlayground {
	this := RealmPlayground{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *RealmPlayground) GetId() int32 {
	if o == nil || o.Id == nil {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RealmPlayground) GetIdOk() (*int32, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *RealmPlayground) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *RealmPlayground) SetId(v int32) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *RealmPlayground) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RealmPlayground) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *RealmPlayground) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *RealmPlayground) SetName(v string) {
	o.Name = &v
}

// GetPygmentsLanguage returns the PygmentsLanguage field value if set, zero value otherwise.
func (o *RealmPlayground) GetPygmentsLanguage() string {
	if o == nil || o.PygmentsLanguage == nil {
		var ret string
		return ret
	}
	return *o.PygmentsLanguage
}

// GetPygmentsLanguageOk returns a tuple with the PygmentsLanguage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RealmPlayground) GetPygmentsLanguageOk() (*string, bool) {
	if o == nil || o.PygmentsLanguage == nil {
		return nil, false
	}
	return o.PygmentsLanguage, true
}

// HasPygmentsLanguage returns a boolean if a field has been set.
func (o *RealmPlayground) HasPygmentsLanguage() bool {
	if o != nil && o.PygmentsLanguage != nil {
		return true
	}

	return false
}

// SetPygmentsLanguage gets a reference to the given string and assigns it to the PygmentsLanguage field.
func (o *RealmPlayground) SetPygmentsLanguage(v string) {
	o.PygmentsLanguage = &v
}

// GetUrlPrefix returns the UrlPrefix field value if set, zero value otherwise.
func (o *RealmPlayground) GetUrlPrefix() string {
	if o == nil || o.UrlPrefix == nil {
		var ret string
		return ret
	}
	return *o.UrlPrefix
}

// GetUrlPrefixOk returns a tuple with the UrlPrefix field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RealmPlayground) GetUrlPrefixOk() (*string, bool) {
	if o == nil || o.UrlPrefix == nil {
		return nil, false
	}
	return o.UrlPrefix, true
}

// HasUrlPrefix returns a boolean if a field has been set.
func (o *RealmPlayground) HasUrlPrefix() bool {
	if o != nil && o.UrlPrefix != nil {
		return true
	}

	return false
}

// SetUrlPrefix gets a reference to the given string and assigns it to the UrlPrefix field.
func (o *RealmPlayground) SetUrlPrefix(v string) {
	o.UrlPrefix = &v
}

func (o RealmPlayground) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.PygmentsLanguage != nil {
		toSerialize["pygments_language"] = o.PygmentsLanguage
	}
	if o.UrlPrefix != nil {
		toSerialize["url_prefix"] = o.UrlPrefix
	}
	return json.Marshal(toSerialize)
}

type NullableRealmPlayground struct {
	value *RealmPlayground
	isSet bool
}

func (v NullableRealmPlayground) Get() *RealmPlayground {
	return v.value
}

func (v *NullableRealmPlayground) Set(val *RealmPlayground) {
	v.value = val
	v.isSet = true
}

func (v NullableRealmPlayground) IsSet() bool {
	return v.isSet
}

func (v *NullableRealmPlayground) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRealmPlayground(val *RealmPlayground) *NullableRealmPlayground {
	return &NullableRealmPlayground{value: val, isSet: true}
}

func (v NullableRealmPlayground) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRealmPlayground) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


