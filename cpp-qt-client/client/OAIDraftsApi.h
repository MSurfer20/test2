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

#ifndef OAI_OAIDraftsApi_H
#define OAI_OAIDraftsApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"

#include "OAICodedError.h"
#include "OAIDraft.h"
#include "OAIJsonError.h"
#include "OAIJsonSuccess.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIDraftsApi : public QObject {
    Q_OBJECT

public:
    OAIDraftsApi(const int timeOut = 0);
    ~OAIDraftsApi();

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
    * @param[in]  drafts QList<OAIDraft> [optional]
    */
    void createDrafts(const ::OpenAPI::OptionalParam<QList<OAIDraft>> &drafts = ::OpenAPI::OptionalParam<QList<OAIDraft>>());

    /**
    * @param[in]  draft_id qint32 [required]
    */
    void deleteDraft(const qint32 &draft_id);

    /**
    * @param[in]  draft_id qint32 [required]
    * @param[in]  draft OAIDraft [required]
    */
    void editDraft(const qint32 &draft_id, const OAIDraft &draft);


    void getDrafts();


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

    void createDraftsCallback(OAIHttpRequestWorker *worker);
    void deleteDraftCallback(OAIHttpRequestWorker *worker);
    void editDraftCallback(OAIHttpRequestWorker *worker);
    void getDraftsCallback(OAIHttpRequestWorker *worker);

signals:

    void createDraftsSignal(OAIJsonSuccess summary);
    void deleteDraftSignal(OAIJsonSuccess summary);
    void editDraftSignal(OAIJsonSuccess summary);
    void getDraftsSignal(OAIJsonSuccess summary);

    void createDraftsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void deleteDraftSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void editDraftSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);
    void getDraftsSignalFull(OAIHttpRequestWorker *worker, OAIJsonSuccess summary);

    void createDraftsSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteDraftSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void editDraftSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getDraftsSignalE(OAIJsonSuccess summary, QNetworkReply::NetworkError error_type, QString error_str);

    void createDraftsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteDraftSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void editDraftSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getDraftsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();
};

} // namespace OpenAPI
#endif