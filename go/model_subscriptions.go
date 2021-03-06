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

// Subscriptions struct for Subscriptions
type Subscriptions struct {
	// The unique ID of a stream. 
	StreamId *int32 `json:"stream_id,omitempty"`
	// The name of a stream. 
	Name *string `json:"name,omitempty"`
	// The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
	Description *string `json:"description,omitempty"`
	// A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
	RenderedDescription *string `json:"rendered_description,omitempty"`
	// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
	DateCreated *int32 `json:"date_created,omitempty"`
	// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
	InviteOnly *bool `json:"invite_only,omitempty"`
	// A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
	Subscribers *[]int32 `json:"subscribers,omitempty"`
	// A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
	DesktopNotifications NullableBool `json:"desktop_notifications,omitempty"`
	// A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
	EmailNotifications NullableBool `json:"email_notifications,omitempty"`
	// A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
	WildcardMentionsNotify NullableBool `json:"wildcard_mentions_notify,omitempty"`
	// A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
	PushNotifications NullableBool `json:"push_notifications,omitempty"`
	// A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
	AudibleNotifications NullableBool `json:"audible_notifications,omitempty"`
	// A boolean specifying whether the given stream has been pinned to the top. 
	PinToTop *bool `json:"pin_to_top,omitempty"`
	// Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
	EmailAddress *string `json:"email_address,omitempty"`
	// Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
	IsMuted *bool `json:"is_muted,omitempty"`
	// Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
	InHomeView *bool `json:"in_home_view,omitempty"`
	// Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
	IsAnnouncementOnly *bool `json:"is_announcement_only,omitempty"`
	// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
	IsWebPublic *bool `json:"is_web_public,omitempty"`
	// The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
	Role *int32 `json:"role,omitempty"`
	// The user's personal color for the stream. 
	Color *string `json:"color,omitempty"`
	// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
	StreamPostPolicy *int32 `json:"stream_post_policy,omitempty"`
	// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
	MessageRetentionDays NullableInt32 `json:"message_retention_days,omitempty"`
	// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
	HistoryPublicToSubscribers *bool `json:"history_public_to_subscribers,omitempty"`
	// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
	FirstMessageId NullableInt32 `json:"first_message_id,omitempty"`
	// The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
	StreamWeeklyTraffic NullableInt32 `json:"stream_weekly_traffic,omitempty"`
}

// NewSubscriptions instantiates a new Subscriptions object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubscriptions() *Subscriptions {
	this := Subscriptions{}
	return &this
}

// NewSubscriptionsWithDefaults instantiates a new Subscriptions object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubscriptionsWithDefaults() *Subscriptions {
	this := Subscriptions{}
	return &this
}

// GetStreamId returns the StreamId field value if set, zero value otherwise.
func (o *Subscriptions) GetStreamId() int32 {
	if o == nil || o.StreamId == nil {
		var ret int32
		return ret
	}
	return *o.StreamId
}

// GetStreamIdOk returns a tuple with the StreamId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetStreamIdOk() (*int32, bool) {
	if o == nil || o.StreamId == nil {
		return nil, false
	}
	return o.StreamId, true
}

// HasStreamId returns a boolean if a field has been set.
func (o *Subscriptions) HasStreamId() bool {
	if o != nil && o.StreamId != nil {
		return true
	}

	return false
}

