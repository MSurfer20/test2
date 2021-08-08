//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

library openapi.api;

import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:http/http.dart';
import 'package:intl/intl.dart';
import 'package:meta/meta.dart';

part 'api_client.dart';
part 'api_helper.dart';
part 'api_exception.dart';
part 'auth/authentication.dart';
part 'auth/api_key_auth.dart';
part 'auth/oauth.dart';
part 'auth/http_basic_auth.dart';
part 'auth/http_bearer_auth.dart';

part 'api/authentication_api.dart';
part 'api/messages_api.dart';
part 'api/real_time_events_api.dart';
part 'api/server_and_organizations_api.dart';
part 'api/streams_api.dart';
part 'api/users_api.dart';
part 'api/webhooks_api.dart';

part 'model/add_subscriptions_response.dart';
part 'model/add_subscriptions_response_all_of.dart';
part 'model/api_key_response.dart';
part 'model/api_key_response_all_of.dart';
part 'model/attachments.dart';
part 'model/attachments_messages.dart';
part 'model/bad_event_queue_id_error.dart';
part 'model/bad_event_queue_id_error_all_of.dart';
part 'model/basic_bot.dart';
part 'model/basic_bot_all_of.dart';
part 'model/basic_bot_base.dart';
part 'model/basic_stream.dart';
part 'model/basic_stream_all_of.dart';
part 'model/basic_stream_base.dart';
part 'model/bot.dart';
part 'model/bot_all_of.dart';
part 'model/coded_error.dart';
part 'model/coded_error_all_of.dart';
part 'model/coded_error_base.dart';
part 'model/coded_error_base_all_of.dart';
part 'model/custom_profile_field.dart';
part 'model/default_stream_group.dart';
part 'model/emoji_reaction.dart';
part 'model/emoji_reaction_all_of.dart';
part 'model/emoji_reaction_base.dart';
part 'model/emoji_reaction_base_user.dart';
part 'model/get_messages.dart';
part 'model/get_messages_all_of.dart';
part 'model/hotspot.dart';
part 'model/inline_response200.dart';
part 'model/invalid_api_key_error.dart';
part 'model/invalid_message_error.dart';
part 'model/invalid_message_error_all_of.dart';
part 'model/json_error.dart';
part 'model/json_error_base.dart';
part 'model/json_error_base_all_of.dart';
part 'model/json_response_base.dart';
part 'model/json_success.dart';
part 'model/json_success_all_of.dart';
part 'model/json_success_base.dart';
part 'model/json_success_base_all_of.dart';
part 'model/messages.dart';
part 'model/messages_all_of.dart';
part 'model/messages_base.dart';
part 'model/messages_base_topic_links.dart';
part 'model/missing_argument_error.dart';
part 'model/missing_argument_error_all_of.dart';
part 'model/non_existing_stream_error.dart';
part 'model/non_existing_stream_error_all_of.dart';
part 'model/presence.dart';
part 'model/rate_limited_error.dart';
part 'model/realm_deactivated_error.dart';
part 'model/realm_domain.dart';
part 'model/realm_emoji.dart';
part 'model/realm_export.dart';
part 'model/realm_playground.dart';
part 'model/subscriptions.dart';
part 'model/user.dart';
part 'model/user_all_of.dart';
part 'model/user_base.dart';
part 'model/user_deactivated_error.dart';
part 'model/user_group.dart';
part 'model/user_not_authorized_error.dart';


const _delimiters = {'csv': ',', 'ssv': ' ', 'tsv': '\t', 'pipes': '|'};
const _dateEpochMarker = 'epoch';
final _dateFormatter = DateFormat('yyyy-MM-dd');
final _regList = RegExp(r'^List<(.*)>$');
final _regSet = RegExp(r'^Set<(.*)>$');
final _regMap = RegExp(r'^Map<String,(.*)>$');

ApiClient defaultApiClient = ApiClient();
