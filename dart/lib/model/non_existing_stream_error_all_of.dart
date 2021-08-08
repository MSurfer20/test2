//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NonExistingStreamErrorAllOf {
  /// Returns a new [NonExistingStreamErrorAllOf] instance.
  NonExistingStreamErrorAllOf({
    this.result,
    this.msg,
    this.code,
    this.stream,
  });

  Object result;

  Object msg;

  Object code;

  /// The name of the stream that could not be found. 
  String stream;

  @override
  bool operator ==(Object other) => identical(this, other) || other is NonExistingStreamErrorAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.code == code &&
     other.stream == stream;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode) +
    (stream == null ? 0 : stream.hashCode);

  @override
  String toString() => 'NonExistingStreamErrorAllOf[result=$result, msg=$msg, code=$code, stream=$stream]';

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
    if (stream != null) {
      json[r'stream'] = stream;
    }
    return json;
  }

  /// Returns a new [NonExistingStreamErrorAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static NonExistingStreamErrorAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : NonExistingStreamErrorAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
        stream: json[r'stream'],
    );

  static List<NonExistingStreamErrorAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <NonExistingStreamErrorAllOf>[]
      : json.map((dynamic value) => NonExistingStreamErrorAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, NonExistingStreamErrorAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, NonExistingStreamErrorAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = NonExistingStreamErrorAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of NonExistingStreamErrorAllOf-objects as value to a dart map
  static Map<String, List<NonExistingStreamErrorAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<NonExistingStreamErrorAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = NonExistingStreamErrorAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

