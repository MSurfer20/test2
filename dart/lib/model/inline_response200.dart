//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InlineResponse200 {
  /// Returns a new [InlineResponse200] instance.
  InlineResponse200({
    this.botEmail,
    this.botFullName,
    this.data,
    this.trigger,
    this.token,
    this.message,
  });

  /// Email of the bot user. 
  String botEmail;

  /// The full name of the bot user. 
  String botFullName;

  /// The message content, in raw Markdown format (not rendered to HTML). 
  String data;

  /// What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
  String trigger;

  /// A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
  String token;

  /// A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
  MessagesBase message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InlineResponse200 &&
     other.botEmail == botEmail &&
     other.botFullName == botFullName &&
     other.data == data &&
     other.trigger == trigger &&
     other.token == token &&
     other.message == message;

  @override
  int get hashCode =>
    (botEmail == null ? 0 : botEmail.hashCode) +
    (botFullName == null ? 0 : botFullName.hashCode) +
    (data == null ? 0 : data.hashCode) +
    (trigger == null ? 0 : trigger.hashCode) +
    (token == null ? 0 : token.hashCode) +
    (message == null ? 0 : message.hashCode);

  @override
  String toString() => 'InlineResponse200[botEmail=$botEmail, botFullName=$botFullName, data=$data, trigger=$trigger, token=$token, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (botEmail != null) {
      json[r'bot_email'] = botEmail;
    }
    if (botFullName != null) {
      json[r'bot_full_name'] = botFullName;
    }
    if (data != null) {
      json[r'data'] = data;
    }
    if (trigger != null) {
      json[r'trigger'] = trigger;
    }
    if (token != null) {
      json[r'token'] = token;
    }
    if (message != null) {
      json[r'message'] = message;
    }
    return json;
  }

  /// Returns a new [InlineResponse200] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static InlineResponse200 fromJson(Map<String, dynamic> json) => json == null
    ? null
    : InlineResponse200(
        botEmail: json[r'bot_email'],
        botFullName: json[r'bot_full_name'],
        data: json[r'data'],
        trigger: json[r'trigger'],
        token: json[r'token'],
        message: MessagesBase.fromJson(json[r'message']),
    );

  static List<InlineResponse200> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <InlineResponse200>[]
      : json.map((dynamic value) => InlineResponse200.fromJson(value)).toList(growable: true == growable);

  static Map<String, InlineResponse200> mapFromJson(Map<String, dynamic> json) {
    final map = <String, InlineResponse200>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = InlineResponse200.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of InlineResponse200-objects as value to a dart map
  static Map<String, List<InlineResponse200>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<InlineResponse200>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = InlineResponse200.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

