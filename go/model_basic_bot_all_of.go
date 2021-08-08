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

// BasicBotAllOf struct for BasicBotAllOf
type BasicBotAllOf struct {
	UserId interface{} `json:"user_id,omitempty"`
	FullName interface{} `json:"full_name,omitempty"`
	ApiKey interface{} `json:"api_key,omitempty"`
	DefaultSendingStream interface{} `json:"default_sending_stream,omitempty"`
	DefaultEventsRegisterStream interface{} `json:"default_events_register_stream,omitempty"`
	DefaultAllPublicStreams interface{} `json:"default_all_public_streams,omitempty"`
	AvatarUrl interface{} `json:"avatar_url,omitempty"`
	OwnerId interface{} `json:"owner_id,omitempty"`
	Services interface{} `json:"services,omitempty"`
}

// NewBasicBotAllOf instantiates a new BasicBotAllOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBasicBotAllOf() *BasicBotAllOf {
	this := BasicBotAllOf{}
	return &this
}

// NewBasicBotAllOfWithDefaults instantiates a new BasicBotAllOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBasicBotAllOfWithDefaults() *BasicBotAllOf {
	this := BasicBotAllOf{}
	return &this
}

// GetUserId returns the UserId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetUserId() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetUserIdOk() (*interface{}, bool) {
	if o == nil || o.UserId == nil {
		return nil, false
	}
	return &o.UserId, true
}

// HasUserId returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasUserId() bool {
	if o != nil && o.UserId != nil {
		return true
	}

	return false
}

// SetUserId gets a reference to the given interface{} and assigns it to the UserId field.
func (o *BasicBotAllOf) SetUserId(v interface{}) {
	o.UserId = v
}

// GetFullName returns the FullName field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetFullName() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.FullName
}

// GetFullNameOk returns a tuple with the FullName field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetFullNameOk() (*interface{}, bool) {
	if o == nil || o.FullName == nil {
		return nil, false
	}
	return &o.FullName, true
}

// HasFullName returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasFullName() bool {
	if o != nil && o.FullName != nil {
		return true
	}

	return false
}

// SetFullName gets a reference to the given interface{} and assigns it to the FullName field.
func (o *BasicBotAllOf) SetFullName(v interface{}) {
	o.FullName = v
}

// GetApiKey returns the ApiKey field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetApiKey() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.ApiKey
}

// GetApiKeyOk returns a tuple with the ApiKey field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetApiKeyOk() (*interface{}, bool) {
	if o == nil || o.ApiKey == nil {
		return nil, false
	}
	return &o.ApiKey, true
}

// HasApiKey returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasApiKey() bool {
	if o != nil && o.ApiKey != nil {
		return true
	}

	return false
}

// SetApiKey gets a reference to the given interface{} and assigns it to the ApiKey field.
func (o *BasicBotAllOf) SetApiKey(v interface{}) {
	o.ApiKey = v
}

// GetDefaultSendingStream returns the DefaultSendingStream field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetDefaultSendingStream() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.DefaultSendingStream
}

// GetDefaultSendingStreamOk returns a tuple with the DefaultSendingStream field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetDefaultSendingStreamOk() (*interface{}, bool) {
	if o == nil || o.DefaultSendingStream == nil {
		return nil, false
	}
	return &o.DefaultSendingStream, true
}

// HasDefaultSendingStream returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasDefaultSendingStream() bool {
	if o != nil && o.DefaultSendingStream != nil {
		return true
	}

	return false
}

// SetDefaultSendingStream gets a reference to the given interface{} and assigns it to the DefaultSendingStream field.
func (o *BasicBotAllOf) SetDefaultSendingStream(v interface{}) {
	o.DefaultSendingStream = v
}

// GetDefaultEventsRegisterStream returns the DefaultEventsRegisterStream field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetDefaultEventsRegisterStream() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.DefaultEventsRegisterStream
}

// GetDefaultEventsRegisterStreamOk returns a tuple with the DefaultEventsRegisterStream field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetDefaultEventsRegisterStreamOk() (*interface{}, bool) {
	if o == nil || o.DefaultEventsRegisterStream == nil {
		return nil, false
	}
	return &o.DefaultEventsRegisterStream, true
}

// HasDefaultEventsRegisterStream returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasDefaultEventsRegisterStream() bool {
	if o != nil && o.DefaultEventsRegisterStream != nil {
		return true
	}

	return false
}

// SetDefaultEventsRegisterStream gets a reference to the given interface{} and assigns it to the DefaultEventsRegisterStream field.
func (o *BasicBotAllOf) SetDefaultEventsRegisterStream(v interface{}) {
	o.DefaultEventsRegisterStream = v
}

