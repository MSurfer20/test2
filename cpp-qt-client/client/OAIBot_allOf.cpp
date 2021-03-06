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

#include "OAIBot_allOf.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBot_allOf::OAIBot_allOf(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBot_allOf::OAIBot_allOf() {
    this->initializeModel();
}

OAIBot_allOf::~OAIBot_allOf() {}

void OAIBot_allOf::initializeModel() {

    m_user_id_isSet = false;
    m_user_id_isValid = false;

    m_full_name_isSet = false;
    m_full_name_isValid = false;

    m_api_key_isSet = false;
    m_api_key_isValid = false;

    m_default_sending_stream_isSet = false;
    m_default_sending_stream_isValid = false;

    m_default_events_register_stream_isSet = false;
    m_default_events_register_stream_isValid = false;

    m_default_all_public_streams_isSet = false;
    m_default_all_public_streams_isValid = false;

    m_avatar_url_isSet = false;
    m_avatar_url_isValid = false;

    m_owner_id_isSet = false;
    m_owner_id_isValid = false;

    m_services_isSet = false;
    m_services_isValid = false;

    m_email_isSet = false;
    m_email_isValid = false;

    m_bot_type_isSet = false;
    m_bot_type_isValid = false;

    m_is_active_isSet = false;
    m_is_active_isValid = false;
}

void OAIBot_allOf::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBot_allOf::fromJsonObject(QJsonObject json) {

    m_user_id_isValid = ::OpenAPI::fromJsonValue(user_id, json[QString("user_id")]);
    m_user_id_isSet = !json[QString("user_id")].isNull() && m_user_id_isValid;

    m_full_name_isValid = ::OpenAPI::fromJsonValue(full_name, json[QString("full_name")]);
    m_full_name_isSet = !json[QString("full_name")].isNull() && m_full_name_isValid;

    m_api_key_isValid = ::OpenAPI::fromJsonValue(api_key, json[QString("api_key")]);
    m_api_key_isSet = !json[QString("api_key")].isNull() && m_api_key_isValid;

    m_default_sending_stream_isValid = ::OpenAPI::fromJsonValue(default_sending_stream, json[QString("default_sending_stream")]);
    m_default_sending_stream_isSet = !json[QString("default_sending_stream")].isNull() && m_default_sending_stream_isValid;

    m_default_events_register_stream_isValid = ::OpenAPI::fromJsonValue(default_events_register_stream, json[QString("default_events_register_stream")]);
    m_default_events_register_stream_isSet = !json[QString("default_events_register_stream")].isNull() && m_default_events_register_stream_isValid;

    m_default_all_public_streams_isValid = ::OpenAPI::fromJsonValue(default_all_public_streams, json[QString("default_all_public_streams")]);
    m_default_all_public_streams_isSet = !json[QString("default_all_public_streams")].isNull() && m_default_all_public_streams_isValid;

    m_avatar_url_isValid = ::OpenAPI::fromJsonValue(avatar_url, json[QString("avatar_url")]);
    m_avatar_url_isSet = !json[QString("avatar_url")].isNull() && m_avatar_url_isValid;

    m_owner_id_isValid = ::OpenAPI::fromJsonValue(owner_id, json[QString("owner_id")]);
    m_owner_id_isSet = !json[QString("owner_id")].isNull() && m_owner_id_isValid;

    m_services_isValid = ::OpenAPI::fromJsonValue(services, json[QString("services")]);
    m_services_isSet = !json[QString("services")].isNull() && m_services_isValid;

    m_email_isValid = ::OpenAPI::fromJsonValue(email, json[QString("email")]);
    m_email_isSet = !json[QString("email")].isNull() && m_email_isValid;

    m_bot_type_isValid = ::OpenAPI::fromJsonValue(bot_type, json[QString("bot_type")]);
    m_bot_type_isSet = !json[QString("bot_type")].isNull() && m_bot_type_isValid;

    m_is_active_isValid = ::OpenAPI::fromJsonValue(is_active, json[QString("is_active")]);
    m_is_active_isSet = !json[QString("is_active")].isNull() && m_is_active_isValid;
}

