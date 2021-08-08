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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIDraftsApiHandler.h"
#include "OAIDraftsApiRequest.h"

namespace OpenAPI {

OAIDraftsApiHandler::OAIDraftsApiHandler(){

}

OAIDraftsApiHandler::~OAIDraftsApiHandler(){

}

void OAIDraftsApiHandler::createDrafts(QList<OAIDraft> drafts) {
    Q_UNUSED(drafts);
    auto reqObj = qobject_cast<OAIDraftsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->createDraftsResponse(res);
    }    
}
void OAIDraftsApiHandler::deleteDraft(qint32 draft_id) {
    Q_UNUSED(draft_id);
    auto reqObj = qobject_cast<OAIDraftsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->deleteDraftResponse(res);
    }    
}
void OAIDraftsApiHandler::editDraft(qint32 draft_id, OAIDraft draft) {
    Q_UNUSED(draft_id);
    Q_UNUSED(draft);
    auto reqObj = qobject_cast<OAIDraftsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->editDraftResponse(res);
    }    
}
void OAIDraftsApiHandler::getDrafts() {
    auto reqObj = qobject_cast<OAIDraftsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->getDraftsResponse(res);
    }    
}


}
