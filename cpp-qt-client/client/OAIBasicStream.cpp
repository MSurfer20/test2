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

#include "OAIBasicStream.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBasicStream::OAIBasicStream(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBasicStream::OAIBasicStream() {
    this->initializeModel();
}

OAIBasicStream::~OAIBasicStream() {}

void OAIBasicStream::initializeModel() {

    m_stream_id_isSet = false;
    m_stream_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_date_created_isSet = false;
    m_date_created_isValid = false;

    m_invite_only_isSet = false;
    m_invite_only_isValid = false;

    m_rendered_description_isSet = false;
    m_rendered_description_isValid = false;

    m_is_web_public_isSet = false;
    m_is_web_public_isValid = false;

    m_stream_post_policy_isSet = false;
    m_stream_post_policy_isValid = false;

    m_message_retention_days_isSet = false;
    m_message_retention_days_isValid = false;

    m_history_public_to_subscribers_isSet = false;
    m_history_public_to_subscribers_isValid = false;

    m_first_message_id_isSet = false;
    m_first_message_id_isValid = false;

    m_is_announcement_only_isSet = false;
    m_is_announcement_only_isValid = false;
}

void OAIBasicStream::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBasicStream::fromJsonObject(QJsonObject json) {

    m_stream_id_isValid = ::OpenAPI::fromJsonValue(stream_id, json[QString("stream_id")]);
    m_stream_id_isSet = !json[QString("stream_id")].isNull() && m_stream_id_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_date_created_isValid = ::OpenAPI::fromJsonValue(date_created, json[QString("date_created")]);
    m_date_created_isSet = !json[QString("date_created")].isNull() && m_date_created_isValid;

    m_invite_only_isValid = ::OpenAPI::fromJsonValue(invite_only, json[QString("invite_only")]);
    m_invite_only_isSet = !json[QString("invite_only")].isNull() && m_invite_only_isValid;

    m_rendered_description_isValid = ::OpenAPI::fromJsonValue(rendered_description, json[QString("rendered_description")]);
    m_rendered_description_isSet = !json[QString("rendered_description")].isNull() && m_rendered_description_isValid;

    m_is_web_public_isValid = ::OpenAPI::fromJsonValue(is_web_public, json[QString("is_web_public")]);
    m_is_web_public_isSet = !json[QString("is_web_public")].isNull() && m_is_web_public_isValid;

    m_stream_post_policy_isValid = ::OpenAPI::fromJsonValue(stream_post_policy, json[QString("stream_post_policy")]);
    m_stream_post_policy_isSet = !json[QString("stream_post_policy")].isNull() && m_stream_post_policy_isValid;

    m_message_retention_days_isValid = ::OpenAPI::fromJsonValue(message_retention_days, json[QString("message_retention_days")]);
    m_message_retention_days_isSet = !json[QString("message_retention_days")].isNull() && m_message_retention_days_isValid;

    m_history_public_to_subscribers_isValid = ::OpenAPI::fromJsonValue(history_public_to_subscribers, json[QString("history_public_to_subscribers")]);
    m_history_public_to_subscribers_isSet = !json[QString("history_public_to_subscribers")].isNull() && m_history_public_to_subscribers_isValid;

    m_first_message_id_isValid = ::OpenAPI::fromJsonValue(first_message_id, json[QString("first_message_id")]);
    m_first_message_id_isSet = !json[QString("first_message_id")].isNull() && m_first_message_id_isValid;

    m_is_announcement_only_isValid = ::OpenAPI::fromJsonValue(is_announcement_only, json[QString("is_announcement_only")]);
    m_is_announcement_only_isSet = !json[QString("is_announcement_only")].isNull() && m_is_announcement_only_isValid;
}

