//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CodedError {
  /// Returns a new [CodedError] instance.
  CodedError({
    this.result,
    this.msg,
    this.code,
  });

  Object result;

  Object msg;

  Object code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CodedError &&
     other.result == result &&
     other.msg == msg &&
     other.code == code;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode);

  @override
  String toString() => 'CodedError[result=$result, msg=$msg, code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    if (code != null) {
      json[r'code'] = code;
    }
    return json;
  }

  /// Returns a new [CodedError] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static CodedError fromJson(Map<String, dynamic> json) => json == null
    ? null
    : CodedError(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
    );

  static List<CodedError> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <CodedError>[]
      : json.map((dynamic value) => CodedError.fromJson(value)).toList(growable: true == growable);

  static Map<String, CodedError> mapFromJson(Map<String, dynamic> json) {
    final map = <String, CodedError>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = CodedError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of CodedError-objects as value to a dart map
  static Map<String, List<CodedError>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<CodedError>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = CodedError.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

