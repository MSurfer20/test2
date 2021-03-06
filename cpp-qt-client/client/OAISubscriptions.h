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
 * OAISubscriptions.h
 *
 * 
 */

#ifndef OAISubscriptions_H
#define OAISubscriptions_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISubscriptions : public OAIObject {
public:
    OAISubscriptions();
    OAISubscriptions(QString json);
    ~OAISubscriptions() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getStreamId() const;
    void setStreamId(const qint32 &stream_id);
    bool is_stream_id_Set() const;
    bool is_stream_id_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    QString getRenderedDescription() const;
    void setRenderedDescription(const QString &rendered_description);
    bool is_rendered_description_Set() const;
    bool is_rendered_description_Valid() const;

    qint32 getDateCreated() const;
    void setDateCreated(const qint32 &date_created);
    bool is_date_created_Set() const;
    bool is_date_created_Valid() const;

    bool isInviteOnly() const;
    void setInviteOnly(const bool &invite_only);
    bool is_invite_only_Set() const;
    bool is_invite_only_Valid() const;

    QList<qint32> getSubscribers() const;
    void setSubscribers(const QList<qint32> &subscribers);
    bool is_subscribers_Set() const;
    bool is_subscribers_Valid() const;

    bool isDesktopNotifications() const;
    void setDesktopNotifications(const bool &desktop_notifications);
    bool is_desktop_notifications_Set() const;
    bool is_desktop_notifications_Valid() const;

    bool isEmailNotifications() const;
    void setEmailNotifications(const bool &email_notifications);
    bool is_email_notifications_Set() const;
    bool is_email_notifications_Valid() const;

    bool isWildcardMentionsNotify() const;
    void setWildcardMentionsNotify(const bool &wildcard_mentions_notify);
    bool is_wildcard_mentions_notify_Set() const;
    bool is_wildcard_mentions_notify_Valid() const;

    bool isPushNotifications() const;
    void setPushNotifications(const bool &push_notifications);
    bool is_push_notifications_Set() const;
    bool is_push_notifications_Valid() const;

    bool isAudibleNotifications() const;
    void setAudibleNotifications(const bool &audible_notifications);
    bool is_audible_notifications_Set() const;
    bool is_audible_notifications_Valid() const;

    bool isPinToTop() const;
    void setPinToTop(const bool &pin_to_top);
    bool is_pin_to_top_Set() const;
    bool is_pin_to_top_Valid() const;

    QString getEmailAddress() const;
    void setEmailAddress(const QString &email_address);
    bool is_email_address_Set() const;
    bool is_email_address_Valid() const;

    bool isIsMuted() const;
    void setIsMuted(const bool &is_muted);
    bool is_is_muted_Set() const;
    bool is_is_muted_Valid() const;

    Q_DECL_DEPRECATED bool isInHomeView() const;
    Q_DECL_DEPRECATED void setInHomeView(const bool &in_home_view);
    Q_DECL_DEPRECATED bool is_in_home_view_Set() const;
    Q_DECL_DEPRECATED bool is_in_home_view_Valid() const;

    Q_DECL_DEPRECATED bool isIsAnnouncementOnly() const;
    Q_DECL_DEPRECATED void setIsAnnouncementOnly(const bool &is_announcement_only);
    Q_DECL_DEPRECATED bool is_is_announcement_only_Set() const;
    Q_DECL_DEPRECATED bool is_is_announcement_only_Valid() const;

    bool isIsWebPublic() const;
    void setIsWebPublic(const bool &is_web_public);
    bool is_is_web_public_Set() const;
    bool is_is_web_public_Valid() const;

    qint32 getRole() const;
    void setRole(const qint32 &role);
    bool is_role_Set() const;
    bool is_role_Valid() const;

    QString getColor() const;
    void setColor(const QString &color);
    bool is_color_Set() const;
    bool is_color_Valid() const;

    qint32 getStreamPostPolicy() const;
    void setStreamPostPolicy(const qint32 &stream_post_policy);
    bool is_stream_post_policy_Set() const;
    bool is_stream_post_policy_Valid() const;

    qint32 getMessageRetentionDays() const;
    void setMessageRetentionDays(const qint32 &message_retention_days);
    bool is_message_retention_days_Set() const;
    bool is_message_retention_days_Valid() const;

    bool isHistoryPublicToSubscribers() const;
    void setHistoryPublicToSubscribers(const bool &history_public_to_subscribers);
    bool is_history_public_to_subscribers_Set() const;
    bool is_history_public_to_subscribers_Valid() const;

    qint32 getFirstMessageId() const;
    void setFirstMessageId(const qint32 &first_message_id);
    bool is_first_message_id_Set() const;
    bool is_first_message_id_Valid() const;

    qint32 getStreamWeeklyTraffic() const;
    void setStreamWeeklyTraffic(const qint32 &stream_weekly_traffic);
    bool is_stream_weekly_traffic_Set() const;
    bool is_stream_weekly_traffic_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 stream_id;
    bool m_stream_id_isSet;
    bool m_stream_id_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    QString rendered_description;
    bool m_rendered_description_isSet;
    bool m_rendered_description_isValid;

    qint32 date_created;
    bool m_date_created_isSet;
    bool m_date_created_isValid;

    bool invite_only;
    bool m_invite_only_isSet;
    bool m_invite_only_isValid;

    QList<qint32> subscribers;
    bool m_subscribers_isSet;
    bool m_subscribers_isValid;

    bool desktop_notifications;
    bool m_desktop_notifications_isSet;
    bool m_desktop_notifications_isValid;

    bool email_notifications;
    bool m_email_notifications_isSet;
    bool m_email_notifications_isValid;

    bool wildcard_mentions_notify;
    bool m_wildcard_mentions_notify_isSet;
    bool m_wildcard_mentions_notify_isValid;

    bool push_notifications;
    bool m_push_notifications_isSet;
    bool m_push_notifications_isValid;

    bool audible_notifications;
    bool m_audible_notifications_isSet;
    bool m_audible_notifications_isValid;

    bool pin_to_top;
    bool m_pin_to_top_isSet;
    bool m_pin_to_top_isValid;

    QString email_address;
    bool m_email_address_isSet;
    bool m_email_address_isValid;

    bool is_muted;
    bool m_is_muted_isSet;
    bool m_is_muted_isValid;

    bool in_home_view;
    bool m_in_home_view_isSet;
    bool m_in_home_view_isValid;

    bool is_announcement_only;
    bool m_is_announcement_only_isSet;
    bool m_is_announcement_only_isValid;

    bool is_web_public;
    bool m_is_web_public_isSet;
    bool m_is_web_public_isValid;

    qint32 role;
    bool m_role_isSet;
    bool m_role_isValid;

    QString color;
    bool m_color_isSet;
    bool m_color_isValid;

    qint32 stream_post_policy;
    bool m_stream_post_policy_isSet;
    bool m_stream_post_policy_isValid;

    qint32 message_retention_days;
    bool m_message_retention_days_isSet;
    bool m_message_retention_days_isValid;

    bool history_public_to_subscribers;
    bool m_history_public_to_subscribers_isSet;
    bool m_history_public_to_subscribers_isValid;

    qint32 first_message_id;
    bool m_first_message_id_isSet;
    bool m_first_message_id_isValid;

    qint32 stream_weekly_traffic;
    bool m_stream_weekly_traffic_isSet;
    bool m_stream_weekly_traffic_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISubscriptions)

#endif // OAISubscriptions_H
