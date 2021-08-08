//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'coded_error_base_all_of.g.dart';

/// CodedErrorBaseAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [code] - A string that identifies the error. 
abstract class CodedErrorBaseAllOf implements Built<CodedErrorBaseAllOf, CodedErrorBaseAllOfBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    /// A string that identifies the error. 
    @BuiltValueField(wireName: r'code')
    String? get code;

    CodedErrorBaseAllOf._();

    static void _initializeBuilder(CodedErrorBaseAllOfBuilder b) => b;

    factory CodedErrorBaseAllOf([void updates(CodedErrorBaseAllOfBuilder b)]) = _$CodedErrorBaseAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<CodedErrorBaseAllOf> get serializer => _$CodedErrorBaseAllOfSerializer();
}

class _$CodedErrorBaseAllOfSerializer implements StructuredSerializer<CodedErrorBaseAllOf> {
    @override
    final Iterable<Type> types = const [CodedErrorBaseAllOf, _$CodedErrorBaseAllOf];

    @override
    final String wireName = r'CodedErrorBaseAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, CodedErrorBaseAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
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
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    CodedErrorBaseAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = CodedErrorBaseAllOfBuilder();

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
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

