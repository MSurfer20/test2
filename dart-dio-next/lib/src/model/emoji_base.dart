//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'emoji_base.g.dart';

/// EmojiBase
///
/// Properties:
/// * [emojiCode] - A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
/// * [emojiName] - Name of the emoji. 
/// * [reactionType] - One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
abstract class EmojiBase implements Built<EmojiBase, EmojiBaseBuilder> {
    /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
    @BuiltValueField(wireName: r'emoji_code')
    String? get emojiCode;

    /// Name of the emoji. 
    @BuiltValueField(wireName: r'emoji_name')
    String? get emojiName;

    /// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
    @BuiltValueField(wireName: r'reaction_type')
    String? get reactionType;

    EmojiBase._();

    static void _initializeBuilder(EmojiBaseBuilder b) => b;

    factory EmojiBase([void updates(EmojiBaseBuilder b)]) = _$EmojiBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<EmojiBase> get serializer => _$EmojiBaseSerializer();
}

class _$EmojiBaseSerializer implements StructuredSerializer<EmojiBase> {
    @override
    final Iterable<Type> types = const [EmojiBase, _$EmojiBase];

    @override
    final String wireName = r'EmojiBase';

    @override
    Iterable<Object?> serialize(Serializers serializers, EmojiBase object,
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
        return result;
    }

    @override
    EmojiBase deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = EmojiBaseBuilder();

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
            }
        }
        return result.build();
    }
}

