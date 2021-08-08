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

#ifndef OAI_OAIStreamsApiHandler_H
#define OAI_OAIStreamsApiHandler_H

#include <QObject>

#include "OAICodedError.h"
#include "OAIJsonError.h"
#include "OAIJsonSuccess.h"
#include "OAIJsonSuccessBase.h"
#include "OAINonExistingStreamError.h"
#include "OAIObject.h"
#include "OAIOneOfobjectobject.h"
#include "OAIOneOfstringinteger.h"
#include <QString>

namespace OpenAPI {

class OAIStreamsApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAIStreamsApiHandler();
    virtual ~OAIStreamsApiHandler();


public slots:
    virtual void archiveStream(qint32 stream_id);
    virtual void createBigBlueButtonVideoCall();
    virtual void deleteTopic(qint32 stream_id, QString topic_name);
    virtual void getStreamId(QString stream);
    virtual void getStreamTopics(qint32 stream_id);
    virtual void getStreams(bool include_public, bool include_web_public, bool include_subscribed, bool include_all_active, bool include_default, bool include_owner_subscribed);
    virtual void getSubscribers(qint32 stream_id);
    virtual void getSubscriptionStatus(qint32 user_id, qint32 stream_id);
    virtual void getSubscriptions(bool include_subscribers);
    virtual void muteTopic(QString topic, QString op, QString stream, qint32 stream_id);
    virtual void subscribe(QList<OAIObject> subscriptions, QList<OAIOneOfstringinteger> principals, bool authorization_errors_fatal, bool announce, bool invite_only, bool history_public_to_subscribers, qint32 stream_post_policy, OAIOneOfstringinteger message_retention_days);
    virtual void unsubscribe(QList<QString> subscriptions, QList<OAIOneOfstringinteger> principals);
    virtual void updateStream(qint32 stream_id, QString description, QString new_name, bool is_private, bool is_announcement_only, qint32 stream_post_policy, bool history_public_to_subscribers, OAIOneOfstringinteger message_retention_days);
    virtual void updateSubscriptionSettings(QList<OAIObject> subscription_data);
    virtual void updateSubscriptions(QList<QString> r_delete, QList<OAIObject> add);
    

};

}

#endif // OAI_OAIStreamsApiHandler_H
