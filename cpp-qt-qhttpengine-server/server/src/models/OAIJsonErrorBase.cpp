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

#include "OAIJsonErrorBase.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIJsonErrorBase::OAIJsonErrorBase(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIJsonErrorBase::OAIJsonErrorBase() {
    this->initializeModel();
}

OAIJsonErrorBase::~OAIJsonErrorBase() {}

void OAIJsonErrorBase::initializeModel() {

    m_result_isSet = false;
    m_result_isValid = false;

    m_msg_isSet = false;
    m_msg_isValid = false;
}

void OAIJsonErrorBase::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIJsonErrorBase::fromJsonObject(QJsonObject json) {

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;

    m_msg_isValid = ::OpenAPI::fromJsonValue(msg, json[QString("msg")]);
    m_msg_isSet = !json[QString("msg")].isNull() && m_msg_isValid;
}

QString OAIJsonErrorBase::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIJsonErrorBase::asJsonObject() const {
    QJsonObject obj;
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    if (m_msg_isSet) {
        obj.insert(QString("msg"), ::OpenAPI::toJsonValue(msg));
    }
    return obj;
}

QString OAIJsonErrorBase::getResult() const {
    return result;
}
void OAIJsonErrorBase::setResult(const QString &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIJsonErrorBase::is_result_Set() const{
    return m_result_isSet;
}

bool OAIJsonErrorBase::is_result_Valid() const{
    return m_result_isValid;
}

QString OAIJsonErrorBase::getMsg() const {
    return msg;
}
void OAIJsonErrorBase::setMsg(const QString &msg) {
    this->msg = msg;
    this->m_msg_isSet = true;
}

bool OAIJsonErrorBase::is_msg_Set() const{
    return m_msg_isSet;
}

bool OAIJsonErrorBase::is_msg_Valid() const{
    return m_msg_isValid;
}

bool OAIJsonErrorBase::isSet() const {
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

bool OAIJsonErrorBase::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_result_isValid && m_msg_isValid && true;
}

} // namespace OpenAPI