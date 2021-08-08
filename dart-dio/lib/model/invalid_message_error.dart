//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/json_success_base.dart';
import 'package:openapi/model/invalid_message_error_all_of.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invalid_message_error.g.dart';

abstract class InvalidMessageError implements Built<InvalidMessageError, InvalidMessageErrorBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    /// The raw content of the message. 
    @nullable
    @BuiltValueField(wireName: r'raw_content')
    String get rawContent;

    InvalidMessageError._();

    static void _initializeBuilder(InvalidMessageErrorBuilder b) => b;

    factory InvalidMessageError([void updates(InvalidMessageErrorBuilder b)]) = _$InvalidMessageError;

    @BuiltValueSerializer(custom: true)
    static Serializer<InvalidMessageError> get serializer => _$InvalidMessageErrorSerializer();
}

class _$InvalidMessageErrorSerializer implements StructuredSerializer<InvalidMessageError> {

    @override
    final Iterable<Type> types = const [InvalidMessageError, _$InvalidMessageError];
    @override
    final String wireName = r'InvalidMessageError';

    @override
    Iterable<Object> serialize(Serializers serializers, InvalidMessageError object,
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
        if (object.rawContent != null) {
            result
                ..add(r'raw_content')
                ..add(serializers.serialize(object.rawContent,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    InvalidMessageError deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = InvalidMessageErrorBuilder();

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
                case r'raw_content':
                    result.rawContent = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