// SetStreamId gets a reference to the given int32 and assigns it to the StreamId field.
func (o *Subscriptions) SetStreamId(v int32) {
	o.StreamId = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *Subscriptions) GetName() string {
	if o == nil || o.Name == nil {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetNameOk() (*string, bool) {
	if o == nil || o.Name == nil {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *Subscriptions) HasName() bool {
	if o != nil && o.Name != nil {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *Subscriptions) SetName(v string) {
	o.Name = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *Subscriptions) GetDescription() string {
	if o == nil || o.Description == nil {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetDescriptionOk() (*string, bool) {
	if o == nil || o.Description == nil {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *Subscriptions) HasDescription() bool {
	if o != nil && o.Description != nil {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *Subscriptions) SetDescription(v string) {
	o.Description = &v
}

// GetRenderedDescription returns the RenderedDescription field value if set, zero value otherwise.
func (o *Subscriptions) GetRenderedDescription() string {
	if o == nil || o.RenderedDescription == nil {
		var ret string
		return ret
	}
	return *o.RenderedDescription
}

// GetRenderedDescriptionOk returns a tuple with the RenderedDescription field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetRenderedDescriptionOk() (*string, bool) {
	if o == nil || o.RenderedDescription == nil {
		return nil, false
	}
	return o.RenderedDescription, true
}

// HasRenderedDescription returns a boolean if a field has been set.
func (o *Subscriptions) HasRenderedDescription() bool {
	if o != nil && o.RenderedDescription != nil {
		return true
	}

	return false
}

// SetRenderedDescription gets a reference to the given string and assigns it to the RenderedDescription field.
func (o *Subscriptions) SetRenderedDescription(v string) {
	o.RenderedDescription = &v
}

// GetDateCreated returns the DateCreated field value if set, zero value otherwise.
func (o *Subscriptions) GetDateCreated() int32 {
	if o == nil || o.DateCreated == nil {
		var ret int32
		return ret
	}
	return *o.DateCreated
}

// GetDateCreatedOk returns a tuple with the DateCreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetDateCreatedOk() (*int32, bool) {
	if o == nil || o.DateCreated == nil {
		return nil, false
	}
	return o.DateCreated, true
}

// HasDateCreated returns a boolean if a field has been set.
func (o *Subscriptions) HasDateCreated() bool {
	if o != nil && o.DateCreated != nil {
		return true
	}

	return false
}

// SetDateCreated gets a reference to the given int32 and assigns it to the DateCreated field.
func (o *Subscriptions) SetDateCreated(v int32) {
	o.DateCreated = &v
}

// GetInviteOnly returns the InviteOnly field value if set, zero value otherwise.
func (o *Subscriptions) GetInviteOnly() bool {
	if o == nil || o.InviteOnly == nil {
		var ret bool
		return ret
	}
	return *o.InviteOnly
}

// GetInviteOnlyOk returns a tuple with the InviteOnly field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetInviteOnlyOk() (*bool, bool) {
	if o == nil || o.InviteOnly == nil {
		return nil, false
	}
	return o.InviteOnly, true
}

// HasInviteOnly returns a boolean if a field has been set.
func (o *Subscriptions) HasInviteOnly() bool {
	if o != nil && o.InviteOnly != nil {
		return true
	}

	return false
}

// SetInviteOnly gets a reference to the given bool and assigns it to the InviteOnly field.
func (o *Subscriptions) SetInviteOnly(v bool) {
	o.InviteOnly = &v
}

// GetSubscribers returns the Subscribers field value if set, zero value otherwise.
func (o *Subscriptions) GetSubscribers() []int32 {
	if o == nil || o.Subscribers == nil {
		var ret []int32
		return ret
	}
	return *o.Subscribers
}

// GetSubscribersOk returns a tuple with the Subscribers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetSubscribersOk() (*[]int32, bool) {
	if o == nil || o.Subscribers == nil {
		return nil, false
	}
	return o.Subscribers, true
}

// HasSubscribers returns a boolean if a field has been set.
func (o *Subscriptions) HasSubscribers() bool {
	if o != nil && o.Subscribers != nil {
		return true
	}

	return false
}

// SetSubscribers gets a reference to the given []int32 and assigns it to the Subscribers field.
func (o *Subscriptions) SetSubscribers(v []int32) {
	o.Subscribers = &v
}

// GetDesktopNotifications returns the DesktopNotifications field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetDesktopNotifications() bool {
	if o == nil || o.DesktopNotifications.Get() == nil {
		var ret bool
		return ret
	}
	return *o.DesktopNotifications.Get()
}

// GetDesktopNotificationsOk returns a tuple with the DesktopNotifications field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetDesktopNotificationsOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return o.DesktopNotifications.Get(), o.DesktopNotifications.IsSet()
}

// HasDesktopNotifications returns a boolean if a field has been set.
func (o *Subscriptions) HasDesktopNotifications() bool {
	if o != nil && o.DesktopNotifications.IsSet() {
		return true
	}

	return false
}

// SetDesktopNotifications gets a reference to the given NullableBool and assigns it to the DesktopNotifications field.
func (o *Subscriptions) SetDesktopNotifications(v bool) {
	o.DesktopNotifications.Set(&v)
}
// SetDesktopNotificationsNil sets the value for DesktopNotifications to be an explicit nil
func (o *Subscriptions) SetDesktopNotificationsNil() {
	o.DesktopNotifications.Set(nil)
}

// UnsetDesktopNotifications ensures that no value is present for DesktopNotifications, not even an explicit nil
func (o *Subscriptions) UnsetDesktopNotifications() {
	o.DesktopNotifications.Unset()
}

// GetEmailNotifications returns the EmailNotifications field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetEmailNotifications() bool {
	if o == nil || o.EmailNotifications.Get() == nil {
		var ret bool
		return ret
	}
	return *o.EmailNotifications.Get()
}

// GetEmailNotificationsOk returns a tuple with the EmailNotifications field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetEmailNotificationsOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return o.EmailNotifications.Get(), o.EmailNotifications.IsSet()
}

