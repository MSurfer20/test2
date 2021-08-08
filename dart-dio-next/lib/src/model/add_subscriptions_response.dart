//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/json_success_base.dart';
import 'package:openapi/src/model/add_subscriptions_response_all_of.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'add_subscriptions_response.g.dart';

/// AddSubscriptionsResponse
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [subscribed] - A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
/// * [alreadySubscribed] - A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
/// * [unauthorized] - A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
abstract class AddSubscriptionsResponse implements Built<AddSubscriptionsResponse, AddSubscriptionsResponseBuilder> {
    @BuiltValueField(wireName: r'result')
    JsonObject? get result;

    @BuiltValueField(wireName: r'msg')
    JsonObject? get msg;

    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
    @BuiltValueField(wireName: r'subscribed')
    BuiltMap<String, BuiltList<String>>? get subscribed;

    /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
    @BuiltValueField(wireName: r'already_subscribed')
    BuiltMap<String, BuiltList<String>>? get alreadySubscribed;

    /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
    @BuiltValueField(wireName: r'unauthorized')
    BuiltList<String>? get unauthorized;

    AddSubscriptionsResponse._();

    static void _initializeBuilder(AddSubscriptionsResponseBuilder b) => b;

    factory AddSubscriptionsResponse([void updates(AddSubscriptionsResponseBuilder b)]) = _$AddSubscriptionsResponse;

    @BuiltValueSerializer(custom: true)
    static Serializer<AddSubscriptionsResponse> get serializer => _$AddSubscriptionsResponseSerializer();
}

class _$AddSubscriptionsResponseSerializer implements StructuredSerializer<AddSubscriptionsResponse> {
    @override
    final Iterable<Type> types = const [AddSubscriptionsResponse, _$AddSubscriptionsResponse];

    @override
    final String wireName = r'AddSubscriptionsResponse';

    @override
    Iterable<Object?> serialize(Serializers serializers, AddSubscriptionsResponse object,
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
        if (object.subscribed != null) {
            result
                ..add(r'subscribed')
                ..add(serializers.serialize(object.subscribed,
                    specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(String)])])));
        }
        if (object.alreadySubscribed != null) {
            result
                ..add(r'already_subscribed')
                ..add(serializers.serialize(object.alreadySubscribed,
                    specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(String)])])));
        }
        if (object.unauthorized != null) {
            result
                ..add(r'unauthorized')
                ..add(serializers.serialize(object.unauthorized,
                    specifiedType: const FullType(BuiltList, [FullType(String)])));
        }
        return result;
    }

    @override
    AddSubscriptionsResponse deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = AddSubscriptionsResponseBuilder();

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
                case r'subscribed':
                    result.subscribed.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(String)])])) as BuiltMap<String, BuiltList<String>>);
                    break;
                case r'already_subscribed':
                    result.alreadySubscribed.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltList, [FullType(String)])])) as BuiltMap<String, BuiltList<String>>);
                    break;
                case r'unauthorized':
                    result.unauthorized.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltList, [FullType(String)])) as BuiltList<String>);
                    break;
            }
        }
        return result.build();
    }
}

