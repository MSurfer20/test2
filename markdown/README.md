# Documentation for Zulip REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://example.zulipchat.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**devFetchApiKey**](Apis/AuthenticationApi.md#devfetchapikey) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
*AuthenticationApi* | [**fetchApiKey**](Apis/AuthenticationApi.md#fetchapikey) | **POST** /fetch_api_key | Fetch an API key (production)
*MessagesApi* | [**addReaction**](Apis/MessagesApi.md#addreaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
*MessagesApi* | [**checkMessagesMatchNarrow**](Apis/MessagesApi.md#checkmessagesmatchnarrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
*MessagesApi* | [**deleteMessage**](Apis/MessagesApi.md#deletemessage) | **DELETE** /messages/{message_id} | Delete a message
*MessagesApi* | [**getFileTemporaryUrl**](Apis/MessagesApi.md#getfiletemporaryurl) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
*MessagesApi* | [**getMessageHistory**](Apis/MessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message's edit history
*MessagesApi* | [**getMessages**](Apis/MessagesApi.md#getmessages) | **GET** /messages | Get messages
*MessagesApi* | [**getRawMessage**](Apis/MessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message's raw Markdown
*MessagesApi* | [**markAllAsRead**](Apis/MessagesApi.md#markallasread) | **POST** /mark_all_as_read | Mark all messages as read
*MessagesApi* | [**markStreamAsRead**](Apis/MessagesApi.md#markstreamasread) | **POST** /mark_stream_as_read | Mark messages in a stream as read
*MessagesApi* | [**markTopicAsRead**](Apis/MessagesApi.md#marktopicasread) | **POST** /mark_topic_as_read | Mark messages in a topic as read
*MessagesApi* | [**removeReaction**](Apis/MessagesApi.md#removereaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
*MessagesApi* | [**renderMessage**](Apis/MessagesApi.md#rendermessage) | **POST** /messages/render | Render message
*MessagesApi* | [**sendMessage**](Apis/MessagesApi.md#sendmessage) | **POST** /messages | Send a message
*MessagesApi* | [**updateMessage**](Apis/MessagesApi.md#updatemessage) | **PATCH** /messages/{message_id} | Edit a message
*MessagesApi* | [**updateMessageFlags**](Apis/MessagesApi.md#updatemessageflags) | **POST** /messages/flags | Update personal message flags
*MessagesApi* | [**uploadFile**](Apis/MessagesApi.md#uploadfile) | **POST** /user_uploads | Upload a file
*RealTimeEventsApi* | [**deleteQueue**](Apis/RealTimeEventsApi.md#deletequeue) | **DELETE** /events | Delete an event queue
*RealTimeEventsApi* | [**getEvents**](Apis/RealTimeEventsApi.md#getevents) | **GET** /events | Get events from an event queue
*RealTimeEventsApi* | [**realTimePost**](Apis/RealTimeEventsApi.md#realtimepost) | **POST** /real-time | (Ignored) 
*RealTimeEventsApi* | [**registerQueue**](Apis/RealTimeEventsApi.md#registerqueue) | **POST** /register | Register an event queue
*RealTimeEventsApi* | [**restErrorHandling**](Apis/RealTimeEventsApi.md#resterrorhandling) | **POST** /rest-error-handling | Error handling
*ServerAndOrganizationsApi* | [**addCodePlayground**](Apis/ServerAndOrganizationsApi.md#addcodeplayground) | **POST** /realm/playgrounds | Add a code playground
*ServerAndOrganizationsApi* | [**addLinkifier**](Apis/ServerAndOrganizationsApi.md#addlinkifier) | **POST** /realm/filters | Add a linkifier
*ServerAndOrganizationsApi* | [**createCustomProfileField**](Apis/ServerAndOrganizationsApi.md#createcustomprofilefield) | **POST** /realm/profile_fields | Create a custom profile field
*ServerAndOrganizationsApi* | [**getCustomEmoji**](Apis/ServerAndOrganizationsApi.md#getcustomemoji) | **GET** /realm/emoji | Get all custom emoji
*ServerAndOrganizationsApi* | [**getCustomProfileFields**](Apis/ServerAndOrganizationsApi.md#getcustomprofilefields) | **GET** /realm/profile_fields | Get all custom profile fields
*ServerAndOrganizationsApi* | [**getLinkifiers**](Apis/ServerAndOrganizationsApi.md#getlinkifiers) | **GET** /realm/linkifiers | Get linkifiers
*ServerAndOrganizationsApi* | [**getServerSettings**](Apis/ServerAndOrganizationsApi.md#getserversettings) | **GET** /server_settings | Get server settings
*ServerAndOrganizationsApi* | [**removeCodePlayground**](Apis/ServerAndOrganizationsApi.md#removecodeplayground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
*ServerAndOrganizationsApi* | [**removeLinkifier**](Apis/ServerAndOrganizationsApi.md#removelinkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
*ServerAndOrganizationsApi* | [**reorderCustomProfileFields**](Apis/ServerAndOrganizationsApi.md#reordercustomprofilefields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
*ServerAndOrganizationsApi* | [**updateLinkifier**](Apis/ServerAndOrganizationsApi.md#updatelinkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
*ServerAndOrganizationsApi* | [**uploadCustomEmoji**](Apis/ServerAndOrganizationsApi.md#uploadcustomemoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
*StreamsApi* | [**archiveStream**](Apis/StreamsApi.md#archivestream) | **DELETE** /streams/{stream_id} | Archive a stream
*StreamsApi* | [**createBigBlueButtonVideoCall**](Apis/StreamsApi.md#createbigbluebuttonvideocall) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
*StreamsApi* | [**getStreamId**](Apis/StreamsApi.md#getstreamid) | **GET** /get_stream_id | Get stream ID
*StreamsApi* | [**getStreamTopics**](Apis/StreamsApi.md#getstreamtopics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
*StreamsApi* | [**getStreams**](Apis/StreamsApi.md#getstreams) | **GET** /streams | Get all streams
*StreamsApi* | [**getSubscriptionStatus**](Apis/StreamsApi.md#getsubscriptionstatus) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
*StreamsApi* | [**getSubscriptions**](Apis/StreamsApi.md#getsubscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
*StreamsApi* | [**muteTopic**](Apis/StreamsApi.md#mutetopic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
*StreamsApi* | [**subscribe**](Apis/StreamsApi.md#subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
*StreamsApi* | [**unsubscribe**](Apis/StreamsApi.md#unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
*StreamsApi* | [**updateStream**](Apis/StreamsApi.md#updatestream) | **PATCH** /streams/{stream_id} | Update a stream
*StreamsApi* | [**updateSubscriptionSettings**](Apis/StreamsApi.md#updatesubscriptionsettings) | **POST** /users/me/subscriptions/properties | Update subscription settings
*StreamsApi* | [**updateSubscriptions**](Apis/StreamsApi.md#updatesubscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
*UsersApi* | [**createUser**](Apis/UsersApi.md#createuser) | **POST** /users | Create a user
*UsersApi* | [**createUserGroup**](Apis/UsersApi.md#createusergroup) | **POST** /user_groups/create | Create a user group
*UsersApi* | [**deactivateOwnUser**](Apis/UsersApi.md#deactivateownuser) | **DELETE** /users/me | Deactivate own user
*UsersApi* | [**deactivateUser**](Apis/UsersApi.md#deactivateuser) | **DELETE** /users/{user_id} | Deactivate a user
*UsersApi* | [**getAttachments**](Apis/UsersApi.md#getattachments) | **GET** /attachments | Get attachments
*UsersApi* | [**getOwnUser**](Apis/UsersApi.md#getownuser) | **GET** /users/me | Get own user
*UsersApi* | [**getUser**](Apis/UsersApi.md#getuser) | **GET** /users/{user_id} | Get a user
*UsersApi* | [**getUserByEmail**](Apis/UsersApi.md#getuserbyemail) | **GET** /users/{email} | Get a user by email
*UsersApi* | [**getUserGroups**](Apis/UsersApi.md#getusergroups) | **GET** /user_groups | Get user groups
*UsersApi* | [**getUserPresence**](Apis/UsersApi.md#getuserpresence) | **GET** /users/{user_id_or_email}/presence | Get user presence
*UsersApi* | [**getUsers**](Apis/UsersApi.md#getusers) | **GET** /users | Get all users
*UsersApi* | [**muteUser**](Apis/UsersApi.md#muteuser) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
*UsersApi* | [**reactivateUser**](Apis/UsersApi.md#reactivateuser) | **POST** /users/{user_id}/reactivate | Reactivate a user
*UsersApi* | [**removeUserGroup**](Apis/UsersApi.md#removeusergroup) | **DELETE** /user_groups/{user_group_id} | Delete a user group
*UsersApi* | [**setTypingStatus**](Apis/UsersApi.md#settypingstatus) | **POST** /typing | Set \"typing\" status
*UsersApi* | [**unmuteUser**](Apis/UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**updateDisplaySettings**](Apis/UsersApi.md#updatedisplaysettings) | **PATCH** /settings/display | Update display settings
*UsersApi* | [**updateNotificationSettings**](Apis/UsersApi.md#updatenotificationsettings) | **PATCH** /settings/notifications | Update notification settings
*UsersApi* | [**updateUser**](Apis/UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**updateUserGroup**](Apis/UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**updateUserGroupMembers**](Apis/UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**zulipOutgoingWebhooks**](Apis/WebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


<a name="documentation-for-models"></a>
## Documentation for Models

 - [AddSubscriptionsResponse](./Models/AddSubscriptionsResponse.md)
 - [AddSubscriptionsResponseAllOf](./Models/AddSubscriptionsResponseAllOf.md)
 - [ApiKeyResponse](./Models/ApiKeyResponse.md)
 - [ApiKeyResponseAllOf](./Models/ApiKeyResponseAllOf.md)
 - [Attachments](./Models/Attachments.md)
 - [AttachmentsMessages](./Models/AttachmentsMessages.md)
 - [BadEventQueueIdError](./Models/BadEventQueueIdError.md)
 - [BadEventQueueIdErrorAllOf](./Models/BadEventQueueIdErrorAllOf.md)
 - [BasicBot](./Models/BasicBot.md)
 - [BasicBotAllOf](./Models/BasicBotAllOf.md)
 - [BasicBotBase](./Models/BasicBotBase.md)
 - [BasicStream](./Models/BasicStream.md)
 - [BasicStreamAllOf](./Models/BasicStreamAllOf.md)
 - [BasicStreamBase](./Models/BasicStreamBase.md)
 - [Bot](./Models/Bot.md)
 - [BotAllOf](./Models/BotAllOf.md)
 - [CodedError](./Models/CodedError.md)
 - [CodedErrorAllOf](./Models/CodedErrorAllOf.md)
 - [CodedErrorBase](./Models/CodedErrorBase.md)
 - [CodedErrorBaseAllOf](./Models/CodedErrorBaseAllOf.md)
 - [CustomProfileField](./Models/CustomProfileField.md)
 - [DefaultStreamGroup](./Models/DefaultStreamGroup.md)
 - [EmojiReaction](./Models/EmojiReaction.md)
 - [EmojiReactionAllOf](./Models/EmojiReactionAllOf.md)
 - [EmojiReactionBase](./Models/EmojiReactionBase.md)
 - [EmojiReactionBaseUser](./Models/EmojiReactionBaseUser.md)
 - [GetMessages](./Models/GetMessages.md)
 - [GetMessagesAllOf](./Models/GetMessagesAllOf.md)
 - [Hotspot](./Models/Hotspot.md)
 - [InlineResponse200](./Models/InlineResponse200.md)
 - [InvalidApiKeyError](./Models/InvalidApiKeyError.md)
 - [InvalidMessageError](./Models/InvalidMessageError.md)
 - [InvalidMessageErrorAllOf](./Models/InvalidMessageErrorAllOf.md)
 - [JsonError](./Models/JsonError.md)
 - [JsonErrorBase](./Models/JsonErrorBase.md)
 - [JsonErrorBaseAllOf](./Models/JsonErrorBaseAllOf.md)
 - [JsonResponseBase](./Models/JsonResponseBase.md)
 - [JsonSuccess](./Models/JsonSuccess.md)
 - [JsonSuccessAllOf](./Models/JsonSuccessAllOf.md)
 - [JsonSuccessBase](./Models/JsonSuccessBase.md)
 - [JsonSuccessBaseAllOf](./Models/JsonSuccessBaseAllOf.md)
 - [Messages](./Models/Messages.md)
 - [MessagesAllOf](./Models/MessagesAllOf.md)
 - [MessagesBase](./Models/MessagesBase.md)
 - [MessagesBaseTopicLinks](./Models/MessagesBaseTopicLinks.md)
 - [MissingArgumentError](./Models/MissingArgumentError.md)
 - [MissingArgumentErrorAllOf](./Models/MissingArgumentErrorAllOf.md)
 - [NonExistingStreamError](./Models/NonExistingStreamError.md)
 - [NonExistingStreamErrorAllOf](./Models/NonExistingStreamErrorAllOf.md)
 - [Presence](./Models/Presence.md)
 - [RateLimitedError](./Models/RateLimitedError.md)
 - [RealmDeactivatedError](./Models/RealmDeactivatedError.md)
 - [RealmDomain](./Models/RealmDomain.md)
 - [RealmEmoji](./Models/RealmEmoji.md)
 - [RealmExport](./Models/RealmExport.md)
 - [RealmPlayground](./Models/RealmPlayground.md)
 - [Subscriptions](./Models/Subscriptions.md)
 - [User](./Models/User.md)
 - [UserAllOf](./Models/UserAllOf.md)
 - [UserBase](./Models/UserBase.md)
 - [UserDeactivatedError](./Models/UserDeactivatedError.md)
 - [UserGroup](./Models/UserGroup.md)
 - [UserNotAuthorizedError](./Models/UserNotAuthorizedError.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BasicAuth"></a>
### BasicAuth

- **Type**: HTTP basic authentication

