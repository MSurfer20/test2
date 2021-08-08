//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class NonExistingStreamError {
  /// Returns a new [NonExistingStreamError] instance.
  NonExistingStreamError({
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
  bool operator ==(Object other) => identical(this, other) || other is NonExistingStreamError &&
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
  String toString() => 'NonExistingStreamError[result=$result, msg=$msg, code=$code, stream=$stream]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    if (code != null) {
      json[r'code'] = code;
    }
    if (stream != null) {
      json[r'stream'] = stream;
    }
    return json;
  }

  /// Returns a new [NonExistingStreamError] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static NonExistingStreamError fromJson(Map<String, dynamic> json) => json == null
    ? null
    : NonExistingStreamError(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
        stream: json[r'stream'],
    );

  static List<NonExistingStreamError> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <NonExistingStreamError>[]
      : json.map((dynamic value) => NonExistingStreamError.fromJson(value)).toList(growable: true == growable);

  static Map<String, NonExistingStreamError> mapFromJson(Map<String, dynamic> json) {
    final map = <String, NonExistingStreamError>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = NonExistingStreamError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of NonExistingStreamError-objects as value to a dart map
  static Map<String, List<NonExistingStreamError>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<NonExistingStreamError>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = NonExistingStreamError.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

