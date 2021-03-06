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

// BasicBotBase struct for BasicBotBase
type BasicBotBase struct {
	// The user id of the bot. 
	UserId *int32 `json:"user_id,omitempty"`
	// The full name of the bot. 
	FullName *string `json:"full_name,omitempty"`
	// The API key of the bot which it uses to make API requests. 
	ApiKey *string `json:"api_key,omitempty"`
	// The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
	DefaultSendingStream NullableString `json:"default_sending_stream,omitempty"`
	// The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
	DefaultEventsRegisterStream NullableString `json:"default_events_register_stream,omitempty"`
	// Whether the bot can send messages to all streams by default. 
	DefaultAllPublicStreams *bool `json:"default_all_public_streams,omitempty"`
	// The URL of the bot's avatar. 
	AvatarUrl *string `json:"avatar_url,omitempty"`
	// The user id of the bot's owner.  Null if the bot has no owner. 
	OwnerId NullableInt32 `json:"owner_id,omitempty"`
	// The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
	Services *[]OneOfobjectobject `json:"services,omitempty"`
}

// NewBasicBotBase instantiates a new BasicBotBase object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBasicBotBase() *BasicBotBase {
	this := BasicBotBase{}
	return &this
}

// NewBasicBotBaseWithDefaults instantiates a new BasicBotBase object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBasicBotBaseWithDefaults() *BasicBotBase {
	this := BasicBotBase{}
	return &this
}

// GetUserId returns the UserId field value if set, zero value otherwise.
func (o *BasicBotBase) GetUserId() int32 {
	if o == nil || o.UserId == nil {
		var ret int32
		return ret
	}
	return *o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BasicBotBase) GetUserIdOk() (*int32, bool) {
	if o == nil || o.UserId == nil {
		return nil, false
	}
	return o.UserId, true
}

// HasUserId returns a boolean if a field has been set.
func (o *BasicBotBase) HasUserId() bool {
	if o != nil && o.UserId != nil {
		return true
	}

	return false
}

// SetUserId gets a reference to the given int32 and assigns it to the UserId field.
func (o *BasicBotBase) SetUserId(v int32) {
	o.UserId = &v
}

// GetFullName returns the FullName field value if set, zero value otherwise.
func (o *BasicBotBase) GetFullName() string {
	if o == nil || o.FullName == nil {
		var ret string
		return ret
	}
	return *o.FullName
}

// GetFullNameOk returns a tuple with the FullName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BasicBotBase) GetFullNameOk() (*string, bool) {
	if o == nil || o.FullName == nil {
		return nil, false
	}
	return o.FullName, true
}

// HasFullName returns a boolean if a field has been set.
func (o *BasicBotBase) HasFullName() bool {
	if o != nil && o.FullName != nil {
		return true
	}

	return false
}

// SetFullName gets a reference to the given string and assigns it to the FullName field.
func (o *BasicBotBase) SetFullName(v string) {
	o.FullName = &v
}

// GetApiKey returns the ApiKey field value if set, zero value otherwise.
func (o *BasicBotBase) GetApiKey() string {
	if o == nil || o.ApiKey == nil {
		var ret string
		return ret
	}
	return *o.ApiKey
}

// GetApiKeyOk returns a tuple with the ApiKey field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BasicBotBase) GetApiKeyOk() (*string, bool) {
	if o == nil || o.ApiKey == nil {
		return nil, false
	}
	return o.ApiKey, true
}

// HasApiKey returns a boolean if a field has been set.
func (o *BasicBotBase) HasApiKey() bool {
	if o != nil && o.ApiKey != nil {
		return true
	}

	return false
}

// SetApiKey gets a reference to the given string and assigns it to the ApiKey field.
func (o *BasicBotBase) SetApiKey(v string) {
	o.ApiKey = &v
}

// GetDefaultSendingStream returns the DefaultSendingStream field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotBase) GetDefaultSendingStream() string {
	if o == nil || o.DefaultSendingStream.Get() == nil {
		var ret string
		return ret
	}
	return *o.DefaultSendingStream.Get()
}

// GetDefaultSendingStreamOk returns a tuple with the DefaultSendingStream field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotBase) GetDefaultSendingStreamOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.DefaultSendingStream.Get(), o.DefaultSendingStream.IsSet()
}

// HasDefaultSendingStream returns a boolean if a field has been set.
func (o *BasicBotBase) HasDefaultSendingStream() bool {
	if o != nil && o.DefaultSendingStream.IsSet() {
		return true
	}

	return false
}

// SetDefaultSendingStream gets a reference to the given NullableString and assigns it to the DefaultSendingStream field.
func (o *BasicBotBase) SetDefaultSendingStream(v string) {
	o.DefaultSendingStream.Set(&v)
}
// SetDefaultSendingStreamNil sets the value for DefaultSendingStream to be an explicit nil
func (o *BasicBotBase) SetDefaultSendingStreamNil() {
	o.DefaultSendingStream.Set(nil)
}

// UnsetDefaultSendingStream ensures that no value is present for DefaultSendingStream, not even an explicit nil
func (o *BasicBotBase) UnsetDefaultSendingStream() {
	o.DefaultSendingStream.Unset()
}

// GetDefaultEventsRegisterStream returns the DefaultEventsRegisterStream field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotBase) GetDefaultEventsRegisterStream() string {
	if o == nil || o.DefaultEventsRegisterStream.Get() == nil {
		var ret string
		return ret
	}
	return *o.DefaultEventsRegisterStream.Get()
}

// GetDefaultEventsRegisterStreamOk returns a tuple with the DefaultEventsRegisterStream field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotBase) GetDefaultEventsRegisterStreamOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.DefaultEventsRegisterStream.Get(), o.DefaultEventsRegisterStream.IsSet()
}

// HasDefaultEventsRegisterStream returns a boolean if a field has been set.
func (o *BasicBotBase) HasDefaultEventsRegisterStream() bool {
	if o != nil && o.DefaultEventsRegisterStream.IsSet() {
		return true
	}

	return false
}

// SetDefaultEventsRegisterStream gets a reference to the given NullableString and assigns it to the DefaultEventsRegisterStream field.
func (o *BasicBotBase) SetDefaultEventsRegisterStream(v string) {
	o.DefaultEventsRegisterStream.Set(&v)
}
// SetDefaultEventsRegisterStreamNil sets the value for DefaultEventsRegisterStream to be an explicit nil
func (o *BasicBotBase) SetDefaultEventsRegisterStreamNil() {
	o.DefaultEventsRegisterStream.Set(nil)
}

// UnsetDefaultEventsRegisterStream ensures that no value is present for DefaultEventsRegisterStream, not even an explicit nil
func (o *BasicBotBase) UnsetDefaultEventsRegisterStream() {
	o.DefaultEventsRegisterStream.Unset()
}

// GetDefaultAllPublicStreams returns the DefaultAllPublicStreams field value if set, zero value otherwise.
func (o *BasicBotBase) GetDefaultAllPublicStreams() bool {
	if o == nil || o.DefaultAllPublicStreams == nil {
		var ret bool
		return ret
	}
	return *o.DefaultAllPublicStreams
}

// GetDefaultAllPublicStreamsOk returns a tuple with the DefaultAllPublicStreams field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BasicBotBase) GetDefaultAllPublicStreamsOk() (*bool, bool) {
	if o == nil || o.DefaultAllPublicStreams == nil {
		return nil, false
	}
	return o.DefaultAllPublicStreams, true
}

// HasDefaultAllPublicStreams returns a boolean if a field has been set.
func (o *BasicBotBase) HasDefaultAllPublicStreams() bool {
	if o != nil && o.DefaultAllPublicStreams != nil {
		return true
	}

	return false
}

// SetDefaultAllPublicStreams gets a reference to the given bool and assigns it to the DefaultAllPublicStreams field.
func (o *BasicBotBase) SetDefaultAllPublicStreams(v bool) {
	o.DefaultAllPublicStreams = &v
}

// GetAvatarUrl returns the AvatarUrl field value if set, zero value otherwise.
func (o *BasicBotBase) GetAvatarUrl() string {
	if o == nil || o.AvatarUrl == nil {
		var ret string
		return ret
	}
	return *o.AvatarUrl
}