// GetDefaultAllPublicStreams returns the DefaultAllPublicStreams field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetDefaultAllPublicStreams() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.DefaultAllPublicStreams
}

// GetDefaultAllPublicStreamsOk returns a tuple with the DefaultAllPublicStreams field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetDefaultAllPublicStreamsOk() (*interface{}, bool) {
	if o == nil || o.DefaultAllPublicStreams == nil {
		return nil, false
	}
	return &o.DefaultAllPublicStreams, true
}

// HasDefaultAllPublicStreams returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasDefaultAllPublicStreams() bool {
	if o != nil && o.DefaultAllPublicStreams != nil {
		return true
	}

	return false
}

// SetDefaultAllPublicStreams gets a reference to the given interface{} and assigns it to the DefaultAllPublicStreams field.
func (o *BasicBotAllOf) SetDefaultAllPublicStreams(v interface{}) {
	o.DefaultAllPublicStreams = v
}

// GetAvatarUrl returns the AvatarUrl field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetAvatarUrl() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.AvatarUrl
}

// GetAvatarUrlOk returns a tuple with the AvatarUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetAvatarUrlOk() (*interface{}, bool) {
	if o == nil || o.AvatarUrl == nil {
		return nil, false
	}
	return &o.AvatarUrl, true
}

// HasAvatarUrl returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasAvatarUrl() bool {
	if o != nil && o.AvatarUrl != nil {
		return true
	}

	return false
}

// SetAvatarUrl gets a reference to the given interface{} and assigns it to the AvatarUrl field.
func (o *BasicBotAllOf) SetAvatarUrl(v interface{}) {
	o.AvatarUrl = v
}

// GetOwnerId returns the OwnerId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetOwnerId() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.OwnerId
}

// GetOwnerIdOk returns a tuple with the OwnerId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetOwnerIdOk() (*interface{}, bool) {
	if o == nil || o.OwnerId == nil {
		return nil, false
	}
	return &o.OwnerId, true
}

// HasOwnerId returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasOwnerId() bool {
	if o != nil && o.OwnerId != nil {
		return true
	}

	return false
}

// SetOwnerId gets a reference to the given interface{} and assigns it to the OwnerId field.
func (o *BasicBotAllOf) SetOwnerId(v interface{}) {
	o.OwnerId = v
}

// GetServices returns the Services field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotAllOf) GetServices() interface{} {
	if o == nil  {
		var ret interface{}
		return ret
	}
	return o.Services
}

// GetServicesOk returns a tuple with the Services field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotAllOf) GetServicesOk() (*interface{}, bool) {
	if o == nil || o.Services == nil {
		return nil, false
	}
	return &o.Services, true
}

// HasServices returns a boolean if a field has been set.
func (o *BasicBotAllOf) HasServices() bool {
	if o != nil && o.Services != nil {
		return true
	}

	return false
}

// SetServices gets a reference to the given interface{} and assigns it to the Services field.
func (o *BasicBotAllOf) SetServices(v interface{}) {
	o.Services = v
}

func (o BasicBotAllOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.UserId != nil {
		toSerialize["user_id"] = o.UserId
	}
	if o.FullName != nil {
		toSerialize["full_name"] = o.FullName
	}
	if o.ApiKey != nil {
		toSerialize["api_key"] = o.ApiKey
	}
	if o.DefaultSendingStream != nil {
		toSerialize["default_sending_stream"] = o.DefaultSendingStream
	}
	if o.DefaultEventsRegisterStream != nil {
		toSerialize["default_events_register_stream"] = o.DefaultEventsRegisterStream
	}
	if o.DefaultAllPublicStreams != nil {
		toSerialize["default_all_public_streams"] = o.DefaultAllPublicStreams
	}
	if o.AvatarUrl != nil {
		toSerialize["avatar_url"] = o.AvatarUrl
	}
	if o.OwnerId != nil {
		toSerialize["owner_id"] = o.OwnerId
	}
	if o.Services != nil {
		toSerialize["services"] = o.Services
	}
	return json.Marshal(toSerialize)
}

type NullableBasicBotAllOf struct {
	value *BasicBotAllOf
	isSet bool
}

func (v NullableBasicBotAllOf) Get() *BasicBotAllOf {
	return v.value
}

func (v *NullableBasicBotAllOf) Set(val *BasicBotAllOf) {
	v.value = val
	v.isSet = true
}

func (v NullableBasicBotAllOf) IsSet() bool {
	return v.isSet
}

func (v *NullableBasicBotAllOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBasicBotAllOf(val *BasicBotAllOf) *NullableBasicBotAllOf {
	return &NullableBasicBotAllOf{value: val, isSet: true}
}

func (v NullableBasicBotAllOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBasicBotAllOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


