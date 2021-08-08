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

#include "OAIUser_allOf.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUser_allOf::OAIUser_allOf(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUser_allOf::OAIUser_allOf() {
    this->initializeModel();
}

OAIUser_allOf::~OAIUser_allOf() {}

void OAIUser_allOf::initializeModel() {

    m_email_isSet = false;
    m_email_isValid = false;

    m_is_bot_isSet = false;
    m_is_bot_isValid = false;

    m_avatar_url_isSet = false;
    m_avatar_url_isValid = false;

    m_avatar_version_isSet = false;
    m_avatar_version_isValid = false;

    m_full_name_isSet = false;
    m_full_name_isValid = false;

    m_is_admin_isSet = false;
    m_is_admin_isValid = false;

    m_is_owner_isSet = false;
    m_is_owner_isValid = false;

    m_is_billing_admin_isSet = false;
    m_is_billing_admin_isValid = false;

    m_role_isSet = false;
    m_role_isValid = false;

    m_bot_type_isSet = false;
    m_bot_type_isValid = false;

    m_user_id_isSet = false;
    m_user_id_isValid = false;

    m_bot_owner_id_isSet = false;
    m_bot_owner_id_isValid = false;

    m_is_active_isSet = false;
    m_is_active_isValid = false;

    m_is_guest_isSet = false;
    m_is_guest_isValid = false;

    m_timezone_isSet = false;
    m_timezone_isValid = false;

    m_date_joined_isSet = false;
    m_date_joined_isValid = false;

    m_delivery_email_isSet = false;
    m_delivery_email_isValid = false;

    m_profile_data_isSet = false;
    m_profile_data_isValid = false;
}

void OAIUser_allOf::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUser_allOf::fromJsonObject(QJsonObject json) {

    m_email_isValid = ::OpenAPI::fromJsonValue(email, json[QString("email")]);
    m_email_isSet = !json[QString("email")].isNull() && m_email_isValid;

    m_is_bot_isValid = ::OpenAPI::fromJsonValue(is_bot, json[QString("is_bot")]);
    m_is_bot_isSet = !json[QString("is_bot")].isNull() && m_is_bot_isValid;

    m_avatar_url_isValid = ::OpenAPI::fromJsonValue(avatar_url, json[QString("avatar_url")]);
    m_avatar_url_isSet = !json[QString("avatar_url")].isNull() && m_avatar_url_isValid;

    m_avatar_version_isValid = ::OpenAPI::fromJsonValue(avatar_version, json[QString("avatar_version")]);
    m_avatar_version_isSet = !json[QString("avatar_version")].isNull() && m_avatar_version_isValid;

    m_full_name_isValid = ::OpenAPI::fromJsonValue(full_name, json[QString("full_name")]);
    m_full_name_isSet = !json[QString("full_name")].isNull() && m_full_name_isValid;

    m_is_admin_isValid = ::OpenAPI::fromJsonValue(is_admin, json[QString("is_admin")]);
    m_is_admin_isSet = !json[QString("is_admin")].isNull() && m_is_admin_isValid;

    m_is_owner_isValid = ::OpenAPI::fromJsonValue(is_owner, json[QString("is_owner")]);
    m_is_owner_isSet = !json[QString("is_owner")].isNull() && m_is_owner_isValid;

    m_is_billing_admin_isValid = ::OpenAPI::fromJsonValue(is_billing_admin, json[QString("is_billing_admin")]);
    m_is_billing_admin_isSet = !json[QString("is_billing_admin")].isNull() && m_is_billing_admin_isValid;

    m_role_isValid = ::OpenAPI::fromJsonValue(role, json[QString("role")]);
    m_role_isSet = !json[QString("role")].isNull() && m_role_isValid;

    m_bot_type_isValid = ::OpenAPI::fromJsonValue(bot_type, json[QString("bot_type")]);
    m_bot_type_isSet = !json[QString("bot_type")].isNull() && m_bot_type_isValid;

    m_user_id_isValid = ::OpenAPI::fromJsonValue(user_id, json[QString("user_id")]);
    m_user_id_isSet = !json[QString("user_id")].isNull() && m_user_id_isValid;

    m_bot_owner_id_isValid = ::OpenAPI::fromJsonValue(bot_owner_id, json[QString("bot_owner_id")]);
    m_bot_owner_id_isSet = !json[QString("bot_owner_id")].isNull() && m_bot_owner_id_isValid;

    m_is_active_isValid = ::OpenAPI::fromJsonValue(is_active, json[QString("is_active")]);
    m_is_active_isSet = !json[QString("is_active")].isNull() && m_is_active_isValid;

    m_is_guest_isValid = ::OpenAPI::fromJsonValue(is_guest, json[QString("is_guest")]);
    m_is_guest_isSet = !json[QString("is_guest")].isNull() && m_is_guest_isValid;

    m_timezone_isValid = ::OpenAPI::fromJsonValue(timezone, json[QString("timezone")]);
    m_timezone_isSet = !json[QString("timezone")].isNull() && m_timezone_isValid;

    m_date_joined_isValid = ::OpenAPI::fromJsonValue(date_joined, json[QString("date_joined")]);
    m_date_joined_isSet = !json[QString("date_joined")].isNull() && m_date_joined_isValid;

    m_delivery_email_isValid = ::OpenAPI::fromJsonValue(delivery_email, json[QString("delivery_email")]);
    m_delivery_email_isSet = !json[QString("delivery_email")].isNull() && m_delivery_email_isValid;

    m_profile_data_isValid = ::OpenAPI::fromJsonValue(profile_data, json[QString("profile_data")]);
    m_profile_data_isSet = !json[QString("profile_data")].isNull() && m_profile_data_isValid;
}

