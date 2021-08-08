//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BadEventQueueIdError {
  /// Returns a new [BadEventQueueIdError] instance.
  BadEventQueueIdError({
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
  bool operator ==(Object other) => identical(this, other) || other is BadEventQueueIdError &&
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
  String toString() => 'BadEventQueueIdError[result=$result, msg=$msg, code=$code, queueId=$queueId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'result'] = result == null ? null : result;
      json[r'msg'] = msg == null ? null : msg;
    if (code != null) {
      json[r'code'] = code;
    }
    if (queueId != null) {
      json[r'queue_id'] = queueId;
    }
    return json;
  }

  /// Returns a new [BadEventQueueIdError] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BadEventQueueIdError fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BadEventQueueIdError(
        result: json[r'result'],
        msg: json[r'msg'],
        code: json[r'code'],
        queueId: json[r'queue_id'],
    );

  static List<BadEventQueueIdError> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BadEventQueueIdError>[]
      : json.map((dynamic value) => BadEventQueueIdError.fromJson(value)).toList(growable: true == growable);

  static Map<String, BadEventQueueIdError> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BadEventQueueIdError>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BadEventQueueIdError.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BadEventQueueIdError-objects as value to a dart map
  static Map<String, List<BadEventQueueIdError>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BadEventQueueIdError>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BadEventQueueIdError.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

