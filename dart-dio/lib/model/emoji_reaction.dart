//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/emoji_reaction_base.dart';
import 'package:openapi/model/emoji_reaction_all_of.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'emoji_reaction.g.dart';

abstract class EmojiReaction implements Built<EmojiReaction, EmojiReactionBuilder> {

    @nullable
    @BuiltValueField(wireName: r'emoji_code')
    JsonObject get emojiCode;

    @nullable
    @BuiltValueField(wireName: r'emoji_name')
    JsonObject get emojiName;

    @nullable
    @BuiltValueField(wireName: r'reaction_type')
    JsonObject get reactionType;

    @nullable
    @BuiltValueField(wireName: r'user_id')
    JsonObject get userId;

    @nullable
    @BuiltValueField(wireName: r'user')
    JsonObject get user;

    EmojiReaction._();

    static void _initializeBuilder(EmojiReactionBuilder b) => b;

    factory EmojiReaction([void updates(EmojiReactionBuilder b)]) = _$EmojiReaction;

    @BuiltValueSerializer(custom: true)
    static Serializer<EmojiReaction> get serializer => _$EmojiReactionSerializer();
}

class _$EmojiReactionSerializer implements StructuredSerializer<EmojiReaction> {

    @override
    final Iterable<Type> types = const [EmojiReaction, _$EmojiReaction];
    @override
    final String wireName = r'EmojiReaction';

    @override
    Iterable<Object> serialize(Serializers serializers, EmojiReaction object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.emojiCode != null) {
            result
                ..add(r'emoji_code')
                ..add(serializers.serialize(object.emojiCode,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.emojiName != null) {
            result
                ..add(r'emoji_name')
                ..add(serializers.serialize(object.emojiName,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.reactionType != null) {
            result
                ..add(r'reaction_type')
                ..add(serializers.serialize(object.reactionType,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.userId != null) {
            result
                ..add(r'user_id')
                ..add(serializers.serialize(object.userId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.user != null) {
            result
                ..add(r'user')
                ..add(serializers.serialize(object.user,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    EmojiReaction deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = EmojiReactionBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'emoji_code':
                    result.emojiCode = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'emoji_name':
                    result.emojiName = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'reaction_type':
                    result.reactionType = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'user_id':
                    result.userId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'user':
                    result.user = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

