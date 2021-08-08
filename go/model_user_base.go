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

// UserBase A dictionary containing basic data on a given Zulip user. 
type UserBase struct {
	// The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
	Email *string `json:"email,omitempty"`
	// A boolean specifying whether the user is a bot or full account. 
	IsBot *bool `json:"is_bot,omitempty"`
	// URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
	AvatarUrl NullableString `json:"avatar_url,omitempty"`
	// Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
	AvatarVersion *int32 `json:"avatar_version,omitempty"`
	// Full name of the user or bot, used for all display purposes. 
	FullName *string `json:"full_name,omitempty"`
	// A boolean specifying whether the user is an organization administrator. 
	IsAdmin *bool `json:"is_admin,omitempty"`
	// A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
	IsOwner *bool `json:"is_owner,omitempty"`
	// A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
	IsBillingAdmin *bool `json:"is_billing_admin,omitempty"`
	// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
	Role *int32 `json:"role,omitempty"`
	// An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
	BotType NullableInt32 `json:"bot_type,omitempty"`
	// The unique ID of the user. 
	UserId *int32 `json:"user_id,omitempty"`
	// If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
	BotOwnerId NullableInt32 `json:"bot_owner_id,omitempty"`
	// A boolean specifying whether the user account has been deactivated. 
	IsActive *bool `json:"is_active,omitempty"`
	// A boolean specifying whether the user is a guest user. 
	IsGuest *bool `json:"is_guest,omitempty"`
	// The time zone of the user. 
	Timezone *string `json:"timezone,omitempty"`
	// The time the user account was created. 
	DateJoined *string `json:"date_joined,omitempty"`
	// The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
	DeliveryEmail *string `json:"delivery_email,omitempty"`
	// A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
	ProfileData *map[string]map[string]interface{} `json:"profile_data,omitempty"`
}

// NewUserBase instantiates a new UserBase object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUserBase() *UserBase {
	this := UserBase{}
	return &this
}

// NewUserBaseWithDefaults instantiates a new UserBase object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUserBaseWithDefaults() *UserBase {
	this := UserBase{}
	return &this
}

// GetEmail returns the Email field value if set, zero value otherwise.
func (o *UserBase) GetEmail() string {
	if o == nil || o.Email == nil {
		var ret string
		return ret
	}
	return *o.Email
}

// GetEmailOk returns a tuple with the Email field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetEmailOk() (*string, bool) {
	if o == nil || o.Email == nil {
		return nil, false
	}
	return o.Email, true
}

// HasEmail returns a boolean if a field has been set.
func (o *UserBase) HasEmail() bool {
	if o != nil && o.Email != nil {
		return true
	}

	return false
}

// SetEmail gets a reference to the given string and assigns it to the Email field.
func (o *UserBase) SetEmail(v string) {
	o.Email = &v
}

// GetIsBot returns the IsBot field value if set, zero value otherwise.
func (o *UserBase) GetIsBot() bool {
	if o == nil || o.IsBot == nil {
		var ret bool
		return ret
	}
	return *o.IsBot
}

// GetIsBotOk returns a tuple with the IsBot field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetIsBotOk() (*bool, bool) {
	if o == nil || o.IsBot == nil {
		return nil, false
	}
	return o.IsBot, true
}

// HasIsBot returns a boolean if a field has been set.
func (o *UserBase) HasIsBot() bool {
	if o != nil && o.IsBot != nil {
		return true
	}

	return false
}

// SetIsBot gets a reference to the given bool and assigns it to the IsBot field.
func (o *UserBase) SetIsBot(v bool) {
	o.IsBot = &v
}

// GetAvatarUrl returns the AvatarUrl field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBase) GetAvatarUrl() string {
	if o == nil || o.AvatarUrl.Get() == nil {
		var ret string
		return ret
	}
	return *o.AvatarUrl.Get()
}

// GetAvatarUrlOk returns a tuple with the AvatarUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBase) GetAvatarUrlOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.AvatarUrl.Get(), o.AvatarUrl.IsSet()
}

