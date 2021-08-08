//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/emoji_reaction_base_all_of_user.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'emoji_reaction_base_all_of.g.dart';

/// EmojiReactionBaseAllOf
///
/// Properties:
/// * [userId] - The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
/// * [user] 
abstract class EmojiReactionBaseAllOf implements Built<EmojiReactionBaseAllOf, EmojiReactionBaseAllOfBuilder> {
    /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
    @BuiltValueField(wireName: r'user_id')
    int? get userId;

    @BuiltValueField(wireName: r'user')
    EmojiReactionBaseAllOfUser? get user;

    EmojiReactionBaseAllOf._();

    static void _initializeBuilder(EmojiReactionBaseAllOfBuilder b) => b;

    factory EmojiReactionBaseAllOf([void updates(EmojiReactionBaseAllOfBuilder b)]) = _$EmojiReactionBaseAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<EmojiReactionBaseAllOf> get serializer => _$EmojiReactionBaseAllOfSerializer();
}

class _$EmojiReactionBaseAllOfSerializer implements StructuredSerializer<EmojiReactionBaseAllOf> {
    @override
    final Iterable<Type> types = const [EmojiReactionBaseAllOf, _$EmojiReactionBaseAllOf];

    @override
    final String wireName = r'EmojiReactionBaseAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, EmojiReactionBaseAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.userId != null) {
            result
                ..add(r'user_id')
                ..add(serializers.serialize(object.userId,
                    specifiedType: const FullType(int)));
        }
        if (object.user != null) {
            result
                ..add(r'user')
                ..add(serializers.serialize(object.user,
                    specifiedType: const FullType(EmojiReactionBaseAllOfUser)));
        }
        return result;
    }

    @override
    EmojiReactionBaseAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = EmojiReactionBaseAllOfBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'user_id':
                    result.userId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'user':
                    result.user.replace(serializers.deserialize(value,
                        specifiedType: const FullType(EmojiReactionBaseAllOfUser)) as EmojiReactionBaseAllOfUser);
                    break;
            }
        }
        return result.build();
    }
}

