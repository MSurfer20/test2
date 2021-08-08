//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealmEmoji {
  /// Returns a new [RealmEmoji] instance.
  RealmEmoji({
    this.id,
    this.name,
    this.sourceUrl,
    this.deactivated,
    this.authorId,
  });

  /// The ID for this emoji, same as the object's key. 
  String id;

  /// The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
  String name;

  /// The path relative to the organization's URL where the emoji's image can be found. 
  String sourceUrl;

  /// Whether the emoji has been deactivated or not. 
  bool deactivated;

  /// The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
  int authorId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealmEmoji &&
     other.id == id &&
     other.name == name &&
     other.sourceUrl == sourceUrl &&
     other.deactivated == deactivated &&
     other.authorId == authorId;

  @override
  int get hashCode =>
    (id == null ? 0 : id.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (sourceUrl == null ? 0 : sourceUrl.hashCode) +
    (deactivated == null ? 0 : deactivated.hashCode) +
    (authorId == null ? 0 : authorId.hashCode);

  @override
  String toString() => 'RealmEmoji[id=$id, name=$name, sourceUrl=$sourceUrl, deactivated=$deactivated, authorId=$authorId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (id != null) {
      json[r'id'] = id;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (sourceUrl != null) {
      json[r'source_url'] = sourceUrl;
    }
    if (deactivated != null) {
      json[r'deactivated'] = deactivated;
    }
    if (authorId != null) {
      json[r'author_id'] = authorId;
    }
    return json;
  }

  /// Returns a new [RealmEmoji] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static RealmEmoji fromJson(Map<String, dynamic> json) => json == null
    ? null
    : RealmEmoji(
        id: json[r'id'],
        name: json[r'name'],
        sourceUrl: json[r'source_url'],
        deactivated: json[r'deactivated'],
        authorId: json[r'author_id'],
    );

  static List<RealmEmoji> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <RealmEmoji>[]
      : json.map((dynamic value) => RealmEmoji.fromJson(value)).toList(growable: true == growable);

  static Map<String, RealmEmoji> mapFromJson(Map<String, dynamic> json) {
    final map = <String, RealmEmoji>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = RealmEmoji.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RealmEmoji-objects as value to a dart map
  static Map<String, List<RealmEmoji>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<RealmEmoji>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = RealmEmoji.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

