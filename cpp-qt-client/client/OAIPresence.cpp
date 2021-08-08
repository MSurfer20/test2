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

#include "OAIPresence.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPresence::OAIPresence(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPresence::OAIPresence() {
    this->initializeModel();
}

OAIPresence::~OAIPresence() {}

void OAIPresence::initializeModel() {

    m_client_isSet = false;
    m_client_isValid = false;

    m_status_isSet = false;
    m_status_isValid = false;

    m_timestamp_isSet = false;
    m_timestamp_isValid = false;

    m_pushable_isSet = false;
    m_pushable_isValid = false;
}

void OAIPresence::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPresence::fromJsonObject(QJsonObject json) {

    m_client_isValid = ::OpenAPI::fromJsonValue(client, json[QString("client")]);
    m_client_isSet = !json[QString("client")].isNull() && m_client_isValid;

    m_status_isValid = ::OpenAPI::fromJsonValue(status, json[QString("status")]);
    m_status_isSet = !json[QString("status")].isNull() && m_status_isValid;

    m_timestamp_isValid = ::OpenAPI::fromJsonValue(timestamp, json[QString("timestamp")]);
    m_timestamp_isSet = !json[QString("timestamp")].isNull() && m_timestamp_isValid;

    m_pushable_isValid = ::OpenAPI::fromJsonValue(pushable, json[QString("pushable")]);
    m_pushable_isSet = !json[QString("pushable")].isNull() && m_pushable_isValid;
}

QString OAIPresence::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPresence::asJsonObject() const {
    QJsonObject obj;
    if (m_client_isSet) {
        obj.insert(QString("client"), ::OpenAPI::toJsonValue(client));
    }
    if (m_status_isSet) {
        obj.insert(QString("status"), ::OpenAPI::toJsonValue(status));
    }
    if (m_timestamp_isSet) {
        obj.insert(QString("timestamp"), ::OpenAPI::toJsonValue(timestamp));
    }
    if (m_pushable_isSet) {
        obj.insert(QString("pushable"), ::OpenAPI::toJsonValue(pushable));
    }
    return obj;
}

QString OAIPresence::getClient() const {
    return client;
}
void OAIPresence::setClient(const QString &client) {
    this->client = client;
    this->m_client_isSet = true;
}

bool OAIPresence::is_client_Set() const{
    return m_client_isSet;
}

bool OAIPresence::is_client_Valid() const{
    return m_client_isValid;
}

QString OAIPresence::getStatus() const {
    return status;
}
void OAIPresence::setStatus(const QString &status) {
    this->status = status;
    this->m_status_isSet = true;
}

bool OAIPresence::is_status_Set() const{
    return m_status_isSet;
}

bool OAIPresence::is_status_Valid() const{
    return m_status_isValid;
}

qint32 OAIPresence::getTimestamp() const {
    return timestamp;
}
void OAIPresence::setTimestamp(const qint32 &timestamp) {
    this->timestamp = timestamp;
    this->m_timestamp_isSet = true;
}

bool OAIPresence::is_timestamp_Set() const{
    return m_timestamp_isSet;
}

bool OAIPresence::is_timestamp_Valid() const{
    return m_timestamp_isValid;
}

bool OAIPresence::isPushable() const {
    return pushable;
}
void OAIPresence::setPushable(const bool &pushable) {
    this->pushable = pushable;
    this->m_pushable_isSet = true;
}

bool OAIPresence::is_pushable_Set() const{
    return m_pushable_isSet;
}

bool OAIPresence::is_pushable_Valid() const{
    return m_pushable_isValid;
}

bool OAIPresence::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_client_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_status_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timestamp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_pushable_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPresence::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI