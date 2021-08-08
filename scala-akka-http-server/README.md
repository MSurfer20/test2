# Zulip REST API

Powerful open source group chat 


    ## API

          ### Authentication

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.AuthenticationController`|akka-http API controller|
          |`org.openapitools.server.api.AuthenticationApi`|Representing trait|
              |`org.openapitools.server.api.AuthenticationApiImpl`|Default implementation|

                * `POST /api/v1/dev_fetch_api_key?username=[value]` - Fetch an API key (development only)
                * `POST /api/v1/fetch_api_key?username=[value]&password=[value]` - Fetch an API key (production)

          ### Drafts

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.DraftsController`|akka-http API controller|
          |`org.openapitools.server.api.DraftsApi`|Representing trait|
              |`org.openapitools.server.api.DraftsApiImpl`|Default implementation|

                * `POST /api/v1/drafts?drafts=[value]` - Create drafts
                * `DELETE /api/v1/drafts/{draft_id}` - Delete a draft
                * `PATCH /api/v1/drafts/{draft_id}?draft=[value]` - Edit a draft
                * `GET /api/v1/drafts` - Get drafts

          ### Messages

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.MessagesController`|akka-http API controller|
          |`org.openapitools.server.api.MessagesApi`|Representing trait|
              |`org.openapitools.server.api.MessagesApiImpl`|Default implementation|

                * `POST /api/v1/messages/{message_id}/reactions?emojiName=[value]&emojiCode=[value]&reactionType=[value]` - Add an emoji reaction
                * `GET /api/v1/messages/matches_narrow?msgIds=[value]&narrow=[value]` - Check if messages match a narrow
                * `DELETE /api/v1/messages/{message_id}` - Delete a message
                * `GET /api/v1/user_uploads/{realm_id_str}/{filename}` - Get public temporary URL
                * `GET /api/v1/messages/{message_id}/history` - Get a message&#39;s edit history
                * `GET /api/v1/messages?anchor=[value]&numBefore=[value]&numAfter=[value]&narrow=[value]&clientGravatar=[value]&applyMarkdown=[value]&useFirstUnreadAnchor=[value]` - Get messages
                * `GET /api/v1/messages/{message_id}` - Get a message&#39;s raw Markdown
                * `POST /api/v1/mark_all_as_read` - Mark all messages as read
                * `POST /api/v1/mark_stream_as_read?streamId=[value]` - Mark messages in a stream as read
                * `POST /api/v1/mark_topic_as_read?streamId=[value]&topicName=[value]` - Mark messages in a topic as read
                * `DELETE /api/v1/messages/{message_id}/reactions?emojiName=[value]&emojiCode=[value]&reactionType=[value]` - Remove an emoji reaction
                * `POST /api/v1/messages/render?content=[value]` - Render message
                * `POST /api/v1/messages?`type`=[value]&to=[value]&content=[value]&topic=[value]&queueId=[value]&localId=[value]` - Send a message
                * `PATCH /api/v1/messages/{message_id}?topic=[value]&propagateMode=[value]&sendNotificationToOldThread=[value]&sendNotificationToNewThread=[value]&content=[value]&streamId=[value]` - Edit a message
                * `POST /api/v1/messages/flags?messages=[value]&op=[value]&flag=[value]` - Update personal message flags
                * `POST /api/v1/user_uploads` - Upload a file

          ### RealTimeEvents

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.RealTimeEventsController`|akka-http API controller|
          |`org.openapitools.server.api.RealTimeEventsApi`|Representing trait|
              |`org.openapitools.server.api.RealTimeEventsApiImpl`|Default implementation|

                * `DELETE /api/v1/events?queueId=[value]` - Delete an event queue
                * `GET /api/v1/events?queueId=[value]&lastEventId=[value]&dontBlock=[value]` - Get events from an event queue
                * `POST /api/v1/real-time?eventTypes=[value]&narrow=[value]&allPublicStreams=[value]` - 
                * `POST /api/v1/register?applyMarkdown=[value]&clientGravatar=[value]&slimPresence=[value]&eventTypes=[value]&allPublicStreams=[value]&includeSubscribers=[value]&clientCapabilities=[value]&fetchEventTypes=[value]&narrow=[value]` - Register an event queue
                * `POST /api/v1/rest-error-handling` - Error handling

          ### ServerAndOrganizations

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.ServerAndOrganizationsController`|akka-http API controller|
          |`org.openapitools.server.api.ServerAndOrganizationsApi`|Representing trait|
              |`org.openapitools.server.api.ServerAndOrganizationsApiImpl`|Default implementation|

                * `POST /api/v1/realm/playgrounds?name=[value]&pygmentsLanguage=[value]&urlPrefix=[value]` - Add a code playground
                * `POST /api/v1/realm/filters?pattern=[value]&urlFormatString=[value]` - Add a linkifier
                * `POST /api/v1/realm/profile_fields?name=[value]&hint=[value]&fieldType=[value]&fieldData=[value]` - Create a custom profile field
                * `GET /api/v1/realm/emoji` - Get all custom emoji
                * `GET /api/v1/realm/profile_fields` - Get all custom profile fields
                * `GET /api/v1/realm/linkifiers` - Get linkifiers
                * `GET /api/v1/server_settings` - Get server settings
                * `DELETE /api/v1/realm/playgrounds/{playground_id}` - Remove a code playground
                * `DELETE /api/v1/realm/filters/{filter_id}` - Remove a linkifier
                * `PATCH /api/v1/realm/profile_fields?order=[value]` - Reorder custom profile fields
                * `PATCH /api/v1/realm/filters/{filter_id}?pattern=[value]&urlFormatString=[value]` - Update a linkifier
                * `POST /api/v1/realm/emoji/{emoji_name}` - Upload custom emoji

          ### Streams

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.StreamsController`|akka-http API controller|
          |`org.openapitools.server.api.StreamsApi`|Representing trait|
              |`org.openapitools.server.api.StreamsApiImpl`|Default implementation|

                * `DELETE /api/v1/streams/{stream_id}` - Archive a stream
                * `GET /api/v1/calls/bigbluebutton/create` - Create BigBlueButton video call
                * `POST /api/v1/streams/{stream_id}/delete_topic?topicName=[value]` - Delete a topic
                * `GET /api/v1/get_stream_id?stream=[value]` - Get stream ID
                * `GET /api/v1/users/me/{stream_id}/topics` - Get topics in a stream
                * `GET /api/v1/streams?includePublic=[value]&includeWebPublic=[value]&includeSubscribed=[value]&includeAllActive=[value]&includeDefault=[value]&includeOwnerSubscribed=[value]` - Get all streams
                * `GET /api/v1/streams/{stream_id}/members` - Get the subscribers of a stream
                * `GET /api/v1/users/{user_id}/subscriptions/{stream_id}` - Get subscription status
                * `GET /api/v1/users/me/subscriptions?includeSubscribers=[value]` - Get subscribed streams
                * `PATCH /api/v1/users/me/subscriptions/muted_topics?stream=[value]&streamId=[value]&topic=[value]&op=[value]` - Topic muting
                * `POST /api/v1/users/me/subscriptions?subscriptions=[value]&principals=[value]&authorizationErrorsFatal=[value]&announce=[value]&inviteOnly=[value]&historyPublicToSubscribers=[value]&streamPostPolicy=[value]&messageRetentionDays=[value]` - Subscribe to a stream
                * `DELETE /api/v1/users/me/subscriptions?subscriptions=[value]&principals=[value]` - Unsubscribe from a stream
                * `PATCH /api/v1/streams/{stream_id}?description=[value]&newName=[value]&isPrivate=[value]&isAnnouncementOnly=[value]&streamPostPolicy=[value]&historyPublicToSubscribers=[value]&messageRetentionDays=[value]` - Update a stream
                * `POST /api/v1/users/me/subscriptions/properties?subscriptionData=[value]` - Update subscription settings
                * `PATCH /api/v1/users/me/subscriptions?delete=[value]&add=[value]` - Update subscriptions

          ### Users

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.UsersController`|akka-http API controller|
          |`org.openapitools.server.api.UsersApi`|Representing trait|
              |`org.openapitools.server.api.UsersApiImpl`|Default implementation|

                * `POST /api/v1/users?email=[value]&password=[value]&fullName=[value]` - Create a user
                * `POST /api/v1/user_groups/create?name=[value]&description=[value]&members=[value]` - Create a user group
                * `DELETE /api/v1/users/me` - Deactivate own user
                * `DELETE /api/v1/users/{user_id}` - Deactivate a user
                * `GET /api/v1/attachments` - Get attachments
                * `GET /api/v1/users/me` - Get own user
                * `GET /api/v1/users/{user_id}?clientGravatar=[value]&includeCustomProfileFields=[value]` - Get a user
                * `GET /api/v1/users/{email}?clientGravatar=[value]&includeCustomProfileFields=[value]` - Get a user by email
                * `GET /api/v1/user_groups` - Get user groups
                * `GET /api/v1/users/{user_id_or_email}/presence` - Get user presence
                * `GET /api/v1/users?clientGravatar=[value]&includeCustomProfileFields=[value]` - Get all users
                * `POST /api/v1/users/me/muted_users/{muted_user_id}` - Mute a user
                * `POST /api/v1/users/{user_id}/reactivate` - Reactivate a user
                * `DELETE /api/v1/user_groups/{user_group_id}` - Delete a user group
                * `POST /api/v1/typing?`type`=[value]&op=[value]&to=[value]&topic=[value]` - Set \&quot;typing\&quot; status
                * `DELETE /api/v1/users/me/muted_users/{muted_user_id}` - Unmute a user
                * `PATCH /api/v1/settings?fullName=[value]&email=[value]&oldPassword=[value]&newPassword=[value]&twentyFourHourTime=[value]&denseMode=[value]&starredMessageCounts=[value]&fluidLayoutWidth=[value]&highContrastMode=[value]&colorScheme=[value]&enableDraftsSynchronization=[value]&translateEmoticons=[value]&defaultLanguage=[value]&defaultView=[value]&leftSideUserlist=[value]&emojiset=[value]&demoteInactiveStreams=[value]&timezone=[value]&enableStreamDesktopNotifications=[value]&enableStreamEmailNotifications=[value]&enableStreamPushNotifications=[value]&enableStreamAudibleNotifications=[value]&notificationSound=[value]&enableDesktopNotifications=[value]&enableSounds=[value]&emailNotificationsBatchingPeriodSeconds=[value]&enableOfflineEmailNotifications=[value]&enableOfflinePushNotifications=[value]&enableOnlinePushNotifications=[value]&enableDigestEmails=[value]&enableMarketingEmails=[value]&enableLoginEmails=[value]&messageContentInEmailNotifications=[value]&pmContentInDesktopNotifications=[value]&wildcardMentionsNotify=[value]&desktopIconCountDisplay=[value]&realmNameInNotifications=[value]&presenceEnabled=[value]&enterSends=[value]` - Update settings
                * `POST /api/v1/users/me/status?statusText=[value]&away=[value]&emojiName=[value]&emojiCode=[value]&reactionType=[value]` - Update your status
                * `PATCH /api/v1/users/{user_id}?fullName=[value]&role=[value]&profileData=[value]` - Update a user
                * `PATCH /api/v1/user_groups/{user_group_id}?name=[value]&description=[value]` - Update a user group
                * `POST /api/v1/user_groups/{user_group_id}/members?delete=[value]&add=[value]` - Update user group members

          ### Webhooks

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.WebhooksController`|akka-http API controller|
          |`org.openapitools.server.api.WebhooksApi`|Representing trait|
              |`org.openapitools.server.api.WebhooksApiImpl`|Default implementation|

                * `POST /api/v1/zulip-outgoing-webhook` - Outgoing webhooks

