//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'non_existing_stream_error_all_of.g.dart';

/// NonExistingStreamErrorAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [code] 
/// * [stream] - The name of the stream that could not be found. 
abstract class NonExistingStreamErrorAllOf implements Built<NonExistingStreamErrorAllOf, NonExistingStreamErrorAllOfBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    @BuiltValueField(wireName: r'code')
    JsonObject? get code;

    /// The name of the stream that could not be found. 
    @BuiltValueField(wireName: r'stream')
    String? get stream;

    NonExistingStreamErrorAllOf._();

    static void _initializeBuilder(NonExistingStreamErrorAllOfBuilder b) => b;

    factory NonExistingStreamErrorAllOf([void updates(NonExistingStreamErrorAllOfBuilder b)]) = _$NonExistingStreamErrorAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<NonExistingStreamErrorAllOf> get serializer => _$NonExistingStreamErrorAllOfSerializer();
}

class _$NonExistingStreamErrorAllOfSerializer implements StructuredSerializer<NonExistingStreamErrorAllOf> {
    @override
    final Iterable<Type> types = const [NonExistingStreamErrorAllOf, _$NonExistingStreamErrorAllOf];

    @override
    final String wireName = r'NonExistingStreamErrorAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, NonExistingStreamErrorAllOf object,
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
    NonExistingStreamErrorAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = NonExistingStreamErrorAllOfBuilder();

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

