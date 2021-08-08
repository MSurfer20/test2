//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RateLimitedError {
  /// Returns a new [RateLimitedError] instance.
  RateLimitedError({
    this.result,
    this.msg,
    this.code,
  });

  Object result;

  Object msg;

  Object code;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RateLimitedError &&
     other.result == result &&
     other.msg == msg &&
     other.code == code;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode);

  @override
  String toString() => 'RateLimitedError[result=$result, msg=$msg, code=$code]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    if (code != null) {
      json[r'code'] = code;
    }
    return json;
  }

  /// Returns a new [RateLimitedError] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static RateLimitedError fromJson(Map<String, dynamic> json) => json == null
    ? null
    : RateLimitedError(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
    );

  static List<RateLimitedError> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <RateLimitedError>[]
      : json.map((dynamic value) => RateLimitedError.fromJson(value)).toList(growable: true == growable);

  static Map<String, RateLimitedError> mapFromJson(Map<String, dynamic> json) {
    final map = <String, RateLimitedError>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = RateLimitedError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RateLimitedError-objects as value to a dart map
  static Map<String, List<RateLimitedError>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<RateLimitedError>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = RateLimitedError.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

