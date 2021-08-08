# Zulip REST API Bash client

## Overview

This is a Bash client script for accessing Zulip REST API service.

The script uses cURL underneath for making all REST calls.

## Usage

```shell
# Make sure the script has executable rights
$ chmod u+x 

# Print the list of operations available on the service
$ ./ -h

# Print the service description
$ ./ --about

# Print detailed information about specific operation
$ ./ <operationId> -h

# Make GET request
./ --host http://<hostname>:<port> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make GET request using arbitrary curl options (must be passed before <operationId>) to an SSL service using username:password
 -k -sS --tlsv1.2 --host https://<hostname> -u <user>:<password> --accept xml <operationId> <queryParam1>=<value1> <header_key1>:<header_value2>

# Make POST request
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> -

# Make POST request with simple JSON content, e.g.:
# {
#   "key1": "value1",
#   "key2": "value2",
#   "key3": 23
# }
$ echo '<body_content>' |  --host <hostname> --content-type json <operationId> key1==value1 key2=value2 key3:=23 -

# Preview the cURL command without actually executing it
$  --host http://<hostname>:<port> --dry-run <operationid>

```

## Docker image

You can easily create a Docker image containing a preconfigured environment
for using the REST Bash client including working autocompletion and short
welcome message with basic instructions, using the generated Dockerfile:

```shell
docker build -t my-rest-client .
docker run -it my-rest-client
```

By default you will be logged into a Zsh environment which has much more
advanced auto completion, but you can switch to Bash, where basic autocompletion
is also available.

## Shell completion

### Bash

The generated bash-completion script can be either directly loaded to the current Bash session using:

```shell
source .bash-completion
```

Alternatively, the script can be copied to the `/etc/bash-completion.d` (or on OSX with Homebrew to `/usr/local/etc/bash-completion.d`):

```shell
sudo cp .bash-completion /etc/bash-completion.d/
```

#### OS X

On OSX you might need to install bash-completion using Homebrew:

```shell
brew install bash-completion
```

and add the following to the `~/.bashrc`:

```shell
if [ -f $(brew --prefix)/etc/bash_completion ]; then
  . $(brew --prefix)/etc/bash_completion
fi
```

### Zsh

In Zsh, the generated `_` Zsh completion file must be copied to one of the folders under `$FPATH` variable.

## Documentation for API Endpoints

All URIs are relative to */api/v1*

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
*MessagesApi* | [**getMessageHistory**](docs/MessagesApi.md#getmessagehistory) | **GET** /messages/{message_id}/history | Get a message&#39;s edit history
*MessagesApi* | [**getMessages**](docs/MessagesApi.md#getmessages) | **GET** /messages | Get messages
*MessagesApi* | [**getRawMessage**](docs/MessagesApi.md#getrawmessage) | **GET** /messages/{message_id} | Get a message&#39;s raw Markdown
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
*UsersApi* | [**setTypingStatus**](docs/UsersApi.md#settypingstatus) | **POST** /typing | Set \&quot;typing\&quot; status
*UsersApi* | [**unmuteUser**](docs/UsersApi.md#unmuteuser) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
*UsersApi* | [**updateSettings**](docs/UsersApi.md#updatesettings) | **PATCH** /settings | Update settings
*UsersApi* | [**updateStatus**](docs/UsersApi.md#updatestatus) | **POST** /users/me/status | Update your status
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateuser) | **PATCH** /users/{user_id} | Update a user
*UsersApi* | [**updateUserGroup**](docs/UsersApi.md#updateusergroup) | **PATCH** /user_groups/{user_group_id} | Update a user group
*UsersApi* | [**updateUserGroupMembers**](docs/UsersApi.md#updateusergroupmembers) | **POST** /user_groups/{user_group_id}/members | Update user group members
*WebhooksApi* | [**zulipOutgoingWebhooks**](docs/WebhooksApi.md#zulipoutgoingwebhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


## Documentation For Models

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


## Documentation For Authorization


## BasicAuth

- **Type**: HTTP basic authentication

