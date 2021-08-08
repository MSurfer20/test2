//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonResponseBase {
  /// Returns a new [JsonResponseBase] instance.
  JsonResponseBase({
    this.result,
  });

  String result;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonResponseBase &&
     other.result == result;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode);

  @override
  String toString() => 'JsonResponseBase[result=$result]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (result != null) {
      json[r'result'] = result;
    }
    return json;
  }

  /// Returns a new [JsonResponseBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonResponseBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonResponseBase(
        result: json[r'result'],
    );

  static List<JsonResponseBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonResponseBase>[]
      : json.map((dynamic value) => JsonResponseBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonResponseBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonResponseBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonResponseBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonResponseBase-objects as value to a dart map
  static Map<String, List<JsonResponseBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonResponseBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonResponseBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

