//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_collection/built_collection.dart';
import 'package:openapi/model/one_ofobjectobject.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'basic_bot_base.g.dart';

abstract class BasicBotBase implements Built<BasicBotBase, BasicBotBaseBuilder> {

    /// The user id of the bot. 
    @nullable
    @BuiltValueField(wireName: r'user_id')
    int get userId;

    /// The full name of the bot. 
    @nullable
    @BuiltValueField(wireName: r'full_name')
    String get fullName;

    /// The API key of the bot which it uses to make API requests. 
    @nullable
    @BuiltValueField(wireName: r'api_key')
    String get apiKey;

    /// The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
    @nullable
    @BuiltValueField(wireName: r'default_sending_stream')
    String get defaultSendingStream;

    /// The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
    @nullable
    @BuiltValueField(wireName: r'default_events_register_stream')
    String get defaultEventsRegisterStream;

    /// Whether the bot can send messages to all streams by default. 
    @nullable
    @BuiltValueField(wireName: r'default_all_public_streams')
    bool get defaultAllPublicStreams;

    /// The URL of the bot's avatar. 
    @nullable
    @BuiltValueField(wireName: r'avatar_url')
    String get avatarUrl;

    /// The user id of the bot's owner.  Null if the bot has no owner. 
    @nullable
    @BuiltValueField(wireName: r'owner_id')
    int get ownerId;

    /// The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
    @nullable
    @BuiltValueField(wireName: r'services')
    BuiltList<OneOfobjectobject> get services;

    BasicBotBase._();

    static void _initializeBuilder(BasicBotBaseBuilder b) => b;

    factory BasicBotBase([void updates(BasicBotBaseBuilder b)]) = _$BasicBotBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<BasicBotBase> get serializer => _$BasicBotBaseSerializer();
}

class _$BasicBotBaseSerializer implements StructuredSerializer<BasicBotBase> {

    @override
    final Iterable<Type> types = const [BasicBotBase, _$BasicBotBase];
    @override
    final String wireName = r'BasicBotBase';

    @override
    Iterable<Object> serialize(Serializers serializers, BasicBotBase object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.userId != null) {
            result
                ..add(r'user_id')
                ..add(serializers.serialize(object.userId,
                    specifiedType: const FullType(int)));
        }
        if (object.fullName != null) {
            result
                ..add(r'full_name')
                ..add(serializers.serialize(object.fullName,
                    specifiedType: const FullType(String)));
        }
        if (object.apiKey != null) {
            result
                ..add(r'api_key')
                ..add(serializers.serialize(object.apiKey,
                    specifiedType: const FullType(String)));
        }
        if (object.defaultSendingStream != null) {
            result
                ..add(r'default_sending_stream')
                ..add(serializers.serialize(object.defaultSendingStream,
                    specifiedType: const FullType(String)));
        }
        if (object.defaultEventsRegisterStream != null) {
            result
                ..add(r'default_events_register_stream')
                ..add(serializers.serialize(object.defaultEventsRegisterStream,
                    specifiedType: const FullType(String)));
        }
        if (object.defaultAllPublicStreams != null) {
            result
                ..add(r'default_all_public_streams')
                ..add(serializers.serialize(object.defaultAllPublicStreams,
                    specifiedType: const FullType(bool)));
        }
        if (object.avatarUrl != null) {
            result
                ..add(r'avatar_url')
                ..add(serializers.serialize(object.avatarUrl,
                    specifiedType: const FullType(String)));
        }
        if (object.ownerId != null) {
            result
                ..add(r'owner_id')
                ..add(serializers.serialize(object.ownerId,
                    specifiedType: const FullType(int)));
        }
        if (object.services != null) {
            result
                ..add(r'services')
                ..add(serializers.serialize(object.services,
                    specifiedType: const FullType(BuiltList, [FullType(OneOfobjectobject)])));
        }
        return result;
    }

    @override
    BasicBotBase deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BasicBotBaseBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'user_id':
                    result.userId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'full_name':
                    result.fullName = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'api_key':
                    result.apiKey = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'default_sending_stream':
                    result.defaultSendingStream = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'default_events_register_stream':
                    result.defaultEventsRegisterStream = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'default_all_public_streams':
                    result.defaultAllPublicStreams = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'avatar_url':
                    result.avatarUrl = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'owner_id':
                    result.ownerId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'services':
                    result.services.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(OneOfobjectobject)])) as BuiltList<OneOfobjectobject>);
                    break;
            }
        }
        return result.build();
    }
}

