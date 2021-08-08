//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'realm_emoji.g.dart';

/// `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
///
/// Properties:
/// * [id] - The ID for this emoji, same as the object's key. 
/// * [name] - The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
/// * [sourceUrl] - The path relative to the organization's URL where the emoji's image can be found. 
/// * [deactivated] - Whether the emoji has been deactivated or not. 
/// * [authorId] - The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
abstract class RealmEmoji implements Built<RealmEmoji, RealmEmojiBuilder> {
    /// The ID for this emoji, same as the object's key. 
    @BuiltValueField(wireName: r'id')
    String? get id;

    /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// The path relative to the organization's URL where the emoji's image can be found. 
    @BuiltValueField(wireName: r'source_url')
    String? get sourceUrl;

    /// Whether the emoji has been deactivated or not. 
    @BuiltValueField(wireName: r'deactivated')
    bool? get deactivated;

    /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
    @BuiltValueField(wireName: r'author_id')
    int? get authorId;

    RealmEmoji._();

    static void _initializeBuilder(RealmEmojiBuilder b) => b;

    factory RealmEmoji([void updates(RealmEmojiBuilder b)]) = _$RealmEmoji;

    @BuiltValueSerializer(custom: true)
    static Serializer<RealmEmoji> get serializer => _$RealmEmojiSerializer();
}

class _$RealmEmojiSerializer implements StructuredSerializer<RealmEmoji> {
    @override
    final Iterable<Type> types = const [RealmEmoji, _$RealmEmoji];

    @override
    final String wireName = r'RealmEmoji';

    @override
    Iterable<Object?> serialize(Serializers serializers, RealmEmoji object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(String)));
        }
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(String)));
        }
        if (object.sourceUrl != null) {
            result
                ..add(r'source_url')
                ..add(serializers.serialize(object.sourceUrl,
                    specifiedType: const FullType(String)));
        }
        if (object.deactivated != null) {
            result
                ..add(r'deactivated')
                ..add(serializers.serialize(object.deactivated,
                    specifiedType: const FullType(bool)));
        }
        if (object.authorId != null) {
            result
                ..add(r'author_id')
                ..add(serializers.serialize(object.authorId,
                    specifiedType: const FullType(int)));
        }
        return result;
    }

    @override
    RealmEmoji deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = RealmEmojiBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'source_url':
                    result.sourceUrl = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'deactivated':
                    result.deactivated = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'author_id':
                    result.authorId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
            }
        }
        return result.build();
    }
}

