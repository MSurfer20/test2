<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->POST('/api/v1/dev_fetch_api_key', function(Application $app, Request $request) {
            $username = $request->get('username');
            return new Response('How about implementing devFetchApiKey as a POST method ?');
            });


$app->POST('/api/v1/fetch_api_key', function(Application $app, Request $request) {
            $username = $request->get('username');
            $password = $request->get('password');
            return new Response('How about implementing fetchApiKey as a POST method ?');
            });


$app->POST('/api/v1/drafts', function(Application $app, Request $request) {
            $drafts = $request->get('drafts');
            return new Response('How about implementing createDrafts as a POST method ?');
            });


$app->DELETE('/api/v1/drafts/{draftId}', function(Application $app, Request $request, $draft_id) {
            return new Response('How about implementing deleteDraft as a DELETE method ?');
            });


$app->PATCH('/api/v1/drafts/{draftId}', function(Application $app, Request $request, $draft_id) {
            $draft = $request->get('draft');
            return new Response('How about implementing editDraft as a PATCH method ?');
            });


$app->GET('/api/v1/drafts', function(Application $app, Request $request) {
            return new Response('How about implementing getDrafts as a GET method ?');
            });


$app->POST('/api/v1/messages/{messageId}/reactions', function(Application $app, Request $request, $message_id) {
            $emoji_name = $request->get('emoji_name');
            $emoji_code = $request->get('emoji_code');
            $reaction_type = $request->get('reaction_type');
            return new Response('How about implementing addReaction as a POST method ?');
            });


$app->GET('/api/v1/messages/matches_narrow', function(Application $app, Request $request) {
            $msg_ids = $request->get('msg_ids');
            $narrow = $request->get('narrow');
            return new Response('How about implementing checkMessagesMatchNarrow as a GET method ?');
            });


$app->DELETE('/api/v1/messages/{messageId}', function(Application $app, Request $request, $message_id) {
            return new Response('How about implementing deleteMessage as a DELETE method ?');
            });


$app->GET('/api/v1/user_uploads/{realmIdStr}/{filename}', function(Application $app, Request $request, $realm_id_str, $filename) {
            return new Response('How about implementing getFileTemporaryUrl as a GET method ?');
            });


$app->GET('/api/v1/messages/{messageId}/history', function(Application $app, Request $request, $message_id) {
            return new Response('How about implementing getMessageHistory as a GET method ?');
            });


$app->GET('/api/v1/messages', function(Application $app, Request $request) {
            $anchor = $request->get('anchor');
            $num_before = $request->get('num_before');
            $num_after = $request->get('num_after');
            $narrow = $request->get('narrow');
            $client_gravatar = $request->get('client_gravatar');
            $apply_markdown = $request->get('apply_markdown');
            $use_first_unread_anchor = $request->get('use_first_unread_anchor');
            return new Response('How about implementing getMessages as a GET method ?');
            });


$app->GET('/api/v1/messages/{messageId}', function(Application $app, Request $request, $message_id) {
            return new Response('How about implementing getRawMessage as a GET method ?');
            });


$app->POST('/api/v1/mark_all_as_read', function(Application $app, Request $request) {
            return new Response('How about implementing markAllAsRead as a POST method ?');
            });


$app->POST('/api/v1/mark_stream_as_read', function(Application $app, Request $request) {
            $stream_id = $request->get('stream_id');
            return new Response('How about implementing markStreamAsRead as a POST method ?');
            });


$app->POST('/api/v1/mark_topic_as_read', function(Application $app, Request $request) {
            $stream_id = $request->get('stream_id');
            $topic_name = $request->get('topic_name');
            return new Response('How about implementing markTopicAsRead as a POST method ?');
            });


$app->DELETE('/api/v1/messages/{messageId}/reactions', function(Application $app, Request $request, $message_id) {
            $emoji_name = $request->get('emoji_name');
            $emoji_code = $request->get('emoji_code');
            $reaction_type = $request->get('reaction_type');
            return new Response('How about implementing removeReaction as a DELETE method ?');
            });


$app->POST('/api/v1/messages/render', function(Application $app, Request $request) {
            $content = $request->get('content');
            return new Response('How about implementing renderMessage as a POST method ?');
            });


