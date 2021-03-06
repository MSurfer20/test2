# openapi_client

OpenapiClient - the Ruby gem for the Zulip REST API

Powerful open source group chat


This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.RubyClientCodegen
For more information, please visit [https://zulip.com](https://zulip.com)

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build openapi_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./openapi_client-1.0.0.gem
```

(for development, run `gem install --dev ./openapi_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'openapi_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/GIT_USER_ID/GIT_REPO_ID, then add the following in the Gemfile:

    gem 'openapi_client', :git => 'https://github.com/GIT_USER_ID/GIT_REPO_ID.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:

```ruby
# Load the gem
require 'openapi_client'

api_instance = OpenapiClient::AuthenticationApi.new
username = 'iago@zulip.com' # String | The email address for the user that owns the API key. 

begin
  #Fetch an API key (development only)
  result = api_instance.dev_fetch_api_key(username)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AuthenticationApi->dev_fetch_api_key: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenapiClient::AuthenticationApi* | [**dev_fetch_api_key**](docs/AuthenticationApi.md#dev_fetch_api_key) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*OpenapiClient::AuthenticationApi* | [**fetch_api_key**](docs/AuthenticationApi.md#fetch_api_key) | **POST** /fetch_api_key | Fetch an API key (production)
*OpenapiClient::DraftsApi* | [**create_drafts**](docs/DraftsApi.md#create_drafts) | **POST** /drafts | Create drafts
*OpenapiClient::DraftsApi* | [**delete_draft**](docs/DraftsApi.md#delete_draft) | **DELETE** /drafts/{draft_id} | Delete a draft
*OpenapiClient::DraftsApi* | [**edit_draft**](docs/DraftsApi.md#edit_draft) | **PATCH** /drafts/{draft_id} | Edit a draft
*OpenapiClient::DraftsApi* | [**get_drafts**](docs/DraftsApi.md#get_drafts) | **GET** /drafts | Get drafts
*OpenapiClient::MessagesApi* | [**add_reaction**](docs/MessagesApi.md#add_reaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*OpenapiClient::MessagesApi* | [**check_messages_match_narrow**](docs/MessagesApi.md#check_messages_match_narrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*OpenapiClient::MessagesApi* | [**delete_message**](docs/MessagesApi.md#delete_message) | **DELETE** /messages/{message_id} | Delete a message
*OpenapiClient::MessagesApi* | [**get_file_temporary_url**](docs/MessagesApi.md#get_file_temporary_url) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*OpenapiClient::MessagesApi* | [**get_message_history**](docs/MessagesApi.md#get_message_history) | **GET** /messages/{message_id}/history | Get a message's edit history
*OpenapiClient::MessagesApi* | [**get_messages**](docs/MessagesApi.md#get_messages) | **GET** /messages | Get messages
*OpenapiClient::MessagesApi* | [**get_raw_message**](docs/MessagesApi.md#get_raw_message) | **GET** /messages/{message_id} | Get a message's raw Markdown
*OpenapiClient::MessagesApi* | [**mark_all_as_read**](docs/MessagesApi.md#mark_all_as_read) | **POST** /mark_all_as_read | Mark all messages as read
*OpenapiClient::MessagesApi* | [**mark_stream_as_read**](docs/MessagesApi.md#mark_stream_as_read) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*OpenapiClient::MessagesApi* | [**mark_topic_as_read**](docs/MessagesApi.md#mark_topic_as_read) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*OpenapiClient::MessagesApi* | [**remove_reaction**](docs/MessagesApi.md#remove_reaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*OpenapiClient::MessagesApi* | [**render_message**](docs/MessagesApi.md#render_message) | **POST** /messages/render | Render message
*OpenapiClient::MessagesApi* | [**send_message**](docs/MessagesApi.md#send_message) | **POST** /messages | Send a message
*OpenapiClient::MessagesApi* | [**update_message**](docs/MessagesApi.md#update_message) | **PATCH** /messages/{message_id} | Edit a message
*OpenapiClient::MessagesApi* | [**update_message_flags**](docs/MessagesApi.md#update_message_flags) | **POST** /messages/flags | Update personal message flags
*OpenapiClient::MessagesApi* | [**upload_file**](docs/MessagesApi.md#upload_file) | **POST** /user_uploads | Upload a file
*OpenapiClient::RealTimeEventsApi* | [**delete_queue**](docs/RealTimeEventsApi.md#delete_queue) | **DELETE** /events | Delete an event queue
*OpenapiClient::RealTimeEventsApi* | [**get_events**](docs/RealTimeEventsApi.md#get_events) | **GET** /events | Get events from an event queue
*OpenapiClient::RealTimeEventsApi* | [**real_time_post**](docs/RealTimeEventsApi.md#real_time_post) | **POST** /real-time | 
*OpenapiClient::RealTimeEventsApi* | [**register_queue**](docs/RealTimeEventsApi.md#register_queue) | **POST** /register | Register an event queue
*OpenapiClient::RealTimeEventsApi* | [**rest_error_handling**](docs/RealTimeEventsApi.md#rest_error_handling) | **POST** /rest-error-handling | Error handling
*OpenapiClient::ServerAndOrganizationsApi* | [**add_code_playground**](docs/ServerAndOrganizationsApi.md#add_code_playground) | **POST** /realm/playgrounds | Add a code playground
*OpenapiClient::ServerAndOrganizationsApi* | [**add_linkifier**](docs/ServerAndOrganizationsApi.md#add_linkifier) | **POST** /realm/filters | Add a linkifier
*OpenapiClient::ServerAndOrganizationsApi* | [**create_custom_profile_field**](docs/ServerAndOrganizationsApi.md#create_custom_profile_field) | **POST** /realm/profile_fields | Create a custom profile field
*OpenapiClient::ServerAndOrganizationsApi* | [**get_custom_emoji**](docs/ServerAndOrganizationsApi.md#get_custom_emoji) | **GET** /realm/emoji | Get all custom emoji
*OpenapiClient::ServerAndOrganizationsApi* | [**get_custom_profile_fields**](docs/ServerAndOrganizationsApi.md#get_custom_profile_fields) | **GET** /realm/profile_fields | Get all custom profile fields
*OpenapiClient::ServerAndOrganizationsApi* | [**get_linkifiers**](docs/ServerAndOrganizationsApi.md#get_linkifiers) | **GET** /realm/linkifiers | Get linkifiers
*OpenapiClient::ServerAndOrganizationsApi* | [**get_server_settings**](docs/ServerAndOrganizationsApi.md#get_server_settings) | **GET** /server_settings | Get server settings
*OpenapiClient::ServerAndOrganizationsApi* | [**remove_code_playground**](docs/ServerAndOrganizationsApi.md#remove_code_playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*OpenapiClient::ServerAndOrganizationsApi* | [**remove_linkifier**](docs/ServerAndOrganizationsApi.md#remove_linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*OpenapiClient::ServerAndOrganizationsApi* | [**reorder_custom_profile_fields**](docs/ServerAndOrganizationsApi.md#reorder_custom_profile_fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*OpenapiClient::ServerAndOrganizationsApi* | [**update_linkifier**](docs/ServerAndOrganizationsApi.md#update_linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*OpenapiClient::ServerAndOrganizationsApi* | [**upload_custom_emoji**](docs/ServerAndOrganizationsApi.md#upload_custom_emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*OpenapiClient::StreamsApi* | [**archive_stream**](docs/StreamsApi.md#archive_stream) | **DELETE** /streams/{stream_id} | Archive a stream
*OpenapiClient::StreamsApi* | [**create_big_blue_button_video_call**](docs/StreamsApi.md#create_big_blue_button_video_call) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*OpenapiClient::StreamsApi* | [**delete_topic**](docs/StreamsApi.md#delete_topic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
*OpenapiClient::StreamsApi* | [**get_stream_id**](docs/StreamsApi.md#get_stream_id) | **GET** /get_stream_id | Get stream ID
*OpenapiClient::StreamsApi* | [**get_stream_topics**](docs/StreamsApi.md#get_stream_topics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*OpenapiClient::StreamsApi* | [**get_streams**](docs/StreamsApi.md#get_streams) | **GET** /streams | Get all streams
*OpenapiClient::StreamsApi* | [**get_subscribers**](docs/StreamsApi.md#get_subscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
*OpenapiClient::StreamsApi* | [**get_subscription_status**](docs/StreamsApi.md#get_subscription_status) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*OpenapiClient::StreamsApi* | [**get_subscriptions**](docs/StreamsApi.md#get_subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*OpenapiClient::StreamsApi* | [**mute_topic**](docs/StreamsApi.md#mute_topic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*OpenapiClient::StreamsApi* | [**subscribe**](docs/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*OpenapiClient::StreamsApi* | [**unsubscribe**](docs/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*OpenapiClient::StreamsApi* | [**update_stream**](docs/StreamsApi.md#update_stream) | **PATCH** /streams/{stream_id} | Update a stream
*OpenapiClient::StreamsApi* | [**update_subscription_settings**](docs/StreamsApi.md#update_subscription_settings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*OpenapiClient::StreamsApi* | [**update_subscriptions**](docs/StreamsApi.md#update_subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*OpenapiClient::UsersApi* | [**create_user**](docs/UsersApi.md#create_user) | **POST** /users | Create a user
*OpenapiClient::UsersApi* | [**create_user_group**](docs/UsersApi.md#create_user_group) | **POST** /user_groups/create | Create a user group
*OpenapiClient::UsersApi* | [**deactivate_own_user**](docs/UsersApi.md#deactivate_own_user) | **DELETE** /users/me | Deactivate own user
*OpenapiClient::UsersApi* | [**deactivate_user**](docs/UsersApi.md#deactivate_user) | **DELETE** /users/{user_id} | Deactivate a user
*OpenapiClient::UsersApi* | [**get_attachments**](docs/UsersApi.md#get_attachments) | **GET** /attachments | Get attachments
*OpenapiClient::UsersApi* | [**get_own_user**](docs/UsersApi.md#get_own_user) | **GET** /users/me | Get own user
*OpenapiClient::UsersApi* | [**get_user**](docs/UsersApi.md#get_user) | **GET** /users/{user_id} | Get a user
*OpenapiClient::UsersApi* | [**get_user_by_email**](docs/UsersApi.md#get_user_by_email) | **GET** /users/{email} | Get a user by email
*OpenapiClient::UsersApi* | [**get_user_groups**](docs/UsersApi.md#get_user_groups) | **GET** /user_groups | Get user groups
*OpenapiClient::UsersApi* | [**get_user_presence**](docs/UsersApi.md#get_user_presence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*OpenapiClient::UsersApi* | [**get_users**](docs/UsersApi.md#get_users) | **GET** /users | Get all users
*OpenapiClient::UsersApi* | [**mute_user**](docs/UsersApi.md#mute_user) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*OpenapiClient::UsersApi* | [**reactivate_user**](docs/UsersApi.md#reactivate_user) | **POST** /users/{user_id}/reactivate | Reactivate a user
*OpenapiClient::UsersApi* | [**remove_user_group**](docs/UsersApi.md#remove_user_group) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*OpenapiClient::UsersApi* | [**set_typing_status**](docs/UsersApi.md#set_typing_status) | **POST** /typing | Set \"typing\" status
*OpenapiClient::UsersApi* | [**unmute_user**](docs/UsersApi.md#unmute_user) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*OpenapiClient::UsersApi* | [**update_settings**](docs/UsersApi.md#update_settings) | **PATCH** /settings | Update settings
*OpenapiClient::UsersApi* | [**update_status**](docs/UsersApi.md#update_status) | **POST** /users/me/status | Update your status
*OpenapiClient::UsersApi* | [**update_user**](docs/UsersApi.md#update_user) | **PATCH** /users/{user_id} | Update a user
*OpenapiClient::UsersApi* | [**update_user_group**](docs/UsersApi.md#update_user_group) | **PATCH** /user_groups/{user_group_id} | Update a user group
*OpenapiClient::UsersApi* | [**update_user_group_members**](docs/UsersApi.md#update_user_group_members) | **POST** /user_groups/{user_group_id}/members | Update user group members
*OpenapiClient::WebhooksApi* | [**zulip_outgoing_webhooks**](docs/WebhooksApi.md#zulip_outgoing_webhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation for Models

 - [OpenapiClient::AddSubscriptionsResponse](docs/AddSubscriptionsResponse.md)
 - [OpenapiClient::AddSubscriptionsResponseAllOf](docs/AddSubscriptionsResponseAllOf.md)
 - [OpenapiClient::ApiKeyResponse](docs/ApiKeyResponse.md)
 - [OpenapiClient::ApiKeyResponseAllOf](docs/ApiKeyResponseAllOf.md)
 - [OpenapiClient::Attachments](docs/Attachments.md)
 - [OpenapiClient::AttachmentsMessages](docs/AttachmentsMessages.md)
 - [OpenapiClient::BadEventQueueIdError](docs/BadEventQueueIdError.md)
 - [OpenapiClient::BadEventQueueIdErrorAllOf](docs/BadEventQueueIdErrorAllOf.md)
 - [OpenapiClient::BasicBot](docs/BasicBot.md)
 - [OpenapiClient::BasicBotAllOf](docs/BasicBotAllOf.md)
 - [OpenapiClient::BasicBotBase](docs/BasicBotBase.md)
 - [OpenapiClient::BasicStream](docs/BasicStream.md)
 - [OpenapiClient::BasicStreamAllOf](docs/BasicStreamAllOf.md)
 - [OpenapiClient::BasicStreamBase](docs/BasicStreamBase.md)
 - [OpenapiClient::Bot](docs/Bot.md)
 - [OpenapiClient::BotAllOf](docs/BotAllOf.md)
 - [OpenapiClient::CodedError](docs/CodedError.md)
 - [OpenapiClient::CodedErrorAllOf](docs/CodedErrorAllOf.md)
 - [OpenapiClient::CodedErrorBase](docs/CodedErrorBase.md)
 - [OpenapiClient::CodedErrorBaseAllOf](docs/CodedErrorBaseAllOf.md)
 - [OpenapiClient::CustomProfileField](docs/CustomProfileField.md)
 - [OpenapiClient::DefaultStreamGroup](docs/DefaultStreamGroup.md)
 - [OpenapiClient::Draft](docs/Draft.md)
 - [OpenapiClient::EmojiBase](docs/EmojiBase.md)
 - [OpenapiClient::EmojiReaction](docs/EmojiReaction.md)
 - [OpenapiClient::EmojiReactionAllOf](docs/EmojiReactionAllOf.md)
 - [OpenapiClient::EmojiReactionBase](docs/EmojiReactionBase.md)
 - [OpenapiClient::EmojiReactionBaseAllOf](docs/EmojiReactionBaseAllOf.md)
 - [OpenapiClient::EmojiReactionBaseAllOfUser](docs/EmojiReactionBaseAllOfUser.md)
 - [OpenapiClient::GetMessages](docs/GetMessages.md)
 - [OpenapiClient::GetMessagesAllOf](docs/GetMessagesAllOf.md)
 - [OpenapiClient::Hotspot](docs/Hotspot.md)
 - [OpenapiClient::InlineResponse200](docs/InlineResponse200.md)
 - [OpenapiClient::InvalidApiKeyError](docs/InvalidApiKeyError.md)
 - [OpenapiClient::InvalidMessageError](docs/InvalidMessageError.md)
 - [OpenapiClient::InvalidMessageErrorAllOf](docs/InvalidMessageErrorAllOf.md)
 - [OpenapiClient::JsonError](docs/JsonError.md)
 - [OpenapiClient::JsonErrorBase](docs/JsonErrorBase.md)
 - [OpenapiClient::JsonErrorBaseAllOf](docs/JsonErrorBaseAllOf.md)
 - [OpenapiClient::JsonResponseBase](docs/JsonResponseBase.md)
 - [OpenapiClient::JsonSuccess](docs/JsonSuccess.md)
 - [OpenapiClient::JsonSuccessAllOf](docs/JsonSuccessAllOf.md)
 - [OpenapiClient::JsonSuccessBase](docs/JsonSuccessBase.md)
 - [OpenapiClient::JsonSuccessBaseAllOf](docs/JsonSuccessBaseAllOf.md)
 - [OpenapiClient::Messages](docs/Messages.md)
 - [OpenapiClient::MessagesAllOf](docs/MessagesAllOf.md)
 - [OpenapiClient::MessagesBase](docs/MessagesBase.md)
 - [OpenapiClient::MessagesBaseTopicLinks](docs/MessagesBaseTopicLinks.md)
 - [OpenapiClient::MissingArgumentError](docs/MissingArgumentError.md)
 - [OpenapiClient::MissingArgumentErrorAllOf](docs/MissingArgumentErrorAllOf.md)
 - [OpenapiClient::NonExistingStreamError](docs/NonExistingStreamError.md)
 - [OpenapiClient::NonExistingStreamErrorAllOf](docs/NonExistingStreamErrorAllOf.md)
 - [OpenapiClient::Presence](docs/Presence.md)
 - [OpenapiClient::RateLimitedError](docs/RateLimitedError.md)
 - [OpenapiClient::RealmDeactivatedError](docs/RealmDeactivatedError.md)
 - [OpenapiClient::RealmDomain](docs/RealmDomain.md)
 - [OpenapiClient::RealmEmoji](docs/RealmEmoji.md)
 - [OpenapiClient::RealmExport](docs/RealmExport.md)
 - [OpenapiClient::RealmPlayground](docs/RealmPlayground.md)
 - [OpenapiClient::Subscriptions](docs/Subscriptions.md)
 - [OpenapiClient::User](docs/User.md)
 - [OpenapiClient::UserAllOf](docs/UserAllOf.md)
 - [OpenapiClient::UserBase](docs/UserBase.md)
 - [OpenapiClient::UserDeactivatedError](docs/UserDeactivatedError.md)
 - [OpenapiClient::UserGroup](docs/UserGroup.md)
 - [OpenapiClient::UserNotAuthorizedError](docs/UserNotAuthorizedError.md)


## Documentation for Authorization


### BasicAuth

- **Type**: HTTP basic authentication

