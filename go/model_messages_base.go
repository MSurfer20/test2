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

// MessagesBase Object containing details of the message. 
type MessagesBase struct {
	// The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
	AvatarUrl NullableString `json:"avatar_url,omitempty"`
	// A Zulip \"client\" string, describing what Zulip client sent the message. 
	Client *string `json:"client,omitempty"`
	// The content/body of the message. 
	Content *string `json:"content,omitempty"`
	// The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
	ContentType *string `json:"content_type,omitempty"`
	// Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
	DisplayRecipient *OneOfstringarray `json:"display_recipient,omitempty"`
	// The unique message ID.  Messages should always be displayed sorted by ID. 
	Id *int32 `json:"id,omitempty"`
	// Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
	IsMeMessage *bool `json:"is_me_message,omitempty"`
	// Data on any reactions to the message. 
	Reactions *[]EmojiReaction `json:"reactions,omitempty"`
	// A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
	RecipientId *int32 `json:"recipient_id,omitempty"`
	// The Zulip display email address of the message's sender. 
	SenderEmail *string `json:"sender_email,omitempty"`
	// The full name of the message's sender. 
	SenderFullName *string `json:"sender_full_name,omitempty"`
	// The user ID of the message's sender. 
	SenderId *int32 `json:"sender_id,omitempty"`
	// A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
	SenderRealmStr *string `json:"sender_realm_str,omitempty"`
	// Only present for stream messages; the ID of the stream. 
	StreamId *int32 `json:"stream_id,omitempty"`
	// The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
	Subject *string `json:"subject,omitempty"`
	// Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
	TopicLinks *[]MessagesBaseTopicLinks `json:"topic_links,omitempty"`
	// Data used for certain experimental Zulip integrations. 
	Submessages *[]string `json:"submessages,omitempty"`
	// The UNIX timestamp for when the message was sent, in UTC seconds. 
	Timestamp *int32 `json:"timestamp,omitempty"`
	// The type of the message: `stream` or `private`. 
	Type *string `json:"type,omitempty"`
}

// NewMessagesBase instantiates a new MessagesBase object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessagesBase() *MessagesBase {
	this := MessagesBase{}
	return &this
}

// NewMessagesBaseWithDefaults instantiates a new MessagesBase object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessagesBaseWithDefaults() *MessagesBase {
	this := MessagesBase{}
	return &this
}

// GetAvatarUrl returns the AvatarUrl field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *MessagesBase) GetAvatarUrl() string {
	if o == nil || o.AvatarUrl.Get() == nil {
		var ret string
		return ret
	}
	return *o.AvatarUrl.Get()
}

// GetAvatarUrlOk returns a tuple with the AvatarUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *MessagesBase) GetAvatarUrlOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.AvatarUrl.Get(), o.AvatarUrl.IsSet()
}

// HasAvatarUrl returns a boolean if a field has been set.
func (o *MessagesBase) HasAvatarUrl() bool {
	if o != nil && o.AvatarUrl.IsSet() {
		return true
	}

	return false
}

// SetAvatarUrl gets a reference to the given NullableString and assigns it to the AvatarUrl field.
func (o *MessagesBase) SetAvatarUrl(v string) {
	o.AvatarUrl.Set(&v)
}
// SetAvatarUrlNil sets the value for AvatarUrl to be an explicit nil
func (o *MessagesBase) SetAvatarUrlNil() {
	o.AvatarUrl.Set(nil)
}

// UnsetAvatarUrl ensures that no value is present for AvatarUrl, not even an explicit nil
func (o *MessagesBase) UnsetAvatarUrl() {
	o.AvatarUrl.Unset()
}

// GetClient returns the Client field value if set, zero value otherwise.
func (o *MessagesBase) GetClient() string {
	if o == nil || o.Client == nil {
		var ret string
		return ret
	}
	return *o.Client
}