// HasEmailNotifications returns a boolean if a field has been set.
func (o *Subscriptions) HasEmailNotifications() bool {
	if o != nil && o.EmailNotifications.IsSet() {
		return true
	}

	return false
}

// SetEmailNotifications gets a reference to the given NullableBool and assigns it to the EmailNotifications field.
func (o *Subscriptions) SetEmailNotifications(v bool) {
	o.EmailNotifications.Set(&v)
}
// SetEmailNotificationsNil sets the value for EmailNotifications to be an explicit nil
func (o *Subscriptions) SetEmailNotificationsNil() {
	o.EmailNotifications.Set(nil)
}

// UnsetEmailNotifications ensures that no value is present for EmailNotifications, not even an explicit nil
func (o *Subscriptions) UnsetEmailNotifications() {
	o.EmailNotifications.Unset()
}

// GetWildcardMentionsNotify returns the WildcardMentionsNotify field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetWildcardMentionsNotify() bool {
	if o == nil || o.WildcardMentionsNotify.Get() == nil {
		var ret bool
		return ret
	}
	return *o.WildcardMentionsNotify.Get()
}

// GetWildcardMentionsNotifyOk returns a tuple with the WildcardMentionsNotify field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetWildcardMentionsNotifyOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return o.WildcardMentionsNotify.Get(), o.WildcardMentionsNotify.IsSet()
}

// HasWildcardMentionsNotify returns a boolean if a field has been set.
func (o *Subscriptions) HasWildcardMentionsNotify() bool {
	if o != nil && o.WildcardMentionsNotify.IsSet() {
		return true
	}

	return false
}

// SetWildcardMentionsNotify gets a reference to the given NullableBool and assigns it to the WildcardMentionsNotify field.
func (o *Subscriptions) SetWildcardMentionsNotify(v bool) {
	o.WildcardMentionsNotify.Set(&v)
}
// SetWildcardMentionsNotifyNil sets the value for WildcardMentionsNotify to be an explicit nil
func (o *Subscriptions) SetWildcardMentionsNotifyNil() {
	o.WildcardMentionsNotify.Set(nil)
}

// UnsetWildcardMentionsNotify ensures that no value is present for WildcardMentionsNotify, not even an explicit nil
func (o *Subscriptions) UnsetWildcardMentionsNotify() {
	o.WildcardMentionsNotify.Unset()
}

