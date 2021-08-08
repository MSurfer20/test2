//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bad_event_queue_id_error_all_of.g.dart';

/// BadEventQueueIdErrorAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [code] 
/// * [queueId] - The string that identifies the invalid event queue. 
abstract class BadEventQueueIdErrorAllOf implements Built<BadEventQueueIdErrorAllOf, BadEventQueueIdErrorAllOfBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    @BuiltValueField(wireName: r'code')
    JsonObject? get code;

    /// The string that identifies the invalid event queue. 
    @BuiltValueField(wireName: r'queue_id')
    String? get queueId;

    BadEventQueueIdErrorAllOf._();

    static void _initializeBuilder(BadEventQueueIdErrorAllOfBuilder b) => b;

    factory BadEventQueueIdErrorAllOf([void updates(BadEventQueueIdErrorAllOfBuilder b)]) = _$BadEventQueueIdErrorAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<BadEventQueueIdErrorAllOf> get serializer => _$BadEventQueueIdErrorAllOfSerializer();
}

class _$BadEventQueueIdErrorAllOfSerializer implements StructuredSerializer<BadEventQueueIdErrorAllOf> {
    @override
    final Iterable<Type> types = const [BadEventQueueIdErrorAllOf, _$BadEventQueueIdErrorAllOf];

    @override
    final String wireName = r'BadEventQueueIdErrorAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, BadEventQueueIdErrorAllOf object,
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
        if (object.queueId != null) {
            result
                ..add(r'queue_id')
                ..add(serializers.serialize(object.queueId,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    BadEventQueueIdErrorAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BadEventQueueIdErrorAllOfBuilder();

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
                case r'queue_id':
                    result.queueId = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
            }
        }
        return result.build();
    }
}

