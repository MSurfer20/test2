# OpenAPIClient-php

Powerful open source group chat


For more information, please visit [https://zulip.com](https://zulip.com).

## Installation & Usage

### Requirements

PHP 7.2 and later.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');




$apiInstance = new OpenAPI\Client\Api\AuthenticationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = iago@zulip.com; // string | The email address for the user that owns the API key.

try {
    $result = $apiInstance->devFetchApiKey($username);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticationApi->devFetchApiKey: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**devFetchApiKey**](docs/Api/AuthenticationApi.md#devfetchapikey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | [**fetchApiKey**](docs/Api/AuthenticationApi.md#fetchapikey) | **POST** /fetch_api_key | Fetch an API key (production)
*DraftsApi* | [**createDrafts**](docs/Api/DraftsApi.md#createdrafts) | **POST** /drafts | Create drafts
*DraftsApi* | [**deleteDraft**](docs/Api/DraftsApi.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
*DraftsApi* | [**editDraft**](docs/Api/DraftsApi.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
*DraftsApi* | [**getDrafts**](docs/Api/DraftsApi.md#getdrafts) | **GET** /drafts | Get drafts
*MessagesApi* | [**addReaction**](docs/Api/MessagesApi.md#addreaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*MessagesApi* | [**checkMessagesMatchNarrow**](docs/Api/MessagesApi.md#checkmessagesmatchnarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | [**deleteMessage**](docs/Api/MessagesApi.md#deletemessage) | **DELETE** /messages/{message_id} | Delete a message
*MessagesApi* | [**getFileTemporaryUrl**](docs/Api/MessagesApi.md#getfiletemporaryurl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*MessagesApi* | [**getMessageHistory**](docs/Api/MessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
*MessagesApi* | [**getMessages**](docs/Api/MessagesApi.md#getmessages) | **GET** /messages | Get messages
*MessagesApi* | [**getRawMessage**](docs/Api/MessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
*MessagesApi* | [**markAllAsRead**](docs/Api/MessagesApi.md#markallasread) | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | [**markStreamAsRead**](docs/Api/MessagesApi.md#markstreamasread) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | [**markTopicAsRead**](docs/Api/MessagesApi.md#marktopicasread) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | [**removeReaction**](docs/Api/MessagesApi.md#removereaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*MessagesApi* | [**renderMessage**](docs/Api/MessagesApi.md#rendermessage) | **POST** /messages/render | Render message
*MessagesApi* | [**sendMessage**](docs/Api/MessagesApi.md#sendmessage) | **POST** /messages | Send a message
*MessagesApi* | [**updateMessage**](docs/Api/MessagesApi.md#updatemessage) | **PATCH** /messages/{message_id} | Edit a message
*MessagesApi* | [**updateMessageFlags**](docs/Api/MessagesApi.md#updatemessageflags) | **POST** /messages/flags | Update personal message flags
*MessagesApi* | [**uploadFile**](docs/Api/MessagesApi.md#uploadfile) | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | [**deleteQueue**](docs/Api/RealTimeEventsApi.md#deletequeue) | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | [**getEvents**](docs/Api/RealTimeEventsApi.md#getevents) | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | [**realTimePost**](docs/Api/RealTimeEventsApi.md#realtimepost) | **POST** /real-time | 
*RealTimeEventsApi* | [**registerQueue**](docs/Api/RealTimeEventsApi.md#registerqueue) | **POST** /register | Register an event queue
*RealTimeEventsApi* | [**restErrorHandling**](docs/Api/RealTimeEventsApi.md#resterrorhandling) | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | [**addCodePlayground**](docs/Api/ServerAndOrganizationsApi.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | [**addLinkifier**](docs/Api/ServerAndOrganizationsApi.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | [**createCustomProfileField**](docs/Api/ServerAndOrganizationsApi.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | [**getCustomEmoji**](docs/Api/ServerAndOrganizationsApi.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | [**getCustomProfileFields**](docs/Api/ServerAndOrganizationsApi.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | [**getLinkifiers**](docs/Api/ServerAndOrganizationsApi.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | [**getServerSettings**](docs/Api/ServerAndOrganizationsApi.md#getserversettings) | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | [**removeCodePlayground**](docs/Api/ServerAndOrganizationsApi.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*ServerAndOrganizationsApi* | [**removeLinkifier**](docs/Api/ServerAndOrganizationsApi.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*ServerAndOrganizationsApi* | [**reorderCustomProfileFields**](docs/Api/ServerAndOrganizationsApi.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | [**updateLinkifier**](docs/Api/ServerAndOrganizationsApi.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*ServerAndOrganizationsApi* | [**uploadCustomEmoji**](docs/Api/ServerAndOrganizationsApi.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*StreamsApi* | [**archiveStream**](docs/Api/StreamsApi.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
*StreamsApi* | [**createBigBlueButtonVideoCall**](docs/Api/StreamsApi.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | [**deleteTopic**](docs/Api/StreamsApi.md#deletetopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
*StreamsApi* | [**getStreamId**](docs/Api/StreamsApi.md#getstreamid) | **GET** /get_stream_id | Get stream ID
*StreamsApi* | [**getStreamTopics**](docs/Api/StreamsApi.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*StreamsApi* | [**getStreams**](docs/Api/StreamsApi.md#getstreams) | **GET** /streams | Get all streams
*StreamsApi* | [**getSubscribers**](docs/Api/StreamsApi.md#getsubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
*StreamsApi* | [**getSubscriptionStatus**](docs/Api/StreamsApi.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*StreamsApi* | [**getSubscriptions**](docs/Api/StreamsApi.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | [**muteTopic**](docs/Api/StreamsApi.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | [**subscribe**](docs/Api/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | [**unsubscribe**](docs/Api/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | [**updateStream**](docs/Api/StreamsApi.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
*StreamsApi* | [**updateSubscriptionSettings**](docs/Api/StreamsApi.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | [**updateSubscriptions**](docs/Api/StreamsApi.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | [**createUser**](docs/Api/UsersApi.md#createuser) | **POST** /users | Create a user
*UsersApi* | [**createUserGroup**](docs/Api/UsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
*UsersApi* | [**deactivateOwnUser**](docs/Api/UsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
*UsersApi* | [**deactivateUser**](docs/Api/UsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
*UsersApi* | [**getAttachments**](docs/Api/UsersApi.md#getattachments) | **GET** /attachments | Get attachments
*UsersApi* | [**getOwnUser**](docs/Api/UsersApi.md#getownuser) | **GET** /users/me | Get own user
*UsersApi* | [**getUser**](docs/Api/UsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**getUserByEmail**](docs/Api/UsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
*UsersApi* | [**getUserGroups**](docs/Api/UsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
*UsersApi* | [**getUserPresence**](docs/Api/UsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*UsersApi* | [**getUsers**](docs/Api/UsersApi.md#getusers) | **GET** /users | Get all users
*UsersApi* | [**muteUser**](docs/Api/UsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*UsersApi* | [**reactivateUser**](docs/Api/UsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
*UsersApi* | [**removeUserGroup**](docs/Api/UsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*UsersApi* | [**setTypingStatus**](docs/Api/UsersApi.md#settypingstatus) | **POST** /typing | Set \&quot;typing\&quot; status
*UsersApi* | [**unmuteUser**](docs/Api/UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**updateSettings**](docs/Api/UsersApi.md#updatesettings) | **PATCH** /settings | Update settings
*UsersApi* | [**updateStatus**](docs/Api/UsersApi.md#updatestatus) | **POST** /users/me/status | Update your status
*UsersApi* | [**updateUser**](docs/Api/UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**updateUserGroup**](docs/Api/UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**updateUserGroupMembers**](docs/Api/UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**zulipOutgoingWebhooks**](docs/Api/WebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks

## Models

- [AddSubscriptionsResponse](docs/Model/AddSubscriptionsResponse.md)
- [AddSubscriptionsResponseAllOf](docs/Model/AddSubscriptionsResponseAllOf.md)
- [ApiKeyResponse](docs/Model/ApiKeyResponse.md)
- [ApiKeyResponseAllOf](docs/Model/ApiKeyResponseAllOf.md)
- [Attachments](docs/Model/Attachments.md)
- [AttachmentsMessages](docs/Model/AttachmentsMessages.md)
- [BadEventQueueIdError](docs/Model/BadEventQueueIdError.md)
- [BadEventQueueIdErrorAllOf](docs/Model/BadEventQueueIdErrorAllOf.md)
- [BasicBot](docs/Model/BasicBot.md)
- [BasicBotAllOf](docs/Model/BasicBotAllOf.md)
- [BasicBotBase](docs/Model/BasicBotBase.md)
- [BasicStream](docs/Model/BasicStream.md)
- [BasicStreamAllOf](docs/Model/BasicStreamAllOf.md)
- [BasicStreamBase](docs/Model/BasicStreamBase.md)
- [Bot](docs/Model/Bot.md)
- [BotAllOf](docs/Model/BotAllOf.md)
- [CodedError](docs/Model/CodedError.md)
- [CodedErrorAllOf](docs/Model/CodedErrorAllOf.md)
- [CodedErrorBase](docs/Model/CodedErrorBase.md)
- [CodedErrorBaseAllOf](docs/Model/CodedErrorBaseAllOf.md)
- [CustomProfileField](docs/Model/CustomProfileField.md)
- [DefaultStreamGroup](docs/Model/DefaultStreamGroup.md)
- [Draft](docs/Model/Draft.md)
- [EmojiBase](docs/Model/EmojiBase.md)
- [EmojiReaction](docs/Model/EmojiReaction.md)
- [EmojiReactionAllOf](docs/Model/EmojiReactionAllOf.md)
- [EmojiReactionBase](docs/Model/EmojiReactionBase.md)
- [EmojiReactionBaseAllOf](docs/Model/EmojiReactionBaseAllOf.md)
- [EmojiReactionBaseAllOfUser](docs/Model/EmojiReactionBaseAllOfUser.md)
- [GetMessages](docs/Model/GetMessages.md)
- [GetMessagesAllOf](docs/Model/GetMessagesAllOf.md)
- [Hotspot](docs/Model/Hotspot.md)
- [InlineResponse200](docs/Model/InlineResponse200.md)
- [InvalidApiKeyError](docs/Model/InvalidApiKeyError.md)
- [InvalidMessageError](docs/Model/InvalidMessageError.md)
- [InvalidMessageErrorAllOf](docs/Model/InvalidMessageErrorAllOf.md)
- [JsonError](docs/Model/JsonError.md)
- [JsonErrorBase](docs/Model/JsonErrorBase.md)
- [JsonErrorBaseAllOf](docs/Model/JsonErrorBaseAllOf.md)
- [JsonResponseBase](docs/Model/JsonResponseBase.md)
- [JsonSuccess](docs/Model/JsonSuccess.md)
- [JsonSuccessAllOf](docs/Model/JsonSuccessAllOf.md)
- [JsonSuccessBase](docs/Model/JsonSuccessBase.md)
- [JsonSuccessBaseAllOf](docs/Model/JsonSuccessBaseAllOf.md)
- [Messages](docs/Model/Messages.md)
- [MessagesAllOf](docs/Model/MessagesAllOf.md)
- [MessagesBase](docs/Model/MessagesBase.md)
- [MessagesBaseTopicLinks](docs/Model/MessagesBaseTopicLinks.md)
- [MissingArgumentError](docs/Model/MissingArgumentError.md)
- [MissingArgumentErrorAllOf](docs/Model/MissingArgumentErrorAllOf.md)
- [NonExistingStreamError](docs/Model/NonExistingStreamError.md)
- [NonExistingStreamErrorAllOf](docs/Model/NonExistingStreamErrorAllOf.md)
- [Presence](docs/Model/Presence.md)
- [RateLimitedError](docs/Model/RateLimitedError.md)
- [RealmDeactivatedError](docs/Model/RealmDeactivatedError.md)
- [RealmDomain](docs/Model/RealmDomain.md)
- [RealmEmoji](docs/Model/RealmEmoji.md)
- [RealmExport](docs/Model/RealmExport.md)
- [RealmPlayground](docs/Model/RealmPlayground.md)
- [Subscriptions](docs/Model/Subscriptions.md)
- [User](docs/Model/User.md)
- [UserAllOf](docs/Model/UserAllOf.md)
- [UserBase](docs/Model/UserBase.md)
- [UserDeactivatedError](docs/Model/UserDeactivatedError.md)
- [UserGroup](docs/Model/UserGroup.md)
- [UserNotAuthorizedError](docs/Model/UserNotAuthorizedError.md)

## Authorization

### BasicAuth

- **Type**: HTTP basic authentication

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.0.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
