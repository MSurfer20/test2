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

/*
 * OAIUser.h
 *
 * 
 */

#ifndef OAIUser_H
#define OAIUser_H

#include <QJsonObject>

#include "OAIAnyType.h"
#include "OAIUserBase.h"
#include "OAIUser_allOf.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUser : public OAIObject {
public:
    OAIUser();
    OAIUser(QString json);
    ~OAIUser() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIAnyType getEmail() const;
    void setEmail(const OAIAnyType &email);
    bool is_email_Set() const;
    bool is_email_Valid() const;

    OAIAnyType getIsBot() const;
    void setIsBot(const OAIAnyType &is_bot);
    bool is_is_bot_Set() const;
    bool is_is_bot_Valid() const;

    OAIAnyType getAvatarUrl() const;
    void setAvatarUrl(const OAIAnyType &avatar_url);
    bool is_avatar_url_Set() const;
    bool is_avatar_url_Valid() const;

    OAIAnyType getAvatarVersion() const;
    void setAvatarVersion(const OAIAnyType &avatar_version);
    bool is_avatar_version_Set() const;
    bool is_avatar_version_Valid() const;

    OAIAnyType getFullName() const;
    void setFullName(const OAIAnyType &full_name);
    bool is_full_name_Set() const;
    bool is_full_name_Valid() const;

    OAIAnyType getIsAdmin() const;
    void setIsAdmin(const OAIAnyType &is_admin);
    bool is_is_admin_Set() const;
    bool is_is_admin_Valid() const;

    OAIAnyType getIsOwner() const;
    void setIsOwner(const OAIAnyType &is_owner);
    bool is_is_owner_Set() const;
    bool is_is_owner_Valid() const;

    OAIAnyType getIsBillingAdmin() const;
    void setIsBillingAdmin(const OAIAnyType &is_billing_admin);
    bool is_is_billing_admin_Set() const;
    bool is_is_billing_admin_Valid() const;

    OAIAnyType getRole() const;
    void setRole(const OAIAnyType &role);
    bool is_role_Set() const;
    bool is_role_Valid() const;

    OAIAnyType getBotType() const;
    void setBotType(const OAIAnyType &bot_type);
    bool is_bot_type_Set() const;
    bool is_bot_type_Valid() const;

    OAIAnyType getUserId() const;
    void setUserId(const OAIAnyType &user_id);
    bool is_user_id_Set() const;
    bool is_user_id_Valid() const;

    OAIAnyType getBotOwnerId() const;
    void setBotOwnerId(const OAIAnyType &bot_owner_id);
    bool is_bot_owner_id_Set() const;
    bool is_bot_owner_id_Valid() const;

    OAIAnyType getIsActive() const;
    void setIsActive(const OAIAnyType &is_active);
    bool is_is_active_Set() const;
    bool is_is_active_Valid() const;

    OAIAnyType getIsGuest() const;
    void setIsGuest(const OAIAnyType &is_guest);
    bool is_is_guest_Set() const;
    bool is_is_guest_Valid() const;

    OAIAnyType getTimezone() const;
    void setTimezone(const OAIAnyType &timezone);
    bool is_timezone_Set() const;
    bool is_timezone_Valid() const;

    OAIAnyType getDateJoined() const;
    void setDateJoined(const OAIAnyType &date_joined);
    bool is_date_joined_Set() const;
    bool is_date_joined_Valid() const;

    OAIAnyType getDeliveryEmail() const;
    void setDeliveryEmail(const OAIAnyType &delivery_email);
    bool is_delivery_email_Set() const;
    bool is_delivery_email_Valid() const;

    OAIAnyType getProfileData() const;
    void setProfileData(const OAIAnyType &profile_data);
    bool is_profile_data_Set() const;
    bool is_profile_data_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIAnyType email;
    bool m_email_isSet;
    bool m_email_isValid;

    OAIAnyType is_bot;
    bool m_is_bot_isSet;
    bool m_is_bot_isValid;

    OAIAnyType avatar_url;
    bool m_avatar_url_isSet;
    bool m_avatar_url_isValid;

    OAIAnyType avatar_version;
    bool m_avatar_version_isSet;
    bool m_avatar_version_isValid;

    OAIAnyType full_name;
    bool m_full_name_isSet;
    bool m_full_name_isValid;

    OAIAnyType is_admin;
    bool m_is_admin_isSet;
    bool m_is_admin_isValid;

    OAIAnyType is_owner;
    bool m_is_owner_isSet;
    bool m_is_owner_isValid;

    OAIAnyType is_billing_admin;
    bool m_is_billing_admin_isSet;
    bool m_is_billing_admin_isValid;

    OAIAnyType role;
    bool m_role_isSet;
    bool m_role_isValid;

    OAIAnyType bot_type;
    bool m_bot_type_isSet;
    bool m_bot_type_isValid;

    OAIAnyType user_id;
    bool m_user_id_isSet;
    bool m_user_id_isValid;

    OAIAnyType bot_owner_id;
    bool m_bot_owner_id_isSet;
    bool m_bot_owner_id_isValid;

    OAIAnyType is_active;
    bool m_is_active_isSet;
    bool m_is_active_isValid;

    OAIAnyType is_guest;
    bool m_is_guest_isSet;
    bool m_is_guest_isValid;

    OAIAnyType timezone;
    bool m_timezone_isSet;
    bool m_timezone_isValid;

    OAIAnyType date_joined;
    bool m_date_joined_isSet;
    bool m_date_joined_isValid;

    OAIAnyType delivery_email;
    bool m_delivery_email_isSet;
    bool m_delivery_email_isValid;

    OAIAnyType profile_data;
    bool m_profile_data_isSet;
    bool m_profile_data_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUser)

#endif // OAIUser_H
