//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'missing_argument_error_all_of.g.dart';

abstract class MissingArgumentErrorAllOf implements Built<MissingArgumentErrorAllOf, MissingArgumentErrorAllOfBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    @nullable
    @BuiltValueField(wireName: r'code')
    JsonObject get code;

    /// It contains the information about the missing parameter. 
    @nullable
    @BuiltValueField(wireName: r'var_name')
    String get varName;

    MissingArgumentErrorAllOf._();

    static void _initializeBuilder(MissingArgumentErrorAllOfBuilder b) => b;

    factory MissingArgumentErrorAllOf([void updates(MissingArgumentErrorAllOfBuilder b)]) = _$MissingArgumentErrorAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<MissingArgumentErrorAllOf> get serializer => _$MissingArgumentErrorAllOfSerializer();
}

class _$MissingArgumentErrorAllOfSerializer implements StructuredSerializer<MissingArgumentErrorAllOf> {

    @override
    final Iterable<Type> types = const [MissingArgumentErrorAllOf, _$MissingArgumentErrorAllOf];
    @override
    final String wireName = r'MissingArgumentErrorAllOf';

    @override
    Iterable<Object> serialize(Serializers serializers, MissingArgumentErrorAllOf object,
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
        if (object.varName != null) {
            result
                ..add(r'var_name')
                ..add(serializers.serialize(object.varName,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    MissingArgumentErrorAllOf deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = MissingArgumentErrorAllOfBuilder();

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
                case r'var_name':
                    result.varName = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

