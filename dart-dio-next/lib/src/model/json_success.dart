//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/json_success_all_of.dart';
import 'package:openapi/src/model/json_success_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_success.g.dart';

/// JsonSuccess
///
/// Properties:
/// * [result] 
/// * [msg] 
abstract class JsonSuccess implements Built<JsonSuccess, JsonSuccessBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    JsonSuccess._();

    static void _initializeBuilder(JsonSuccessBuilder b) => b;

    factory JsonSuccess([void updates(JsonSuccessBuilder b)]) = _$JsonSuccess;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonSuccess> get serializer => _$JsonSuccessSerializer();
}

class _$JsonSuccessSerializer implements StructuredSerializer<JsonSuccess> {
    @override
    final Iterable<Type> types = const [JsonSuccess, _$JsonSuccess];

    @override
    final String wireName = r'JsonSuccess';

    @override
    Iterable<Object?> serialize(Serializers serializers, JsonSuccess object,
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
    JsonSuccess deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonSuccessBuilder();

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