QString OAIBot_allOf::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBot_allOf::asJsonObject() const {
    QJsonObject obj;
    if (m_user_id_isSet) {
        obj.insert(QString("user_id"), ::OpenAPI::toJsonValue(user_id));
    }
    if (m_full_name_isSet) {
        obj.insert(QString("full_name"), ::OpenAPI::toJsonValue(full_name));
    }
    if (m_api_key_isSet) {
        obj.insert(QString("api_key"), ::OpenAPI::toJsonValue(api_key));
    }
    if (m_default_sending_stream_isSet) {
        obj.insert(QString("default_sending_stream"), ::OpenAPI::toJsonValue(default_sending_stream));
    }
    if (m_default_events_register_stream_isSet) {
        obj.insert(QString("default_events_register_stream"), ::OpenAPI::toJsonValue(default_events_register_stream));
    }
    if (m_default_all_public_streams_isSet) {
        obj.insert(QString("default_all_public_streams"), ::OpenAPI::toJsonValue(default_all_public_streams));
    }
    if (m_avatar_url_isSet) {
        obj.insert(QString("avatar_url"), ::OpenAPI::toJsonValue(avatar_url));
    }
    if (m_owner_id_isSet) {
        obj.insert(QString("owner_id"), ::OpenAPI::toJsonValue(owner_id));
    }
    if (m_services_isSet) {
        obj.insert(QString("services"), ::OpenAPI::toJsonValue(services));
    }
    if (m_email_isSet) {
        obj.insert(QString("email"), ::OpenAPI::toJsonValue(email));
    }
    if (m_bot_type_isSet) {
        obj.insert(QString("bot_type"), ::OpenAPI::toJsonValue(bot_type));
    }
    if (m_is_active_isSet) {
        obj.insert(QString("is_active"), ::OpenAPI::toJsonValue(is_active));
    }
    return obj;
}

OAIAnyType OAIBot_allOf::getUserId() const {
    return user_id;
}
void OAIBot_allOf::setUserId(const OAIAnyType &user_id) {
    this->user_id = user_id;
    this->m_user_id_isSet = true;
}

bool OAIBot_allOf::is_user_id_Set() const{
    return m_user_id_isSet;
}

bool OAIBot_allOf::is_user_id_Valid() const{
    return m_user_id_isValid;
}

OAIAnyType OAIBot_allOf::getFullName() const {
    return full_name;
}
void OAIBot_allOf::setFullName(const OAIAnyType &full_name) {
    this->full_name = full_name;
    this->m_full_name_isSet = true;
}

bool OAIBot_allOf::is_full_name_Set() const{
    return m_full_name_isSet;
}

bool OAIBot_allOf::is_full_name_Valid() const{
    return m_full_name_isValid;
}

OAIAnyType OAIBot_allOf::getApiKey() const {
    return api_key;
}
void OAIBot_allOf::setApiKey(const OAIAnyType &api_key) {
    this->api_key = api_key;
    this->m_api_key_isSet = true;
}

bool OAIBot_allOf::is_api_key_Set() const{
    return m_api_key_isSet;
}

bool OAIBot_allOf::is_api_key_Valid() const{
    return m_api_key_isValid;
}

OAIAnyType OAIBot_allOf::getDefaultSendingStream() const {
    return default_sending_stream;
}
void OAIBot_allOf::setDefaultSendingStream(const OAIAnyType &default_sending_stream) {
    this->default_sending_stream = default_sending_stream;
    this->m_default_sending_stream_isSet = true;
}

bool OAIBot_allOf::is_default_sending_stream_Set() const{
    return m_default_sending_stream_isSet;
}

bool OAIBot_allOf::is_default_sending_stream_Valid() const{
    return m_default_sending_stream_isValid;
}