QString OAIUser_allOf::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUser_allOf::asJsonObject() const {
    QJsonObject obj;
    if (m_email_isSet) {
        obj.insert(QString("email"), ::OpenAPI::toJsonValue(email));
    }
    if (m_is_bot_isSet) {
        obj.insert(QString("is_bot"), ::OpenAPI::toJsonValue(is_bot));
    }
    if (m_avatar_url_isSet) {
        obj.insert(QString("avatar_url"), ::OpenAPI::toJsonValue(avatar_url));
    }
    if (m_avatar_version_isSet) {
        obj.insert(QString("avatar_version"), ::OpenAPI::toJsonValue(avatar_version));
    }
    if (m_full_name_isSet) {
        obj.insert(QString("full_name"), ::OpenAPI::toJsonValue(full_name));
    }
    if (m_is_admin_isSet) {
        obj.insert(QString("is_admin"), ::OpenAPI::toJsonValue(is_admin));
    }
    if (m_is_owner_isSet) {
        obj.insert(QString("is_owner"), ::OpenAPI::toJsonValue(is_owner));
    }
    if (m_is_billing_admin_isSet) {
        obj.insert(QString("is_billing_admin"), ::OpenAPI::toJsonValue(is_billing_admin));
    }
    if (m_role_isSet) {
        obj.insert(QString("role"), ::OpenAPI::toJsonValue(role));
    }
    if (m_bot_type_isSet) {
        obj.insert(QString("bot_type"), ::OpenAPI::toJsonValue(bot_type));
    }
    if (m_user_id_isSet) {
        obj.insert(QString("user_id"), ::OpenAPI::toJsonValue(user_id));
    }
    if (m_bot_owner_id_isSet) {
        obj.insert(QString("bot_owner_id"), ::OpenAPI::toJsonValue(bot_owner_id));
    }
    if (m_is_active_isSet) {
        obj.insert(QString("is_active"), ::OpenAPI::toJsonValue(is_active));
    }
    if (m_is_guest_isSet) {
        obj.insert(QString("is_guest"), ::OpenAPI::toJsonValue(is_guest));
    }
    if (m_timezone_isSet) {
        obj.insert(QString("timezone"), ::OpenAPI::toJsonValue(timezone));
    }
    if (m_date_joined_isSet) {
        obj.insert(QString("date_joined"), ::OpenAPI::toJsonValue(date_joined));
    }
    if (m_delivery_email_isSet) {
        obj.insert(QString("delivery_email"), ::OpenAPI::toJsonValue(delivery_email));
    }
    if (m_profile_data_isSet) {
        obj.insert(QString("profile_data"), ::OpenAPI::toJsonValue(profile_data));
    }
    return obj;
}

OAIAnyType OAIUser_allOf::getEmail() const {
    return email;
}
void OAIUser_allOf::setEmail(const OAIAnyType &email) {
    this->email = email;
    this->m_email_isSet = true;
}

