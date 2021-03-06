# Powerful open source group chat  - Swagger Ada Server

## Overview

This Ada server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server,
you can easily generate a server stub.

## Building

To build the server you will need the GNAT Ada compiler as well as
the [Swagger Ada library](https://github.com/stcarrez/swagger-ada).

When the GNAT Ada compiler and Swagger Ada libraries are installed,
run the following command:

```shell
  gprbuild -p -PdefaultPackage
```

After the build is successful, you will get the server binary
in bin/-server and you can start it as follows:

```shell
  ./bin/-server
```

## Structure of the server

The server consists of several Ada packages that are generated from
the OpenAPI specification.

Source file | Package | Description
------------ | ------------- | -------------
src/.ads||The server root package declaration
src/-servers.ads|.Servers|The server declaration and instantiation
src/-servers.adb|.Servers|The server implementation (empty stubs)
src/server/-skeletons.ads|.Skeletons|The server skeleton declaration
src/server/-skeletons.adb|.Skeletons|The server skeleton implementation
src/server/-models.ads|.Skeletons|The server model types declaration
src/server/-models.adb|.Skeletons|The server model types implementation
src/-server.adb|.Server|The server main procedure

Files generated in **src/server** should not be modified.  The server implementation
files (**src/-server.ads** and **src/-server.adb**) should
be modified to implement the server operations.  You can also customize the server
main procedure according to your needs.

## Server model

The server instance is represented by the **.Servers.Server_Type** Ada type.
The REST API will need an instance of it to make the operation call.  Two server model
exists:

- The instance per request model creates an instance of the server type for each request.
- The shared instance model shares the same instance across all concurrent REST requests.  This instance is protected using an Ada protected object which holds the server instance.

The choice of the server model is made at the compilation time by instantiating either
the **.Skeletons.Skeleton** package or the **.Skeletons.Shared_Instance**
package.  Such instantiation is done in **src/-server.ads** and the default
is to use the **Shared_Instance**.

## Implementing a server operation

All you have to do is implement the server operation in the **src/-servers.adb** file.
The package already contains the operation with its parameters and you only have to replace
the **null** instruction by real code.

## Documentation

### API Documentation

All URIs are relative to *https://example.zulipchat.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Dev_Fetch_Api_Key**](AuthenticationApi.md#Dev_Fetch_Api_Key) | **POST** /dev_fetch_api_key | Fetch an API key (development only)
[**Fetch_Api_Key**](AuthenticationApi.md#Fetch_Api_Key) | **POST** /fetch_api_key | Fetch an API key (production)
[**Create_Drafts**](DraftsApi.md#Create_Drafts) | **POST** /drafts | Create drafts
[**Delete_Draft**](DraftsApi.md#Delete_Draft) | **DELETE** /drafts/{draft_id} | Delete a draft
[**Edit_Draft**](DraftsApi.md#Edit_Draft) | **PATCH** /drafts/{draft_id} | Edit a draft
[**Get_Drafts**](DraftsApi.md#Get_Drafts) | **GET** /drafts | Get drafts
[**Add_Reaction**](MessagesApi.md#Add_Reaction) | **POST** /messages/{message_id}/reactions | Add an emoji reaction
[**Check_Messages_Match_Narrow**](MessagesApi.md#Check_Messages_Match_Narrow) | **GET** /messages/matches_narrow | Check if messages match a narrow
[**Delete_Message**](MessagesApi.md#Delete_Message) | **DELETE** /messages/{message_id} | Delete a message
[**Get_File_Temporary_Url**](MessagesApi.md#Get_File_Temporary_Url) | **GET** /user_uploads/{realm_id_str}/{filename} | Get public temporary URL
[**Get_Message_History**](MessagesApi.md#Get_Message_History) | **GET** /messages/{message_id}/history | Get a message's edit history
[**Get_Messages**](MessagesApi.md#Get_Messages) | **GET** /messages | Get messages
[**Get_Raw_Message**](MessagesApi.md#Get_Raw_Message) | **GET** /messages/{message_id} | Get a message's raw Markdown
[**Mark_All_As_Read**](MessagesApi.md#Mark_All_As_Read) | **POST** /mark_all_as_read | Mark all messages as read
[**Mark_Stream_As_Read**](MessagesApi.md#Mark_Stream_As_Read) | **POST** /mark_stream_as_read | Mark messages in a stream as read
[**Mark_Topic_As_Read**](MessagesApi.md#Mark_Topic_As_Read) | **POST** /mark_topic_as_read | Mark messages in a topic as read
[**Remove_Reaction**](MessagesApi.md#Remove_Reaction) | **DELETE** /messages/{message_id}/reactions | Remove an emoji reaction
[**Render_Message**](MessagesApi.md#Render_Message) | **POST** /messages/render | Render message
[**Send_Message**](MessagesApi.md#Send_Message) | **POST** /messages | Send a message
[**Update_Message**](MessagesApi.md#Update_Message) | **PATCH** /messages/{message_id} | Edit a message
[**Update_Message_Flags**](MessagesApi.md#Update_Message_Flags) | **POST** /messages/flags | Update personal message flags
[**Upload_File**](MessagesApi.md#Upload_File) | **POST** /user_uploads | Upload a file
[**Delete_Queue**](RealTimeEventsApi.md#Delete_Queue) | **DELETE** /events | Delete an event queue
[**Get_Events**](RealTimeEventsApi.md#Get_Events) | **GET** /events | Get events from an event queue
[**Real_Time_Post**](RealTimeEventsApi.md#Real_Time_Post) | **POST** /real-time | 
[**Register_Queue**](RealTimeEventsApi.md#Register_Queue) | **POST** /register | Register an event queue
[**Rest_Error_Handling**](RealTimeEventsApi.md#Rest_Error_Handling) | **POST** /rest-error-handling | Error handling
[**Add_Code_Playground**](ServerAndOrganizationsApi.md#Add_Code_Playground) | **POST** /realm/playgrounds | Add a code playground
[**Add_Linkifier**](ServerAndOrganizationsApi.md#Add_Linkifier) | **POST** /realm/filters | Add a linkifier
[**Create_Custom_Profile_Field**](ServerAndOrganizationsApi.md#Create_Custom_Profile_Field) | **POST** /realm/profile_fields | Create a custom profile field
[**Get_Custom_Emoji**](ServerAndOrganizationsApi.md#Get_Custom_Emoji) | **GET** /realm/emoji | Get all custom emoji
[**Get_Custom_Profile_Fields**](ServerAndOrganizationsApi.md#Get_Custom_Profile_Fields) | **GET** /realm/profile_fields | Get all custom profile fields
[**Get_Linkifiers**](ServerAndOrganizationsApi.md#Get_Linkifiers) | **GET** /realm/linkifiers | Get linkifiers
[**Get_Server_Settings**](ServerAndOrganizationsApi.md#Get_Server_Settings) | **GET** /server_settings | Get server settings
[**Remove_Code_Playground**](ServerAndOrganizationsApi.md#Remove_Code_Playground) | **DELETE** /realm/playgrounds/{playground_id} | Remove a code playground
[**Remove_Linkifier**](ServerAndOrganizationsApi.md#Remove_Linkifier) | **DELETE** /realm/filters/{filter_id} | Remove a linkifier
[**Reorder_Custom_Profile_Fields**](ServerAndOrganizationsApi.md#Reorder_Custom_Profile_Fields) | **PATCH** /realm/profile_fields | Reorder custom profile fields
[**Update_Linkifier**](ServerAndOrganizationsApi.md#Update_Linkifier) | **PATCH** /realm/filters/{filter_id} | Update a linkifier
[**Upload_Custom_Emoji**](ServerAndOrganizationsApi.md#Upload_Custom_Emoji) | **POST** /realm/emoji/{emoji_name} | Upload custom emoji
[**Archive_Stream**](StreamsApi.md#Archive_Stream) | **DELETE** /streams/{stream_id} | Archive a stream
[**Create_Big_Blue_Button_Video_Call**](StreamsApi.md#Create_Big_Blue_Button_Video_Call) | **GET** /calls/bigbluebutton/create | Create BigBlueButton video call
[**Delete_Topic**](StreamsApi.md#Delete_Topic) | **POST** /streams/{stream_id}/delete_topic | Delete a topic
[**Get_Stream_Id**](StreamsApi.md#Get_Stream_Id) | **GET** /get_stream_id | Get stream ID
[**Get_Stream_Topics**](StreamsApi.md#Get_Stream_Topics) | **GET** /users/me/{stream_id}/topics | Get topics in a stream
[**Get_Streams**](StreamsApi.md#Get_Streams) | **GET** /streams | Get all streams
[**Get_Subscribers**](StreamsApi.md#Get_Subscribers) | **GET** /streams/{stream_id}/members | Get the subscribers of a stream
[**Get_Subscription_Status**](StreamsApi.md#Get_Subscription_Status) | **GET** /users/{user_id}/subscriptions/{stream_id} | Get subscription status
[**Get_Subscriptions**](StreamsApi.md#Get_Subscriptions) | **GET** /users/me/subscriptions | Get subscribed streams
[**Mute_Topic**](StreamsApi.md#Mute_Topic) | **PATCH** /users/me/subscriptions/muted_topics | Topic muting
[**Subscribe**](StreamsApi.md#Subscribe) | **POST** /users/me/subscriptions | Subscribe to a stream
[**Unsubscribe**](StreamsApi.md#Unsubscribe) | **DELETE** /users/me/subscriptions | Unsubscribe from a stream
[**Update_Stream**](StreamsApi.md#Update_Stream) | **PATCH** /streams/{stream_id} | Update a stream
[**Update_Subscription_Settings**](StreamsApi.md#Update_Subscription_Settings) | **POST** /users/me/subscriptions/properties | Update subscription settings
[**Update_Subscriptions**](StreamsApi.md#Update_Subscriptions) | **PATCH** /users/me/subscriptions | Update subscriptions
[**Create_User**](UsersApi.md#Create_User) | **POST** /users | Create a user
[**Create_User_Group**](UsersApi.md#Create_User_Group) | **POST** /user_groups/create | Create a user group
[**Deactivate_Own_User**](UsersApi.md#Deactivate_Own_User) | **DELETE** /users/me | Deactivate own user
[**Deactivate_User**](UsersApi.md#Deactivate_User) | **DELETE** /users/{user_id} | Deactivate a user
[**Get_Attachments**](UsersApi.md#Get_Attachments) | **GET** /attachments | Get attachments
[**Get_Own_User**](UsersApi.md#Get_Own_User) | **GET** /users/me | Get own user
[**Get_User**](UsersApi.md#Get_User) | **GET** /users/{user_id} | Get a user
[**Get_User_By_Email**](UsersApi.md#Get_User_By_Email) | **GET** /users/{email} | Get a user by email
[**Get_User_Groups**](UsersApi.md#Get_User_Groups) | **GET** /user_groups | Get user groups
[**Get_User_Presence**](UsersApi.md#Get_User_Presence) | **GET** /users/{user_id_or_email}/presence | Get user presence
[**Get_Users**](UsersApi.md#Get_Users) | **GET** /users | Get all users
[**Mute_User**](UsersApi.md#Mute_User) | **POST** /users/me/muted_users/{muted_user_id} | Mute a user
[**Reactivate_User**](UsersApi.md#Reactivate_User) | **POST** /users/{user_id}/reactivate | Reactivate a user
[**Remove_User_Group**](UsersApi.md#Remove_User_Group) | **DELETE** /user_groups/{user_group_id} | Delete a user group
[**Set_Typing_Status**](UsersApi.md#Set_Typing_Status) | **POST** /typing | Set \"typing\" status
[**Unmute_User**](UsersApi.md#Unmute_User) | **DELETE** /users/me/muted_users/{muted_user_id} | Unmute a user
[**Update_Settings**](UsersApi.md#Update_Settings) | **PATCH** /settings | Update settings
[**Update_Status**](UsersApi.md#Update_Status) | **POST** /users/me/status | Update your status
[**Update_User**](UsersApi.md#Update_User) | **PATCH** /users/{user_id} | Update a user
[**Update_User_Group**](UsersApi.md#Update_User_Group) | **PATCH** /user_groups/{user_group_id} | Update a user group
[**Update_User_Group_Members**](UsersApi.md#Update_User_Group_Members) | **POST** /user_groups/{user_group_id}/members | Update user group members
[**Zulip_Outgoing_Webhooks**](WebhooksApi.md#Zulip_Outgoing_Webhooks) | **POST** /zulip-outgoing-webhook | Outgoing webhooks


### Models

 - [.Models.AddSubscriptionsResponseAllOf_Type](AddSubscriptionsResponseAllOf_Type.md)
 - [.Models.AddSubscriptionsResponse_Type](AddSubscriptionsResponse_Type.md)
 - [.Models.ApiKeyResponseAllOf_Type](ApiKeyResponseAllOf_Type.md)
 - [.Models.ApiKeyResponse_Type](ApiKeyResponse_Type.md)
 - [.Models.AttachmentsMessages_Type](AttachmentsMessages_Type.md)
 - [.Models.Attachments_Type](Attachments_Type.md)
 - [.Models.BadEventQueueIdErrorAllOf_Type](BadEventQueueIdErrorAllOf_Type.md)
 - [.Models.BadEventQueueIdError_Type](BadEventQueueIdError_Type.md)
 - [.Models.BasicBotAllOf_Type](BasicBotAllOf_Type.md)
 - [.Models.BasicBotBase_Type](BasicBotBase_Type.md)
 - [.Models.BasicBot_Type](BasicBot_Type.md)
 - [.Models.BasicStreamAllOf_Type](BasicStreamAllOf_Type.md)
 - [.Models.BasicStreamBase_Type](BasicStreamBase_Type.md)
 - [.Models.BasicStream_Type](BasicStream_Type.md)
 - [.Models.BotAllOf_Type](BotAllOf_Type.md)
 - [.Models.Bot_Type](Bot_Type.md)
 - [.Models.CodedErrorAllOf_Type](CodedErrorAllOf_Type.md)
 - [.Models.CodedErrorBaseAllOf_Type](CodedErrorBaseAllOf_Type.md)
 - [.Models.CodedErrorBase_Type](CodedErrorBase_Type.md)
 - [.Models.CodedError_Type](CodedError_Type.md)
 - [.Models.CustomProfileField_Type](CustomProfileField_Type.md)
 - [.Models.DefaultStreamGroup_Type](DefaultStreamGroup_Type.md)
 - [.Models.Draft_Type](Draft_Type.md)
 - [.Models.EmojiBase_Type](EmojiBase_Type.md)
 - [.Models.EmojiReactionAllOf_Type](EmojiReactionAllOf_Type.md)
 - [.Models.EmojiReactionBaseAllOfUser_Type](EmojiReactionBaseAllOfUser_Type.md)
 - [.Models.EmojiReactionBaseAllOf_Type](EmojiReactionBaseAllOf_Type.md)
 - [.Models.EmojiReactionBase_Type](EmojiReactionBase_Type.md)
 - [.Models.EmojiReaction_Type](EmojiReaction_Type.md)
 - [.Models.GetMessagesAllOf_Type](GetMessagesAllOf_Type.md)
 - [.Models.GetMessages_Type](GetMessages_Type.md)
 - [.Models.Hotspot_Type](Hotspot_Type.md)
 - [.Models.InlineResponse200_Type](InlineResponse200_Type.md)
 - [.Models.InvalidApiKeyError_Type](InvalidApiKeyError_Type.md)
 - [.Models.InvalidMessageErrorAllOf_Type](InvalidMessageErrorAllOf_Type.md)
 - [.Models.InvalidMessageError_Type](InvalidMessageError_Type.md)
 - [.Models.JsonErrorBaseAllOf_Type](JsonErrorBaseAllOf_Type.md)
 - [.Models.JsonErrorBase_Type](JsonErrorBase_Type.md)
 - [.Models.JsonError_Type](JsonError_Type.md)
 - [.Models.JsonResponseBase_Type](JsonResponseBase_Type.md)
 - [.Models.JsonSuccessAllOf_Type](JsonSuccessAllOf_Type.md)
 - [.Models.JsonSuccessBaseAllOf_Type](JsonSuccessBaseAllOf_Type.md)
 - [.Models.JsonSuccessBase_Type](JsonSuccessBase_Type.md)
 - [.Models.JsonSuccess_Type](JsonSuccess_Type.md)
 - [.Models.MessagesAllOf_Type](MessagesAllOf_Type.md)
 - [.Models.MessagesBaseTopicLinks_Type](MessagesBaseTopicLinks_Type.md)
 - [.Models.MessagesBase_Type](MessagesBase_Type.md)
 - [.Models.Messages_Type](Messages_Type.md)
 - [.Models.MissingArgumentErrorAllOf_Type](MissingArgumentErrorAllOf_Type.md)
 - [.Models.MissingArgumentError_Type](MissingArgumentError_Type.md)
 - [.Models.NonExistingStreamErrorAllOf_Type](NonExistingStreamErrorAllOf_Type.md)
 - [.Models.NonExistingStreamError_Type](NonExistingStreamError_Type.md)
 - [.Models.Presence_Type](Presence_Type.md)
 - [.Models.RateLimitedError_Type](RateLimitedError_Type.md)
 - [.Models.RealmDeactivatedError_Type](RealmDeactivatedError_Type.md)
 - [.Models.RealmDomain_Type](RealmDomain_Type.md)
 - [.Models.RealmEmoji_Type](RealmEmoji_Type.md)
 - [.Models.RealmExport_Type](RealmExport_Type.md)
 - [.Models.RealmPlayground_Type](RealmPlayground_Type.md)
 - [.Models.Subscriptions_Type](Subscriptions_Type.md)
 - [.Models.UserAllOf_Type](UserAllOf_Type.md)
 - [.Models.UserBase_Type](UserBase_Type.md)
 - [.Models.UserDeactivatedError_Type](UserDeactivatedError_Type.md)
 - [.Models.UserGroup_Type](UserGroup_Type.md)
 - [.Models.UserNotAuthorizedError_Type](UserNotAuthorizedError_Type.md)
 - [.Models.User_Type](User_Type.md)


### Authorization


## basicAuth


- **Type**: HTTP basic authentication

