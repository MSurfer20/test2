//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_group.g.dart';

/// Object containing the user group's attributes. 
///
/// Properties:
/// * [name] - The name of the user group. 
/// * [description] - The description of the user group. 
/// * [members] - Array containing the id of the users who are members of this user group. 
/// * [id] - The ID of the user group. 
abstract class UserGroup implements Built<UserGroup, UserGroupBuilder> {
    /// The name of the user group. 
    @BuiltValueField(wireName: r'name')
    String? get name;

    /// The description of the user group. 
    @BuiltValueField(wireName: r'description')
    String? get description;

    /// Array containing the id of the users who are members of this user group. 
    @BuiltValueField(wireName: r'members')
    BuiltList<int>? get members;

    /// The ID of the user group. 
    @BuiltValueField(wireName: r'id')
    int? get id;

    UserGroup._();

    static void _initializeBuilder(UserGroupBuilder b) => b;

    factory UserGroup([void updates(UserGroupBuilder b)]) = _$UserGroup;

    @BuiltValueSerializer(custom: true)
    static Serializer<UserGroup> get serializer => _$UserGroupSerializer();
}

class _$UserGroupSerializer implements StructuredSerializer<UserGroup> {
    @override
    final Iterable<Type> types = const [UserGroup, _$UserGroup];

    @override
    final String wireName = r'UserGroup';

    @override
    Iterable<Object?> serialize(Serializers serializers, UserGroup object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.name != null) {
            result
                ..add(r'name')
                ..add(serializers.serialize(object.name,
                    specifiedType: const FullType(String)));
        }
        if (object.description != null) {
            result
                ..add(r'description')
                ..add(serializers.serialize(object.description,
                    specifiedType: const FullType(String)));
        }
        if (object.members != null) {
            result
                ..add(r'members')
                ..add(serializers.serialize(object.members,
                    specifiedType: const FullType(BuiltList, [FullType(int)])));
        }
        if (object.id != null) {
            result
                ..add(r'id')
                ..add(serializers.serialize(object.id,
                    specifiedType: const FullType(int)));
        }
        return result;
    }

    @override
    UserGroup deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = UserGroupBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'name':
                    result.name = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'description':
                    result.description = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'members':
                    result.members.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(int)])) as BuiltList<int>);
                    break;
                case r'id':
                    result.id = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
            }
        }
        return result.build();
    }
}

