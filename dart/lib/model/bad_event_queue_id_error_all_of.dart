//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BadEventQueueIdErrorAllOf {
  /// Returns a new [BadEventQueueIdErrorAllOf] instance.
  BadEventQueueIdErrorAllOf({
    this.result,
    this.msg,
    this.code,
    this.queueId,
  });

  Object result;

  Object msg;

  Object code;

  /// The string that identifies the invalid event queue. 
  String queueId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BadEventQueueIdErrorAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.code == code &&
     other.queueId == queueId;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (code == null ? 0 : code.hashCode) +
    (queueId == null ? 0 : queueId.hashCode);

  @override
  String toString() => 'BadEventQueueIdErrorAllOf[result=$result, msg=$msg, code=$code, queueId=$queueId]';

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
    if (queueId != null) {
      json[r'queue_id'] = queueId;
    }
    return json;
  }

  /// Returns a new [BadEventQueueIdErrorAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BadEventQueueIdErrorAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BadEventQueueIdErrorAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
        queueId: json[r'queue_id'],
    );

  static List<BadEventQueueIdErrorAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BadEventQueueIdErrorAllOf>[]
      : json.map((dynamic value) => BadEventQueueIdErrorAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, BadEventQueueIdErrorAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BadEventQueueIdErrorAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BadEventQueueIdErrorAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BadEventQueueIdErrorAllOf-objects as value to a dart map
  static Map<String, List<BadEventQueueIdErrorAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BadEventQueueIdErrorAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BadEventQueueIdErrorAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

