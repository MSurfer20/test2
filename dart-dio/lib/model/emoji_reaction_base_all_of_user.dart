//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'emoji_reaction_base_all_of_user.g.dart';

abstract class EmojiReactionBaseAllOfUser implements Built<EmojiReactionBaseAllOfUser, EmojiReactionBaseAllOfUserBuilder> {

    /// ID of the user. 
    @nullable
    @BuiltValueField(wireName: r'id')
    int get id;

    /// Email of the user. 
    @nullable
    @BuiltValueField(wireName: r'email')
    String get email;

    /// Full name of the user. 
    @nullable
    @BuiltValueField(wireName: r'full_name')
    String get fullName;

    /// Whether the user is a mirror dummy. 
    @nullable
    @BuiltValueField(wireName: r'is_mirror_dummy')
    bool get isMirrorDummy;

    EmojiReactionBaseAllOfUser._();

    static void _initializeBuilder(EmojiReactionBaseAllOfUserBuilder b) => b;

    factory EmojiReactionBaseAllOfUser([void updates(EmojiReactionBaseAllOfUserBuilder b)]) = _$EmojiReactionBaseAllOfUser;

    @BuiltValueSerializer(custom: true)
    static Serializer<EmojiReactionBaseAllOfUser> get serializer => _$EmojiReactionBaseAllOfUserSerializer();
}

class _$EmojiReactionBaseAllOfUserSerializer implements StructuredSerializer<EmojiReactionBaseAllOfUser> {

    @override
    final Iterable<Type> types = const [EmojiReactionBaseAllOfUser, _$EmojiReactionBaseAllOfUser];
    @override
    final String wireName = r'EmojiReactionBaseAllOfUser';

    @override
    Iterable<Object> serialize(Serializers serializers, EmojiReactionBaseAllOfUser object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
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
    EmojiReactionBaseAllOfUser deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = EmojiReactionBaseAllOfUserBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
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