// GetPushNotifications returns the PushNotifications field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetPushNotifications() bool {
	if o == nil || o.PushNotifications.Get() == nil {
		var ret bool
		return ret
	}
	return *o.PushNotifications.Get()
}

// GetPushNotificationsOk returns a tuple with the PushNotifications field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetPushNotificationsOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return o.PushNotifications.Get(), o.PushNotifications.IsSet()
}

// HasPushNotifications returns a boolean if a field has been set.
func (o *Subscriptions) HasPushNotifications() bool {
	if o != nil && o.PushNotifications.IsSet() {
		return true
	}

	return false
}

// SetPushNotifications gets a reference to the given NullableBool and assigns it to the PushNotifications field.
func (o *Subscriptions) SetPushNotifications(v bool) {
	o.PushNotifications.Set(&v)
}
// SetPushNotificationsNil sets the value for PushNotifications to be an explicit nil
func (o *Subscriptions) SetPushNotificationsNil() {
	o.PushNotifications.Set(nil)
}

// UnsetPushNotifications ensures that no value is present for PushNotifications, not even an explicit nil
func (o *Subscriptions) UnsetPushNotifications() {
	o.PushNotifications.Unset()
}

// GetAudibleNotifications returns the AudibleNotifications field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetAudibleNotifications() bool {
	if o == nil || o.AudibleNotifications.Get() == nil {
		var ret bool
		return ret
	}
	return *o.AudibleNotifications.Get()
}

// GetAudibleNotificationsOk returns a tuple with the AudibleNotifications field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetAudibleNotificationsOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return o.AudibleNotifications.Get(), o.AudibleNotifications.IsSet()
}

// HasAudibleNotifications returns a boolean if a field has been set.
func (o *Subscriptions) HasAudibleNotifications() bool {
	if o != nil && o.AudibleNotifications.IsSet() {
		return true
	}

	return false
}

// SetAudibleNotifications gets a reference to the given NullableBool and assigns it to the AudibleNotifications field.
func (o *Subscriptions) SetAudibleNotifications(v bool) {
	o.AudibleNotifications.Set(&v)
}
// SetAudibleNotificationsNil sets the value for AudibleNotifications to be an explicit nil
func (o *Subscriptions) SetAudibleNotificationsNil() {
	o.AudibleNotifications.Set(nil)
}

// UnsetAudibleNotifications ensures that no value is present for AudibleNotifications, not even an explicit nil
func (o *Subscriptions) UnsetAudibleNotifications() {
	o.AudibleNotifications.Unset()
}

// GetPinToTop returns the PinToTop field value if set, zero value otherwise.
func (o *Subscriptions) GetPinToTop() bool {
	if o == nil || o.PinToTop == nil {
		var ret bool
		return ret
	}
	return *o.PinToTop
}

// GetPinToTopOk returns a tuple with the PinToTop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetPinToTopOk() (*bool, bool) {
	if o == nil || o.PinToTop == nil {
		return nil, false
	}
	return o.PinToTop, true
}

// HasPinToTop returns a boolean if a field has been set.
func (o *Subscriptions) HasPinToTop() bool {
	if o != nil && o.PinToTop != nil {
		return true
	}

	return false
}

// SetPinToTop gets a reference to the given bool and assigns it to the PinToTop field.
func (o *Subscriptions) SetPinToTop(v bool) {
	o.PinToTop = &v
}

// GetEmailAddress returns the EmailAddress field value if set, zero value otherwise.
func (o *Subscriptions) GetEmailAddress() string {
	if o == nil || o.EmailAddress == nil {
		var ret string
		return ret
	}
	return *o.EmailAddress
}

// GetEmailAddressOk returns a tuple with the EmailAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetEmailAddressOk() (*string, bool) {
	if o == nil || o.EmailAddress == nil {
		return nil, false
	}
	return o.EmailAddress, true
}

