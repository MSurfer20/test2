//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonSuccessBase {
  /// Returns a new [JsonSuccessBase] instance.
  JsonSuccessBase({
    @required this.result,
    @required this.msg,
  });

  JsonSuccessBaseResultEnum result;

  String msg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonSuccessBase &&
     other.result == result &&
     other.msg == msg;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode);

  @override
  String toString() => 'JsonSuccessBase[result=$result, msg=$msg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result;
      json[r'msg'] = msg;
    return json;
  }

  /// Returns a new [JsonSuccessBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonSuccessBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonSuccessBase(
        result: JsonSuccessBaseResultEnum.fromJson(json[r'result']),
        msg: json[r'msg'],
    );

  static List<JsonSuccessBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonSuccessBase>[]
      : json.map((dynamic value) => JsonSuccessBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonSuccessBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonSuccessBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonSuccessBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonSuccessBase-objects as value to a dart map
  static Map<String, List<JsonSuccessBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonSuccessBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonSuccessBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}


class JsonSuccessBaseResultEnum {
  /// Instantiate a new enum with the provided [value].
  const JsonSuccessBaseResultEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const success = JsonSuccessBaseResultEnum._(r'success');

  /// List of all possible values in this [enum][JsonSuccessBaseResultEnum].
  static const values = <JsonSuccessBaseResultEnum>[
    success,
  ];

  static JsonSuccessBaseResultEnum fromJson(dynamic value) =>
    JsonSuccessBaseResultEnumTypeTransformer().decode(value);

  static List<JsonSuccessBaseResultEnum> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonSuccessBaseResultEnum>[]
      : json
          .map((value) => JsonSuccessBaseResultEnum.fromJson(value))
          .toList(growable: true == growable);
}

/// Transformation class that can [encode] an instance of [JsonSuccessBaseResultEnum] to String,
/// and [decode] dynamic data back to [JsonSuccessBaseResultEnum].
class JsonSuccessBaseResultEnumTypeTransformer {
  const JsonSuccessBaseResultEnumTypeTransformer._();

  factory JsonSuccessBaseResultEnumTypeTransformer() => _instance ??= JsonSuccessBaseResultEnumTypeTransformer._();

  String encode(JsonSuccessBaseResultEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a JsonSuccessBaseResultEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  JsonSuccessBaseResultEnum decode(dynamic data, {bool allowNull}) {
    switch (data) {
      case r'success': return JsonSuccessBaseResultEnum.success;
      default:
        if (allowNull == false) {
          throw ArgumentError('Unknown enum value to decode: $data');
        }
    }
    return null;
  }

  /// Singleton [JsonSuccessBaseResultEnumTypeTransformer] instance.
  static JsonSuccessBaseResultEnumTypeTransformer _instance;
}