// HasAvatarUrl returns a boolean if a field has been set.
func (o *UserBase) HasAvatarUrl() bool {
	if o != nil && o.AvatarUrl.IsSet() {
		return true
	}

	return false
}

// SetAvatarUrl gets a reference to the given NullableString and assigns it to the AvatarUrl field.
func (o *UserBase) SetAvatarUrl(v string) {
	o.AvatarUrl.Set(&v)
}
// SetAvatarUrlNil sets the value for AvatarUrl to be an explicit nil
func (o *UserBase) SetAvatarUrlNil() {
	o.AvatarUrl.Set(nil)
}

// UnsetAvatarUrl ensures that no value is present for AvatarUrl, not even an explicit nil
func (o *UserBase) UnsetAvatarUrl() {
	o.AvatarUrl.Unset()
}

// GetAvatarVersion returns the AvatarVersion field value if set, zero value otherwise.
func (o *UserBase) GetAvatarVersion() int32 {
	if o == nil || o.AvatarVersion == nil {
		var ret int32
		return ret
	}
	return *o.AvatarVersion
}

// GetAvatarVersionOk returns a tuple with the AvatarVersion field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetAvatarVersionOk() (*int32, bool) {
	if o == nil || o.AvatarVersion == nil {
		return nil, false
	}
	return o.AvatarVersion, true
}

// HasAvatarVersion returns a boolean if a field has been set.
func (o *UserBase) HasAvatarVersion() bool {
	if o != nil && o.AvatarVersion != nil {
		return true
	}

	return false
}

// SetAvatarVersion gets a reference to the given int32 and assigns it to the AvatarVersion field.
func (o *UserBase) SetAvatarVersion(v int32) {
	o.AvatarVersion = &v
}

// GetFullName returns the FullName field value if set, zero value otherwise.
func (o *UserBase) GetFullName() string {
	if o == nil || o.FullName == nil {
		var ret string
		return ret
	}
	return *o.FullName
}

// GetFullNameOk returns a tuple with the FullName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetFullNameOk() (*string, bool) {
	if o == nil || o.FullName == nil {
		return nil, false
	}
	return o.FullName, true
}

// HasFullName returns a boolean if a field has been set.
func (o *UserBase) HasFullName() bool {
	if o != nil && o.FullName != nil {
		return true
	}

	return false
}

// SetFullName gets a reference to the given string and assigns it to the FullName field.
func (o *UserBase) SetFullName(v string) {
	o.FullName = &v
}

// GetIsAdmin returns the IsAdmin field value if set, zero value otherwise.
func (o *UserBase) GetIsAdmin() bool {
	if o == nil || o.IsAdmin == nil {
		var ret bool
		return ret
	}
	return *o.IsAdmin
}

// GetIsAdminOk returns a tuple with the IsAdmin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetIsAdminOk() (*bool, bool) {
	if o == nil || o.IsAdmin == nil {
		return nil, false
	}
	return o.IsAdmin, true
}

// HasIsAdmin returns a boolean if a field has been set.
func (o *UserBase) HasIsAdmin() bool {
	if o != nil && o.IsAdmin != nil {
		return true
	}

	return false
}

// SetIsAdmin gets a reference to the given bool and assigns it to the IsAdmin field.
func (o *UserBase) SetIsAdmin(v bool) {
	o.IsAdmin = &v
}

// GetIsOwner returns the IsOwner field value if set, zero value otherwise.
func (o *UserBase) GetIsOwner() bool {
	if o == nil || o.IsOwner == nil {
		var ret bool
		return ret
	}
	return *o.IsOwner
}

// GetIsOwnerOk returns a tuple with the IsOwner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetIsOwnerOk() (*bool, bool) {
	if o == nil || o.IsOwner == nil {
		return nil, false
	}
	return o.IsOwner, true
}

// HasIsOwner returns a boolean if a field has been set.
func (o *UserBase) HasIsOwner() bool {
	if o != nil && o.IsOwner != nil {
		return true
	}

	return false
}

// SetIsOwner gets a reference to the given bool and assigns it to the IsOwner field.
func (o *UserBase) SetIsOwner(v bool) {
	o.IsOwner = &v
}

