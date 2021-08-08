//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'basic_stream_all_of.g.dart';

abstract class BasicStreamAllOf implements Built<BasicStreamAllOf, BasicStreamAllOfBuilder> {

    @nullable
    @BuiltValueField(wireName: r'stream_id')
    JsonObject get streamId;

    @nullable
    @BuiltValueField(wireName: r'name')
    JsonObject get name;

    @nullable
    @BuiltValueField(wireName: r'description')
    JsonObject get description;

    @nullable
    @BuiltValueField(wireName: r'date_created')
    JsonObject get dateCreated;

    @nullable
    @BuiltValueField(wireName: r'invite_only')
    JsonObject get inviteOnly;

    @nullable
    @BuiltValueField(wireName: r'rendered_description')
    JsonObject get renderedDescription;

    @nullable
    @BuiltValueField(wireName: r'is_web_public')
    JsonObject get isWebPublic;

    @nullable
    @BuiltValueField(wireName: r'stream_post_policy')
    JsonObject get streamPostPolicy;

    @nullable
    @BuiltValueField(wireName: r'message_retention_days')
    JsonObject get messageRetentionDays;

    @nullable
    @BuiltValueField(wireName: r'history_public_to_subscribers')
    JsonObject get historyPublicToSubscribers;

    @nullable
    @BuiltValueField(wireName: r'first_message_id')
    JsonObject get firstMessageId;

    @nullable
    @BuiltValueField(wireName: r'is_announcement_only')
    JsonObject get isAnnouncementOnly;

    BasicStreamAllOf._();

    static void _initializeBuilder(BasicStreamAllOfBuilder b) => b;

    factory BasicStreamAllOf([void updates(BasicStreamAllOfBuilder b)]) = _$BasicStreamAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<BasicStreamAllOf> get serializer => _$BasicStreamAllOfSerializer();
}

class _$BasicStreamAllOfSerializer implements StructuredSerializer<BasicStreamAllOf> {

    @override
    final Iterable<Type> types = const [BasicStreamAllOf, _$BasicStreamAllOf];
    @override
    final String wireName = r'BasicStreamAllOf';

    @override
    Iterable<Object> serialize(Serializers serializers, BasicStreamAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.streamId != null) {
            result
                ..add(r'stream_id')
                ..add(serializers.serialize(object.streamId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.description != null) {
            result
                ..add(r'description')
                ..add(serializers.serialize(object.description,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.dateCreated != null) {
            result
                ..add(r'date_created')
                ..add(serializers.serialize(object.dateCreated,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.inviteOnly != null) {
            result
                ..add(r'invite_only')
                ..add(serializers.serialize(object.inviteOnly,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.renderedDescription != null) {
            result
                ..add(r'rendered_description')
                ..add(serializers.serialize(object.renderedDescription,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isWebPublic != null) {
            result
                ..add(r'is_web_public')
                ..add(serializers.serialize(object.isWebPublic,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.streamPostPolicy != null) {
            result
                ..add(r'stream_post_policy')
                ..add(serializers.serialize(object.streamPostPolicy,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.messageRetentionDays != null) {
            result
                ..add(r'message_retention_days')
                ..add(serializers.serialize(object.messageRetentionDays,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.historyPublicToSubscribers != null) {
            result
                ..add(r'history_public_to_subscribers')
                ..add(serializers.serialize(object.historyPublicToSubscribers,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.firstMessageId != null) {
            result
                ..add(r'first_message_id')
                ..add(serializers.serialize(object.firstMessageId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isAnnouncementOnly != null) {
            result
                ..add(r'is_announcement_only')
                ..add(serializers.serialize(object.isAnnouncementOnly,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    BasicStreamAllOf deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BasicStreamAllOfBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'stream_id':
                    result.streamId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'description':
                    result.description = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'date_created':
                    result.dateCreated = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'invite_only':
                    result.inviteOnly = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'rendered_description':
                    result.renderedDescription = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_web_public':
                    result.isWebPublic = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'stream_post_policy':
                    result.streamPostPolicy = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'message_retention_days':
                    result.messageRetentionDays = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'history_public_to_subscribers':
                    result.historyPublicToSubscribers = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'first_message_id':
                    result.firstMessageId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_announcement_only':
                    result.isAnnouncementOnly = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

