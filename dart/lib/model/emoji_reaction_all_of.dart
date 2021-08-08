//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EmojiReactionAllOf {
  /// Returns a new [EmojiReactionAllOf] instance.
  EmojiReactionAllOf({
    this.emojiCode,
    this.emojiName,
    this.reactionType,
    this.userId,
    this.user,
  });

  Object emojiCode;

  Object emojiName;

  Object reactionType;

  Object userId;

  Object user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmojiReactionAllOf &&
     other.emojiCode == emojiCode &&
     other.emojiName == emojiName &&
     other.reactionType == reactionType &&
     other.userId == userId &&
     other.user == user;

  @override
  int get hashCode =>
    (emojiCode == null ? 0 : emojiCode.hashCode) +
    (emojiName == null ? 0 : emojiName.hashCode) +
    (reactionType == null ? 0 : reactionType.hashCode) +
    (userId == null ? 0 : userId.hashCode) +
    (user == null ? 0 : user.hashCode);

  @override
  String toString() => 'EmojiReactionAllOf[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType, userId=$userId, user=$user]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (emojiCode != null) {
      json[r'emoji_code'] = emojiCode;
    }
    if (emojiName != null) {
      json[r'emoji_name'] = emojiName;
    }
    if (reactionType != null) {
      json[r'reaction_type'] = reactionType;
    }
    if (userId != null) {
      json[r'user_id'] = userId;
    }
    if (user != null) {
      json[r'user'] = user;
    }
    return json;
  }

  /// Returns a new [EmojiReactionAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static EmojiReactionAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : EmojiReactionAllOf(
        emojiCode: json[r'emoji_code'],
        emojiName: json[r'emoji_name'],
        reactionType: json[r'reaction_type'],
        userId: json[r'user_id'],
        user: json[r'user'],
    );

  static List<EmojiReactionAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <EmojiReactionAllOf>[]
      : json.map((dynamic value) => EmojiReactionAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, EmojiReactionAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, EmojiReactionAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = EmojiReactionAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EmojiReactionAllOf-objects as value to a dart map
  static Map<String, List<EmojiReactionAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<EmojiReactionAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = EmojiReactionAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

