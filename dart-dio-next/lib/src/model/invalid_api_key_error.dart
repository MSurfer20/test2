//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/json_error.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invalid_api_key_error.g.dart';

/// InvalidApiKeyError
///
/// Properties:
/// * [result] 
/// * [msg] 
abstract class InvalidApiKeyError implements Built<InvalidApiKeyError, InvalidApiKeyErrorBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    InvalidApiKeyError._();

    static void _initializeBuilder(InvalidApiKeyErrorBuilder b) => b;

    factory InvalidApiKeyError([void updates(InvalidApiKeyErrorBuilder b)]) = _$InvalidApiKeyError;

    @BuiltValueSerializer(custom: true)
    static Serializer<InvalidApiKeyError> get serializer => _$InvalidApiKeyErrorSerializer();
}

class _$InvalidApiKeyErrorSerializer implements StructuredSerializer<InvalidApiKeyError> {
    @override
    final Iterable<Type> types = const [InvalidApiKeyError, _$InvalidApiKeyError];

    @override
    final String wireName = r'InvalidApiKeyError';

    @override
    Iterable<Object?> serialize(Serializers serializers, InvalidApiKeyError object,
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
        return result;
    }

    @override
    InvalidApiKeyError deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = InvalidApiKeyErrorBuilder();

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
            }
        }
        return result.build();
    }
}

