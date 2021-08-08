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

#ifndef OAI_OAIStreamsApiRequest_H
#define OAI_OAIStreamsApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAICodedError.h"
#include "OAIJsonError.h"
#include "OAIJsonSuccess.h"
#include "OAIJsonSuccessBase.h"
#include "OAINonExistingStreamError.h"
#include "OAIObject.h"
#include "OAIOneOfobjectobject.h"
#include "OAIOneOfstringinteger.h"
#include <QString>
#include "OAIStreamsApiHandler.h"

namespace OpenAPI {

class OAIStreamsApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIStreamsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIStreamsApiHandler> handler);
    virtual ~OAIStreamsApiRequest();

    void archiveStreamRequest(const QString& stream_id);
    void createBigBlueButtonVideoCallRequest();
    void getStreamIdRequest();
    void getStreamTopicsRequest(const QString& stream_id);
    void getStreamsRequest();
    void getSubscriptionStatusRequest(const QString& user_id, const QString& stream_id);
    void getSubscriptionsRequest();
    void muteTopicRequest();
    void subscribeRequest();
    void unsubscribeRequest();
    void updateStreamRequest(const QString& stream_id);
    void updateSubscriptionSettingsRequest();
    void updateSubscriptionsRequest();
    

    void archiveStreamResponse(const OAIJsonSuccess& res);
    void createBigBlueButtonVideoCallResponse(const OAIJsonSuccessBase& res);
    void getStreamIdResponse(const OAIJsonSuccessBase& res);
    void getStreamTopicsResponse(const OAIJsonSuccessBase& res);
    void getStreamsResponse(const OAIJsonSuccessBase& res);
    void getSubscriptionStatusResponse(const OAIJsonSuccessBase& res);
    void getSubscriptionsResponse(const OAIJsonSuccessBase& res);
    void muteTopicResponse(const OAIJsonSuccess& res);
    void subscribeResponse(const OAIOneOfobjectobject& res);
    void unsubscribeResponse(const OAIJsonSuccessBase& res);
    void updateStreamResponse(const OAIJsonSuccess& res);
    void updateSubscriptionSettingsResponse(const OAIJsonSuccessBase& res);
    void updateSubscriptionsResponse(const OAIJsonSuccessBase& res);
    

    void archiveStreamError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void createBigBlueButtonVideoCallError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getStreamIdError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getStreamTopicsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getStreamsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getSubscriptionStatusError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getSubscriptionsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void muteTopicError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void subscribeError(const OAIOneOfobjectobject& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void unsubscribeError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateStreamError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateSubscriptionSettingsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateSubscriptionsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void archiveStream(qint32 stream_id);
    void createBigBlueButtonVideoCall();
    void getStreamId(QString stream);
    void getStreamTopics(qint32 stream_id);
    void getStreams(bool include_public, bool include_web_public, bool include_subscribed, bool include_all_active, bool include_default, bool include_owner_subscribed);
    void getSubscriptionStatus(qint32 user_id, qint32 stream_id);
    void getSubscriptions(bool include_subscribers);
    void muteTopic(QString topic, QString op, QString stream, qint32 stream_id);
    void subscribe(QList<OAIObject> subscriptions, QList<OAIOneOfstringinteger> principals, bool authorization_errors_fatal, bool announce, bool invite_only, bool history_public_to_subscribers, qint32 stream_post_policy, OAIOneOfstringinteger message_retention_days);
    void unsubscribe(QList<QString> subscriptions, QList<OAIOneOfstringinteger> principals);
    void updateStream(qint32 stream_id, QString description, QString new_name, bool is_private, bool is_announcement_only, qint32 stream_post_policy, bool history_public_to_subscribers, OAIOneOfstringinteger message_retention_days);
    void updateSubscriptionSettings(QList<OAIObject> subscription_data);
    void updateSubscriptions(QList<QString> r_delete, QList<OAIObject> add);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIStreamsApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIStreamsApiRequest_H
