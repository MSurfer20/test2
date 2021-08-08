//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_success_all_of.g.dart';

abstract class JsonSuccessAllOf implements Built<JsonSuccessAllOf, JsonSuccessAllOfBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    JsonSuccessAllOf._();

    static void _initializeBuilder(JsonSuccessAllOfBuilder b) => b;

    factory JsonSuccessAllOf([void updates(JsonSuccessAllOfBuilder b)]) = _$JsonSuccessAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonSuccessAllOf> get serializer => _$JsonSuccessAllOfSerializer();
}

class _$JsonSuccessAllOfSerializer implements StructuredSerializer<JsonSuccessAllOf> {

    @override
    final Iterable<Type> types = const [JsonSuccessAllOf, _$JsonSuccessAllOf];
    @override
    final String wireName = r'JsonSuccessAllOf';

    @override
    Iterable<Object> serialize(Serializers serializers, JsonSuccessAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.result != null) {
            result
                ..add(r'result')
                ..add(serializers.serialize(object.result,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.msg != null) {
            result
                ..add(r'msg')
                ..add(serializers.serialize(object.msg,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    JsonSuccessAllOf deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonSuccessAllOfBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
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

