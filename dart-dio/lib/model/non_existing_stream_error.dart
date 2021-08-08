//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:openapi/model/non_existing_stream_error_all_of.dart';
import 'package:openapi/model/coded_error_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'non_existing_stream_error.g.dart';

abstract class NonExistingStreamError implements Built<NonExistingStreamError, NonExistingStreamErrorBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    @nullable
    @BuiltValueField(wireName: r'code')
    JsonObject get code;

    /// The name of the stream that could not be found. 
    @nullable
    @BuiltValueField(wireName: r'stream')
    String get stream;

    NonExistingStreamError._();

    static void _initializeBuilder(NonExistingStreamErrorBuilder b) => b;

    factory NonExistingStreamError([void updates(NonExistingStreamErrorBuilder b)]) = _$NonExistingStreamError;

    @BuiltValueSerializer(custom: true)
    static Serializer<NonExistingStreamError> get serializer => _$NonExistingStreamErrorSerializer();
}

class _$NonExistingStreamErrorSerializer implements StructuredSerializer<NonExistingStreamError> {

    @override
    final Iterable<Type> types = const [NonExistingStreamError, _$NonExistingStreamError];
    @override
    final String wireName = r'NonExistingStreamError';

    @override
    Iterable<Object> serialize(Serializers serializers, NonExistingStreamError object,
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
        if (object.stream != null) {
            result
                ..add(r'stream')
                ..add(serializers.serialize(object.stream,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    NonExistingStreamError deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = NonExistingStreamErrorBuilder();

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
                case r'stream':
                    result.stream = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

