//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/coded_error_base_all_of.dart';
import 'package:openapi/model/json_error_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'coded_error_base.g.dart';

abstract class CodedErrorBase implements Built<CodedErrorBase, CodedErrorBaseBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    /// A string that identifies the error. 
    @nullable
    @BuiltValueField(wireName: r'code')
    String get code;

    CodedErrorBase._();

    static void _initializeBuilder(CodedErrorBaseBuilder b) => b;

    factory CodedErrorBase([void updates(CodedErrorBaseBuilder b)]) = _$CodedErrorBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<CodedErrorBase> get serializer => _$CodedErrorBaseSerializer();
}

class _$CodedErrorBaseSerializer implements StructuredSerializer<CodedErrorBase> {

    @override
    final Iterable<Type> types = const [CodedErrorBase, _$CodedErrorBase];
    @override
    final String wireName = r'CodedErrorBase';

    @override
    Iterable<Object> serialize(Serializers serializers, CodedErrorBase object,
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
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    CodedErrorBase deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = CodedErrorBaseBuilder();

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
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

