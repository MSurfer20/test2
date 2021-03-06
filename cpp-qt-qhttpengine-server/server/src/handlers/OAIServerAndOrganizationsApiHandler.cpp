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

#include "OAIServerAndOrganizationsApiHandler.h"
#include "OAIServerAndOrganizationsApiRequest.h"

namespace OpenAPI {

OAIServerAndOrganizationsApiHandler::OAIServerAndOrganizationsApiHandler(){

}

OAIServerAndOrganizationsApiHandler::~OAIServerAndOrganizationsApiHandler(){

}

void OAIServerAndOrganizationsApiHandler::addCodePlayground(QString name, QString pygments_language, QString url_prefix) {
    Q_UNUSED(name);
    Q_UNUSED(pygments_language);
    Q_UNUSED(url_prefix);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->addCodePlaygroundResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::addLinkifier(QString pattern, QString url_format_string) {
    Q_UNUSED(pattern);
    Q_UNUSED(url_format_string);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->addLinkifierResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::createCustomProfileField(qint32 field_type, QString name, QString hint, OAIObject field_data) {
    Q_UNUSED(field_type);
    Q_UNUSED(name);
    Q_UNUSED(hint);
    Q_UNUSED(field_data);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->createCustomProfileFieldResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::getCustomEmoji() {
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->getCustomEmojiResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::getCustomProfileFields() {
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->getCustomProfileFieldsResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::getLinkifiers() {
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->getLinkifiersResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::getServerSettings() {
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccessBase res;
        reqObj->getServerSettingsResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::removeCodePlayground(qint32 playground_id) {
    Q_UNUSED(playground_id);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->removeCodePlaygroundResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::removeLinkifier(qint32 filter_id) {
    Q_UNUSED(filter_id);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->removeLinkifierResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::reorderCustomProfileFields(QList<qint32> order) {
    Q_UNUSED(order);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->reorderCustomProfileFieldsResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::updateLinkifier(qint32 filter_id, QString pattern, QString url_format_string) {
    Q_UNUSED(filter_id);
    Q_UNUSED(pattern);
    Q_UNUSED(url_format_string);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->updateLinkifierResponse(res);
    }    
}
void OAIServerAndOrganizationsApiHandler::uploadCustomEmoji(QString emoji_name, OAIHttpFileElement filename) {
    Q_UNUSED(emoji_name);
    Q_UNUSED(filename);
    auto reqObj = qobject_cast<OAIServerAndOrganizationsApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIJsonSuccess res;
        reqObj->uploadCustomEmojiResponse(res);
    }    
}


}
