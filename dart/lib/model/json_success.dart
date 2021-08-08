//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class JsonSuccess {
  /// Returns a new [JsonSuccess] instance.
  JsonSuccess({
    this.result,
    this.msg,
  });

  Object result;

  Object msg;

  @override
  bool operator ==(Object other) => identical(this, other) || other is JsonSuccess &&
     other.result == result &&
     other.msg == msg;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode);

  @override
  String toString() => 'JsonSuccess[result=$result, msg=$msg]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    return json;
  }

  /// Returns a new [JsonSuccess] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static JsonSuccess fromJson(Map<String, dynamic> json) => json == null
    ? null
    : JsonSuccess(
        result: json[r'result'],
        msg: json[r'msg'],
    );

  static List<JsonSuccess> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <JsonSuccess>[]
      : json.map((dynamic value) => JsonSuccess.fromJson(value)).toList(growable: true == growable);

  static Map<String, JsonSuccess> mapFromJson(Map<String, dynamic> json) {
    final map = <String, JsonSuccess>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = JsonSuccess.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of JsonSuccess-objects as value to a dart map
  static Map<String, List<JsonSuccess>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<JsonSuccess>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = JsonSuccess.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