// GetIsBillingAdmin returns the IsBillingAdmin field value if set, zero value otherwise.
func (o *UserBase) GetIsBillingAdmin() bool {
	if o == nil || o.IsBillingAdmin == nil {
		var ret bool
		return ret
	}
	return *o.IsBillingAdmin
}

// GetIsBillingAdminOk returns a tuple with the IsBillingAdmin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetIsBillingAdminOk() (*bool, bool) {
	if o == nil || o.IsBillingAdmin == nil {
		return nil, false
	}
	return o.IsBillingAdmin, true
}

// HasIsBillingAdmin returns a boolean if a field has been set.
func (o *UserBase) HasIsBillingAdmin() bool {
	if o != nil && o.IsBillingAdmin != nil {
		return true
	}

	return false
}

// SetIsBillingAdmin gets a reference to the given bool and assigns it to the IsBillingAdmin field.
func (o *UserBase) SetIsBillingAdmin(v bool) {
	o.IsBillingAdmin = &v
}

// GetRole returns the Role field value if set, zero value otherwise.
func (o *UserBase) GetRole() int32 {
	if o == nil || o.Role == nil {
		var ret int32
		return ret
	}
	return *o.Role
}

// GetRoleOk returns a tuple with the Role field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetRoleOk() (*int32, bool) {
	if o == nil || o.Role == nil {
		return nil, false
	}
	return o.Role, true
}

// HasRole returns a boolean if a field has been set.
func (o *UserBase) HasRole() bool {
	if o != nil && o.Role != nil {
		return true
	}

	return false
}

// SetRole gets a reference to the given int32 and assigns it to the Role field.
func (o *UserBase) SetRole(v int32) {
	o.Role = &v
}

// GetBotType returns the BotType field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBase) GetBotType() int32 {
	if o == nil || o.BotType.Get() == nil {
		var ret int32
		return ret
	}
	return *o.BotType.Get()
}

// GetBotTypeOk returns a tuple with the BotType field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBase) GetBotTypeOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.BotType.Get(), o.BotType.IsSet()
}

// HasBotType returns a boolean if a field has been set.
func (o *UserBase) HasBotType() bool {
	if o != nil && o.BotType.IsSet() {
		return true
	}

	return false
}

// SetBotType gets a reference to the given NullableInt32 and assigns it to the BotType field.
func (o *UserBase) SetBotType(v int32) {
	o.BotType.Set(&v)
}
// SetBotTypeNil sets the value for BotType to be an explicit nil
func (o *UserBase) SetBotTypeNil() {
	o.BotType.Set(nil)
}

// UnsetBotType ensures that no value is present for BotType, not even an explicit nil
func (o *UserBase) UnsetBotType() {
	o.BotType.Unset()
}

// GetUserId returns the UserId field value if set, zero value otherwise.
func (o *UserBase) GetUserId() int32 {
	if o == nil || o.UserId == nil {
		var ret int32
		return ret
	}
	return *o.UserId
}

// GetUserIdOk returns a tuple with the UserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetUserIdOk() (*int32, bool) {
	if o == nil || o.UserId == nil {
		return nil, false
	}
	return o.UserId, true
}

// HasUserId returns a boolean if a field has been set.
func (o *UserBase) HasUserId() bool {
	if o != nil && o.UserId != nil {
		return true
	}

	return false
}

// SetUserId gets a reference to the given int32 and assigns it to the UserId field.
func (o *UserBase) SetUserId(v int32) {
	o.UserId = &v
}

// GetBotOwnerId returns the BotOwnerId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBase) GetBotOwnerId() int32 {
	if o == nil || o.BotOwnerId.Get() == nil {
		var ret int32
		return ret
	}
	return *o.BotOwnerId.Get()
}

// GetBotOwnerIdOk returns a tuple with the BotOwnerId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBase) GetBotOwnerIdOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.BotOwnerId.Get(), o.BotOwnerId.IsSet()
}

// HasBotOwnerId returns a boolean if a field has been set.
func (o *UserBase) HasBotOwnerId() bool {
	if o != nil && o.BotOwnerId.IsSet() {
		return true
	}

	return false
}

