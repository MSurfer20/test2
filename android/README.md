# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.AuthenticationApi;

public class AuthenticationApiExample {

    public static void main(String[] args) {
        AuthenticationApi apiInstance = new AuthenticationApi();
        String username = iago@zulip.com; // String | The email address for the user that owns the API key. 
        try {
            ApiKeyResponse result = apiInstance.devFetchApiKey(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#devFetchApiKey");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**devFetchApiKey**](docs/AuthenticationApi.md#devFetchApiKey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | [**fetchApiKey**](docs/AuthenticationApi.md#fetchApiKey) | **POST** /fetch_api_key | Fetch an API key (production)
*DraftsApi* | [**createDrafts**](docs/DraftsApi.md#createDrafts) | **POST** /drafts | Create drafts
*DraftsApi* | [**deleteDraft**](docs/DraftsApi.md#deleteDraft) | **DELETE** /drafts/{draft_id} | Delete a draft
*DraftsApi* | [**editDraft**](docs/DraftsApi.md#editDraft) | **PATCH** /drafts/{draft_id} | Edit a draft
*DraftsApi* | [**getDrafts**](docs/DraftsApi.md#getDrafts) | **GET** /drafts | Get drafts
*MessagesApi* | [**addReaction**](docs/MessagesApi.md#addReaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*MessagesApi* | [**checkMessagesMatchNarrow**](docs/MessagesApi.md#checkMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | [**deleteMessage**](docs/MessagesApi.md#deleteMessage) | **DELETE** /messages/{message_id} | Delete a message
*MessagesApi* | [**getFileTemporaryUrl**](docs/MessagesApi.md#getFileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*MessagesApi* | [**getMessageHistory**](docs/MessagesApi.md#getMessageHistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
*MessagesApi* | [**getMessages**](docs/MessagesApi.md#getMessages) | **GET** /messages | Get messages
*MessagesApi* | [**getRawMessage**](docs/MessagesApi.md#getRawMessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
*MessagesApi* | [**markAllAsRead**](docs/MessagesApi.md#markAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | [**markStreamAsRead**](docs/MessagesApi.md#markStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | [**markTopicAsRead**](docs/MessagesApi.md#markTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | [**removeReaction**](docs/MessagesApi.md#removeReaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*MessagesApi* | [**renderMessage**](docs/MessagesApi.md#renderMessage) | **POST** /messages/render | Render message
*MessagesApi* | [**sendMessage**](docs/MessagesApi.md#sendMessage) | **POST** /messages | Send a message
*MessagesApi* | [**updateMessage**](docs/MessagesApi.md#updateMessage) | **PATCH** /messages/{message_id} | Edit a message
*MessagesApi* | [**updateMessageFlags**](docs/MessagesApi.md#updateMessageFlags) | **POST** /messages/flags | Update personal message flags
*MessagesApi* | [**uploadFile**](docs/MessagesApi.md#uploadFile) | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | [**deleteQueue**](docs/RealTimeEventsApi.md#deleteQueue) | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | [**getEvents**](docs/RealTimeEventsApi.md#getEvents) | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | [**realTimePost**](docs/RealTimeEventsApi.md#realTimePost) | **POST** /real-time | 
*RealTimeEventsApi* | [**registerQueue**](docs/RealTimeEventsApi.md#registerQueue) | **POST** /register | Register an event queue
*RealTimeEventsApi* | [**restErrorHandling**](docs/RealTimeEventsApi.md#restErrorHandling) | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | [**addCodePlayground**](docs/ServerAndOrganizationsApi.md#addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | [**addLinkifier**](docs/ServerAndOrganizationsApi.md#addLinkifier) | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | [**createCustomProfileField**](docs/ServerAndOrganizationsApi.md#createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | [**getCustomEmoji**](docs/ServerAndOrganizationsApi.md#getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | [**getCustomProfileFields**](docs/ServerAndOrganizationsApi.md#getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | [**getLinkifiers**](docs/ServerAndOrganizationsApi.md#getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | [**getServerSettings**](docs/ServerAndOrganizationsApi.md#getServerSettings) | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | [**removeCodePlayground**](docs/ServerAndOrganizationsApi.md#removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*ServerAndOrganizationsApi* | [**removeLinkifier**](docs/ServerAndOrganizationsApi.md#removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*ServerAndOrganizationsApi* | [**reorderCustomProfileFields**](docs/ServerAndOrganizationsApi.md#reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | [**updateLinkifier**](docs/ServerAndOrganizationsApi.md#updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*ServerAndOrganizationsApi* | [**uploadCustomEmoji**](docs/ServerAndOrganizationsApi.md#uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*StreamsApi* | [**archiveStream**](docs/StreamsApi.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
*StreamsApi* | [**createBigBlueButtonVideoCall**](docs/StreamsApi.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | [**deleteTopic**](docs/StreamsApi.md#deleteTopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
*StreamsApi* | [**getStreamId**](docs/StreamsApi.md#getStreamId) | **GET** /get_stream_id | Get stream ID
*StreamsApi* | [**getStreamTopics**](docs/StreamsApi.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*StreamsApi* | [**getStreams**](docs/StreamsApi.md#getStreams) | **GET** /streams | Get all streams
*StreamsApi* | [**getSubscribers**](docs/StreamsApi.md#getSubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
*StreamsApi* | [**getSubscriptionStatus**](docs/StreamsApi.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*StreamsApi* | [**getSubscriptions**](docs/StreamsApi.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | [**muteTopic**](docs/StreamsApi.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | [**subscribe**](docs/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | [**unsubscribe**](docs/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | [**updateStream**](docs/StreamsApi.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
*StreamsApi* | [**updateSubscriptionSettings**](docs/StreamsApi.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | [**updateSubscriptions**](docs/StreamsApi.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /users | Create a user
*UsersApi* | [**createUserGroup**](docs/UsersApi.md#createUserGroup) | **POST** /user_groups/create | Create a user group
*UsersApi* | [**deactivateOwnUser**](docs/UsersApi.md#deactivateOwnUser) | **DELETE** /users/me | Deactivate own user
*UsersApi* | [**deactivateUser**](docs/UsersApi.md#deactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
*UsersApi* | [**getAttachments**](docs/UsersApi.md#getAttachments) | **GET** /attachments | Get attachments
*UsersApi* | [**getOwnUser**](docs/UsersApi.md#getOwnUser) | **GET** /users/me | Get own user
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**getUserByEmail**](docs/UsersApi.md#getUserByEmail) | **GET** /users/{email} | Get a user by email
*UsersApi* | [**getUserGroups**](docs/UsersApi.md#getUserGroups) | **GET** /user_groups | Get user groups
*UsersApi* | [**getUserPresence**](docs/UsersApi.md#getUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /users | Get all users
*UsersApi* | [**muteUser**](docs/UsersApi.md#muteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*UsersApi* | [**reactivateUser**](docs/UsersApi.md#reactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
*UsersApi* | [**removeUserGroup**](docs/UsersApi.md#removeUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*UsersApi* | [**setTypingStatus**](docs/UsersApi.md#setTypingStatus) | **POST** /typing | Set \&quot;typing\&quot; status
*UsersApi* | [**unmuteUser**](docs/UsersApi.md#unmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**updateSettings**](docs/UsersApi.md#updateSettings) | **PATCH** /settings | Update settings
*UsersApi* | [**updateStatus**](docs/UsersApi.md#updateStatus) | **POST** /users/me/status | Update your status
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**updateUserGroup**](docs/UsersApi.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**updateUserGroupMembers**](docs/UsersApi.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**zulipOutgoingWebhooks**](docs/WebhooksApi.md#zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation for Models

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


## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



