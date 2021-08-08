//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiKeyResponseAllOf {
  /// Returns a new [ApiKeyResponseAllOf] instance.
  ApiKeyResponseAllOf({
    this.result,
    this.msg,
    @required this.apiKey,
    @required this.email,
  });

  Object result;

  Object msg;

  /// The API key that can be used to authenticate as the requested user. 
  String apiKey;

  /// The email address of the user who owns the API key 
  String email;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ApiKeyResponseAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.apiKey == apiKey &&
     other.email == email;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (apiKey == null ? 0 : apiKey.hashCode) +
    (email == null ? 0 : email.hashCode);

  @override
  String toString() => 'ApiKeyResponseAllOf[result=$result, msg=$msg, apiKey=$apiKey, email=$email]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (result != null) {
      json[r'result'] = result;
    }
    if (msg != null) {
      json[r'msg'] = msg;
    }
      json[r'api_key'] = apiKey;
      json[r'email'] = email;
    return json;
  }

  /// Returns a new [ApiKeyResponseAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static ApiKeyResponseAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : ApiKeyResponseAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        apiKey: json[r'api_key'],
        email: json[r'email'],
    );

  static List<ApiKeyResponseAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <ApiKeyResponseAllOf>[]
      : json.map((dynamic value) => ApiKeyResponseAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, ApiKeyResponseAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, ApiKeyResponseAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = ApiKeyResponseAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of ApiKeyResponseAllOf-objects as value to a dart map
  static Map<String, List<ApiKeyResponseAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<ApiKeyResponseAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = ApiKeyResponseAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

