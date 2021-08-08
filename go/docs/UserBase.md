# UserBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** | The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  | [optional] 
**IsBot** | Pointer to **bool** | A boolean specifying whether the user is a bot or full account.  | [optional] 
**AvatarUrl** | Pointer to **NullableString** | URL for the user&#39;s avatar.  Will be &#x60;null&#x60; if the &#x60;client_gravatar&#x60; query parameter was set to &#x60;True&#x60; and the user&#39;s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the &#x60;user_avatar_url_field_optional&#x60; capability, this will be missing at the server&#39;s sole discretion.  | [optional] 
**AvatarVersion** | Pointer to **int32** | Version for the user&#39;s avatar.  Used for cache-busting requests for the user&#39;s avatar.  Clients generally shouldn&#39;t need to use this; most avatar URLs sent by Zulip will already end with &#x60;?v&#x3D;{avatar_version}&#x60;.  | [optional] 
**FullName** | Pointer to **string** | Full name of the user or bot, used for all display purposes.  | [optional] 
**IsAdmin** | Pointer to **bool** | A boolean specifying whether the user is an organization administrator.  | [optional] 
**IsOwner** | Pointer to **bool** | A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  | [optional] 
**IsBillingAdmin** | Pointer to **bool** | A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  | [optional] 
**Role** | Pointer to **int32** | [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner &#x3D;&gt; 100 * Organization administrator &#x3D;&gt; 200 * Organization moderator &#x3D;&gt; 300 * Member &#x3D;&gt; 400 * Guest &#x3D;&gt; 600  **Changes**: New in Zulip 4.0 (feature level 59).  | [optional] 
**BotType** | Pointer to **NullableInt32** | An integer describing the type of bot: * &#x60;null&#x60; if the user isn&#39;t a bot. * &#x60;1&#x60; for a &#x60;Generic&#x60; bot. * &#x60;2&#x60; for an &#x60;Incoming webhook&#x60; bot. * &#x60;3&#x60; for an &#x60;Outgoing webhook&#x60; bot. * &#x60;4&#x60; for an &#x60;Embedded&#x60; bot.  | [optional] 
**UserId** | Pointer to **int32** | The unique ID of the user.  | [optional] 
**BotOwnerId** | Pointer to **NullableInt32** | If the user is a bot (i.e. &#x60;is_bot&#x60; is &#x60;True&#x60;), &#x60;bot_owner&#x60; is the user ID of the bot&#39;s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a &#x60;bot_owner&#x60; field containing the email address of the bot&#39;s owner.  | [optional] 
**IsActive** | Pointer to **bool** | A boolean specifying whether the user account has been deactivated.  | [optional] 
**IsGuest** | Pointer to **bool** | A boolean specifying whether the user is a guest user.  | [optional] 
**Timezone** | Pointer to **string** | The time zone of the user.  | [optional] 
**DateJoined** | Pointer to **string** | The time the user account was created.  | [optional] 
**DeliveryEmail** | Pointer to **string** | The user&#39;s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  | [optional] 
**ProfileData** | Pointer to **map[string]map[string]interface{}** | A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user&#39;s data for that field.  Generally the data includes just a single &#x60;value&#x60; key; for those custom profile fields supporting Markdown, a &#x60;rendered_value&#x60; key will also be present.  | [optional] 

## Methods

### NewUserBase

`func NewUserBase() *UserBase`

NewUserBase instantiates a new UserBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUserBaseWithDefaults

`func NewUserBaseWithDefaults() *UserBase`

NewUserBaseWithDefaults instantiates a new UserBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *UserBase) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *UserBase) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *UserBase) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *UserBase) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetIsBot

`func (o *UserBase) GetIsBot() bool`

GetIsBot returns the IsBot field if non-nil, zero value otherwise.

### GetIsBotOk

`func (o *UserBase) GetIsBotOk() (*bool, bool)`

GetIsBotOk returns a tuple with the IsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBot

`func (o *UserBase) SetIsBot(v bool)`

SetIsBot sets IsBot field to given value.

### HasIsBot

`func (o *UserBase) HasIsBot() bool`

HasIsBot returns a boolean if a field has been set.

### GetAvatarUrl

`func (o *UserBase) GetAvatarUrl() string`

GetAvatarUrl returns the AvatarUrl field if non-nil, zero value otherwise.

### GetAvatarUrlOk

`func (o *UserBase) GetAvatarUrlOk() (*string, bool)`

GetAvatarUrlOk returns a tuple with the AvatarUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarUrl

`func (o *UserBase) SetAvatarUrl(v string)`

