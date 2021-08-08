//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'presence.g.dart';

/// `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
///
/// Properties:
/// * [client] - The client's platform name. 
/// * [status] - The status of the user on this client. It is either `idle` or `active`. 
/// * [timestamp] - The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
/// * [pushable] - Whether the client is capable of showing mobile/push notifications to the user. 
abstract class Presence implements Built<Presence, PresenceBuilder> {
    /// The client's platform name. 
    @BuiltValueField(wireName: r'client')
    String? get client;

    /// The status of the user on this client. It is either `idle` or `active`. 
    @BuiltValueField(wireName: r'status')
    PresenceStatusEnum? get status;
    // enum statusEnum {  idle,  active,  };

    /// The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
    @BuiltValueField(wireName: r'timestamp')
    int? get timestamp;

    /// Whether the client is capable of showing mobile/push notifications to the user. 
    @BuiltValueField(wireName: r'pushable')
    bool? get pushable;

    Presence._();

    static void _initializeBuilder(PresenceBuilder b) => b;

    factory Presence([void updates(PresenceBuilder b)]) = _$Presence;

    @BuiltValueSerializer(custom: true)
    static Serializer<Presence> get serializer => _$PresenceSerializer();
}

class _$PresenceSerializer implements StructuredSerializer<Presence> {
    @override
    final Iterable<Type> types = const [Presence, _$Presence];

    @override
    final String wireName = r'Presence';

    @override
    Iterable<Object?> serialize(Serializers serializers, Presence object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.client != null) {
            result
                ..add(r'client')
                ..add(serializers.serialize(object.client,
                    specifiedType: const FullType(String)));
        }
        if (object.status != null) {
            result
                ..add(r'status')
                ..add(serializers.serialize(object.status,
                    specifiedType: const FullType(PresenceStatusEnum)));
        }
        if (object.timestamp != null) {
            result
                ..add(r'timestamp')
                ..add(serializers.serialize(object.timestamp,
                    specifiedType: const FullType(int)));
        }
        if (object.pushable != null) {
            result
                ..add(r'pushable')
                ..add(serializers.serialize(object.pushable,
                    specifiedType: const FullType(bool)));
        }
        return result;
    }

    @override
    Presence deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = PresenceBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'client':
                    result.client = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'status':
                    result.status = serializers.deserialize(value,
                        specifiedType: const FullType(PresenceStatusEnum)) as PresenceStatusEnum;
                    break;
                case r'timestamp':
                    result.timestamp = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'pushable':
                    result.pushable = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
            }
        }
        return result.build();
    }
}

class PresenceStatusEnum extends EnumClass {

  /// The status of the user on this client. It is either `idle` or `active`. 
  @BuiltValueEnumConst(wireName: r'idle')
  static const PresenceStatusEnum idle = _$presenceStatusEnum_idle;
  /// The status of the user on this client. It is either `idle` or `active`. 
  @BuiltValueEnumConst(wireName: r'active')
  static const PresenceStatusEnum active = _$presenceStatusEnum_active;

  static Serializer<PresenceStatusEnum> get serializer => _$presenceStatusEnumSerializer;

  const PresenceStatusEnum._(String name): super(name);

  static BuiltSet<PresenceStatusEnum> get values => _$presenceStatusEnumValues;
  static PresenceStatusEnum valueOf(String name) => _$presenceStatusEnumValueOf(name);
}

