# Zulip REST API API Client


Powerful open source group chat\n

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASAuthenticationApi api = new OASAuthenticationApi();

Map<String, Object> params = new Map<String, Object>{
    'username' => iago@zulip.com
};

try {
    // cross your fingers
    OASApiKeyResponse result = api.devFetchApiKey(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASAuthenticationApi* | [**devFetchApiKey**](OASAuthenticationApi.md#devFetchApiKey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*OASAuthenticationApi* | [**fetchApiKey**](OASAuthenticationApi.md#fetchApiKey) | **POST** /fetch_api_key | Fetch an API key (production)
*OASMessagesApi* | [**addReaction**](OASMessagesApi.md#addReaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*OASMessagesApi* | [**checkMessagesMatchNarrow**](OASMessagesApi.md#checkMessagesMatchNarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*OASMessagesApi* | [**deleteMessage**](OASMessagesApi.md#deleteMessage) | **DELETE** /messages/{message_id} | Delete a message
*OASMessagesApi* | [**getFileTemporaryUrl**](OASMessagesApi.md#getFileTemporaryUrl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*OASMessagesApi* | [**getMessageHistory**](OASMessagesApi.md#getMessageHistory) | **GET** /messages/{message_id}/history | Get a message\&#39;s edit history
*OASMessagesApi* | [**getMessages**](OASMessagesApi.md#getMessages) | **GET** /messages | Get messages
*OASMessagesApi* | [**getRawMessage**](OASMessagesApi.md#getRawMessage) | **GET** /messages/{message_id} | Get a message\&#39;s raw Markdown
*OASMessagesApi* | [**markAllAsRead**](OASMessagesApi.md#markAllAsRead) | **POST** /mark_all_as_read | Mark all messages as read
*OASMessagesApi* | [**markStreamAsRead**](OASMessagesApi.md#markStreamAsRead) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*OASMessagesApi* | [**markTopicAsRead**](OASMessagesApi.md#markTopicAsRead) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*OASMessagesApi* | [**removeReaction**](OASMessagesApi.md#removeReaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*OASMessagesApi* | [**renderMessage**](OASMessagesApi.md#renderMessage) | **POST** /messages/render | Render message
*OASMessagesApi* | [**sendMessage**](OASMessagesApi.md#sendMessage) | **POST** /messages | Send a message
*OASMessagesApi* | [**updateMessage**](OASMessagesApi.md#updateMessage) | **PATCH** /messages/{message_id} | Edit a message
*OASMessagesApi* | [**updateMessageFlags**](OASMessagesApi.md#updateMessageFlags) | **POST** /messages/flags | Update personal message flags
*OASMessagesApi* | [**uploadFile**](OASMessagesApi.md#uploadFile) | **POST** /user_uploads | Upload a file
*OASRealTimeEventsApi* | [**deleteQueue**](OASRealTimeEventsApi.md#deleteQueue) | **DELETE** /events | Delete an event queue
*OASRealTimeEventsApi* | [**getEvents**](OASRealTimeEventsApi.md#getEvents) | **GET** /events | Get events from an event queue
*OASRealTimeEventsApi* | [**realTimePost**](OASRealTimeEventsApi.md#realTimePost) | **POST** /real-time | 
*OASRealTimeEventsApi* | [**registerQueue**](OASRealTimeEventsApi.md#registerQueue) | **POST** /register | Register an event queue
*OASRealTimeEventsApi* | [**restErrorHandling**](OASRealTimeEventsApi.md#restErrorHandling) | **POST** /rest-error-handling | Error handling
*OASServerAndOrganizationsApi* | [**addCodePlayground**](OASServerAndOrganizationsApi.md#addCodePlayground) | **POST** /realm/playgrounds | Add a code playground
*OASServerAndOrganizationsApi* | [**addLinkifier**](OASServerAndOrganizationsApi.md#addLinkifier) | **POST** /realm/filters | Add a linkifier
*OASServerAndOrganizationsApi* | [**createCustomProfileField**](OASServerAndOrganizationsApi.md#createCustomProfileField) | **POST** /realm/profile_fields | Create a custom profile field
*OASServerAndOrganizationsApi* | [**getCustomEmoji**](OASServerAndOrganizationsApi.md#getCustomEmoji) | **GET** /realm/emoji | Get all custom emoji
*OASServerAndOrganizationsApi* | [**getCustomProfileFields**](OASServerAndOrganizationsApi.md#getCustomProfileFields) | **GET** /realm/profile_fields | Get all custom profile fields
*OASServerAndOrganizationsApi* | [**getLinkifiers**](OASServerAndOrganizationsApi.md#getLinkifiers) | **GET** /realm/linkifiers | Get linkifiers
*OASServerAndOrganizationsApi* | [**getServerSettings**](OASServerAndOrganizationsApi.md#getServerSettings) | **GET** /server_settings | Get server settings
*OASServerAndOrganizationsApi* | [**removeCodePlayground**](OASServerAndOrganizationsApi.md#removeCodePlayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*OASServerAndOrganizationsApi* | [**removeLinkifier**](OASServerAndOrganizationsApi.md#removeLinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*OASServerAndOrganizationsApi* | [**reorderCustomProfileFields**](OASServerAndOrganizationsApi.md#reorderCustomProfileFields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*OASServerAndOrganizationsApi* | [**updateLinkifier**](OASServerAndOrganizationsApi.md#updateLinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*OASServerAndOrganizationsApi* | [**uploadCustomEmoji**](OASServerAndOrganizationsApi.md#uploadCustomEmoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*OASStreamsApi* | [**archiveStream**](OASStreamsApi.md#archiveStream) | **DELETE** /streams/{stream_id} | Archive a stream
*OASStreamsApi* | [**createBigBlueButtonVideoCall**](OASStreamsApi.md#createBigBlueButtonVideoCall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*OASStreamsApi* | [**getStreamId**](OASStreamsApi.md#getStreamId) | **GET** /get_stream_id | Get stream ID
*OASStreamsApi* | [**getStreamTopics**](OASStreamsApi.md#getStreamTopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*OASStreamsApi* | [**getStreams**](OASStreamsApi.md#getStreams) | **GET** /streams | Get all streams
*OASStreamsApi* | [**getSubscriptionStatus**](OASStreamsApi.md#getSubscriptionStatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*OASStreamsApi* | [**getSubscriptions**](OASStreamsApi.md#getSubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*OASStreamsApi* | [**muteTopic**](OASStreamsApi.md#muteTopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*OASStreamsApi* | [**subscribe**](OASStreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*OASStreamsApi* | [**unsubscribe**](OASStreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*OASStreamsApi* | [**updateStream**](OASStreamsApi.md#updateStream) | **PATCH** /streams/{stream_id} | Update a stream
*OASStreamsApi* | [**updateSubscriptionSettings**](OASStreamsApi.md#updateSubscriptionSettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*OASStreamsApi* | [**updateSubscriptions**](OASStreamsApi.md#updateSubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*OASUsersApi* | [**createUser**](OASUsersApi.md#createUser) | **POST** /users | Create a user
*OASUsersApi* | [**createUserGroup**](OASUsersApi.md#createUserGroup) | **POST** /user_groups/create | Create a user group
*OASUsersApi* | [**deactivateOwnUser**](OASUsersApi.md#deactivateOwnUser) | **DELETE** /users/me | Deactivate own user
*OASUsersApi* | [**deactivateUser**](OASUsersApi.md#deactivateUser) | **DELETE** /users/{user_id} | Deactivate a user
*OASUsersApi* | [**getAttachments**](OASUsersApi.md#getAttachments) | **GET** /attachments | Get attachments
*OASUsersApi* | [**getOwnUser**](OASUsersApi.md#getOwnUser) | **GET** /users/me | Get own user
*OASUsersApi* | [**getUser**](OASUsersApi.md#getUser) | **GET** /users/{user_id} | Get a user
*OASUsersApi* | [**getUserByEmail**](OASUsersApi.md#getUserByEmail) | **GET** /users/{email} | Get a user by email
*OASUsersApi* | [**getUserGroups**](OASUsersApi.md#getUserGroups) | **GET** /user_groups | Get user groups
*OASUsersApi* | [**getUserPresence**](OASUsersApi.md#getUserPresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*OASUsersApi* | [**getUsers**](OASUsersApi.md#getUsers) | **GET** /users | Get all users
*OASUsersApi* | [**muteUser**](OASUsersApi.md#muteUser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*OASUsersApi* | [**reactivateUser**](OASUsersApi.md#reactivateUser) | **POST** /users/{user_id}/reactivate | Reactivate a user
*OASUsersApi* | [**removeUserGroup**](OASUsersApi.md#removeUserGroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*OASUsersApi* | [**setTypingStatus**](OASUsersApi.md#setTypingStatus) | **POST** /typing | Set &quot;typing&quot; status
*OASUsersApi* | [**unmuteUser**](OASUsersApi.md#unmuteUser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*OASUsersApi* | [**updateDisplaySettings**](OASUsersApi.md#updateDisplaySettings) | **PATCH** /settings/display | Update display settings
*OASUsersApi* | [**updateNotificationSettings**](OASUsersApi.md#updateNotificationSettings) | **PATCH** /settings/notifications | Update notification settings
*OASUsersApi* | [**updateUser**](OASUsersApi.md#updateUser) | **PATCH** /users/{user_id} | Update a user
*OASUsersApi* | [**updateUserGroup**](OASUsersApi.md#updateUserGroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*OASUsersApi* | [**updateUserGroupMembers**](OASUsersApi.md#updateUserGroupMembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*OASWebhooksApi* | [**zulipOutgoingWebhooks**](OASWebhooksApi.md#zulipOutgoingWebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation for Models

 - [OASAddSubscriptionsResponse](OASAddSubscriptionsResponse.md)
 - [OASAddSubscriptionsResponseAllOf](OASAddSubscriptionsResponseAllOf.md)
 - [OASApiKeyResponse](OASApiKeyResponse.md)
 - [OASApiKeyResponseAllOf](OASApiKeyResponseAllOf.md)
 - [OASAttachments](OASAttachments.md)
 - [OASAttachmentsMessages](OASAttachmentsMessages.md)
 - [OASBadEventQueueIdError](OASBadEventQueueIdError.md)
 - [OASBadEventQueueIdErrorAllOf](OASBadEventQueueIdErrorAllOf.md)
 - [OASBasicBot](OASBasicBot.md)
 - [OASBasicBotAllOf](OASBasicBotAllOf.md)
 - [OASBasicBotBase](OASBasicBotBase.md)
 - [OASBasicStream](OASBasicStream.md)
 - [OASBasicStreamAllOf](OASBasicStreamAllOf.md)
 - [OASBasicStreamBase](OASBasicStreamBase.md)
 - [OASBot](OASBot.md)
 - [OASBotAllOf](OASBotAllOf.md)
 - [OASCodedError](OASCodedError.md)
 - [OASCodedErrorAllOf](OASCodedErrorAllOf.md)
 - [OASCodedErrorBase](OASCodedErrorBase.md)
 - [OASCodedErrorBaseAllOf](OASCodedErrorBaseAllOf.md)
 - [OASCustomProfileField](OASCustomProfileField.md)
 - [OASDefaultStreamGroup](OASDefaultStreamGroup.md)
 - [OASEmojiReaction](OASEmojiReaction.md)
 - [OASEmojiReactionAllOf](OASEmojiReactionAllOf.md)
 - [OASEmojiReactionBase](OASEmojiReactionBase.md)
 - [OASEmojiReactionBaseUser](OASEmojiReactionBaseUser.md)
 - [OASGetMessages](OASGetMessages.md)
 - [OASGetMessagesAllOf](OASGetMessagesAllOf.md)
 - [OASHotspot](OASHotspot.md)
 - [OASInlineResponse200](OASInlineResponse200.md)
 - [OASInvalidApiKeyError](OASInvalidApiKeyError.md)
 - [OASInvalidMessageError](OASInvalidMessageError.md)
 - [OASInvalidMessageErrorAllOf](OASInvalidMessageErrorAllOf.md)
 - [OASJsonError](OASJsonError.md)
 - [OASJsonErrorBase](OASJsonErrorBase.md)
 - [OASJsonErrorBaseAllOf](OASJsonErrorBaseAllOf.md)
 - [OASJsonResponseBase](OASJsonResponseBase.md)
 - [OASJsonSuccess](OASJsonSuccess.md)
 - [OASJsonSuccessAllOf](OASJsonSuccessAllOf.md)
 - [OASJsonSuccessBase](OASJsonSuccessBase.md)
 - [OASJsonSuccessBaseAllOf](OASJsonSuccessBaseAllOf.md)
 - [OASMessages](OASMessages.md)
 - [OASMessagesAllOf](OASMessagesAllOf.md)
 - [OASMessagesBase](OASMessagesBase.md)
 - [OASMessagesBaseTopicLinks](OASMessagesBaseTopicLinks.md)
 - [OASMissingArgumentError](OASMissingArgumentError.md)
 - [OASMissingArgumentErrorAllOf](OASMissingArgumentErrorAllOf.md)
 - [OASNonExistingStreamError](OASNonExistingStreamError.md)
 - [OASNonExistingStreamErrorAllOf](OASNonExistingStreamErrorAllOf.md)
 - [OASPresence](OASPresence.md)
 - [OASRateLimitedError](OASRateLimitedError.md)
 - [OASRealmDeactivatedError](OASRealmDeactivatedError.md)
 - [OASRealmDomain](OASRealmDomain.md)
 - [OASRealmEmoji](OASRealmEmoji.md)
 - [OASRealmExport](OASRealmExport.md)
 - [OASRealmPlayground](OASRealmPlayground.md)
 - [OASSubscriptions](OASSubscriptions.md)
 - [OASUser](OASUser.md)
 - [OASUserAllOf](OASUserAllOf.md)
 - [OASUserBase](OASUserBase.md)
 - [OASUserDeactivatedError](OASUserDeactivatedError.md)
 - [OASUserGroup](OASUserGroup.md)
 - [OASUserNotAuthorizedError](OASUserNotAuthorizedError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication


## Author



