//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/coded_error.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'rate_limited_error.g.dart';

abstract class RateLimitedError implements Built<RateLimitedError, RateLimitedErrorBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    @nullable
    @BuiltValueField(wireName: r'code')
    JsonObject get code;

    RateLimitedError._();

    static void _initializeBuilder(RateLimitedErrorBuilder b) => b;

    factory RateLimitedError([void updates(RateLimitedErrorBuilder b)]) = _$RateLimitedError;

    @BuiltValueSerializer(custom: true)
    static Serializer<RateLimitedError> get serializer => _$RateLimitedErrorSerializer();
}

class _$RateLimitedErrorSerializer implements StructuredSerializer<RateLimitedError> {

    @override
    final Iterable<Type> types = const [RateLimitedError, _$RateLimitedError];
    @override
    final String wireName = r'RateLimitedError';

    @override
    Iterable<Object> serialize(Serializers serializers, RateLimitedError object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
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
    RateLimitedError deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = RateLimitedErrorBuilder();

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
                case r'code':
                    result.code = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

