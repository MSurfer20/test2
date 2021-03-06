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

#ifndef OAI_OAIStreamsApi_H
#define OAI_OAIStreamsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"

#include "OAICodedError.h"
#include "OAIJsonError.h"
#include "OAIJsonSuccess.h"
#include "OAIJsonSuccessBase.h"
#include "OAINonExistingStreamError.h"
#include "OAIObject.h"
#include "OAIOneOfobjectobject.h"
#include "OAIOneOfstringinteger.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIStreamsApi : public QObject {
    Q_OBJECT

public:
    OAIStreamsApi(const int timeOut = 0);
    ~OAIStreamsApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(QString style);
    QString getParamStyleSuffix(QString style);
    QString getParamStyleDelimiter(QString style, QString name, bool isExplode);

    /**
    * @param[in]  stream_id qint32 [required]
    */
    void archiveStream(const qint32 &stream_id);


    void createBigBlueButtonVideoCall();

    /**
    * @param[in]  stream_id qint32 [required]
    * @param[in]  topic_name QString [required]
    */
    void deleteTopic(const qint32 &stream_id, const QString &topic_name);

    /**
    * @param[in]  stream QString [required]
    */
    void getStreamId(const QString &stream);

    /**
    * @param[in]  stream_id qint32 [required]
    */
    void getStreamTopics(const qint32 &stream_id);

    /**
    * @param[in]  include_public bool [optional]
    * @param[in]  include_web_public bool [optional]
    * @param[in]  include_subscribed bool [optional]
    * @param[in]  include_all_active bool [optional]
    * @param[in]  include_default bool [optional]
    * @param[in]  include_owner_subscribed bool [optional]
    */
    void getStreams(const ::OpenAPI::OptionalParam<bool> &include_public = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_web_public = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_subscribed = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_all_active = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_default = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_owner_subscribed = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  stream_id qint32 [required]
    */
    void getSubscribers(const qint32 &stream_id);

    /**
    * @param[in]  user_id qint32 [required]
    * @param[in]  stream_id qint32 [required]
    */
    void getSubscriptionStatus(const qint32 &user_id, const qint32 &stream_id);

    /**
    * @param[in]  include_subscribers bool [optional]
    */
    void getSubscriptions(const ::OpenAPI::OptionalParam<bool> &include_subscribers = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  topic QString [required]
    * @param[in]  op QString [required]
    * @param[in]  stream QString [optional]
    * @param[in]  stream_id qint32 [optional]
    */
    void muteTopic(const QString &topic, const QString &op, const ::OpenAPI::OptionalParam<QString> &stream = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &stream_id = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  subscriptions QList<OAIObject> [required]
    * @param[in]  principals QList<OAIOneOfstringinteger> [optional]
    * @param[in]  authorization_errors_fatal bool [optional]
    * @param[in]  announce bool [optional]
    * @param[in]  invite_only bool [optional]
    * @param[in]  history_public_to_subscribers bool [optional]
    * @param[in]  stream_post_policy qint32 [optional]
    * @param[in]  message_retention_days OAIOneOfstringinteger [optional]
    */
    void subscribe(const QList<OAIObject> &subscriptions, const ::OpenAPI::OptionalParam<QList<OAIOneOfstringinteger>> &principals = ::OpenAPI::OptionalParam<QList<OAIOneOfstringinteger>>(), const ::OpenAPI::OptionalParam<bool> &authorization_errors_fatal = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &announce = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &invite_only = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &history_public_to_subscribers = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<qint32> &stream_post_policy = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<OAIOneOfstringinteger> &message_retention_days = ::OpenAPI::OptionalParam<OAIOneOfstringinteger>());

    /**
    * @param[in]  subscriptions QList<QString> [required]
    * @param[in]  principals QList<OAIOneOfstringinteger> [optional]
    */
    void unsubscribe(const QList<QString> &subscriptions, const ::OpenAPI::OptionalParam<QList<OAIOneOfstringinteger>> &principals = ::OpenAPI::OptionalParam<QList<OAIOneOfstringinteger>>());

    /**
    * @param[in]  stream_id qint32 [required]
    * @param[in]  description QString [optional]
    * @param[in]  new_name QString [optional]
    * @param[in]  is_private bool [optional]
    * @param[in]  is_announcement_only bool [optional]
    * @param[in]  stream_post_policy qint32 [optional]
    * @param[in]  history_public_to_subscribers bool [optional]
    * @param[in]  message_retention_days OAIOneOfstringinteger [optional]
    */
    void updateStream(const qint32 &stream_id, const ::OpenAPI::OptionalParam<QString> &description = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &new_name = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<bool> &is_private = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &is_announcement_only = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<qint32> &stream_post_policy = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<bool> &history_public_to_subscribers = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<OAIOneOfstringinteger> &message_retention_days = ::OpenAPI::OptionalParam<OAIOneOfstringinteger>());

    /**
    * @param[in]  subscription_data QList<OAIObject> [required]
    */
    void updateSubscriptionSettings(const QList<OAIObject> &subscription_data);

    /**
    * @param[in]  r_delete QList<QString> [optional]
    * @param[in]  add QList<OAIObject> [optional]
    */
    void updateSubscriptions(const ::OpenAPI::OptionalParam<QList<QString>> &r_delete = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<QList<OAIObject>> &add = ::OpenAPI::OptionalParam<QList<OAIObject>>());


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> defaultHeaders;
    bool isResponseCompressionEnabled;
    bool isRequestCompressionEnabled;

    void archiveStreamCallback(OAIHttpRequestWorker *worker);
    void createBigBlueButtonVideoCallCallback(OAIHttpRequestWorker *worker);
    void deleteTopicCallback(OAIHttpRequestWorker *worker);
    void getStreamIdCallback(OAIHttpRequestWorker *worker);
    void getStreamTopicsCallback(OAIHttpRequestWorker *worker);
    void getStreamsCallback(OAIHttpRequestWorker *worker);
    void getSubscribersCallback(OAIHttpRequestWorker *worker);
    void getSubscriptionStatusCallback(OAIHttpRequestWorker *worker);
    void getSubscriptionsCallback(OAIHttpRequestWorker *worker);
    void muteTopicCallback(OAIHttpRequestWorker *worker);
    void subscribeCallback(OAIHttpRequestWorker *worker);
    void unsubscribeCallback(OAIHttpRequestWorker *worker);
    void updateStreamCallback(OAIHttpRequestWorker *worker);
    void updateSubscriptionSettingsCallback(OAIHttpRequestWorker *worker);
    void updateSubscriptionsCallback(OAIHttpRequestWorker *worker);

signals:

    void archiveStreamSignal(OAIJsonSuccess summary);
    void createBigBlueButtonVideoCallSignal(OAIJsonSuccessBase summary);
    void deleteTopicSignal(OAIJsonSuccess summary);
    void getStreamIdSignal(OAIJsonSuccessBase summary);
    void getStreamTopicsSignal(OAIJsonSuccessBase summary);
    void getStreamsSignal(OAIJsonSuccessBase summary);
    void getSubscribersSignal(OAIJsonSuccessBase summary);
    void getSubscriptionStatusSignal(OAIJsonSuccessBase summary);
    void getSubscriptionsSignal(OAIJsonSuccessBase summary);
    void muteTopicSignal(OAIJsonSuccess summary);
    void subscribeSignal(OAIOneOfobjectobject summary);
    void unsubscribeSignal(OAIJsonSuccessBase summary);
    void updateStreamSignal(OAIJsonSuccess summary);
    void updateSubscriptionSettingsSignal(OAIJsonSuccessBase summary);
    void updateSubscriptionsSignal(OAIJsonSuccessBase summary);

    void archiveStreamSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void createBigBlueButtonVideoCallSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void deleteTopicSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void getStreamIdSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void getStreamTopicsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void getStreamsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void getSubscribersSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void getSubscriptionStatusSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void getSubscriptionsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void muteTopicSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void subscribeSignalFull(OAIHttpRequestWorker *worker, OAIOneOfobjectobject summary);
    void unsubscribeSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void updateStreamSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void updateSubscriptionSettingsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void updateSubscriptionsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);

    void archiveStreamSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createBigBlueButtonVideoCallSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteTopicSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getStreamIdSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getStreamTopicsSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getStreamsSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getSubscribersSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getSubscriptionStatusSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getSubscriptionsSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void muteTopicSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void subscribeSignalE(OAIOneOfobjectobject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void unsubscribeSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void updateStreamSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void updateSubscriptionSettingsSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void updateSubscriptionsSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);

    void archiveStreamSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createBigBlueButtonVideoCallSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteTopicSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getStreamIdSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getStreamTopicsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getStreamsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getSubscribersSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getSubscriptionStatusSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getSubscriptionsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void muteTopicSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void subscribeSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void unsubscribeSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void updateStreamSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void updateSubscriptionSettingsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void updateSubscriptionsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();
};

} // namespace OpenAPI
#endif
