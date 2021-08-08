//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'add_subscriptions_response_all_of.g.dart';

/// AddSubscriptionsResponseAllOf
///
/// Properties:
/// * [result] 
/// * [msg] 
/// * [subscribed] - A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
/// * [alreadySubscribed] - A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
/// * [unauthorized] - A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
abstract class AddSubscriptionsResponseAllOf implements Built<AddSubscriptionsResponseAllOf, AddSubscriptionsResponseAllOfBuilder> {
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

    AddSubscriptionsResponseAllOf._();

    static void _initializeBuilder(AddSubscriptionsResponseAllOfBuilder b) => b;

    factory AddSubscriptionsResponseAllOf([void updates(AddSubscriptionsResponseAllOfBuilder b)]) = _$AddSubscriptionsResponseAllOf;

    @BuiltValueSerializer(custom: true)
    static Serializer<AddSubscriptionsResponseAllOf> get serializer => _$AddSubscriptionsResponseAllOfSerializer();
}

class _$AddSubscriptionsResponseAllOfSerializer implements StructuredSerializer<AddSubscriptionsResponseAllOf> {
    @override
    final Iterable<Type> types = const [AddSubscriptionsResponseAllOf, _$AddSubscriptionsResponseAllOf];

    @override
    final String wireName = r'AddSubscriptionsResponseAllOf';

    @override
    Iterable<Object?> serialize(Serializers serializers, AddSubscriptionsResponseAllOf object,
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
    AddSubscriptionsResponseAllOf deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = AddSubscriptionsResponseAllOfBuilder();

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

