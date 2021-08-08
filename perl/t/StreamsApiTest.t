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

use_ok('WWW::OpenAPIClient::StreamsApi');

my $api = WWW::OpenAPIClient::StreamsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::StreamsApi');

#
# archive_stream test
#
# uncomment below and update the test
#my $archive_stream_stream_id = undef; # replace NULL with a proper value
#my $archive_stream_result = $api->archive_stream(stream_id => $archive_stream_stream_id);

#
# create_big_blue_button_video_call test
#
# uncomment below and update the test
#my $create_big_blue_button_video_call_result = $api->create_big_blue_button_video_call();

#
# get_stream_id test
#
# uncomment below and update the test
#my $get_stream_id_stream = undef; # replace NULL with a proper value
#my $get_stream_id_result = $api->get_stream_id(stream => $get_stream_id_stream);

#
# get_stream_topics test
#
# uncomment below and update the test
#my $get_stream_topics_stream_id = undef; # replace NULL with a proper value
#my $get_stream_topics_result = $api->get_stream_topics(stream_id => $get_stream_topics_stream_id);

#
# get_streams test
#
# uncomment below and update the test
#my $get_streams_include_public = undef; # replace NULL with a proper value
#my $get_streams_include_web_public = undef; # replace NULL with a proper value
#my $get_streams_include_subscribed = undef; # replace NULL with a proper value
#my $get_streams_include_all_active = undef; # replace NULL with a proper value
#my $get_streams_include_default = undef; # replace NULL with a proper value
#my $get_streams_include_owner_subscribed = undef; # replace NULL with a proper value
#my $get_streams_result = $api->get_streams(include_public => $get_streams_include_public, include_web_public => $get_streams_include_web_public, include_subscribed => $get_streams_include_subscribed, include_all_active => $get_streams_include_all_active, include_default => $get_streams_include_default, include_owner_subscribed => $get_streams_include_owner_subscribed);

#
# get_subscription_status test
#
# uncomment below and update the test
#my $get_subscription_status_user_id = undef; # replace NULL with a proper value
#my $get_subscription_status_stream_id = undef; # replace NULL with a proper value
#my $get_subscription_status_result = $api->get_subscription_status(user_id => $get_subscription_status_user_id, stream_id => $get_subscription_status_stream_id);

#
# get_subscriptions test
#
# uncomment below and update the test
#my $get_subscriptions_include_subscribers = undef; # replace NULL with a proper value
#my $get_subscriptions_result = $api->get_subscriptions(include_subscribers => $get_subscriptions_include_subscribers);

#
# mute_topic test
#
# uncomment below and update the test
#my $mute_topic_topic = undef; # replace NULL with a proper value
#my $mute_topic_op = undef; # replace NULL with a proper value
#my $mute_topic_stream = undef; # replace NULL with a proper value
#my $mute_topic_stream_id = undef; # replace NULL with a proper value
#my $mute_topic_result = $api->mute_topic(topic => $mute_topic_topic, op => $mute_topic_op, stream => $mute_topic_stream, stream_id => $mute_topic_stream_id);

#
# subscribe test
#
# uncomment below and update the test
#my $subscribe_subscriptions = undef; # replace NULL with a proper value
#my $subscribe_principals = undef; # replace NULL with a proper value
#my $subscribe_authorization_errors_fatal = undef; # replace NULL with a proper value
#my $subscribe_announce = undef; # replace NULL with a proper value
#my $subscribe_invite_only = undef; # replace NULL with a proper value
#my $subscribe_history_public_to_subscribers = undef; # replace NULL with a proper value
#my $subscribe_stream_post_policy = undef; # replace NULL with a proper value
#my $subscribe_message_retention_days = undef; # replace NULL with a proper value
#my $subscribe_result = $api->subscribe(subscriptions => $subscribe_subscriptions, principals => $subscribe_principals, authorization_errors_fatal => $subscribe_authorization_errors_fatal, announce => $subscribe_announce, invite_only => $subscribe_invite_only, history_public_to_subscribers => $subscribe_history_public_to_subscribers, stream_post_policy => $subscribe_stream_post_policy, message_retention_days => $subscribe_message_retention_days);

#
# unsubscribe test
#
# uncomment below and update the test
#my $unsubscribe_subscriptions = undef; # replace NULL with a proper value
#my $unsubscribe_principals = undef; # replace NULL with a proper value
#my $unsubscribe_result = $api->unsubscribe(subscriptions => $unsubscribe_subscriptions, principals => $unsubscribe_principals);

#
# update_stream test
#
# uncomment below and update the test
#my $update_stream_stream_id = undef; # replace NULL with a proper value
#my $update_stream_description = undef; # replace NULL with a proper value
#my $update_stream_new_name = undef; # replace NULL with a proper value
#my $update_stream_is_private = undef; # replace NULL with a proper value
#my $update_stream_is_announcement_only = undef; # replace NULL with a proper value
#my $update_stream_stream_post_policy = undef; # replace NULL with a proper value
#my $update_stream_history_public_to_subscribers = undef; # replace NULL with a proper value
#my $update_stream_message_retention_days = undef; # replace NULL with a proper value
#my $update_stream_result = $api->update_stream(stream_id => $update_stream_stream_id, description => $update_stream_description, new_name => $update_stream_new_name, is_private => $update_stream_is_private, is_announcement_only => $update_stream_is_announcement_only, stream_post_policy => $update_stream_stream_post_policy, history_public_to_subscribers => $update_stream_history_public_to_subscribers, message_retention_days => $update_stream_message_retention_days);

#
# update_subscription_settings test
#
# uncomment below and update the test
#my $update_subscription_settings_subscription_data = undef; # replace NULL with a proper value
#my $update_subscription_settings_result = $api->update_subscription_settings(subscription_data => $update_subscription_settings_subscription_data);

#
# update_subscriptions test
#
# uncomment below and update the test
#my $update_subscriptions_delete = undef; # replace NULL with a proper value
#my $update_subscriptions_add = undef; # replace NULL with a proper value
#my $update_subscriptions_result = $api->update_subscriptions(delete => $update_subscriptions_delete, add => $update_subscriptions_add);

