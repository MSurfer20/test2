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

#include "OAIAddSubscriptionsResponse_allOf.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAddSubscriptionsResponse_allOf::OAIAddSubscriptionsResponse_allOf(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAddSubscriptionsResponse_allOf::OAIAddSubscriptionsResponse_allOf() {
    this->initializeModel();
}

OAIAddSubscriptionsResponse_allOf::~OAIAddSubscriptionsResponse_allOf() {}

void OAIAddSubscriptionsResponse_allOf::initializeModel() {

    m_result_isSet = false;
    m_result_isValid = false;

    m_msg_isSet = false;
    m_msg_isValid = false;

    m_subscribed_isSet = false;
    m_subscribed_isValid = false;

    m_already_subscribed_isSet = false;
    m_already_subscribed_isValid = false;

    m_unauthorized_isSet = false;
    m_unauthorized_isValid = false;
}

void OAIAddSubscriptionsResponse_allOf::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAddSubscriptionsResponse_allOf::fromJsonObject(QJsonObject json) {

    m_result_isValid = ::OpenAPI::fromJsonValue(result, json[QString("result")]);
    m_result_isSet = !json[QString("result")].isNull() && m_result_isValid;

    m_msg_isValid = ::OpenAPI::fromJsonValue(msg, json[QString("msg")]);
    m_msg_isSet = !json[QString("msg")].isNull() && m_msg_isValid;

    if(json["subscribed"].isObject()){
        auto varmap = json["subscribed"].toObject().toVariantMap();
        m_subscribed_isValid = true;
        if(varmap.count() > 0){
            for(auto val : varmap.keys()){
                QList<QString> item;
                auto jval = QJsonValue::fromVariant(varmap.value(val));
                m_subscribed_isValid &= ::OpenAPI::fromJsonValue(item, jval);
                m_subscribed_isSet &= !jval.isNull() && m_subscribed_isValid;
                subscribed.insert(subscribed.end(), val, item);
            }
        }
    }

    if(json["already_subscribed"].isObject()){
        auto varmap = json["already_subscribed"].toObject().toVariantMap();
        m_already_subscribed_isValid = true;
        if(varmap.count() > 0){
            for(auto val : varmap.keys()){
                QList<QString> item;
                auto jval = QJsonValue::fromVariant(varmap.value(val));
                m_already_subscribed_isValid &= ::OpenAPI::fromJsonValue(item, jval);
                m_already_subscribed_isSet &= !jval.isNull() && m_already_subscribed_isValid;
                already_subscribed.insert(already_subscribed.end(), val, item);
            }
        }
    }

    m_unauthorized_isValid = ::OpenAPI::fromJsonValue(unauthorized, json[QString("unauthorized")]);
    m_unauthorized_isSet = !json[QString("unauthorized")].isNull() && m_unauthorized_isValid;
}

QString OAIAddSubscriptionsResponse_allOf::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAddSubscriptionsResponse_allOf::asJsonObject() const {
    QJsonObject obj;
    if (m_result_isSet) {
        obj.insert(QString("result"), ::OpenAPI::toJsonValue(result));
    }
    if (m_msg_isSet) {
        obj.insert(QString("msg"), ::OpenAPI::toJsonValue(msg));
    }
    if (subscribed.size() > 0) {
        
        obj.insert(QString("subscribed"), toJsonValue(subscribed));
    }
    if (already_subscribed.size() > 0) {
        
        obj.insert(QString("already_subscribed"), toJsonValue(already_subscribed));
    }
    if (unauthorized.size() > 0) {
        obj.insert(QString("unauthorized"), ::OpenAPI::toJsonValue(unauthorized));
    }
    return obj;
}

OAIAnyType OAIAddSubscriptionsResponse_allOf::getResult() const {
    return result;
}
void OAIAddSubscriptionsResponse_allOf::setResult(const OAIAnyType &result) {
    this->result = result;
    this->m_result_isSet = true;
}

bool OAIAddSubscriptionsResponse_allOf::is_result_Set() const{
    return m_result_isSet;
}

bool OAIAddSubscriptionsResponse_allOf::is_result_Valid() const{
    return m_result_isValid;
}

OAIAnyType OAIAddSubscriptionsResponse_allOf::getMsg() const {
    return msg;
}
void OAIAddSubscriptionsResponse_allOf::setMsg(const OAIAnyType &msg) {
    this->msg = msg;
    this->m_msg_isSet = true;
}

bool OAIAddSubscriptionsResponse_allOf::is_msg_Set() const{
    return m_msg_isSet;
}

bool OAIAddSubscriptionsResponse_allOf::is_msg_Valid() const{
    return m_msg_isValid;
}

QMap<QString, QList<QString>> OAIAddSubscriptionsResponse_allOf::getSubscribed() const {
    return subscribed;
}
void OAIAddSubscriptionsResponse_allOf::setSubscribed(const QMap<QString, QList<QString>> &subscribed) {
    this->subscribed = subscribed;
    this->m_subscribed_isSet = true;
}

bool OAIAddSubscriptionsResponse_allOf::is_subscribed_Set() const{
    return m_subscribed_isSet;
}

bool OAIAddSubscriptionsResponse_allOf::is_subscribed_Valid() const{
    return m_subscribed_isValid;
}

QMap<QString, QList<QString>> OAIAddSubscriptionsResponse_allOf::getAlreadySubscribed() const {
    return already_subscribed;
}
void OAIAddSubscriptionsResponse_allOf::setAlreadySubscribed(const QMap<QString, QList<QString>> &already_subscribed) {
    this->already_subscribed = already_subscribed;
    this->m_already_subscribed_isSet = true;
}

bool OAIAddSubscriptionsResponse_allOf::is_already_subscribed_Set() const{
    return m_already_subscribed_isSet;
}

bool OAIAddSubscriptionsResponse_allOf::is_already_subscribed_Valid() const{
    return m_already_subscribed_isValid;
}

QList<QString> OAIAddSubscriptionsResponse_allOf::getUnauthorized() const {
    return unauthorized;
}
void OAIAddSubscriptionsResponse_allOf::setUnauthorized(const QList<QString> &unauthorized) {
    this->unauthorized = unauthorized;
    this->m_unauthorized_isSet = true;
}

bool OAIAddSubscriptionsResponse_allOf::is_unauthorized_Set() const{
    return m_unauthorized_isSet;
}

bool OAIAddSubscriptionsResponse_allOf::is_unauthorized_Valid() const{
    return m_unauthorized_isValid;
}

bool OAIAddSubscriptionsResponse_allOf::isSet() const {
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

        if (subscribed.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (already_subscribed.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (unauthorized.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAddSubscriptionsResponse_allOf::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI