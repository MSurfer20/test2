--  Zulip REST API
--  Powerful open source group chat 
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  Fetch an API key (development only)
   --  For easy testing of mobile apps and other clients and against Zulip
   --  development servers, we support fetching a Zulip API key for any user
   --  on the development server without authentication (so that they can
   --  implement analogues of the one-click login process available for Zulip
   --  development servers on the web).
   --  
   --  **Note:** This endpoint is only available on Zulip development
   --  servers; for obvious security reasons it will always return an error
   --  in a Zulip production server.
   --  
   --  `POST {{ api_url }}/v1/dev_fetch_api_key`
   overriding
   procedure Dev_Fetch_Api_Key
      (Server : in out Server_Type;
       Username : in Swagger.UString;
       Result  : out .Models.ApiKeyResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Dev_Fetch_Api_Key;

   --  Fetch an API key (production)
   --  This API endpoint is used by clients such as the Zulip mobile and
   --  terminal apps to implement password-based authentication.  Given the
   --  user's Zulip login credentials, it returns a Zulip API key that the client
   --  can use to make requests requests as the user.
   --  
   --  This endpoint is only useful for Zulip servers/organizations with
   --  EmailAuthBackend or LDAPAuthBackend enabled.
   --  
   --  The Zulip mobile apps also support SSO/social authentication (GitHub
   --  auth, Google auth, SAML, etc.) that does not use this endpoint.  Instead,
   --  the mobile apps reuse the web login flow passing the `mobile_flow_otp` in
   --  a webview, and the credentials are returned to the app (encrypted) via a redirect
   --  to a `zulip://` URL.
   --  
   --  !!! warn ""
   --      **Note:** If you signed up using passwordless authentication and
   --      never had a password, you can [reset your password](/help/change-your-password).
   --  
   --      See the [API keys](/api/api-keys) documentation for
   --      more details on how to download API key manually.
   --  
   --  In a [Zulip development environment](https://zulip.readthedocs.io/en/latest/development/overview.html),
   --  see also [the unauthenticated variant](/api/dev-fetch-api-key).
   overriding
   procedure Fetch_Api_Key
      (Server : in out Server_Type;
       Username : in Swagger.UString;
       Password : in Swagger.UString;
       Result  : out .Models.ApiKeyResponse_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Fetch_Api_Key;

   --  Create drafts
   --  Create one or more drafts on the server. These drafts will be automatically
   --  synchronized to other clients via `drafts` events.
   --  
   --  `POST {{ api_url }}/v1/drafts`
   overriding
   procedure Create_Drafts
      (Server : in out Server_Type;
       Drafts : in .Models.Draft_Type_Vectors.Vector;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Drafts;

   --  Delete a draft
   --  Delete a single draft from the server. The deletion will be automatically
   --  synchronized to other clients via a `drafts` event.
   --  
   --  `DELETE {{ api_url }}/v1/drafts/{draft_id}`
   overriding
   procedure Delete_Draft
      (Server : in out Server_Type;
       Draft_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Draft;

   --  Edit a draft
   --  Edit a draft on the server. The edit will be automatically
   --  synchronized to other clients via `drafts` events.
   --  
   --  `PATCH {{ api_url }}/v1/drafts/{draft_id}`
   overriding
   procedure Edit_Draft
      (Server : in out Server_Type;
       Draft_Id : in Integer;
       Draft : in .Models.Draft_Type;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Edit_Draft;

   --  Get drafts
   --  Fetch all drafts for the current user.
   --  
   --  `GET {{ api_url }}/v1/drafts`
   overriding
   procedure Get_Drafts
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Drafts;

   --  Add an emoji reaction
   --  Add an [emoji reaction](/help/emoji-reactions) to a message.
   --  
   --  `POST {{ api_url }}/v1/messages/{message_id}/reactions`
   overriding
   procedure Add_Reaction
      (Server : in out Server_Type;
       Message_Id : in Integer;
       Emoji_Name : in Swagger.UString;
       Emoji_Code : in Swagger.Nullable_UString;
       Reaction_Type : in Swagger.Nullable_UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Add_Reaction;

   --  Check if messages match a narrow
   --  Check whether a set of messages match a [narrow](/api/construct-narrow).
   --  
   --  `GET {{ api_url }}/v1/messages/matches_narrow`
   --  
   --  For many common narrows (E.g. a topic), clients can write an
   --  efficient client-side check to determine whether a
   --  newly arrived message belongs in the view.
   --  
   --  This endpoint is designed to allow clients to handle more complex narrows
   --  for which the client does not (or in the case of full-text search,
   --  cannot) implement this check.
   --  
   --  The format of the `match_subject` and `match_content` objects is designed to match
   --  those of `GET /messages`, so that a client can splice these fields into a
   --  `message` object received from `GET /events` and end up with an extended message
   --  object identical to how a `GET /messages` for the current narrow would have
   --  returned the message.
   overriding
   procedure Check_Messages_Match_Narrow
      (Server : in out Server_Type;
       Msg_Ids : in Integer_Vectors.Vector;
       Narrow : in Swagger.Object_Vectors.Vector;
       Result  : out .Models.AnyType_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Check_Messages_Match_Narrow;

   --  Delete a message
   --  Permanently delete a message.
   --  
   --  `DELETE {{ api_url }}/v1/messages/{msg_id}`
   --  
   --  This API corresponds to the
   --  [delete a message completely][delete-completely] feature documented in
   --  the Zulip Help Center.
   --  
   --  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely
   overriding
   procedure Delete_Message
      (Server : in out Server_Type;
       Message_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Message;

   --  Get public temporary URL
   --  Get a temporary URL for access to the file that doesn't require authentication.
   overriding
   procedure Get_File_Temporary_Url
      (Server : in out Server_Type;
       Realm_Id_Str : in Integer;
       Filename : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_File_Temporary_Url;

   --  Get a message's edit history
   --  Fetch the message edit history of a previously edited message.
   --  
   --  `GET {{ api_url }}/v1/messages/{message_id}/history`
   --  
   --  Note that edit history may be disabled in some organizations; see the
   --  [Zulip Help Center documentation on editing messages][edit-settings].
   --  
   --  [edit-settings]: /help/view-a-messages-edit-history
   overriding
   procedure Get_Message_History
      (Server : in out Server_Type;
       Message_Id : in Integer;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Message_History;

   --  Get messages
   --  Fetch message history from a Zulip server.
   --  
   --  `GET {{ api_url }}/v1/messages`
   --  
   --  This `GET /api/v1/messages` endpoint is the primary way to fetch
   --  message history from a Zulip server.  It is useful both for Zulip
   --  clients (e.g. the web, desktop, mobile, and terminal clients) as well
   --  as bots, API clients, backup scripts, etc.
   --  
   --  By specifying a [narrow filter](/api/construct-narrow), you can use
   --  this endpoint to fetch the messages matching any search query that is
   --  supported by Zulip's powerful full-text search backend.
   --  
   --  When a narrow is not specified, it can be used to fetch a user's
   --  message history. (We recommend paginating to 1000 messages at a time.)
   --  
   --  In either case, you specify an `anchor` message (or ask the server to
   --  calculate the first unread message for you and use that as the
   --  anchor), as well as a number of messages before and after the anchor
   --  message.  The server returns those messages, sorted by message ID, as
   --  well as some metadata that makes it easy for a client to determine
   --  whether there are more messages matching the query that were not
   --  returned due to the `num_before` and `num_after` limits.
   --  
   --  We recommend using `num_before <= 1000` and `num_after <= 1000` to
   --  avoid generating very large HTTP responses. A maximum of 5000 messages
   --  can be obtained per request; attempting to exceed this will result in an
   --  error.
   overriding
   procedure Get_Messages
      (Server : in out Server_Type;
       Num_Before : in Integer;
       Num_After : in Integer;
       Anchor : in .Models.OneOfstringinteger_Type;
       Narrow : in Swagger.Object_Vectors.Vector;
       Client_Gravatar : in Swagger.Nullable_Boolean;
       Apply_Markdown : in Swagger.Nullable_Boolean;
       Use_First_Unread_Anchor : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Messages;

   --  Get a message's raw Markdown
   --  Get the raw content of a message.
   --  
   --  `GET {{ api_url }}/v1/messages/{msg_id}`
   --  
   --  This is a rarely-used endpoint relevant for clients that primarily
   --  work with HTML-rendered messages but might need to occasionally fetch
   --  the message's raw Markdown (e.g. for pre-filling a message-editing
   --  UI).
   overriding
   procedure Get_Raw_Message
      (Server : in out Server_Type;
       Message_Id : in Integer;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Raw_Message;

   --  Mark all messages as read
   --  Marks all of the current user's unread messages as read.
   --  
   --  `POST {{ api_url }}/v1/mark_all_as_read`
   overriding
   procedure Mark_All_As_Read
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Mark_All_As_Read;

   --  Mark messages in a stream as read
   --  Mark all the unread messages in a stream as read.
   overriding
   procedure Mark_Stream_As_Read
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Mark_Stream_As_Read;

   --  Mark messages in a topic as read
   --  Mark all the unread messages in a topic as read.
   overriding
   procedure Mark_Topic_As_Read
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Topic_Name : in Swagger.UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Mark_Topic_As_Read;

   --  Remove an emoji reaction
   --  Remove an [emoji reaction](/help/emoji-reactions) from a message.
   --  
   --  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions`
   overriding
   procedure Remove_Reaction
      (Server : in out Server_Type;
       Message_Id : in Integer;
       Emoji_Name : in Swagger.Nullable_UString;
       Emoji_Code : in Swagger.Nullable_UString;
       Reaction_Type : in Swagger.Nullable_UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Remove_Reaction;

   --  Render message
   --  Render a message to HTML.
   --  
   --  `POST {{ api_url }}/v1/messages/render`
   overriding
   procedure Render_Message
      (Server : in out Server_Type;
       Content : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Render_Message;

   --  Send a message
   --  Send a stream or a private message.
   --  
   --  `POST {{ api_url }}/v1/messages`
   overriding
   procedure Send_Message
      (Server : in out Server_Type;
       P_Type : in Swagger.UString;
       To : in Integer_Vectors.Vector;
       Content : in Swagger.UString;
       Topic : in Swagger.Nullable_UString;
       Queue_Id : in Swagger.Nullable_UString;
       Local_Id : in Swagger.Nullable_UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Send_Message;

   --  Edit a message
   --  Edit/update the content or topic of a message.
   --  
   --  `PATCH {{ api_url }}/v1/messages/{msg_id}`
   --  
   --  `{msg_id}` in the above URL should be replaced with the ID of the
   --  message you wish you update.
   --  
   --  You can [resolve topics](/help/resolve-a-topic) by editing the
   --  topic to `✔ {original_topic}`.
   --  
   --  **Note**: See [configuring message
   --  editing][config-message-editing] for detailed documentation on
   --  when users are allowed to edit topics.
   --  
   --  [config-message-editing]: /help/configure-message-editing-and-deletion
   overriding
   procedure Update_Message
      (Server : in out Server_Type;
       Message_Id : in Integer;
       Topic : in Swagger.Nullable_UString;
       Propagate_Mode : in Swagger.Nullable_UString;
       Send_Notification_To_Old_Thread : in Swagger.Nullable_Boolean;
       Send_Notification_To_New_Thread : in Swagger.Nullable_Boolean;
       Content : in Swagger.Nullable_UString;
       Stream_Id : in Swagger.Nullable_Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Message;

   --  Update personal message flags
   --  Add or remove personal message flags like `read` and `starred`
   --  on a collection of message IDs.
   --  
   --  `POST {{ api_url }}/v1/messages/flags`
   --  
   --  For updating the `read` flag on common collections of messages, see also
   --  the
   --  [special endpoints for marking message as read in bulk](/api/mark-all-as-read).
   overriding
   procedure Update_Message_Flags
      (Server : in out Server_Type;
       Messages : in Integer_Vectors.Vector;
       Op : in Swagger.UString;
       Flag : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Message_Flags;

   --  Upload a file
   --  Upload a single file and get the corresponding URI.
   --  
   --  `POST {{ api_url }}/v1/user_uploads`
   --  
   --  Initially, only you will be able to access the link.  To share the
   --  uploaded file, you'll need to [send a message][send-message]
   --  containing the resulting link.  Users who can already access the link
   --  can reshare it with other users by sending additional Zulip messages
   --  containing the link.
   --  
   --  [uploaded-files]: /help/manage-your-uploaded-files
   --  [send-message]: /api/send-message
   overriding
   procedure Upload_File
      (Server : in out Server_Type;
       Filename : in Swagger.File_Part_Type;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Upload_File;

   --  Delete an event queue
   --  Delete a previously registered queue.
   --  
   --  `DELETE {{ api_url }}/v1/events`
   overriding
   procedure Delete_Queue
      (Server : in out Server_Type;
       Queue_Id : in Swagger.UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Queue;

   --  Get events from an event queue
   --  `GET {{ api_url }}/v1/events`
   --  
   --  This endpoint allows you to receive new events from
   --  [a registered event queue](/api/register-queue).
   --  
   --  Long-lived clients should use the
   --  `event_queue_longpoll_timeout_seconds` property returned by
   --  `POST /register` as the client-side HTTP request timeout for
   --  calls to this endpoint.  It is guaranteed to be higher than
   --  heartbeat frequency and should be respected by clients to
   --  avoid breaking when heartbeat frequency increases.
   overriding
   procedure Get_Events
      (Server : in out Server_Type;
       Queue_Id : in Swagger.UString;
       Last_Event_Id : in Swagger.Nullable_Integer;
       Dont_Block : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Events;

   --  
   --  (Ignored)
   overriding
   procedure Real_Time_Post
      (Server : in out Server_Type;
       Event_Types : in Swagger.UString_Vectors.Vector;
       Narrow : in Swagger.UString_Vectors.Vector_Vectors.Vector;
       All_Public_Streams : in Swagger.Nullable_Boolean;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Real_Time_Post;

   --  Register an event queue
   --  `POST {{ api_url }}/v1/register`
   --  
   --  This powerful endpoint can be used to register a Zulip "event queue"
   --  (subscribed to certain types of "events", or updates to the messages
   --  and other Zulip data the current user has access to), as well as to
   --  fetch the current state of that data.
   --  
   --  (`register` also powers the `call_on_each_event` Python API, and is
   --  intended primarily for complex applications for which the more convenient
   --  `call_on_each_event` API is insufficient).
   --  
   --  This endpoint returns a `queue_id` and a `last_event_id`; these can be
   --  used in subsequent calls to the
   --  ["events" endpoint](/api/get-events) to request events from
   --  the Zulip server using long-polling.
   --  
   --  The server will queue events for up to 10 minutes of inactivity.
   --  After 10 minutes, your event queue will be garbage-collected.  The
   --  server will send `heartbeat` events every minute, which makes it easy
   --  to implement a robust client that does not miss events unless the
   --  client loses network connectivity with the Zulip server for 10 minutes
   --  or longer.
   --  
   --  Once the server garbage-collects your event queue, the server will
   --  [return an error](/api/get-events#bad_event_queue_id-errors)
   --  with a code of `BAD_EVENT_QUEUE_ID` if you try to fetch events from
   --  the event queue.  Your software will need to handle that error
   --  condition by re-initializing itself (e.g. this is what triggers your
   --  browser reloading the Zulip web app when your laptop comes back online
   --  after being offline for more than 10 minutes).
   --  
   --  When prototyping with this API, we recommend first calling `register`
   --  with no `event_types` parameter to see all the available data from all
   --  supported event types.  Before using your client in production, you
   --  should set appropriate `event_types` and `fetch_event_types` filters
   --  so that your client only requests the data it needs.  A few minutes
   --  doing this often saves 90% of the total bandwidth and other resources
   --  consumed by a client using this API.
   --  
   --  See the
   --  [events system developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/events-system.html)
   --  if you need deeper details about how the Zulip event queue system
   --  works, avoids clients needing to worry about large classes of
   --  potentially messy races, etc.
   overriding
   procedure Register_Queue
      (Server : in out Server_Type;
       Apply_Markdown : in Swagger.Nullable_Boolean;
       Client_Gravatar : in Swagger.Nullable_Boolean;
       Slim_Presence : in Swagger.Nullable_Boolean;
       Event_Types : in Swagger.UString_Vectors.Vector;
       All_Public_Streams : in Swagger.Nullable_Boolean;
       Include_Subscribers : in Swagger.Nullable_Boolean;
       Client_Capabilities : in Swagger.Object;
       Fetch_Event_Types : in Swagger.UString_Vectors.Vector;
       Narrow : in Swagger.UString_Vectors.Vector_Vectors.Vector;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Register_Queue;

   --  Error handling
   --  Common error to many endpoints
   overriding
   procedure Rest_Error_Handling
      (Server : in out Server_Type
       ;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Rest_Error_Handling;

   --  Add a code playground
   --  Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.
   --  
   --  `POST {{ api_url }}/v1/realm/playgrounds`
   --  
   --  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was
   --  fixed in Zulip 4.0 (feature level 57).
   overriding
   procedure Add_Code_Playground
      (Server : in out Server_Type;
       Name : in Swagger.UString;
       Pygments_Language : in Swagger.UString;
       Url_Prefix : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Add_Code_Playground;

   --  Add a linkifier
   --  Configure [linkifiers](/help/add-a-custom-linkifier),
   --  regular expression patterns that are automatically linkified when they
   --  appear in messages and topics.
   --  
   --  `POST {{ api_url }}/v1/realm/filters`
   overriding
   procedure Add_Linkifier
      (Server : in out Server_Type;
       Pattern : in Swagger.UString;
       Url_Format_String : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Add_Linkifier;

   --  Create a custom profile field
   --  [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.
   --  
   --  `POST {{ api_url }}/v1/realm/profile_fields`
   overriding
   procedure Create_Custom_Profile_Field
      (Server : in out Server_Type;
       Field_Type : in Integer;
       Name : in Swagger.Nullable_UString;
       Hint : in Swagger.Nullable_UString;
       Field_Data : in Swagger.Object;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Custom_Profile_Field;

   --  Get all custom emoji
   --  Get all the custom emoji in the user's organization.
   --  
   --  `GET {{ api_url }}/v1/realm/emoji`
   overriding
   procedure Get_Custom_Emoji
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Custom_Emoji;

   --  Get all custom profile fields
   --  Get all the [custom profile fields](/help/add-custom-profile-fields)
   --  configured for the user's organization.
   --  
   --  `GET {{ api_url }}/v1/realm/profile_fields`
   overriding
   procedure Get_Custom_Profile_Fields
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Custom_Profile_Fields;

   --  Get linkifiers
   --  List all of an organization's configured
   --  [linkifiers](/help/add-a-custom-linkifier), regular
   --  expression patterns that are automatically linkified when they appear
   --  in messages and topics.
   --  
   --  `GET {{ api_url }}/v1/realm/linkifiers`
   --  
   --  **Changes**: New in Zulip 4.0 (feature level 54). On older versions,
   --  a similar `GET /realm/filters` endpoint was available with each entry in
   --  a `[pattern, url_format, id]` tuple format.
   overriding
   procedure Get_Linkifiers
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Linkifiers;

   --  Get server settings
   --  Fetch global settings for a Zulip server.
   --  
   --  `GET {{ api_url }}/v1/server_settings`
   --  
   --  **Note:** this endpoint does not require any authentication at all, and you can use it to check:
   --  
   --  * If this is a Zulip server, and if so, what version of Zulip it's running.
   --  * What a Zulip client (e.g. a mobile app or
   --  [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to
   --  know in order to display a login prompt for the server (e.g. what
   --  authentication methods are available).
   overriding
   procedure Get_Server_Settings
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Server_Settings;

   --  Remove a code playground
   --  Remove a [code playground](/help/code-blocks#code-playgrounds) previously
   --  configured for an organization.
   --  
   --  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`
   --  
   --  **Changes**: New in Zulip 4.0 (feature level 49).
   overriding
   procedure Remove_Code_Playground
      (Server : in out Server_Type;
       Playground_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Remove_Code_Playground;

   --  Remove a linkifier
   --  Remove [linkifiers](/help/add-a-custom-linkifier), regular
   --  expression patterns that are automatically linkified when they appear
   --  in messages and topics.
   --  
   --  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}`
   overriding
   procedure Remove_Linkifier
      (Server : in out Server_Type;
       Filter_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Remove_Linkifier;

   --  Reorder custom profile fields
   --  Reorder the custom profile fields in the user's organization.
   --  
   --  `PATCH {{ api_url }}/v1/realm/profile_fields`
   --  
   --  Custom profile fields are displayed in Zulip UI widgets in order; this
   --  endpoint allows administrative settings UI to change the field ordering.
   --  
   --  This endpoint is used to implement the dragging feature described in the
   --  [custom profile fields documentation](/help/add-custom-profile-fields).
   overriding
   procedure Reorder_Custom_Profile_Fields
      (Server : in out Server_Type;
       Order : in Integer_Vectors.Vector;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Reorder_Custom_Profile_Fields;

   --  Update a linkifier
   --  Update a [linkifier](/help/add-a-custom-linkifier), regular
   --  expression patterns that are automatically linkified when they appear
   --  in messages and topics.
   --  
   --  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`
   --  
   --  **Changes**: New in Zulip 4.0 (feature level 57).
   overriding
   procedure Update_Linkifier
      (Server : in out Server_Type;
       Filter_Id : in Integer;
       Pattern : in Swagger.UString;
       Url_Format_String : in Swagger.UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Linkifier;

   --  Upload custom emoji
   --  This endpoint is used to upload a custom emoji for use in the user's
   --  organization.  Access to this endpoint depends on the
   --  [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).
   --  
   --  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}`
   overriding
   procedure Upload_Custom_Emoji
      (Server : in out Server_Type;
       Emoji_Name : in Swagger.UString;
       Filename : in Swagger.File_Part_Type;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Upload_Custom_Emoji;

   --  Archive a stream
   --  [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.
   --  
   --  `DELETE {{ api_url }}/v1/streams/{stream_id}`
   overriding
   procedure Archive_Stream
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Archive_Stream;

   --  Create BigBlueButton video call
   --  Create a video call URL for a BigBlueButton video call.
   --  Requires BigBlueButton to be configured on the Zulip server.
   overriding
   procedure Create_Big_Blue_Button_Video_Call
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_Big_Blue_Button_Video_Call;

   --  Delete a topic
   --  Delete all messages in a topic.
   --  
   --  `POST {{ api_url }}/v1/streams/{stream_id}/delete_topic`
   --  
   --  Topics are a field on messages (not an independent
   --  data structure), so deleting all the messages in the topic
   --  deletes the topic from Zulip.
   overriding
   procedure Delete_Topic
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Topic_Name : in Swagger.UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Delete_Topic;

   --  Get stream ID
   --  Get the unique ID of a given stream.
   --  
   --  `GET {{ api_url }}/v1/get_stream_id`
   overriding
   procedure Get_Stream_Id
      (Server : in out Server_Type;
       Stream : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Stream_Id;

   --  Get topics in a stream
   --  Get all the topics in a specific stream
   --  
   --  `GET {{ api_url }}/v1/users/me/{stream_id}/topics`
   overriding
   procedure Get_Stream_Topics
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Stream_Topics;

   --  Get all streams
   --  Get all streams that the user has access to.
   --  
   --  `GET {{ api_url }}/v1/streams`
   overriding
   procedure Get_Streams
      (Server : in out Server_Type;
       Include_Public : in Swagger.Nullable_Boolean;
       Include_Web_Public : in Swagger.Nullable_Boolean;
       Include_Subscribed : in Swagger.Nullable_Boolean;
       Include_All_Active : in Swagger.Nullable_Boolean;
       Include_Default : in Swagger.Nullable_Boolean;
       Include_Owner_Subscribed : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Streams;

   --  Get the subscribers of a stream
   --  Get all users subscribed to a stream.
   --  
   --  `Get {{ api_url }}/v1/streams/{stream_id}/members`
   overriding
   procedure Get_Subscribers
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Subscribers;

   --  Get subscription status
   --  Check whether a user is subscribed to a stream.
   --  
   --  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`
   --  
   --  **Changes**: New in Zulip 3.0 (feature level 11).
   overriding
   procedure Get_Subscription_Status
      (Server : in out Server_Type;
       User_Id : in Integer;
       Stream_Id : in Integer;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Subscription_Status;

   --  Get subscribed streams
   --  Get all streams that the user is subscribed to.
   --  
   --  `GET {{ api_url }}/v1/users/me/subscriptions`
   overriding
   procedure Get_Subscriptions
      (Server : in out Server_Type;
       Include_Subscribers : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Subscriptions;

   --  Topic muting
   --  This endpoint mutes/unmutes a topic within a stream that the current
   --  user is subscribed to.  Muted topics are displayed faded in the Zulip
   --  UI, and are not included in the user's unread count totals.
   --  
   --  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics`
   overriding
   procedure Mute_Topic
      (Server : in out Server_Type;
       Topic : in Swagger.UString;
       Op : in Swagger.UString;
       Stream : in Swagger.Nullable_UString;
       Stream_Id : in Swagger.Nullable_Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Mute_Topic;

   --  Subscribe to a stream
   --  Subscribe one or more users to one or more streams.
   --  
   --  `POST {{ api_url }}/v1/users/me/subscriptions`
   --  
   --  If any of the specified streams do not exist, they are automatically
   --  created.  The initial [stream settings](/api/update-stream) will be determined
   --  by the optional parameters like `invite_only` detailed below.
   overriding
   procedure Subscribe
      (Server : in out Server_Type;
       Subscriptions : in Swagger.Object_Vectors.Vector;
       Principals : in .Models.OneOfstringinteger_Type_Vectors.Vector;
       Authorization_Errors_Fatal : in Swagger.Nullable_Boolean;
       Announce : in Swagger.Nullable_Boolean;
       Invite_Only : in Swagger.Nullable_Boolean;
       History_Public_To_Subscribers : in Swagger.Nullable_Boolean;
       Stream_Post_Policy : in Swagger.Nullable_Integer;
       Message_Retention_Days : in .Models.OneOfstringinteger_Type;
       Result  : out .Models.OneOfobjectobject_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Subscribe;

   --  Unsubscribe from a stream
   --  Unsubscribe yourself or other users from one or more streams.
   --  
   --  `DELETE {{ api_url }}/v1/users/me/subscriptions`
   overriding
   procedure Unsubscribe
      (Server : in out Server_Type;
       Subscriptions : in Swagger.UString_Vectors.Vector;
       Principals : in .Models.OneOfstringinteger_Type_Vectors.Vector;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Unsubscribe;

   --  Update a stream
   --  Configure the stream with the ID `stream_id`.  This endpoint supports
   --  an organization administrator editing any property of a stream,
   --  including:
   --  
   --  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description)
   --  * Stream [permissions](/help/stream-permissions), including
   --  [privacy](/help/change-the-privacy-of-a-stream) and [who can
   --  send](/help/stream-sending-policy).
   --  
   --  `PATCH {{ api_url }}/v1/streams/{stream_id}`
   overriding
   procedure Update_Stream
      (Server : in out Server_Type;
       Stream_Id : in Integer;
       Description : in Swagger.Nullable_UString;
       New_Name : in Swagger.Nullable_UString;
       Is_Private : in Swagger.Nullable_Boolean;
       Is_Announcement_Only : in Swagger.Nullable_Boolean;
       Stream_Post_Policy : in Swagger.Nullable_Integer;
       History_Public_To_Subscribers : in Swagger.Nullable_Boolean;
       Message_Retention_Days : in .Models.OneOfstringinteger_Type;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Stream;

   --  Update subscription settings
   --  This endpoint is used to update the user's personal settings for the
   --  streams they are subscribed to, including muting, color, pinning, and
   --  per-stream notification settings.
   --  
   --  `POST {{ api_url }}/v1/users/me/subscriptions/properties`
   overriding
   procedure Update_Subscription_Settings
      (Server : in out Server_Type;
       Subscription_Data : in Swagger.Object_Vectors.Vector;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Subscription_Settings;

   --  Update subscriptions
   --  Update which streams you are are subscribed to.
   overriding
   procedure Update_Subscriptions
      (Server : in out Server_Type;
       Delete : in Swagger.UString_Vectors.Vector;
       Add : in Swagger.Object_Vectors.Vector;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Subscriptions;

   --  Create a user
   --  {!can-create-users-only.md!}
   --  
   --  Create a new user account via the API.
   --  
   --  `POST {{ api_url }}/v1/users`
   overriding
   procedure Create_User
      (Server : in out Server_Type;
       Email : in Swagger.UString;
       Password : in Swagger.UString;
       Full_Name : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_User;

   --  Create a user group
   --  Create a new [user group](/help/user-groups).
   --  
   --  `POST {{ api_url }}/v1/user_groups/create`
   overriding
   procedure Create_User_Group
      (Server : in out Server_Type;
       Name : in Swagger.UString;
       Description : in Swagger.UString;
       Members : in Integer_Vectors.Vector;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Create_User_Group;

   --  Deactivate own user
   --  Deactivates the user's account.  See also the administrative endpoint for
   --  [deactivating another user](/api/deactivate-user).
   --  
   --  `DELETE {{ api_url }}/v1/users/me`
   --  
   --  This endpoint is primarily useful to Zulip clients providing a user settings UI.
   overriding
   procedure Deactivate_Own_User
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Deactivate_Own_User;

   --  Deactivate a user
   --  [Deactivates a
   --  user](https://zulip.com/help/deactivate-or-reactivate-a-user)
   --  given their user ID.
   --  
   --  `DELETE {{ api_url }}/v1/users/{user_id}`
   overriding
   procedure Deactivate_User
      (Server : in out Server_Type;
       User_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Deactivate_User;

   --  Get attachments
   --  Fetch metadata on files uploaded by the requesting user.
   --  
   --  `GET {{ api_url }}/v1/attachments`
   overriding
   procedure Get_Attachments
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Attachments;

   --  Get own user
   --  Get basic data about the user/bot that requests this endpoint.
   --  
   --  `GET {{ api_url }}/v1/users/me`
   overriding
   procedure Get_Own_User
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Own_User;

   --  Get a user
   --  Fetch details for a single user in the organization.
   --  
   --  `GET {{ api_url }}/v1/users/{user_id}`
   --  
   --  You can also fetch details on [all users in the organization](/api/get-users)
   --  or [by email](/api/get-user-by-email).
   --  
   --  *This endpoint is new in Zulip Server 3.0 (feature level 1).*
   overriding
   procedure Get_User
      (Server : in out Server_Type;
       User_Id : in Integer;
       Client_Gravatar : in Swagger.Nullable_Boolean;
       Include_Custom_Profile_Fields : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_User;

   --  Get a user by email
   --  Fetch details for a single user in the organization given a Zulip display
   --  email address.
   --  
   --  `GET {{ api_url }}/v1/users/{email}`
   --  
   --  Note that this endpoint uses Zulip display emails addresses
   --  for organizations that have configured limited [email address
   --  visibility](/help/restrict-visibility-of-email-addresses).
   --  
   --  You can also fetch details on [all users in the organization](/api/get-users) or
   --  [by user ID](/api/get-user).  Fetching by user ID is generally recommended
   --  when possible, as users can
   --  [change their email address](/help/change-your-email-address).
   --  
   --  *This endpoint is new in Zulip Server 4.0 (feature level 39).*
   overriding
   procedure Get_User_By_Email
      (Server : in out Server_Type;
       Email : in Swagger.UString;
       Client_Gravatar : in Swagger.Nullable_Boolean;
       Include_Custom_Profile_Fields : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_User_By_Email;

   --  Get user groups
   --  {!api-members-only.md!}
   --  
   --  Fetches all of the user groups in the organization.
   --  
   --  `GET {{ api_url }}/v1/user_groups`
   overriding
   procedure Get_User_Groups
      (Server : in out Server_Type
       ;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_User_Groups;

   --  Get user presence
   --  Get the presence status for a specific user.
   --  
   --  This endpoint is most useful for embedding data about a user's
   --  presence status in other sites (E.g. an employee directory).  Full
   --  Zulip clients like mobile/desktop apps will want to use the main
   --  presence endpoint, which returns data for all active users in the
   --  organization, instead.
   --  
   --  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`
   --  
   --  See
   --  [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html)
   --  for details on the data model for presence in Zulip.
   overriding
   procedure Get_User_Presence
      (Server : in out Server_Type;
       User_Id_Or_Email : in Swagger.UString;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_User_Presence;

   --  Get all users
   --  Retrieve details on all users in the organization.  Optionally
   --  includes values of [custom profile field](/help/add-custom-profile-fields).
   --  
   --  `GET {{ api_url }}/v1/users`
   --  
   --  You can also [fetch details on a single user](/api/get-user).
   overriding
   procedure Get_Users
      (Server : in out Server_Type;
       Client_Gravatar : in Swagger.Nullable_Boolean;
       Include_Custom_Profile_Fields : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Users;

   --  Mute a user
   --  This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users
   --  you've muted will be automatically marked as read and hidden.
   --  
   --  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`
   --  
   --  Muted users should be implemented by clients as follows:
   --  
   --  * The server will immediately mark all messages sent by the muted
   --    user as read.  This will automatically clear any existing mobile
   --    push notifications related to the muted user.
   --  * The server will mark any new messages sent by the muted user as read
   --    for your account, which prevents all email and mobile push notifications.
   --  * Clients should exclude muted users from presence lists or other UI
   --    for viewing or composing 1:1 private messages. 1:1 private messages sent by
   --    muted users should be hidden everywhere in the Zulip UI.
   --  * Stream messages and group private messages sent by the muted
   --    user should avoid displaying the content and name/avatar,
   --    but should display that N messages by a muted user were
   --    hidden (so that it is possible to interpret the messages by
   --    other users who are talking with the muted user).
   --  * Group private message conversations including the muted user
   --    should display muted users as "Muted user", rather than
   --    showing their name, in lists of such conversations, along with using
   --    a blank grey avatar where avatars are displayed.
   --  * Administrative/settings UI elements for showing "All users that exist
   --    on this stream or realm", e.g. for organization
   --    administration or showing stream subscribers, should display
   --    the user's name as normal.
   --  
   --  **Changes**: New in Zulip 4.0 (feature level 48).
   overriding
   procedure Mute_User
      (Server : in out Server_Type;
       Muted_User_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Mute_User;

   --  Reactivate a user
   --  [Reactivates a
   --  user](https://zulip.com/help/deactivate-or-reactivate-a-user)
   --  given their user ID.
   --  
   --  `POST {{ api_url }}/v1/users/{user_id}/reactivate`
   overriding
   procedure Reactivate_User
      (Server : in out Server_Type;
       User_Id : in Integer;
       Result  : out .Models.AnyType_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Reactivate_User;

   --  Delete a user group
   --  Delete a [user group](/help/user-groups).
   --  
   --  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}`
   overriding
   procedure Remove_User_Group
      (Server : in out Server_Type;
       User_Group_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Remove_User_Group;

   --  Set \"typing\" status
   --  Notify other users whether the current user is typing a message.
   --  
   --  `POST {{ api_url }}/v1/typing`
   --  
   --  Clients implementing Zulip's typing notifications protocol should work as follows:
   --  
   --  * Send a request to this endpoint with `op="start"` when a user starts typing a message,
   --    and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to
   --    actively type or otherwise interact with the compose UI (E.g. interacting with the
   --    compose box emoji picker).
   --  * Send a request to this endpoint with `op="stop"` when a user pauses using the
   --    compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels
   --    the compose action (if it had previously sent a "start" operation for that
   --    compose action).
   --  * Start displaying "Sender is typing" for a given conversation when the client
   --    receives an `op="start"` event from the [events API](/api/get-events).
   --  * Continue displaying "Sender is typing" until they receive an `op="stop"` event
   --    from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`
   --    seconds have passed without a new `op="start"` event for that conversation.
   --  * Clients that support displaying stream typing notifications (new in Zulip 4.0)
   --    should indicate they support processing stream typing events via the
   --    `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.
   --  
   --  This protocol is designed to allow the server-side typing notifications implementation
   --  to be stateless while being resilient; network failures cannot result in a user being
   --  incorrectly displayed as perpetually typing.
   --  
   --  See
   --  [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html)
   --  for additional design details on Zulip's typing notifications protocol.
   overriding
   procedure Set_Typing_Status
      (Server : in out Server_Type;
       Op : in Swagger.UString;
       To : in Integer_Vectors.Vector;
       P_Type : in Swagger.Nullable_UString;
       Topic : in Swagger.Nullable_UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Set_Typing_Status;

   --  Unmute a user
   --  This endpoint unmutes a user.
   --  
   --  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`
   --  
   --  **Changes**: New in Zulip 4.0 (feature level 48).
   overriding
   procedure Unmute_User
      (Server : in out Server_Type;
       Muted_User_Id : in Integer;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Unmute_User;

   --  Update settings
   --  This endpoint is used to edit the current user's settings.
   --  
   --  `PATCH {{ api_url }}/v1/settings`
   --  
   --  **Changes**: Prior to Zulip 5.0 (feature level 80), this
   --  endpoint only supported the `full_name`, `email`,
   --  `old_password`, and `new_password` parameters. Notification
   --  settings were managed by `PATCH /settings/notifications`, and
   --  all other settings by `PATCH /settings/display`. The feature level
   --  80 migration to merge these endpoints did not change how request
   --  parameters are encoded. Note, however, that it did change the
   --  handling of any invalid parameters present in a request to change
   --  notification or display settings, since the merged endpoint uses
   --  the new response format that was introduced for `/settings` in
   --  Zulip 5.0 (feature level 78).
   --  
   --  The `/settings/display` and `/settings/notifications`
   --  endpoints are now deprecated aliases for this endpoint for
   --  backwards-compatibility, and will be removed once clients have
   --  migrated to use this endpoint.
   overriding
   procedure Update_Settings
      (Server : in out Server_Type;
       Full_Name : in Swagger.Nullable_UString;
       Email : in Swagger.Nullable_UString;
       Old_Password : in Swagger.Nullable_UString;
       New_Password : in Swagger.Nullable_UString;
       Twenty_Four_Hour_Time : in Swagger.Nullable_Boolean;
       Dense_Mode : in Swagger.Nullable_Boolean;
       Starred_Message_Counts : in Swagger.Nullable_Boolean;
       Fluid_Layout_Width : in Swagger.Nullable_Boolean;
       High_Contrast_Mode : in Swagger.Nullable_Boolean;
       Color_Scheme : in Swagger.Nullable_Integer;
       Enable_Drafts_Synchronization : in Swagger.Nullable_Boolean;
       Translate_Emoticons : in Swagger.Nullable_Boolean;
       Default_Language : in Swagger.Nullable_UString;
       Default_View : in Swagger.Nullable_UString;
       Left_Side_Userlist : in Swagger.Nullable_Boolean;
       Emojiset : in Swagger.Nullable_UString;
       Demote_Inactive_Streams : in Swagger.Nullable_Integer;
       Timezone : in Swagger.Nullable_UString;
       Enable_Stream_Desktop_Notifications : in Swagger.Nullable_Boolean;
       Enable_Stream_Email_Notifications : in Swagger.Nullable_Boolean;
       Enable_Stream_Push_Notifications : in Swagger.Nullable_Boolean;
       Enable_Stream_Audible_Notifications : in Swagger.Nullable_Boolean;
       Notification_Sound : in Swagger.Nullable_UString;
       Enable_Desktop_Notifications : in Swagger.Nullable_Boolean;
       Enable_Sounds : in Swagger.Nullable_Boolean;
       Email_Notifications_Batching_Period_Seconds : in Swagger.Nullable_Integer;
       Enable_Offline_Email_Notifications : in Swagger.Nullable_Boolean;
       Enable_Offline_Push_Notifications : in Swagger.Nullable_Boolean;
       Enable_Online_Push_Notifications : in Swagger.Nullable_Boolean;
       Enable_Digest_Emails : in Swagger.Nullable_Boolean;
       Enable_Marketing_Emails : in Swagger.Nullable_Boolean;
       Enable_Login_Emails : in Swagger.Nullable_Boolean;
       Message_Content_In_Email_Notifications : in Swagger.Nullable_Boolean;
       Pm_Content_In_Desktop_Notifications : in Swagger.Nullable_Boolean;
       Wildcard_Mentions_Notify : in Swagger.Nullable_Boolean;
       Desktop_Icon_Count_Display : in Swagger.Nullable_Integer;
       Realm_Name_In_Notifications : in Swagger.Nullable_Boolean;
       Presence_Enabled : in Swagger.Nullable_Boolean;
       Enter_Sends : in Swagger.Nullable_Boolean;
       Result  : out .Models.JsonSuccessBase_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Settings;

   --  Update your status
   --  Change your [status](/help/status-and-availability).
   --  
   --  `POST {{ api_url }}/v1/users/me/status`
   --  
   --  A request to this endpoint will only change the parameters passed.
   --  For example, passing just `status_text` requests a change in the status
   --  text, but will leave the status emoji unchanged.
   --  
   --  Clients that wish to set the user's status to a specific value should
   --  pass all supported parameters.
   overriding
   procedure Update_Status
      (Server : in out Server_Type;
       Status_Text : in Swagger.Nullable_UString;
       Away : in Swagger.Nullable_Boolean;
       Emoji_Name : in Swagger.Nullable_UString;
       Emoji_Code : in Swagger.Nullable_UString;
       Reaction_Type : in Swagger.Nullable_UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_Status;

   --  Update a user
   --  Administrative endpoint to update the details of another user in the organization.
   --  
   --  `PATCH {{ api_url }}/v1/users/{user_id}`
   --  
   --  Supports everything an administrator can do to edit details of another
   --  user's account, including editing full name,
   --  [role](/help/roles-and-permissions), and [custom profile
   --  fields](/help/add-custom-profile-fields).
   overriding
   procedure Update_User
      (Server : in out Server_Type;
       User_Id : in Integer;
       Full_Name : in Swagger.Nullable_UString;
       Role : in Swagger.Nullable_Integer;
       Profile_Data : in Swagger.Object_Vectors.Vector;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_User;

   --  Update a user group
   --  Update the name or description of a [user group](/help/user-groups).
   --  
   --  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}`
   overriding
   procedure Update_User_Group
      (Server : in out Server_Type;
       User_Group_Id : in Integer;
       Name : in Swagger.UString;
       Description : in Swagger.UString;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_User_Group;

   --  Update user group members
   --  Update the members of a [user group](/help/user-groups).
   --  
   --  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members`
   overriding
   procedure Update_User_Group_Members
      (Server : in out Server_Type;
       User_Group_Id : in Integer;
       Delete : in Integer_Vectors.Vector;
       Add : in Integer_Vectors.Vector;
       Result  : out .Models.JsonSuccess_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Update_User_Group_Members;

   --  Outgoing webhooks
   --  Outgoing webhooks allows to build or set up Zulip integrations which are
   --  notified when certain types of messages are sent in Zulip.
   overriding
   procedure Zulip_Outgoing_Webhooks
      (Server : in out Server_Type
       ;
       Result  : out .Models.InlineResponse200_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Zulip_Outgoing_Webhooks;

end .Servers;
