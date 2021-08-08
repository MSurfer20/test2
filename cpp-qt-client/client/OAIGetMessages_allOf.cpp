/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIGetMessages_allOf.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetMessages_allOf::OAIGetMessages_allOf(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetMessages_allOf::OAIGetMessages_allOf() {
    this->initializeModel();
}

OAIGetMessages_allOf::~OAIGetMessages_allOf() {}

void OAIGetMessages_allOf::initializeModel() {

    m_avatar_url_isSet = false;
    m_avatar_url_isValid = false;

    m_client_isSet = false;
    m_client_isValid = false;

    m_content_isSet = false;
    m_content_isValid = false;

    m_content_type_isSet = false;
    m_content_type_isValid = false;

    m_display_recipient_isSet = false;
    m_display_recipient_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_is_me_message_isSet = false;
    m_is_me_message_isValid = false;

    m_reactions_isSet = false;
    m_reactions_isValid = false;

    m_recipient_id_isSet = false;
    m_recipient_id_isValid = false;

    m_sender_email_isSet = false;
    m_sender_email_isValid = false;

    m_sender_full_name_isSet = false;
    m_sender_full_name_isValid = false;

    m_sender_id_isSet = false;
    m_sender_id_isValid = false;

    m_sender_realm_str_isSet = false;
    m_sender_realm_str_isValid = false;

    m_stream_id_isSet = false;
    m_stream_id_isValid = false;

    m_subject_isSet = false;
    m_subject_isValid = false;

    m_topic_links_isSet = false;
    m_topic_links_isValid = false;

    m_submessages_isSet = false;
    m_submessages_isValid = false;

    m_timestamp_isSet = false;
    m_timestamp_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_flags_isSet = false;
    m_flags_isValid = false;

    m_last_edit_timestamp_isSet = false;
    m_last_edit_timestamp_isValid = false;

    m_match_content_isSet = false;
    m_match_content_isValid = false;

    m_match_subject_isSet = false;
    m_match_subject_isValid = false;
}

void OAIGetMessages_allOf::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetMessages_allOf::fromJsonObject(QJsonObject json) {

    m_avatar_url_isValid = ::OpenAPI::fromJsonValue(avatar_url, json[QString("avatar_url")]);
    m_avatar_url_isSet = !json[QString("avatar_url")].isNull() && m_avatar_url_isValid;

    m_client_isValid = ::OpenAPI::fromJsonValue(client, json[QString("client")]);
    m_client_isSet = !json[QString("client")].isNull() && m_client_isValid;

    m_content_isValid = ::OpenAPI::fromJsonValue(content, json[QString("content")]);
    m_content_isSet = !json[QString("content")].isNull() && m_content_isValid;

    m_content_type_isValid = ::OpenAPI::fromJsonValue(content_type, json[QString("content_type")]);
    m_content_type_isSet = !json[QString("content_type")].isNull() && m_content_type_isValid;

    m_display_recipient_isValid = ::OpenAPI::fromJsonValue(display_recipient, json[QString("display_recipient")]);
    m_display_recipient_isSet = !json[QString("display_recipient")].isNull() && m_display_recipient_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_is_me_message_isValid = ::OpenAPI::fromJsonValue(is_me_message, json[QString("is_me_message")]);
    m_is_me_message_isSet = !json[QString("is_me_message")].isNull() && m_is_me_message_isValid;

    m_reactions_isValid = ::OpenAPI::fromJsonValue(reactions, json[QString("reactions")]);
    m_reactions_isSet = !json[QString("reactions")].isNull() && m_reactions_isValid;

    m_recipient_id_isValid = ::OpenAPI::fromJsonValue(recipient_id, json[QString("recipient_id")]);
    m_recipient_id_isSet = !json[QString("recipient_id")].isNull() && m_recipient_id_isValid;

    m_sender_email_isValid = ::OpenAPI::fromJsonValue(sender_email, json[QString("sender_email")]);
    m_sender_email_isSet = !json[QString("sender_email")].isNull() && m_sender_email_isValid;

    m_sender_full_name_isValid = ::OpenAPI::fromJsonValue(sender_full_name, json[QString("sender_full_name")]);
    m_sender_full_name_isSet = !json[QString("sender_full_name")].isNull() && m_sender_full_name_isValid;

    m_sender_id_isValid = ::OpenAPI::fromJsonValue(sender_id, json[QString("sender_id")]);
    m_sender_id_isSet = !json[QString("sender_id")].isNull() && m_sender_id_isValid;

    m_sender_realm_str_isValid = ::OpenAPI::fromJsonValue(sender_realm_str, json[QString("sender_realm_str")]);
    m_sender_realm_str_isSet = !json[QString("sender_realm_str")].isNull() && m_sender_realm_str_isValid;

    m_stream_id_isValid = ::OpenAPI::fromJsonValue(stream_id, json[QString("stream_id")]);
    m_stream_id_isSet = !json[QString("stream_id")].isNull() && m_stream_id_isValid;

    m_subject_isValid = ::OpenAPI::fromJsonValue(subject, json[QString("subject")]);
    m_subject_isSet = !json[QString("subject")].isNull() && m_subject_isValid;

    m_topic_links_isValid = ::OpenAPI::fromJsonValue(topic_links, json[QString("topic_links")]);
    m_topic_links_isSet = !json[QString("topic_links")].isNull() && m_topic_links_isValid;

    m_submessages_isValid = ::OpenAPI::fromJsonValue(submessages, json[QString("submessages")]);
    m_submessages_isSet = !json[QString("submessages")].isNull() && m_submessages_isValid;

    m_timestamp_isValid = ::OpenAPI::fromJsonValue(timestamp, json[QString("timestamp")]);
    m_timestamp_isSet = !json[QString("timestamp")].isNull() && m_timestamp_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_flags_isValid = ::OpenAPI::fromJsonValue(flags, json[QString("flags")]);
    m_flags_isSet = !json[QString("flags")].isNull() && m_flags_isValid;

    m_last_edit_timestamp_isValid = ::OpenAPI::fromJsonValue(last_edit_timestamp, json[QString("last_edit_timestamp")]);
    m_last_edit_timestamp_isSet = !json[QString("last_edit_timestamp")].isNull() && m_last_edit_timestamp_isValid;

    m_match_content_isValid = ::OpenAPI::fromJsonValue(match_content, json[QString("match_content")]);
    m_match_content_isSet = !json[QString("match_content")].isNull() && m_match_content_isValid;

    m_match_subject_isValid = ::OpenAPI::fromJsonValue(match_subject, json[QString("match_subject")]);
    m_match_subject_isSet = !json[QString("match_subject")].isNull() && m_match_subject_isValid;
}

QString OAIGetMessages_allOf::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetMessages_allOf::asJsonObject() const {
    QJsonObject obj;
    if (m_avatar_url_isSet) {
        obj.insert(QString("avatar_url"), ::OpenAPI::toJsonValue(avatar_url));
    }
    if (m_client_isSet) {
        obj.insert(QString("client"), ::OpenAPI::toJsonValue(client));
    }
    if (m_content_isSet) {
        obj.insert(QString("content"), ::OpenAPI::toJsonValue(content));
    }
    if (m_content_type_isSet) {
        obj.insert(QString("content_type"), ::OpenAPI::toJsonValue(content_type));
    }
    if (m_display_recipient_isSet) {
        obj.insert(QString("display_recipient"), ::OpenAPI::toJsonValue(display_recipient));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_is_me_message_isSet) {
        obj.insert(QString("is_me_message"), ::OpenAPI::toJsonValue(is_me_message));
    }
    if (m_reactions_isSet) {
        obj.insert(QString("reactions"), ::OpenAPI::toJsonValue(reactions));
    }
    if (m_recipient_id_isSet) {
        obj.insert(QString("recipient_id"), ::OpenAPI::toJsonValue(recipient_id));
    }
    if (m_sender_email_isSet) {
        obj.insert(QString("sender_email"), ::OpenAPI::toJsonValue(sender_email));
    }
    if (m_sender_full_name_isSet) {
        obj.insert(QString("sender_full_name"), ::OpenAPI::toJsonValue(sender_full_name));
    }
    if (m_sender_id_isSet) {
        obj.insert(QString("sender_id"), ::OpenAPI::toJsonValue(sender_id));
    }
    if (m_sender_realm_str_isSet) {
        obj.insert(QString("sender_realm_str"), ::OpenAPI::toJsonValue(sender_realm_str));
    }
    if (m_stream_id_isSet) {
        obj.insert(QString("stream_id"), ::OpenAPI::toJsonValue(stream_id));
    }
    if (m_subject_isSet) {
        obj.insert(QString("subject"), ::OpenAPI::toJsonValue(subject));
    }
    if (m_topic_links_isSet) {
        obj.insert(QString("topic_links"), ::OpenAPI::toJsonValue(topic_links));
    }
    if (m_submessages_isSet) {
        obj.insert(QString("submessages"), ::OpenAPI::toJsonValue(submessages));
    }
    if (m_timestamp_isSet) {
        obj.insert(QString("timestamp"), ::OpenAPI::toJsonValue(timestamp));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (flags.size() > 0) {
        obj.insert(QString("flags"), ::OpenAPI::toJsonValue(flags));
    }
    if (m_last_edit_timestamp_isSet) {
        obj.insert(QString("last_edit_timestamp"), ::OpenAPI::toJsonValue(last_edit_timestamp));
    }
    if (m_match_content_isSet) {
        obj.insert(QString("match_content"), ::OpenAPI::toJsonValue(match_content));
    }
    if (m_match_subject_isSet) {
        obj.insert(QString("match_subject"), ::OpenAPI::toJsonValue(match_subject));
    }
    return obj;
}

OAIAnyType OAIGetMessages_allOf::getAvatarUrl() const {
    return avatar_url;
}
void OAIGetMessages_allOf::setAvatarUrl(const OAIAnyType &avatar_url) {
    this->avatar_url = avatar_url;
    this->m_avatar_url_isSet = true;
}

bool OAIGetMessages_allOf::is_avatar_url_Set() const{
    return m_avatar_url_isSet;
}

bool OAIGetMessages_allOf::is_avatar_url_Valid() const{
    return m_avatar_url_isValid;
}

OAIAnyType OAIGetMessages_allOf::getClient() const {
    return client;
}
void OAIGetMessages_allOf::setClient(const OAIAnyType &client) {
    this->client = client;
    this->m_client_isSet = true;
}

bool OAIGetMessages_allOf::is_client_Set() const{
    return m_client_isSet;
}

bool OAIGetMessages_allOf::is_client_Valid() const{
    return m_client_isValid;
}

OAIAnyType OAIGetMessages_allOf::getContent() const {
    return content;
}
void OAIGetMessages_allOf::setContent(const OAIAnyType &content) {
    this->content = content;
    this->m_content_isSet = true;
}

bool OAIGetMessages_allOf::is_content_Set() const{
    return m_content_isSet;
}

bool OAIGetMessages_allOf::is_content_Valid() const{
    return m_content_isValid;
}

OAIAnyType OAIGetMessages_allOf::getContentType() const {
    return content_type;
}
void OAIGetMessages_allOf::setContentType(const OAIAnyType &content_type) {
    this->content_type = content_type;
    this->m_content_type_isSet = true;
}

bool OAIGetMessages_allOf::is_content_type_Set() const{
    return m_content_type_isSet;
}

bool OAIGetMessages_allOf::is_content_type_Valid() const{
    return m_content_type_isValid;
}

OAIAnyType OAIGetMessages_allOf::getDisplayRecipient() const {
    return display_recipient;
}
void OAIGetMessages_allOf::setDisplayRecipient(const OAIAnyType &display_recipient) {
    this->display_recipient = display_recipient;
    this->m_display_recipient_isSet = true;
}

bool OAIGetMessages_allOf::is_display_recipient_Set() const{
    return m_display_recipient_isSet;
}

bool OAIGetMessages_allOf::is_display_recipient_Valid() const{
    return m_display_recipient_isValid;
}

OAIAnyType OAIGetMessages_allOf::getId() const {
    return id;
}
void OAIGetMessages_allOf::setId(const OAIAnyType &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIGetMessages_allOf::is_id_Set() const{
    return m_id_isSet;
}

bool OAIGetMessages_allOf::is_id_Valid() const{
    return m_id_isValid;
}

OAIAnyType OAIGetMessages_allOf::getIsMeMessage() const {
    return is_me_message;
}
void OAIGetMessages_allOf::setIsMeMessage(const OAIAnyType &is_me_message) {
    this->is_me_message = is_me_message;
    this->m_is_me_message_isSet = true;
}

bool OAIGetMessages_allOf::is_is_me_message_Set() const{
    return m_is_me_message_isSet;
}

bool OAIGetMessages_allOf::is_is_me_message_Valid() const{
    return m_is_me_message_isValid;
}

OAIAnyType OAIGetMessages_allOf::getReactions() const {
    return reactions;
}
void OAIGetMessages_allOf::setReactions(const OAIAnyType &reactions) {
    this->reactions = reactions;
    this->m_reactions_isSet = true;
}

bool OAIGetMessages_allOf::is_reactions_Set() const{
    return m_reactions_isSet;
}

bool OAIGetMessages_allOf::is_reactions_Valid() const{
    return m_reactions_isValid;
}

OAIAnyType OAIGetMessages_allOf::getRecipientId() const {
    return recipient_id;
}
void OAIGetMessages_allOf::setRecipientId(const OAIAnyType &recipient_id) {
    this->recipient_id = recipient_id;
    this->m_recipient_id_isSet = true;
}

bool OAIGetMessages_allOf::is_recipient_id_Set() const{
    return m_recipient_id_isSet;
}

bool OAIGetMessages_allOf::is_recipient_id_Valid() const{
    return m_recipient_id_isValid;
}

OAIAnyType OAIGetMessages_allOf::getSenderEmail() const {
    return sender_email;
}
void OAIGetMessages_allOf::setSenderEmail(const OAIAnyType &sender_email) {
    this->sender_email = sender_email;
    this->m_sender_email_isSet = true;
}

bool OAIGetMessages_allOf::is_sender_email_Set() const{
    return m_sender_email_isSet;
}

bool OAIGetMessages_allOf::is_sender_email_Valid() const{
    return m_sender_email_isValid;
}

OAIAnyType OAIGetMessages_allOf::getSenderFullName() const {
    return sender_full_name;
}
void OAIGetMessages_allOf::setSenderFullName(const OAIAnyType &sender_full_name) {
    this->sender_full_name = sender_full_name;
    this->m_sender_full_name_isSet = true;
}

bool OAIGetMessages_allOf::is_sender_full_name_Set() const{
    return m_sender_full_name_isSet;
}

bool OAIGetMessages_allOf::is_sender_full_name_Valid() const{
    return m_sender_full_name_isValid;
}

OAIAnyType OAIGetMessages_allOf::getSenderId() const {
    return sender_id;
}
void OAIGetMessages_allOf::setSenderId(const OAIAnyType &sender_id) {
    this->sender_id = sender_id;
    this->m_sender_id_isSet = true;
}

bool OAIGetMessages_allOf::is_sender_id_Set() const{
    return m_sender_id_isSet;
}

bool OAIGetMessages_allOf::is_sender_id_Valid() const{
    return m_sender_id_isValid;
}

OAIAnyType OAIGetMessages_allOf::getSenderRealmStr() const {
    return sender_realm_str;
}
void OAIGetMessages_allOf::setSenderRealmStr(const OAIAnyType &sender_realm_str) {
    this->sender_realm_str = sender_realm_str;
    this->m_sender_realm_str_isSet = true;
}

bool OAIGetMessages_allOf::is_sender_realm_str_Set() const{
    return m_sender_realm_str_isSet;
}

bool OAIGetMessages_allOf::is_sender_realm_str_Valid() const{
    return m_sender_realm_str_isValid;
}

OAIAnyType OAIGetMessages_allOf::getStreamId() const {
    return stream_id;
}
void OAIGetMessages_allOf::setStreamId(const OAIAnyType &stream_id) {
    this->stream_id = stream_id;
    this->m_stream_id_isSet = true;
}

bool OAIGetMessages_allOf::is_stream_id_Set() const{
    return m_stream_id_isSet;
}

bool OAIGetMessages_allOf::is_stream_id_Valid() const{
    return m_stream_id_isValid;
}

OAIAnyType OAIGetMessages_allOf::getSubject() const {
    return subject;
}
void OAIGetMessages_allOf::setSubject(const OAIAnyType &subject) {
    this->subject = subject;
    this->m_subject_isSet = true;
}

bool OAIGetMessages_allOf::is_subject_Set() const{
    return m_subject_isSet;
}

bool OAIGetMessages_allOf::is_subject_Valid() const{
    return m_subject_isValid;
}

OAIAnyType OAIGetMessages_allOf::getTopicLinks() const {
    return topic_links;
}
void OAIGetMessages_allOf::setTopicLinks(const OAIAnyType &topic_links) {
    this->topic_links = topic_links;
    this->m_topic_links_isSet = true;
}

bool OAIGetMessages_allOf::is_topic_links_Set() const{
    return m_topic_links_isSet;
}

bool OAIGetMessages_allOf::is_topic_links_Valid() const{
    return m_topic_links_isValid;
}

OAIAnyType OAIGetMessages_allOf::getSubmessages() const {
    return submessages;
}
void OAIGetMessages_allOf::setSubmessages(const OAIAnyType &submessages) {
    this->submessages = submessages;
    this->m_submessages_isSet = true;
}

bool OAIGetMessages_allOf::is_submessages_Set() const{
    return m_submessages_isSet;
}

bool OAIGetMessages_allOf::is_submessages_Valid() const{
    return m_submessages_isValid;
}

OAIAnyType OAIGetMessages_allOf::getTimestamp() const {
    return timestamp;
}
void OAIGetMessages_allOf::setTimestamp(const OAIAnyType &timestamp) {
    this->timestamp = timestamp;
    this->m_timestamp_isSet = true;
}

bool OAIGetMessages_allOf::is_timestamp_Set() const{
    return m_timestamp_isSet;
}

bool OAIGetMessages_allOf::is_timestamp_Valid() const{
    return m_timestamp_isValid;
}

OAIAnyType OAIGetMessages_allOf::getType() const {
    return type;
}
void OAIGetMessages_allOf::setType(const OAIAnyType &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIGetMessages_allOf::is_type_Set() const{
    return m_type_isSet;
}

bool OAIGetMessages_allOf::is_type_Valid() const{
    return m_type_isValid;
}

QList<QString> OAIGetMessages_allOf::getFlags() const {
    return flags;
}
void OAIGetMessages_allOf::setFlags(const QList<QString> &flags) {
    this->flags = flags;
    this->m_flags_isSet = true;
}

bool OAIGetMessages_allOf::is_flags_Set() const{
    return m_flags_isSet;
}

bool OAIGetMessages_allOf::is_flags_Valid() const{
    return m_flags_isValid;
}

qint32 OAIGetMessages_allOf::getLastEditTimestamp() const {
    return last_edit_timestamp;
}
void OAIGetMessages_allOf::setLastEditTimestamp(const qint32 &last_edit_timestamp) {
    this->last_edit_timestamp = last_edit_timestamp;
    this->m_last_edit_timestamp_isSet = true;
}

bool OAIGetMessages_allOf::is_last_edit_timestamp_Set() const{
    return m_last_edit_timestamp_isSet;
}

bool OAIGetMessages_allOf::is_last_edit_timestamp_Valid() const{
    return m_last_edit_timestamp_isValid;
}

QString OAIGetMessages_allOf::getMatchContent() const {
    return match_content;
}
void OAIGetMessages_allOf::setMatchContent(const QString &match_content) {
    this->match_content = match_content;
    this->m_match_content_isSet = true;
}

bool OAIGetMessages_allOf::is_match_content_Set() const{
    return m_match_content_isSet;
}

bool OAIGetMessages_allOf::is_match_content_Valid() const{
    return m_match_content_isValid;
}

QString OAIGetMessages_allOf::getMatchSubject() const {
    return match_subject;
}
void OAIGetMessages_allOf::setMatchSubject(const QString &match_subject) {
    this->match_subject = match_subject;
    this->m_match_subject_isSet = true;
}

bool OAIGetMessages_allOf::is_match_subject_Set() const{
    return m_match_subject_isSet;
}

bool OAIGetMessages_allOf::is_match_subject_Valid() const{
    return m_match_subject_isValid;
}

bool OAIGetMessages_allOf::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_avatar_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_client_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_content_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_content_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_display_recipient_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_me_message_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_reactions_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_recipient_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sender_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sender_full_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sender_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_sender_realm_str_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_stream_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_subject_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_topic_links_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_submessages_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timestamp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (flags.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_edit_timestamp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_match_content_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_match_subject_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetMessages_allOf::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
