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

#ifndef OAI_OAIAuthenticationApiHandler_H
#define OAI_OAIAuthenticationApiHandler_H

#include <QObject>

#include "OAIApiKeyResponse.h"
#include <QString>

namespace OpenAPI {

class OAIAuthenticationApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAIAuthenticationApiHandler();
    virtual ~OAIAuthenticationApiHandler();


public slots:
    virtual void devFetchApiKey(QString username);
    virtual void fetchApiKey(QString username, QString password);
    

};

}

#endif // OAI_OAIAuthenticationApiHandler_H
