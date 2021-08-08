# Documentation for Zulip REST API 1.0.0 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Zulip REST API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://example.zulipchat.comhttps://example.zulipchat.com/api/v1


### AuthenticationManager
Method | HTTP request | Description
------------- | ------------- | -------------
*devFetchApiKeySync* | *POST* /dev_fetch_api_key | Fetch an API key (development only).
*devFetchApiKeyASync* | *POST* /dev_fetch_api_key | Fetch an API key (development only).
*fetchApiKeySync* | *POST* /fetch_api_key | Fetch an API key (production).
*fetchApiKeyASync* | *POST* /fetch_api_key | Fetch an API key (production).


### DraftsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*createDraftsSync* | *POST* /drafts | Create drafts.
*createDraftsASync* | *POST* /drafts | Create drafts.
*deleteDraftSync* | *DELETE* /drafts/{draft_id} | Delete a draft.
*deleteDraftASync* | *DELETE* /drafts/{draft_id} | Delete a draft.
*editDraftSync* | *PATCH* /drafts/{draft_id} | Edit a draft.
*editDraftASync* | *PATCH* /drafts/{draft_id} | Edit a draft.
*getDraftsSync* | *GET* /drafts | Get drafts.
*getDraftsASync* | *GET* /drafts | Get drafts.


### MessagesManager
Method | HTTP request | Description
------------- | ------------- | -------------
*addReactionSync* | *POST* /messages/{message_id}/reactions | Add an emoji reaction.
*addReactionASync* | *POST* /messages/{message_id}/reactions | Add an emoji reaction.
*checkMessagesMatchNarrowSync* | *GET* /messages/matches_narrow | Check if messages match a narrow.
*checkMessagesMatchNarrowASync* | *GET* /messages/matches_narrow | Check if messages match a narrow.
*deleteMessageSync* | *DELETE* /messages/{message_id} | Delete a message.
*deleteMessageASync* | *DELETE* /messages/{message_id} | Delete a message.
*getFileTemporaryUrlSync* | *GET* /user_uploads/{realm_id_str}/{filename} | Get public temporary URL.
*getFileTemporaryUrlASync* | *GET* /user_uploads/{realm_id_str}/{filename} | Get public temporary URL.
*getMessageHistorySync* | *GET* /messages/{message_id}/history | Get a message's edit history.
*getMessageHistoryASync* | *GET* /messages/{message_id}/history | Get a message's edit history.
*getMessagesSync* | *GET* /messages | Get messages.
*getMessagesASync* | *GET* /messages | Get messages.
*getRawMessageSync* | *GET* /messages/{message_id} | Get a message's raw Markdown.
*getRawMessageASync* | *GET* /messages/{message_id} | Get a message's raw Markdown.
*markAllAsReadSync* | *POST* /mark_all_as_read | Mark all messages as read.
*markAllAsReadASync* | *POST* /mark_all_as_read | Mark all messages as read.
*markStreamAsReadSync* | *POST* /mark_stream_as_read | Mark messages in a stream as read.
*markStreamAsReadASync* | *POST* /mark_stream_as_read | Mark messages in a stream as read.
*markTopicAsReadSync* | *POST* /mark_topic_as_read | Mark messages in a topic as read.
*markTopicAsReadASync* | *POST* /mark_topic_as_read | Mark messages in a topic as read.
*removeReactionSync* | *DELETE* /messages/{message_id}/reactions | Remove an emoji reaction.
*removeReactionASync* | *DELETE* /messages/{message_id}/reactions | Remove an emoji reaction.
*renderMessageSync* | *POST* /messages/render | Render message.
*renderMessageASync* | *POST* /messages/render | Render message.
*sendMessageSync* | *POST* /messages | Send a message.
*sendMessageASync* | *POST* /messages | Send a message.
*updateMessageSync* | *PATCH* /messages/{message_id} | Edit a message.
*updateMessageASync* | *PATCH* /messages/{message_id} | Edit a message.
*updateMessageFlagsSync* | *POST* /messages/flags | Update personal message flags.
*updateMessageFlagsASync* | *POST* /messages/flags | Update personal message flags.
*uploadFileSync* | *POST* /user_uploads | Upload a file.
*uploadFileASync* | *POST* /user_uploads | Upload a file.


### RealTimeEventsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*deleteQueueSync* | *DELETE* /events | Delete an event queue.
*deleteQueueASync* | *DELETE* /events | Delete an event queue.
*getEventsSync* | *GET* /events | Get events from an event queue.
*getEventsASync* | *GET* /events | Get events from an event queue.
*realTimePostSync* | *POST* /real-time | .
*realTimePostASync* | *POST* /real-time | .
*registerQueueSync* | *POST* /register | Register an event queue.
*registerQueueASync* | *POST* /register | Register an event queue.
*restErrorHandlingSync* | *POST* /rest-error-handling | Error handling.
*restErrorHandlingASync* | *POST* /rest-error-handling | Error handling.


### ServerAndOrganizationsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*addCodePlaygroundSync* | *POST* /realm/playgrounds | Add a code playground.
*addCodePlaygroundASync* | *POST* /realm/playgrounds | Add a code playground.
*addLinkifierSync* | *POST* /realm/filters | Add a linkifier.
*addLinkifierASync* | *POST* /realm/filters | Add a linkifier.
*createCustomProfileFieldSync* | *POST* /realm/profile_fields | Create a custom profile field.
*createCustomProfileFieldASync* | *POST* /realm/profile_fields | Create a custom profile field.
*getCustomEmojiSync* | *GET* /realm/emoji | Get all custom emoji.
*getCustomEmojiASync* | *GET* /realm/emoji | Get all custom emoji.
*getCustomProfileFieldsSync* | *GET* /realm/profile_fields | Get all custom profile fields.
*getCustomProfileFieldsASync* | *GET* /realm/profile_fields | Get all custom profile fields.
*getLinkifiersSync* | *GET* /realm/linkifiers | Get linkifiers.
*getLinkifiersASync* | *GET* /realm/linkifiers | Get linkifiers.
*getServerSettingsSync* | *GET* /server_settings | Get server settings.
*getServerSettingsASync* | *GET* /server_settings | Get server settings.
*removeCodePlaygroundSync* | *DELETE* /realm/playgrounds/{playground_id} | Remove a code playground.
*removeCodePlaygroundASync* | *DELETE* /realm/playgrounds/{playground_id} | Remove a code playground.
*removeLinkifierSync* | *DELETE* /realm/filters/{filter_id} | Remove a linkifier.
*removeLinkifierASync* | *DELETE* /realm/filters/{filter_id} | Remove a linkifier.
*reorderCustomProfileFieldsSync* | *PATCH* /realm/profile_fields | Reorder custom profile fields.
*reorderCustomProfileFieldsASync* | *PATCH* /realm/profile_fields | Reorder custom profile fields.
*updateLinkifierSync* | *PATCH* /realm/filters/{filter_id} | Update a linkifier.
*updateLinkifierASync* | *PATCH* /realm/filters/{filter_id} | Update a linkifier.
*uploadCustomEmojiSync* | *POST* /realm/emoji/{emoji_name} | Upload custom emoji.
*uploadCustomEmojiASync* | *POST* /realm/emoji/{emoji_name} | Upload custom emoji.


### StreamsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*archiveStreamSync* | *DELETE* /streams/{stream_id} | Archive a stream.
*archiveStreamASync* | *DELETE* /streams/{stream_id} | Archive a stream.
*createBigBlueButtonVideoCallSync* | *GET* /calls/bigbluebutton/create | Create BigBlueButton video call.
*createBigBlueButtonVideoCallASync* | *GET* /calls/bigbluebutton/create | Create BigBlueButton video call.
*deleteTopicSync* | *POST* /streams/{stream_id}/delete_topic | Delete a topic.
*deleteTopicASync* | *POST* /streams/{stream_id}/delete_topic | Delete a topic.
*getStreamIdSync* | *GET* /get_stream_id | Get stream ID.
*getStreamIdASync* | *GET* /get_stream_id | Get stream ID.
*getStreamTopicsSync* | *GET* /users/me/{stream_id}/topics | Get topics in a stream.
*getStreamTopicsASync* | *GET* /users/me/{stream_id}/topics | Get topics in a stream.
*getStreamsSync* | *GET* /streams | Get all streams.
*getStreamsASync* | *GET* /streams | Get all streams.
*getSubscribersSync* | *GET* /streams/{stream_id}/members | Get the subscribers of a stream.
*getSubscribersASync* | *GET* /streams/{stream_id}/members | Get the subscribers of a stream.
*getSubscriptionStatusSync* | *GET* /users/{user_id}/subscriptions/{stream_id} | Get subscription status.
*getSubscriptionStatusASync* | *GET* /users/{user_id}/subscriptions/{stream_id} | Get subscription status.
*getSubscriptionsSync* | *GET* /users/me/subscriptions | Get subscribed streams.
*getSubscriptionsASync* | *GET* /users/me/subscriptions | Get subscribed streams.
*muteTopicSync* | *PATCH* /users/me/subscriptions/muted_topics | Topic muting.
*muteTopicASync* | *PATCH* /users/me/subscriptions/muted_topics | Topic muting.
*subscribeSync* | *POST* /users/me/subscriptions | Subscribe to a stream.
*subscribeASync* | *POST* /users/me/subscriptions | Subscribe to a stream.
*unsubscribeSync* | *DELETE* /users/me/subscriptions | Unsubscribe from a stream.
*unsubscribeASync* | *DELETE* /users/me/subscriptions | Unsubscribe from a stream.
*updateStreamSync* | *PATCH* /streams/{stream_id} | Update a stream.
*updateStreamASync* | *PATCH* /streams/{stream_id} | Update a stream.
*updateSubscriptionSettingsSync* | *POST* /users/me/subscriptions/properties | Update subscription settings.
*updateSubscriptionSettingsASync* | *POST* /users/me/subscriptions/properties | Update subscription settings.
*updateSubscriptionsSync* | *PATCH* /users/me/subscriptions | Update subscriptions.
*updateSubscriptionsASync* | *PATCH* /users/me/subscriptions | Update subscriptions.


### UsersManager
Method | HTTP request | Description
------------- | ------------- | -------------
*createUserSync* | *POST* /users | Create a user.
*createUserASync* | *POST* /users | Create a user.
*createUserGroupSync* | *POST* /user_groups/create | Create a user group.
*createUserGroupASync* | *POST* /user_groups/create | Create a user group.
*deactivateOwnUserSync* | *DELETE* /users/me | Deactivate own user.
*deactivateOwnUserASync* | *DELETE* /users/me | Deactivate own user.
*deactivateUserSync* | *DELETE* /users/{user_id} | Deactivate a user.
*deactivateUserASync* | *DELETE* /users/{user_id} | Deactivate a user.
*getAttachmentsSync* | *GET* /attachments | Get attachments.
*getAttachmentsASync* | *GET* /attachments | Get attachments.
*getOwnUserSync* | *GET* /users/me | Get own user.
*getOwnUserASync* | *GET* /users/me | Get own user.
*getUserSync* | *GET* /users/{user_id} | Get a user.
*getUserASync* | *GET* /users/{user_id} | Get a user.
*getUserByEmailSync* | *GET* /users/{email} | Get a user by email.
*getUserByEmailASync* | *GET* /users/{email} | Get a user by email.
*getUserGroupsSync* | *GET* /user_groups | Get user groups.
*getUserGroupsASync* | *GET* /user_groups | Get user groups.
*getUserPresenceSync* | *GET* /users/{user_id_or_email}/presence | Get user presence.
*getUserPresenceASync* | *GET* /users/{user_id_or_email}/presence | Get user presence.
*getUsersSync* | *GET* /users | Get all users.
*getUsersASync* | *GET* /users | Get all users.
*muteUserSync* | *POST* /users/me/muted_users/{muted_user_id} | Mute a user.
*muteUserASync* | *POST* /users/me/muted_users/{muted_user_id} | Mute a user.
*reactivateUserSync* | *POST* /users/{user_id}/reactivate | Reactivate a user.
*reactivateUserASync* | *POST* /users/{user_id}/reactivate | Reactivate a user.
*removeUserGroupSync* | *DELETE* /user_groups/{user_group_id} | Delete a user group.
*removeUserGroupASync* | *DELETE* /user_groups/{user_group_id} | Delete a user group.
*setTypingStatusSync* | *POST* /typing | Set \"typing\" status.
*setTypingStatusASync* | *POST* /typing | Set \"typing\" status.
*unmuteUserSync* | *DELETE* /users/me/muted_users/{muted_user_id} | Unmute a user.
*unmuteUserASync* | *DELETE* /users/me/muted_users/{muted_user_id} | Unmute a user.
*updateSettingsSync* | *PATCH* /settings | Update settings.
*updateSettingsASync* | *PATCH* /settings | Update settings.
*updateStatusSync* | *POST* /users/me/status | Update your status.
*updateStatusASync* | *POST* /users/me/status | Update your status.
*updateUserSync* | *PATCH* /users/{user_id} | Update a user.
*updateUserASync* | *PATCH* /users/{user_id} | Update a user.
*updateUserGroupSync* | *PATCH* /user_groups/{user_group_id} | Update a user group.
*updateUserGroupASync* | *PATCH* /user_groups/{user_group_id} | Update a user group.
*updateUserGroupMembersSync* | *POST* /user_groups/{user_group_id}/members | Update user group members.
*updateUserGroupMembersASync* | *POST* /user_groups/{user_group_id}/members | Update user group members.


