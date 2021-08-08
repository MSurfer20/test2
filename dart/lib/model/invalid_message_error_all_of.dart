//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InvalidMessageErrorAllOf {
  /// Returns a new [InvalidMessageErrorAllOf] instance.
  InvalidMessageErrorAllOf({
    this.result,
    this.msg,
    this.rawContent,
  });

  Object result;

  Object msg;

  /// The raw content of the message. 
  String rawContent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InvalidMessageErrorAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.rawContent == rawContent;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (rawContent == null ? 0 : rawContent.hashCode);

  @override
  String toString() => 'InvalidMessageErrorAllOf[result=$result, msg=$msg, rawContent=$rawContent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (result != null) {
      json[r'result'] = result;
    }
    if (msg != null) {
      json[r'msg'] = msg;
    }
    if (rawContent != null) {
      json[r'raw_content'] = rawContent;
    }
    return json;
  }

  /// Returns a new [InvalidMessageErrorAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static InvalidMessageErrorAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : InvalidMessageErrorAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        rawContent: json[r'raw_content'],
    );

  static List<InvalidMessageErrorAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <InvalidMessageErrorAllOf>[]
      : json.map((dynamic value) => InvalidMessageErrorAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, InvalidMessageErrorAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, InvalidMessageErrorAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = InvalidMessageErrorAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InvalidMessageErrorAllOf-objects as value to a dart map
  static Map<String, List<InvalidMessageErrorAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<InvalidMessageErrorAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = InvalidMessageErrorAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

