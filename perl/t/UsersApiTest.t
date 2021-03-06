=begin comment

Zulip REST API

Powerful open source group chat 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::UsersApi');

my $api = WWW::OpenAPIClient::UsersApi->new();
isa_ok($api, 'WWW::OpenAPIClient::UsersApi');

#
# create_user test
#
# uncomment below and update the test
#my $create_user_email = undef; # replace NULL with a proper value
#my $create_user_password = undef; # replace NULL with a proper value
#my $create_user_full_name = undef; # replace NULL with a proper value
#my $create_user_result = $api->create_user(email => $create_user_email, password => $create_user_password, full_name => $create_user_full_name);

#
# create_user_group test
#
# uncomment below and update the test
#my $create_user_group_name = undef; # replace NULL with a proper value
#my $create_user_group_description = undef; # replace NULL with a proper value
#my $create_user_group_members = undef; # replace NULL with a proper value
#my $create_user_group_result = $api->create_user_group(name => $create_user_group_name, description => $create_user_group_description, members => $create_user_group_members);

#
# deactivate_own_user test
#
# uncomment below and update the test
#my $deactivate_own_user_result = $api->deactivate_own_user();

#
# deactivate_user test
#
# uncomment below and update the test
#my $deactivate_user_user_id = undef; # replace NULL with a proper value
#my $deactivate_user_result = $api->deactivate_user(user_id => $deactivate_user_user_id);

#
# get_attachments test
#
# uncomment below and update the test
#my $get_attachments_result = $api->get_attachments();

#
# get_own_user test
#
# uncomment below and update the test
#my $get_own_user_result = $api->get_own_user();

#
# get_user test
#
# uncomment below and update the test
#my $get_user_user_id = undef; # replace NULL with a proper value
#my $get_user_client_gravatar = undef; # replace NULL with a proper value
#my $get_user_include_custom_profile_fields = undef; # replace NULL with a proper value
#my $get_user_result = $api->get_user(user_id => $get_user_user_id, client_gravatar => $get_user_client_gravatar, include_custom_profile_fields => $get_user_include_custom_profile_fields);

#
# get_user_by_email test
#
# uncomment below and update the test
#my $get_user_by_email_email = undef; # replace NULL with a proper value
#my $get_user_by_email_client_gravatar = undef; # replace NULL with a proper value
#my $get_user_by_email_include_custom_profile_fields = undef; # replace NULL with a proper value
#my $get_user_by_email_result = $api->get_user_by_email(email => $get_user_by_email_email, client_gravatar => $get_user_by_email_client_gravatar, include_custom_profile_fields => $get_user_by_email_include_custom_profile_fields);

#
# get_user_groups test
#
# uncomment below and update the test
#my $get_user_groups_result = $api->get_user_groups();

#
# get_user_presence test
#
# uncomment below and update the test
#my $get_user_presence_user_id_or_email = undef; # replace NULL with a proper value
#my $get_user_presence_result = $api->get_user_presence(user_id_or_email => $get_user_presence_user_id_or_email);

#
# get_users test
#
# uncomment below and update the test
#my $get_users_client_gravatar = undef; # replace NULL with a proper value
#my $get_users_include_custom_profile_fields = undef; # replace NULL with a proper value
#my $get_users_result = $api->get_users(client_gravatar => $get_users_client_gravatar, include_custom_profile_fields => $get_users_include_custom_profile_fields);

#
# mute_user test
#
# uncomment below and update the test
#my $mute_user_muted_user_id = undef; # replace NULL with a proper value
#my $mute_user_result = $api->mute_user(muted_user_id => $mute_user_muted_user_id);

#
# reactivate_user test
#
# uncomment below and update the test
#my $reactivate_user_user_id = undef; # replace NULL with a proper value
#my $reactivate_user_result = $api->reactivate_user(user_id => $reactivate_user_user_id);

#
# remove_user_group test
#
# uncomment below and update the test
#my $remove_user_group_user_group_id = undef; # replace NULL with a proper value
#my $remove_user_group_result = $api->remove_user_group(user_group_id => $remove_user_group_user_group_id);

