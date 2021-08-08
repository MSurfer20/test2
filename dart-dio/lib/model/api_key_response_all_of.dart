//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.7

// ignore_for_file: unused_import

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'api_key_response_all_of.g.dart';

abstract class ApiKeyResponseAllOf implements Built<ApiKeyResponseAllOf, ApiKeyResponseAllOfBuilder> {

    @nullable
    @BuiltValueField(wireName: r'result')
    JsonObject get result;

    @nullable
    @BuiltValueField(wireName: r'msg')
    JsonObject get msg;

    /// The API key that can be used to authenticate as the requested user. 
    @BuiltValueField(wireName: r'api_key')
    String get apiKey;

    /// The email address of the user who owns the API key 
    @BuiltValueField(wireName: r'email')
    String get email;

    ApiKeyResponseAllOf._();

    static void _initializeBuilder(ApiKeyResponseAllOfBuilder b) => b;

    factory ApiKeyResponseAllOf([void updates(ApiKeyResponseAllOfBuilder b)]) = _$ApiKeyResponseAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<ApiKeyResponseAllOf> get serializer => _$ApiKeyResponseAllOfSerializer();
}

class _$ApiKeyResponseAllOfSerializer implements StructuredSerializer<ApiKeyResponseAllOf> {

    @override
    final Iterable<Type> types = const [ApiKeyResponseAllOf, _$ApiKeyResponseAllOf];
    @override
    final String wireName = r'ApiKeyResponseAllOf';

    @override
    Iterable<Object> serialize(Serializers serializers, ApiKeyResponseAllOf object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object>[];
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
        result
            ..add(r'api_key')
            ..add(serializers.serialize(object.apiKey,
                specifiedType: const FullType(String)));
        result
            ..add(r'email')
            ..add(serializers.serialize(object.email,
                specifiedType: const FullType(String)));
        return result;
    }

    @override
    ApiKeyResponseAllOf deserialize(Serializers serializers, Iterable<Object> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = ApiKeyResponseAllOfBuilder();

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
                case r'api_key':
                    result.apiKey = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'email':
                    result.email = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

