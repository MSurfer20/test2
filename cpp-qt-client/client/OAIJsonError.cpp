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

#include "OAIJsonError.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIJsonError::OAIJsonError(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIJsonError::OAIJsonError() {
    this->initializeModel();
}

OAIJsonError::~OAIJsonError() {}

void OAIJsonError::initializeModel() {

    m_result_isSet = false;
    m_result_isValid = false;

    m_msg_isSet = false;
    m_msg_isValid = false;
}

void OAIJsonError::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIJsonError::fromJsonObject(QJsonObject json) {

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;

    m_msg_isValid = ::OpenAPI::fromJsonValue(msg, json[QString("msg")]);
    m_msg_isSet = !json[QString("msg")].isNull() && m_msg_isValid;
}

QString OAIJsonError::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIJsonError::asJsonObject() const {
    QJsonObject obj;
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    if (m_msg_isSet) {
        obj.insert(QString("msg"), ::OpenAPI::toJsonValue(msg));
    }
    return obj;
}

OAIAnyType OAIJsonError::getResult() const {
    return result;
}
void OAIJsonError::setResult(const OAIAnyType &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIJsonError::is_result_Set() const{
    return m_result_isSet;
}

bool OAIJsonError::is_result_Valid() const{
    return m_result_isValid;
}

OAIAnyType OAIJsonError::getMsg() const {
    return msg;
}
void OAIJsonError::setMsg(const OAIAnyType &msg) {
    this->msg = msg;
    this->m_msg_isSet = true;
}

bool OAIJsonError::is_msg_Set() const{
    return m_msg_isSet;
}

bool OAIJsonError::is_msg_Valid() const{
    return m_msg_isValid;
}

bool OAIJsonError::isSet() const {
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
    } while (false);
    return isObjectUpdated;
}

bool OAIJsonError::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_result_isValid && m_msg_isValid && true;
}

} // namespace OpenAPI
