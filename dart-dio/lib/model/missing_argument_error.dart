//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/missing_argument_error_all_of.dart';
import 'package:openapi/model/coded_error_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'missing_argument_error.g.dart';

abstract class MissingArgumentError implements Built<MissingArgumentError, MissingArgumentErrorBuilder> {

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

    MissingArgumentError._();

    static void _initializeBuilder(MissingArgumentErrorBuilder b) => b;

    factory MissingArgumentError([void updates(MissingArgumentErrorBuilder b)]) = _$MissingArgumentError;

    @BuiltValueSerializer(custom: true)
    static Serializer<MissingArgumentError> get serializer => _$MissingArgumentErrorSerializer();
}

class _$MissingArgumentErrorSerializer implements StructuredSerializer<MissingArgumentError> {

    @override
    final Iterable<Type> types = const [MissingArgumentError, _$MissingArgumentError];
    @override
    final String wireName = r'MissingArgumentError';

    @override
    Iterable<Object> serialize(Serializers serializers, MissingArgumentError object,
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
        if (object.varName != null) {
            result
                ..add(r'var_name')
                ..add(serializers.serialize(object.varName,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    MissingArgumentError deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = MissingArgumentErrorBuilder();

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

