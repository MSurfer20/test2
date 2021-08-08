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

#include "OAIAuthenticationApi.h"
#include "OAIServerConfiguration.h"
#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIAuthenticationApi::OAIAuthenticationApi(const int timeOut)
    : _timeOut(timeOut),
      _manager(nullptr),
      isResponseCompressionEnabled(false),
      isRequestCompressionEnabled(false) {
    initializeServerConfigs();
}

OAIAuthenticationApi::~OAIAuthenticationApi() {
}

void OAIAuthenticationApi::initializeServerConfigs(){
    //Default server
    QList<OAIServerConfiguration> defaultConf = QList<OAIServerConfiguration>();
    //varying endpoint server
    QList<OAIServerConfiguration> serverConf = QList<OAIServerConfiguration>();
    defaultConf.append(OAIServerConfiguration(
    QUrl("https://{subdomain}.zulipchat.com/api/v1"),
    "No description provided",
    QMap<QString, OAIServerVariable>{ 
    {"subdomain", OAIServerVariable("No description provided","example",
    QSet<QString>{ {"example"} })}, }));
    
    defaultConf.append(OAIServerConfiguration(
    QUrl("{server}/api/v1"),
    "No description provided",
    QMap<QString, OAIServerVariable>{ 
    {"server", OAIServerVariable("No description provided","https://",
    QSet<QString>{ {"https://"} })}, }));
    
    defaultConf.append(OAIServerConfiguration(
    QUrl("https://chat.zulip.org/api/v1"),
    "No description provided",
    QMap<QString, OAIServerVariable>()));
    defaultConf.append(OAIServerConfiguration(
    QUrl("http://localhost:9991/api/v1"),
    "No description provided",
    QMap<QString, OAIServerVariable>()));
    _serverConfigs.insert("devFetchApiKey", defaultConf);
    _serverIndices.insert("devFetchApiKey", 0);
    _serverConfigs.insert("fetchApiKey", defaultConf);
    _serverIndices.insert("fetchApiKey", 0);
}

/**
* returns 0 on success and -1, -2 or -3 on failure.
* -1 when the variable does not exist and -2 if the value is not defined in the enum and -3 if the operation or server index is not found
*/
int OAIAuthenticationApi::setDefaultServerValue(int serverIndex, const QString &operation, const QString &variable, const QString &value){
    auto it = _serverConfigs.find(operation);
    if(it != _serverConfigs.end() && serverIndex < it.value().size() ){
      return _serverConfigs[operation][serverIndex].setDefaultValue(variable,value);
    }
    return -3;
}
void OAIAuthenticationApi::setServerIndex(const QString &operation, int serverIndex){
    if(_serverIndices.contains(operation) && serverIndex < _serverConfigs.find(operation).value().size() )
        _serverIndices[operation] = serverIndex;
}

void OAIAuthenticationApi::setApiKey(const QString &apiKeyName, const QString &apiKey){
    _apiKeys.insert(apiKeyName,apiKey);
}

void OAIAuthenticationApi::setBearerToken(const QString &token){
    _bearerToken = token;
}

void OAIAuthenticationApi::setUsername(const QString &username) {
    _username = username;
}

void OAIAuthenticationApi::setPassword(const QString &password) {
    _password = password;
}


void OAIAuthenticationApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void OAIAuthenticationApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void OAIAuthenticationApi::setNetworkAccessManager(QNetworkAccessManager* manager) {
    _manager = manager;
}

/**
    * Appends a new ServerConfiguration to the config map for a specific operation.
    * @param operation The id to the target operation.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    * returns the index of the new server config on success and -1 if the operation is not found
    */
int OAIAuthenticationApi::addServerConfiguration(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, OAIServerVariable> &variables){
    if(_serverConfigs.contains(operation)){
        _serverConfigs[operation].append(OAIServerConfiguration(
                    url,
                    description,
                    variables));
        return _serverConfigs[operation].size()-1;
    }else{
        return -1;
    }
}

/**
    * Appends a new ServerConfiguration to the config map for a all operations and sets the index to that server.
    * @param url A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void OAIAuthenticationApi::setNewServerForAllOperations(const QUrl &url, const QString &description, const QMap<QString, OAIServerVariable> &variables){
    for(auto e : _serverIndices.keys()){
        setServerIndex(e, addServerConfiguration(e, url, description, variables));
    }
}

/**
    * Appends a new ServerConfiguration to the config map for an operations and sets the index to that server.
    * @param URL A string that contains the URL of the server
    * @param description A String that describes the server
    * @param variables A map between a variable name and its value. The value is used for substitution in the server's URL template.
    */
void OAIAuthenticationApi::setNewServer(const QString &operation, const QUrl &url, const QString &description, const QMap<QString, OAIServerVariable> &variables){
    setServerIndex(operation, addServerConfiguration(operation, url, description, variables));
}

void OAIAuthenticationApi::addHeaders(const QString &key, const QString &value) {
    defaultHeaders.insert(key, value);
}

void OAIAuthenticationApi::enableRequestCompression() {
    isRequestCompressionEnabled = true;
}

void OAIAuthenticationApi::enableResponseCompression() {
    isResponseCompressionEnabled = true;
}

void OAIAuthenticationApi::abortRequests(){
    emit abortRequestsSignal();
}