SetAvatarUrl sets AvatarUrl field to given value.

### HasAvatarUrl

`func (o *UserBase) HasAvatarUrl() bool`

HasAvatarUrl returns a boolean if a field has been set.

### SetAvatarUrlNil

`func (o *UserBase) SetAvatarUrlNil(b bool)`

 SetAvatarUrlNil sets the value for AvatarUrl to be an explicit nil

### UnsetAvatarUrl
`func (o *UserBase) UnsetAvatarUrl()`

UnsetAvatarUrl ensures that no value is present for AvatarUrl, not even an explicit nil
### GetAvatarVersion

`func (o *UserBase) GetAvatarVersion() int32`

GetAvatarVersion returns the AvatarVersion field if non-nil, zero value otherwise.

### GetAvatarVersionOk

`func (o *UserBase) GetAvatarVersionOk() (*int32, bool)`

GetAvatarVersionOk returns a tuple with the AvatarVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarVersion

`func (o *UserBase) SetAvatarVersion(v int32)`

SetAvatarVersion sets AvatarVersion field to given value.

### HasAvatarVersion

`func (o *UserBase) HasAvatarVersion() bool`

HasAvatarVersion returns a boolean if a field has been set.

### GetFullName

`func (o *UserBase) GetFullName() string`

GetFullName returns the FullName field if non-nil, zero value otherwise.

### GetFullNameOk

`func (o *UserBase) GetFullNameOk() (*string, bool)`

GetFullNameOk returns a tuple with the FullName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullName

`func (o *UserBase) SetFullName(v string)`

SetFullName sets FullName field to given value.

### HasFullName

`func (o *UserBase) HasFullName() bool`

HasFullName returns a boolean if a field has been set.

### GetIsAdmin

`func (o *UserBase) GetIsAdmin() bool`

GetIsAdmin returns the IsAdmin field if non-nil, zero value otherwise.

### GetIsAdminOk

`func (o *UserBase) GetIsAdminOk() (*bool, bool)`

GetIsAdminOk returns a tuple with the IsAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdmin

`func (o *UserBase) SetIsAdmin(v bool)`

SetIsAdmin sets IsAdmin field to given value.

### HasIsAdmin

`func (o *UserBase) HasIsAdmin() bool`

HasIsAdmin returns a boolean if a field has been set.

### GetIsOwner