bool OAIUser_allOf::is_email_Set() const{
    return m_email_isSet;
}

bool OAIUser_allOf::is_email_Valid() const{
    return m_email_isValid;
}

OAIAnyType OAIUser_allOf::getIsBot() const {
    return is_bot;
}
void OAIUser_allOf::setIsBot(const OAIAnyType &is_bot) {
    this->is_bot = is_bot;
    this->m_is_bot_isSet = true;
}

bool OAIUser_allOf::is_is_bot_Set() const{
    return m_is_bot_isSet;
}

bool OAIUser_allOf::is_is_bot_Valid() const{
    return m_is_bot_isValid;
}

OAIAnyType OAIUser_allOf::getAvatarUrl() const {
    return avatar_url;
}
void OAIUser_allOf::setAvatarUrl(const OAIAnyType &avatar_url) {
    this->avatar_url = avatar_url;
    this->m_avatar_url_isSet = true;
}

bool OAIUser_allOf::is_avatar_url_Set() const{
    return m_avatar_url_isSet;
}

bool OAIUser_allOf::is_avatar_url_Valid() const{
    return m_avatar_url_isValid;
}

OAIAnyType OAIUser_allOf::getAvatarVersion() const {
    return avatar_version;
}
void OAIUser_allOf::setAvatarVersion(const OAIAnyType &avatar_version) {
    this->avatar_version = avatar_version;
    this->m_avatar_version_isSet = true;
}

bool OAIUser_allOf::is_avatar_version_Set() const{
    return m_avatar_version_isSet;
}

bool OAIUser_allOf::is_avatar_version_Valid() const{
    return m_avatar_version_isValid;
}

OAIAnyType OAIUser_allOf::getFullName() const {
    return full_name;
}
void OAIUser_allOf::setFullName(const OAIAnyType &full_name) {
    this->full_name = full_name;
    this->m_full_name_isSet = true;
}

bool OAIUser_allOf::is_full_name_Set() const{
    return m_full_name_isSet;
}

bool OAIUser_allOf::is_full_name_Valid() const{
    return m_full_name_isValid;
}

OAIAnyType OAIUser_allOf::getIsAdmin() const {
    return is_admin;
}
void OAIUser_allOf::setIsAdmin(const OAIAnyType &is_admin) {
    this->is_admin = is_admin;
    this->m_is_admin_isSet = true;
}

bool OAIUser_allOf::is_is_admin_Set() const{
    return m_is_admin_isSet;
}

bool OAIUser_allOf::is_is_admin_Valid() const{
    return m_is_admin_isValid;
}

OAIAnyType OAIUser_allOf::getIsOwner() const {
    return is_owner;
}
void OAIUser_allOf::setIsOwner(const OAIAnyType &is_owner) {
    this->is_owner = is_owner;
    this->m_is_owner_isSet = true;
}

bool OAIUser_allOf::is_is_owner_Set() const{
    return m_is_owner_isSet;
}

bool OAIUser_allOf::is_is_owner_Valid() const{
    return m_is_owner_isValid;
}

OAIAnyType OAIUser_allOf::getIsBillingAdmin() const {
    return is_billing_admin;
}
void OAIUser_allOf::setIsBillingAdmin(const OAIAnyType &is_billing_admin) {
    this->is_billing_admin = is_billing_admin;
    this->m_is_billing_admin_isSet = true;
}

bool OAIUser_allOf::is_is_billing_admin_Set() const{
    return m_is_billing_admin_isSet;
}

bool OAIUser_allOf::is_is_billing_admin_Valid() const{
    return m_is_billing_admin_isValid;
}

OAIAnyType OAIUser_allOf::getRole() const {
    return role;
}
void OAIUser_allOf::setRole(const OAIAnyType &role) {
    this->role = role;
    this->m_role_isSet = true;
}

bool OAIUser_allOf::is_role_Set() const{
    return m_role_isSet;
}

bool OAIUser_allOf::is_role_Valid() const{
    return m_role_isValid;
}

OAIAnyType OAIUser_allOf::getBotType() const {
    return bot_type;
}
void OAIUser_allOf::setBotType(const OAIAnyType &bot_type) {
    this->bot_type = bot_type;
    this->m_bot_type_isSet = true;
}

