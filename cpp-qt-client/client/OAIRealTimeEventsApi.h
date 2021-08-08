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

#ifndef OAI_OAIRealTimeEventsApi_H
#define OAI_OAIRealTimeEventsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"

#include "OAIBadEventQueueIdError.h"
#include "OAIJsonSuccess.h"
#include "OAIJsonSuccessBase.h"
#include "OAIObject.h"
#include "OAIOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.h"
#include "OAIOneOfRateLimitedError.h"
#include "OAIOneOfUserDeactivatedErrorRealmDeactivatedError.h"
#include <QList>
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIRealTimeEventsApi : public QObject {
    Q_OBJECT

public:
    OAIRealTimeEventsApi(const int timeOut = 0);
    ~OAIRealTimeEventsApi();

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
    * @param[in]  queue_id QString [required]
    */
    void deleteQueue(const QString &queue_id);

    /**
    * @param[in]  queue_id QString [required]
    * @param[in]  last_event_id qint32 [optional]
    * @param[in]  dont_block bool [optional]
    */
    void getEvents(const QString &queue_id, const ::OpenAPI::OptionalParam<qint32> &last_event_id = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<bool> &dont_block = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  event_types QList<QString> [optional]
    * @param[in]  narrow QList<QList<QString>> [optional]
    * @param[in]  all_public_streams bool [optional]
    */
    void realTimePost(const ::OpenAPI::OptionalParam<QList<QString>> &event_types = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<QList<QList<QString>>> &narrow = ::OpenAPI::OptionalParam<QList<QList<QString>>>(), const ::OpenAPI::OptionalParam<bool> &all_public_streams = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  apply_markdown bool [optional]
    * @param[in]  client_gravatar bool [optional]
    * @param[in]  slim_presence bool [optional]
    * @param[in]  event_types QList<QString> [optional]
    * @param[in]  all_public_streams bool [optional]
    * @param[in]  include_subscribers bool [optional]
    * @param[in]  client_capabilities OAIObject [optional]
    * @param[in]  fetch_event_types QList<QString> [optional]
    * @param[in]  narrow QList<QList<QString>> [optional]
    */
    void registerQueue(const ::OpenAPI::OptionalParam<bool> &apply_markdown = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &client_gravatar = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &slim_presence = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<QList<QString>> &event_types = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<bool> &all_public_streams = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_subscribers = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<OAIObject> &client_capabilities = ::OpenAPI::OptionalParam<OAIObject>(), const ::OpenAPI::OptionalParam<QList<QString>> &fetch_event_types = ::OpenAPI::OptionalParam<QList<QString>>(), const ::OpenAPI::OptionalParam<QList<QList<QString>>> &narrow = ::OpenAPI::OptionalParam<QList<QList<QString>>>());


    void restErrorHandling();


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

    void deleteQueueCallback(OAIHttpRequestWorker *worker);
    void getEventsCallback(OAIHttpRequestWorker *worker);
    void realTimePostCallback(OAIHttpRequestWorker *worker);
    void registerQueueCallback(OAIHttpRequestWorker *worker);
    void restErrorHandlingCallback(OAIHttpRequestWorker *worker);

signals:

    void deleteQueueSignal(OAIJsonSuccess summary);
    void getEventsSignal(OAIJsonSuccessBase summary);
    void realTimePostSignal();
    void registerQueueSignal(OAIJsonSuccessBase summary);
    void restErrorHandlingSignal();

    void deleteQueueSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void getEventsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void realTimePostSignalFull(OAIHttpRequestWorker *worker);
    void registerQueueSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccessBase summary);
    void restErrorHandlingSignalFull(OAIHttpRequestWorker *worker);

    void deleteQueueSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getEventsSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void realTimePostSignalE(QNetworkReply::NetworkError error_type, QString error_str);
    void registerQueueSignalE(OAIJsonSuccessBase summary, QNetworkReply::NetworkError error_type, QString error_str);
    void restErrorHandlingSignalE(QNetworkReply::NetworkError error_type, QString error_str);

    void deleteQueueSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getEventsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void realTimePostSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void registerQueueSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void restErrorHandlingSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();
};

} // namespace OpenAPI
#endif