// HasEmailAddress returns a boolean if a field has been set.
func (o *Subscriptions) HasEmailAddress() bool {
	if o != nil && o.EmailAddress != nil {
		return true
	}

	return false
}

// SetEmailAddress gets a reference to the given string and assigns it to the EmailAddress field.
func (o *Subscriptions) SetEmailAddress(v string) {
	o.EmailAddress = &v
}

// GetIsMuted returns the IsMuted field value if set, zero value otherwise.
func (o *Subscriptions) GetIsMuted() bool {
	if o == nil || o.IsMuted == nil {
		var ret bool
		return ret
	}
	return *o.IsMuted
}

// GetIsMutedOk returns a tuple with the IsMuted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetIsMutedOk() (*bool, bool) {
	if o == nil || o.IsMuted == nil {
		return nil, false
	}
	return o.IsMuted, true
}

// HasIsMuted returns a boolean if a field has been set.
func (o *Subscriptions) HasIsMuted() bool {
	if o != nil && o.IsMuted != nil {
		return true
	}

	return false
}

// SetIsMuted gets a reference to the given bool and assigns it to the IsMuted field.
func (o *Subscriptions) SetIsMuted(v bool) {
	o.IsMuted = &v
}

// GetInHomeView returns the InHomeView field value if set, zero value otherwise.
func (o *Subscriptions) GetInHomeView() bool {
	if o == nil || o.InHomeView == nil {
		var ret bool
		return ret
	}
	return *o.InHomeView
}

// GetInHomeViewOk returns a tuple with the InHomeView field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetInHomeViewOk() (*bool, bool) {
	if o == nil || o.InHomeView == nil {
		return nil, false
	}
	return o.InHomeView, true
}

// HasInHomeView returns a boolean if a field has been set.
func (o *Subscriptions) HasInHomeView() bool {
	if o != nil && o.InHomeView != nil {
		return true
	}

	return false
}

// SetInHomeView gets a reference to the given bool and assigns it to the InHomeView field.
func (o *Subscriptions) SetInHomeView(v bool) {
	o.InHomeView = &v
}

// GetIsAnnouncementOnly returns the IsAnnouncementOnly field value if set, zero value otherwise.
func (o *Subscriptions) GetIsAnnouncementOnly() bool {
	if o == nil || o.IsAnnouncementOnly == nil {
		var ret bool
		return ret
	}
	return *o.IsAnnouncementOnly
}

// GetIsAnnouncementOnlyOk returns a tuple with the IsAnnouncementOnly field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetIsAnnouncementOnlyOk() (*bool, bool) {
	if o == nil || o.IsAnnouncementOnly == nil {
		return nil, false
	}
	return o.IsAnnouncementOnly, true
}

// HasIsAnnouncementOnly returns a boolean if a field has been set.
func (o *Subscriptions) HasIsAnnouncementOnly() bool {
	if o != nil && o.IsAnnouncementOnly != nil {
		return true
	}

	return false
}

// SetIsAnnouncementOnly gets a reference to the given bool and assigns it to the IsAnnouncementOnly field.
func (o *Subscriptions) SetIsAnnouncementOnly(v bool) {
	o.IsAnnouncementOnly = &v
}

// GetIsWebPublic returns the IsWebPublic field value if set, zero value otherwise.
func (o *Subscriptions) GetIsWebPublic() bool {
	if o == nil || o.IsWebPublic == nil {
		var ret bool
		return ret
	}
	return *o.IsWebPublic
}

// GetIsWebPublicOk returns a tuple with the IsWebPublic field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetIsWebPublicOk() (*bool, bool) {
	if o == nil || o.IsWebPublic == nil {
		return nil, false
	}
	return o.IsWebPublic, true
}

// HasIsWebPublic returns a boolean if a field has been set.
func (o *Subscriptions) HasIsWebPublic() bool {
	if o != nil && o.IsWebPublic != nil {
		return true
	}

	return false
}

