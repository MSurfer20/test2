//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'coded_error_all_of.g.dart';

abstract class CodedErrorAllOf implements Built<CodedErrorAllOf, CodedErrorAllOfBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    @nullable
    @BuiltValueField(wireName: r'code')
    JsonObject get code;

    CodedErrorAllOf._();

    static void _initializeBuilder(CodedErrorAllOfBuilder b) => b;

    factory CodedErrorAllOf([void updates(CodedErrorAllOfBuilder b)]) = _$CodedErrorAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<CodedErrorAllOf> get serializer => _$CodedErrorAllOfSerializer();
}

class _$CodedErrorAllOfSerializer implements StructuredSerializer<CodedErrorAllOf> {

    @override
    final Iterable<Type> types = const [CodedErrorAllOf, _$CodedErrorAllOf];
    @override
    final String wireName = r'CodedErrorAllOf';

    @override
    Iterable<Object> serialize(Serializers serializers, CodedErrorAllOf object,
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
        if (object.code != null) {
            result
                ..add(r'code')
                ..add(serializers.serialize(object.code,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    CodedErrorAllOf deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = CodedErrorAllOfBuilder();

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

