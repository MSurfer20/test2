//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_response_base.g.dart';

abstract class JsonResponseBase implements Built<JsonResponseBase, JsonResponseBaseBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    String get result;

    JsonResponseBase._();

    static void _initializeBuilder(JsonResponseBaseBuilder b) => b;

    factory JsonResponseBase([void updates(JsonResponseBaseBuilder b)]) = _$JsonResponseBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonResponseBase> get serializer => _$JsonResponseBaseSerializer();
}

class _$JsonResponseBaseSerializer implements StructuredSerializer<JsonResponseBase> {

    @override
    final Iterable<Type> types = const [JsonResponseBase, _$JsonResponseBase];
    @override
    final String wireName = r'JsonResponseBase';

    @override
    Iterable<Object> serialize(Serializers serializers, JsonResponseBase object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        if (object.result != null) {
            result
                ..add(r'result')
                ..add(serializers.serialize(object.result,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    JsonResponseBase deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonResponseBaseBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'result':
                    result.result = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

