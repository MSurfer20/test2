# openapi-client

Zulip REST API
- API version: 1.0.0

Powerful open source group chat


  For more information, please visit [https://zulip.com](https://zulip.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "org.openapitools" % "openapi-client" % "1.0.0"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | **devFetchApiKey** | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | **fetchApiKey** | **POST** /fetch_api_key | Fetch an API key (production)
*DraftsApi* | **createDrafts** | **POST** /drafts | Create drafts
*DraftsApi* | **deleteDraft** | **DELETE** /drafts/${draftId} | Delete a draft
*DraftsApi* | **editDraft** | **PATCH** /drafts/${draftId} | Edit a draft
*DraftsApi* | **getDrafts** | **GET** /drafts | Get drafts
*MessagesApi* | **addReaction** | **POST** /messages/${messageId}/reactions | Add an emoji reaction
*MessagesApi* | **checkMessagesMatchNarrow** | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | **deleteMessage** | **DELETE** /messages/${messageId} | Delete a message
*MessagesApi* | **getFileTemporaryUrl** | **GET** /user_uploads/${realmIdStr}/${filename} | Get public temporary URL
*MessagesApi* | **getMessageHistory** | **GET** /messages/${messageId}/history | Get a message&#39;s edit history
*MessagesApi* | **getMessages** | **GET** /messages | Get messages
*MessagesApi* | **getRawMessage** | **GET** /messages/${messageId} | Get a message&#39;s raw Markdown
*MessagesApi* | **markAllAsRead** | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | **markStreamAsRead** | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | **markTopicAsRead** | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | **removeReaction** | **DELETE** /messages/${messageId}/reactions | Remove an emoji reaction
*MessagesApi* | **renderMessage** | **POST** /messages/render | Render message
*MessagesApi* | **sendMessage** | **POST** /messages | Send a message
*MessagesApi* | **updateMessage** | **PATCH** /messages/${messageId} | Edit a message
*MessagesApi* | **updateMessageFlags** | **POST** /messages/flags | Update personal message flags
*MessagesApi* | **uploadFile** | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | **deleteQueue** | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | **getEvents** | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | **realTimePost** | **POST** /real-time | 
*RealTimeEventsApi* | **registerQueue** | **POST** /register | Register an event queue
*RealTimeEventsApi* | **restErrorHandling** | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | **addCodePlayground** | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | **addLinkifier** | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | **createCustomProfileField** | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | **getCustomEmoji** | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | **getCustomProfileFields** | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | **getLinkifiers** | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | **getServerSettings** | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | **removeCodePlayground** | **DELETE** /realm/playgrounds/${playgroundId} | Remove a code playground
*ServerAndOrganizationsApi* | **removeLinkifier** | **DELETE** /realm/filters/${filterId} | Remove a linkifier
*ServerAndOrganizationsApi* | **reorderCustomProfileFields** | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | **updateLinkifier** | **PATCH** /realm/filters/${filterId} | Update a linkifier
*ServerAndOrganizationsApi* | **uploadCustomEmoji** | **POST** /realm/emoji/${emojiName} | Upload custom emoji
*StreamsApi* | **archiveStream** | **DELETE** /streams/${streamId} | Archive a stream
*StreamsApi* | **createBigBlueButtonVideoCall** | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | **deleteTopic** | **POST** /streams/${streamId}/delete_topic | Delete a topic
*StreamsApi* | **getStreamId** | **GET** /get_stream_id | Get stream ID
*StreamsApi* | **getStreamTopics** | **GET** /users/me/${streamId}/topics | Get topics in a stream
*StreamsApi* | **getStreams** | **GET** /streams | Get all streams
*StreamsApi* | **getSubscribers** | **GET** /streams/${streamId}/members | Get the subscribers of a stream
*StreamsApi* | **getSubscriptionStatus** | **GET** /users/${userId}/subscriptions/${streamId} | Get subscription status
*StreamsApi* | **getSubscriptions** | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | **muteTopic** | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | **subscribe** | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | **unsubscribe** | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | **updateStream** | **PATCH** /streams/${streamId} | Update a stream
*StreamsApi* | **updateSubscriptionSettings** | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | **updateSubscriptions** | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | **createUser** | **POST** /users | Create a user
*UsersApi* | **createUserGroup** | **POST** /user_groups/create | Create a user group
*UsersApi* | **deactivateOwnUser** | **DELETE** /users/me | Deactivate own user
*UsersApi* | **deactivateUser** | **DELETE** /users/${userId} | Deactivate a user
*UsersApi* | **getAttachments** | **GET** /attachments | Get attachments
*UsersApi* | **getOwnUser** | **GET** /users/me | Get own user
*UsersApi* | **getUser** | **GET** /users/${userId} | Get a user
*UsersApi* | **getUserByEmail** | **GET** /users/${email} | Get a user by email
*UsersApi* | **getUserGroups** | **GET** /user_groups | Get user groups
*UsersApi* | **getUserPresence** | **GET** /users/${userIdOrEmail}/presence | Get user presence
*UsersApi* | **getUsers** | **GET** /users | Get all users
*UsersApi* | **muteUser** | **POST** /users/me/muted_users/${mutedUserId} | Mute a user
*UsersApi* | **reactivateUser** | **POST** /users/${userId}/reactivate | Reactivate a user
*UsersApi* | **removeUserGroup** | **DELETE** /user_groups/${userGroupId} | Delete a user group
*UsersApi* | **setTypingStatus** | **POST** /typing | Set \&quot;typing\&quot; status
*UsersApi* | **unmuteUser** | **DELETE** /users/me/muted_users/${mutedUserId} | Unmute a user
*UsersApi* | **updateSettings** | **PATCH** /settings | Update settings
*UsersApi* | **updateStatus** | **POST** /users/me/status | Update your status
*UsersApi* | **updateUser** | **PATCH** /users/${userId} | Update a user
*UsersApi* | **updateUserGroup** | **PATCH** /user_groups/${userGroupId} | Update a user group
*UsersApi* | **updateUserGroupMembers** | **POST** /user_groups/${userGroupId}/members | Update user group members
*WebhooksApi* | **zulipOutgoingWebhooks** | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation for Models

 - [AddSubscriptionsResponse](AddSubscriptionsResponse.md)
 - [AddSubscriptionsResponseAllOf](AddSubscriptionsResponseAllOf.md)
 - [ApiKeyResponse](ApiKeyResponse.md)
 - [ApiKeyResponseAllOf](ApiKeyResponseAllOf.md)
 - [Attachments](Attachments.md)
 - [AttachmentsMessages](AttachmentsMessages.md)
 - [BadEventQueueIdError](BadEventQueueIdError.md)
 - [BadEventQueueIdErrorAllOf](BadEventQueueIdErrorAllOf.md)
 - [BasicBot](BasicBot.md)
 - [BasicBotAllOf](BasicBotAllOf.md)
 - [BasicBotBase](BasicBotBase.md)
 - [BasicStream](BasicStream.md)
 - [BasicStreamAllOf](BasicStreamAllOf.md)
 - [BasicStreamBase](BasicStreamBase.md)
 - [Bot](Bot.md)
 - [BotAllOf](BotAllOf.md)
 - [CodedError](CodedError.md)
 - [CodedErrorAllOf](CodedErrorAllOf.md)
 - [CodedErrorBase](CodedErrorBase.md)
 - [CodedErrorBaseAllOf](CodedErrorBaseAllOf.md)
 - [CustomProfileField](CustomProfileField.md)
 - [DefaultStreamGroup](DefaultStreamGroup.md)
 - [Draft](Draft.md)
 - [EmojiBase](EmojiBase.md)
 - [EmojiReaction](EmojiReaction.md)
 - [EmojiReactionAllOf](EmojiReactionAllOf.md)
 - [EmojiReactionBase](EmojiReactionBase.md)
 - [EmojiReactionBaseAllOf](EmojiReactionBaseAllOf.md)
 - [EmojiReactionBaseAllOfUser](EmojiReactionBaseAllOfUser.md)
 - [GetMessages](GetMessages.md)
 - [GetMessagesAllOf](GetMessagesAllOf.md)
 - [Hotspot](Hotspot.md)
 - [InlineResponse200](InlineResponse200.md)
 - [InvalidApiKeyError](InvalidApiKeyError.md)
 - [InvalidMessageError](InvalidMessageError.md)
 - [InvalidMessageErrorAllOf](InvalidMessageErrorAllOf.md)
 - [JsonError](JsonError.md)
 - [JsonErrorBase](JsonErrorBase.md)
 - [JsonErrorBaseAllOf](JsonErrorBaseAllOf.md)
 - [JsonResponseBase](JsonResponseBase.md)
 - [JsonSuccess](JsonSuccess.md)
 - [JsonSuccessAllOf](JsonSuccessAllOf.md)
 - [JsonSuccessBase](JsonSuccessBase.md)
 - [JsonSuccessBaseAllOf](JsonSuccessBaseAllOf.md)
 - [Messages](Messages.md)
 - [MessagesAllOf](MessagesAllOf.md)
 - [MessagesBase](MessagesBase.md)
 - [MessagesBaseTopicLinks](MessagesBaseTopicLinks.md)
 - [MissingArgumentError](MissingArgumentError.md)
 - [MissingArgumentErrorAllOf](MissingArgumentErrorAllOf.md)
 - [NonExistingStreamError](NonExistingStreamError.md)
 - [NonExistingStreamErrorAllOf](NonExistingStreamErrorAllOf.md)
 - [Presence](Presence.md)
 - [RateLimitedError](RateLimitedError.md)
 - [RealmDeactivatedError](RealmDeactivatedError.md)
 - [RealmDomain](RealmDomain.md)
 - [RealmEmoji](RealmEmoji.md)
 - [RealmExport](RealmExport.md)
 - [RealmPlayground](RealmPlayground.md)
 - [Subscriptions](Subscriptions.md)
 - [User](User.md)
 - [UserAllOf](UserAllOf.md)
 - [UserBase](UserBase.md)
 - [UserDeactivatedError](UserDeactivatedError.md)
 - [UserGroup](UserGroup.md)
 - [UserNotAuthorizedError](UserNotAuthorizedError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication


## Author



