//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonSuccessAllOf {
  /// Returns a new [JsonSuccessAllOf] instance.
  JsonSuccessAllOf({
    this.result,
    this.msg,
  });

  Object result;

  Object msg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonSuccessAllOf &&
     other.result == result &&
     other.msg == msg;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode);

  @override
  String toString() => 'JsonSuccessAllOf[result=$result, msg=$msg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (result != null) {
      json[r'result'] = result;
    }
    if (msg != null) {
      json[r'msg'] = msg;
    }
    return json;
  }

  /// Returns a new [JsonSuccessAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonSuccessAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonSuccessAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
    );

  static List<JsonSuccessAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonSuccessAllOf>[]
      : json.map((dynamic value) => JsonSuccessAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonSuccessAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonSuccessAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonSuccessAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonSuccessAllOf-objects as value to a dart map
  static Map<String, List<JsonSuccessAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonSuccessAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonSuccessAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

