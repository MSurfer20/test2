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

#include "OAIBadEventQueueIdError.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIBadEventQueueIdError::OAIBadEventQueueIdError(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIBadEventQueueIdError::OAIBadEventQueueIdError() {
    this->initializeModel();
}

OAIBadEventQueueIdError::~OAIBadEventQueueIdError() {}

void OAIBadEventQueueIdError::initializeModel() {

    m_result_isSet = false;
    m_result_isValid = false;

    m_msg_isSet = false;
    m_msg_isValid = false;

    m_code_isSet = false;
    m_code_isValid = false;

    m_queue_id_isSet = false;
    m_queue_id_isValid = false;
}

void OAIBadEventQueueIdError::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIBadEventQueueIdError::fromJsonObject(QJsonObject json) {

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;

    m_msg_isValid = ::OpenAPI::fromJsonValue(msg, json[QString("msg")]);
    m_msg_isSet = !json[QString("msg")].isNull() && m_msg_isValid;

    m_code_isValid = ::OpenAPI::fromJsonValue(code, json[QString("code")]);
    m_code_isSet = !json[QString("code")].isNull() && m_code_isValid;

    m_queue_id_isValid = ::OpenAPI::fromJsonValue(queue_id, json[QString("queue_id")]);
    m_queue_id_isSet = !json[QString("queue_id")].isNull() && m_queue_id_isValid;
}

QString OAIBadEventQueueIdError::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIBadEventQueueIdError::asJsonObject() const {
    QJsonObject obj;
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    if (m_msg_isSet) {
        obj.insert(QString("msg"), ::OpenAPI::toJsonValue(msg));
    }
    if (m_code_isSet) {
        obj.insert(QString("code"), ::OpenAPI::toJsonValue(code));
    }
    if (m_queue_id_isSet) {
        obj.insert(QString("queue_id"), ::OpenAPI::toJsonValue(queue_id));
    }
    return obj;
}

OAIAnyType OAIBadEventQueueIdError::getResult() const {
    return result;
}
void OAIBadEventQueueIdError::setResult(const OAIAnyType &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIBadEventQueueIdError::is_result_Set() const{
    return m_result_isSet;
}

bool OAIBadEventQueueIdError::is_result_Valid() const{
    return m_result_isValid;
}

OAIAnyType OAIBadEventQueueIdError::getMsg() const {
    return msg;
}
void OAIBadEventQueueIdError::setMsg(const OAIAnyType &msg) {
    this->msg = msg;
    this->m_msg_isSet = true;
}

bool OAIBadEventQueueIdError::is_msg_Set() const{
    return m_msg_isSet;
}

bool OAIBadEventQueueIdError::is_msg_Valid() const{
    return m_msg_isValid;
}

OAIAnyType OAIBadEventQueueIdError::getCode() const {
    return code;
}
void OAIBadEventQueueIdError::setCode(const OAIAnyType &code) {
    this->code = code;
    this->m_code_isSet = true;
}

bool OAIBadEventQueueIdError::is_code_Set() const{
    return m_code_isSet;
}

bool OAIBadEventQueueIdError::is_code_Valid() const{
    return m_code_isValid;
}

QString OAIBadEventQueueIdError::getQueueId() const {
    return queue_id;
}
void OAIBadEventQueueIdError::setQueueId(const QString &queue_id) {
    this->queue_id = queue_id;
    this->m_queue_id_isSet = true;
}

bool OAIBadEventQueueIdError::is_queue_id_Set() const{
    return m_queue_id_isSet;
}

bool OAIBadEventQueueIdError::is_queue_id_Valid() const{
    return m_queue_id_isValid;
}

bool OAIBadEventQueueIdError::isSet() const {
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

        if (m_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_queue_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIBadEventQueueIdError::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_result_isValid && m_msg_isValid && true;
}

} // namespace OpenAPI
