//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserAllOf {
  /// Returns a new [UserAllOf] instance.
  UserAllOf({
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
    this.profileData,
  });

  Object email;

  Object isBot;

  Object avatarUrl;

  Object avatarVersion;

  Object fullName;

  Object isAdmin;

  Object isOwner;

  Object isBillingAdmin;

  Object role;

  Object botType;

  Object userId;

  Object botOwnerId;

  Object isActive;

  Object isGuest;

  Object timezone;

  Object dateJoined;

  Object deliveryEmail;

  Object profileData;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserAllOf &&
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
  String toString() => 'UserAllOf[email=$email, isBot=$isBot, avatarUrl=$avatarUrl, avatarVersion=$avatarVersion, fullName=$fullName, isAdmin=$isAdmin, isOwner=$isOwner, isBillingAdmin=$isBillingAdmin, role=$role, botType=$botType, userId=$userId, botOwnerId=$botOwnerId, isActive=$isActive, isGuest=$isGuest, timezone=$timezone, dateJoined=$dateJoined, deliveryEmail=$deliveryEmail, profileData=$profileData]';

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

  /// Returns a new [UserAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static UserAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : UserAllOf(
        email: json[r'email'],
        isBot: json[r'is_bot'],
        avatarUrl: json[r'avatar_url'],
        avatarVersion: json[r'avatar_version'],
        fullName: json[r'full_name'],
        isAdmin: json[r'is_admin'],
        isOwner: json[r'is_owner'],
        isBillingAdmin: json[r'is_billing_admin'],
        role: json[r'role'],
        botType: json[r'bot_type'],
        userId: json[r'user_id'],
        botOwnerId: json[r'bot_owner_id'],
        isActive: json[r'is_active'],
        isGuest: json[r'is_guest'],
        timezone: json[r'timezone'],
        dateJoined: json[r'date_joined'],
        deliveryEmail: json[r'delivery_email'],
        profileData: json[r'profile_data'],
    );

  static List<UserAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <UserAllOf>[]
      : json.map((dynamic value) => UserAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, UserAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, UserAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = UserAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of UserAllOf-objects as value to a dart map
  static Map<String, List<UserAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<UserAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = UserAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

