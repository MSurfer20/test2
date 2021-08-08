//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/json_error_base.dart';
import 'package:openapi/src/model/json_success_all_of.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_error.g.dart';

/// JsonError
///
/// Properties:
/// * [result] 
/// * [msg] 
abstract class JsonError implements Built<JsonError, JsonErrorBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    JsonError._();

    static void _initializeBuilder(JsonErrorBuilder b) => b;

    factory JsonError([void updates(JsonErrorBuilder b)]) = _$JsonError;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonError> get serializer => _$JsonErrorSerializer();
}

class _$JsonErrorSerializer implements StructuredSerializer<JsonError> {
    @override
    final Iterable<Type> types = const [JsonError, _$JsonError];

    @override
    final String wireName = r'JsonError';

    @override
    Iterable<Object?> serialize(Serializers serializers, JsonError object,
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
    JsonError deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonErrorBuilder();

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

