# openapi
Powerful open source group chat


This Dart package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Build package: org.openapitools.codegen.languages.DartDioClientCodegen
For more information, please visit [https://zulip.com](https://zulip.com)

## Requirements

Dart 2.7.0 or later OR Flutter 1.12 or later

## Installation & Usage

### Github
If this Dart package is published to Github, please include the following in pubspec.yaml
```
name: openapi
version: 1.0.0
description: OpenAPI API client
dependencies:
  openapi:
    git: https://github.com/GIT_USER_ID/GIT_REPO_ID.git
      version: 'any'
```

### Local
To use the package in your local drive, please include the following in pubspec.yaml
```
dependencies:
  openapi:
    path: /path/to/openapi
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:openapi/api.dart';


final api = AuthenticationApi();
final username = iago@zulip.com; // String | The email address for the user that owns the API key. 

try {
    final response = await api.devFetchApiKey(username);
    print(response);
} catch (e) {
    print("Exception when calling AuthenticationApi->devFetchApiKey: $e\n");
}

```

## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**devFetchApiKey**](doc/AuthenticationApi.md#devfetchapikey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | [**fetchApiKey**](doc/AuthenticationApi.md#fetchapikey) | **POST** /fetch_api_key | Fetch an API key (production)
*MessagesApi* | [**addReaction**](doc/MessagesApi.md#addreaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*MessagesApi* | [**checkMessagesMatchNarrow**](doc/MessagesApi.md#checkmessagesmatchnarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | [**deleteMessage**](doc/MessagesApi.md#deletemessage) | **DELETE** /messages/{message_id} | Delete a message
*MessagesApi* | [**getFileTemporaryUrl**](doc/MessagesApi.md#getfiletemporaryurl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*MessagesApi* | [**getMessageHistory**](doc/MessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
*MessagesApi* | [**getMessages**](doc/MessagesApi.md#getmessages) | **GET** /messages | Get messages
*MessagesApi* | [**getRawMessage**](doc/MessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
*MessagesApi* | [**markAllAsRead**](doc/MessagesApi.md#markallasread) | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | [**markStreamAsRead**](doc/MessagesApi.md#markstreamasread) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | [**markTopicAsRead**](doc/MessagesApi.md#marktopicasread) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | [**removeReaction**](doc/MessagesApi.md#removereaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*MessagesApi* | [**renderMessage**](doc/MessagesApi.md#rendermessage) | **POST** /messages/render | Render message
*MessagesApi* | [**sendMessage**](doc/MessagesApi.md#sendmessage) | **POST** /messages | Send a message
*MessagesApi* | [**updateMessage**](doc/MessagesApi.md#updatemessage) | **PATCH** /messages/{message_id} | Edit a message
*MessagesApi* | [**updateMessageFlags**](doc/MessagesApi.md#updatemessageflags) | **POST** /messages/flags | Update personal message flags
*MessagesApi* | [**uploadFile**](doc/MessagesApi.md#uploadfile) | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | [**deleteQueue**](doc/RealTimeEventsApi.md#deletequeue) | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | [**getEvents**](doc/RealTimeEventsApi.md#getevents) | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | [**realTimePost**](doc/RealTimeEventsApi.md#realtimepost) | **POST** /real-time | 
*RealTimeEventsApi* | [**registerQueue**](doc/RealTimeEventsApi.md#registerqueue) | **POST** /register | Register an event queue
*RealTimeEventsApi* | [**restErrorHandling**](doc/RealTimeEventsApi.md#resterrorhandling) | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | [**addCodePlayground**](doc/ServerAndOrganizationsApi.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | [**addLinkifier**](doc/ServerAndOrganizationsApi.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | [**createCustomProfileField**](doc/ServerAndOrganizationsApi.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | [**getCustomEmoji**](doc/ServerAndOrganizationsApi.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | [**getCustomProfileFields**](doc/ServerAndOrganizationsApi.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | [**getLinkifiers**](doc/ServerAndOrganizationsApi.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | [**getServerSettings**](doc/ServerAndOrganizationsApi.md#getserversettings) | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | [**removeCodePlayground**](doc/ServerAndOrganizationsApi.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*ServerAndOrganizationsApi* | [**removeLinkifier**](doc/ServerAndOrganizationsApi.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*ServerAndOrganizationsApi* | [**reorderCustomProfileFields**](doc/ServerAndOrganizationsApi.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | [**updateLinkifier**](doc/ServerAndOrganizationsApi.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*ServerAndOrganizationsApi* | [**uploadCustomEmoji**](doc/ServerAndOrganizationsApi.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*StreamsApi* | [**archiveStream**](doc/StreamsApi.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
*StreamsApi* | [**createBigBlueButtonVideoCall**](doc/StreamsApi.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | [**getStreamId**](doc/StreamsApi.md#getstreamid) | **GET** /get_stream_id | Get stream ID
*StreamsApi* | [**getStreamTopics**](doc/StreamsApi.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*StreamsApi* | [**getStreams**](doc/StreamsApi.md#getstreams) | **GET** /streams | Get all streams
*StreamsApi* | [**getSubscriptionStatus**](doc/StreamsApi.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*StreamsApi* | [**getSubscriptions**](doc/StreamsApi.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | [**muteTopic**](doc/StreamsApi.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | [**subscribe**](doc/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | [**unsubscribe**](doc/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | [**updateStream**](doc/StreamsApi.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
*StreamsApi* | [**updateSubscriptionSettings**](doc/StreamsApi.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | [**updateSubscriptions**](doc/StreamsApi.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | [**createUser**](doc/UsersApi.md#createuser) | **POST** /users | Create a user
*UsersApi* | [**createUserGroup**](doc/UsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
*UsersApi* | [**deactivateOwnUser**](doc/UsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
*UsersApi* | [**deactivateUser**](doc/UsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
*UsersApi* | [**getAttachments**](doc/UsersApi.md#getattachments) | **GET** /attachments | Get attachments
*UsersApi* | [**getOwnUser**](doc/UsersApi.md#getownuser) | **GET** /users/me | Get own user
*UsersApi* | [**getUser**](doc/UsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**getUserByEmail**](doc/UsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
*UsersApi* | [**getUserGroups**](doc/UsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
*UsersApi* | [**getUserPresence**](doc/UsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*UsersApi* | [**getUsers**](doc/UsersApi.md#getusers) | **GET** /users | Get all users
*UsersApi* | [**muteUser**](doc/UsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*UsersApi* | [**reactivateUser**](doc/UsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
*UsersApi* | [**removeUserGroup**](doc/UsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*UsersApi* | [**setTypingStatus**](doc/UsersApi.md#settypingstatus) | **POST** /typing | Set \&quot;typing\&quot; status
*UsersApi* | [**unmuteUser**](doc/UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**updateDisplaySettings**](doc/UsersApi.md#updatedisplaysettings) | **PATCH** /settings/display | Update display settings
*UsersApi* | [**updateNotificationSettings**](doc/UsersApi.md#updatenotificationsettings) | **PATCH** /settings/notifications | Update notification settings
*UsersApi* | [**updateUser**](doc/UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**updateUserGroup**](doc/UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**updateUserGroupMembers**](doc/UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**zulipOutgoingWebhooks**](doc/WebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation For Models

 - [AddSubscriptionsResponse](doc/AddSubscriptionsResponse.md)
 - [AddSubscriptionsResponseAllOf](doc/AddSubscriptionsResponseAllOf.md)
 - [ApiKeyResponse](doc/ApiKeyResponse.md)
 - [ApiKeyResponseAllOf](doc/ApiKeyResponseAllOf.md)
 - [Attachments](doc/Attachments.md)
 - [AttachmentsMessages](doc/AttachmentsMessages.md)
 - [BadEventQueueIdError](doc/BadEventQueueIdError.md)
 - [BadEventQueueIdErrorAllOf](doc/BadEventQueueIdErrorAllOf.md)
 - [BasicBot](doc/BasicBot.md)
 - [BasicBotAllOf](doc/BasicBotAllOf.md)
 - [BasicBotBase](doc/BasicBotBase.md)
 - [BasicStream](doc/BasicStream.md)
 - [BasicStreamAllOf](doc/BasicStreamAllOf.md)
 - [BasicStreamBase](doc/BasicStreamBase.md)
 - [Bot](doc/Bot.md)
 - [BotAllOf](doc/BotAllOf.md)
 - [CodedError](doc/CodedError.md)
 - [CodedErrorAllOf](doc/CodedErrorAllOf.md)
 - [CodedErrorBase](doc/CodedErrorBase.md)
 - [CodedErrorBaseAllOf](doc/CodedErrorBaseAllOf.md)
 - [CustomProfileField](doc/CustomProfileField.md)
 - [DefaultStreamGroup](doc/DefaultStreamGroup.md)
 - [EmojiReaction](doc/EmojiReaction.md)
 - [EmojiReactionAllOf](doc/EmojiReactionAllOf.md)
 - [EmojiReactionBase](doc/EmojiReactionBase.md)
 - [EmojiReactionBaseUser](doc/EmojiReactionBaseUser.md)
 - [GetMessages](doc/GetMessages.md)
 - [GetMessagesAllOf](doc/GetMessagesAllOf.md)
 - [Hotspot](doc/Hotspot.md)
 - [InlineResponse200](doc/InlineResponse200.md)
 - [InvalidApiKeyError](doc/InvalidApiKeyError.md)
 - [InvalidMessageError](doc/InvalidMessageError.md)
 - [InvalidMessageErrorAllOf](doc/InvalidMessageErrorAllOf.md)
 - [JsonError](doc/JsonError.md)
 - [JsonErrorBase](doc/JsonErrorBase.md)
 - [JsonErrorBaseAllOf](doc/JsonErrorBaseAllOf.md)
 - [JsonResponseBase](doc/JsonResponseBase.md)
 - [JsonSuccess](doc/JsonSuccess.md)
 - [JsonSuccessAllOf](doc/JsonSuccessAllOf.md)
 - [JsonSuccessBase](doc/JsonSuccessBase.md)
 - [JsonSuccessBaseAllOf](doc/JsonSuccessBaseAllOf.md)
 - [Messages](doc/Messages.md)
 - [MessagesAllOf](doc/MessagesAllOf.md)
 - [MessagesBase](doc/MessagesBase.md)
 - [MessagesBaseTopicLinks](doc/MessagesBaseTopicLinks.md)
 - [MissingArgumentError](doc/MissingArgumentError.md)
 - [MissingArgumentErrorAllOf](doc/MissingArgumentErrorAllOf.md)
 - [NonExistingStreamError](doc/NonExistingStreamError.md)
 - [NonExistingStreamErrorAllOf](doc/NonExistingStreamErrorAllOf.md)
 - [Presence](doc/Presence.md)
 - [RateLimitedError](doc/RateLimitedError.md)
 - [RealmDeactivatedError](doc/RealmDeactivatedError.md)
 - [RealmDomain](doc/RealmDomain.md)
 - [RealmEmoji](doc/RealmEmoji.md)
 - [RealmExport](doc/RealmExport.md)
 - [RealmPlayground](doc/RealmPlayground.md)
 - [Subscriptions](doc/Subscriptions.md)
 - [User](doc/User.md)
 - [UserAllOf](doc/UserAllOf.md)
 - [UserBase](doc/UserBase.md)
 - [UserDeactivatedError](doc/UserDeactivatedError.md)
 - [UserGroup](doc/UserGroup.md)
 - [UserNotAuthorizedError](doc/UserNotAuthorizedError.md)


## Documentation For Authorization


## BasicAuth

- **Type**: HTTP basic authentication


## Author