### WebhooksManager
Method | HTTP request | Description
------------- | ------------- | -------------
*zulipOutgoingWebhooksSync* | *POST* /zulip-outgoing-webhook | Outgoing webhooks.
*zulipOutgoingWebhooksASync* | *POST* /zulip-outgoing-webhook | Outgoing webhooks.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *AddSubscriptionsResponse* | 
 *AddSubscriptionsResponse_allOf* | 
 *ApiKeyResponse* | 
 *ApiKeyResponse_allOf* | 
 *Attachments* | Dictionary containing details of a file uploaded by a user. 
 *Attachments_messages* | 
 *BadEventQueueIdError* | 
 *BadEventQueueIdError_allOf* | 
 *BasicBot* | 
 *BasicBotBase* | 
 *BasicBot_allOf* | 
 *BasicStream* | 
 *BasicStreamBase* | Object containing basic details about the stream. 
 *BasicStream_allOf* | 
 *Bot* | 
 *Bot_allOf* | Object containing details of a bot. 
 *CodedError* | 
 *CodedErrorBase* | 
 *CodedErrorBase_allOf* | 
 *CodedError_allOf* | 
 *CustomProfileField* | Dictionary containing the details of a custom profile field configured for this organization. 
 *DefaultStreamGroup* | Dictionary containing details of a default stream group. 
 *Draft* | A dictionary for representing a message draft. 
 *EmojiBase* | 
 *EmojiReaction* | 
 *EmojiReactionBase* | 
 *EmojiReactionBase_allOf* | 
 *EmojiReactionBase_allOf_user* | Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 *EmojiReaction_allOf* | 
 *GetMessages* | 
 *GetMessages_allOf* | 
 *Hotspot* | Dictionary containing details of a single hotspot. 
 *Inline_response_200* | This is an example of the JSON payload that the Zulip server will `POST` to your server 
 *InvalidApiKeyError* | 
 *InvalidMessageError* | 
 *InvalidMessageError_allOf* | 
 *JsonError* | 
 *JsonErrorBase* | 
 *JsonErrorBase_allOf* | 
 *JsonResponseBase* | 
 *JsonSuccess* | 
 *JsonSuccessBase* | 
 *JsonSuccessBase_allOf* | 
 *JsonSuccess_allOf* | 
 *Messages* | 
 *MessagesBase* | Object containing details of the message. 
 *MessagesBase_topic_links* | 
 *Messages_allOf* | 
 *MissingArgumentError* | 
 *MissingArgumentError_allOf* | ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 *NonExistingStreamError* | 
 *NonExistingStreamError_allOf* | 
 *Presence* | `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 *RateLimitedError* | 
 *RealmDeactivatedError* | 
 *RealmDomain* | Object containing details of the newly added domain. 
 *RealmEmoji* | `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 *RealmExport* | Object containing details about a realm export. 
 *RealmPlayground* | Object containing details about a realm playground. 
 *Subscriptions* | 
 *User* | 
 *UserBase* | A dictionary containing basic data on a given Zulip user. 
 *UserDeactivatedError* | 
 *UserGroup* | Object containing the user group's attributes. 
 *UserNotAuthorizedError* | 
 *User_allOf* | 

