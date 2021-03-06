# Rust API client for openapi

Powerful open source group chat


## Overview

This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.RustClientCodegen
For more information, please visit [https://zulip.com](https://zulip.com)

## Installation

Put the package under your project folder and add the following to `Cargo.toml` under `[dependencies]`:

```
    openapi = { path = "./generated" }
```

## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**dev_fetch_api_key**](docs/AuthenticationApi.md#dev_fetch_api_key) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | [**fetch_api_key**](docs/AuthenticationApi.md#fetch_api_key) | **POST** /fetch_api_key | Fetch an API key (production)
*DraftsApi* | [**create_drafts**](docs/DraftsApi.md#create_drafts) | **POST** /drafts | Create drafts
*DraftsApi* | [**delete_draft**](docs/DraftsApi.md#delete_draft) | **DELETE** /drafts/{draft_id} | Delete a draft
*DraftsApi* | [**edit_draft**](docs/DraftsApi.md#edit_draft) | **PATCH** /drafts/{draft_id} | Edit a draft
*DraftsApi* | [**get_drafts**](docs/DraftsApi.md#get_drafts) | **GET** /drafts | Get drafts
*MessagesApi* | [**add_reaction**](docs/MessagesApi.md#add_reaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*MessagesApi* | [**check_messages_match_narrow**](docs/MessagesApi.md#check_messages_match_narrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | [**delete_message**](docs/MessagesApi.md#delete_message) | **DELETE** /messages/{message_id} | Delete a message
*MessagesApi* | [**get_file_temporary_url**](docs/MessagesApi.md#get_file_temporary_url) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*MessagesApi* | [**get_message_history**](docs/MessagesApi.md#get_message_history) | **GET** /messages/{message_id}/history | Get a message's edit history
*MessagesApi* | [**get_messages**](docs/MessagesApi.md#get_messages) | **GET** /messages | Get messages
*MessagesApi* | [**get_raw_message**](docs/MessagesApi.md#get_raw_message) | **GET** /messages/{message_id} | Get a message's raw Markdown
*MessagesApi* | [**mark_all_as_read**](docs/MessagesApi.md#mark_all_as_read) | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | [**mark_stream_as_read**](docs/MessagesApi.md#mark_stream_as_read) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | [**mark_topic_as_read**](docs/MessagesApi.md#mark_topic_as_read) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | [**remove_reaction**](docs/MessagesApi.md#remove_reaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*MessagesApi* | [**render_message**](docs/MessagesApi.md#render_message) | **POST** /messages/render | Render message
*MessagesApi* | [**send_message**](docs/MessagesApi.md#send_message) | **POST** /messages | Send a message
*MessagesApi* | [**update_message**](docs/MessagesApi.md#update_message) | **PATCH** /messages/{message_id} | Edit a message
*MessagesApi* | [**update_message_flags**](docs/MessagesApi.md#update_message_flags) | **POST** /messages/flags | Update personal message flags
*MessagesApi* | [**upload_file**](docs/MessagesApi.md#upload_file) | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | [**delete_queue**](docs/RealTimeEventsApi.md#delete_queue) | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | [**get_events**](docs/RealTimeEventsApi.md#get_events) | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | [**real_time_post**](docs/RealTimeEventsApi.md#real_time_post) | **POST** /real-time | 
*RealTimeEventsApi* | [**register_queue**](docs/RealTimeEventsApi.md#register_queue) | **POST** /register | Register an event queue
*RealTimeEventsApi* | [**rest_error_handling**](docs/RealTimeEventsApi.md#rest_error_handling) | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | [**add_code_playground**](docs/ServerAndOrganizationsApi.md#add_code_playground) | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | [**add_linkifier**](docs/ServerAndOrganizationsApi.md#add_linkifier) | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | [**create_custom_profile_field**](docs/ServerAndOrganizationsApi.md#create_custom_profile_field) | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | [**get_custom_emoji**](docs/ServerAndOrganizationsApi.md#get_custom_emoji) | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | [**get_custom_profile_fields**](docs/ServerAndOrganizationsApi.md#get_custom_profile_fields) | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | [**get_linkifiers**](docs/ServerAndOrganizationsApi.md#get_linkifiers) | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | [**get_server_settings**](docs/ServerAndOrganizationsApi.md#get_server_settings) | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | [**remove_code_playground**](docs/ServerAndOrganizationsApi.md#remove_code_playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*ServerAndOrganizationsApi* | [**remove_linkifier**](docs/ServerAndOrganizationsApi.md#remove_linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*ServerAndOrganizationsApi* | [**reorder_custom_profile_fields**](docs/ServerAndOrganizationsApi.md#reorder_custom_profile_fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | [**update_linkifier**](docs/ServerAndOrganizationsApi.md#update_linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*ServerAndOrganizationsApi* | [**upload_custom_emoji**](docs/ServerAndOrganizationsApi.md#upload_custom_emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*StreamsApi* | [**archive_stream**](docs/StreamsApi.md#archive_stream) | **DELETE** /streams/{stream_id} | Archive a stream
*StreamsApi* | [**create_big_blue_button_video_call**](docs/StreamsApi.md#create_big_blue_button_video_call) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | [**delete_topic**](docs/StreamsApi.md#delete_topic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
*StreamsApi* | [**get_stream_id**](docs/StreamsApi.md#get_stream_id) | **GET** /get_stream_id | Get stream ID
*StreamsApi* | [**get_stream_topics**](docs/StreamsApi.md#get_stream_topics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*StreamsApi* | [**get_streams**](docs/StreamsApi.md#get_streams) | **GET** /streams | Get all streams
*StreamsApi* | [**get_subscribers**](docs/StreamsApi.md#get_subscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
*StreamsApi* | [**get_subscription_status**](docs/StreamsApi.md#get_subscription_status) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*StreamsApi* | [**get_subscriptions**](docs/StreamsApi.md#get_subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | [**mute_topic**](docs/StreamsApi.md#mute_topic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | [**subscribe**](docs/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | [**unsubscribe**](docs/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | [**update_stream**](docs/StreamsApi.md#update_stream) | **PATCH** /streams/{stream_id} | Update a stream
*StreamsApi* | [**update_subscription_settings**](docs/StreamsApi.md#update_subscription_settings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | [**update_subscriptions**](docs/StreamsApi.md#update_subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | [**create_user**](docs/UsersApi.md#create_user) | **POST** /users | Create a user
*UsersApi* | [**create_user_group**](docs/UsersApi.md#create_user_group) | **POST** /user_groups/create | Create a user group
*UsersApi* | [**deactivate_own_user**](docs/UsersApi.md#deactivate_own_user) | **DELETE** /users/me | Deactivate own user
*UsersApi* | [**deactivate_user**](docs/UsersApi.md#deactivate_user) | **DELETE** /users/{user_id} | Deactivate a user
*UsersApi* | [**get_attachments**](docs/UsersApi.md#get_attachments) | **GET** /attachments | Get attachments
*UsersApi* | [**get_own_user**](docs/UsersApi.md#get_own_user) | **GET** /users/me | Get own user
*UsersApi* | [**get_user**](docs/UsersApi.md#get_user) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**get_user_by_email**](docs/UsersApi.md#get_user_by_email) | **GET** /users/{email} | Get a user by email
*UsersApi* | [**get_user_groups**](docs/UsersApi.md#get_user_groups) | **GET** /user_groups | Get user groups
*UsersApi* | [**get_user_presence**](docs/UsersApi.md#get_user_presence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*UsersApi* | [**get_users**](docs/UsersApi.md#get_users) | **GET** /users | Get all users
*UsersApi* | [**mute_user**](docs/UsersApi.md#mute_user) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*UsersApi* | [**reactivate_user**](docs/UsersApi.md#reactivate_user) | **POST** /users/{user_id}/reactivate | Reactivate a user
*UsersApi* | [**remove_user_group**](docs/UsersApi.md#remove_user_group) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*UsersApi* | [**set_typing_status**](docs/UsersApi.md#set_typing_status) | **POST** /typing | Set \"typing\" status
*UsersApi* | [**unmute_user**](docs/UsersApi.md#unmute_user) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**update_settings**](docs/UsersApi.md#update_settings) | **PATCH** /settings | Update settings
*UsersApi* | [**update_status**](docs/UsersApi.md#update_status) | **POST** /users/me/status | Update your status
*UsersApi* | [**update_user**](docs/UsersApi.md#update_user) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**update_user_group**](docs/UsersApi.md#update_user_group) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**update_user_group_members**](docs/UsersApi.md#update_user_group_members) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**zulip_outgoing_webhooks**](docs/WebhooksApi.md#zulip_outgoing_webhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation For Models

 - [AddSubscriptionsResponse](docs/AddSubscriptionsResponse.md)
 - [AddSubscriptionsResponseAllOf](docs/AddSubscriptionsResponseAllOf.md)
 - [ApiKeyResponse](docs/ApiKeyResponse.md)
 - [ApiKeyResponseAllOf](docs/ApiKeyResponseAllOf.md)
 - [Attachments](docs/Attachments.md)
 - [AttachmentsMessages](docs/AttachmentsMessages.md)
 - [BadEventQueueIdError](docs/BadEventQueueIdError.md)
 - [BadEventQueueIdErrorAllOf](docs/BadEventQueueIdErrorAllOf.md)
 - [BasicBot](docs/BasicBot.md)
 - [BasicBotAllOf](docs/BasicBotAllOf.md)
 - [BasicBotBase](docs/BasicBotBase.md)
 - [BasicStream](docs/BasicStream.md)
 - [BasicStreamAllOf](docs/BasicStreamAllOf.md)
 - [BasicStreamBase](docs/BasicStreamBase.md)
 - [Bot](docs/Bot.md)
 - [BotAllOf](docs/BotAllOf.md)
 - [CodedError](docs/CodedError.md)
 - [CodedErrorAllOf](docs/CodedErrorAllOf.md)
 - [CodedErrorBase](docs/CodedErrorBase.md)
 - [CodedErrorBaseAllOf](docs/CodedErrorBaseAllOf.md)
 - [CustomProfileField](docs/CustomProfileField.md)
 - [DefaultStreamGroup](docs/DefaultStreamGroup.md)
 - [Draft](docs/Draft.md)
 - [EmojiBase](docs/EmojiBase.md)
 - [EmojiReaction](docs/EmojiReaction.md)
 - [EmojiReactionAllOf](docs/EmojiReactionAllOf.md)
 - [EmojiReactionBase](docs/EmojiReactionBase.md)
 - [EmojiReactionBaseAllOf](docs/EmojiReactionBaseAllOf.md)
 - [EmojiReactionBaseAllOfUser](docs/EmojiReactionBaseAllOfUser.md)
 - [GetMessages](docs/GetMessages.md)
 - [GetMessagesAllOf](docs/GetMessagesAllOf.md)
 - [Hotspot](docs/Hotspot.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InvalidApiKeyError](docs/InvalidApiKeyError.md)
 - [InvalidMessageError](docs/InvalidMessageError.md)
 - [InvalidMessageErrorAllOf](docs/InvalidMessageErrorAllOf.md)
 - [JsonError](docs/JsonError.md)
 - [JsonErrorBase](docs/JsonErrorBase.md)
 - [JsonErrorBaseAllOf](docs/JsonErrorBaseAllOf.md)
 - [JsonResponseBase](docs/JsonResponseBase.md)
 - [JsonSuccess](docs/JsonSuccess.md)
 - [JsonSuccessAllOf](docs/JsonSuccessAllOf.md)
 - [JsonSuccessBase](docs/JsonSuccessBase.md)
 - [JsonSuccessBaseAllOf](docs/JsonSuccessBaseAllOf.md)
 - [Messages](docs/Messages.md)
 - [MessagesAllOf](docs/MessagesAllOf.md)
 - [MessagesBase](docs/MessagesBase.md)
 - [MessagesBaseTopicLinks](docs/MessagesBaseTopicLinks.md)
 - [MissingArgumentError](docs/MissingArgumentError.md)
 - [MissingArgumentErrorAllOf](docs/MissingArgumentErrorAllOf.md)
 - [NonExistingStreamError](docs/NonExistingStreamError.md)
 - [NonExistingStreamErrorAllOf](docs/NonExistingStreamErrorAllOf.md)
 - [Presence](docs/Presence.md)
 - [RateLimitedError](docs/RateLimitedError.md)
 - [RealmDeactivatedError](docs/RealmDeactivatedError.md)
 - [RealmDomain](docs/RealmDomain.md)
 - [RealmEmoji](docs/RealmEmoji.md)
 - [RealmExport](docs/RealmExport.md)
 - [RealmPlayground](docs/RealmPlayground.md)
 - [Subscriptions](docs/Subscriptions.md)
 - [User](docs/User.md)
 - [UserAllOf](docs/UserAllOf.md)
 - [UserBase](docs/UserBase.md)
 - [UserDeactivatedError](docs/UserDeactivatedError.md)
 - [UserGroup](docs/UserGroup.md)
 - [UserNotAuthorizedError](docs/UserNotAuthorizedError.md)


To get access to the crate's generated documentation, use:

```
cargo doc --open
```

## Author



