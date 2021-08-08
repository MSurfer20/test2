//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserBase {
  /// Returns a new [UserBase] instance.
  UserBase({
    this.email,
    this.isBot,
    this.avatarUrl,
    this.avatarVersion,
    this.fullName,
    this.isAdmin,
    this.isOwner,
    this.isBillingAdmin,
    this.role,
    this.botType,
    this.userId,
    this.botOwnerId,
    this.isActive,
    this.isGuest,
    this.timezone,
    this.dateJoined,
    this.deliveryEmail,
    this.profileData = const {},
  });

  /// The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
  String email;

  /// A boolean specifying whether the user is a bot or full account. 
  bool isBot;

  /// URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
  String avatarUrl;

  /// Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
  int avatarVersion;

  /// Full name of the user or bot, used for all display purposes. 
  String fullName;

  /// A boolean specifying whether the user is an organization administrator. 
  bool isAdmin;

  /// A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
  bool isOwner;

  /// A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
  bool isBillingAdmin;

  /// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
  UserBaseRoleEnum role;

  /// An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
  int botType;

  /// The unique ID of the user. 
  int userId;

  /// If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
  int botOwnerId;

  /// A boolean specifying whether the user account has been deactivated. 
  bool isActive;

  /// A boolean specifying whether the user is a guest user. 
  bool isGuest;

  /// The time zone of the user. 
  String timezone;

  /// The time the user account was created. 
  String dateJoined;

  /// The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
  String deliveryEmail;

  /// A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
  Map<String, Object> profileData;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserBase &&
     other.email == email &&
     other.isBot == isBot &&
     other.avatarUrl == avatarUrl &&
     other.avatarVersion == avatarVersion &&
     other.fullName == fullName &&
     other.isAdmin == isAdmin &&
     other.isOwner == isOwner &&
     other.isBillingAdmin == isBillingAdmin &&
     other.role == role &&
     other.botType == botType &&
     other.userId == userId &&
     other.botOwnerId == botOwnerId &&
     other.isActive == isActive &&
     other.isGuest == isGuest &&
     other.timezone == timezone &&
     other.dateJoined == dateJoined &&
     other.deliveryEmail == deliveryEmail &&
     other.profileData == profileData;

  @override
  int get hashCode =>
    (email == null ? 0 : email.hashCode) +
    (isBot == null ? 0 : isBot.hashCode) +
    (avatarUrl == null ? 0 : avatarUrl.hashCode) +
    (avatarVersion == null ? 0 : avatarVersion.hashCode) +
    (fullName == null ? 0 : fullName.hashCode) +
    (isAdmin == null ? 0 : isAdmin.hashCode) +
    (isOwner == null ? 0 : isOwner.hashCode) +
    (isBillingAdmin == null ? 0 : isBillingAdmin.hashCode) +
    (role == null ? 0 : role.hashCode) +
    (botType == null ? 0 : botType.hashCode) +
    (userId == null ? 0 : userId.hashCode) +
    (botOwnerId == null ? 0 : botOwnerId.hashCode) +
    (isActive == null ? 0 : isActive.hashCode) +
    (isGuest == null ? 0 : isGuest.hashCode) +
    (timezone == null ? 0 : timezone.hashCode) +
    (dateJoined == null ? 0 : dateJoined.hashCode) +
    (deliveryEmail == null ? 0 : deliveryEmail.hashCode) +
    (profileData == null ? 0 : profileData.hashCode);

  @override
  String toString() => 'UserBase[email=$email, isBot=$isBot, avatarUrl=$avatarUrl, avatarVersion=$avatarVersion, fullName=$fullName, isAdmin=$isAdmin, isOwner=$isOwner, isBillingAdmin=$isBillingAdmin, role=$role, botType=$botType, userId=$userId, botOwnerId=$botOwnerId, isActive=$isActive, isGuest=$isGuest, timezone=$timezone, dateJoined=$dateJoined, deliveryEmail=$deliveryEmail, profileData=$profileData]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (email != null) {
      json[r'email'] = email;
    }
    if (isBot != null) {
      json[r'is_bot'] = isBot;
    }
    if (avatarUrl != null) {
      json[r'avatar_url'] = avatarUrl;
    }
    if (avatarVersion != null) {
      json[r'avatar_version'] = avatarVersion;
    }
    if (fullName != null) {
      json[r'full_name'] = fullName;
    }
    if (isAdmin != null) {
      json[r'is_admin'] = isAdmin;
    }
    if (isOwner != null) {
      json[r'is_owner'] = isOwner;
    }
    if (isBillingAdmin != null) {
      json[r'is_billing_admin'] = isBillingAdmin;
    }
    if (role != null) {
      json[r'role'] = role;
    }
    if (botType != null) {
      json[r'bot_type'] = botType;
    }
    if (userId != null) {
      json[r'user_id'] = userId;
    }
    if (botOwnerId != null) {
      json[r'bot_owner_id'] = botOwnerId;
    }
    if (isActive != null) {
      json[r'is_active'] = isActive;
    }
    if (isGuest != null) {
      json[r'is_guest'] = isGuest;
    }
    if (timezone != null) {
      json[r'timezone'] = timezone;
    }
    if (dateJoined != null) {
      json[r'date_joined'] = dateJoined;
    }
    if (deliveryEmail != null) {
      json[r'delivery_email'] = deliveryEmail;
    }
    if (profileData != null) {
      json[r'profile_data'] = profileData;
    }
    return json;
  }

  /// Returns a new [UserBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static UserBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : UserBase(
        email: json[r'email'],
        isBot: json[r'is_bot'],
        avatarUrl: json[r'avatar_url'],
        avatarVersion: json[r'avatar_version'],
        fullName: json[r'full_name'],
        isAdmin: json[r'is_admin'],
        isOwner: json[r'is_owner'],
        isBillingAdmin: json[r'is_billing_admin'],
        role: UserBaseRoleEnum.fromJson(json[r'role']),
        botType: json[r'bot_type'],
        userId: json[r'user_id'],
        botOwnerId: json[r'bot_owner_id'],
        isActive: json[r'is_active'],
        isGuest: json[r'is_guest'],
        timezone: json[r'timezone'],
        dateJoined: json[r'date_joined'],
        deliveryEmail: json[r'delivery_email'],
            profileData: json[r'profile_data']
    );

  static List<UserBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <UserBase>[]
      : json.map((dynamic value) => UserBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, UserBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, UserBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = UserBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of UserBase-objects as value to a dart map
  static Map<String, List<UserBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<UserBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = UserBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

/// [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
class UserBaseRoleEnum {
  /// Instantiate a new enum with the provided [value].
  const UserBaseRoleEnum._(this.value);

  /// The underlying value of this enum member.
  final int value;

  @override
  String toString() => value.toString();

  int toJson() => value;

  static const number100 = UserBaseRoleEnum._(100);
  static const number200 = UserBaseRoleEnum._(200);
  static const number300 = UserBaseRoleEnum._(300);
  static const number400 = UserBaseRoleEnum._(400);
  static const number600 = UserBaseRoleEnum._(600);

  /// List of all possible values in this [enum][UserBaseRoleEnum].
  static const values = <UserBaseRoleEnum>[
    number100,
    number200,
    number300,
    number400,
    number600,
  ];

  static UserBaseRoleEnum fromJson(dynamic value) =>
    UserBaseRoleEnumTypeTransformer().decode(value);

  static List<UserBaseRoleEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <UserBaseRoleEnum>[]
      : json
          .map((value) => UserBaseRoleEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [UserBaseRoleEnum] to int,
/// and [decode] dynamic data back to [UserBaseRoleEnum].
class UserBaseRoleEnumTypeTransformer {
  const UserBaseRoleEnumTypeTransformer._();

  factory UserBaseRoleEnumTypeTransformer() => _instance ??= UserBaseRoleEnumTypeTransformer._();

  int encode(UserBaseRoleEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserBaseRoleEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserBaseRoleEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case 100: return UserBaseRoleEnum.number100;
      case 200: return UserBaseRoleEnum.number200;
      case 300: return UserBaseRoleEnum.number300;
      case 400: return UserBaseRoleEnum.number400;
      case 600: return UserBaseRoleEnum.number600;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [UserBaseRoleEnumTypeTransformer] instance.
  static UserBaseRoleEnumTypeTransformer _instance;
}

