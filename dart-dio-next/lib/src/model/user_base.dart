//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'user_base.g.dart';

/// A dictionary containing basic data on a given Zulip user. 
///
/// Properties:
/// * [email] - The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
/// * [isBot] - A boolean specifying whether the user is a bot or full account. 
/// * [avatarUrl] - URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
/// * [avatarVersion] - Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
/// * [fullName] - Full name of the user or bot, used for all display purposes. 
/// * [isAdmin] - A boolean specifying whether the user is an organization administrator. 
/// * [isOwner] - A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
/// * [isBillingAdmin] - A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
/// * [role] - [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
/// * [botType] - An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
/// * [userId] - The unique ID of the user. 
/// * [botOwnerId] - If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
/// * [isActive] - A boolean specifying whether the user account has been deactivated. 
/// * [isGuest] - A boolean specifying whether the user is a guest user. 
/// * [timezone] - The time zone of the user. 
/// * [dateJoined] - The time the user account was created. 
/// * [deliveryEmail] - The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
/// * [profileData] - A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
abstract class UserBase implements Built<UserBase, UserBaseBuilder> {
    /// The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
    @BuiltValueField(wireName: r'email')
    String? get email;

    /// A boolean specifying whether the user is a bot or full account. 
    @BuiltValueField(wireName: r'is_bot')
    bool? get isBot;

    /// URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
    @BuiltValueField(wireName: r'avatar_url')
    String? get avatarUrl;

    /// Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
    @BuiltValueField(wireName: r'avatar_version')
    int? get avatarVersion;

    /// Full name of the user or bot, used for all display purposes. 
    @BuiltValueField(wireName: r'full_name')
    String? get fullName;

    /// A boolean specifying whether the user is an organization administrator. 
    @BuiltValueField(wireName: r'is_admin')
    bool? get isAdmin;

    /// A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
    @BuiltValueField(wireName: r'is_owner')
    bool? get isOwner;

    /// A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
    @BuiltValueField(wireName: r'is_billing_admin')
    bool? get isBillingAdmin;

    /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
    @BuiltValueField(wireName: r'role')
    UserBaseRoleEnum? get role;
    // enum roleEnum {  100,  200,  300,  400,  600,  };

    /// An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    @BuiltValueField(wireName: r'bot_type')
    int? get botType;

    /// The unique ID of the user. 
    @BuiltValueField(wireName: r'user_id')
    int? get userId;

    /// If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
    @BuiltValueField(wireName: r'bot_owner_id')
    int? get botOwnerId;

    /// A boolean specifying whether the user account has been deactivated. 
    @BuiltValueField(wireName: r'is_active')
    bool? get isActive;

    /// A boolean specifying whether the user is a guest user. 
    @BuiltValueField(wireName: r'is_guest')
    bool? get isGuest;

    /// The time zone of the user. 
    @BuiltValueField(wireName: r'timezone')
    String? get timezone;

    /// The time the user account was created. 
    @BuiltValueField(wireName: r'date_joined')
    String? get dateJoined;

    /// The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
    @BuiltValueField(wireName: r'delivery_email')
    String? get deliveryEmail;

    /// A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
    @BuiltValueField(wireName: r'profile_data')
    BuiltMap<String, JsonObject>? get profileData;

    UserBase._();

    static void _initializeBuilder(UserBaseBuilder b) => b;

    factory UserBase([void updates(UserBaseBuilder b)]) = _$UserBase;

    @BuiltValueSerializer(custom: true)
    static Serializer<UserBase> get serializer => _$UserBaseSerializer();
}

class _$UserBaseSerializer implements StructuredSerializer<UserBase> {
    @override
    final Iterable<Type> types = const [UserBase, _$UserBase];

    @override
    final String wireName = r'UserBase';

