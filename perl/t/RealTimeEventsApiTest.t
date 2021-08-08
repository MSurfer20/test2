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

use_ok('WWW::OpenAPIClient::RealTimeEventsApi');

my $api = WWW::OpenAPIClient::RealTimeEventsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::RealTimeEventsApi');

#
# delete_queue test
#
# uncomment below and update the test
#my $delete_queue_queue_id = undef; # replace NULL with a proper value
#my $delete_queue_result = $api->delete_queue(queue_id => $delete_queue_queue_id);

#
# get_events test
#
# uncomment below and update the test
#my $get_events_queue_id = undef; # replace NULL with a proper value
#my $get_events_last_event_id = undef; # replace NULL with a proper value
#my $get_events_dont_block = undef; # replace NULL with a proper value
#my $get_events_result = $api->get_events(queue_id => $get_events_queue_id, last_event_id => $get_events_last_event_id, dont_block => $get_events_dont_block);

#
# real_time_post test
#
# uncomment below and update the test
#my $real_time_post_event_types = undef; # replace NULL with a proper value
#my $real_time_post_narrow = undef; # replace NULL with a proper value
#my $real_time_post_all_public_streams = undef; # replace NULL with a proper value
#my $real_time_post_result = $api->real_time_post(event_types => $real_time_post_event_types, narrow => $real_time_post_narrow, all_public_streams => $real_time_post_all_public_streams);

#
# register_queue test
#
# uncomment below and update the test
#my $register_queue_apply_markdown = undef; # replace NULL with a proper value
#my $register_queue_client_gravatar = undef; # replace NULL with a proper value
#my $register_queue_slim_presence = undef; # replace NULL with a proper value
#my $register_queue_event_types = undef; # replace NULL with a proper value
#my $register_queue_all_public_streams = undef; # replace NULL with a proper value
#my $register_queue_include_subscribers = undef; # replace NULL with a proper value
#my $register_queue_client_capabilities = undef; # replace NULL with a proper value
#my $register_queue_fetch_event_types = undef; # replace NULL with a proper value
#my $register_queue_narrow = undef; # replace NULL with a proper value
#my $register_queue_result = $api->register_queue(apply_markdown => $register_queue_apply_markdown, client_gravatar => $register_queue_client_gravatar, slim_presence => $register_queue_slim_presence, event_types => $register_queue_event_types, all_public_streams => $register_queue_all_public_streams, include_subscribers => $register_queue_include_subscribers, client_capabilities => $register_queue_client_capabilities, fetch_event_types => $register_queue_fetch_event_types, narrow => $register_queue_narrow);

#
# rest_error_handling test
#
# uncomment below and update the test
#my $rest_error_handling_result = $api->rest_error_handling();

