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
 * OAIBasicStream.h
 *
 * 
 */

#ifndef OAIBasicStream_H
#define OAIBasicStream_H

#include <QJsonObject>

#include "OAIAnyType.h"
#include "OAIBasicStreamBase.h"
#include "OAIBasicStream_allOf.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIBasicStream : public OAIObject {
public:
    OAIBasicStream();
    OAIBasicStream(QString json);
    ~OAIBasicStream() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIAnyType getStreamId() const;
    void setStreamId(const OAIAnyType &stream_id);
    bool is_stream_id_Set() const;
    bool is_stream_id_Valid() const;

    OAIAnyType getName() const;
    void setName(const OAIAnyType &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAIAnyType getDescription() const;
    void setDescription(const OAIAnyType &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    OAIAnyType getDateCreated() const;
    void setDateCreated(const OAIAnyType &date_created);
    bool is_date_created_Set() const;
    bool is_date_created_Valid() const;

    OAIAnyType getInviteOnly() const;
    void setInviteOnly(const OAIAnyType &invite_only);
    bool is_invite_only_Set() const;
    bool is_invite_only_Valid() const;

    OAIAnyType getRenderedDescription() const;
    void setRenderedDescription(const OAIAnyType &rendered_description);
    bool is_rendered_description_Set() const;
    bool is_rendered_description_Valid() const;

    OAIAnyType getIsWebPublic() const;
    void setIsWebPublic(const OAIAnyType &is_web_public);
    bool is_is_web_public_Set() const;
    bool is_is_web_public_Valid() const;

    OAIAnyType getStreamPostPolicy() const;
    void setStreamPostPolicy(const OAIAnyType &stream_post_policy);
    bool is_stream_post_policy_Set() const;
    bool is_stream_post_policy_Valid() const;

    OAIAnyType getMessageRetentionDays() const;
    void setMessageRetentionDays(const OAIAnyType &message_retention_days);
    bool is_message_retention_days_Set() const;
    bool is_message_retention_days_Valid() const;

    OAIAnyType getHistoryPublicToSubscribers() const;
    void setHistoryPublicToSubscribers(const OAIAnyType &history_public_to_subscribers);
    bool is_history_public_to_subscribers_Set() const;
    bool is_history_public_to_subscribers_Valid() const;

    OAIAnyType getFirstMessageId() const;
    void setFirstMessageId(const OAIAnyType &first_message_id);
    bool is_first_message_id_Set() const;
    bool is_first_message_id_Valid() const;

    OAIAnyType getIsAnnouncementOnly() const;
    void setIsAnnouncementOnly(const OAIAnyType &is_announcement_only);
    bool is_is_announcement_only_Set() const;
    bool is_is_announcement_only_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIAnyType stream_id;
    bool m_stream_id_isSet;
    bool m_stream_id_isValid;

    OAIAnyType name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAIAnyType description;
    bool m_description_isSet;
    bool m_description_isValid;

    OAIAnyType date_created;
    bool m_date_created_isSet;
    bool m_date_created_isValid;

    OAIAnyType invite_only;
    bool m_invite_only_isSet;
    bool m_invite_only_isValid;

    OAIAnyType rendered_description;
    bool m_rendered_description_isSet;
    bool m_rendered_description_isValid;

    OAIAnyType is_web_public;
    bool m_is_web_public_isSet;
    bool m_is_web_public_isValid;

    OAIAnyType stream_post_policy;
    bool m_stream_post_policy_isSet;
    bool m_stream_post_policy_isValid;

    OAIAnyType message_retention_days;
    bool m_message_retention_days_isSet;
    bool m_message_retention_days_isValid;

    OAIAnyType history_public_to_subscribers;
    bool m_history_public_to_subscribers_isSet;
    bool m_history_public_to_subscribers_isValid;

    OAIAnyType first_message_id;
    bool m_first_message_id_isSet;
    bool m_first_message_id_isValid;

    OAIAnyType is_announcement_only;
    bool m_is_announcement_only_isSet;
    bool m_is_announcement_only_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIBasicStream)

#endif // OAIBasicStream_H