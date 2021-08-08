//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BasicStreamAllOf {
  /// Returns a new [BasicStreamAllOf] instance.
  BasicStreamAllOf({
    this.streamId,
    this.name,
    this.description,
    this.dateCreated,
    this.inviteOnly,
    this.renderedDescription,
    this.isWebPublic,
    this.streamPostPolicy,
    this.messageRetentionDays,
    this.historyPublicToSubscribers,
    this.firstMessageId,
    this.isAnnouncementOnly,
  });

  Object streamId;

  Object name;

  Object description;

  Object dateCreated;

  Object inviteOnly;

  Object renderedDescription;

  Object isWebPublic;

  Object streamPostPolicy;

  Object messageRetentionDays;

  Object historyPublicToSubscribers;

  Object firstMessageId;

  Object isAnnouncementOnly;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BasicStreamAllOf &&
     other.streamId == streamId &&
     other.name == name &&
     other.description == description &&
     other.dateCreated == dateCreated &&
     other.inviteOnly == inviteOnly &&
     other.renderedDescription == renderedDescription &&
     other.isWebPublic == isWebPublic &&
     other.streamPostPolicy == streamPostPolicy &&
     other.messageRetentionDays == messageRetentionDays &&
     other.historyPublicToSubscribers == historyPublicToSubscribers &&
     other.firstMessageId == firstMessageId &&
     other.isAnnouncementOnly == isAnnouncementOnly;

  @override
  int get hashCode =>
    (streamId == null ? 0 : streamId.hashCode) +
    (name == null ? 0 : name.hashCode) +
    (description == null ? 0 : description.hashCode) +
    (dateCreated == null ? 0 : dateCreated.hashCode) +
    (inviteOnly == null ? 0 : inviteOnly.hashCode) +
    (renderedDescription == null ? 0 : renderedDescription.hashCode) +
    (isWebPublic == null ? 0 : isWebPublic.hashCode) +
    (streamPostPolicy == null ? 0 : streamPostPolicy.hashCode) +
    (messageRetentionDays == null ? 0 : messageRetentionDays.hashCode) +
    (historyPublicToSubscribers == null ? 0 : historyPublicToSubscribers.hashCode) +
    (firstMessageId == null ? 0 : firstMessageId.hashCode) +
    (isAnnouncementOnly == null ? 0 : isAnnouncementOnly.hashCode);

  @override
  String toString() => 'BasicStreamAllOf[streamId=$streamId, name=$name, description=$description, dateCreated=$dateCreated, inviteOnly=$inviteOnly, renderedDescription=$renderedDescription, isWebPublic=$isWebPublic, streamPostPolicy=$streamPostPolicy, messageRetentionDays=$messageRetentionDays, historyPublicToSubscribers=$historyPublicToSubscribers, firstMessageId=$firstMessageId, isAnnouncementOnly=$isAnnouncementOnly]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (streamId != null) {
      json[r'stream_id'] = streamId;
    }
    if (name != null) {
      json[r'name'] = name;
    }
    if (description != null) {
      json[r'description'] = description;
    }
    if (dateCreated != null) {
      json[r'date_created'] = dateCreated;
    }
    if (inviteOnly != null) {
      json[r'invite_only'] = inviteOnly;
    }
    if (renderedDescription != null) {
      json[r'rendered_description'] = renderedDescription;
    }
    if (isWebPublic != null) {
      json[r'is_web_public'] = isWebPublic;
    }
    if (streamPostPolicy != null) {
      json[r'stream_post_policy'] = streamPostPolicy;
    }
    if (messageRetentionDays != null) {
      json[r'message_retention_days'] = messageRetentionDays;
    }
    if (historyPublicToSubscribers != null) {
      json[r'history_public_to_subscribers'] = historyPublicToSubscribers;
    }
    if (firstMessageId != null) {
      json[r'first_message_id'] = firstMessageId;
    }
    if (isAnnouncementOnly != null) {
      json[r'is_announcement_only'] = isAnnouncementOnly;
    }
    return json;
  }

  /// Returns a new [BasicStreamAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BasicStreamAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BasicStreamAllOf(
        streamId: json[r'stream_id'],
        name: json[r'name'],
        description: json[r'description'],
        dateCreated: json[r'date_created'],
        inviteOnly: json[r'invite_only'],
        renderedDescription: json[r'rendered_description'],
        isWebPublic: json[r'is_web_public'],
        streamPostPolicy: json[r'stream_post_policy'],
        messageRetentionDays: json[r'message_retention_days'],
        historyPublicToSubscribers: json[r'history_public_to_subscribers'],
        firstMessageId: json[r'first_message_id'],
        isAnnouncementOnly: json[r'is_announcement_only'],
    );

  static List<BasicStreamAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BasicStreamAllOf>[]
      : json.map((dynamic value) => BasicStreamAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, BasicStreamAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BasicStreamAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BasicStreamAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BasicStreamAllOf-objects as value to a dart map
  static Map<String, List<BasicStreamAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BasicStreamAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BasicStreamAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

