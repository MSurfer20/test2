//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CodedErrorBase {
  /// Returns a new [CodedErrorBase] instance.
  CodedErrorBase({
    this.result,
    this.msg,
    this.code,
  });

  Object result;

  Object msg;

  /// A string that identifies the error. 
  String code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CodedErrorBase &&
     other.result == result &&
     other.msg == msg &&
     other.code == code;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode);

  @override
  String toString() => 'CodedErrorBase[result=$result, msg=$msg, code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    if (code != null) {
      json[r'code'] = code;
    }
    return json;
  }

  /// Returns a new [CodedErrorBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static CodedErrorBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : CodedErrorBase(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
    );

  static List<CodedErrorBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <CodedErrorBase>[]
      : json.map((dynamic value) => CodedErrorBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, CodedErrorBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, CodedErrorBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = CodedErrorBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of CodedErrorBase-objects as value to a dart map
  static Map<String, List<CodedErrorBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<CodedErrorBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = CodedErrorBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

