//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'invalid_message_error_all_of.g.dart';

/// InvalidMessageErrorAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [rawContent] - The raw content of the message. 
abstract class InvalidMessageErrorAllOf implements Built<InvalidMessageErrorAllOf, InvalidMessageErrorAllOfBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    /// The raw content of the message. 
    @BuiltValueField(wireName: r'raw_content')
    String? get rawContent;

    InvalidMessageErrorAllOf._();

    static void _initializeBuilder(InvalidMessageErrorAllOfBuilder b) => b;

    factory InvalidMessageErrorAllOf([void updates(InvalidMessageErrorAllOfBuilder b)]) = _$InvalidMessageErrorAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<InvalidMessageErrorAllOf> get serializer => _$InvalidMessageErrorAllOfSerializer();
}

class _$InvalidMessageErrorAllOfSerializer implements StructuredSerializer<InvalidMessageErrorAllOf> {
    @override
    final Iterable<Type> types = const [InvalidMessageErrorAllOf, _$InvalidMessageErrorAllOf];

    @override
    final String wireName = r'InvalidMessageErrorAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, InvalidMessageErrorAllOf object,
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
        if (object.rawContent != null) {
            result
                ..add(r'raw_content')
                ..add(serializers.serialize(object.rawContent,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    InvalidMessageErrorAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = InvalidMessageErrorAllOfBuilder();

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
                case r'raw_content':
                    result.rawContent = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