$app->POST('/api/v1/messages', function(Application $app, Request $request) {
            $type = $request->get('type');
            $to = $request->get('to');
            $content = $request->get('content');
            $topic = $request->get('topic');
            $queue_id = $request->get('queue_id');
            $local_id = $request->get('local_id');
            return new Response('How about implementing sendMessage as a POST method ?');
            });


$app->PATCH('/api/v1/messages/{messageId}', function(Application $app, Request $request, $message_id) {
            $topic = $request->get('topic');
            $propagate_mode = $request->get('propagate_mode');
            $send_notification_to_old_thread = $request->get('send_notification_to_old_thread');
            $send_notification_to_new_thread = $request->get('send_notification_to_new_thread');
            $content = $request->get('content');
            $stream_id = $request->get('stream_id');
            return new Response('How about implementing updateMessage as a PATCH method ?');
            });


$app->POST('/api/v1/messages/flags', function(Application $app, Request $request) {
            $messages = $request->get('messages');
            $op = $request->get('op');
            $flag = $request->get('flag');
            return new Response('How about implementing updateMessageFlags as a POST method ?');
            });


$app->POST('/api/v1/user_uploads', function(Application $app, Request $request) {
            $filename = $request->get('filename');
            return new Response('How about implementing uploadFile as a POST method ?');
            });


$app->DELETE('/api/v1/events', function(Application $app, Request $request) {
            $queue_id = $request->get('queue_id');
            return new Response('How about implementing deleteQueue as a DELETE method ?');
            });


$app->GET('/api/v1/events', function(Application $app, Request $request) {
            $queue_id = $request->get('queue_id');
            $last_event_id = $request->get('last_event_id');
            $dont_block = $request->get('dont_block');
            return new Response('How about implementing getEvents as a GET method ?');
            });


$app->POST('/api/v1/real-time', function(Application $app, Request $request) {
            $event_types = $request->get('event_types');
            $narrow = $request->get('narrow');
            $all_public_streams = $request->get('all_public_streams');
            return new Response('How about implementing realTimePost as a POST method ?');
            });


$app->POST('/api/v1/register', function(Application $app, Request $request) {
            $apply_markdown = $request->get('apply_markdown');
            $client_gravatar = $request->get('client_gravatar');
            $slim_presence = $request->get('slim_presence');
            $event_types = $request->get('event_types');
            $all_public_streams = $request->get('all_public_streams');
            $include_subscribers = $request->get('include_subscribers');
            $client_capabilities = $request->get('client_capabilities');
            $fetch_event_types = $request->get('fetch_event_types');
            $narrow = $request->get('narrow');
            return new Response('How about implementing registerQueue as a POST method ?');
            });


$app->POST('/api/v1/rest-error-handling', function(Application $app, Request $request) {
            return new Response('How about implementing restErrorHandling as a POST method ?');
            });


$app->POST('/api/v1/realm/playgrounds', function(Application $app, Request $request) {
            $name = $request->get('name');
            $pygments_language = $request->get('pygments_language');
            $url_prefix = $request->get('url_prefix');
            return new Response('How about implementing addCodePlayground as a POST method ?');
            });


$app->POST('/api/v1/realm/filters', function(Application $app, Request $request) {
            $pattern = $request->get('pattern');
            $url_format_string = $request->get('url_format_string');
            return new Response('How about implementing addLinkifier as a POST method ?');
            });


$app->POST('/api/v1/realm/profile_fields', function(Application $app, Request $request) {
            $name = $request->get('name');
            $hint = $request->get('hint');
            $field_type = $request->get('field_type');
            $field_data = $request->get('field_data');
            return new Response('How about implementing createCustomProfileField as a POST method ?');
            });


$app->GET('/api/v1/realm/emoji', function(Application $app, Request $request) {
            return new Response('How about implementing getCustomEmoji as a GET method ?');
            });


$app->GET('/api/v1/realm/profile_fields', function(Application $app, Request $request) {
            return new Response('How about implementing getCustomProfileFields as a GET method ?');
            });


$app->GET('/api/v1/realm/linkifiers', function(Application $app, Request $request) {
            return new Response('How about implementing getLinkifiers as a GET method ?');
            });


$app->GET('/api/v1/server_settings', function(Application $app, Request $request) {
            return new Response('How about implementing getServerSettings as a GET method ?');
            });


