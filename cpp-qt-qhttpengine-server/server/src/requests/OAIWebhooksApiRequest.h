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

#ifndef OAI_OAIWebhooksApiRequest_H
#define OAI_OAIWebhooksApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIInline_response_200.h"
#include <QString>
#include "OAIWebhooksApiHandler.h"

namespace OpenAPI {

class OAIWebhooksApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIWebhooksApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIWebhooksApiHandler> handler);
    virtual ~OAIWebhooksApiRequest();

    void zulipOutgoingWebhooksRequest();
    

    void zulipOutgoingWebhooksResponse(const OAIInline_response_200& res);
    

    void zulipOutgoingWebhooksError(const OAIInline_response_200& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void zulipOutgoingWebhooks();
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIWebhooksApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIWebhooksApiRequest_H