// GetClientOk returns a tuple with the Client field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetClientOk() (*string, bool) {
	if o == nil || o.Client == nil {
		return nil, false
	}
	return o.Client, true
}

// HasClient returns a boolean if a field has been set.
func (o *MessagesBase) HasClient() bool {
	if o != nil && o.Client != nil {
		return true
	}

	return false
}

// SetClient gets a reference to the given string and assigns it to the Client field.
func (o *MessagesBase) SetClient(v string) {
	o.Client = &v
}

// GetContent returns the Content field value if set, zero value otherwise.
func (o *MessagesBase) GetContent() string {
	if o == nil || o.Content == nil {
		var ret string
		return ret
	}
	return *o.Content
}

// GetContentOk returns a tuple with the Content field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetContentOk() (*string, bool) {
	if o == nil || o.Content == nil {
		return nil, false
	}
	return o.Content, true
}

// HasContent returns a boolean if a field has been set.
func (o *MessagesBase) HasContent() bool {
	if o != nil && o.Content != nil {
		return true
	}

	return false
}

// SetContent gets a reference to the given string and assigns it to the Content field.
func (o *MessagesBase) SetContent(v string) {
	o.Content = &v
}

// GetContentType returns the ContentType field value if set, zero value otherwise.
func (o *MessagesBase) GetContentType() string {
	if o == nil || o.ContentType == nil {
		var ret string
		return ret
	}
	return *o.ContentType
}

// GetContentTypeOk returns a tuple with the ContentType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetContentTypeOk() (*string, bool) {
	if o == nil || o.ContentType == nil {
		return nil, false
	}
	return o.ContentType, true
}

// HasContentType returns a boolean if a field has been set.
func (o *MessagesBase) HasContentType() bool {
	if o != nil && o.ContentType != nil {
		return true
	}

	return false
}

// SetContentType gets a reference to the given string and assigns it to the ContentType field.
func (o *MessagesBase) SetContentType(v string) {
	o.ContentType = &v
}

// GetDisplayRecipient returns the DisplayRecipient field value if set, zero value otherwise.
func (o *MessagesBase) GetDisplayRecipient() OneOfstringarray {
	if o == nil || o.DisplayRecipient == nil {
		var ret OneOfstringarray
		return ret
	}
	return *o.DisplayRecipient
}

// GetDisplayRecipientOk returns a tuple with the DisplayRecipient field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetDisplayRecipientOk() (*OneOfstringarray, bool) {
	if o == nil || o.DisplayRecipient == nil {
		return nil, false
	}
	return o.DisplayRecipient, true
}

// HasDisplayRecipient returns a boolean if a field has been set.
func (o *MessagesBase) HasDisplayRecipient() bool {
	if o != nil && o.DisplayRecipient != nil {
		return true
	}

	return false
}

// SetDisplayRecipient gets a reference to the given OneOfstringarray and assigns it to the DisplayRecipient field.
func (o *MessagesBase) SetDisplayRecipient(v OneOfstringarray) {
	o.DisplayRecipient = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *MessagesBase) GetId() int32 {
	if o == nil || o.Id == nil {
		var ret int32
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetIdOk() (*int32, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *MessagesBase) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given int32 and assigns it to the Id field.
func (o *MessagesBase) SetId(v int32) {
	o.Id = &v
}

// GetIsMeMessage returns the IsMeMessage field value if set, zero value otherwise.
func (o *MessagesBase) GetIsMeMessage() bool {
	if o == nil || o.IsMeMessage == nil {
		var ret bool
		return ret
	}
	return *o.IsMeMessage
}

// GetIsMeMessageOk returns a tuple with the IsMeMessage field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetIsMeMessageOk() (*bool, bool) {
	if o == nil || o.IsMeMessage == nil {
		return nil, false
	}
	return o.IsMeMessage, true
}

// HasIsMeMessage returns a boolean if a field has been set.
func (o *MessagesBase) HasIsMeMessage() bool {
	if o != nil && o.IsMeMessage != nil {
		return true
	}

	return false
}

// SetIsMeMessage gets a reference to the given bool and assigns it to the IsMeMessage field.
func (o *MessagesBase) SetIsMeMessage(v bool) {
	o.IsMeMessage = &v
}

// GetReactions returns the Reactions field value if set, zero value otherwise.
func (o *MessagesBase) GetReactions() []EmojiReaction {
	if o == nil || o.Reactions == nil {
		var ret []EmojiReaction
		return ret
	}
	return *o.Reactions
}

// GetReactionsOk returns a tuple with the Reactions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetReactionsOk() (*[]EmojiReaction, bool) {
	if o == nil || o.Reactions == nil {
		return nil, false
	}
	return o.Reactions, true
}

