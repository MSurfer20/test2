//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'basic_bot_all_of.g.dart';

abstract class BasicBotAllOf implements Built<BasicBotAllOf, BasicBotAllOfBuilder> {

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

    BasicBotAllOf._();

    static void _initializeBuilder(BasicBotAllOfBuilder b) => b;

    factory BasicBotAllOf([void updates(BasicBotAllOfBuilder b)]) = _$BasicBotAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<BasicBotAllOf> get serializer => _$BasicBotAllOfSerializer();
}

class _$BasicBotAllOfSerializer implements StructuredSerializer<BasicBotAllOf> {

    @override
    final Iterable<Type> types = const [BasicBotAllOf, _$BasicBotAllOf];
    @override
    final String wireName = r'BasicBotAllOf';

    @override
    Iterable<Object> serialize(Serializers serializers, BasicBotAllOf object,
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
    BasicBotAllOf deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BasicBotAllOfBuilder();

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