#
# set_typing_status test
#
# uncomment below and update the test
#my $set_typing_status_op = undef; # replace NULL with a proper value
#my $set_typing_status_to = undef; # replace NULL with a proper value
#my $set_typing_status_type = undef; # replace NULL with a proper value
#my $set_typing_status_topic = undef; # replace NULL with a proper value
#my $set_typing_status_result = $api->set_typing_status(op => $set_typing_status_op, to => $set_typing_status_to, type => $set_typing_status_type, topic => $set_typing_status_topic);

#
# unmute_user test
#
# uncomment below and update the test
#my $unmute_user_muted_user_id = undef; # replace NULL with a proper value
#my $unmute_user_result = $api->unmute_user(muted_user_id => $unmute_user_muted_user_id);

#
# update_settings test
#
# uncomment below and update the test
#my $update_settings_full_name = undef; # replace NULL with a proper value
#my $update_settings_email = undef; # replace NULL with a proper value
#my $update_settings_old_password = undef; # replace NULL with a proper value
#my $update_settings_new_password = undef; # replace NULL with a proper value
#my $update_settings_twenty_four_hour_time = undef; # replace NULL with a proper value
#my $update_settings_dense_mode = undef; # replace NULL with a proper value
#my $update_settings_starred_message_counts = undef; # replace NULL with a proper value
#my $update_settings_fluid_layout_width = undef; # replace NULL with a proper value
#my $update_settings_high_contrast_mode = undef; # replace NULL with a proper value
#my $update_settings_color_scheme = undef; # replace NULL with a proper value
#my $update_settings_enable_drafts_synchronization = undef; # replace NULL with a proper value
#my $update_settings_translate_emoticons = undef; # replace NULL with a proper value
#my $update_settings_default_language = undef; # replace NULL with a proper value
#my $update_settings_default_view = undef; # replace NULL with a proper value
#my $update_settings_left_side_userlist = undef; # replace NULL with a proper value
#my $update_settings_emojiset = undef; # replace NULL with a proper value
#my $update_settings_demote_inactive_streams = undef; # replace NULL with a proper value
#my $update_settings_timezone = undef; # replace NULL with a proper value
#my $update_settings_enable_stream_desktop_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_stream_email_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_stream_push_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_stream_audible_notifications = undef; # replace NULL with a proper value
#my $update_settings_notification_sound = undef; # replace NULL with a proper value
#my $update_settings_enable_desktop_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_sounds = undef; # replace NULL with a proper value
#my $update_settings_email_notifications_batching_period_seconds = undef; # replace NULL with a proper value
#my $update_settings_enable_offline_email_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_offline_push_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_online_push_notifications = undef; # replace NULL with a proper value
#my $update_settings_enable_digest_emails = undef; # replace NULL with a proper value
#my $update_settings_enable_marketing_emails = undef; # replace NULL with a proper value
#my $update_settings_enable_login_emails = undef; # replace NULL with a proper value
#my $update_settings_message_content_in_email_notifications = undef; # replace NULL with a proper value
#my $update_settings_pm_content_in_desktop_notifications = undef; # replace NULL with a proper value
#my $update_settings_wildcard_mentions_notify = undef; # replace NULL with a proper value
#my $update_settings_desktop_icon_count_display = undef; # replace NULL with a proper value
#my $update_settings_realm_name_in_notifications = undef; # replace NULL with a proper value
#my $update_settings_presence_enabled = undef; # replace NULL with a proper value
#my $update_settings_enter_sends = undef; # replace NULL with a proper value
#my $update_settings_result = $api->update_settings(full_name => $update_settings_full_name, email => $update_settings_email, old_password => $update_settings_old_password, new_password => $update_settings_new_password, twenty_four_hour_time => $update_settings_twenty_four_hour_time, dense_mode => $update_settings_dense_mode, starred_message_counts => $update_settings_starred_message_counts, fluid_layout_width => $update_settings_fluid_layout_width, high_contrast_mode => $update_settings_high_contrast_mode, color_scheme => $update_settings_color_scheme, enable_drafts_synchronization => $update_settings_enable_drafts_synchronization, translate_emoticons => $update_settings_translate_emoticons, default_language => $update_settings_default_language, default_view => $update_settings_default_view, left_side_userlist => $update_settings_left_side_userlist, emojiset => $update_settings_emojiset, demote_inactive_streams => $update_settings_demote_inactive_streams, timezone => $update_settings_timezone, enable_stream_desktop_notifications => $update_settings_enable_stream_desktop_notifications, enable_stream_email_notifications => $update_settings_enable_stream_email_notifications, enable_stream_push_notifications => $update_settings_enable_stream_push_notifications, enable_stream_audible_notifications => $update_settings_enable_stream_audible_notifications, notification_sound => $update_settings_notification_sound, enable_desktop_notifications => $update_settings_enable_desktop_notifications, enable_sounds => $update_settings_enable_sounds, email_notifications_batching_period_seconds => $update_settings_email_notifications_batching_period_seconds, enable_offline_email_notifications => $update_settings_enable_offline_email_notifications, enable_offline_push_notifications => $update_settings_enable_offline_push_notifications, enable_online_push_notifications => $update_settings_enable_online_push_notifications, enable_digest_emails => $update_settings_enable_digest_emails, enable_marketing_emails => $update_settings_enable_marketing_emails, enable_login_emails => $update_settings_enable_login_emails, message_content_in_email_notifications => $update_settings_message_content_in_email_notifications, pm_content_in_desktop_notifications => $update_settings_pm_content_in_desktop_notifications, wildcard_mentions_notify => $update_settings_wildcard_mentions_notify, desktop_icon_count_display => $update_settings_desktop_icon_count_display, realm_name_in_notifications => $update_settings_realm_name_in_notifications, presence_enabled => $update_settings_presence_enabled, enter_sends => $update_settings_enter_sends);

