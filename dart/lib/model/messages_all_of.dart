//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessagesAllOf {
  /// Returns a new [MessagesAllOf] instance.
  MessagesAllOf({
    this.avatarUrl,
    this.client,
    this.content,
    this.contentType,
    this.displayRecipient,
    this.id,
    this.isMeMessage,
    this.reactions,
    this.recipientId,
    this.senderEmail,
    this.senderFullName,
    this.senderId,
    this.senderRealmStr,
    this.streamId,
    this.subject,
    this.topicLinks,
    this.submessages,
    this.timestamp,
    this.type,
  });

  Object avatarUrl;

  Object client;

  Object content;

  Object contentType;

  Object displayRecipient;

  Object id;

  Object isMeMessage;

  Object reactions;

  Object recipientId;

  Object senderEmail;

  Object senderFullName;

  Object senderId;

  Object senderRealmStr;

  Object streamId;

  Object subject;

  Object topicLinks;

  Object submessages;

  Object timestamp;

  Object type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessagesAllOf &&
     other.avatarUrl == avatarUrl &&
     other.client == client &&
     other.content == content &&
     other.contentType == contentType &&
     other.displayRecipient == displayRecipient &&
     other.id == id &&
     other.isMeMessage == isMeMessage &&
     other.reactions == reactions &&
     other.recipientId == recipientId &&
     other.senderEmail == senderEmail &&
     other.senderFullName == senderFullName &&
     other.senderId == senderId &&
     other.senderRealmStr == senderRealmStr &&
     other.streamId == streamId &&
     other.subject == subject &&
     other.topicLinks == topicLinks &&
     other.submessages == submessages &&
     other.timestamp == timestamp &&
     other.type == type;

  @override
  int get hashCode =>
    (avatarUrl == null ? 0 : avatarUrl.hashCode) +
    (client == null ? 0 : client.hashCode) +
    (content == null ? 0 : content.hashCode) +
    (contentType == null ? 0 : contentType.hashCode) +
    (displayRecipient == null ? 0 : displayRecipient.hashCode) +
    (id == null ? 0 : id.hashCode) +
    (isMeMessage == null ? 0 : isMeMessage.hashCode) +
    (reactions == null ? 0 : reactions.hashCode) +
    (recipientId == null ? 0 : recipientId.hashCode) +
    (senderEmail == null ? 0 : senderEmail.hashCode) +
    (senderFullName == null ? 0 : senderFullName.hashCode) +
    (senderId == null ? 0 : senderId.hashCode) +
    (senderRealmStr == null ? 0 : senderRealmStr.hashCode) +
    (streamId == null ? 0 : streamId.hashCode) +
    (subject == null ? 0 : subject.hashCode) +
    (topicLinks == null ? 0 : topicLinks.hashCode) +
    (submessages == null ? 0 : submessages.hashCode) +
    (timestamp == null ? 0 : timestamp.hashCode) +
    (type == null ? 0 : type.hashCode);

  @override
  String toString() => 'MessagesAllOf[avatarUrl=$avatarUrl, client=$client, content=$content, contentType=$contentType, displayRecipient=$displayRecipient, id=$id, isMeMessage=$isMeMessage, reactions=$reactions, recipientId=$recipientId, senderEmail=$senderEmail, senderFullName=$senderFullName, senderId=$senderId, senderRealmStr=$senderRealmStr, streamId=$streamId, subject=$subject, topicLinks=$topicLinks, submessages=$submessages, timestamp=$timestamp, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (avatarUrl != null) {
      json[r'avatar_url'] = avatarUrl;
    }
    if (client != null) {
      json[r'client'] = client;
    }
    if (content != null) {
      json[r'content'] = content;
    }
    if (contentType != null) {
      json[r'content_type'] = contentType;
    }
    if (displayRecipient != null) {
      json[r'display_recipient'] = displayRecipient;
    }
    if (id != null) {
      json[r'id'] = id;
    }
    if (isMeMessage != null) {
      json[r'is_me_message'] = isMeMessage;
    }
    if (reactions != null) {
      json[r'reactions'] = reactions;
    }
    if (recipientId != null) {
      json[r'recipient_id'] = recipientId;
    }
    if (senderEmail != null) {
      json[r'sender_email'] = senderEmail;
    }
    if (senderFullName != null) {
      json[r'sender_full_name'] = senderFullName;
    }
    if (senderId != null) {
      json[r'sender_id'] = senderId;
    }
    if (senderRealmStr != null) {
      json[r'sender_realm_str'] = senderRealmStr;
    }
    if (streamId != null) {
      json[r'stream_id'] = streamId;
    }
    if (subject != null) {
      json[r'subject'] = subject;
    }
    if (topicLinks != null) {
      json[r'topic_links'] = topicLinks;
    }
    if (submessages != null) {
      json[r'submessages'] = submessages;
    }
    if (timestamp != null) {
      json[r'timestamp'] = timestamp;
    }
    if (type != null) {
      json[r'type'] = type;
    }
    return json;
  }

  /// Returns a new [MessagesAllOf] instance and imports its values from
  /// [json] if it's non-null, null if [json] is null.
  static MessagesAllOf fromJson(Map<String, dynamic> json) => json == null
    ? null
    : MessagesAllOf(
        avatarUrl: json[r'avatar_url'],
        client: json[r'client'],
        content: json[r'content'],
        contentType: json[r'content_type'],
        displayRecipient: json[r'display_recipient'],
        id: json[r'id'],
        isMeMessage: json[r'is_me_message'],
        reactions: json[r'reactions'],
        recipientId: json[r'recipient_id'],
        senderEmail: json[r'sender_email'],
        senderFullName: json[r'sender_full_name'],
        senderId: json[r'sender_id'],
        senderRealmStr: json[r'sender_realm_str'],
        streamId: json[r'stream_id'],
        subject: json[r'subject'],
        topicLinks: json[r'topic_links'],
        submessages: json[r'submessages'],
        timestamp: json[r'timestamp'],
        type: json[r'type'],
    );

  static List<MessagesAllOf> listFromJson(List<dynamic> json, {bool emptyIsNull, bool growable,}) =>
    json == null || json.isEmpty
      ? true == emptyIsNull ? null : <MessagesAllOf>[]
      : json.map((dynamic value) => MessagesAllOf.fromJson(value)).toList(growable: true == growable);

  static Map<String, MessagesAllOf> mapFromJson(Map<String, dynamic> json) {
    final map = <String, MessagesAllOf>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) => map[key] = MessagesAllOf.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of MessagesAllOf-objects as value to a dart map
  static Map<String, List<MessagesAllOf>> mapListFromJson(Map<String, dynamic> json, {bool emptyIsNull, bool growable,}) {
    final map = <String, List<MessagesAllOf>>{};
    if (json?.isNotEmpty == true) {
      json.forEach((key, value) {
        map[key] = MessagesAllOf.listFromJson(value, emptyIsNull: emptyIsNull, growable: growable,);
      });
    }
    return map;
  }
}