// HasReactions returns a boolean if a field has been set.
func (o *MessagesBase) HasReactions() bool {
	if o != nil && o.Reactions != nil {
		return true
	}

	return false
}

// SetReactions gets a reference to the given []EmojiReaction and assigns it to the Reactions field.
func (o *MessagesBase) SetReactions(v []EmojiReaction) {
	o.Reactions = &v
}

// GetRecipientId returns the RecipientId field value if set, zero value otherwise.
func (o *MessagesBase) GetRecipientId() int32 {
	if o == nil || o.RecipientId == nil {
		var ret int32
		return ret
	}
	return *o.RecipientId
}

// GetRecipientIdOk returns a tuple with the RecipientId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetRecipientIdOk() (*int32, bool) {
	if o == nil || o.RecipientId == nil {
		return nil, false
	}
	return o.RecipientId, true
}

// HasRecipientId returns a boolean if a field has been set.
func (o *MessagesBase) HasRecipientId() bool {
	if o != nil && o.RecipientId != nil {
		return true
	}

	return false
}

// SetRecipientId gets a reference to the given int32 and assigns it to the RecipientId field.
func (o *MessagesBase) SetRecipientId(v int32) {
	o.RecipientId = &v
}

// GetSenderEmail returns the SenderEmail field value if set, zero value otherwise.
func (o *MessagesBase) GetSenderEmail() string {
	if o == nil || o.SenderEmail == nil {
		var ret string
		return ret
	}
	return *o.SenderEmail
}

// GetSenderEmailOk returns a tuple with the SenderEmail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetSenderEmailOk() (*string, bool) {
	if o == nil || o.SenderEmail == nil {
		return nil, false
	}
	return o.SenderEmail, true
}

// HasSenderEmail returns a boolean if a field has been set.
func (o *MessagesBase) HasSenderEmail() bool {
	if o != nil && o.SenderEmail != nil {
		return true
	}

	return false
}

// SetSenderEmail gets a reference to the given string and assigns it to the SenderEmail field.
func (o *MessagesBase) SetSenderEmail(v string) {
	o.SenderEmail = &v
}

// GetSenderFullName returns the SenderFullName field value if set, zero value otherwise.
func (o *MessagesBase) GetSenderFullName() string {
	if o == nil || o.SenderFullName == nil {
		var ret string
		return ret
	}
	return *o.SenderFullName
}

// GetSenderFullNameOk returns a tuple with the SenderFullName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetSenderFullNameOk() (*string, bool) {
	if o == nil || o.SenderFullName == nil {
		return nil, false
	}
	return o.SenderFullName, true
}

// HasSenderFullName returns a boolean if a field has been set.
func (o *MessagesBase) HasSenderFullName() bool {
	if o != nil && o.SenderFullName != nil {
		return true
	}

	return false
}

// SetSenderFullName gets a reference to the given string and assigns it to the SenderFullName field.
func (o *MessagesBase) SetSenderFullName(v string) {
	o.SenderFullName = &v
}

