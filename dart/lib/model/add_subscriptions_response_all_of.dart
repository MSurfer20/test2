//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AddSubscriptionsResponseAllOf {
  /// Returns a new [AddSubscriptionsResponseAllOf] instance.
  AddSubscriptionsResponseAllOf({
    this.result,
    this.msg,
    this.subscribed = const {},
    this.alreadySubscribed = const {},
    this.unauthorized = const [],
  });

  Object result;

  Object msg;

  /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
  Map<String, List<String>> subscribed;

  /// A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
  Map<String, List<String>> alreadySubscribed;

  /// A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
  List<String> unauthorized;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AddSubscriptionsResponseAllOf &&
     other.result == result &&
     other.msg == msg &&
     other.subscribed == subscribed &&
     other.alreadySubscribed == alreadySubscribed &&
     other.unauthorized == unauthorized;

  @override
  int get hashCode =>
    (result == null ? 0 : result.hashCode) +
    (msg == null ? 0 : msg.hashCode) +
    (subscribed == null ? 0 : subscribed.hashCode) +
    (alreadySubscribed == null ? 0 : alreadySubscribed.hashCode) +
    (unauthorized == null ? 0 : unauthorized.hashCode);

  @override
  String toString() => 'AddSubscriptionsResponseAllOf[result=$result, msg=$msg, subscribed=$subscribed, alreadySubscribed=$alreadySubscribed, unauthorized=$unauthorized]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (result != null) {
      json[r'result'] = result;
    }
    if (msg != null) {
      json[r'msg'] = msg;
    }
    if (subscribed != null) {
      json[r'subscribed'] = subscribed;
    }
    if (alreadySubscribed != null) {
      json[r'already_subscribed'] = alreadySubscribed;
    }
    if (unauthorized != null) {
      json[r'unauthorized'] = unauthorized;
    }
    return json;
  }

  /// Returns a new [AddSubscriptionsResponseAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static AddSubscriptionsResponseAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : AddSubscriptionsResponseAllOf(
        result: json[r'result'],
        msg: json[r'msg'],
        subscribed: json[r'subscribed'] == null
          ? null
          : (json[r'subscribed'] as Map).cast<String, List>(),
        alreadySubscribed: json[r'already_subscribed'] == null
          ? null
          : (json[r'already_subscribed'] as Map).cast<String, List>(),
        unauthorized: json[r'unauthorized'] == null
          ? null
          : (json[r'unauthorized'] as List).cast<String>(),
    );

  static List<AddSubscriptionsResponseAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <AddSubscriptionsResponseAllOf>[]
      : json.map((dynamic value) => AddSubscriptionsResponseAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, AddSubscriptionsResponseAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, AddSubscriptionsResponseAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = AddSubscriptionsResponseAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of AddSubscriptionsResponseAllOf-objects as value to a dart map
  static Map<String, List<AddSubscriptionsResponseAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<AddSubscriptionsResponseAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = AddSubscriptionsResponseAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