// SetIsWebPublic gets a reference to the given bool and assigns it to the IsWebPublic field.
func (o *Subscriptions) SetIsWebPublic(v bool) {
	o.IsWebPublic = &v
}

// GetRole returns the Role field value if set, zero value otherwise.
func (o *Subscriptions) GetRole() int32 {
	if o == nil || o.Role == nil {
		var ret int32
		return ret
	}
	return *o.Role
}

// GetRoleOk returns a tuple with the Role field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetRoleOk() (*int32, bool) {
	if o == nil || o.Role == nil {
		return nil, false
	}
	return o.Role, true
}

// HasRole returns a boolean if a field has been set.
func (o *Subscriptions) HasRole() bool {
	if o != nil && o.Role != nil {
		return true
	}

	return false
}

// SetRole gets a reference to the given int32 and assigns it to the Role field.
func (o *Subscriptions) SetRole(v int32) {
	o.Role = &v
}

// GetColor returns the Color field value if set, zero value otherwise.
func (o *Subscriptions) GetColor() string {
	if o == nil || o.Color == nil {
		var ret string
		return ret
	}
	return *o.Color
}

// GetColorOk returns a tuple with the Color field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetColorOk() (*string, bool) {
	if o == nil || o.Color == nil {
		return nil, false
	}
	return o.Color, true
}

// HasColor returns a boolean if a field has been set.
func (o *Subscriptions) HasColor() bool {
	if o != nil && o.Color != nil {
		return true
	}

	return false
}

// SetColor gets a reference to the given string and assigns it to the Color field.
func (o *Subscriptions) SetColor(v string) {
	o.Color = &v
}

// GetStreamPostPolicy returns the StreamPostPolicy field value if set, zero value otherwise.
func (o *Subscriptions) GetStreamPostPolicy() int32 {
	if o == nil || o.StreamPostPolicy == nil {
		var ret int32
		return ret
	}
	return *o.StreamPostPolicy
}

// GetStreamPostPolicyOk returns a tuple with the StreamPostPolicy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetStreamPostPolicyOk() (*int32, bool) {
	if o == nil || o.StreamPostPolicy == nil {
		return nil, false
	}
	return o.StreamPostPolicy, true
}

// HasStreamPostPolicy returns a boolean if a field has been set.
func (o *Subscriptions) HasStreamPostPolicy() bool {
	if o != nil && o.StreamPostPolicy != nil {
		return true
	}

	return false
}

// SetStreamPostPolicy gets a reference to the given int32 and assigns it to the StreamPostPolicy field.
func (o *Subscriptions) SetStreamPostPolicy(v int32) {
	o.StreamPostPolicy = &v
}

// GetMessageRetentionDays returns the MessageRetentionDays field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetMessageRetentionDays() int32 {
	if o == nil || o.MessageRetentionDays.Get() == nil {
		var ret int32
		return ret
	}
	return *o.MessageRetentionDays.Get()
}

// GetMessageRetentionDaysOk returns a tuple with the MessageRetentionDays field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetMessageRetentionDaysOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.MessageRetentionDays.Get(), o.MessageRetentionDays.IsSet()
}

// HasMessageRetentionDays returns a boolean if a field has been set.
func (o *Subscriptions) HasMessageRetentionDays() bool {
	if o != nil && o.MessageRetentionDays.IsSet() {
		return true
	}

	return false
}

// SetMessageRetentionDays gets a reference to the given NullableInt32 and assigns it to the MessageRetentionDays field.
func (o *Subscriptions) SetMessageRetentionDays(v int32) {
	o.MessageRetentionDays.Set(&v)
}
// SetMessageRetentionDaysNil sets the value for MessageRetentionDays to be an explicit nil
func (o *Subscriptions) SetMessageRetentionDaysNil() {
	o.MessageRetentionDays.Set(nil)
}

