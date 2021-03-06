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

#include "OAIJsonResponseBase.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIJsonResponseBase::OAIJsonResponseBase(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIJsonResponseBase::OAIJsonResponseBase() {
    this->initializeModel();
}

OAIJsonResponseBase::~OAIJsonResponseBase() {}

void OAIJsonResponseBase::initializeModel() {

    m_result_isSet = false;
    m_result_isValid = false;
}

void OAIJsonResponseBase::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIJsonResponseBase::fromJsonObject(QJsonObject json) {

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;
}

QString OAIJsonResponseBase::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIJsonResponseBase::asJsonObject() const {
    QJsonObject obj;
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    return obj;
}

QString OAIJsonResponseBase::getResult() const {
    return result;
}
void OAIJsonResponseBase::setResult(const QString &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIJsonResponseBase::is_result_Set() const{
    return m_result_isSet;
}

bool OAIJsonResponseBase::is_result_Valid() const{
    return m_result_isValid;
}

bool OAIJsonResponseBase::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_result_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIJsonResponseBase::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
