#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ServerAndOrganizationsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Add a code playground
//
// Configure [code playgrounds](/help/code-blocks#code-playgrounds) for the organization.  `POST {{ api_url }}/v1/realm/playgrounds`  **Changes**: New in Zulip 4.0 (feature level 49). A parameter encoding bug was fixed in Zulip 4.0 (feature level 57). 
//
json_success_base_t*
ServerAndOrganizationsAPI_addCodePlayground(apiClient_t *apiClient, char * name , char * pygments_language , char * url_prefix )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/playgrounds")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/playgrounds");




    // query parameters
    char *keyQuery_name = NULL;
    char * valueQuery_name = NULL;
    keyValuePair_t *keyPairQuery_name = 0;
    if (name)
    {
        keyQuery_name = strdup("name");
        valueQuery_name = strdup((name));
        keyPairQuery_name = keyValuePair_create(keyQuery_name, valueQuery_name);
        list_addElement(localVarQueryParameters,keyPairQuery_name);
    }

    // query parameters
    char *keyQuery_pygments_language = NULL;
    char * valueQuery_pygments_language = NULL;
    keyValuePair_t *keyPairQuery_pygments_language = 0;
    if (pygments_language)
    {
        keyQuery_pygments_language = strdup("pygments_language");
        valueQuery_pygments_language = strdup((pygments_language));
        keyPairQuery_pygments_language = keyValuePair_create(keyQuery_pygments_language, valueQuery_pygments_language);
        list_addElement(localVarQueryParameters,keyPairQuery_pygments_language);
    }

    // query parameters
    char *keyQuery_url_prefix = NULL;
    char * valueQuery_url_prefix = NULL;
    keyValuePair_t *keyPairQuery_url_prefix = 0;
    if (url_prefix)
    {
        keyQuery_url_prefix = strdup("url_prefix");
        valueQuery_url_prefix = strdup((url_prefix));
        keyPairQuery_url_prefix = keyValuePair_create(keyQuery_url_prefix, valueQuery_url_prefix);
        list_addElement(localVarQueryParameters,keyPairQuery_url_prefix);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_name){
        free(keyQuery_name);
        keyQuery_name = NULL;
    }
    if(valueQuery_name){
        free(valueQuery_name);
        valueQuery_name = NULL;
    }
    if(keyPairQuery_name){
        keyValuePair_free(keyPairQuery_name);
        keyPairQuery_name = NULL;
    }
    if(keyQuery_pygments_language){
        free(keyQuery_pygments_language);
        keyQuery_pygments_language = NULL;
    }
    if(valueQuery_pygments_language){
        free(valueQuery_pygments_language);
        valueQuery_pygments_language = NULL;
    }
    if(keyPairQuery_pygments_language){
        keyValuePair_free(keyPairQuery_pygments_language);
        keyPairQuery_pygments_language = NULL;
    }
    if(keyQuery_url_prefix){
        free(keyQuery_url_prefix);
        keyQuery_url_prefix = NULL;
    }
    if(valueQuery_url_prefix){
        free(valueQuery_url_prefix);
        valueQuery_url_prefix = NULL;
    }
    if(keyPairQuery_url_prefix){
        keyValuePair_free(keyPairQuery_url_prefix);
        keyPairQuery_url_prefix = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Add a linkifier
//
// Configure [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `POST {{ api_url }}/v1/realm/filters` 
//
json_success_base_t*
ServerAndOrganizationsAPI_addLinkifier(apiClient_t *apiClient, char * pattern , char * url_format_string )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/filters")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/filters");




    // query parameters
    char *keyQuery_pattern = NULL;
    char * valueQuery_pattern = NULL;
    keyValuePair_t *keyPairQuery_pattern = 0;
    if (pattern)
    {
        keyQuery_pattern = strdup("pattern");
        valueQuery_pattern = strdup((pattern));
        keyPairQuery_pattern = keyValuePair_create(keyQuery_pattern, valueQuery_pattern);
        list_addElement(localVarQueryParameters,keyPairQuery_pattern);
    }

    // query parameters
    char *keyQuery_url_format_string = NULL;
    char * valueQuery_url_format_string = NULL;
    keyValuePair_t *keyPairQuery_url_format_string = 0;
    if (url_format_string)
    {
        keyQuery_url_format_string = strdup("url_format_string");
        valueQuery_url_format_string = strdup((url_format_string));
        keyPairQuery_url_format_string = keyValuePair_create(keyQuery_url_format_string, valueQuery_url_format_string);
        list_addElement(localVarQueryParameters,keyPairQuery_url_format_string);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_pattern){
        free(keyQuery_pattern);
        keyQuery_pattern = NULL;
    }
    if(valueQuery_pattern){
        free(valueQuery_pattern);
        valueQuery_pattern = NULL;
    }
    if(keyPairQuery_pattern){
        keyValuePair_free(keyPairQuery_pattern);
        keyPairQuery_pattern = NULL;
    }
    if(keyQuery_url_format_string){
        free(keyQuery_url_format_string);
        keyQuery_url_format_string = NULL;
    }
    if(valueQuery_url_format_string){
        free(valueQuery_url_format_string);
        valueQuery_url_format_string = NULL;
    }
    if(keyPairQuery_url_format_string){
        keyValuePair_free(keyPairQuery_url_format_string);
        keyPairQuery_url_format_string = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a custom profile field
//
// [Create a custom profile field](/help/add-custom-profile-fields) in the user's organization.  `POST {{ api_url }}/v1/realm/profile_fields` 
//
json_success_base_t*
ServerAndOrganizationsAPI_createCustomProfileField(apiClient_t *apiClient, int field_type , char * name , char * hint ,  field_data )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/profile_fields")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/profile_fields");




    // query parameters
    char *keyQuery_name = NULL;
    char * valueQuery_name = NULL;
    keyValuePair_t *keyPairQuery_name = 0;
    if (name)
    {
        keyQuery_name = strdup("name");
        valueQuery_name = strdup((name));
        keyPairQuery_name = keyValuePair_create(keyQuery_name, valueQuery_name);
        list_addElement(localVarQueryParameters,keyPairQuery_name);
    }

    // query parameters
    char *keyQuery_hint = NULL;
    char * valueQuery_hint = NULL;
    keyValuePair_t *keyPairQuery_hint = 0;
    if (hint)
    {
        keyQuery_hint = strdup("hint");
        valueQuery_hint = strdup((hint));
        keyPairQuery_hint = keyValuePair_create(keyQuery_hint, valueQuery_hint);
        list_addElement(localVarQueryParameters,keyPairQuery_hint);
    }

    // query parameters
    char *keyQuery_field_type = NULL;
    char * valueQuery_field_type = NULL;
    keyValuePair_t *keyPairQuery_field_type = 0;
    if (field_type)
    {
        keyQuery_field_type = strdup("field_type");
        valueQuery_field_type = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_field_type, MAX_NUMBER_LENGTH, "%d", field_type);
        keyPairQuery_field_type = keyValuePair_create(keyQuery_field_type, valueQuery_field_type);
        list_addElement(localVarQueryParameters,keyPairQuery_field_type);
    }

    // query parameters
    char *keyQuery_field_data = NULL;
     valueQuery_field_data ;
    keyValuePair_t *keyPairQuery_field_data = 0;
    if (field_data)
    {
        keyQuery_field_data = strdup("field_data");
        valueQuery_field_data = (field_data);
        keyPairQuery_field_data = keyValuePair_create(keyQuery_field_data, &valueQuery_field_data);
        list_addElement(localVarQueryParameters,keyPairQuery_field_data);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_name){
        free(keyQuery_name);
        keyQuery_name = NULL;
    }
    if(valueQuery_name){
        free(valueQuery_name);
        valueQuery_name = NULL;
    }
    if(keyPairQuery_name){
        keyValuePair_free(keyPairQuery_name);
        keyPairQuery_name = NULL;
    }
    if(keyQuery_hint){
        free(keyQuery_hint);
        keyQuery_hint = NULL;
    }
    if(valueQuery_hint){
        free(valueQuery_hint);
        valueQuery_hint = NULL;
    }
    if(keyPairQuery_hint){
        keyValuePair_free(keyPairQuery_hint);
        keyPairQuery_hint = NULL;
    }
    if(keyQuery_field_type){
        free(keyQuery_field_type);
        keyQuery_field_type = NULL;
    }
    if(valueQuery_field_type){
        free(valueQuery_field_type);
        valueQuery_field_type = NULL;
    }
    if(keyPairQuery_field_type){
        keyValuePair_free(keyPairQuery_field_type);
        keyPairQuery_field_type = NULL;
    }
    if(keyQuery_field_data){
        free(keyQuery_field_data);
        keyQuery_field_data = NULL;
    }
    if(keyPairQuery_field_data){
        keyValuePair_free(keyPairQuery_field_data);
        keyPairQuery_field_data = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get all custom emoji
//
// Get all the custom emoji in the user's organization.  `GET {{ api_url }}/v1/realm/emoji` 
//
json_success_base_t*
ServerAndOrganizationsAPI_getCustomEmoji(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/emoji")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/emoji");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get all custom profile fields
//
// Get all the [custom profile fields](/help/add-custom-profile-fields) configured for the user's organization.  `GET {{ api_url }}/v1/realm/profile_fields` 
//
json_success_base_t*
ServerAndOrganizationsAPI_getCustomProfileFields(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/profile_fields")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/profile_fields");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get linkifiers
//
// List all of an organization's configured [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `GET {{ api_url }}/v1/realm/linkifiers`  **Changes**: New in Zulip 4.0 (feature level 54). On older versions, a similar `GET /realm/filters` endpoint was available with each entry in a `[pattern, url_format, id]` tuple format. 
//
json_success_base_t*
ServerAndOrganizationsAPI_getLinkifiers(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/linkifiers")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/linkifiers");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get server settings
//
// Fetch global settings for a Zulip server.  `GET {{ api_url }}/v1/server_settings`  **Note:** this endpoint does not require any authentication at all, and you can use it to check:  * If this is a Zulip server, and if so, what version of Zulip it's running. * What a Zulip client (e.g. a mobile app or [zulip-terminal](https://github.com/zulip/zulip-terminal/)) needs to know in order to display a login prompt for the server (e.g. what authentication methods are available). 
//
json_success_base_t*
ServerAndOrganizationsAPI_getServerSettings(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/server_settings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/server_settings");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Remove a code playground
//
// Remove a [code playground](/help/code-blocks#code-playgrounds) previously configured for an organization.  `DELETE {{ api_url }}/v1/realm/playgrounds/{playground_id}`  **Changes**: New in Zulip 4.0 (feature level 49). 
//
json_success_t*
ServerAndOrganizationsAPI_removeCodePlayground(apiClient_t *apiClient, int playground_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/playgrounds/{playground_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/playgrounds/{playground_id}");


    // Path Params
    long sizeOfPathParams_playground_id =  + strlen("{ playground_id }");
    if(playground_id == 0){
        goto end;
    }
    char* localVarToReplace_playground_id = malloc(sizeOfPathParams_playground_id);
    snprintf(localVarToReplace_playground_id, sizeOfPathParams_playground_id, "{%s}", "playground_id");

    char localVarBuff_playground_id[256];
    intToStr(localVarBuff_playground_id, playground_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_playground_id, localVarBuff_playground_id);



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_playground_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Remove a linkifier
//
// Remove [linkifiers](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `DELETE {{ api_url }}/v1/realm/filters/{filter_id}` 
//
json_success_t*
ServerAndOrganizationsAPI_removeLinkifier(apiClient_t *apiClient, int filter_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/filters/{filter_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/filters/{filter_id}");


    // Path Params
    long sizeOfPathParams_filter_id =  + strlen("{ filter_id }");
    if(filter_id == 0){
        goto end;
    }
    char* localVarToReplace_filter_id = malloc(sizeOfPathParams_filter_id);
    snprintf(localVarToReplace_filter_id, sizeOfPathParams_filter_id, "{%s}", "filter_id");

    char localVarBuff_filter_id[256];
    intToStr(localVarBuff_filter_id, filter_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_filter_id, localVarBuff_filter_id);



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_filter_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Reorder custom profile fields
//
// Reorder the custom profile fields in the user's organization.  `PATCH {{ api_url }}/v1/realm/profile_fields`  Custom profile fields are displayed in Zulip UI widgets in order; this endpoint allows administrative settings UI to change the field ordering.  This endpoint is used to implement the dragging feature described in the [custom profile fields documentation](/help/add-custom-profile-fields). 
//
json_success_t*
ServerAndOrganizationsAPI_reorderCustomProfileFields(apiClient_t *apiClient, list_t * order )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/profile_fields")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/profile_fields");




    // query parameters
    if (order)
    {
        list_addElement(localVarQueryParameters,order);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PATCH");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update a linkifier
//
// Update a [linkifier](/help/add-a-custom-linkifier), regular expression patterns that are automatically linkified when they appear in messages and topics.  `PATCH {{ api_url }}/v1/realm/filters/{filter_id}`  **Changes**: New in Zulip 4.0 (feature level 57). 
//
json_success_t*
ServerAndOrganizationsAPI_updateLinkifier(apiClient_t *apiClient, int filter_id , char * pattern , char * url_format_string )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/filters/{filter_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/filters/{filter_id}");


    // Path Params
    long sizeOfPathParams_filter_id =  + strlen("{ filter_id }");
    if(filter_id == 0){
        goto end;
    }
    char* localVarToReplace_filter_id = malloc(sizeOfPathParams_filter_id);
    snprintf(localVarToReplace_filter_id, sizeOfPathParams_filter_id, "{%s}", "filter_id");

    char localVarBuff_filter_id[256];
    intToStr(localVarBuff_filter_id, filter_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_filter_id, localVarBuff_filter_id);




    // query parameters
    char *keyQuery_pattern = NULL;
    char * valueQuery_pattern = NULL;
    keyValuePair_t *keyPairQuery_pattern = 0;
    if (pattern)
    {
        keyQuery_pattern = strdup("pattern");
        valueQuery_pattern = strdup((pattern));
        keyPairQuery_pattern = keyValuePair_create(keyQuery_pattern, valueQuery_pattern);
        list_addElement(localVarQueryParameters,keyPairQuery_pattern);
    }

    // query parameters
    char *keyQuery_url_format_string = NULL;
    char * valueQuery_url_format_string = NULL;
    keyValuePair_t *keyPairQuery_url_format_string = 0;
    if (url_format_string)
    {
        keyQuery_url_format_string = strdup("url_format_string");
        valueQuery_url_format_string = strdup((url_format_string));
        keyPairQuery_url_format_string = keyValuePair_create(keyQuery_url_format_string, valueQuery_url_format_string);
        list_addElement(localVarQueryParameters,keyPairQuery_url_format_string);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PATCH");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_filter_id);
    if(keyQuery_pattern){
        free(keyQuery_pattern);
        keyQuery_pattern = NULL;
    }
    if(valueQuery_pattern){
        free(valueQuery_pattern);
        valueQuery_pattern = NULL;
    }
    if(keyPairQuery_pattern){
        keyValuePair_free(keyPairQuery_pattern);
        keyPairQuery_pattern = NULL;
    }
    if(keyQuery_url_format_string){
        free(keyQuery_url_format_string);
        keyQuery_url_format_string = NULL;
    }
    if(valueQuery_url_format_string){
        free(valueQuery_url_format_string);
        valueQuery_url_format_string = NULL;
    }
    if(keyPairQuery_url_format_string){
        keyValuePair_free(keyPairQuery_url_format_string);
        keyPairQuery_url_format_string = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Upload custom emoji
//
// This endpoint is used to upload a custom emoji for use in the user's organization.  Access to this endpoint depends on the [organization's configuration](https://zulip.com/help/only-allow-admins-to-add-emoji).  `POST {{ api_url }}/v1/realm/emoji/{emoji_name}` 
//
json_success_t*
ServerAndOrganizationsAPI_uploadCustomEmoji(apiClient_t *apiClient, char * emoji_name , binary_t* filename )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_create();
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/realm/emoji/{emoji_name}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/realm/emoji/{emoji_name}");


    // Path Params
    long sizeOfPathParams_emoji_name = strlen(emoji_name)+3 + strlen("{ emoji_name }");
    if(emoji_name == NULL) {
        goto end;
    }
    char* localVarToReplace_emoji_name = malloc(sizeOfPathParams_emoji_name);
    sprintf(localVarToReplace_emoji_name, "{%s}", "emoji_name");

    localVarPath = strReplace(localVarPath, localVarToReplace_emoji_name, emoji_name);



    // form parameters
    char *keyForm_filename = NULL;
    binary_t* valueForm_filename = 0;
    keyValuePair_t *keyPairForm_filename = 0;
    if (filename != NULL)
    {
        keyForm_filename = strdup("filename");
        valueForm_filename = filename;
        keyPairForm_filename = keyValuePair_create(keyForm_filename, &valueForm_filename);
        list_addElement(localVarFormParameters,keyPairForm_filename); //file adding
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *ServerAndOrganizationsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(ServerAndOrganizationsAPIlocalVarJSON);
    cJSON_Delete(ServerAndOrganizationsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    list_free(localVarFormParameters);
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_emoji_name);
    if (keyForm_filename) {
        free(keyForm_filename);
        keyForm_filename = NULL;
    }
//    free(fileVar_filename->data);
//    free(fileVar_filename);
    free(keyPairForm_filename);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

