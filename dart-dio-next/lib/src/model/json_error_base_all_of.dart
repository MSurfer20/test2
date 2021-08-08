//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_error_base_all_of.g.dart';

/// JsonErrorBaseAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
abstract class JsonErrorBaseAllOf implements Built<JsonErrorBaseAllOf, JsonErrorBaseAllOfBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonErrorBaseAllOfResultEnum get result;
    // enum resultEnum {  error,  };

    @BuiltValueField(wireName: r'msg')
    String get msg;

    JsonErrorBaseAllOf._();

    static void _initializeBuilder(JsonErrorBaseAllOfBuilder b) => b;

    factory JsonErrorBaseAllOf([void updates(JsonErrorBaseAllOfBuilder b)]) = _$JsonErrorBaseAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonErrorBaseAllOf> get serializer => _$JsonErrorBaseAllOfSerializer();
}

class _$JsonErrorBaseAllOfSerializer implements StructuredSerializer<JsonErrorBaseAllOf> {
    @override
    final Iterable<Type> types = const [JsonErrorBaseAllOf, _$JsonErrorBaseAllOf];

    @override
    final String wireName = r'JsonErrorBaseAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, JsonErrorBaseAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'result')
            ..add(serializers.serialize(object.result,
                specifiedType: const FullType(JsonErrorBaseAllOfResultEnum)));
        result
            ..add(r'msg')
            ..add(serializers.serialize(object.msg,
                specifiedType: const FullType(String)));
        return result;
    }

    @override
    JsonErrorBaseAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonErrorBaseAllOfBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'result':
                    result.result = serializers.deserialize(value,
                        specifiedType: const FullType(JsonErrorBaseAllOfResultEnum)) as JsonErrorBaseAllOfResultEnum;
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

class JsonErrorBaseAllOfResultEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'error')
  static const JsonErrorBaseAllOfResultEnum error = _$jsonErrorBaseAllOfResultEnum_error;

  static Serializer<JsonErrorBaseAllOfResultEnum> get serializer => _$jsonErrorBaseAllOfResultEnumSerializer;

  const JsonErrorBaseAllOfResultEnum._(String name): super(name);

  static BuiltSet<JsonErrorBaseAllOfResultEnum> get values => _$jsonErrorBaseAllOfResultEnumValues;
  static JsonErrorBaseAllOfResultEnum valueOf(String name) => _$jsonErrorBaseAllOfResultEnumValueOf(name);
}

