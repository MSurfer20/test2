//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/bot_all_of.dart';
import 'package:openapi/model/basic_bot_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bot.g.dart';

abstract class Bot implements Built<Bot, BotBuilder> {

    @nullable
    @BuiltValueField(wireName: r'user_id')
    JsonObject get userId;

    @nullable
    @BuiltValueField(wireName: r'full_name')
    JsonObject get fullName;

    @nullable
    @BuiltValueField(wireName: r'api_key')
    JsonObject get apiKey;

    @nullable
    @BuiltValueField(wireName: r'default_sending_stream')
    JsonObject get defaultSendingStream;

    @nullable
    @BuiltValueField(wireName: r'default_events_register_stream')
    JsonObject get defaultEventsRegisterStream;

    @nullable
    @BuiltValueField(wireName: r'default_all_public_streams')
    JsonObject get defaultAllPublicStreams;

    @nullable
    @BuiltValueField(wireName: r'avatar_url')
    JsonObject get avatarUrl;

    @nullable
    @BuiltValueField(wireName: r'owner_id')
    JsonObject get ownerId;

    @nullable
    @BuiltValueField(wireName: r'services')
    JsonObject get services;

    /// The email of the bot. 
    @nullable
    @BuiltValueField(wireName: r'email')
    String get email;

    /// An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    @nullable
    @BuiltValueField(wireName: r'bot_type')
    int get botType;

    /// A boolean describing whether the user account has been deactivated. 
    @nullable
    @BuiltValueField(wireName: r'is_active')
    bool get isActive;

    Bot._();

    static void _initializeBuilder(BotBuilder b) => b;

    factory Bot([void updates(BotBuilder b)]) = _$Bot;

    @BuiltValueSerializer(custom: true)
    static Serializer<Bot> get serializer => _$BotSerializer();
}

class _$BotSerializer implements StructuredSerializer<Bot> {

    @override
    final Iterable<Type> types = const [Bot, _$Bot];
    @override
    final String wireName = r'Bot';

    @override
    Iterable<Object> serialize(Serializers serializers, Bot object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.userId != null) {
            result
                ..add(r'user_id')
                ..add(serializers.serialize(object.userId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.fullName != null) {
            result
                ..add(r'full_name')
                ..add(serializers.serialize(object.fullName,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.apiKey != null) {
            result
                ..add(r'api_key')
                ..add(serializers.serialize(object.apiKey,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.defaultSendingStream != null) {
            result
                ..add(r'default_sending_stream')
                ..add(serializers.serialize(object.defaultSendingStream,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.defaultEventsRegisterStream != null) {
            result
                ..add(r'default_events_register_stream')
                ..add(serializers.serialize(object.defaultEventsRegisterStream,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.defaultAllPublicStreams != null) {
            result
                ..add(r'default_all_public_streams')
                ..add(serializers.serialize(object.defaultAllPublicStreams,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.avatarUrl != null) {
            result
                ..add(r'avatar_url')
                ..add(serializers.serialize(object.avatarUrl,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.ownerId != null) {
            result
                ..add(r'owner_id')
                ..add(serializers.serialize(object.ownerId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.services != null) {
            result
                ..add(r'services')
                ..add(serializers.serialize(object.services,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.email != null) {
            result
                ..add(r'email')
                ..add(serializers.serialize(object.email,
                    specifiedType: const FullType(String)));
        }
        if (object.botType != null) {
            result
                ..add(r'bot_type')
                ..add(serializers.serialize(object.botType,
                    specifiedType: const FullType(int)));
        }
        if (object.isActive != null) {
            result
                ..add(r'is_active')
                ..add(serializers.serialize(object.isActive,
                    specifiedType: const FullType(bool)));
        }
        return result;
    }

    @override
    Bot deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BotBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'user_id':
                    result.userId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'full_name':
                    result.fullName = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'api_key':
                    result.apiKey = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'default_sending_stream':
                    result.defaultSendingStream = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'default_events_register_stream':
                    result.defaultEventsRegisterStream = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'default_all_public_streams':
                    result.defaultAllPublicStreams = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'avatar_url':
                    result.avatarUrl = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'owner_id':
                    result.ownerId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'services':
                    result.services = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'email':
                    result.email = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'bot_type':
                    result.botType = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'is_active':
                    result.isActive = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
            }
        }
        return result.build();
    }
}

