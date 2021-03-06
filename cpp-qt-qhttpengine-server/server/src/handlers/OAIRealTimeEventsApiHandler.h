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

#ifndef OAI_OAIRealTimeEventsApiHandler_H
#define OAI_OAIRealTimeEventsApiHandler_H

#include <QObject>

#include "OAIBadEventQueueIdError.h"
#include "OAIJsonSuccess.h"
#include "OAIJsonSuccessBase.h"
#include "OAIObject.h"
#include "OAIOneOfInvalidApiKeyErrorMissingArgumentErrorUserNotAuthorizedError.h"
#include "OAIOneOfRateLimitedError.h"
#include "OAIOneOfUserDeactivatedErrorRealmDeactivatedError.h"
#include <QList>
#include <QString>

namespace OpenAPI {

class OAIRealTimeEventsApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAIRealTimeEventsApiHandler();
    virtual ~OAIRealTimeEventsApiHandler();


public slots:
    virtual void deleteQueue(QString queue_id);
    virtual void getEvents(QString queue_id, qint32 last_event_id, bool dont_block);
    virtual void realTimePost(QList<QString> event_types, QList<QList<QString>> narrow, bool all_public_streams);
    virtual void registerQueue(bool apply_markdown, bool client_gravatar, bool slim_presence, QList<QString> event_types, bool all_public_streams, bool include_subscribers, OAIObject client_capabilities, QList<QString> fetch_event_types, QList<QList<QString>> narrow);
    virtual void restErrorHandling();
    

};

}

#endif // OAI_OAIRealTimeEventsApiHandler_H
