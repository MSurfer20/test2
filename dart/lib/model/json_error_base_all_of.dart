//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonErrorBaseAllOf {
  /// Returns a new [JsonErrorBaseAllOf] instance.
  JsonErrorBaseAllOf({
    @required this.result,
    @required this.msg,
  });

  JsonErrorBaseAllOfResultEnum result;

  String msg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonErrorBaseAllOf &&
     other.result == result &&
     other.msg == msg;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode);

  @override
  String toString() => 'JsonErrorBaseAllOf[result=$result, msg=$msg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result;
      json[r'msg'] = msg;
    return json;
  }

  /// Returns a new [JsonErrorBaseAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonErrorBaseAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonErrorBaseAllOf(
        result: JsonErrorBaseAllOfResultEnum.fromJson(json[r'result']),
        msg: json[r'msg'],
    );

  static List<JsonErrorBaseAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonErrorBaseAllOf>[]
      : json.map((dynamic value) => JsonErrorBaseAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonErrorBaseAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonErrorBaseAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonErrorBaseAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonErrorBaseAllOf-objects as value to a dart map
  static Map<String, List<JsonErrorBaseAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonErrorBaseAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonErrorBaseAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


class JsonErrorBaseAllOfResultEnum {
  /// Instantiate a new enum with the provided [value].
  const JsonErrorBaseAllOfResultEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const error = JsonErrorBaseAllOfResultEnum._(r'error');

  /// List of all possible values in this [enum][JsonErrorBaseAllOfResultEnum].
  static const values = <JsonErrorBaseAllOfResultEnum>[
    error,
  ];

  static JsonErrorBaseAllOfResultEnum fromJson(dynamic value) =>
    JsonErrorBaseAllOfResultEnumTypeTransformer().decode(value);

  static List<JsonErrorBaseAllOfResultEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonErrorBaseAllOfResultEnum>[]
      : json
          .map((value) => JsonErrorBaseAllOfResultEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [JsonErrorBaseAllOfResultEnum] to String,
/// and [decode] dynamic data back to [JsonErrorBaseAllOfResultEnum].
class JsonErrorBaseAllOfResultEnumTypeTransformer {
  const JsonErrorBaseAllOfResultEnumTypeTransformer._();

  factory JsonErrorBaseAllOfResultEnumTypeTransformer() => _instance ??= JsonErrorBaseAllOfResultEnumTypeTransformer._();

  String encode(JsonErrorBaseAllOfResultEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a JsonErrorBaseAllOfResultEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  JsonErrorBaseAllOfResultEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case r'error': return JsonErrorBaseAllOfResultEnum.error;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [JsonErrorBaseAllOfResultEnumTypeTransformer] instance.
  static JsonErrorBaseAllOfResultEnumTypeTransformer _instance;
}

