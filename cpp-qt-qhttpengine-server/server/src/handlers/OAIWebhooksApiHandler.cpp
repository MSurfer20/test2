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

#include "OAIWebhooksApiHandler.h"
#include "OAIWebhooksApiRequest.h"

namespace OpenAPI {

OAIWebhooksApiHandler::OAIWebhooksApiHandler(){

}

OAIWebhooksApiHandler::~OAIWebhooksApiHandler(){

}

void OAIWebhooksApiHandler::zulipOutgoingWebhooks() {
    auto reqObj = qobject_cast<OAIWebhooksApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIInline_response_200 res;
        reqObj->zulipOutgoingWebhooksResponse(res);
    }    
}


}
