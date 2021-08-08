//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_collection/built_collection.dart';
import 'package:openapi/model/json_response_base.dart';
import 'package:openapi/model/json_error_base_all_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_error_base.g.dart';

abstract class JsonErrorBase implements Built<JsonErrorBase, JsonErrorBaseBuilder> {

    @BuiltValueField(wireName: r'result')
    JsonErrorBaseResultEnum get result;
    // enum resultEnum {  error,  };

    @BuiltValueField(wireName: r'msg')
    String get msg;

    JsonErrorBase._();

    static void _initializeBuilder(JsonErrorBaseBuilder b) => b;

    factory JsonErrorBase([void updates(JsonErrorBaseBuilder b)]) = _$JsonErrorBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonErrorBase> get serializer => _$JsonErrorBaseSerializer();
}

class _$JsonErrorBaseSerializer implements StructuredSerializer<JsonErrorBase> {

    @override
    final Iterable<Type> types = const [JsonErrorBase, _$JsonErrorBase];
    @override
    final String wireName = r'JsonErrorBase';

    @override
    Iterable<Object> serialize(Serializers serializers, JsonErrorBase object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
        result
            ..add(r'result')
            ..add(serializers.serialize(object.result,
                specifiedType: const FullType(JsonErrorBaseResultEnum)));
        result
            ..add(r'msg')
            ..add(serializers.serialize(object.msg,
                specifiedType: const FullType(String)));
        return result;
    }

    @override
    JsonErrorBase deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonErrorBaseBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final dynamic value = iterator.current;
            switch (key) {
                case r'result':
                    result.result = serializers.deserialize(value,
                        specifiedType: const FullType(JsonErrorBaseResultEnum)) as JsonErrorBaseResultEnum;
                    break;
                case r'msg':
                    result.msg = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

class JsonErrorBaseResultEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'error')
  static const JsonErrorBaseResultEnum error = _$jsonErrorBaseResultEnum_error;

  static Serializer<JsonErrorBaseResultEnum> get serializer => _$jsonErrorBaseResultEnumSerializer;

  const JsonErrorBaseResultEnum._(String name): super(name);

  static BuiltSet<JsonErrorBaseResultEnum> get values => _$jsonErrorBaseResultEnumValues;
  static JsonErrorBaseResultEnum valueOf(String name) => _$jsonErrorBaseResultEnumValueOf(name);
}