$app->DELETE('/api/v1/realm/playgrounds/{playgroundId}', function(Application $app, Request $request, $playground_id) {
            return new Response('How about implementing removeCodePlayground as a DELETE method ?');
            });


$app->DELETE('/api/v1/realm/filters/{filterId}', function(Application $app, Request $request, $filter_id) {
            return new Response('How about implementing removeLinkifier as a DELETE method ?');
            });


$app->PATCH('/api/v1/realm/profile_fields', function(Application $app, Request $request) {
            $order = $request->get('order');
            return new Response('How about implementing reorderCustomProfileFields as a PATCH method ?');
            });


$app->PATCH('/api/v1/realm/filters/{filterId}', function(Application $app, Request $request, $filter_id) {
            $pattern = $request->get('pattern');
            $url_format_string = $request->get('url_format_string');
            return new Response('How about implementing updateLinkifier as a PATCH method ?');
            });


$app->POST('/api/v1/realm/emoji/{emojiName}', function(Application $app, Request $request, $emoji_name) {
            $filename = $request->get('filename');
            return new Response('How about implementing uploadCustomEmoji as a POST method ?');
            });


$app->DELETE('/api/v1/streams/{streamId}', function(Application $app, Request $request, $stream_id) {
            return new Response('How about implementing archiveStream as a DELETE method ?');
            });


$app->GET('/api/v1/calls/bigbluebutton/create', function(Application $app, Request $request) {
            return new Response('How about implementing createBigBlueButtonVideoCall as a GET method ?');
            });


$app->POST('/api/v1/streams/{streamId}/delete_topic', function(Application $app, Request $request, $stream_id) {
            $topic_name = $request->get('topic_name');
            return new Response('How about implementing deleteTopic as a POST method ?');
            });


$app->GET('/api/v1/get_stream_id', function(Application $app, Request $request) {
            $stream = $request->get('stream');
            return new Response('How about implementing getStreamId as a GET method ?');
            });


$app->GET('/api/v1/users/me/{streamId}/topics', function(Application $app, Request $request, $stream_id) {
            return new Response('How about implementing getStreamTopics as a GET method ?');
            });


$app->GET('/api/v1/streams', function(Application $app, Request $request) {
            $include_public = $request->get('include_public');
            $include_web_public = $request->get('include_web_public');
            $include_subscribed = $request->get('include_subscribed');
            $include_all_active = $request->get('include_all_active');
            $include_default = $request->get('include_default');
            $include_owner_subscribed = $request->get('include_owner_subscribed');
            return new Response('How about implementing getStreams as a GET method ?');
            });


$app->GET('/api/v1/streams/{streamId}/members', function(Application $app, Request $request, $stream_id) {
            return new Response('How about implementing getSubscribers as a GET method ?');
            });


$app->GET('/api/v1/users/{userId}/subscriptions/{streamId}', function(Application $app, Request $request, $user_id, $stream_id) {
            return new Response('How about implementing getSubscriptionStatus as a GET method ?');
            });


$app->GET('/api/v1/users/me/subscriptions', function(Application $app, Request $request) {
            $include_subscribers = $request->get('include_subscribers');
            return new Response('How about implementing getSubscriptions as a GET method ?');
            });


$app->PATCH('/api/v1/users/me/subscriptions/muted_topics', function(Application $app, Request $request) {
            $stream = $request->get('stream');
            $stream_id = $request->get('stream_id');
            $topic = $request->get('topic');
            $op = $request->get('op');
            return new Response('How about implementing muteTopic as a PATCH method ?');
            });


$app->POST('/api/v1/users/me/subscriptions', function(Application $app, Request $request) {
            $subscriptions = $request->get('subscriptions');
            $principals = $request->get('principals');
            $authorization_errors_fatal = $request->get('authorization_errors_fatal');
            $announce = $request->get('announce');
            $invite_only = $request->get('invite_only');
            $history_public_to_subscribers = $request->get('history_public_to_subscribers');
            $stream_post_policy = $request->get('stream_post_policy');
            $message_retention_days = $request->get('message_retention_days');
            return new Response('How about implementing subscribe as a POST method ?');
            });


$app->DELETE('/api/v1/users/me/subscriptions', function(Application $app, Request $request) {
            $subscriptions = $request->get('subscriptions');
            $principals = $request->get('principals');
            return new Response('How about implementing unsubscribe as a DELETE method ?');
            });