#
# update_status test
#
# uncomment below and update the test
#my $update_status_status_text = undef; # replace NULL with a proper value
#my $update_status_away = undef; # replace NULL with a proper value
#my $update_status_emoji_name = undef; # replace NULL with a proper value
#my $update_status_emoji_code = undef; # replace NULL with a proper value
#my $update_status_reaction_type = undef; # replace NULL with a proper value
#my $update_status_result = $api->update_status(status_text => $update_status_status_text, away => $update_status_away, emoji_name => $update_status_emoji_name, emoji_code => $update_status_emoji_code, reaction_type => $update_status_reaction_type);

#
# update_user test
#
# uncomment below and update the test
#my $update_user_user_id = undef; # replace NULL with a proper value
#my $update_user_full_name = undef; # replace NULL with a proper value
#my $update_user_role = undef; # replace NULL with a proper value
#my $update_user_profile_data = undef; # replace NULL with a proper value
#my $update_user_result = $api->update_user(user_id => $update_user_user_id, full_name => $update_user_full_name, role => $update_user_role, profile_data => $update_user_profile_data);

#
# update_user_group test
#
# uncomment below and update the test
#my $update_user_group_user_group_id = undef; # replace NULL with a proper value
#my $update_user_group_name = undef; # replace NULL with a proper value
#my $update_user_group_description = undef; # replace NULL with a proper value
#my $update_user_group_result = $api->update_user_group(user_group_id => $update_user_group_user_group_id, name => $update_user_group_name, description => $update_user_group_description);

#
# update_user_group_members test
#
# uncomment below and update the test
#my $update_user_group_members_user_group_id = undef; # replace NULL with a proper value
#my $update_user_group_members_delete = undef; # replace NULL with a proper value
#my $update_user_group_members_add = undef; # replace NULL with a proper value
#my $update_user_group_members_result = $api->update_user_group_members(user_group_id => $update_user_group_members_user_group_id, delete => $update_user_group_members_delete, add => $update_user_group_members_add);

