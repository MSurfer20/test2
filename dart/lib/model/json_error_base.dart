//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonErrorBase {
  /// Returns a new [JsonErrorBase] instance.
  JsonErrorBase({
    @required this.result,
    @required this.msg,
  });

  JsonErrorBaseResultEnum result;

  String msg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonErrorBase &&
     other.result == result &&
     other.msg == msg;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode);

  @override
  String toString() => 'JsonErrorBase[result=$result, msg=$msg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result;
      json[r'msg'] = msg;
    return json;
  }

  /// Returns a new [JsonErrorBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonErrorBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonErrorBase(
        result: JsonErrorBaseResultEnum.fromJson(json[r'result']),
        msg: json[r'msg'],
    );

  static List<JsonErrorBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonErrorBase>[]
      : json.map((dynamic value) => JsonErrorBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonErrorBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonErrorBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonErrorBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonErrorBase-objects as value to a dart map
  static Map<String, List<JsonErrorBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonErrorBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonErrorBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


class JsonErrorBaseResultEnum {
  /// Instantiate a new enum with the provided [value].
  const JsonErrorBaseResultEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const error = JsonErrorBaseResultEnum._(r'error');

  /// List of all possible values in this [enum][JsonErrorBaseResultEnum].
  static const values = <JsonErrorBaseResultEnum>[
    error,
  ];

  static JsonErrorBaseResultEnum fromJson(dynamic value) =>
    JsonErrorBaseResultEnumTypeTransformer().decode(value);

  static List<JsonErrorBaseResultEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonErrorBaseResultEnum>[]
      : json
          .map((value) => JsonErrorBaseResultEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [JsonErrorBaseResultEnum] to String,
/// and [decode] dynamic data back to [JsonErrorBaseResultEnum].
class JsonErrorBaseResultEnumTypeTransformer {
  const JsonErrorBaseResultEnumTypeTransformer._();

  factory JsonErrorBaseResultEnumTypeTransformer() => _instance ??= JsonErrorBaseResultEnumTypeTransformer._();

  String encode(JsonErrorBaseResultEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a JsonErrorBaseResultEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  JsonErrorBaseResultEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case r'error': return JsonErrorBaseResultEnum.error;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [JsonErrorBaseResultEnumTypeTransformer] instance.
  static JsonErrorBaseResultEnumTypeTransformer _instance;
}

