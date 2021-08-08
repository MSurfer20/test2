//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EmojiReactionBase {
  /// Returns a new [EmojiReactionBase] instance.
  EmojiReactionBase({
    this.emojiCode,
    this.emojiName,
    this.reactionType,
    this.userId,
    this.user,
  });

  /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
  String emojiCode;

  /// Name of the emoji. 
  String emojiName;

  /// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  String reactionType;

  /// The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
  int userId;

  EmojiReactionBaseAllOfUser user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmojiReactionBase &&
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
  String toString() => 'EmojiReactionBase[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType, userId=$userId, user=$user]';

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

  /// Returns a new [EmojiReactionBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static EmojiReactionBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : EmojiReactionBase(
        emojiCode: json[r'emoji_code'],
        emojiName: json[r'emoji_name'],
        reactionType: json[r'reaction_type'],
        userId: json[r'user_id'],
        user: EmojiReactionBaseAllOfUser.fromJson(json[r'user']),
    );

  static List<EmojiReactionBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <EmojiReactionBase>[]
      : json.map((dynamic value) => EmojiReactionBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, EmojiReactionBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, EmojiReactionBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = EmojiReactionBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EmojiReactionBase-objects as value to a dart map
  static Map<String, List<EmojiReactionBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<EmojiReactionBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = EmojiReactionBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

