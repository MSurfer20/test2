//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/coded_error.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_deactivated_error.g.dart';

/// UserDeactivatedError
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [code] 
abstract class UserDeactivatedError implements Built<UserDeactivatedError, UserDeactivatedErrorBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    @BuiltValueField(wireName: r'code')
    JsonObject? get code;

    UserDeactivatedError._();

    static void _initializeBuilder(UserDeactivatedErrorBuilder b) => b;

    factory UserDeactivatedError([void updates(UserDeactivatedErrorBuilder b)]) = _$UserDeactivatedError;

    @BuiltValueSerializer(custom: true)
    static Serializer<UserDeactivatedError> get serializer => _$UserDeactivatedErrorSerializer();
}

class _$UserDeactivatedErrorSerializer implements StructuredSerializer<UserDeactivatedError> {
    @override
    final Iterable<Type> types = const [UserDeactivatedError, _$UserDeactivatedError];

    @override
    final String wireName = r'UserDeactivatedError';

    @override
    Iterable<Object?> serialize(Serializers serializers, UserDeactivatedError object,
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
    UserDeactivatedError deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = UserDeactivatedErrorBuilder();

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

