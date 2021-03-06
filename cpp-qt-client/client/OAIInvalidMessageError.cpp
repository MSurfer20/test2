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

#include "OAIInvalidMessageError.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIInvalidMessageError::OAIInvalidMessageError(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIInvalidMessageError::OAIInvalidMessageError() {
    this->initializeModel();
}

OAIInvalidMessageError::~OAIInvalidMessageError() {}

void OAIInvalidMessageError::initializeModel() {

    m_result_isSet = false;
    m_result_isValid = false;

    m_msg_isSet = false;
    m_msg_isValid = false;

    m_raw_content_isSet = false;
    m_raw_content_isValid = false;
}

void OAIInvalidMessageError::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIInvalidMessageError::fromJsonObject(QJsonObject json) {

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;

    m_msg_isValid = ::OpenAPI::fromJsonValue(msg, json[QString("msg")]);
    m_msg_isSet = !json[QString("msg")].isNull() && m_msg_isValid;

    m_raw_content_isValid = ::OpenAPI::fromJsonValue(raw_content, json[QString("raw_content")]);
    m_raw_content_isSet = !json[QString("raw_content")].isNull() && m_raw_content_isValid;
}

QString OAIInvalidMessageError::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIInvalidMessageError::asJsonObject() const {
    QJsonObject obj;
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    if (m_msg_isSet) {
        obj.insert(QString("msg"), ::OpenAPI::toJsonValue(msg));
    }
    if (m_raw_content_isSet) {
        obj.insert(QString("raw_content"), ::OpenAPI::toJsonValue(raw_content));
    }
    return obj;
}

OAIAnyType OAIInvalidMessageError::getResult() const {
    return result;
}
void OAIInvalidMessageError::setResult(const OAIAnyType &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIInvalidMessageError::is_result_Set() const{
    return m_result_isSet;
}

bool OAIInvalidMessageError::is_result_Valid() const{
    return m_result_isValid;
}

OAIAnyType OAIInvalidMessageError::getMsg() const {
    return msg;
}
void OAIInvalidMessageError::setMsg(const OAIAnyType &msg) {
    this->msg = msg;
    this->m_msg_isSet = true;
}

bool OAIInvalidMessageError::is_msg_Set() const{
    return m_msg_isSet;
}

bool OAIInvalidMessageError::is_msg_Valid() const{
    return m_msg_isValid;
}

QString OAIInvalidMessageError::getRawContent() const {
    return raw_content;
}
void OAIInvalidMessageError::setRawContent(const QString &raw_content) {
    this->raw_content = raw_content;
    this->m_raw_content_isSet = true;
}

bool OAIInvalidMessageError::is_raw_content_Set() const{
    return m_raw_content_isSet;
}

bool OAIInvalidMessageError::is_raw_content_Valid() const{
    return m_raw_content_isValid;
}

bool OAIInvalidMessageError::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_result_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_msg_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_raw_content_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIInvalidMessageError::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_result_isValid && m_msg_isValid && true;
}

} // namespace OpenAPI