$app->PATCH('/api/v1/streams/{streamId}', function(Application $app, Request $request, $stream_id) {
            $description = $request->get('description');
            $new_name = $request->get('new_name');
            $is_private = $request->get('is_private');
            $is_announcement_only = $request->get('is_announcement_only');
            $stream_post_policy = $request->get('stream_post_policy');
            $history_public_to_subscribers = $request->get('history_public_to_subscribers');
            $message_retention_days = $request->get('message_retention_days');
            return new Response('How about implementing updateStream as a PATCH method ?');
            });


$app->POST('/api/v1/users/me/subscriptions/properties', function(Application $app, Request $request) {
            $subscription_data = $request->get('subscription_data');
            return new Response('How about implementing updateSubscriptionSettings as a POST method ?');
            });


$app->PATCH('/api/v1/users/me/subscriptions', function(Application $app, Request $request) {
            $delete = $request->get('delete');
            $add = $request->get('add');
            return new Response('How about implementing updateSubscriptions as a PATCH method ?');
            });


$app->POST('/api/v1/users', function(Application $app, Request $request) {
            $email = $request->get('email');
            $password = $request->get('password');
            $full_name = $request->get('full_name');
            return new Response('How about implementing createUser as a POST method ?');
            });


$app->POST('/api/v1/user_groups/create', function(Application $app, Request $request) {
            $name = $request->get('name');
            $description = $request->get('description');
            $members = $request->get('members');
            return new Response('How about implementing createUserGroup as a POST method ?');
            });


$app->DELETE('/api/v1/users/me', function(Application $app, Request $request) {
            return new Response('How about implementing deactivateOwnUser as a DELETE method ?');
            });


$app->DELETE('/api/v1/users/{userId}', function(Application $app, Request $request, $user_id) {
            return new Response('How about implementing deactivateUser as a DELETE method ?');
            });


$app->GET('/api/v1/attachments', function(Application $app, Request $request) {
            return new Response('How about implementing getAttachments as a GET method ?');
            });


$app->GET('/api/v1/users/me', function(Application $app, Request $request) {
            return new Response('How about implementing getOwnUser as a GET method ?');
            });


$app->GET('/api/v1/users/{userId}', function(Application $app, Request $request, $user_id) {
            $client_gravatar = $request->get('client_gravatar');
            $include_custom_profile_fields = $request->get('include_custom_profile_fields');
            return new Response('How about implementing getUser as a GET method ?');
            });


$app->GET('/api/v1/users/{email}', function(Application $app, Request $request, $email) {
            $client_gravatar = $request->get('client_gravatar');
            $include_custom_profile_fields = $request->get('include_custom_profile_fields');
            return new Response('How about implementing getUserByEmail as a GET method ?');
            });


$app->GET('/api/v1/user_groups', function(Application $app, Request $request) {
            return new Response('How about implementing getUserGroups as a GET method ?');
            });


$app->GET('/api/v1/users/{userIdOrEmail}/presence', function(Application $app, Request $request, $user_id_or_email) {
            return new Response('How about implementing getUserPresence as a GET method ?');
            });


$app->GET('/api/v1/users', function(Application $app, Request $request) {
            $client_gravatar = $request->get('client_gravatar');
            $include_custom_profile_fields = $request->get('include_custom_profile_fields');
            return new Response('How about implementing getUsers as a GET method ?');
            });


$app->POST('/api/v1/users/me/muted_users/{mutedUserId}', function(Application $app, Request $request, $muted_user_id) {
            return new Response('How about implementing muteUser as a POST method ?');
            });


$app->POST('/api/v1/users/{userId}/reactivate', function(Application $app, Request $request, $user_id) {
            return new Response('How about implementing reactivateUser as a POST method ?');
            });


$app->DELETE('/api/v1/user_groups/{userGroupId}', function(Application $app, Request $request, $user_group_id) {
            return new Response('How about implementing removeUserGroup as a DELETE method ?');
            });


$app->POST('/api/v1/typing', function(Application $app, Request $request) {
            $type = $request->get('type');
            $op = $request->get('op');
            $to = $request->get('to');
            $topic = $request->get('topic');
            return new Response('How about implementing setTypingStatus as a POST method ?');
            });