// GetSenderId returns the SenderId field value if set, zero value otherwise.
func (o *MessagesBase) GetSenderId() int32 {
	if o == nil || o.SenderId == nil {
		var ret int32
		return ret
	}
	return *o.SenderId
}

// GetSenderIdOk returns a tuple with the SenderId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetSenderIdOk() (*int32, bool) {
	if o == nil || o.SenderId == nil {
		return nil, false
	}
	return o.SenderId, true
}

// HasSenderId returns a boolean if a field has been set.
func (o *MessagesBase) HasSenderId() bool {
	if o != nil && o.SenderId != nil {
		return true
	}

	return false
}

// SetSenderId gets a reference to the given int32 and assigns it to the SenderId field.
func (o *MessagesBase) SetSenderId(v int32) {
	o.SenderId = &v
}

// GetSenderRealmStr returns the SenderRealmStr field value if set, zero value otherwise.
func (o *MessagesBase) GetSenderRealmStr() string {
	if o == nil || o.SenderRealmStr == nil {
		var ret string
		return ret
	}
	return *o.SenderRealmStr
}

// GetSenderRealmStrOk returns a tuple with the SenderRealmStr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetSenderRealmStrOk() (*string, bool) {
	if o == nil || o.SenderRealmStr == nil {
		return nil, false
	}
	return o.SenderRealmStr, true
}

// HasSenderRealmStr returns a boolean if a field has been set.
func (o *MessagesBase) HasSenderRealmStr() bool {
	if o != nil && o.SenderRealmStr != nil {
		return true
	}

	return false
}

// SetSenderRealmStr gets a reference to the given string and assigns it to the SenderRealmStr field.
func (o *MessagesBase) SetSenderRealmStr(v string) {
	o.SenderRealmStr = &v
}

// GetStreamId returns the StreamId field value if set, zero value otherwise.
func (o *MessagesBase) GetStreamId() int32 {
	if o == nil || o.StreamId == nil {
		var ret int32
		return ret
	}
	return *o.StreamId
}

// GetStreamIdOk returns a tuple with the StreamId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetStreamIdOk() (*int32, bool) {
	if o == nil || o.StreamId == nil {
		return nil, false
	}
	return o.StreamId, true
}

// HasStreamId returns a boolean if a field has been set.
func (o *MessagesBase) HasStreamId() bool {
	if o != nil && o.StreamId != nil {
		return true
	}

	return false
}

