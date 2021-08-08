//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BasicStreamBase {
  /// Returns a new [BasicStreamBase] instance.
  BasicStreamBase({
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

  /// The unique ID of the stream. 
  int streamId;

  /// The name of the stream. 
  String name;

  /// The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
  String description;

  /// The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
  int dateCreated;

  /// Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
  bool inviteOnly;

  /// The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
  String renderedDescription;

  /// Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
  bool isWebPublic;

  /// Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
  int streamPostPolicy;

  /// Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
  int messageRetentionDays;

  /// Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
  bool historyPublicToSubscribers;

  /// The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
  int firstMessageId;

  /// Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
  bool isAnnouncementOnly;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BasicStreamBase &&
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
  String toString() => 'BasicStreamBase[streamId=$streamId, name=$name, description=$description, dateCreated=$dateCreated, inviteOnly=$inviteOnly, renderedDescription=$renderedDescription, isWebPublic=$isWebPublic, streamPostPolicy=$streamPostPolicy, messageRetentionDays=$messageRetentionDays, historyPublicToSubscribers=$historyPublicToSubscribers, firstMessageId=$firstMessageId, isAnnouncementOnly=$isAnnouncementOnly]';

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

  /// Returns a new [BasicStreamBase] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static BasicStreamBase fromJson(Map<String, dynamic> json) => json == null
    ? null
    : BasicStreamBase(
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

  static List<BasicStreamBase> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <BasicStreamBase>[]
      : json.map((dynamic value) => BasicStreamBase.fromJson(value)).toList(growable: true == growable);

  static Map<String, BasicStreamBase> mapFromJson(Map<String, dynamic> json) {
    final map = <String, BasicStreamBase>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = BasicStreamBase.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of BasicStreamBase-objects as value to a dart map
  static Map<String, List<BasicStreamBase>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<BasicStreamBase>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = BasicStreamBase.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

