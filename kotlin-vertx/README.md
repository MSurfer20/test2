# org.openapitools - Kotlin Server library for Zulip REST API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

    <a name="documentation-for-api-endpoints"></a>
    ## Documentation for API Endpoints

    All URIs are relative to *https://example.zulipchat.com/api/v1*

    Class | Method | HTTP request | Description
    ------------ | ------------- | ------------- | -------------
    *AuthenticationApi* | [**devFetchApiKey**](docs/AuthenticationApi.md#devfetchapikey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
    *AuthenticationApi* | [**fetchApiKey**](docs/AuthenticationApi.md#fetchapikey) | **POST** /fetch_api_key | Fetch an API key (production)
    *DraftsApi* | [**createDrafts**](docs/DraftsApi.md#createdrafts) | **POST** /drafts | Create drafts
    *DraftsApi* | [**deleteDraft**](docs/DraftsApi.md#deletedraft) | **DELETE** /drafts/{draft_id} | Delete a draft
    *DraftsApi* | [**editDraft**](docs/DraftsApi.md#editdraft) | **PATCH** /drafts/{draft_id} | Edit a draft
    *DraftsApi* | [**getDrafts**](docs/DraftsApi.md#getdrafts) | **GET** /drafts | Get drafts
    *MessagesApi* | [**addReaction**](docs/MessagesApi.md#addreaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
    *MessagesApi* | [**checkMessagesMatchNarrow**](docs/MessagesApi.md#checkmessagesmatchnarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
    *MessagesApi* | [**deleteMessage**](docs/MessagesApi.md#deletemessage) | **DELETE** /messages/{message_id} | Delete a message
    *MessagesApi* | [**getFileTemporaryUrl**](docs/MessagesApi.md#getfiletemporaryurl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
    *MessagesApi* | [**getMessageHistory**](docs/MessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message's edit history
    *MessagesApi* | [**getMessages**](docs/MessagesApi.md#getmessages) | **GET** /messages | Get messages
    *MessagesApi* | [**getRawMessage**](docs/MessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message's raw Markdown
    *MessagesApi* | [**markAllAsRead**](docs/MessagesApi.md#markallasread) | **POST** /mark_all_as_read | Mark all messages as read
    *MessagesApi* | [**markStreamAsRead**](docs/MessagesApi.md#markstreamasread) | **POST** /mark_stream_as_read | Mark messages in a stream as read
    *MessagesApi* | [**markTopicAsRead**](docs/MessagesApi.md#marktopicasread) | **POST** /mark_topic_as_read | Mark messages in a topic as read
    *MessagesApi* | [**removeReaction**](docs/MessagesApi.md#removereaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
    *MessagesApi* | [**renderMessage**](docs/MessagesApi.md#rendermessage) | **POST** /messages/render | Render message
    *MessagesApi* | [**sendMessage**](docs/MessagesApi.md#sendmessage) | **POST** /messages | Send a message
    *MessagesApi* | [**updateMessage**](docs/MessagesApi.md#updatemessage) | **PATCH** /messages/{message_id} | Edit a message
    *MessagesApi* | [**updateMessageFlags**](docs/MessagesApi.md#updatemessageflags) | **POST** /messages/flags | Update personal message flags
    *MessagesApi* | [**uploadFile**](docs/MessagesApi.md#uploadfile) | **POST** /user_uploads | Upload a file
    *RealTimeEventsApi* | [**deleteQueue**](docs/RealTimeEventsApi.md#deletequeue) | **DELETE** /events | Delete an event queue
    *RealTimeEventsApi* | [**getEvents**](docs/RealTimeEventsApi.md#getevents) | **GET** /events | Get events from an event queue
    *RealTimeEventsApi* | [**realTimePost**](docs/RealTimeEventsApi.md#realtimepost) | **POST** /real-time | 
    *RealTimeEventsApi* | [**registerQueue**](docs/RealTimeEventsApi.md#registerqueue) | **POST** /register | Register an event queue
    *RealTimeEventsApi* | [**restErrorHandling**](docs/RealTimeEventsApi.md#resterrorhandling) | **POST** /rest-error-handling | Error handling
    *ServerAndOrganizationsApi* | [**addCodePlayground**](docs/ServerAndOrganizationsApi.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
    *ServerAndOrganizationsApi* | [**addLinkifier**](docs/ServerAndOrganizationsApi.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
    *ServerAndOrganizationsApi* | [**createCustomProfileField**](docs/ServerAndOrganizationsApi.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
    *ServerAndOrganizationsApi* | [**getCustomEmoji**](docs/ServerAndOrganizationsApi.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
    *ServerAndOrganizationsApi* | [**getCustomProfileFields**](docs/ServerAndOrganizationsApi.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
    *ServerAndOrganizationsApi* | [**getLinkifiers**](docs/ServerAndOrganizationsApi.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
    *ServerAndOrganizationsApi* | [**getServerSettings**](docs/ServerAndOrganizationsApi.md#getserversettings) | **GET** /server_settings | Get server settings
    *ServerAndOrganizationsApi* | [**removeCodePlayground**](docs/ServerAndOrganizationsApi.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
    *ServerAndOrganizationsApi* | [**removeLinkifier**](docs/ServerAndOrganizationsApi.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
    *ServerAndOrganizationsApi* | [**reorderCustomProfileFields**](docs/ServerAndOrganizationsApi.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
    *ServerAndOrganizationsApi* | [**updateLinkifier**](docs/ServerAndOrganizationsApi.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
    *ServerAndOrganizationsApi* | [**uploadCustomEmoji**](docs/ServerAndOrganizationsApi.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
    *StreamsApi* | [**archiveStream**](docs/StreamsApi.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
    *StreamsApi* | [**createBigBlueButtonVideoCall**](docs/StreamsApi.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
    *StreamsApi* | [**deleteTopic**](docs/StreamsApi.md#deletetopic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
    *StreamsApi* | [**getStreamId**](docs/StreamsApi.md#getstreamid) | **GET** /get_stream_id | Get stream ID
    *StreamsApi* | [**getStreamTopics**](docs/StreamsApi.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
    *StreamsApi* | [**getStreams**](docs/StreamsApi.md#getstreams) | **GET** /streams | Get all streams
    *StreamsApi* | [**getSubscribers**](docs/StreamsApi.md#getsubscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
    *StreamsApi* | [**getSubscriptionStatus**](docs/StreamsApi.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
    *StreamsApi* | [**getSubscriptions**](docs/StreamsApi.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
    *StreamsApi* | [**muteTopic**](docs/StreamsApi.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
    *StreamsApi* | [**subscribe**](docs/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
    *StreamsApi* | [**unsubscribe**](docs/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
    *StreamsApi* | [**updateStream**](docs/StreamsApi.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
    *StreamsApi* | [**updateSubscriptionSettings**](docs/StreamsApi.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
    *StreamsApi* | [**updateSubscriptions**](docs/StreamsApi.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
    *UsersApi* | [**createUser**](docs/UsersApi.md#createuser) | **POST** /users | Create a user
    *UsersApi* | [**createUserGroup**](docs/UsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
    *UsersApi* | [**deactivateOwnUser**](docs/UsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
    *UsersApi* | [**deactivateUser**](docs/UsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
    *UsersApi* | [**getAttachments**](docs/UsersApi.md#getattachments) | **GET** /attachments | Get attachments
    *UsersApi* | [**getOwnUser**](docs/UsersApi.md#getownuser) | **GET** /users/me | Get own user
    *UsersApi* | [**getUser**](docs/UsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
    *UsersApi* | [**getUserByEmail**](docs/UsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
    *UsersApi* | [**getUserGroups**](docs/UsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
    *UsersApi* | [**getUserPresence**](docs/UsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
    *UsersApi* | [**getUsers**](docs/UsersApi.md#getusers) | **GET** /users | Get all users
    *UsersApi* | [**muteUser**](docs/UsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
    *UsersApi* | [**reactivateUser**](docs/UsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
    *UsersApi* | [**removeUserGroup**](docs/UsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
    *UsersApi* | [**setTypingStatus**](docs/UsersApi.md#settypingstatus) | **POST** /typing | Set \"typing\" status
    *UsersApi* | [**unmuteUser**](docs/UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
    *UsersApi* | [**updateSettings**](docs/UsersApi.md#updatesettings) | **PATCH** /settings | Update settings
    *UsersApi* | [**updateStatus**](docs/UsersApi.md#updatestatus) | **POST** /users/me/status | Update your status
    *UsersApi* | [**updateUser**](docs/UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
    *UsersApi* | [**updateUserGroup**](docs/UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
    *UsersApi* | [**updateUserGroupMembers**](docs/UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
    *WebhooksApi* | [**zulipOutgoingWebhooks**](docs/WebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks
    

    <a name="documentation-for-models"></a>
    ## Documentation for Models

         - [org.openapitools.server.api.model.AddSubscriptionsResponse](docs/AddSubscriptionsResponse.md)
         - [org.openapitools.server.api.model.AddSubscriptionsResponseAllOf](docs/AddSubscriptionsResponseAllOf.md)
         - [org.openapitools.server.api.model.ApiKeyResponse](docs/ApiKeyResponse.md)
         - [org.openapitools.server.api.model.ApiKeyResponseAllOf](docs/ApiKeyResponseAllOf.md)
         - [org.openapitools.server.api.model.Attachments](docs/Attachments.md)
         - [org.openapitools.server.api.model.AttachmentsMessages](docs/AttachmentsMessages.md)
         - [org.openapitools.server.api.model.BadEventQueueIdError](docs/BadEventQueueIdError.md)
         - [org.openapitools.server.api.model.BadEventQueueIdErrorAllOf](docs/BadEventQueueIdErrorAllOf.md)
         - [org.openapitools.server.api.model.BasicBot](docs/BasicBot.md)
         - [org.openapitools.server.api.model.BasicBotAllOf](docs/BasicBotAllOf.md)
         - [org.openapitools.server.api.model.BasicBotBase](docs/BasicBotBase.md)
         - [org.openapitools.server.api.model.BasicStream](docs/BasicStream.md)
         - [org.openapitools.server.api.model.BasicStreamAllOf](docs/BasicStreamAllOf.md)
         - [org.openapitools.server.api.model.BasicStreamBase](docs/BasicStreamBase.md)
         - [org.openapitools.server.api.model.Bot](docs/Bot.md)
         - [org.openapitools.server.api.model.BotAllOf](docs/BotAllOf.md)
         - [org.openapitools.server.api.model.CodedError](docs/CodedError.md)
         - [org.openapitools.server.api.model.CodedErrorAllOf](docs/CodedErrorAllOf.md)
         - [org.openapitools.server.api.model.CodedErrorBase](docs/CodedErrorBase.md)
         - [org.openapitools.server.api.model.CodedErrorBaseAllOf](docs/CodedErrorBaseAllOf.md)
         - [org.openapitools.server.api.model.CustomProfileField](docs/CustomProfileField.md)
         - [org.openapitools.server.api.model.DefaultStreamGroup](docs/DefaultStreamGroup.md)
         - [org.openapitools.server.api.model.Draft](docs/Draft.md)
         - [org.openapitools.server.api.model.EmojiBase](docs/EmojiBase.md)
         - [org.openapitools.server.api.model.EmojiReaction](docs/EmojiReaction.md)
         - [org.openapitools.server.api.model.EmojiReactionAllOf](docs/EmojiReactionAllOf.md)
         - [org.openapitools.server.api.model.EmojiReactionBase](docs/EmojiReactionBase.md)
         - [org.openapitools.server.api.model.EmojiReactionBaseAllOf](docs/EmojiReactionBaseAllOf.md)
         - [org.openapitools.server.api.model.EmojiReactionBaseAllOfUser](docs/EmojiReactionBaseAllOfUser.md)
         - [org.openapitools.server.api.model.GetMessages](docs/GetMessages.md)
         - [org.openapitools.server.api.model.GetMessagesAllOf](docs/GetMessagesAllOf.md)
         - [org.openapitools.server.api.model.Hotspot](docs/Hotspot.md)
         - [org.openapitools.server.api.model.InlineResponse200](docs/InlineResponse200.md)
         - [org.openapitools.server.api.model.InvalidApiKeyError](docs/InvalidApiKeyError.md)
         - [org.openapitools.server.api.model.InvalidMessageError](docs/InvalidMessageError.md)
         - [org.openapitools.server.api.model.InvalidMessageErrorAllOf](docs/InvalidMessageErrorAllOf.md)
         - [org.openapitools.server.api.model.JsonError](docs/JsonError.md)
         - [org.openapitools.server.api.model.JsonErrorBase](docs/JsonErrorBase.md)
         - [org.openapitools.server.api.model.JsonErrorBaseAllOf](docs/JsonErrorBaseAllOf.md)
         - [org.openapitools.server.api.model.JsonResponseBase](docs/JsonResponseBase.md)
         - [org.openapitools.server.api.model.JsonSuccess](docs/JsonSuccess.md)
         - [org.openapitools.server.api.model.JsonSuccessAllOf](docs/JsonSuccessAllOf.md)
         - [org.openapitools.server.api.model.JsonSuccessBase](docs/JsonSuccessBase.md)
         - [org.openapitools.server.api.model.JsonSuccessBaseAllOf](docs/JsonSuccessBaseAllOf.md)
         - [org.openapitools.server.api.model.Messages](docs/Messages.md)
         - [org.openapitools.server.api.model.MessagesAllOf](docs/MessagesAllOf.md)
         - [org.openapitools.server.api.model.MessagesBase](docs/MessagesBase.md)
         - [org.openapitools.server.api.model.MessagesBaseTopicLinks](docs/MessagesBaseTopicLinks.md)
         - [org.openapitools.server.api.model.MissingArgumentError](docs/MissingArgumentError.md)
         - [org.openapitools.server.api.model.MissingArgumentErrorAllOf](docs/MissingArgumentErrorAllOf.md)
         - [org.openapitools.server.api.model.NonExistingStreamError](docs/NonExistingStreamError.md)
         - [org.openapitools.server.api.model.NonExistingStreamErrorAllOf](docs/NonExistingStreamErrorAllOf.md)
         - [org.openapitools.server.api.model.Presence](docs/Presence.md)
         - [org.openapitools.server.api.model.RateLimitedError](docs/RateLimitedError.md)
         - [org.openapitools.server.api.model.RealmDeactivatedError](docs/RealmDeactivatedError.md)
         - [org.openapitools.server.api.model.RealmDomain](docs/RealmDomain.md)
         - [org.openapitools.server.api.model.RealmEmoji](docs/RealmEmoji.md)
         - [org.openapitools.server.api.model.RealmExport](docs/RealmExport.md)
         - [org.openapitools.server.api.model.RealmPlayground](docs/RealmPlayground.md)
         - [org.openapitools.server.api.model.Subscriptions](docs/Subscriptions.md)
         - [org.openapitools.server.api.model.User](docs/User.md)
         - [org.openapitools.server.api.model.UserAllOf](docs/UserAllOf.md)
         - [org.openapitools.server.api.model.UserBase](docs/UserBase.md)
         - [org.openapitools.server.api.model.UserDeactivatedError](docs/UserDeactivatedError.md)
         - [org.openapitools.server.api.model.UserGroup](docs/UserGroup.md)
         - [org.openapitools.server.api.model.UserNotAuthorizedError](docs/UserNotAuthorizedError.md)
        

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

    <a name="BasicAuth"></a>
    ### BasicAuth

        - **Type**: HTTP basic authentication
    
