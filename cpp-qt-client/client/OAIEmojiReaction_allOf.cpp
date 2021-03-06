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

#include "OAIEmojiReaction_allOf.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIEmojiReaction_allOf::OAIEmojiReaction_allOf(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIEmojiReaction_allOf::OAIEmojiReaction_allOf() {
    this->initializeModel();
}

OAIEmojiReaction_allOf::~OAIEmojiReaction_allOf() {}

void OAIEmojiReaction_allOf::initializeModel() {

    m_emoji_code_isSet = false;
    m_emoji_code_isValid = false;

    m_emoji_name_isSet = false;
    m_emoji_name_isValid = false;

    m_reaction_type_isSet = false;
    m_reaction_type_isValid = false;

    m_user_id_isSet = false;
    m_user_id_isValid = false;

    m_user_isSet = false;
    m_user_isValid = false;
}

void OAIEmojiReaction_allOf::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIEmojiReaction_allOf::fromJsonObject(QJsonObject json) {

    m_emoji_code_isValid = ::OpenAPI::fromJsonValue(emoji_code, json[QString("emoji_code")]);
    m_emoji_code_isSet = !json[QString("emoji_code")].isNull() && m_emoji_code_isValid;

    m_emoji_name_isValid = ::OpenAPI::fromJsonValue(emoji_name, json[QString("emoji_name")]);
    m_emoji_name_isSet = !json[QString("emoji_name")].isNull() && m_emoji_name_isValid;

    m_reaction_type_isValid = ::OpenAPI::fromJsonValue(reaction_type, json[QString("reaction_type")]);
    m_reaction_type_isSet = !json[QString("reaction_type")].isNull() && m_reaction_type_isValid;

    m_user_id_isValid = ::OpenAPI::fromJsonValue(user_id, json[QString("user_id")]);
    m_user_id_isSet = !json[QString("user_id")].isNull() && m_user_id_isValid;

    m_user_isValid = ::OpenAPI::fromJsonValue(user, json[QString("user")]);
    m_user_isSet = !json[QString("user")].isNull() && m_user_isValid;
}

QString OAIEmojiReaction_allOf::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIEmojiReaction_allOf::asJsonObject() const {
    QJsonObject obj;
    if (m_emoji_code_isSet) {
        obj.insert(QString("emoji_code"), ::OpenAPI::toJsonValue(emoji_code));
    }
    if (m_emoji_name_isSet) {
        obj.insert(QString("emoji_name"), ::OpenAPI::toJsonValue(emoji_name));
    }
    if (m_reaction_type_isSet) {
        obj.insert(QString("reaction_type"), ::OpenAPI::toJsonValue(reaction_type));
    }
    if (m_user_id_isSet) {
        obj.insert(QString("user_id"), ::OpenAPI::toJsonValue(user_id));
    }
    if (m_user_isSet) {
        obj.insert(QString("user"), ::OpenAPI::toJsonValue(user));
    }
    return obj;
}

OAIAnyType OAIEmojiReaction_allOf::getEmojiCode() const {
    return emoji_code;
}
void OAIEmojiReaction_allOf::setEmojiCode(const OAIAnyType &emoji_code) {
    this->emoji_code = emoji_code;
    this->m_emoji_code_isSet = true;
}

bool OAIEmojiReaction_allOf::is_emoji_code_Set() const{
    return m_emoji_code_isSet;
}

bool OAIEmojiReaction_allOf::is_emoji_code_Valid() const{
    return m_emoji_code_isValid;
}

OAIAnyType OAIEmojiReaction_allOf::getEmojiName() const {
    return emoji_name;
}
void OAIEmojiReaction_allOf::setEmojiName(const OAIAnyType &emoji_name) {
    this->emoji_name = emoji_name;
    this->m_emoji_name_isSet = true;
}

bool OAIEmojiReaction_allOf::is_emoji_name_Set() const{
    return m_emoji_name_isSet;
}

bool OAIEmojiReaction_allOf::is_emoji_name_Valid() const{
    return m_emoji_name_isValid;
}

OAIAnyType OAIEmojiReaction_allOf::getReactionType() const {
    return reaction_type;
}
void OAIEmojiReaction_allOf::setReactionType(const OAIAnyType &reaction_type) {
    this->reaction_type = reaction_type;
    this->m_reaction_type_isSet = true;
}

bool OAIEmojiReaction_allOf::is_reaction_type_Set() const{
    return m_reaction_type_isSet;
}

bool OAIEmojiReaction_allOf::is_reaction_type_Valid() const{
    return m_reaction_type_isValid;
}

OAIAnyType OAIEmojiReaction_allOf::getUserId() const {
    return user_id;
}
void OAIEmojiReaction_allOf::setUserId(const OAIAnyType &user_id) {
    this->user_id = user_id;
    this->m_user_id_isSet = true;
}

bool OAIEmojiReaction_allOf::is_user_id_Set() const{
    return m_user_id_isSet;
}

bool OAIEmojiReaction_allOf::is_user_id_Valid() const{
    return m_user_id_isValid;
}

OAIAnyType OAIEmojiReaction_allOf::getUser() const {
    return user;
}
void OAIEmojiReaction_allOf::setUser(const OAIAnyType &user) {
    this->user = user;
    this->m_user_isSet = true;
}

bool OAIEmojiReaction_allOf::is_user_Set() const{
    return m_user_isSet;
}

bool OAIEmojiReaction_allOf::is_user_Valid() const{
    return m_user_isValid;
}

bool OAIEmojiReaction_allOf::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_emoji_code_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_emoji_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_reaction_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIEmojiReaction_allOf::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
