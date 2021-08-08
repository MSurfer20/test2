//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CodedErrorBaseAllOf {
  /// Returns a new [CodedErrorBaseAllOf] instance.
  CodedErrorBaseAllOf({
    this.result,
    this.msg,
    this.code,
  });

  Object result;

  Object msg;

  /// A string that identifies the error. 
  String code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CodedErrorBaseAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.code == code;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode);

  @override
  String toString() => 'CodedErrorBaseAllOf[result=$result, msg=$msg, code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (result != null) {
      json[r'result'] = result;
    }
    if (msg != null) {
      json[r'msg'] = msg;
    }
    if (code != null) {
      json[r'code'] = code;
    }
    return json;
  }

  /// Returns a new [CodedErrorBaseAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static CodedErrorBaseAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : CodedErrorBaseAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
    );

  static List<CodedErrorBaseAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <CodedErrorBaseAllOf>[]
      : json.map((dynamic value) => CodedErrorBaseAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, CodedErrorBaseAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, CodedErrorBaseAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = CodedErrorBaseAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of CodedErrorBaseAllOf-objects as value to a dart map
  static Map<String, List<CodedErrorBaseAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<CodedErrorBaseAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = CodedErrorBaseAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

