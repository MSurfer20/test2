//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'emoji_reaction_base_user.g.dart';

/// Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
///
/// Properties:
/// * [id] - ID of the user. 
/// * [email] - Email of the user. 
/// * [fullName] - Full name of the user. 
/// * [isMirrorDummy] - Whether the user is a mirror dummy. 
abstract class EmojiReactionBaseUser implements Built<EmojiReactionBaseUser, EmojiReactionBaseUserBuilder> {
    /// ID of the user. 
    @BuiltValueField(wireName: r'id')
    int? get id;

    /// Email of the user. 
    @BuiltValueField(wireName: r'email')
    String? get email;

    /// Full name of the user. 
    @BuiltValueField(wireName: r'full_name')
    String? get fullName;

    /// Whether the user is a mirror dummy. 
    @BuiltValueField(wireName: r'is_mirror_dummy')
    bool? get isMirrorDummy;

    EmojiReactionBaseUser._();

    static void _initializeBuilder(EmojiReactionBaseUserBuilder b) => b;

    factory EmojiReactionBaseUser([void updates(EmojiReactionBaseUserBuilder b)]) = _$EmojiReactionBaseUser;

    @BuiltValueSerializer(custom: true)
    static Serializer<EmojiReactionBaseUser> get serializer => _$EmojiReactionBaseUserSerializer();
}

class _$EmojiReactionBaseUserSerializer implements StructuredSerializer<EmojiReactionBaseUser> {
    @override
    final Iterable<Type> types = const [EmojiReactionBaseUser, _$EmojiReactionBaseUser];

    @override
    final String wireName = r'EmojiReactionBaseUser';

    @override
    Iterable<Object?> serialize(Serializers serializers, EmojiReactionBaseUser object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        if (object.email != null) {
            result
                ..add(r'email')
                ..add(serializers.serialize(object.email,
                    specifiedType: const FullType(String)));
        }
        if (object.fullName != null) {
            result
                ..add(r'full_name')
                ..add(serializers.serialize(object.fullName,
                    specifiedType: const FullType(String)));
        }
        if (object.isMirrorDummy != null) {
            result
                ..add(r'is_mirror_dummy')
                ..add(serializers.serialize(object.isMirrorDummy,
                    specifiedType: const FullType(bool)));
        }
        return result;
    }

    @override
    EmojiReactionBaseUser deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = EmojiReactionBaseUserBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'email':
                    result.email = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'full_name':
                    result.fullName = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'is_mirror_dummy':
                    result.isMirrorDummy = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
            }
        }
        return result.build();
    }
}
