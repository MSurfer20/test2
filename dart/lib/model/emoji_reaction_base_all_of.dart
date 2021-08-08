//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EmojiReactionBaseAllOf {
  /// Returns a new [EmojiReactionBaseAllOf] instance.
  EmojiReactionBaseAllOf({
    this.userId,
    this.user,
  });

  /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
  int userId;

  EmojiReactionBaseAllOfUser user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmojiReactionBaseAllOf &&
     other.userId == userId &&
     other.user == user;

  @override
  int get hashCode =>
    (userId == null ? 0 : userId.hashCode) +
    (user == null ? 0 : user.hashCode);

  @override
  String toString() => 'EmojiReactionBaseAllOf[userId=$userId, user=$user]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (userId != null) {
      json[r'user_id'] = userId;
    }
    if (user != null) {
      json[r'user'] = user;
    }
    return json;
  }

  /// Returns a new [EmojiReactionBaseAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static EmojiReactionBaseAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : EmojiReactionBaseAllOf(
        userId: json[r'user_id'],
        user: EmojiReactionBaseAllOfUser.fromJson(json[r'user']),
    );

  static List<EmojiReactionBaseAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <EmojiReactionBaseAllOf>[]
      : json.map((dynamic value) => EmojiReactionBaseAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, EmojiReactionBaseAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, EmojiReactionBaseAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = EmojiReactionBaseAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EmojiReactionBaseAllOf-objects as value to a dart map
  static Map<String, List<EmojiReactionBaseAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<EmojiReactionBaseAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = EmojiReactionBaseAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