bool OAIUser_allOf::is_bot_type_Set() const{
    return m_bot_type_isSet;
}

bool OAIUser_allOf::is_bot_type_Valid() const{
    return m_bot_type_isValid;
}

OAIAnyType OAIUser_allOf::getUserId() const {
    return user_id;
}
void OAIUser_allOf::setUserId(const OAIAnyType &user_id) {
    this->user_id = user_id;
    this->m_user_id_isSet = true;
}

bool OAIUser_allOf::is_user_id_Set() const{
    return m_user_id_isSet;
}

bool OAIUser_allOf::is_user_id_Valid() const{
    return m_user_id_isValid;
}

OAIAnyType OAIUser_allOf::getBotOwnerId() const {
    return bot_owner_id;
}
void OAIUser_allOf::setBotOwnerId(const OAIAnyType &bot_owner_id) {
    this->bot_owner_id = bot_owner_id;
    this->m_bot_owner_id_isSet = true;
}

bool OAIUser_allOf::is_bot_owner_id_Set() const{
    return m_bot_owner_id_isSet;
}

bool OAIUser_allOf::is_bot_owner_id_Valid() const{
    return m_bot_owner_id_isValid;
}

OAIAnyType OAIUser_allOf::getIsActive() const {
    return is_active;
}
void OAIUser_allOf::setIsActive(const OAIAnyType &is_active) {
    this->is_active = is_active;
    this->m_is_active_isSet = true;
}

bool OAIUser_allOf::is_is_active_Set() const{
    return m_is_active_isSet;
}

bool OAIUser_allOf::is_is_active_Valid() const{
    return m_is_active_isValid;
}

OAIAnyType OAIUser_allOf::getIsGuest() const {
    return is_guest;
}
void OAIUser_allOf::setIsGuest(const OAIAnyType &is_guest) {
    this->is_guest = is_guest;
    this->m_is_guest_isSet = true;
}

bool OAIUser_allOf::is_is_guest_Set() const{
    return m_is_guest_isSet;
}

bool OAIUser_allOf::is_is_guest_Valid() const{
    return m_is_guest_isValid;
}

OAIAnyType OAIUser_allOf::getTimezone() const {
    return timezone;
}
void OAIUser_allOf::setTimezone(const OAIAnyType &timezone) {
    this->timezone = timezone;
    this->m_timezone_isSet = true;
}

bool OAIUser_allOf::is_timezone_Set() const{
    return m_timezone_isSet;
}

bool OAIUser_allOf::is_timezone_Valid() const{
    return m_timezone_isValid;
}

OAIAnyType OAIUser_allOf::getDateJoined() const {
    return date_joined;
}
void OAIUser_allOf::setDateJoined(const OAIAnyType &date_joined) {
    this->date_joined = date_joined;
    this->m_date_joined_isSet = true;
}

bool OAIUser_allOf::is_date_joined_Set() const{
    return m_date_joined_isSet;
}

bool OAIUser_allOf::is_date_joined_Valid() const{
    return m_date_joined_isValid;
}

OAIAnyType OAIUser_allOf::getDeliveryEmail() const {
    return delivery_email;
}
void OAIUser_allOf::setDeliveryEmail(const OAIAnyType &delivery_email) {
    this->delivery_email = delivery_email;
    this->m_delivery_email_isSet = true;
}

bool OAIUser_allOf::is_delivery_email_Set() const{
    return m_delivery_email_isSet;
}

bool OAIUser_allOf::is_delivery_email_Valid() const{
    return m_delivery_email_isValid;
}

OAIAnyType OAIUser_allOf::getProfileData() const {
    return profile_data;
}
void OAIUser_allOf::setProfileData(const OAIAnyType &profile_data) {
    this->profile_data = profile_data;
    this->m_profile_data_isSet = true;
}

bool OAIUser_allOf::is_profile_data_Set() const{
    return m_profile_data_isSet;
}

bool OAIUser_allOf::is_profile_data_Valid() const{
    return m_profile_data_isValid;
}

bool OAIUser_allOf::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_bot_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_avatar_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_avatar_version_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_full_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_admin_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_owner_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_billing_admin_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_role_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_bot_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_user_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_bot_owner_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_active_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_is_guest_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timezone_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_date_joined_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_delivery_email_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_profile_data_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUser_allOf::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
