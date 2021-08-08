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

#include "OAIHelpers.h"
#include "OAIServerAndOrganizationsApiRequest.h"

namespace OpenAPI {

OAIServerAndOrganizationsApiRequest::OAIServerAndOrganizationsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIServerAndOrganizationsApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIServerAndOrganizationsApiRequest::~OAIServerAndOrganizationsApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIServerAndOrganizationsApiRequest::~OAIServerAndOrganizationsApiRequest()";
}

QMap<QString, QString>
OAIServerAndOrganizationsApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIServerAndOrganizationsApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIServerAndOrganizationsApiRequest::getRawSocket(){
    return socket;
}


void OAIServerAndOrganizationsApiRequest::addCodePlaygroundRequest(){
    qDebug() << "/api/v1/realm/playgrounds";
    connect(this, &OAIServerAndOrganizationsApiRequest::addCodePlayground, handler.data(), &OAIServerAndOrganizationsApiHandler::addCodePlayground);

    
    QString name;
    if(socket->queryString().keys().contains("name")){
        fromStringValue(socket->queryString().value("name"), name);
    }
    
    QString pygments_language;
    if(socket->queryString().keys().contains("pygments_language")){
        fromStringValue(socket->queryString().value("pygments_language"), pygments_language);
    }
    
    QString url_prefix;
    if(socket->queryString().keys().contains("url_prefix")){
        fromStringValue(socket->queryString().value("url_prefix"), url_prefix);
    }
    


    emit addCodePlayground(name, pygments_language, url_prefix);
}


void OAIServerAndOrganizationsApiRequest::addLinkifierRequest(){
    qDebug() << "/api/v1/realm/filters";
    connect(this, &OAIServerAndOrganizationsApiRequest::addLinkifier, handler.data(), &OAIServerAndOrganizationsApiHandler::addLinkifier);

    
    QString pattern;
    if(socket->queryString().keys().contains("pattern")){
        fromStringValue(socket->queryString().value("pattern"), pattern);
    }
    
    QString url_format_string;
    if(socket->queryString().keys().contains("url_format_string")){
        fromStringValue(socket->queryString().value("url_format_string"), url_format_string);
    }
    


    emit addLinkifier(pattern, url_format_string);
}


void OAIServerAndOrganizationsApiRequest::createCustomProfileFieldRequest(){
    qDebug() << "/api/v1/realm/profile_fields";
    connect(this, &OAIServerAndOrganizationsApiRequest::createCustomProfileField, handler.data(), &OAIServerAndOrganizationsApiHandler::createCustomProfileField);

    
    QString name;
    if(socket->queryString().keys().contains("name")){
        fromStringValue(socket->queryString().value("name"), name);
    }
    
    QString hint;
    if(socket->queryString().keys().contains("hint")){
        fromStringValue(socket->queryString().value("hint"), hint);
    }
    
    qint32 field_type;
    if(socket->queryString().keys().contains("field_type")){
        fromStringValue(socket->queryString().value("field_type"), field_type);
    }
    
    OAIObject field_data;
    if(socket->queryString().keys().contains("field_data")){
        fromStringValue(socket->queryString().value("field_data"), field_data);
    }
    


    emit createCustomProfileField(field_type, name, hint, field_data);
}


void OAIServerAndOrganizationsApiRequest::getCustomEmojiRequest(){
    qDebug() << "/api/v1/realm/emoji";
    connect(this, &OAIServerAndOrganizationsApiRequest::getCustomEmoji, handler.data(), &OAIServerAndOrganizationsApiHandler::getCustomEmoji);

    


    emit getCustomEmoji();
}


void OAIServerAndOrganizationsApiRequest::getCustomProfileFieldsRequest(){
    qDebug() << "/api/v1/realm/profile_fields";
    connect(this, &OAIServerAndOrganizationsApiRequest::getCustomProfileFields, handler.data(), &OAIServerAndOrganizationsApiHandler::getCustomProfileFields);

    


    emit getCustomProfileFields();
}


void OAIServerAndOrganizationsApiRequest::getLinkifiersRequest(){
    qDebug() << "/api/v1/realm/linkifiers";
    connect(this, &OAIServerAndOrganizationsApiRequest::getLinkifiers, handler.data(), &OAIServerAndOrganizationsApiHandler::getLinkifiers);

    


    emit getLinkifiers();
}


