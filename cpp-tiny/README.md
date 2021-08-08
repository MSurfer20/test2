# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variablies:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Zulip REST API 1.0.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://example.zulipchat.comhttps://example.zulipchat.com/api/v1

### AuthenticationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*devFetchApiKey* | *POST* /dev_fetch_api_key | Fetch an API key (development only).|
|*fetchApiKey* | *POST* /fetch_api_key | Fetch an API key (production).|

### MessagesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addReaction* | *POST* /messages/{message_id}/reactions | Add an emoji reaction.|
|*checkMessagesMatchNarrow* | *GET* /messages/matches_narrow | Check if messages match a narrow.|
|*deleteMessage* | *DELETE* /messages/{message_id} | Delete a message.|
|*getFileTemporaryUrl* | *GET* /user_uploads/{realm_id_str}/{filename} | Get public temporary URL.|
|*getMessageHistory* | *GET* /messages/{message_id}/history | Get a message's edit history.|
|*getMessages* | *GET* /messages | Get messages.|
|*getRawMessage* | *GET* /messages/{message_id} | Get a message's raw Markdown.|
|*markAllAsRead* | *POST* /mark_all_as_read | Mark all messages as read.|
|*markStreamAsRead* | *POST* /mark_stream_as_read | Mark messages in a stream as read.|
|*markTopicAsRead* | *POST* /mark_topic_as_read | Mark messages in a topic as read.|
|*removeReaction* | *DELETE* /messages/{message_id}/reactions | Remove an emoji reaction.|
|*renderMessage* | *POST* /messages/render | Render message.|
|*sendMessage* | *POST* /messages | Send a message.|
|*updateMessage* | *PATCH* /messages/{message_id} | Edit a message.|
|*updateMessageFlags* | *POST* /messages/flags | Update personal message flags.|
|*uploadFile* | *POST* /user_uploads | Upload a file.|

### RealTimeEventsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteQueue* | *DELETE* /events | Delete an event queue.|
|*getEvents* | *GET* /events | Get events from an event queue.|
|*realTimePost* | *POST* /real-time | .|
|*registerQueue* | *POST* /register | Register an event queue.|
|*restErrorHandling* | *POST* /rest-error-handling | Error handling.|

### ServerAndOrganizationsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addCodePlayground* | *POST* /realm/playgrounds | Add a code playground.|
|*addLinkifier* | *POST* /realm/filters | Add a linkifier.|
|*createCustomProfileField* | *POST* /realm/profile_fields | Create a custom profile field.|
|*getCustomEmoji* | *GET* /realm/emoji | Get all custom emoji.|
|*getCustomProfileFields* | *GET* /realm/profile_fields | Get all custom profile fields.|
|*getLinkifiers* | *GET* /realm/linkifiers | Get linkifiers.|
|*getServerSettings* | *GET* /server_settings | Get server settings.|
|*removeCodePlayground* | *DELETE* /realm/playgrounds/{playground_id} | Remove a code playground.|
|*removeLinkifier* | *DELETE* /realm/filters/{filter_id} | Remove a linkifier.|
|*reorderCustomProfileFields* | *PATCH* /realm/profile_fields | Reorder custom profile fields.|
|*updateLinkifier* | *PATCH* /realm/filters/{filter_id} | Update a linkifier.|
|*uploadCustomEmoji* | *POST* /realm/emoji/{emoji_name} | Upload custom emoji.|

### StreamsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*archiveStream* | *DELETE* /streams/{stream_id} | Archive a stream.|
|*createBigBlueButtonVideoCall* | *GET* /calls/bigbluebutton/create | Create BigBlueButton video call.|
|*getStreamId* | *GET* /get_stream_id | Get stream ID.|
|*getStreamTopics* | *GET* /users/me/{stream_id}/topics | Get topics in a stream.|
|*getStreams* | *GET* /streams | Get all streams.|
|*getSubscriptionStatus* | *GET* /users/{user_id}/subscriptions/{stream_id} | Get subscription status.|
|*getSubscriptions* | *GET* /users/me/subscriptions | Get subscribed streams.|
|*muteTopic* | *PATCH* /users/me/subscriptions/muted_topics | Topic muting.|
|*subscribe* | *POST* /users/me/subscriptions | Subscribe to a stream.|
|*unsubscribe* | *DELETE* /users/me/subscriptions | Unsubscribe from a stream.|
|*updateStream* | *PATCH* /streams/{stream_id} | Update a stream.|
|*updateSubscriptionSettings* | *POST* /users/me/subscriptions/properties | Update subscription settings.|
|*updateSubscriptions* | *PATCH* /users/me/subscriptions | Update subscriptions.|

### UsersApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createUser* | *POST* /users | Create a user.|
|*createUserGroup* | *POST* /user_groups/create | Create a user group.|
|*deactivateOwnUser* | *DELETE* /users/me | Deactivate own user.|
|*deactivateUser* | *DELETE* /users/{user_id} | Deactivate a user.|
|*getAttachments* | *GET* /attachments | Get attachments.|
|*getOwnUser* | *GET* /users/me | Get own user.|
|*getUser* | *GET* /users/{user_id} | Get a user.|
|*getUserByEmail* | *GET* /users/{email} | Get a user by email.|
|*getUserGroups* | *GET* /user_groups | Get user groups.|
|*getUserPresence* | *GET* /users/{user_id_or_email}/presence | Get user presence.|
|*getUsers* | *GET* /users | Get all users.|
|*muteUser* | *POST* /users/me/muted_users/{muted_user_id} | Mute a user.|
|*reactivateUser* | *POST* /users/{user_id}/reactivate | Reactivate a user.|
|*removeUserGroup* | *DELETE* /user_groups/{user_group_id} | Delete a user group.|
|*setTypingStatus* | *POST* /typing | Set \"typing\" status.|
|*unmuteUser* | *DELETE* /users/me/muted_users/{muted_user_id} | Unmute a user.|
|*updateDisplaySettings* | *PATCH* /settings/display | Update display settings.|
|*updateNotificationSettings* | *PATCH* /settings/notifications | Update notification settings.|
|*updateUser* | *PATCH* /users/{user_id} | Update a user.|
|*updateUserGroup* | *PATCH* /user_groups/{user_group_id} | Update a user group.|
|*updateUserGroupMembers* | *POST* /user_groups/{user_group_id}/members | Update user group members.|

### WebhooksApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*zulipOutgoingWebhooks* | *POST* /zulip-outgoing-webhook | Outgoing webhooks.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AddSubscriptionsResponse* | |
|*AddSubscriptionsResponse_allOf* | |
|*ApiKeyResponse* | |
|*ApiKeyResponse_allOf* | |
|*Attachments* | Dictionary containing details of a file uploaded by a user. |
|*Attachments_messages* | |
|*BadEventQueueIdError* | |
|*BadEventQueueIdError_allOf* | |
|*BasicBot* | |
|*BasicBotBase* | |
|*BasicBot_allOf* | |
|*BasicStream* | |
|*BasicStreamBase* | Object containing basic details about the stream. |
|*BasicStream_allOf* | |
|*Bot* | |
|*Bot_allOf* | Object containing details of a bot. |
|*CodedError* | |
|*CodedErrorBase* | |
|*CodedErrorBase_allOf* | |
|*CodedError_allOf* | |
|*CustomProfileField* | Dictionary containing the details of a custom profile field configured for this organization. |
|*DefaultStreamGroup* | Dictionary containing details of a default stream group. |
|*EmojiReaction* | |
|*EmojiReactionBase* | |
|*EmojiReactionBase_user* | Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. |
|*EmojiReaction_allOf* | |
|*GetMessages* | |
|*GetMessages_allOf* | |
|*Hotspot* | Dictionary containing details of a single hotspot. |
|*Inline_response_200* | This is an example of the JSON payload that the Zulip server will `POST` to your server |
|*InvalidApiKeyError* | |
|*InvalidMessageError* | |
|*InvalidMessageError_allOf* | |
|*JsonError* | |
|*JsonErrorBase* | |
|*JsonErrorBase_allOf* | |
|*JsonResponseBase* | |
|*JsonSuccess* | |
|*JsonSuccessBase* | |
|*JsonSuccessBase_allOf* | |
|*JsonSuccess_allOf* | |
|*Messages* | |
|*MessagesBase* | Object containing details of the message. |
|*MessagesBase_topic_links* | |
|*Messages_allOf* | |
|*MissingArgumentError* | |
|*MissingArgumentError_allOf* | ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied |
|*NonExistingStreamError* | |
|*NonExistingStreamError_allOf* | |
|*Presence* | `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. |
|*RateLimitedError* | |
|*RealmDeactivatedError* | |
|*RealmDomain* | Object containing details of the newly added domain. |
|*RealmEmoji* | `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: |
|*RealmExport* | Object containing details about a realm export. |
|*RealmPlayground* | Object containing details about a realm playground. |
|*Subscriptions* | |
|*User* | |
|*UserBase* | A dictionary containing basic data on a given Zulip user. |
|*UserDeactivatedError* | |
|*UserGroup* | Object containing the user group's attributes. |
|*UserNotAuthorizedError* | |
|*User_allOf* | |


