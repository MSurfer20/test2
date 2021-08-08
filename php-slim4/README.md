# php-base - PHP Slim 4 Server library for Zulip REST API

* [OpenAPI Generator](https://openapi-generator.tech)
* [Slim 4 Documentation](https://www.slimframework.com/docs/v4/)

This server has been generated with [Slim PSR-7](https://github.com/slimphp/Slim-Psr7) implementation.

## Requirements

* Web server with URL rewriting
* PHP 7.2 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Add configs

Application requires at least one config file(`config/dev/config.inc.php` or `config/prod/config.inc.php`). You can use [config/dev/example.inc.php](config/dev/example.inc.php) as starting point.

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Tests

### PHPUnit

This package uses PHPUnit 8 or 9(depends from your PHP version) for unit testing.
[Test folder](test) contains templates which you can fill with real test assertions.
How to write tests read at [2. Writing Tests for PHPUnit - PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/writing-tests-for-phpunit.html).

#### Run

Command | Target
---- | ----
`$ composer test` | All tests
`$ composer test-apis` | Apis tests
`$ composer test-models` | Models tests

#### Config

Package contains fully functional config `./phpunit.xml.dist` file. Create `./phpunit.xml` in root folder to override it.

Quote from [3. The Command-Line Test Runner — PHPUnit 8.5 Manual](https://phpunit.readthedocs.io/en/8.5/textui.html#command-line-options):

> If phpunit.xml or phpunit.xml.dist (in that order) exist in the current working directory and --configuration is not used, the configuration will be automatically read from that file.

### PHP CodeSniffer

[PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki). This tool helps to follow coding style and avoid common PHP coding mistakes.

#### Run

```bash
$ composer phpcs
```

#### Config

Package contains fully functional config `./phpcs.xml.dist` file. It checks source code against PSR-1 and PSR-2 coding standards.
Create `./phpcs.xml` in root folder to override it. More info at [Using a Default Configuration File](https://github.com/squizlabs/PHP_CodeSniffer/wiki/Advanced-Usage#using-a-default-configuration-file)

### PHPLint

[PHPLint Documentation](https://github.com/overtrue/phplint). Checks PHP syntax only.

#### Run

```bash
$ composer phplint
```

## Show errors

Switch on option in your application config file like:
```diff
 return [
     'slimSettings' => [
-        'displayErrorDetails' => false,
+        'displayErrorDetails' => true,
         'logErrors' => true,
         'logErrorDetails' => true,
     ],
```

## Mock Server
For a quick start uncomment [mocker middleware options](config/dev/example.inc.php#L67-L94) in your application config file.

Used packages:
* [Openapi Data Mocker](https://github.com/ybelenko/openapi-data-mocker) - first implementation of OAS3 fake data generator.
* [Openapi Data Mocker Server Middleware](https://github.com/ybelenko/openapi-data-mocker-server-middleware) - PSR-15 HTTP server middleware.
* [Openapi Data Mocker Interfaces](https://github.com/ybelenko/openapi-data-mocker-interfaces) - package with mocking interfaces.

## API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

> Important! Do not modify abstract API controllers directly! Instead extend them by implementation classes like:

```php
// src/Api/PetApi.php

namespace OpenAPIServer\Api;

use OpenAPIServer\Api\AbstractPetApi;

class PetApi extends AbstractPetApi
{

    public function addPet($request, $response, $args)
    {
        // your implementation of addPet method here
    }
}
```

Place all your implementation classes in `./src` folder accordingly.
For instance, when abstract class located at `./lib/Api/AbstractPetApi.php` you need to create implementation class at `./src/Api/PetApi.php`.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AbstractAuthenticationApi* | **devFetchApiKey** | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AbstractAuthenticationApi* | **fetchApiKey** | **POST** /fetch_api_key | Fetch an API key (production)
*AbstractDraftsApi* | **createDrafts** | **POST** /drafts | Create drafts
*AbstractDraftsApi* | **getDrafts** | **GET** /drafts | Get drafts
*AbstractDraftsApi* | **deleteDraft** | **DELETE** /drafts/{draft_id} | Delete a draft
*AbstractDraftsApi* | **editDraft** | **PATCH** /drafts/{draft_id} | Edit a draft
*AbstractMessagesApi* | **checkMessagesMatchNarrow** | **GET** /messages/matches_narrow | Check if messages match a narrow
*AbstractMessagesApi* | **getMessages** | **GET** /messages | Get messages
*AbstractMessagesApi* | **markAllAsRead** | **POST** /mark_all_as_read | Mark all messages as read
*AbstractMessagesApi* | **markStreamAsRead** | **POST** /mark_stream_as_read | Mark messages in a stream as read
*AbstractMessagesApi* | **markTopicAsRead** | **POST** /mark_topic_as_read | Mark messages in a topic as read
*AbstractMessagesApi* | **renderMessage** | **POST** /messages/render | Render message
*AbstractMessagesApi* | **sendMessage** | **POST** /messages | Send a message
*AbstractMessagesApi* | **updateMessageFlags** | **POST** /messages/flags | Update personal message flags
*AbstractMessagesApi* | **uploadFile** | **POST** /user_uploads | Upload a file
*AbstractMessagesApi* | **addReaction** | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*AbstractMessagesApi* | **deleteMessage** | **DELETE** /messages/{message_id} | Delete a message
*AbstractMessagesApi* | **getFileTemporaryUrl** | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*AbstractMessagesApi* | **getMessageHistory** | **GET** /messages/{message_id}/history | Get a message's edit history
*AbstractMessagesApi* | **getRawMessage** | **GET** /messages/{message_id} | Get a message's raw Markdown
*AbstractMessagesApi* | **removeReaction** | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*AbstractMessagesApi* | **updateMessage** | **PATCH** /messages/{message_id} | Edit a message
*AbstractRealTimeEventsApi* | **deleteQueue** | **DELETE** /events | Delete an event queue
*AbstractRealTimeEventsApi* | **getEvents** | **GET** /events | Get events from an event queue
*AbstractRealTimeEventsApi* | **realTimePost** | **POST** /real-time | 
*AbstractRealTimeEventsApi* | **registerQueue** | **POST** /register | Register an event queue
*AbstractRealTimeEventsApi* | **restErrorHandling** | **POST** /rest-error-handling | Error handling
*AbstractServerAndOrganizationsApi* | **addCodePlayground** | **POST** /realm/playgrounds | Add a code playground
*AbstractServerAndOrganizationsApi* | **addLinkifier** | **POST** /realm/filters | Add a linkifier
*AbstractServerAndOrganizationsApi* | **createCustomProfileField** | **POST** /realm/profile_fields | Create a custom profile field
*AbstractServerAndOrganizationsApi* | **getCustomEmoji** | **GET** /realm/emoji | Get all custom emoji
*AbstractServerAndOrganizationsApi* | **getCustomProfileFields** | **GET** /realm/profile_fields | Get all custom profile fields
*AbstractServerAndOrganizationsApi* | **getLinkifiers** | **GET** /realm/linkifiers | Get linkifiers
*AbstractServerAndOrganizationsApi* | **getServerSettings** | **GET** /server_settings | Get server settings
*AbstractServerAndOrganizationsApi* | **reorderCustomProfileFields** | **PATCH** /realm/profile_fields | Reorder custom profile fields
*AbstractServerAndOrganizationsApi* | **removeCodePlayground** | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*AbstractServerAndOrganizationsApi* | **removeLinkifier** | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*AbstractServerAndOrganizationsApi* | **updateLinkifier** | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*AbstractServerAndOrganizationsApi* | **uploadCustomEmoji** | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*AbstractStreamsApi* | **createBigBlueButtonVideoCall** | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*AbstractStreamsApi* | **getStreamId** | **GET** /get_stream_id | Get stream ID
*AbstractStreamsApi* | **getStreams** | **GET** /streams | Get all streams
*AbstractStreamsApi* | **getSubscriptions** | **GET** /users/me/subscriptions | Get subscribed streams
*AbstractStreamsApi* | **muteTopic** | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*AbstractStreamsApi* | **subscribe** | **POST** /users/me/subscriptions | Subscribe to a stream
*AbstractStreamsApi* | **unsubscribe** | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*AbstractStreamsApi* | **updateSubscriptionSettings** | **POST** /users/me/subscriptions/properties | Update subscription settings
*AbstractStreamsApi* | **updateSubscriptions** | **PATCH** /users/me/subscriptions | Update subscriptions
*AbstractStreamsApi* | **archiveStream** | **DELETE** /streams/{stream_id} | Archive a stream
*AbstractStreamsApi* | **deleteTopic** | **POST** /streams/{stream_id}/delete_topic | Delete a topic
*AbstractStreamsApi* | **getStreamTopics** | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*AbstractStreamsApi* | **getSubscribers** | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
*AbstractStreamsApi* | **getSubscriptionStatus** | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*AbstractStreamsApi* | **updateStream** | **PATCH** /streams/{stream_id} | Update a stream
*AbstractUsersApi* | **createUser** | **POST** /users | Create a user
*AbstractUsersApi* | **createUserGroup** | **POST** /user_groups/create | Create a user group
*AbstractUsersApi* | **deactivateOwnUser** | **DELETE** /users/me | Deactivate own user
*AbstractUsersApi* | **getAttachments** | **GET** /attachments | Get attachments
*AbstractUsersApi* | **getOwnUser** | **GET** /users/me | Get own user
*AbstractUsersApi* | **getUserGroups** | **GET** /user_groups | Get user groups
*AbstractUsersApi* | **getUsers** | **GET** /users | Get all users
*AbstractUsersApi* | **setTypingStatus** | **POST** /typing | Set \"typing\" status
*AbstractUsersApi* | **updateSettings** | **PATCH** /settings | Update settings
*AbstractUsersApi* | **updateStatus** | **POST** /users/me/status | Update your status
*AbstractUsersApi* | **deactivateUser** | **DELETE** /users/{user_id} | Deactivate a user
*AbstractUsersApi* | **getUser** | **GET** /users/{user_id} | Get a user
*AbstractUsersApi* | **getUserByEmail** | **GET** /users/{email} | Get a user by email
*AbstractUsersApi* | **getUserPresence** | **GET** /users/{user_id_or_email}/presence | Get user presence
*AbstractUsersApi* | **muteUser** | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*AbstractUsersApi* | **reactivateUser** | **POST** /users/{user_id}/reactivate | Reactivate a user
*AbstractUsersApi* | **removeUserGroup** | **DELETE** /user_groups/{user_group_id} | Delete a user group
*AbstractUsersApi* | **unmuteUser** | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*AbstractUsersApi* | **updateUser** | **PATCH** /users/{user_id} | Update a user
*AbstractUsersApi* | **updateUserGroup** | **PATCH** /user_groups/{user_group_id} | Update a user group
*AbstractUsersApi* | **updateUserGroupMembers** | **POST** /user_groups/{user_group_id}/members | Update user group members
*AbstractWebhooksApi* | **zulipOutgoingWebhooks** | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Models

* OpenAPIServer\Model\AddSubscriptionsResponse
* OpenAPIServer\Model\AddSubscriptionsResponseAllOf
* OpenAPIServer\Model\ApiKeyResponse
* OpenAPIServer\Model\ApiKeyResponseAllOf
* OpenAPIServer\Model\Attachments
* OpenAPIServer\Model\AttachmentsMessages
* OpenAPIServer\Model\BadEventQueueIdError
* OpenAPIServer\Model\BadEventQueueIdErrorAllOf
* OpenAPIServer\Model\BasicBot
* OpenAPIServer\Model\BasicBotAllOf
* OpenAPIServer\Model\BasicBotBase
* OpenAPIServer\Model\BasicStream
* OpenAPIServer\Model\BasicStreamAllOf
* OpenAPIServer\Model\BasicStreamBase
* OpenAPIServer\Model\Bot
* OpenAPIServer\Model\BotAllOf
* OpenAPIServer\Model\CodedError
* OpenAPIServer\Model\CodedErrorAllOf
* OpenAPIServer\Model\CodedErrorBase
* OpenAPIServer\Model\CodedErrorBaseAllOf
* OpenAPIServer\Model\CustomProfileField
* OpenAPIServer\Model\DefaultStreamGroup
* OpenAPIServer\Model\Draft
* OpenAPIServer\Model\EmojiBase
* OpenAPIServer\Model\EmojiReaction
* OpenAPIServer\Model\EmojiReactionAllOf
* OpenAPIServer\Model\EmojiReactionBase
* OpenAPIServer\Model\EmojiReactionBaseAllOf
* OpenAPIServer\Model\EmojiReactionBaseAllOfUser
* OpenAPIServer\Model\GetMessages
* OpenAPIServer\Model\GetMessagesAllOf
* OpenAPIServer\Model\Hotspot
* OpenAPIServer\Model\InlineResponse200
* OpenAPIServer\Model\InvalidApiKeyError
* OpenAPIServer\Model\InvalidMessageError
* OpenAPIServer\Model\InvalidMessageErrorAllOf
* OpenAPIServer\Model\JsonError
* OpenAPIServer\Model\JsonErrorBase
* OpenAPIServer\Model\JsonErrorBaseAllOf
* OpenAPIServer\Model\JsonResponseBase
* OpenAPIServer\Model\JsonSuccess
* OpenAPIServer\Model\JsonSuccessAllOf
* OpenAPIServer\Model\JsonSuccessBase
* OpenAPIServer\Model\JsonSuccessBaseAllOf
* OpenAPIServer\Model\Messages
* OpenAPIServer\Model\MessagesAllOf
* OpenAPIServer\Model\MessagesBase
* OpenAPIServer\Model\MessagesBaseTopicLinks
* OpenAPIServer\Model\MissingArgumentError
* OpenAPIServer\Model\MissingArgumentErrorAllOf
* OpenAPIServer\Model\NonExistingStreamError
* OpenAPIServer\Model\NonExistingStreamErrorAllOf
* OpenAPIServer\Model\Presence
* OpenAPIServer\Model\RateLimitedError
* OpenAPIServer\Model\RealmDeactivatedError
* OpenAPIServer\Model\RealmDomain
* OpenAPIServer\Model\RealmEmoji
* OpenAPIServer\Model\RealmExport
* OpenAPIServer\Model\RealmPlayground
* OpenAPIServer\Model\Subscriptions
* OpenAPIServer\Model\User
* OpenAPIServer\Model\UserAllOf
* OpenAPIServer\Model\UserBase
* OpenAPIServer\Model\UserDeactivatedError
* OpenAPIServer\Model\UserGroup
* OpenAPIServer\Model\UserNotAuthorizedError


## Authentication

### Security schema `BasicAuth`
> Important! To make Basic authentication work you need to extend [\OpenAPIServer\Auth\AbstractAuthenticator](./lib/Auth/AbstractAuthenticator.php) class by [\OpenAPIServer\Auth\BasicAuthenticator](./src/Auth/BasicAuthenticator.php) class.

### Advanced middleware configuration
Ref to used Slim Token Middleware [dyorg/slim-token-authentication](https://github.com/dyorg/slim-token-authentication/tree/1.x#readme)