`func (o *UserBase) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *UserBase) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *UserBase) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *UserBase) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

### GetIsBillingAdmin

`func (o *UserBase) GetIsBillingAdmin() bool`

GetIsBillingAdmin returns the IsBillingAdmin field if non-nil, zero value otherwise.

### GetIsBillingAdminOk

`func (o *UserBase) GetIsBillingAdminOk() (*bool, bool)`

GetIsBillingAdminOk returns a tuple with the IsBillingAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBillingAdmin

`func (o *UserBase) SetIsBillingAdmin(v bool)`

SetIsBillingAdmin sets IsBillingAdmin field to given value.

### HasIsBillingAdmin

`func (o *UserBase) HasIsBillingAdmin() bool`

HasIsBillingAdmin returns a boolean if a field has been set.

### GetRole

`func (o *UserBase) GetRole() int32`

GetRole returns the Role field if non-nil, zero value otherwise.

### GetRoleOk

`func (o *UserBase) GetRoleOk() (*int32, bool)`

GetRoleOk returns a tuple with the Role field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRole

`func (o *UserBase) SetRole(v int32)`

SetRole sets Role field to given value.

### HasRole

`func (o *UserBase) HasRole() bool`

HasRole returns a boolean if a field has been set.

### GetBotType

`func (o *UserBase) GetBotType() int32`

GetBotType returns the BotType field if non-nil, zero value otherwise.

### GetBotTypeOk

`func (o *UserBase) GetBotTypeOk() (*int32, bool)`

GetBotTypeOk returns a tuple with the BotType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotType

`func (o *UserBase) SetBotType(v int32)`

SetBotType sets BotType field to given value.

### HasBotType

`func (o *UserBase) HasBotType() bool`

HasBotType returns a boolean if a field has been set.

### SetBotTypeNil

`func (o *UserBase) SetBotTypeNil(b bool)`

 SetBotTypeNil sets the value for BotType to be an explicit nil

### UnsetBotType
`func (o *UserBase) UnsetBotType()`

UnsetBotType ensures that no value is present for BotType, not even an explicit nil
### GetUserId

`func (o *UserBase) GetUserId() int32`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *UserBase) GetUserIdOk() (*int32, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *UserBase) SetUserId(v int32)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *UserBase) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetBotOwnerId

`func (o *UserBase) GetBotOwnerId() int32`

GetBotOwnerId returns the BotOwnerId field if non-nil, zero value otherwise.

### GetBotOwnerIdOk

`func (o *UserBase) GetBotOwnerIdOk() (*int32, bool)`

GetBotOwnerIdOk returns a tuple with the BotOwnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotOwnerId

`func (o *UserBase) SetBotOwnerId(v int32)`

SetBotOwnerId sets BotOwnerId field to given value.

### HasBotOwnerId

`func (o *UserBase) HasBotOwnerId() bool`

HasBotOwnerId returns a boolean if a field has been set.

### SetBotOwnerIdNil

`func (o *UserBase) SetBotOwnerIdNil(b bool)`

 SetBotOwnerIdNil sets the value for BotOwnerId to be an explicit nil

### UnsetBotOwnerId
`func (o *UserBase) UnsetBotOwnerId()`

UnsetBotOwnerId ensures that no value is present for BotOwnerId, not even an explicit nil
### GetIsActive

`func (o *UserBase) GetIsActive() bool`

GetIsActive returns the IsActive field if non-nil, zero value otherwise.

### GetIsActiveOk

`func (o *UserBase) GetIsActiveOk() (*bool, bool)`

GetIsActiveOk returns a tuple with the IsActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsActive

`func (o *UserBase) SetIsActive(v bool)`

SetIsActive sets IsActive field to given value.

### HasIsActive

`func (o *UserBase) HasIsActive() bool`

HasIsActive returns a boolean if a field has been set.

### GetIsGuest

`func (o *UserBase) GetIsGuest() bool`

GetIsGuest returns the IsGuest field if non-nil, zero value otherwise.

### GetIsGuestOk

`func (o *UserBase) GetIsGuestOk() (*bool, bool)`

GetIsGuestOk returns a tuple with the IsGuest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGuest

`func (o *UserBase) SetIsGuest(v bool)`

SetIsGuest sets IsGuest field to given value.

### HasIsGuest

`func (o *UserBase) HasIsGuest() bool`

HasIsGuest returns a boolean if a field has been set.

### GetTimezone

`func (o *UserBase) GetTimezone() string`

GetTimezone returns the Timezone field if non-nil, zero value otherwise.

### GetTimezoneOk

`func (o *UserBase) GetTimezoneOk() (*string, bool)`

GetTimezoneOk returns a tuple with the Timezone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezone

`func (o *UserBase) SetTimezone(v string)`

SetTimezone sets Timezone field to given value.

### HasTimezone

`func (o *UserBase) HasTimezone() bool`

HasTimezone returns a boolean if a field has been set.

### GetDateJoined

`func (o *UserBase) GetDateJoined() string`

GetDateJoined returns the DateJoined field if non-nil, zero value otherwise.

### GetDateJoinedOk

`func (o *UserBase) GetDateJoinedOk() (*string, bool)`

GetDateJoinedOk returns a tuple with the DateJoined field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateJoined

`func (o *UserBase) SetDateJoined(v string)`

SetDateJoined sets DateJoined field to given value.

### HasDateJoined

`func (o *UserBase) HasDateJoined() bool`

HasDateJoined returns a boolean if a field has been set.

### GetDeliveryEmail

`func (o *UserBase) GetDeliveryEmail() string`

GetDeliveryEmail returns the DeliveryEmail field if non-nil, zero value otherwise.

### GetDeliveryEmailOk

`func (o *UserBase) GetDeliveryEmailOk() (*string, bool)`

GetDeliveryEmailOk returns a tuple with the DeliveryEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryEmail

`func (o *UserBase) SetDeliveryEmail(v string)`

SetDeliveryEmail sets DeliveryEmail field to given value.

### HasDeliveryEmail

`func (o *UserBase) HasDeliveryEmail() bool`

HasDeliveryEmail returns a boolean if a field has been set.

### GetProfileData

`func (o *UserBase) GetProfileData() map[string]map[string]interface{}`

GetProfileData returns the ProfileData field if non-nil, zero value otherwise.

### GetProfileDataOk

`func (o *UserBase) GetProfileDataOk() (*map[string]map[string]interface{}, bool)`

GetProfileDataOk returns a tuple with the ProfileData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfileData

`func (o *UserBase) SetProfileData(v map[string]map[string]interface{})`

SetProfileData sets ProfileData field to given value.

### HasProfileData

`func (o *UserBase) HasProfileData() bool`

HasProfileData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


