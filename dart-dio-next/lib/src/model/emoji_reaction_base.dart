//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/emoji_reaction_base_all_of.dart';
import 'package:openapi/src/model/emoji_base.dart';
import 'package:openapi/src/model/emoji_reaction_base_all_of_user.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'emoji_reaction_base.g.dart';

/// EmojiReactionBase
///
/// Properties:
/// * [emojiCode] - A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
/// * [emojiName] - Name of the emoji. 
/// * [reactionType] - One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
/// * [userId] - The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
/// * [user] 
abstract class EmojiReactionBase implements Built<EmojiReactionBase, EmojiReactionBaseBuilder> {
    /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    @BuiltValueField(wireName: r'emoji_code')
    String? get emojiCode;

    /// Name of the emoji. 
    @BuiltValueField(wireName: r'emoji_name')
    String? get emojiName;

    /// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    @BuiltValueField(wireName: r'reaction_type')
    String? get reactionType;

    /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
    @BuiltValueField(wireName: r'user_id')
    int? get userId;

    @BuiltValueField(wireName: r'user')
    EmojiReactionBaseAllOfUser? get user;

    EmojiReactionBase._();

    static void _initializeBuilder(EmojiReactionBaseBuilder b) => b;

    factory EmojiReactionBase([void updates(EmojiReactionBaseBuilder b)]) = _$EmojiReactionBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<EmojiReactionBase> get serializer => _$EmojiReactionBaseSerializer();
}

class _$EmojiReactionBaseSerializer implements StructuredSerializer<EmojiReactionBase> {
    @override
    final Iterable<Type> types = const [EmojiReactionBase, _$EmojiReactionBase];

    @override
    final String wireName = r'EmojiReactionBase';

    @override
    Iterable<Object?> serialize(Serializers serializers, EmojiReactionBase object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.emojiCode != null) {
            result
                ..add(r'emoji_code')
                ..add(serializers.serialize(object.emojiCode,
                    specifiedType: const FullType(String)));
        }
        if (object.emojiName != null) {
            result
                ..add(r'emoji_name')
                ..add(serializers.serialize(object.emojiName,
                    specifiedType: const FullType(String)));
        }
        if (object.reactionType != null) {
            result
                ..add(r'reaction_type')
                ..add(serializers.serialize(object.reactionType,
                    specifiedType: const FullType(String)));
        }
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
    EmojiReactionBase deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = EmojiReactionBaseBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'emoji_code':
                    result.emojiCode = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'emoji_name':
                    result.emojiName = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'reaction_type':
                    result.reactionType = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
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