OAIAnyType OAIBot_allOf::getDefaultEventsRegisterStream() const {
    return default_events_register_stream;
}
void OAIBot_allOf::setDefaultEventsRegisterStream(const OAIAnyType &default_events_register_stream) {
    this->default_events_register_stream = default_events_register_stream;
    this->m_default_events_register_stream_isSet = true;
}

bool OAIBot_allOf::is_default_events_register_stream_Set() const{
    return m_default_events_register_stream_isSet;
}

bool OAIBot_allOf::is_default_events_register_stream_Valid() const{
    return m_default_events_register_stream_isValid;
}

OAIAnyType OAIBot_allOf::getDefaultAllPublicStreams() const {
    return default_all_public_streams;
}
void OAIBot_allOf::setDefaultAllPublicStreams(const OAIAnyType &default_all_public_streams) {
    this->default_all_public_streams = default_all_public_streams;
    this->m_default_all_public_streams_isSet = true;
}

bool OAIBot_allOf::is_default_all_public_streams_Set() const{
    return m_default_all_public_streams_isSet;
}

bool OAIBot_allOf::is_default_all_public_streams_Valid() const{
    return m_default_all_public_streams_isValid;
}

OAIAnyType OAIBot_allOf::getAvatarUrl() const {
    return avatar_url;
}
void OAIBot_allOf::setAvatarUrl(const OAIAnyType &avatar_url) {
    this->avatar_url = avatar_url;
    this->m_avatar_url_isSet = true;
}

bool OAIBot_allOf::is_avatar_url_Set() const{
    return m_avatar_url_isSet;
}

bool OAIBot_allOf::is_avatar_url_Valid() const{
    return m_avatar_url_isValid;
}

OAIAnyType OAIBot_allOf::getOwnerId() const {
    return owner_id;
}
void OAIBot_allOf::setOwnerId(const OAIAnyType &owner_id) {
    this->owner_id = owner_id;
    this->m_owner_id_isSet = true;
}

bool OAIBot_allOf::is_owner_id_Set() const{
    return m_owner_id_isSet;
}

bool OAIBot_allOf::is_owner_id_Valid() const{
    return m_owner_id_isValid;
}

OAIAnyType OAIBot_allOf::getServices() const {
    return services;
}
void OAIBot_allOf::setServices(const OAIAnyType &services) {
    this->services = services;
    this->m_services_isSet = true;
}

bool OAIBot_allOf::is_services_Set() const{
    return m_services_isSet;
}

bool OAIBot_allOf::is_services_Valid() const{
    return m_services_isValid;
}

QString OAIBot_allOf::getEmail() const {
    return email;
}
void OAIBot_allOf::setEmail(const QString &email) {
    this->email = email;
    this->m_email_isSet = true;
}

bool OAIBot_allOf::is_email_Set() const{
    return m_email_isSet;
}

bool OAIBot_allOf::is_email_Valid() const{
    return m_email_isValid;
}

qint32 OAIBot_allOf::getBotType() const {
    return bot_type;
}
void OAIBot_allOf::setBotType(const qint32 &bot_type) {
    this->bot_type = bot_type;
    this->m_bot_type_isSet = true;
}

bool OAIBot_allOf::is_bot_type_Set() const{
    return m_bot_type_isSet;
}

bool OAIBot_allOf::is_bot_type_Valid() const{
    return m_bot_type_isValid;
}

bool OAIBot_allOf::isIsActive() const {
    return is_active;
}
void OAIBot_allOf::setIsActive(const bool &is_active) {
    this->is_active = is_active;
    this->m_is_active_isSet = true;
}

bool OAIBot_allOf::is_is_active_Set() const{
    return m_is_active_isSet;
}

bool OAIBot_allOf::is_is_active_Valid() const{
    return m_is_active_isValid;
}

bool OAIBot_allOf::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_user_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_full_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_api_key_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_default_sending_stream_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_default_events_register_stream_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_default_all_public_streams_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_avatar_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_owner_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_services_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_bot_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_active_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBot_allOf::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
