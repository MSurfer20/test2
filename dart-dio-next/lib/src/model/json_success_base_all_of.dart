//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_success_base_all_of.g.dart';

/// JsonSuccessBaseAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
abstract class JsonSuccessBaseAllOf implements Built<JsonSuccessBaseAllOf, JsonSuccessBaseAllOfBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonSuccessBaseAllOfResultEnum get result;
    // enum resultEnum {  success,  };

    @BuiltValueField(wireName: r'msg')
    String get msg;

    JsonSuccessBaseAllOf._();

    static void _initializeBuilder(JsonSuccessBaseAllOfBuilder b) => b;

    factory JsonSuccessBaseAllOf([void updates(JsonSuccessBaseAllOfBuilder b)]) = _$JsonSuccessBaseAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonSuccessBaseAllOf> get serializer => _$JsonSuccessBaseAllOfSerializer();
}

class _$JsonSuccessBaseAllOfSerializer implements StructuredSerializer<JsonSuccessBaseAllOf> {
    @override
    final Iterable<Type> types = const [JsonSuccessBaseAllOf, _$JsonSuccessBaseAllOf];

    @override
    final String wireName = r'JsonSuccessBaseAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, JsonSuccessBaseAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'result')
            ..add(serializers.serialize(object.result,
                specifiedType: const FullType(JsonSuccessBaseAllOfResultEnum)));
        result
            ..add(r'msg')
            ..add(serializers.serialize(object.msg,
                specifiedType: const FullType(String)));
        return result;
    }

    @override
    JsonSuccessBaseAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonSuccessBaseAllOfBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'result':
                    result.result = serializers.deserialize(value,
                        specifiedType: const FullType(JsonSuccessBaseAllOfResultEnum)) as JsonSuccessBaseAllOfResultEnum;
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

class JsonSuccessBaseAllOfResultEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'success')
  static const JsonSuccessBaseAllOfResultEnum success = _$jsonSuccessBaseAllOfResultEnum_success;

  static Serializer<JsonSuccessBaseAllOfResultEnum> get serializer => _$jsonSuccessBaseAllOfResultEnumSerializer;

  const JsonSuccessBaseAllOfResultEnum._(String name): super(name);

  static BuiltSet<JsonSuccessBaseAllOfResultEnum> get values => _$jsonSuccessBaseAllOfResultEnumValues;
  static JsonSuccessBaseAllOfResultEnum valueOf(String name) => _$jsonSuccessBaseAllOfResultEnumValueOf(name);
}