    @override
    Iterable<Object?> serialize(Serializers serializers, UserBase object,
        {FullType specifiedType = FullType.unspecified}) {
        final result = <Object?>[];
        if (object.email != null) {
            result
                ..add(r'email')
                ..add(serializers.serialize(object.email,
                    specifiedType: const FullType(String)));
        }
        if (object.isBot != null) {
            result
                ..add(r'is_bot')
                ..add(serializers.serialize(object.isBot,
                    specifiedType: const FullType(bool)));
        }
        if (object.avatarUrl != null) {
            result
                ..add(r'avatar_url')
                ..add(serializers.serialize(object.avatarUrl,
                    specifiedType: const FullType(String)));
        }
        if (object.avatarVersion != null) {
            result
                ..add(r'avatar_version')
                ..add(serializers.serialize(object.avatarVersion,
                    specifiedType: const FullType(int)));
        }
        if (object.fullName != null) {
            result
                ..add(r'full_name')
                ..add(serializers.serialize(object.fullName,
                    specifiedType: const FullType(String)));
        }
        if (object.isAdmin != null) {
            result
                ..add(r'is_admin')
                ..add(serializers.serialize(object.isAdmin,
                    specifiedType: const FullType(bool)));
        }
        if (object.isOwner != null) {
            result
                ..add(r'is_owner')
                ..add(serializers.serialize(object.isOwner,
                    specifiedType: const FullType(bool)));
        }
        if (object.isBillingAdmin != null) {
            result
                ..add(r'is_billing_admin')
                ..add(serializers.serialize(object.isBillingAdmin,
                    specifiedType: const FullType(bool)));
        }
        if (object.role != null) {
            result
                ..add(r'role')
                ..add(serializers.serialize(object.role,
                    specifiedType: const FullType(UserBaseRoleEnum)));
        }
        if (object.botType != null) {
            result
                ..add(r'bot_type')
                ..add(serializers.serialize(object.botType,
                    specifiedType: const FullType(int)));
        }
        if (object.userId != null) {
            result
                ..add(r'user_id')
                ..add(serializers.serialize(object.userId,
                    specifiedType: const FullType(int)));
        }
        if (object.botOwnerId != null) {
            result
                ..add(r'bot_owner_id')
                ..add(serializers.serialize(object.botOwnerId,
                    specifiedType: const FullType(int)));
        }
        if (object.isActive != null) {
            result
                ..add(r'is_active')
                ..add(serializers.serialize(object.isActive,
                    specifiedType: const FullType(bool)));
        }
        if (object.isGuest != null) {
            result
                ..add(r'is_guest')
                ..add(serializers.serialize(object.isGuest,
                    specifiedType: const FullType(bool)));
        }
        if (object.timezone != null) {
            result
                ..add(r'timezone')
                ..add(serializers.serialize(object.timezone,
                    specifiedType: const FullType(String)));
        }
        if (object.dateJoined != null) {
            result
                ..add(r'date_joined')
                ..add(serializers.serialize(object.dateJoined,
                    specifiedType: const FullType(String)));
        }
        if (object.deliveryEmail != null) {
            result
                ..add(r'delivery_email')
                ..add(serializers.serialize(object.deliveryEmail,
                    specifiedType: const FullType(String)));
        }
        if (object.profileData != null) {
            result
                ..add(r'profile_data')
                ..add(serializers.serialize(object.profileData,
                    specifiedType: const FullType(BuiltMap, [FullType(String), FullType(JsonObject)])));
        }
        return result;
    }

    @override
    UserBase deserialize(Serializers serializers, Iterable<Object?> serialized,
        {FullType specifiedType = FullType.unspecified}) {
        final result = UserBaseBuilder();

        final iterator = serialized.iterator;
        while (iterator.moveNext()) {
            final key = iterator.current as String;
            iterator.moveNext();
            final Object? value = iterator.current;
            switch (key) {
                case r'email':
                    result.email = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'is_bot':
                    result.isBot = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'avatar_url':
                    result.avatarUrl = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'avatar_version':
                    result.avatarVersion = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'full_name':
                    result.fullName = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'is_admin':
                    result.isAdmin = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'is_owner':
                    result.isOwner = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'is_billing_admin':
                    result.isBillingAdmin = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'role':
                    result.role = serializers.deserialize(value,
                        specifiedType: const FullType(UserBaseRoleEnum)) as UserBaseRoleEnum;
                    break;
                case r'bot_type':
                    result.botType = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'user_id':
                    result.userId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'bot_owner_id':
                    result.botOwnerId = serializers.deserialize(value,
                        specifiedType: const FullType(int)) as int;
                    break;
                case r'is_active':
                    result.isActive = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'is_guest':
                    result.isGuest = serializers.deserialize(value,
                        specifiedType: const FullType(bool)) as bool;
                    break;
                case r'timezone':
                    result.timezone = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'date_joined':
                    result.dateJoined = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'delivery_email':
                    result.deliveryEmail = serializers.deserialize(value,
                        specifiedType: const FullType(String)) as String;
                    break;
                case r'profile_data':
                    result.profileData.replace(serializers.deserialize(value,
                        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(JsonObject)])) as BuiltMap<String, JsonObject>);
                    break;
            }
        }
        return result.build();
    }
}

class UserBaseRoleEnum extends EnumClass {

  /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  @BuiltValueEnumConst(wireNumber: 100)
  static const UserBaseRoleEnum number100 = _$userBaseRoleEnum_number100;
  /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  @BuiltValueEnumConst(wireNumber: 200)
  static const UserBaseRoleEnum number200 = _$userBaseRoleEnum_number200;
  /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  @BuiltValueEnumConst(wireNumber: 300)
  static const UserBaseRoleEnum number300 = _$userBaseRoleEnum_number300;
  /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  @BuiltValueEnumConst(wireNumber: 400)
  static const UserBaseRoleEnum number400 = _$userBaseRoleEnum_number400;
  /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  @BuiltValueEnumConst(wireNumber: 600)
  static const UserBaseRoleEnum number600 = _$userBaseRoleEnum_number600;

  static Serializer<UserBaseRoleEnum> get serializer => _$userBaseRoleEnumSerializer;

  const UserBaseRoleEnum._(String name): super(name);

  static BuiltSet<UserBaseRoleEnum> get values => _$userBaseRoleEnumValues;
  static UserBaseRoleEnum valueOf(String name) => _$userBaseRoleEnumValueOf(name);
}

