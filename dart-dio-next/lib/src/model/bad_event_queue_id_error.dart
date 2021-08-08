//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/bad_event_queue_id_error_all_of.dart';
import 'package:openapi/src/model/coded_error_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bad_event_queue_id_error.g.dart';

/// BadEventQueueIdError
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [code] 
/// * [queueId] - The string that identifies the invalid event queue. 
abstract class BadEventQueueIdError implements Built<BadEventQueueIdError, BadEventQueueIdErrorBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    @BuiltValueField(wireName: r'code')
    JsonObject? get code;

    /// The string that identifies the invalid event queue. 
    @BuiltValueField(wireName: r'queue_id')
    String? get queueId;

    BadEventQueueIdError._();

    static void _initializeBuilder(BadEventQueueIdErrorBuilder b) => b;

    factory BadEventQueueIdError([void updates(BadEventQueueIdErrorBuilder b)]) = _$BadEventQueueIdError;

    @BuiltValueSerializer(custom: true)
    static Serializer<BadEventQueueIdError> get serializer => _$BadEventQueueIdErrorSerializer();
}

class _$BadEventQueueIdErrorSerializer implements StructuredSerializer<BadEventQueueIdError> {
    @override
    final Iterable<Type> types = const [BadEventQueueIdError, _$BadEventQueueIdError];

    @override
    final String wireName = r'BadEventQueueIdError';

    @override
    Iterable<Object?> serialize(Serializers serializers, BadEventQueueIdError object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
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
        if (object.queueId != null) {
            result
                ..add(r'queue_id')
                ..add(serializers.serialize(object.queueId,
                    specifiedType: const FullType(String)));
        }
        return result;
    }

    @override
    BadEventQueueIdError deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = BadEventQueueIdErrorBuilder();

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