void OAIServerAndOrganizationsApiRequest::getServerSettingsRequest(){
    qDebug() << "/api/v1/server_settings";
    connect(this, &OAIServerAndOrganizationsApiRequest::getServerSettings, handler.data(), &OAIServerAndOrganizationsApiHandler::getServerSettings);

    


    emit getServerSettings();
}


void OAIServerAndOrganizationsApiRequest::removeCodePlaygroundRequest(const QString& playground_idstr){
    qDebug() << "/api/v1/realm/playgrounds/{playground_id}";
    connect(this, &OAIServerAndOrganizationsApiRequest::removeCodePlayground, handler.data(), &OAIServerAndOrganizationsApiHandler::removeCodePlayground);

    
    qint32 playground_id;
    fromStringValue(playground_idstr, playground_id);
    

    emit removeCodePlayground(playground_id);
}


void OAIServerAndOrganizationsApiRequest::removeLinkifierRequest(const QString& filter_idstr){
    qDebug() << "/api/v1/realm/filters/{filter_id}";
    connect(this, &OAIServerAndOrganizationsApiRequest::removeLinkifier, handler.data(), &OAIServerAndOrganizationsApiHandler::removeLinkifier);

    
    qint32 filter_id;
    fromStringValue(filter_idstr, filter_id);
    

    emit removeLinkifier(filter_id);
}


void OAIServerAndOrganizationsApiRequest::reorderCustomProfileFieldsRequest(){
    qDebug() << "/api/v1/realm/profile_fields";
    connect(this, &OAIServerAndOrganizationsApiRequest::reorderCustomProfileFields, handler.data(), &OAIServerAndOrganizationsApiHandler::reorderCustomProfileFields);

    
    QList<qint32> order;
    if(socket->queryString().keys().contains("order")){
        fromStringValue(socket->queryString().values("order"), order);
    }
    


    emit reorderCustomProfileFields(order);
}


void OAIServerAndOrganizationsApiRequest::updateLinkifierRequest(const QString& filter_idstr){
    qDebug() << "/api/v1/realm/filters/{filter_id}";
    connect(this, &OAIServerAndOrganizationsApiRequest::updateLinkifier, handler.data(), &OAIServerAndOrganizationsApiHandler::updateLinkifier);

    
    QString pattern;
    if(socket->queryString().keys().contains("pattern")){
        fromStringValue(socket->queryString().value("pattern"), pattern);
    }
    
    QString url_format_string;
    if(socket->queryString().keys().contains("url_format_string")){
        fromStringValue(socket->queryString().value("url_format_string"), url_format_string);
    }
    
    qint32 filter_id;
    fromStringValue(filter_idstr, filter_id);
    

    emit updateLinkifier(filter_id, pattern, url_format_string);
}


void OAIServerAndOrganizationsApiRequest::uploadCustomEmojiRequest(const QString& emoji_namestr){
    qDebug() << "/api/v1/realm/emoji/{emoji_name}";
    connect(this, &OAIServerAndOrganizationsApiRequest::uploadCustomEmoji, handler.data(), &OAIServerAndOrganizationsApiHandler::uploadCustomEmoji);

    
    QString emoji_name;
    fromStringValue(emoji_namestr, emoji_name);
    
    OAIHttpFileElement filename;

    emit uploadCustomEmoji(emoji_name, filename);
}



void OAIServerAndOrganizationsApiRequest::addCodePlaygroundResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::addLinkifierResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::createCustomProfileFieldResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getCustomEmojiResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getCustomProfileFieldsResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getLinkifiersResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getServerSettingsResponse(const OAIJsonSuccessBase& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::removeCodePlaygroundResponse(const OAIJsonSuccess& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::removeLinkifierResponse(const OAIJsonSuccess& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::reorderCustomProfileFieldsResponse(const OAIJsonSuccess& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::updateLinkifierResponse(const OAIJsonSuccess& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::uploadCustomEmojiResponse(const OAIJsonSuccess& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIServerAndOrganizationsApiRequest::addCodePlaygroundError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::addLinkifierError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::createCustomProfileFieldError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getCustomEmojiError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getCustomProfileFieldsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getLinkifiersError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::getServerSettingsError(const OAIJsonSuccessBase& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::removeCodePlaygroundError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::removeLinkifierError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::reorderCustomProfileFieldsError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::updateLinkifierError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIServerAndOrganizationsApiRequest::uploadCustomEmojiError(const OAIJsonSuccess& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIServerAndOrganizationsApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }    
}

void OAIServerAndOrganizationsApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}