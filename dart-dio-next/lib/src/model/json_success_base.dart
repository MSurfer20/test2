//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/json_response_base.dart';
import 'package:openapi/src/model/json_success_base_all_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'json_success_base.g.dart';

/// JsonSuccessBase
///
/// Properties:
/// * [result] 
/// * [msg] 
abstract class JsonSuccessBase implements Built<JsonSuccessBase, JsonSuccessBaseBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonSuccessBaseResultEnum get result;
    // enum resultEnum {  success,  };

    @BuiltValueField(wireName: r'msg')
    String get msg;

    JsonSuccessBase._();

    static void _initializeBuilder(JsonSuccessBaseBuilder b) => b;

    factory JsonSuccessBase([void updates(JsonSuccessBaseBuilder b)]) = _$JsonSuccessBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<JsonSuccessBase> get serializer => _$JsonSuccessBaseSerializer();
}

class _$JsonSuccessBaseSerializer implements StructuredSerializer<JsonSuccessBase> {
    @override
    final Iterable<Type> types = const [JsonSuccessBase, _$JsonSuccessBase];

    @override
    final String wireName = r'JsonSuccessBase';

    @override
    Iterable<Object?> serialize(Serializers serializers, JsonSuccessBase object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        result
            ..add(r'result')
            ..add(serializers.serialize(object.result,
                specifiedType: const FullType(JsonSuccessBaseResultEnum)));
        result
            ..add(r'msg')
            ..add(serializers.serialize(object.msg,
                specifiedType: const FullType(String)));
        return result;
    }

    @override
    JsonSuccessBase deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = JsonSuccessBaseBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'result':
                    result.result = serializers.deserialize(value,
                        specifiedType: const FullType(JsonSuccessBaseResultEnum)) as JsonSuccessBaseResultEnum;
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

class JsonSuccessBaseResultEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'success')
  static const JsonSuccessBaseResultEnum success = _$jsonSuccessBaseResultEnum_success;

  static Serializer<JsonSuccessBaseResultEnum> get serializer => _$jsonSuccessBaseResultEnumSerializer;

  const JsonSuccessBaseResultEnum._(String name): super(name);

  static BuiltSet<JsonSuccessBaseResultEnum> get values => _$jsonSuccessBaseResultEnumValues;
  static JsonSuccessBaseResultEnum valueOf(String name) => _$jsonSuccessBaseResultEnumValueOf(name);
}