$app->DELETE('/api/v1/users/me/muted_users/{mutedUserId}', function(Application $app, Request $request, $muted_user_id) {
            return new Response('How about implementing unmuteUser as a DELETE method ?');
            });


$app->PATCH('/api/v1/settings', function(Application $app, Request $request) {
            $full_name = $request->get('full_name');
            $email = $request->get('email');
            $old_password = $request->get('old_password');
            $new_password = $request->get('new_password');
            $twenty_four_hour_time = $request->get('twenty_four_hour_time');
            $dense_mode = $request->get('dense_mode');
            $starred_message_counts = $request->get('starred_message_counts');
            $fluid_layout_width = $request->get('fluid_layout_width');
            $high_contrast_mode = $request->get('high_contrast_mode');
            $color_scheme = $request->get('color_scheme');
            $enable_drafts_synchronization = $request->get('enable_drafts_synchronization');
            $translate_emoticons = $request->get('translate_emoticons');
            $default_language = $request->get('default_language');
            $default_view = $request->get('default_view');
            $left_side_userlist = $request->get('left_side_userlist');
            $emojiset = $request->get('emojiset');
            $demote_inactive_streams = $request->get('demote_inactive_streams');
            $timezone = $request->get('timezone');
            $enable_stream_desktop_notifications = $request->get('enable_stream_desktop_notifications');
            $enable_stream_email_notifications = $request->get('enable_stream_email_notifications');
            $enable_stream_push_notifications = $request->get('enable_stream_push_notifications');
            $enable_stream_audible_notifications = $request->get('enable_stream_audible_notifications');
            $notification_sound = $request->get('notification_sound');
            $enable_desktop_notifications = $request->get('enable_desktop_notifications');
            $enable_sounds = $request->get('enable_sounds');
            $email_notifications_batching_period_seconds = $request->get('email_notifications_batching_period_seconds');
            $enable_offline_email_notifications = $request->get('enable_offline_email_notifications');
            $enable_offline_push_notifications = $request->get('enable_offline_push_notifications');
            $enable_online_push_notifications = $request->get('enable_online_push_notifications');
            $enable_digest_emails = $request->get('enable_digest_emails');
            $enable_marketing_emails = $request->get('enable_marketing_emails');
            $enable_login_emails = $request->get('enable_login_emails');
            $message_content_in_email_notifications = $request->get('message_content_in_email_notifications');
            $pm_content_in_desktop_notifications = $request->get('pm_content_in_desktop_notifications');
            $wildcard_mentions_notify = $request->get('wildcard_mentions_notify');
            $desktop_icon_count_display = $request->get('desktop_icon_count_display');
            $realm_name_in_notifications = $request->get('realm_name_in_notifications');
            $presence_enabled = $request->get('presence_enabled');
            $enter_sends = $request->get('enter_sends');
            return new Response('How about implementing updateSettings as a PATCH method ?');
            });


$app->POST('/api/v1/users/me/status', function(Application $app, Request $request) {
            $status_text = $request->get('status_text');
            $away = $request->get('away');
            $emoji_name = $request->get('emoji_name');
            $emoji_code = $request->get('emoji_code');
            $reaction_type = $request->get('reaction_type');
            return new Response('How about implementing updateStatus as a POST method ?');
            });


$app->PATCH('/api/v1/users/{userId}', function(Application $app, Request $request, $user_id) {
            $full_name = $request->get('full_name');
            $role = $request->get('role');
            $profile_data = $request->get('profile_data');
            return new Response('How about implementing updateUser as a PATCH method ?');
            });


$app->PATCH('/api/v1/user_groups/{userGroupId}', function(Application $app, Request $request, $user_group_id) {
            $name = $request->get('name');
            $description = $request->get('description');
            return new Response('How about implementing updateUserGroup as a PATCH method ?');
            });


$app->POST('/api/v1/user_groups/{userGroupId}/members', function(Application $app, Request $request, $user_group_id) {
            $delete = $request->get('delete');
            $add = $request->get('add');
            return new Response('How about implementing updateUserGroupMembers as a POST method ?');
            });


$app->POST('/api/v1/zulip-outgoing-webhook', function(Application $app, Request $request) {
            return new Response('How about implementing zulipOutgoingWebhooks as a POST method ?');
            });


$app->run();