QString OAIBasicStream::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBasicStream::asJsonObject() const {
    QJsonObject obj;
    if (m_stream_id_isSet) {
        obj.insert(QString("stream_id"), ::OpenAPI::toJsonValue(stream_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_date_created_isSet) {
        obj.insert(QString("date_created"), ::OpenAPI::toJsonValue(date_created));
    }
    if (m_invite_only_isSet) {
        obj.insert(QString("invite_only"), ::OpenAPI::toJsonValue(invite_only));
    }
    if (m_rendered_description_isSet) {
        obj.insert(QString("rendered_description"), ::OpenAPI::toJsonValue(rendered_description));
    }
    if (m_is_web_public_isSet) {
        obj.insert(QString("is_web_public"), ::OpenAPI::toJsonValue(is_web_public));
    }
    if (m_stream_post_policy_isSet) {
        obj.insert(QString("stream_post_policy"), ::OpenAPI::toJsonValue(stream_post_policy));
    }
    if (m_message_retention_days_isSet) {
        obj.insert(QString("message_retention_days"), ::OpenAPI::toJsonValue(message_retention_days));
    }
    if (m_history_public_to_subscribers_isSet) {
        obj.insert(QString("history_public_to_subscribers"), ::OpenAPI::toJsonValue(history_public_to_subscribers));
    }
    if (m_first_message_id_isSet) {
        obj.insert(QString("first_message_id"), ::OpenAPI::toJsonValue(first_message_id));
    }
    if (m_is_announcement_only_isSet) {
        obj.insert(QString("is_announcement_only"), ::OpenAPI::toJsonValue(is_announcement_only));
    }
    return obj;
}

OAIAnyType OAIBasicStream::getStreamId() const {
    return stream_id;
}
void OAIBasicStream::setStreamId(const OAIAnyType &stream_id) {
    this->stream_id = stream_id;
    this->m_stream_id_isSet = true;
}

bool OAIBasicStream::is_stream_id_Set() const{
    return m_stream_id_isSet;
}

bool OAIBasicStream::is_stream_id_Valid() const{
    return m_stream_id_isValid;
}

OAIAnyType OAIBasicStream::getName() const {
    return name;
}
void OAIBasicStream::setName(const OAIAnyType &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIBasicStream::is_name_Set() const{
    return m_name_isSet;
}

bool OAIBasicStream::is_name_Valid() const{
    return m_name_isValid;
}

OAIAnyType OAIBasicStream::getDescription() const {
    return description;
}
void OAIBasicStream::setDescription(const OAIAnyType &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIBasicStream::is_description_Set() const{
    return m_description_isSet;
}

bool OAIBasicStream::is_description_Valid() const{
    return m_description_isValid;
}

OAIAnyType OAIBasicStream::getDateCreated() const {
    return date_created;
}
void OAIBasicStream::setDateCreated(const OAIAnyType &date_created) {
    this->date_created = date_created;
    this->m_date_created_isSet = true;
}

bool OAIBasicStream::is_date_created_Set() const{
    return m_date_created_isSet;
}

bool OAIBasicStream::is_date_created_Valid() const{
    return m_date_created_isValid;
}

OAIAnyType OAIBasicStream::getInviteOnly() const {
    return invite_only;
}
void OAIBasicStream::setInviteOnly(const OAIAnyType &invite_only) {
    this->invite_only = invite_only;
    this->m_invite_only_isSet = true;
}

bool OAIBasicStream::is_invite_only_Set() const{
    return m_invite_only_isSet;
}

bool OAIBasicStream::is_invite_only_Valid() const{
    return m_invite_only_isValid;
}

OAIAnyType OAIBasicStream::getRenderedDescription() const {
    return rendered_description;
}
void OAIBasicStream::setRenderedDescription(const OAIAnyType &rendered_description) {
    this->rendered_description = rendered_description;
    this->m_rendered_description_isSet = true;
}

bool OAIBasicStream::is_rendered_description_Set() const{
    return m_rendered_description_isSet;
}

bool OAIBasicStream::is_rendered_description_Valid() const{
    return m_rendered_description_isValid;
}

OAIAnyType OAIBasicStream::getIsWebPublic() const {
    return is_web_public;
}
void OAIBasicStream::setIsWebPublic(const OAIAnyType &is_web_public) {
    this->is_web_public = is_web_public;
    this->m_is_web_public_isSet = true;
}

bool OAIBasicStream::is_is_web_public_Set() const{
    return m_is_web_public_isSet;
}

bool OAIBasicStream::is_is_web_public_Valid() const{
    return m_is_web_public_isValid;
}

OAIAnyType OAIBasicStream::getStreamPostPolicy() const {
    return stream_post_policy;
}
void OAIBasicStream::setStreamPostPolicy(const OAIAnyType &stream_post_policy) {
    this->stream_post_policy = stream_post_policy;
    this->m_stream_post_policy_isSet = true;
}

bool OAIBasicStream::is_stream_post_policy_Set() const{
    return m_stream_post_policy_isSet;
}

bool OAIBasicStream::is_stream_post_policy_Valid() const{
    return m_stream_post_policy_isValid;
}

OAIAnyType OAIBasicStream::getMessageRetentionDays() const {
    return message_retention_days;
}
void OAIBasicStream::setMessageRetentionDays(const OAIAnyType &message_retention_days) {
    this->message_retention_days = message_retention_days;
    this->m_message_retention_days_isSet = true;
}

bool OAIBasicStream::is_message_retention_days_Set() const{
    return m_message_retention_days_isSet;
}

bool OAIBasicStream::is_message_retention_days_Valid() const{
    return m_message_retention_days_isValid;
}

OAIAnyType OAIBasicStream::getHistoryPublicToSubscribers() const {
    return history_public_to_subscribers;
}
void OAIBasicStream::setHistoryPublicToSubscribers(const OAIAnyType &history_public_to_subscribers) {
    this->history_public_to_subscribers = history_public_to_subscribers;
    this->m_history_public_to_subscribers_isSet = true;
}

bool OAIBasicStream::is_history_public_to_subscribers_Set() const{
    return m_history_public_to_subscribers_isSet;
}

bool OAIBasicStream::is_history_public_to_subscribers_Valid() const{
    return m_history_public_to_subscribers_isValid;
}

OAIAnyType OAIBasicStream::getFirstMessageId() const {
    return first_message_id;
}
void OAIBasicStream::setFirstMessageId(const OAIAnyType &first_message_id) {
    this->first_message_id = first_message_id;
    this->m_first_message_id_isSet = true;
}

bool OAIBasicStream::is_first_message_id_Set() const{
    return m_first_message_id_isSet;
}

bool OAIBasicStream::is_first_message_id_Valid() const{
    return m_first_message_id_isValid;
}

OAIAnyType OAIBasicStream::getIsAnnouncementOnly() const {
    return is_announcement_only;
}
void OAIBasicStream::setIsAnnouncementOnly(const OAIAnyType &is_announcement_only) {
    this->is_announcement_only = is_announcement_only;
    this->m_is_announcement_only_isSet = true;
}

bool OAIBasicStream::is_is_announcement_only_Set() const{
    return m_is_announcement_only_isSet;
}

bool OAIBasicStream::is_is_announcement_only_Valid() const{
    return m_is_announcement_only_isValid;
}

bool OAIBasicStream::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_stream_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_created_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_invite_only_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_rendered_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_web_public_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_stream_post_policy_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_retention_days_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_history_public_to_subscribers_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_first_message_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_announcement_only_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBasicStream::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
