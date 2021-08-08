//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:openapi/src/model/user_all_of.dart';
import 'package:openapi/src/model/user_base.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user.g.dart';

/// User
///
/// Properties:
/// * [email] 
/// * [isBot] 
/// * [avatarUrl] 
/// * [avatarVersion] 
/// * [fullName] 
/// * [isAdmin] 
/// * [isOwner] 
/// * [isBillingAdmin] 
/// * [role] 
/// * [botType] 
/// * [userId] 
/// * [botOwnerId] 
/// * [isActive] 
/// * [isGuest] 
/// * [timezone] 
/// * [dateJoined] 
/// * [deliveryEmail] 
/// * [profileData] 
abstract class User implements Built<User, UserBuilder> {
    @BuiltValueField(wireName: r'email')
    JsonObject? get email;

    @BuiltValueField(wireName: r'is_bot')
    JsonObject? get isBot;

    @BuiltValueField(wireName: r'avatar_url')
    JsonObject? get avatarUrl;

    @BuiltValueField(wireName: r'avatar_version')
    JsonObject? get avatarVersion;

    @BuiltValueField(wireName: r'full_name')
    JsonObject? get fullName;

    @BuiltValueField(wireName: r'is_admin')
    JsonObject? get isAdmin;

    @BuiltValueField(wireName: r'is_owner')
    JsonObject? get isOwner;

    @BuiltValueField(wireName: r'is_billing_admin')
    JsonObject? get isBillingAdmin;

    @BuiltValueField(wireName: r'role')
    JsonObject? get role;

    @BuiltValueField(wireName: r'bot_type')
    JsonObject? get botType;

    @BuiltValueField(wireName: r'user_id')
    JsonObject? get userId;

    @BuiltValueField(wireName: r'bot_owner_id')
    JsonObject? get botOwnerId;

    @BuiltValueField(wireName: r'is_active')
    JsonObject? get isActive;

    @BuiltValueField(wireName: r'is_guest')
    JsonObject? get isGuest;

    @BuiltValueField(wireName: r'timezone')
    JsonObject? get timezone;

    @BuiltValueField(wireName: r'date_joined')
    JsonObject? get dateJoined;

    @BuiltValueField(wireName: r'delivery_email')
    JsonObject? get deliveryEmail;

    @BuiltValueField(wireName: r'profile_data')
    JsonObject? get profileData;

    User._();

    static void _initializeBuilder(UserBuilder b) => b;

    factory User([void updates(UserBuilder b)]) = _$User;

    @BuiltValueSerializer(custom: true)
    static Serializer<User> get serializer => _$UserSerializer();
}

class _$UserSerializer implements StructuredSerializer<User> {
    @override
    final Iterable<Type> types = const [User, _$User];

    @override
    final String wireName = r'User';

    @override
    Iterable<Object?> serialize(Serializers serializers, User object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.email != null) {
            result
                ..add(r'email')
                ..add(serializers.serialize(object.email,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isBot != null) {
            result
                ..add(r'is_bot')
                ..add(serializers.serialize(object.isBot,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.avatarUrl != null) {
            result
                ..add(r'avatar_url')
                ..add(serializers.serialize(object.avatarUrl,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.avatarVersion != null) {
            result
                ..add(r'avatar_version')
                ..add(serializers.serialize(object.avatarVersion,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.fullName != null) {
            result
                ..add(r'full_name')
                ..add(serializers.serialize(object.fullName,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isAdmin != null) {
            result
                ..add(r'is_admin')
                ..add(serializers.serialize(object.isAdmin,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isOwner != null) {
            result
                ..add(r'is_owner')
                ..add(serializers.serialize(object.isOwner,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isBillingAdmin != null) {
            result
                ..add(r'is_billing_admin')
                ..add(serializers.serialize(object.isBillingAdmin,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.role != null) {
            result
                ..add(r'role')
                ..add(serializers.serialize(object.role,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.botType != null) {
            result
                ..add(r'bot_type')
                ..add(serializers.serialize(object.botType,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.userId != null) {
            result
                ..add(r'user_id')
                ..add(serializers.serialize(object.userId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.botOwnerId != null) {
            result
                ..add(r'bot_owner_id')
                ..add(serializers.serialize(object.botOwnerId,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isActive != null) {
            result
                ..add(r'is_active')
                ..add(serializers.serialize(object.isActive,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.isGuest != null) {
            result
                ..add(r'is_guest')
                ..add(serializers.serialize(object.isGuest,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.timezone != null) {
            result
                ..add(r'timezone')
                ..add(serializers.serialize(object.timezone,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.dateJoined != null) {
            result
                ..add(r'date_joined')
                ..add(serializers.serialize(object.dateJoined,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.deliveryEmail != null) {
            result
                ..add(r'delivery_email')
                ..add(serializers.serialize(object.deliveryEmail,
                    specifiedType: const FullType(JsonObject)));
        }
        if (object.profileData != null) {
            result
                ..add(r'profile_data')
                ..add(serializers.serialize(object.profileData,
                    specifiedType: const FullType(JsonObject)));
        }
        return result;
    }

    @override
    User deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = UserBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'email':
                    result.email = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_bot':
                    result.isBot = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'avatar_url':
                    result.avatarUrl = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'avatar_version':
                    result.avatarVersion = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'full_name':
                    result.fullName = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_admin':
                    result.isAdmin = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_owner':
                    result.isOwner = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_billing_admin':
                    result.isBillingAdmin = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'role':
                    result.role = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'bot_type':
                    result.botType = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'user_id':
                    result.userId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'bot_owner_id':
                    result.botOwnerId = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_active':
                    result.isActive = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'is_guest':
                    result.isGuest = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'timezone':
                    result.timezone = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'date_joined':
                    result.dateJoined = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'delivery_email':
                    result.deliveryEmail = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
                case r'profile_data':
                    result.profileData = serializers.deserialize(value,
                        specifiedType: const FullType(JsonObject)) as JsonObject;
                    break;
            }
        }
        return result.build();
    }
}

