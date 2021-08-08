//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_import

import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:built_value/standard_json_plugin.dart';
import 'package:built_value/iso_8601_date_time_serializer.dart';
import 'package:openapi/src/date_serializer.dart';
import 'package:openapi/src/model/date.dart';

import 'package:openapi/src/model/add_subscriptions_response.dart';
import 'package:openapi/src/model/add_subscriptions_response_all_of.dart';
import 'package:openapi/src/model/api_key_response.dart';
import 'package:openapi/src/model/api_key_response_all_of.dart';
import 'package:openapi/src/model/attachments.dart';
import 'package:openapi/src/model/attachments_messages.dart';
import 'package:openapi/src/model/bad_event_queue_id_error.dart';
import 'package:openapi/src/model/bad_event_queue_id_error_all_of.dart';
import 'package:openapi/src/model/basic_bot.dart';
import 'package:openapi/src/model/basic_bot_all_of.dart';
import 'package:openapi/src/model/basic_bot_base.dart';
import 'package:openapi/src/model/basic_stream.dart';
import 'package:openapi/src/model/basic_stream_all_of.dart';
import 'package:openapi/src/model/basic_stream_base.dart';
import 'package:openapi/src/model/bot.dart';
import 'package:openapi/src/model/bot_all_of.dart';
import 'package:openapi/src/model/coded_error.dart';
import 'package:openapi/src/model/coded_error_all_of.dart';
import 'package:openapi/src/model/coded_error_base.dart';
import 'package:openapi/src/model/coded_error_base_all_of.dart';
import 'package:openapi/src/model/custom_profile_field.dart';
import 'package:openapi/src/model/default_stream_group.dart';
import 'package:openapi/src/model/emoji_reaction.dart';
import 'package:openapi/src/model/emoji_reaction_all_of.dart';
import 'package:openapi/src/model/emoji_reaction_base.dart';
import 'package:openapi/src/model/emoji_reaction_base_user.dart';
import 'package:openapi/src/model/get_messages.dart';
import 'package:openapi/src/model/get_messages_all_of.dart';
import 'package:openapi/src/model/hotspot.dart';
import 'package:openapi/src/model/inline_response200.dart';
import 'package:openapi/src/model/invalid_api_key_error.dart';
import 'package:openapi/src/model/invalid_message_error.dart';
import 'package:openapi/src/model/invalid_message_error_all_of.dart';
import 'package:openapi/src/model/json_error.dart';
import 'package:openapi/src/model/json_error_base.dart';
import 'package:openapi/src/model/json_error_base_all_of.dart';
import 'package:openapi/src/model/json_response_base.dart';
import 'package:openapi/src/model/json_success.dart';
import 'package:openapi/src/model/json_success_all_of.dart';
import 'package:openapi/src/model/json_success_base.dart';
import 'package:openapi/src/model/json_success_base_all_of.dart';
import 'package:openapi/src/model/messages.dart';
import 'package:openapi/src/model/messages_all_of.dart';
import 'package:openapi/src/model/messages_base.dart';
import 'package:openapi/src/model/messages_base_topic_links.dart';
import 'package:openapi/src/model/missing_argument_error.dart';
import 'package:openapi/src/model/missing_argument_error_all_of.dart';
import 'package:openapi/src/model/non_existing_stream_error.dart';
import 'package:openapi/src/model/non_existing_stream_error_all_of.dart';
import 'package:openapi/src/model/presence.dart';
import 'package:openapi/src/model/rate_limited_error.dart';
import 'package:openapi/src/model/realm_deactivated_error.dart';
import 'package:openapi/src/model/realm_domain.dart';
import 'package:openapi/src/model/realm_emoji.dart';
import 'package:openapi/src/model/realm_export.dart';
import 'package:openapi/src/model/realm_playground.dart';
import 'package:openapi/src/model/subscriptions.dart';
import 'package:openapi/src/model/user.dart';
import 'package:openapi/src/model/user_all_of.dart';
import 'package:openapi/src/model/user_base.dart';
import 'package:openapi/src/model/user_deactivated_error.dart';
import 'package:openapi/src/model/user_group.dart';
import 'package:openapi/src/model/user_not_authorized_error.dart';

part 'serializers.g.dart';

@SerializersFor([
  AddSubscriptionsResponse,
  AddSubscriptionsResponseAllOf,
  ApiKeyResponse,
  ApiKeyResponseAllOf,
  Attachments,
  AttachmentsMessages,
  BadEventQueueIdError,
  BadEventQueueIdErrorAllOf,
  BasicBot,
  BasicBotAllOf,
  BasicBotBase,
  BasicStream,
  BasicStreamAllOf,
  BasicStreamBase,
  Bot,
  BotAllOf,
  CodedError,
  CodedErrorAllOf,
  CodedErrorBase,
  CodedErrorBaseAllOf,
  CustomProfileField,
  DefaultStreamGroup,
  EmojiReaction,
  EmojiReactionAllOf,
  EmojiReactionBase,
  EmojiReactionBaseUser,
  GetMessages,
  GetMessagesAllOf,
  Hotspot,
  InlineResponse200,
  InvalidApiKeyError,
  InvalidMessageError,
  InvalidMessageErrorAllOf,
  JsonError,
  JsonErrorBase,
  JsonErrorBaseAllOf,
  JsonResponseBase,
  JsonSuccess,
  JsonSuccessAllOf,
  JsonSuccessBase,
  JsonSuccessBaseAllOf,
  Messages,
  MessagesAllOf,
  MessagesBase,
  MessagesBaseTopicLinks,
  MissingArgumentError,
  MissingArgumentErrorAllOf,
  NonExistingStreamError,
  NonExistingStreamErrorAllOf,
  Presence,
  RateLimitedError,
  RealmDeactivatedError,
  RealmDomain,
  RealmEmoji,
  RealmExport,
  RealmPlayground,
  Subscriptions,
  User,
  UserAllOf,
  UserBase,
  UserDeactivatedError,
  UserGroup,
  UserNotAuthorizedError,
])
Serializers serializers = (_$serializers.toBuilder()
      ..add(const DateSerializer())
      ..add(Iso8601DateTimeSerializer()))
    .build();

Serializers standardSerializers =
    (serializers.toBuilder()..addPlugin(StandardJsonPlugin())).build();
