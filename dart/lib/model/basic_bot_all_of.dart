//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BasicBotAllOf {
  /// Returns a new [BasicBotAllOf] instance.
  BasicBotAllOf({
    this.userId,
    this.fullName,
    this.apiKey,
    this.defaultSendingStream,
    this.defaultEventsRegisterStream,
    this.defaultAllPublicStreams,
    this.avatarUrl,
    this.ownerId,
    this.services,
  });

  Object userId;

  Object fullName;

  Object apiKey;

  Object defaultSendingStream;

  Object defaultEventsRegisterStream;

  Object defaultAllPublicStreams;

  Object avatarUrl;

  Object ownerId;

  Object services;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BasicBotAllOf &&
     other.userId == userId &&
     other.fullName == fullName &&
     other.apiKey == apiKey &&
     other.defaultSendingStream == defaultSendingStream &&
     other.defaultEventsRegisterStream == defaultEventsRegisterStream &&
     other.defaultAllPublicStreams == defaultAllPublicStreams &&
     other.avatarUrl == avatarUrl &&
     other.ownerId == ownerId &&
     other.services == services;

  @override
  int get hashCode =>
    (userId == null ? 0 : userId.hashCode) +
    (fullName == null ? 0 : fullName.hashCode) +
    (apiKey == null ? 0 : apiKey.hashCode) +
    (defaultSendingStream == null ? 0 : defaultSendingStream.hashCode) +
    (defaultEventsRegisterStream == null ? 0 : defaultEventsRegisterStream.hashCode) +
    (defaultAllPublicStreams == null ? 0 : defaultAllPublicStreams.hashCode) +
    (avatarUrl == null ? 0 : avatarUrl.hashCode) +
    (ownerId == null ? 0 : ownerId.hashCode) +
    (services == null ? 0 : services.hashCode);

  @override
  String toString() => 'BasicBotAllOf[userId=$userId, fullName=$fullName, apiKey=$apiKey, defaultSendingStream=$defaultSendingStream, defaultEventsRegisterStream=$defaultEventsRegisterStream, defaultAllPublicStreams=$defaultAllPublicStreams, avatarUrl=$avatarUrl, ownerId=$ownerId, services=$services]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (userId != null) {
      json[r'user_id'] = userId;
    }
    if (fullName != null) {
      json[r'full_name'] = fullName;
    }
    if (apiKey != null) {
      json[r'api_key'] = apiKey;
    }
    if (defaultSendingStream != null) {
      json[r'default_sending_stream'] = defaultSendingStream;
    }
    if (defaultEventsRegisterStream != null) {
      json[r'default_events_register_stream'] = defaultEventsRegisterStream;
    }
    if (defaultAllPublicStreams != null) {
      json[r'default_all_public_streams'] = defaultAllPublicStreams;
    }
    if (avatarUrl != null) {
      json[r'avatar_url'] = avatarUrl;
    }
    if (ownerId != null) {
      json[r'owner_id'] = ownerId;
    }
    if (services != null) {
      json[r'services'] = services;
    }
    return json;
  }

  /// Returns a new [BasicBotAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BasicBotAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BasicBotAllOf(
        userId: json[r'user_id'],
        fullName: json[r'full_name'],
        apiKey: json[r'api_key'],
        defaultSendingStream: json[r'default_sending_stream'],
        defaultEventsRegisterStream: json[r'default_events_register_stream'],
        defaultAllPublicStreams: json[r'default_all_public_streams'],
        avatarUrl: json[r'avatar_url'],
        ownerId: json[r'owner_id'],
        services: json[r'services'],
    );

  static List<BasicBotAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BasicBotAllOf>[]
      : json.map((dynamic value) => BasicBotAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, BasicBotAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BasicBotAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BasicBotAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BasicBotAllOf-objects as value to a dart map
  static Map<String, List<BasicBotAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BasicBotAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BasicBotAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

