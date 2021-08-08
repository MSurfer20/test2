//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InvalidMessageError {
  /// Returns a new [InvalidMessageError] instance.
  InvalidMessageError({
    this.result,
    this.msg,
    this.rawContent,
  });

  Object result;

  Object msg;

  /// The raw content of the message. 
  String rawContent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InvalidMessageError &&
     other.result == result &&
     other.msg == msg &&
     other.rawContent == rawContent;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (rawContent == null ? 0 : rawContent.hashCode);

  @override
  String toString() => 'InvalidMessageError[result=$result, msg=$msg, rawContent=$rawContent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    if (rawContent != null) {
      json[r'raw_content'] = rawContent;
    }
    return json;
  }

  /// Returns a new [InvalidMessageError] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static InvalidMessageError fromJson(Map<String, dynamic> json) => json == null
    ? null
    : InvalidMessageError(
        result: json[r'result'],
        msg: json[r'msg'],
        rawContent: json[r'raw_content'],
    );

  static List<InvalidMessageError> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <InvalidMessageError>[]
      : json.map((dynamic value) => InvalidMessageError.fromJson(value)).toList(growable: true == growable);

  static Map<String, InvalidMessageError> mapFromJson(Map<String, dynamic> json) {
    final map = <String, InvalidMessageError>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = InvalidMessageError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InvalidMessageError-objects as value to a dart map
  static Map<String, List<InvalidMessageError>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<InvalidMessageError>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = InvalidMessageError.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

