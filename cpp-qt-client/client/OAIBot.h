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
 * OAIBot.h
 *
 * 
 */

#ifndef OAIBot_H
#define OAIBot_H

#include <QJsonObject>

#include "OAIAnyType.h"
#include "OAIBasicBotBase.h"
#include "OAIBot_allOf.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIBot : public OAIObject {
public:
    OAIBot();
    OAIBot(QString json);
    ~OAIBot() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIAnyType getUserId() const;
    void setUserId(const OAIAnyType &user_id);
    bool is_user_id_Set() const;
    bool is_user_id_Valid() const;

    OAIAnyType getFullName() const;
    void setFullName(const OAIAnyType &full_name);
    bool is_full_name_Set() const;
    bool is_full_name_Valid() const;

    OAIAnyType getApiKey() const;
    void setApiKey(const OAIAnyType &api_key);
    bool is_api_key_Set() const;
    bool is_api_key_Valid() const;

    OAIAnyType getDefaultSendingStream() const;
    void setDefaultSendingStream(const OAIAnyType &default_sending_stream);
    bool is_default_sending_stream_Set() const;
    bool is_default_sending_stream_Valid() const;

    OAIAnyType getDefaultEventsRegisterStream() const;
    void setDefaultEventsRegisterStream(const OAIAnyType &default_events_register_stream);
    bool is_default_events_register_stream_Set() const;
    bool is_default_events_register_stream_Valid() const;

    OAIAnyType getDefaultAllPublicStreams() const;
    void setDefaultAllPublicStreams(const OAIAnyType &default_all_public_streams);
    bool is_default_all_public_streams_Set() const;
    bool is_default_all_public_streams_Valid() const;

    OAIAnyType getAvatarUrl() const;
    void setAvatarUrl(const OAIAnyType &avatar_url);
    bool is_avatar_url_Set() const;
    bool is_avatar_url_Valid() const;

    OAIAnyType getOwnerId() const;
    void setOwnerId(const OAIAnyType &owner_id);
    bool is_owner_id_Set() const;
    bool is_owner_id_Valid() const;

    OAIAnyType getServices() const;
    void setServices(const OAIAnyType &services);
    bool is_services_Set() const;
    bool is_services_Valid() const;

    QString getEmail() const;
    void setEmail(const QString &email);
    bool is_email_Set() const;
    bool is_email_Valid() const;

    qint32 getBotType() const;
    void setBotType(const qint32 &bot_type);
    bool is_bot_type_Set() const;
    bool is_bot_type_Valid() const;

    bool isIsActive() const;
    void setIsActive(const bool &is_active);
    bool is_is_active_Set() const;
    bool is_is_active_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIAnyType user_id;
    bool m_user_id_isSet;
    bool m_user_id_isValid;

    OAIAnyType full_name;
    bool m_full_name_isSet;
    bool m_full_name_isValid;

    OAIAnyType api_key;
    bool m_api_key_isSet;
    bool m_api_key_isValid;

    OAIAnyType default_sending_stream;
    bool m_default_sending_stream_isSet;
    bool m_default_sending_stream_isValid;

    OAIAnyType default_events_register_stream;
    bool m_default_events_register_stream_isSet;
    bool m_default_events_register_stream_isValid;

    OAIAnyType default_all_public_streams;
    bool m_default_all_public_streams_isSet;
    bool m_default_all_public_streams_isValid;

    OAIAnyType avatar_url;
    bool m_avatar_url_isSet;
    bool m_avatar_url_isValid;

    OAIAnyType owner_id;
    bool m_owner_id_isSet;
    bool m_owner_id_isValid;

    OAIAnyType services;
    bool m_services_isSet;
    bool m_services_isValid;

    QString email;
    bool m_email_isSet;
    bool m_email_isValid;

    qint32 bot_type;
    bool m_bot_type_isSet;
    bool m_bot_type_isValid;

    bool is_active;
    bool m_is_active_isSet;
    bool m_is_active_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIBot)

#endif // OAIBot_H
