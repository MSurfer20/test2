//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Presence {
  /// Returns a new [Presence] instance.
  Presence({
    this.client,
    this.status,
    this.timestamp,
    this.pushable,
  });

  /// The client's platform name. 
  String client;

  /// The status of the user on this client. It is either `idle` or `active`. 
  PresenceStatusEnum status;

  /// The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
  int timestamp;

  /// Whether the client is capable of showing mobile/push notifications to the user. 
  bool pushable;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Presence &&
     other.client == client &&
     other.status == status &&
     other.timestamp == timestamp &&
     other.pushable == pushable;

  @override
  int get hashCode =>
    (client == null ? 0 : client.hashCode) +
    (status == null ? 0 : status.hashCode) +
    (timestamp == null ? 0 : timestamp.hashCode) +
    (pushable == null ? 0 : pushable.hashCode);

  @override
  String toString() => 'Presence[client=$client, status=$status, timestamp=$timestamp, pushable=$pushable]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (client != null) {
      json[r'client'] = client;
    }
    if (status != null) {
      json[r'status'] = status;
    }
    if (timestamp != null) {
      json[r'timestamp'] = timestamp;
    }
    if (pushable != null) {
      json[r'pushable'] = pushable;
    }
    return json;
  }

  /// Returns a new [Presence] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static Presence fromJson(Map<String, dynamic> json) => json == null
    ? null
    : Presence(
        client: json[r'client'],
        status: PresenceStatusEnum.fromJson(json[r'status']),
        timestamp: json[r'timestamp'],
        pushable: json[r'pushable'],
    );

  static List<Presence> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <Presence>[]
      : json.map((dynamic value) => Presence.fromJson(value)).toList(growable: true == growable);

  static Map<String, Presence> mapFromJson(Map<String, dynamic> json) {
    final map = <String, Presence>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = Presence.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of Presence-objects as value to a dart map
  static Map<String, List<Presence>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<Presence>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = Presence.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

/// The status of the user on this client. It is either `idle` or `active`. 
class PresenceStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const PresenceStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const idle = PresenceStatusEnum._(r'idle');
  static const active = PresenceStatusEnum._(r'active');

  /// List of all possible values in this [enum][PresenceStatusEnum].
  static const values = <PresenceStatusEnum>[
    idle,
    active,
  ];

  static PresenceStatusEnum fromJson(dynamic value) =>
    PresenceStatusEnumTypeTransformer().decode(value);

  static List<PresenceStatusEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <PresenceStatusEnum>[]
      : json
          .map((value) => PresenceStatusEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [PresenceStatusEnum] to String,
/// and [decode] dynamic data back to [PresenceStatusEnum].
class PresenceStatusEnumTypeTransformer {
  const PresenceStatusEnumTypeTransformer._();

  factory PresenceStatusEnumTypeTransformer() => _instance ??= PresenceStatusEnumTypeTransformer._();

  String encode(PresenceStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PresenceStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PresenceStatusEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case r'idle': return PresenceStatusEnum.idle;
      case r'active': return PresenceStatusEnum.active;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [PresenceStatusEnumTypeTransformer] instance.
  static PresenceStatusEnumTypeTransformer _instance;
}