// UnsetMessageRetentionDays ensures that no value is present for MessageRetentionDays, not even an explicit nil
func (o *Subscriptions) UnsetMessageRetentionDays() {
	o.MessageRetentionDays.Unset()
}

// GetHistoryPublicToSubscribers returns the HistoryPublicToSubscribers field value if set, zero value otherwise.
func (o *Subscriptions) GetHistoryPublicToSubscribers() bool {
	if o == nil || o.HistoryPublicToSubscribers == nil {
		var ret bool
		return ret
	}
	return *o.HistoryPublicToSubscribers
}

// GetHistoryPublicToSubscribersOk returns a tuple with the HistoryPublicToSubscribers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subscriptions) GetHistoryPublicToSubscribersOk() (*bool, bool) {
	if o == nil || o.HistoryPublicToSubscribers == nil {
		return nil, false
	}
	return o.HistoryPublicToSubscribers, true
}

// HasHistoryPublicToSubscribers returns a boolean if a field has been set.
func (o *Subscriptions) HasHistoryPublicToSubscribers() bool {
	if o != nil && o.HistoryPublicToSubscribers != nil {
		return true
	}

	return false
}

// SetHistoryPublicToSubscribers gets a reference to the given bool and assigns it to the HistoryPublicToSubscribers field.
func (o *Subscriptions) SetHistoryPublicToSubscribers(v bool) {
	o.HistoryPublicToSubscribers = &v
}

// GetFirstMessageId returns the FirstMessageId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetFirstMessageId() int32 {
	if o == nil || o.FirstMessageId.Get() == nil {
		var ret int32
		return ret
	}
	return *o.FirstMessageId.Get()
}

// GetFirstMessageIdOk returns a tuple with the FirstMessageId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetFirstMessageIdOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.FirstMessageId.Get(), o.FirstMessageId.IsSet()
}

// HasFirstMessageId returns a boolean if a field has been set.
func (o *Subscriptions) HasFirstMessageId() bool {
	if o != nil && o.FirstMessageId.IsSet() {
		return true
	}

	return false
}

// SetFirstMessageId gets a reference to the given NullableInt32 and assigns it to the FirstMessageId field.
func (o *Subscriptions) SetFirstMessageId(v int32) {
	o.FirstMessageId.Set(&v)
}
// SetFirstMessageIdNil sets the value for FirstMessageId to be an explicit nil
func (o *Subscriptions) SetFirstMessageIdNil() {
	o.FirstMessageId.Set(nil)
}

// UnsetFirstMessageId ensures that no value is present for FirstMessageId, not even an explicit nil
func (o *Subscriptions) UnsetFirstMessageId() {
	o.FirstMessageId.Unset()
}

// GetStreamWeeklyTraffic returns the StreamWeeklyTraffic field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Subscriptions) GetStreamWeeklyTraffic() int32 {
	if o == nil || o.StreamWeeklyTraffic.Get() == nil {
		var ret int32
		return ret
	}
	return *o.StreamWeeklyTraffic.Get()
}

// GetStreamWeeklyTrafficOk returns a tuple with the StreamWeeklyTraffic field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Subscriptions) GetStreamWeeklyTrafficOk() (*int32, bool) {
	if o == nil  {
		return nil, false
	}
	return o.StreamWeeklyTraffic.Get(), o.StreamWeeklyTraffic.IsSet()
}

// HasStreamWeeklyTraffic returns a boolean if a field has been set.
func (o *Subscriptions) HasStreamWeeklyTraffic() bool {
	if o != nil && o.StreamWeeklyTraffic.IsSet() {
		return true
	}

	return false
}

// SetStreamWeeklyTraffic gets a reference to the given NullableInt32 and assigns it to the StreamWeeklyTraffic field.
func (o *Subscriptions) SetStreamWeeklyTraffic(v int32) {
	o.StreamWeeklyTraffic.Set(&v)
}
// SetStreamWeeklyTrafficNil sets the value for StreamWeeklyTraffic to be an explicit nil
func (o *Subscriptions) SetStreamWeeklyTrafficNil() {
	o.StreamWeeklyTraffic.Set(nil)
}

