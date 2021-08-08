//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/basic_bot_all_of.dart';
import 'package:openapi/model/basic_bot_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'basic_bot.g.dart';

abstract class BasicBot implements Built<BasicBot, BasicBotBuilder> {

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

    BasicBot._();

    static void _initializeBuilder(BasicBotBuilder b) => b;

    factory BasicBot([void updates(BasicBotBuilder b)]) = _$BasicBot;

    @BuiltValueSerializer(custom: true)
    static Serializer<BasicBot> get serializer => _$BasicBotSerializer();
}

class _$BasicBotSerializer implements StructuredSerializer<BasicBot> {

    @override
    final Iterable<Type> types = const [BasicBot, _$BasicBot];
    @override
    final String wireName = r'BasicBot';

    @override
    Iterable<Object> serialize(Serializers serializers, BasicBot object,
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
        return result;
    }

    @override
    BasicBot deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BasicBotBuilder();

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
            }
        }
        return result.build();
    }
}