// SetBotOwnerId gets a reference to the given NullableInt32 and assigns it to the BotOwnerId field.
func (o *UserBase) SetBotOwnerId(v int32) {
	o.BotOwnerId.Set(&v)
}
// SetBotOwnerIdNil sets the value for BotOwnerId to be an explicit nil
func (o *UserBase) SetBotOwnerIdNil() {
	o.BotOwnerId.Set(nil)
}

// UnsetBotOwnerId ensures that no value is present for BotOwnerId, not even an explicit nil
func (o *UserBase) UnsetBotOwnerId() {
	o.BotOwnerId.Unset()
}

// GetIsActive returns the IsActive field value if set, zero value otherwise.
func (o *UserBase) GetIsActive() bool {
	if o == nil || o.IsActive == nil {
		var ret bool
		return ret
	}
	return *o.IsActive
}

// GetIsActiveOk returns a tuple with the IsActive field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetIsActiveOk() (*bool, bool) {
	if o == nil || o.IsActive == nil {
		return nil, false
	}
	return o.IsActive, true
}

// HasIsActive returns a boolean if a field has been set.
func (o *UserBase) HasIsActive() bool {
	if o != nil && o.IsActive != nil {
		return true
	}

	return false
}

// SetIsActive gets a reference to the given bool and assigns it to the IsActive field.
func (o *UserBase) SetIsActive(v bool) {
	o.IsActive = &v
}

// GetIsGuest returns the IsGuest field value if set, zero value otherwise.
func (o *UserBase) GetIsGuest() bool {
	if o == nil || o.IsGuest == nil {
		var ret bool
		return ret
	}
	return *o.IsGuest
}

// GetIsGuestOk returns a tuple with the IsGuest field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetIsGuestOk() (*bool, bool) {
	if o == nil || o.IsGuest == nil {
		return nil, false
	}
	return o.IsGuest, true
}

// HasIsGuest returns a boolean if a field has been set.
func (o *UserBase) HasIsGuest() bool {
	if o != nil && o.IsGuest != nil {
		return true
	}

	return false
}

// SetIsGuest gets a reference to the given bool and assigns it to the IsGuest field.
func (o *UserBase) SetIsGuest(v bool) {
	o.IsGuest = &v
}

// GetTimezone returns the Timezone field value if set, zero value otherwise.
func (o *UserBase) GetTimezone() string {
	if o == nil || o.Timezone == nil {
		var ret string
		return ret
	}
	return *o.Timezone
}

// GetTimezoneOk returns a tuple with the Timezone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetTimezoneOk() (*string, bool) {
	if o == nil || o.Timezone == nil {
		return nil, false
	}
	return o.Timezone, true
}

// HasTimezone returns a boolean if a field has been set.
func (o *UserBase) HasTimezone() bool {
	if o != nil && o.Timezone != nil {
		return true
	}

	return false
}

// SetTimezone gets a reference to the given string and assigns it to the Timezone field.
func (o *UserBase) SetTimezone(v string) {
	o.Timezone = &v
}

// GetDateJoined returns the DateJoined field value if set, zero value otherwise.
func (o *UserBase) GetDateJoined() string {
	if o == nil || o.DateJoined == nil {
		var ret string
		return ret
	}
	return *o.DateJoined
}

// GetDateJoinedOk returns a tuple with the DateJoined field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetDateJoinedOk() (*string, bool) {
	if o == nil || o.DateJoined == nil {
		return nil, false
	}
	return o.DateJoined, true
}

// HasDateJoined returns a boolean if a field has been set.
func (o *UserBase) HasDateJoined() bool {
	if o != nil && o.DateJoined != nil {
		return true
	}

	return false
}

// SetDateJoined gets a reference to the given string and assigns it to the DateJoined field.
func (o *UserBase) SetDateJoined(v string) {
	o.DateJoined = &v
}

// GetDeliveryEmail returns the DeliveryEmail field value if set, zero value otherwise.
func (o *UserBase) GetDeliveryEmail() string {
	if o == nil || o.DeliveryEmail == nil {
		var ret string
		return ret
	}
	return *o.DeliveryEmail
}

