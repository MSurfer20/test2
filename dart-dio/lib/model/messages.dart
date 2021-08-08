//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/messages_base.dart';
import 'package:openapi/model/messages_all_of.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'messages.g.dart';

abstract class Messages implements Built<Messages, MessagesBuilder> {

    @nullable
    @BuiltValueField(wireName: r'avatar_url')
    JsonObject get avatarUrl;

    @nullable
    @BuiltValueField(wireName: r'client')
    JsonObject get client;

    @nullable
    @BuiltValueField(wireName: r'content')
    JsonObject get content;

    @nullable
    @BuiltValueField(wireName: r'content_type')
    JsonObject get contentType;

    @nullable
    @BuiltValueField(wireName: r'display_recipient')
    JsonObject get displayRecipient;

    @nullable
    @BuiltValueField(wireName: r'id')
    JsonObject get id;

    @nullable
    @BuiltValueField(wireName: r'is_me_message')
    JsonObject get isMeMessage;

    @nullable
    @BuiltValueField(wireName: r'reactions')
    JsonObject get reactions;

    @nullable
    @BuiltValueField(wireName: r'recipient_id')
    JsonObject get recipientId;

    @nullable
    @BuiltValueField(wireName: r'sender_email')
    JsonObject get senderEmail;

    @nullable
    @BuiltValueField(wireName: r'sender_full_name')
    JsonObject get senderFullName;

    @nullable
    @BuiltValueField(wireName: r'sender_id')
    JsonObject get senderId;

    @nullable
    @BuiltValueField(wireName: r'sender_realm_str')
    JsonObject get senderRealmStr;

    @nullable
    @BuiltValueField(wireName: r'stream_id')
    JsonObject get streamId;

    @nullable
    @BuiltValueField(wireName: r'subject')
    JsonObject get subject;

    @nullable
    @BuiltValueField(wireName: r'topic_links')
    JsonObject get topicLinks;

    @nullable
    @BuiltValueField(wireName: r'submessages')
    JsonObject get submessages;

    @nullable
    @BuiltValueField(wireName: r'timestamp')
    JsonObject get timestamp;

    @nullable
    @BuiltValueField(wireName: r'type')
    JsonObject get type;

    Messages._();

    static void _initializeBuilder(MessagesBuilder b) => b;

    factory Messages([void updates(MessagesBuilder b)]) = _$Messages;

    @BuiltValueSerializer(custom: true)
    static Serializer<Messages> get serializer => _$MessagesSerializer();
}

class _$MessagesSerializer implements StructuredSerializer<Messages> {

    @override
    final Iterable<Type> types = const [Messages, _$Messages];
    @override
    final String wireName = r'Messages';

    @override
    Iterable<Object> serialize(Serializers serializers, Messages object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.avatarUrl != null) {
            result
                ..add(r'avatar_url')
                ..add(serializers.serialize(object.avatarUrl,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.client != null) {
            result
                ..add(r'client')
                ..add(serializers.serialize(object.client,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.content != null) {
            result
                ..add(r'content')
                ..add(serializers.serialize(object.content,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.contentType != null) {
            result
                ..add(r'content_type')
                ..add(serializers.serialize(object.contentType,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.displayRecipient != null) {
            result
                ..add(r'display_recipient')
                ..add(serializers.serialize(object.displayRecipient,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isMeMessage != null) {
            result
                ..add(r'is_me_message')
                ..add(serializers.serialize(object.isMeMessage,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.reactions != null) {
            result
                ..add(r'reactions')
                ..add(serializers.serialize(object.reactions,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.recipientId != null) {
            result
                ..add(r'recipient_id')
                ..add(serializers.serialize(object.recipientId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.senderEmail != null) {
            result
                ..add(r'sender_email')
                ..add(serializers.serialize(object.senderEmail,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.senderFullName != null) {
            result
                ..add(r'sender_full_name')
                ..add(serializers.serialize(object.senderFullName,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.senderId != null) {
            result
                ..add(r'sender_id')
                ..add(serializers.serialize(object.senderId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.senderRealmStr != null) {
            result
                ..add(r'sender_realm_str')
                ..add(serializers.serialize(object.senderRealmStr,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.streamId != null) {
            result
                ..add(r'stream_id')
                ..add(serializers.serialize(object.streamId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.subject != null) {
            result
                ..add(r'subject')
                ..add(serializers.serialize(object.subject,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.topicLinks != null) {
            result
                ..add(r'topic_links')
                ..add(serializers.serialize(object.topicLinks,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.submessages != null) {
            result
                ..add(r'submessages')
                ..add(serializers.serialize(object.submessages,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.timestamp != null) {
            result
                ..add(r'timestamp')
                ..add(serializers.serialize(object.timestamp,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.type != null) {
            result
                ..add(r'type')
                ..add(serializers.serialize(object.type,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    Messages deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = MessagesBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'avatar_url':
                    result.avatarUrl = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'client':
                    result.client = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'content':
                    result.content = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'content_type':
                    result.contentType = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'display_recipient':
                    result.displayRecipient = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_me_message':
                    result.isMeMessage = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'reactions':
                    result.reactions = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'recipient_id':
                    result.recipientId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'sender_email':
                    result.senderEmail = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'sender_full_name':
                    result.senderFullName = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'sender_id':
                    result.senderId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'sender_realm_str':
                    result.senderRealmStr = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'stream_id':
                    result.streamId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'subject':
                    result.subject = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'topic_links':
                    result.topicLinks = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'submessages':
                    result.submessages = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'timestamp':
                    result.timestamp = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'type':
                    result.type = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

