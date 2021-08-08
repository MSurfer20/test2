//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/coded_error.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_not_authorized_error.g.dart';

/// UserNotAuthorizedError
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [code] 
abstract class UserNotAuthorizedError implements Built<UserNotAuthorizedError, UserNotAuthorizedErrorBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    @BuiltValueField(wireName: r'code')
    JsonObject? get code;

    UserNotAuthorizedError._();

    static void _initializeBuilder(UserNotAuthorizedErrorBuilder b) => b;

    factory UserNotAuthorizedError([void updates(UserNotAuthorizedErrorBuilder b)]) = _$UserNotAuthorizedError;

    @BuiltValueSerializer(custom: true)
    static Serializer<UserNotAuthorizedError> get serializer => _$UserNotAuthorizedErrorSerializer();
}

class _$UserNotAuthorizedErrorSerializer implements StructuredSerializer<UserNotAuthorizedError> {
    @override
    final Iterable<Type> types = const [UserNotAuthorizedError, _$UserNotAuthorizedError];

    @override
    final String wireName = r'UserNotAuthorizedError';

    @override
    Iterable<Object?> serialize(Serializers serializers, UserNotAuthorizedError object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'result')
            ..add(object.result == null ? null : serializers.serialize(object.result,
                specifiedType: const FullType(JsonObject)));
        result
            ..add(r'msg')
            ..add(object.msg == null ? null : serializers.serialize(object.msg,
                specifiedType: const FullType(JsonObject)));
        if (object.code != null) {
            result
                ..add(r'code')
                ..add(serializers.serialize(object.code,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    UserNotAuthorizedError deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = UserNotAuthorizedErrorBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'result':
                    result.result = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'msg':
                    result.msg = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'code':
                    result.code = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