// GetDeliveryEmailOk returns a tuple with the DeliveryEmail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetDeliveryEmailOk() (*string, bool) {
	if o == nil || o.DeliveryEmail == nil {
		return nil, false
	}
	return o.DeliveryEmail, true
}

// HasDeliveryEmail returns a boolean if a field has been set.
func (o *UserBase) HasDeliveryEmail() bool {
	if o != nil && o.DeliveryEmail != nil {
		return true
	}

	return false
}

// SetDeliveryEmail gets a reference to the given string and assigns it to the DeliveryEmail field.
func (o *UserBase) SetDeliveryEmail(v string) {
	o.DeliveryEmail = &v
}

// GetProfileData returns the ProfileData field value if set, zero value otherwise.
func (o *UserBase) GetProfileData() map[string]map[string]interface{} {
	if o == nil || o.ProfileData == nil {
		var ret map[string]map[string]interface{}
		return ret
	}
	return *o.ProfileData
}

// GetProfileDataOk returns a tuple with the ProfileData field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBase) GetProfileDataOk() (*map[string]map[string]interface{}, bool) {
	if o == nil || o.ProfileData == nil {
		return nil, false
	}
	return o.ProfileData, true
}

// HasProfileData returns a boolean if a field has been set.
func (o *UserBase) HasProfileData() bool {
	if o != nil && o.ProfileData != nil {
		return true
	}

	return false
}

// SetProfileData gets a reference to the given map[string]map[string]interface{} and assigns it to the ProfileData field.
func (o *UserBase) SetProfileData(v map[string]map[string]interface{}) {
	o.ProfileData = &v
}

func (o UserBase) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Email != nil {
		toSerialize["email"] = o.Email
	}
	if o.IsBot != nil {
		toSerialize["is_bot"] = o.IsBot
	}
	if o.AvatarUrl.IsSet() {
		toSerialize["avatar_url"] = o.AvatarUrl.Get()
	}
	if o.AvatarVersion != nil {
		toSerialize["avatar_version"] = o.AvatarVersion
	}
	if o.FullName != nil {
		toSerialize["full_name"] = o.FullName
	}
	if o.IsAdmin != nil {
		toSerialize["is_admin"] = o.IsAdmin
	}
	if o.IsOwner != nil {
		toSerialize["is_owner"] = o.IsOwner
	}
	if o.IsBillingAdmin != nil {
		toSerialize["is_billing_admin"] = o.IsBillingAdmin
	}
	if o.Role != nil {
		toSerialize["role"] = o.Role
	}
	if o.BotType.IsSet() {
		toSerialize["bot_type"] = o.BotType.Get()
	}
	if o.UserId != nil {
		toSerialize["user_id"] = o.UserId
	}
	if o.BotOwnerId.IsSet() {
		toSerialize["bot_owner_id"] = o.BotOwnerId.Get()
	}
	if o.IsActive != nil {
		toSerialize["is_active"] = o.IsActive
	}
	if o.IsGuest != nil {
		toSerialize["is_guest"] = o.IsGuest
	}
	if o.Timezone != nil {
		toSerialize["timezone"] = o.Timezone
	}
	if o.DateJoined != nil {
		toSerialize["date_joined"] = o.DateJoined
	}
	if o.DeliveryEmail != nil {
		toSerialize["delivery_email"] = o.DeliveryEmail
	}
	if o.ProfileData != nil {
		toSerialize["profile_data"] = o.ProfileData
	}
	return json.Marshal(toSerialize)
}

type NullableUserBase struct {
	value *UserBase
	isSet bool
}

func (v NullableUserBase) Get() *UserBase {
	return v.value
}

func (v *NullableUserBase) Set(val *UserBase) {
	v.value = val
	v.isSet = true
}

func (v NullableUserBase) IsSet() bool {
	return v.isSet
}

func (v *NullableUserBase) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUserBase(val *UserBase) *NullableUserBase {
	return &NullableUserBase{value: val, isSet: true}
}

func (v NullableUserBase) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUserBase) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


