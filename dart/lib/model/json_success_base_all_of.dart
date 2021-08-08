//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonSuccessBaseAllOf {
  /// Returns a new [JsonSuccessBaseAllOf] instance.
  JsonSuccessBaseAllOf({
    @required this.result,
    @required this.msg,
  });

  JsonSuccessBaseAllOfResultEnum result;

  String msg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonSuccessBaseAllOf &&
     other.result == result &&
     other.msg == msg;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode);

  @override
  String toString() => 'JsonSuccessBaseAllOf[result=$result, msg=$msg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result;
      json[r'msg'] = msg;
    return json;
  }

  /// Returns a new [JsonSuccessBaseAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonSuccessBaseAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonSuccessBaseAllOf(
        result: JsonSuccessBaseAllOfResultEnum.fromJson(json[r'result']),
        msg: json[r'msg'],
    );

  static List<JsonSuccessBaseAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonSuccessBaseAllOf>[]
      : json.map((dynamic value) => JsonSuccessBaseAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonSuccessBaseAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonSuccessBaseAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonSuccessBaseAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonSuccessBaseAllOf-objects as value to a dart map
  static Map<String, List<JsonSuccessBaseAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonSuccessBaseAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonSuccessBaseAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


class JsonSuccessBaseAllOfResultEnum {
  /// Instantiate a new enum with the provided [value].
  const JsonSuccessBaseAllOfResultEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const success = JsonSuccessBaseAllOfResultEnum._(r'success');

  /// List of all possible values in this [enum][JsonSuccessBaseAllOfResultEnum].
  static const values = <JsonSuccessBaseAllOfResultEnum>[
    success,
  ];

  static JsonSuccessBaseAllOfResultEnum fromJson(dynamic value) =>
    JsonSuccessBaseAllOfResultEnumTypeTransformer().decode(value);

  static List<JsonSuccessBaseAllOfResultEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonSuccessBaseAllOfResultEnum>[]
      : json
          .map((value) => JsonSuccessBaseAllOfResultEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [JsonSuccessBaseAllOfResultEnum] to String,
/// and [decode] dynamic data back to [JsonSuccessBaseAllOfResultEnum].
class JsonSuccessBaseAllOfResultEnumTypeTransformer {
  const JsonSuccessBaseAllOfResultEnumTypeTransformer._();

  factory JsonSuccessBaseAllOfResultEnumTypeTransformer() => _instance ??= JsonSuccessBaseAllOfResultEnumTypeTransformer._();

  String encode(JsonSuccessBaseAllOfResultEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a JsonSuccessBaseAllOfResultEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  JsonSuccessBaseAllOfResultEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case r'success': return JsonSuccessBaseAllOfResultEnum.success;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [JsonSuccessBaseAllOfResultEnumTypeTransformer] instance.
  static JsonSuccessBaseAllOfResultEnumTypeTransformer _instance;
}