// GetAvatarUrlOk returns a tuple with the AvatarUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BasicBotBase) GetAvatarUrlOk() (*string, bool) {
	if o == nil || o.AvatarUrl == nil {
		return nil, false
	}
	return o.AvatarUrl, true
}

// HasAvatarUrl returns a boolean if a field has been set.
func (o *BasicBotBase) HasAvatarUrl() bool {
	if o != nil && o.AvatarUrl != nil {
		return true
	}

	return false
}

// SetAvatarUrl gets a reference to the given string and assigns it to the AvatarUrl field.
func (o *BasicBotBase) SetAvatarUrl(v string) {
	o.AvatarUrl = &v
}

// GetOwnerId returns the OwnerId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BasicBotBase) GetOwnerId() int32 {
	if o == nil || o.OwnerId.Get() == nil {
		var ret int32
		return ret
	}
	return *o.OwnerId.Get()
}

// GetOwnerIdOk returns a tuple with the OwnerId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BasicBotBase) GetOwnerIdOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.OwnerId.Get(), o.OwnerId.IsSet()
}

// HasOwnerId returns a boolean if a field has been set.
func (o *BasicBotBase) HasOwnerId() bool {
	if o != nil && o.OwnerId.IsSet() {
		return true
	}

	return false
}

// SetOwnerId gets a reference to the given NullableInt32 and assigns it to the OwnerId field.
func (o *BasicBotBase) SetOwnerId(v int32) {
	o.OwnerId.Set(&v)
}
// SetOwnerIdNil sets the value for OwnerId to be an explicit nil
func (o *BasicBotBase) SetOwnerIdNil() {
	o.OwnerId.Set(nil)
}

// UnsetOwnerId ensures that no value is present for OwnerId, not even an explicit nil
func (o *BasicBotBase) UnsetOwnerId() {
	o.OwnerId.Unset()
}

// GetServices returns the Services field value if set, zero value otherwise.
func (o *BasicBotBase) GetServices() []OneOfobjectobject {
	if o == nil || o.Services == nil {
		var ret []OneOfobjectobject
		return ret
	}
	return *o.Services
}

// GetServicesOk returns a tuple with the Services field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BasicBotBase) GetServicesOk() (*[]OneOfobjectobject, bool) {
	if o == nil || o.Services == nil {
		return nil, false
	}
	return o.Services, true
}

// HasServices returns a boolean if a field has been set.
func (o *BasicBotBase) HasServices() bool {
	if o != nil && o.Services != nil {
		return true
	}

	return false
}

// SetServices gets a reference to the given []OneOfobjectobject and assigns it to the Services field.
func (o *BasicBotBase) SetServices(v []OneOfobjectobject) {
	o.Services = &v
}

func (o BasicBotBase) MarshalJSON() ([]byte, error) {
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
	if o.DefaultSendingStream.IsSet() {
		toSerialize["default_sending_stream"] = o.DefaultSendingStream.Get()
	}
	if o.DefaultEventsRegisterStream.IsSet() {
		toSerialize["default_events_register_stream"] = o.DefaultEventsRegisterStream.Get()
	}
	if o.DefaultAllPublicStreams != nil {
		toSerialize["default_all_public_streams"] = o.DefaultAllPublicStreams
	}
	if o.AvatarUrl != nil {
		toSerialize["avatar_url"] = o.AvatarUrl
	}
	if o.OwnerId.IsSet() {
		toSerialize["owner_id"] = o.OwnerId.Get()
	}
	if o.Services != nil {
		toSerialize["services"] = o.Services
	}
	return json.Marshal(toSerialize)
}

type NullableBasicBotBase struct {
	value *BasicBotBase
	isSet bool
}

func (v NullableBasicBotBase) Get() *BasicBotBase {
	return v.value
}

func (v *NullableBasicBotBase) Set(val *BasicBotBase) {
	v.value = val
	v.isSet = true
}

func (v NullableBasicBotBase) IsSet() bool {
	return v.isSet
}

func (v *NullableBasicBotBase) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBasicBotBase(val *BasicBotBase) *NullableBasicBotBase {
	return &NullableBasicBotBase{value: val, isSet: true}
}

func (v NullableBasicBotBase) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBasicBotBase) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