// SetStreamId gets a reference to the given int32 and assigns it to the StreamId field.
func (o *MessagesBase) SetStreamId(v int32) {
	o.StreamId = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *MessagesBase) GetSubject() string {
	if o == nil || o.Subject == nil {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetSubjectOk() (*string, bool) {
	if o == nil || o.Subject == nil {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *MessagesBase) HasSubject() bool {
	if o != nil && o.Subject != nil {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *MessagesBase) SetSubject(v string) {
	o.Subject = &v
}

// GetTopicLinks returns the TopicLinks field value if set, zero value otherwise.
func (o *MessagesBase) GetTopicLinks() []MessagesBaseTopicLinks {
	if o == nil || o.TopicLinks == nil {
		var ret []MessagesBaseTopicLinks
		return ret
	}
	return *o.TopicLinks
}

// GetTopicLinksOk returns a tuple with the TopicLinks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetTopicLinksOk() (*[]MessagesBaseTopicLinks, bool) {
	if o == nil || o.TopicLinks == nil {
		return nil, false
	}
	return o.TopicLinks, true
}

// HasTopicLinks returns a boolean if a field has been set.
func (o *MessagesBase) HasTopicLinks() bool {
	if o != nil && o.TopicLinks != nil {
		return true
	}

	return false
}

// SetTopicLinks gets a reference to the given []MessagesBaseTopicLinks and assigns it to the TopicLinks field.
func (o *MessagesBase) SetTopicLinks(v []MessagesBaseTopicLinks) {
	o.TopicLinks = &v
}

// GetSubmessages returns the Submessages field value if set, zero value otherwise.
func (o *MessagesBase) GetSubmessages() []string {
	if o == nil || o.Submessages == nil {
		var ret []string
		return ret
	}
	return *o.Submessages
}

// GetSubmessagesOk returns a tuple with the Submessages field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetSubmessagesOk() (*[]string, bool) {
	if o == nil || o.Submessages == nil {
		return nil, false
	}
	return o.Submessages, true
}

// HasSubmessages returns a boolean if a field has been set.
func (o *MessagesBase) HasSubmessages() bool {
	if o != nil && o.Submessages != nil {
		return true
	}

	return false
}

// SetSubmessages gets a reference to the given []string and assigns it to the Submessages field.
func (o *MessagesBase) SetSubmessages(v []string) {
	o.Submessages = &v
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *MessagesBase) GetTimestamp() int32 {
	if o == nil || o.Timestamp == nil {
		var ret int32
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetTimestampOk() (*int32, bool) {
	if o == nil || o.Timestamp == nil {
		return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *MessagesBase) HasTimestamp() bool {
	if o != nil && o.Timestamp != nil {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given int32 and assigns it to the Timestamp field.
func (o *MessagesBase) SetTimestamp(v int32) {
	o.Timestamp = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *MessagesBase) GetType() string {
	if o == nil || o.Type == nil {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessagesBase) GetTypeOk() (*string, bool) {
	if o == nil || o.Type == nil {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *MessagesBase) HasType() bool {
	if o != nil && o.Type != nil {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *MessagesBase) SetType(v string) {
	o.Type = &v
}

func (o MessagesBase) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.AvatarUrl.IsSet() {
		toSerialize["avatar_url"] = o.AvatarUrl.Get()
	}
	if o.Client != nil {
		toSerialize["client"] = o.Client
	}
	if o.Content != nil {
		toSerialize["content"] = o.Content
	}
	if o.ContentType != nil {
		toSerialize["content_type"] = o.ContentType
	}
	if o.DisplayRecipient != nil {
		toSerialize["display_recipient"] = o.DisplayRecipient
	}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.IsMeMessage != nil {
		toSerialize["is_me_message"] = o.IsMeMessage
	}
	if o.Reactions != nil {
		toSerialize["reactions"] = o.Reactions
	}
	if o.RecipientId != nil {
		toSerialize["recipient_id"] = o.RecipientId
	}
	if o.SenderEmail != nil {
		toSerialize["sender_email"] = o.SenderEmail
	}
	if o.SenderFullName != nil {
		toSerialize["sender_full_name"] = o.SenderFullName
	}
	if o.SenderId != nil {
		toSerialize["sender_id"] = o.SenderId
	}
	if o.SenderRealmStr != nil {
		toSerialize["sender_realm_str"] = o.SenderRealmStr
	}
	if o.StreamId != nil {
		toSerialize["stream_id"] = o.StreamId
	}
	if o.Subject != nil {
		toSerialize["subject"] = o.Subject
	}
	if o.TopicLinks != nil {
		toSerialize["topic_links"] = o.TopicLinks
	}
	if o.Submessages != nil {
		toSerialize["submessages"] = o.Submessages
	}
	if o.Timestamp != nil {
		toSerialize["timestamp"] = o.Timestamp
	}
	if o.Type != nil {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableMessagesBase struct {
	value *MessagesBase
	isSet bool
}

func (v NullableMessagesBase) Get() *MessagesBase {
	return v.value
}

func (v *NullableMessagesBase) Set(val *MessagesBase) {
	v.value = val
	v.isSet = true
}

func (v NullableMessagesBase) IsSet() bool {
	return v.isSet
}

func (v *NullableMessagesBase) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessagesBase(val *MessagesBase) *NullableMessagesBase {
	return &NullableMessagesBase{value: val, isSet: true}
}

func (v NullableMessagesBase) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessagesBase) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