QString OAIAuthenticationApi::getParamStylePrefix(QString style){
    if(style == "matrix"){
        return ";";
    }else if(style == "label"){
        return ".";
    }else if(style == "form"){
        return "&";
    }else if(style == "simple"){
        return "";
    }else if(style == "spaceDelimited"){
        return "&";
    }else if(style == "pipeDelimited"){
        return "&";
    }else{
        return "none";
    }
}

QString OAIAuthenticationApi::getParamStyleSuffix(QString style){
    if(style == "matrix"){
        return "=";
    }else if(style == "label"){
        return "";
    }else if(style == "form"){
        return "=";
    }else if(style == "simple"){
        return "";
    }else if(style == "spaceDelimited"){
        return "=";
    }else if(style == "pipeDelimited"){
        return "=";
    }else{
        return "none";
    }
}

QString OAIAuthenticationApi::getParamStyleDelimiter(QString style, QString name, bool isExplode){

    if(style == "matrix"){
        return (isExplode) ? ";" + name + "=" : ",";

    }else if(style == "label"){
        return (isExplode) ? "." : ",";

    }else if(style == "form"){
        return (isExplode) ? "&" + name + "=" : ",";

    }else if(style == "simple"){
        return ",";
    }else if(style == "spaceDelimited"){
        return (isExplode) ? "&" + name + "=" : " ";

    }else if(style == "pipeDelimited"){
        return (isExplode) ? "&" + name + "=" : "|";

    }else if(style == "deepObject"){
        return (isExplode) ? "&" : "none";

    }else {
        return "none";
    }
}

void OAIAuthenticationApi::devFetchApiKey(const QString &username) {
    QString fullPath = QString(_serverConfigs["devFetchApiKey"][_serverIndices.value("devFetchApiKey")].URL()+"/dev_fetch_api_key");
    
    QString queryPrefix, querySuffix, queryDelimiter, queryStyle;
    
    {
        queryStyle = "form";
        if(queryStyle == "")
            queryStyle = "form";
        queryPrefix = getParamStylePrefix(queryStyle);
        querySuffix = getParamStyleSuffix(queryStyle);
        queryDelimiter = getParamStyleDelimiter(queryStyle, "username", true);
        if (fullPath.indexOf("?") > 0)
            fullPath.append(queryPrefix);
        else
            fullPath.append("?");

        fullPath.append(QUrl::toPercentEncoding("username")).append(querySuffix).append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(username)));
    }
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");


    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIAuthenticationApi::devFetchApiKeyCallback);
    connect(this, &OAIAuthenticationApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, [this](){
        if(findChildren<OAIHttpRequestWorker*>().count() == 0){
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void OAIAuthenticationApi::devFetchApiKeyCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    OAIApiKeyResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit devFetchApiKeySignal(output);
        emit devFetchApiKeySignalFull(worker, output);
    } else {
        emit devFetchApiKeySignalE(output, error_type, error_str);
        emit devFetchApiKeySignalEFull(worker, error_type, error_str);
    }
}

void OAIAuthenticationApi::fetchApiKey(const QString &username, const QString &password) {
    QString fullPath = QString(_serverConfigs["fetchApiKey"][_serverIndices.value("fetchApiKey")].URL()+"/fetch_api_key");
    
    QString queryPrefix, querySuffix, queryDelimiter, queryStyle;
    
    {
        queryStyle = "form";
        if(queryStyle == "")
            queryStyle = "form";
        queryPrefix = getParamStylePrefix(queryStyle);
        querySuffix = getParamStyleSuffix(queryStyle);
        queryDelimiter = getParamStyleDelimiter(queryStyle, "username", true);
        if (fullPath.indexOf("?") > 0)
            fullPath.append(queryPrefix);
        else
            fullPath.append("?");

        fullPath.append(QUrl::toPercentEncoding("username")).append(querySuffix).append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(username)));
    }
    
    {
        queryStyle = "form";
        if(queryStyle == "")
            queryStyle = "form";
        queryPrefix = getParamStylePrefix(queryStyle);
        querySuffix = getParamStyleSuffix(queryStyle);
        queryDelimiter = getParamStyleDelimiter(queryStyle, "password", true);
        if (fullPath.indexOf("?") > 0)
            fullPath.append(queryPrefix);
        else
            fullPath.append("?");

        fullPath.append(QUrl::toPercentEncoding("password")).append(querySuffix).append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(password)));
    }
    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this, _manager);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "POST");


    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIAuthenticationApi::fetchApiKeyCallback);
    connect(this, &OAIAuthenticationApi::abortRequestsSignal, worker, &QObject::deleteLater);
    connect(worker, &QObject::destroyed, [this](){
        if(findChildren<OAIHttpRequestWorker*>().count() == 0){
            emit allPendingRequestsCompleted();
        }
    });

    worker->execute(&input);
}

void OAIAuthenticationApi::fetchApiKeyCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    OAIApiKeyResponse output(QString(worker->response));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit fetchApiKeySignal(output);
        emit fetchApiKeySignalFull(worker, output);
    } else {
        emit fetchApiKeySignalE(output, error_type, error_str);
        emit fetchApiKeySignalEFull(worker, error_type, error_str);
    }
}

} // namespace OpenAPI