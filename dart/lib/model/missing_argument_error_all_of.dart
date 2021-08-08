//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MissingArgumentErrorAllOf {
  /// Returns a new [MissingArgumentErrorAllOf] instance.
  MissingArgumentErrorAllOf({
    this.result,
    this.msg,
    this.code,
    this.varName,
  });

  Object result;

  Object msg;

  Object code;

  /// It contains the information about the missing parameter. 
  String varName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MissingArgumentErrorAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.code == code &&
     other.varName == varName;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode) +
    (varName == null ? 0 : varName.hashCode);

  @override
  String toString() => 'MissingArgumentErrorAllOf[result=$result, msg=$msg, code=$code, varName=$varName]';

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
    if (varName != null) {
      json[r'var_name'] = varName;
    }
    return json;
  }

  /// Returns a new [MissingArgumentErrorAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static MissingArgumentErrorAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : MissingArgumentErrorAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
        varName: json[r'var_name'],
    );

  static List<MissingArgumentErrorAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <MissingArgumentErrorAllOf>[]
      : json.map((dynamic value) => MissingArgumentErrorAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, MissingArgumentErrorAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, MissingArgumentErrorAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = MissingArgumentErrorAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of MissingArgumentErrorAllOf-objects as value to a dart map
  static Map<String, List<MissingArgumentErrorAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<MissingArgumentErrorAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = MissingArgumentErrorAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

