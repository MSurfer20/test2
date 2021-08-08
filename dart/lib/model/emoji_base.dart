//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EmojiBase {
  /// Returns a new [EmojiBase] instance.
  EmojiBase({
    this.emojiCode,
    this.emojiName,
    this.reactionType,
  });

  /// A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
  String emojiCode;

  /// Name of the emoji. 
  String emojiName;

  /// One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
  String reactionType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EmojiBase &&
     other.emojiCode == emojiCode &&
     other.emojiName == emojiName &&
     other.reactionType == reactionType;

  @override
  int get hashCode =>
    (emojiCode == null ? 0 : emojiCode.hashCode) +
    (emojiName == null ? 0 : emojiName.hashCode) +
    (reactionType == null ? 0 : reactionType.hashCode);

  @override
  String toString() => 'EmojiBase[emojiCode=$emojiCode, emojiName=$emojiName, reactionType=$reactionType]';

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
    return json;
  }

  /// Returns a new [EmojiBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static EmojiBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : EmojiBase(
        emojiCode: json[r'emoji_code'],
        emojiName: json[r'emoji_name'],
        reactionType: json[r'reaction_type'],
    );

  static List<EmojiBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <EmojiBase>[]
      : json.map((dynamic value) => EmojiBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, EmojiBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, EmojiBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = EmojiBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of EmojiBase-objects as value to a dart map
  static Map<String, List<EmojiBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<EmojiBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = EmojiBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