// UnsetStreamWeeklyTraffic ensures that no value is present for StreamWeeklyTraffic, not even an explicit nil
func (o *Subscriptions) UnsetStreamWeeklyTraffic() {
	o.StreamWeeklyTraffic.Unset()
}

func (o Subscriptions) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.StreamId != nil {
		toSerialize["stream_id"] = o.StreamId
	}
	if o.Name != nil {
		toSerialize["name"] = o.Name
	}
	if o.Description != nil {
		toSerialize["description"] = o.Description
	}
	if o.RenderedDescription != nil {
		toSerialize["rendered_description"] = o.RenderedDescription
	}
	if o.DateCreated != nil {
		toSerialize["date_created"] = o.DateCreated
	}
	if o.InviteOnly != nil {
		toSerialize["invite_only"] = o.InviteOnly
	}
	if o.Subscribers != nil {
		toSerialize["subscribers"] = o.Subscribers
	}
	if o.DesktopNotifications.IsSet() {
		toSerialize["desktop_notifications"] = o.DesktopNotifications.Get()
	}
	if o.EmailNotifications.IsSet() {
		toSerialize["email_notifications"] = o.EmailNotifications.Get()
	}
	if o.WildcardMentionsNotify.IsSet() {
		toSerialize["wildcard_mentions_notify"] = o.WildcardMentionsNotify.Get()
	}
	if o.PushNotifications.IsSet() {
		toSerialize["push_notifications"] = o.PushNotifications.Get()
	}
	if o.AudibleNotifications.IsSet() {
		toSerialize["audible_notifications"] = o.AudibleNotifications.Get()
	}
	if o.PinToTop != nil {
		toSerialize["pin_to_top"] = o.PinToTop
	}
	if o.EmailAddress != nil {
		toSerialize["email_address"] = o.EmailAddress
	}
	if o.IsMuted != nil {
		toSerialize["is_muted"] = o.IsMuted
	}
	if o.InHomeView != nil {
		toSerialize["in_home_view"] = o.InHomeView
	}
	if o.IsAnnouncementOnly != nil {
		toSerialize["is_announcement_only"] = o.IsAnnouncementOnly
	}
	if o.IsWebPublic != nil {
		toSerialize["is_web_public"] = o.IsWebPublic
	}
	if o.Role != nil {
		toSerialize["role"] = o.Role
	}
	if o.Color != nil {
		toSerialize["color"] = o.Color
	}
	if o.StreamPostPolicy != nil {
		toSerialize["stream_post_policy"] = o.StreamPostPolicy
	}
	if o.MessageRetentionDays.IsSet() {
		toSerialize["message_retention_days"] = o.MessageRetentionDays.Get()
	}
	if o.HistoryPublicToSubscribers != nil {
		toSerialize["history_public_to_subscribers"] = o.HistoryPublicToSubscribers
	}
	if o.FirstMessageId.IsSet() {
		toSerialize["first_message_id"] = o.FirstMessageId.Get()
	}
	if o.StreamWeeklyTraffic.IsSet() {
		toSerialize["stream_weekly_traffic"] = o.StreamWeeklyTraffic.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableSubscriptions struct {
	value *Subscriptions
	isSet bool
}

func (v NullableSubscriptions) Get() *Subscriptions {
	return v.value
}

func (v *NullableSubscriptions) Set(val *Subscriptions) {
	v.value = val
	v.isSet = true
}

func (v NullableSubscriptions) IsSet() bool {
	return v.isSet
}

func (v *NullableSubscriptions) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubscriptions(val *Subscriptions) *NullableSubscriptions {
	return &NullableSubscriptions{value: val, isSet: true}
}

func (v NullableSubscriptions) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubscriptions) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


