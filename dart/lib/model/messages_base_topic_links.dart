//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessagesBaseTopicLinks {
  /// Returns a new [MessagesBaseTopicLinks] instance.
  MessagesBaseTopicLinks({
    this.text,
    this.url,
  });

  /// The original link text present in the topic. 
  String text;

  /// The expanded target url which the link points to. 
  String url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessagesBaseTopicLinks &&
     other.text == text &&
     other.url == url;

  @override
  int get hashCode =>
    (text == null ? 0 : text.hashCode) +
    (url == null ? 0 : url.hashCode);

  @override
  String toString() => 'MessagesBaseTopicLinks[text=$text, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (text != null) {
      json[r'text'] = text;
    }
    if (url != null) {
      json[r'url'] = url;
    }
    return json;
  }

  /// Returns a new [MessagesBaseTopicLinks] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static MessagesBaseTopicLinks fromJson(Map<String, dynamic> json) => json == null
    ? null
    : MessagesBaseTopicLinks(
        text: json[r'text'],
        url: json[r'url'],
    );

  static List<MessagesBaseTopicLinks> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <MessagesBaseTopicLinks>[]
      : json.map((dynamic value) => MessagesBaseTopicLinks.fromJson(value)).toList(growable: true == growable);

  static Map<String, MessagesBaseTopicLinks> mapFromJson(Map<String, dynamic> json) {
    final map = <String, MessagesBaseTopicLinks>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = MessagesBaseTopicLinks.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of MessagesBaseTopicLinks-objects as value to a dart map
  static Map<String, List<MessagesBaseTopicLinks>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<MessagesBaseTopicLinks>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = MessagesBaseTopicLinks.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

