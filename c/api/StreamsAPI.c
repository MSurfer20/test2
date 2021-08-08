#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "StreamsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum OP for StreamsAPI_muteTopic

static char* muteTopic_OP_ToString(zulip_rest_api_muteTopic_op_e OP){
    char *OPArray[] =  { "NULL", "add", "remove" };
    return OPArray[OP];
}

static zulip_rest_api_muteTopic_op_e muteTopic_OP_FromString(char* OP){
    int stringToReturn = 0;
    char *OPArray[] =  { "NULL", "add", "remove" };
    size_t sizeofArray = sizeof(OPArray) / sizeof(OPArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(OP, OPArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function muteTopic_OP_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *muteTopic_OP_convertToJSON(zulip_rest_api_muteTopic_op_e OP) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "op", muteTopic_OP_ToString(OP)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function muteTopic_OP_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_muteTopic_op_e muteTopic_OP_parseFromJSON(cJSON* OPJSON) {
    zulip_rest_api_muteTopic_op_e OPVariable = 0;
    cJSON *OPVar = cJSON_GetObjectItemCaseSensitive(OPJSON, "op");
    if(!cJSON_IsString(OPVar) || (OPVar->valuestring == NULL))
    {
        goto end;
    }
    OPVariable = muteTopic_OP_FromString(OPVar->valuestring);
    return OPVariable;
end:
    return 0;
}
*/


// Archive a stream
//
// [Archive the stream](/help/archive-a-stream) with the ID `stream_id`.  `DELETE {{ api_url }}/v1/streams/{stream_id}` 
//
json_success_t*
StreamsAPI_archiveStream(apiClient_t *apiClient, int stream_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/streams/{stream_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/streams/{stream_id}");


    // Path Params
    long sizeOfPathParams_stream_id =  + strlen("{ stream_id }");
    if(stream_id == 0){
        goto end;
    }
    char* localVarToReplace_stream_id = malloc(sizeOfPathParams_stream_id);
    snprintf(localVarToReplace_stream_id, sizeOfPathParams_stream_id, "{%s}", "stream_id");

    char localVarBuff_stream_id[256];
    intToStr(localVarBuff_stream_id, stream_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_stream_id, localVarBuff_stream_id);



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
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    free(localVarToReplace_stream_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create BigBlueButton video call
//
// Create a video call URL for a BigBlueButton video call. Requires BigBlueButton to be configured on the Zulip server. 
//
json_success_base_t*
StreamsAPI_createBigBlueButtonVideoCall(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/calls/bigbluebutton/create")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/calls/bigbluebutton/create");



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
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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

// Get stream ID
//
// Get the unique ID of a given stream.  `GET {{ api_url }}/v1/get_stream_id` 
//
json_success_base_t*
StreamsAPI_getStreamId(apiClient_t *apiClient, char * stream )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/get_stream_id")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/get_stream_id");




    // query parameters
    char *keyQuery_stream = NULL;
    char * valueQuery_stream = NULL;
    keyValuePair_t *keyPairQuery_stream = 0;
    if (stream)
    {
        keyQuery_stream = strdup("stream");
        valueQuery_stream = strdup((stream));
        keyPairQuery_stream = keyValuePair_create(keyQuery_stream, valueQuery_stream);
        list_addElement(localVarQueryParameters,keyPairQuery_stream);
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
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    if(keyQuery_stream){
        free(keyQuery_stream);
        keyQuery_stream = NULL;
    }
    if(valueQuery_stream){
        free(valueQuery_stream);
        valueQuery_stream = NULL;
    }
    if(keyPairQuery_stream){
        keyValuePair_free(keyPairQuery_stream);
        keyPairQuery_stream = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get topics in a stream
//
// Get all the topics in a specific stream  `GET {{ api_url }}/v1/users/me/{stream_id}/topics` 
//
json_success_base_t*
StreamsAPI_getStreamTopics(apiClient_t *apiClient, int stream_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/{stream_id}/topics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/{stream_id}/topics");


    // Path Params
    long sizeOfPathParams_stream_id =  + strlen("{ stream_id }");
    if(stream_id == 0){
        goto end;
    }
    char* localVarToReplace_stream_id = malloc(sizeOfPathParams_stream_id);
    snprintf(localVarToReplace_stream_id, sizeOfPathParams_stream_id, "{%s}", "stream_id");

    char localVarBuff_stream_id[256];
    intToStr(localVarBuff_stream_id, stream_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_stream_id, localVarBuff_stream_id);



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
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    free(localVarToReplace_stream_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get all streams
//
// Get all streams that the user has access to.  `GET {{ api_url }}/v1/streams` 
//
json_success_base_t*
StreamsAPI_getStreams(apiClient_t *apiClient, int include_public , int include_web_public , int include_subscribed , int include_all_active , int include_default , int include_owner_subscribed )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/streams")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/streams");




    // query parameters
    char *keyQuery_include_public = NULL;
    char * valueQuery_include_public = NULL;
    keyValuePair_t *keyPairQuery_include_public = 0;
    if (include_public)
    {
        keyQuery_include_public = strdup("include_public");
        valueQuery_include_public = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_public, MAX_NUMBER_LENGTH, "%d", include_public);
        keyPairQuery_include_public = keyValuePair_create(keyQuery_include_public, valueQuery_include_public);
        list_addElement(localVarQueryParameters,keyPairQuery_include_public);
    }

    // query parameters
    char *keyQuery_include_web_public = NULL;
    char * valueQuery_include_web_public = NULL;
    keyValuePair_t *keyPairQuery_include_web_public = 0;
    if (include_web_public)
    {
        keyQuery_include_web_public = strdup("include_web_public");
        valueQuery_include_web_public = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_web_public, MAX_NUMBER_LENGTH, "%d", include_web_public);
        keyPairQuery_include_web_public = keyValuePair_create(keyQuery_include_web_public, valueQuery_include_web_public);
        list_addElement(localVarQueryParameters,keyPairQuery_include_web_public);
    }

    // query parameters
    char *keyQuery_include_subscribed = NULL;
    char * valueQuery_include_subscribed = NULL;
    keyValuePair_t *keyPairQuery_include_subscribed = 0;
    if (include_subscribed)
    {
        keyQuery_include_subscribed = strdup("include_subscribed");
        valueQuery_include_subscribed = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_subscribed, MAX_NUMBER_LENGTH, "%d", include_subscribed);
        keyPairQuery_include_subscribed = keyValuePair_create(keyQuery_include_subscribed, valueQuery_include_subscribed);
        list_addElement(localVarQueryParameters,keyPairQuery_include_subscribed);
    }

    // query parameters
    char *keyQuery_include_all_active = NULL;
    char * valueQuery_include_all_active = NULL;
    keyValuePair_t *keyPairQuery_include_all_active = 0;
    if (include_all_active)
    {
        keyQuery_include_all_active = strdup("include_all_active");
        valueQuery_include_all_active = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_all_active, MAX_NUMBER_LENGTH, "%d", include_all_active);
        keyPairQuery_include_all_active = keyValuePair_create(keyQuery_include_all_active, valueQuery_include_all_active);
        list_addElement(localVarQueryParameters,keyPairQuery_include_all_active);
    }

    // query parameters
    char *keyQuery_include_default = NULL;
    char * valueQuery_include_default = NULL;
    keyValuePair_t *keyPairQuery_include_default = 0;
    if (include_default)
    {
        keyQuery_include_default = strdup("include_default");
        valueQuery_include_default = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_default, MAX_NUMBER_LENGTH, "%d", include_default);
        keyPairQuery_include_default = keyValuePair_create(keyQuery_include_default, valueQuery_include_default);
        list_addElement(localVarQueryParameters,keyPairQuery_include_default);
    }

    // query parameters
    char *keyQuery_include_owner_subscribed = NULL;
    char * valueQuery_include_owner_subscribed = NULL;
    keyValuePair_t *keyPairQuery_include_owner_subscribed = 0;
    if (include_owner_subscribed)
    {
        keyQuery_include_owner_subscribed = strdup("include_owner_subscribed");
        valueQuery_include_owner_subscribed = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_owner_subscribed, MAX_NUMBER_LENGTH, "%d", include_owner_subscribed);
        keyPairQuery_include_owner_subscribed = keyValuePair_create(keyQuery_include_owner_subscribed, valueQuery_include_owner_subscribed);
        list_addElement(localVarQueryParameters,keyPairQuery_include_owner_subscribed);
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
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    if(keyQuery_include_public){
        free(keyQuery_include_public);
        keyQuery_include_public = NULL;
    }
    if(valueQuery_include_public){
        free(valueQuery_include_public);
        valueQuery_include_public = NULL;
    }
    if(keyPairQuery_include_public){
        keyValuePair_free(keyPairQuery_include_public);
        keyPairQuery_include_public = NULL;
    }
    if(keyQuery_include_web_public){
        free(keyQuery_include_web_public);
        keyQuery_include_web_public = NULL;
    }
    if(valueQuery_include_web_public){
        free(valueQuery_include_web_public);
        valueQuery_include_web_public = NULL;
    }
    if(keyPairQuery_include_web_public){
        keyValuePair_free(keyPairQuery_include_web_public);
        keyPairQuery_include_web_public = NULL;
    }
    if(keyQuery_include_subscribed){
        free(keyQuery_include_subscribed);
        keyQuery_include_subscribed = NULL;
    }
    if(valueQuery_include_subscribed){
        free(valueQuery_include_subscribed);
        valueQuery_include_subscribed = NULL;
    }
    if(keyPairQuery_include_subscribed){
        keyValuePair_free(keyPairQuery_include_subscribed);
        keyPairQuery_include_subscribed = NULL;
    }
    if(keyQuery_include_all_active){
        free(keyQuery_include_all_active);
        keyQuery_include_all_active = NULL;
    }
    if(valueQuery_include_all_active){
        free(valueQuery_include_all_active);
        valueQuery_include_all_active = NULL;
    }
    if(keyPairQuery_include_all_active){
        keyValuePair_free(keyPairQuery_include_all_active);
        keyPairQuery_include_all_active = NULL;
    }
    if(keyQuery_include_default){
        free(keyQuery_include_default);
        keyQuery_include_default = NULL;
    }
    if(valueQuery_include_default){
        free(valueQuery_include_default);
        valueQuery_include_default = NULL;
    }
    if(keyPairQuery_include_default){
        keyValuePair_free(keyPairQuery_include_default);
        keyPairQuery_include_default = NULL;
    }
    if(keyQuery_include_owner_subscribed){
        free(keyQuery_include_owner_subscribed);
        keyQuery_include_owner_subscribed = NULL;
    }
    if(valueQuery_include_owner_subscribed){
        free(valueQuery_include_owner_subscribed);
        valueQuery_include_owner_subscribed = NULL;
    }
    if(keyPairQuery_include_owner_subscribed){
        keyValuePair_free(keyPairQuery_include_owner_subscribed);
        keyPairQuery_include_owner_subscribed = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get subscription status
//
// Check whether a user is subscribed to a stream.  `GET {{ api_url }}/v1/users/{user_id}/subscriptions/{stream_id}`  **Changes**: New in Zulip 3.0 (feature level 11). 
//
json_success_base_t*
StreamsAPI_getSubscriptionStatus(apiClient_t *apiClient, int user_id , int stream_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{user_id}/subscriptions/{stream_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{user_id}/subscriptions/{stream_id}");


    // Path Params
    long sizeOfPathParams_user_id =  +  + strlen("{ user_id }");
    if(user_id == 0){
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    snprintf(localVarToReplace_user_id, sizeOfPathParams_user_id, "{%s}", "user_id");

    char localVarBuff_user_id[256];
    intToStr(localVarBuff_user_id, user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, localVarBuff_user_id);


    // Path Params
    long sizeOfPathParams_stream_id =  +  + strlen("{ stream_id }");
    if(stream_id == 0){
        goto end;
    }
    char* localVarToReplace_stream_id = malloc(sizeOfPathParams_stream_id);
    snprintf(localVarToReplace_stream_id, sizeOfPathParams_stream_id, "{%s}", "stream_id");

    char localVarBuff_stream_id[256];
    intToStr(localVarBuff_stream_id, stream_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_stream_id, localVarBuff_stream_id);



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
        printf("%s\n","Success");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    free(localVarToReplace_user_id);
    free(localVarToReplace_stream_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get subscribed streams
//
// Get all streams that the user is subscribed to.  `GET {{ api_url }}/v1/users/me/subscriptions` 
//
json_success_base_t*
StreamsAPI_getSubscriptions(apiClient_t *apiClient, int include_subscribers )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/subscriptions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/subscriptions");




    // query parameters
    char *keyQuery_include_subscribers = NULL;
    char * valueQuery_include_subscribers = NULL;
    keyValuePair_t *keyPairQuery_include_subscribers = 0;
    if (include_subscribers)
    {
        keyQuery_include_subscribers = strdup("include_subscribers");
        valueQuery_include_subscribers = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_subscribers, MAX_NUMBER_LENGTH, "%d", include_subscribers);
        keyPairQuery_include_subscribers = keyValuePair_create(keyQuery_include_subscribers, valueQuery_include_subscribers);
        list_addElement(localVarQueryParameters,keyPairQuery_include_subscribers);
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
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    if(keyQuery_include_subscribers){
        free(keyQuery_include_subscribers);
        keyQuery_include_subscribers = NULL;
    }
    if(valueQuery_include_subscribers){
        free(valueQuery_include_subscribers);
        valueQuery_include_subscribers = NULL;
    }
    if(keyPairQuery_include_subscribers){
        keyValuePair_free(keyPairQuery_include_subscribers);
        keyPairQuery_include_subscribers = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Topic muting
//
// This endpoint mutes/unmutes a topic within a stream that the current user is subscribed to.  Muted topics are displayed faded in the Zulip UI, and are not included in the user's unread count totals.  `PATCH {{ api_url }}/v1/users/me/subscriptions/muted_topics` 
//
json_success_t*
StreamsAPI_muteTopic(apiClient_t *apiClient, char * topic , zulip_rest_api_muteTopic_op_e op , char * stream , int stream_id )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/subscriptions/muted_topics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/subscriptions/muted_topics");




    // query parameters
    char *keyQuery_stream = NULL;
    char * valueQuery_stream = NULL;
    keyValuePair_t *keyPairQuery_stream = 0;
    if (stream)
    {
        keyQuery_stream = strdup("stream");
        valueQuery_stream = strdup((stream));
        keyPairQuery_stream = keyValuePair_create(keyQuery_stream, valueQuery_stream);
        list_addElement(localVarQueryParameters,keyPairQuery_stream);
    }

    // query parameters
    char *keyQuery_stream_id = NULL;
    char * valueQuery_stream_id = NULL;
    keyValuePair_t *keyPairQuery_stream_id = 0;
    if (stream_id)
    {
        keyQuery_stream_id = strdup("stream_id");
        valueQuery_stream_id = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_stream_id, MAX_NUMBER_LENGTH, "%d", stream_id);
        keyPairQuery_stream_id = keyValuePair_create(keyQuery_stream_id, valueQuery_stream_id);
        list_addElement(localVarQueryParameters,keyPairQuery_stream_id);
    }

    // query parameters
    char *keyQuery_topic = NULL;
    char * valueQuery_topic = NULL;
    keyValuePair_t *keyPairQuery_topic = 0;
    if (topic)
    {
        keyQuery_topic = strdup("topic");
        valueQuery_topic = strdup((topic));
        keyPairQuery_topic = keyValuePair_create(keyQuery_topic, valueQuery_topic);
        list_addElement(localVarQueryParameters,keyPairQuery_topic);
    }

    // query parameters
    char *keyQuery_op = NULL;
    zulip_rest_api_muteTopic_op_e valueQuery_op ;
    keyValuePair_t *keyPairQuery_op = 0;
    if (op)
    {
        keyQuery_op = strdup("op");
        valueQuery_op = (op);
        keyPairQuery_op = keyValuePair_create(keyQuery_op, (void *)strdup(muteTopic_OP_ToString(
		valueQuery_op)));
        list_addElement(localVarQueryParameters,keyPairQuery_op);
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
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    if(keyQuery_stream){
        free(keyQuery_stream);
        keyQuery_stream = NULL;
    }
    if(valueQuery_stream){
        free(valueQuery_stream);
        valueQuery_stream = NULL;
    }
    if(keyPairQuery_stream){
        keyValuePair_free(keyPairQuery_stream);
        keyPairQuery_stream = NULL;
    }
    if(keyQuery_stream_id){
        free(keyQuery_stream_id);
        keyQuery_stream_id = NULL;
    }
    if(valueQuery_stream_id){
        free(valueQuery_stream_id);
        valueQuery_stream_id = NULL;
    }
    if(keyPairQuery_stream_id){
        keyValuePair_free(keyPairQuery_stream_id);
        keyPairQuery_stream_id = NULL;
    }
    if(keyQuery_topic){
        free(keyQuery_topic);
        keyQuery_topic = NULL;
    }
    if(valueQuery_topic){
        free(valueQuery_topic);
        valueQuery_topic = NULL;
    }
    if(keyPairQuery_topic){
        keyValuePair_free(keyPairQuery_topic);
        keyPairQuery_topic = NULL;
    }
    if(keyQuery_op){
        free(keyQuery_op);
        keyQuery_op = NULL;
    }
    if(keyPairQuery_op){
        keyValuePair_free(keyPairQuery_op);
        keyPairQuery_op = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Subscribe to a stream
//
// Subscribe one or more users to one or more streams.  `POST {{ api_url }}/v1/users/me/subscriptions`  If any of the specified streams do not exist, they are automatically created.  The initial [stream settings](/api/update-stream) will be determined by the optional parameters like `invite_only` detailed below. 
//
one_ofobjectobject_t*
StreamsAPI_subscribe(apiClient_t *apiClient, list_t * subscriptions , list_t * principals , int authorization_errors_fatal , int announce , int invite_only , int history_public_to_subscribers , int stream_post_policy , one_ofstringinteger_t * message_retention_days )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/subscriptions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/subscriptions");




    // query parameters
    if (subscriptions)
    {
        list_addElement(localVarQueryParameters,subscriptions);
    }

    // query parameters
    if (principals)
    {
        list_addElement(localVarQueryParameters,principals);
    }

    // query parameters
    char *keyQuery_authorization_errors_fatal = NULL;
    char * valueQuery_authorization_errors_fatal = NULL;
    keyValuePair_t *keyPairQuery_authorization_errors_fatal = 0;
    if (authorization_errors_fatal)
    {
        keyQuery_authorization_errors_fatal = strdup("authorization_errors_fatal");
        valueQuery_authorization_errors_fatal = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_authorization_errors_fatal, MAX_NUMBER_LENGTH, "%d", authorization_errors_fatal);
        keyPairQuery_authorization_errors_fatal = keyValuePair_create(keyQuery_authorization_errors_fatal, valueQuery_authorization_errors_fatal);
        list_addElement(localVarQueryParameters,keyPairQuery_authorization_errors_fatal);
    }

    // query parameters
    char *keyQuery_announce = NULL;
    char * valueQuery_announce = NULL;
    keyValuePair_t *keyPairQuery_announce = 0;
    if (announce)
    {
        keyQuery_announce = strdup("announce");
        valueQuery_announce = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_announce, MAX_NUMBER_LENGTH, "%d", announce);
        keyPairQuery_announce = keyValuePair_create(keyQuery_announce, valueQuery_announce);
        list_addElement(localVarQueryParameters,keyPairQuery_announce);
    }

    // query parameters
    char *keyQuery_invite_only = NULL;
    char * valueQuery_invite_only = NULL;
    keyValuePair_t *keyPairQuery_invite_only = 0;
    if (invite_only)
    {
        keyQuery_invite_only = strdup("invite_only");
        valueQuery_invite_only = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_invite_only, MAX_NUMBER_LENGTH, "%d", invite_only);
        keyPairQuery_invite_only = keyValuePair_create(keyQuery_invite_only, valueQuery_invite_only);
        list_addElement(localVarQueryParameters,keyPairQuery_invite_only);
    }

    // query parameters
    char *keyQuery_history_public_to_subscribers = NULL;
    char * valueQuery_history_public_to_subscribers = NULL;
    keyValuePair_t *keyPairQuery_history_public_to_subscribers = 0;
    if (history_public_to_subscribers)
    {
        keyQuery_history_public_to_subscribers = strdup("history_public_to_subscribers");
        valueQuery_history_public_to_subscribers = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_history_public_to_subscribers, MAX_NUMBER_LENGTH, "%d", history_public_to_subscribers);
        keyPairQuery_history_public_to_subscribers = keyValuePair_create(keyQuery_history_public_to_subscribers, valueQuery_history_public_to_subscribers);
        list_addElement(localVarQueryParameters,keyPairQuery_history_public_to_subscribers);
    }

    // query parameters
    char *keyQuery_stream_post_policy = NULL;
    char * valueQuery_stream_post_policy = NULL;
    keyValuePair_t *keyPairQuery_stream_post_policy = 0;
    if (stream_post_policy)
    {
        keyQuery_stream_post_policy = strdup("stream_post_policy");
        valueQuery_stream_post_policy = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_stream_post_policy, MAX_NUMBER_LENGTH, "%d", stream_post_policy);
        keyPairQuery_stream_post_policy = keyValuePair_create(keyQuery_stream_post_policy, valueQuery_stream_post_policy);
        list_addElement(localVarQueryParameters,keyPairQuery_stream_post_policy);
    }

    // query parameters
    char *keyQuery_message_retention_days = NULL;
    one_ofstringinteger_t * valueQuery_message_retention_days ;
    keyValuePair_t *keyPairQuery_message_retention_days = 0;
    if (message_retention_days)
    {
        keyQuery_message_retention_days = strdup("message_retention_days");
        valueQuery_message_retention_days = (message_retention_days);
        keyPairQuery_message_retention_days = keyValuePair_create(keyQuery_message_retention_days, &valueQuery_message_retention_days);
        list_addElement(localVarQueryParameters,keyPairQuery_message_retention_days);
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
    if (apiClient->response_code == 400) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    one_ofobjectobject_t *elementToReturn = one_ofobjectobject_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    if(keyQuery_authorization_errors_fatal){
        free(keyQuery_authorization_errors_fatal);
        keyQuery_authorization_errors_fatal = NULL;
    }
    if(valueQuery_authorization_errors_fatal){
        free(valueQuery_authorization_errors_fatal);
        valueQuery_authorization_errors_fatal = NULL;
    }
    if(keyPairQuery_authorization_errors_fatal){
        keyValuePair_free(keyPairQuery_authorization_errors_fatal);
        keyPairQuery_authorization_errors_fatal = NULL;
    }
    if(keyQuery_announce){
        free(keyQuery_announce);
        keyQuery_announce = NULL;
    }
    if(valueQuery_announce){
        free(valueQuery_announce);
        valueQuery_announce = NULL;
    }
    if(keyPairQuery_announce){
        keyValuePair_free(keyPairQuery_announce);
        keyPairQuery_announce = NULL;
    }
    if(keyQuery_invite_only){
        free(keyQuery_invite_only);
        keyQuery_invite_only = NULL;
    }
    if(valueQuery_invite_only){
        free(valueQuery_invite_only);
        valueQuery_invite_only = NULL;
    }
    if(keyPairQuery_invite_only){
        keyValuePair_free(keyPairQuery_invite_only);
        keyPairQuery_invite_only = NULL;
    }
    if(keyQuery_history_public_to_subscribers){
        free(keyQuery_history_public_to_subscribers);
        keyQuery_history_public_to_subscribers = NULL;
    }
    if(valueQuery_history_public_to_subscribers){
        free(valueQuery_history_public_to_subscribers);
        valueQuery_history_public_to_subscribers = NULL;
    }
    if(keyPairQuery_history_public_to_subscribers){
        keyValuePair_free(keyPairQuery_history_public_to_subscribers);
        keyPairQuery_history_public_to_subscribers = NULL;
    }
    if(keyQuery_stream_post_policy){
        free(keyQuery_stream_post_policy);
        keyQuery_stream_post_policy = NULL;
    }
    if(valueQuery_stream_post_policy){
        free(valueQuery_stream_post_policy);
        valueQuery_stream_post_policy = NULL;
    }
    if(keyPairQuery_stream_post_policy){
        keyValuePair_free(keyPairQuery_stream_post_policy);
        keyPairQuery_stream_post_policy = NULL;
    }
    if(keyQuery_message_retention_days){
        free(keyQuery_message_retention_days);
        keyQuery_message_retention_days = NULL;
    }
    if(keyPairQuery_message_retention_days){
        keyValuePair_free(keyPairQuery_message_retention_days);
        keyPairQuery_message_retention_days = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Unsubscribe from a stream
//
// Unsubscribe yourself or other users from one or more streams.  `DELETE {{ api_url }}/v1/users/me/subscriptions` 
//
json_success_base_t*
StreamsAPI_unsubscribe(apiClient_t *apiClient, list_t * subscriptions , list_t * principals )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/subscriptions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/subscriptions");




    // query parameters
    if (subscriptions)
    {
        list_addElement(localVarQueryParameters,subscriptions);
    }

    // query parameters
    if (principals)
    {
        list_addElement(localVarQueryParameters,principals);
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
                    "DELETE");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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

// Update a stream
//
// Configure the stream with the ID `stream_id`.  This endpoint supports an organization administrator editing any property of a stream, including:  * Stream [name](/help/rename-a-stream) and [description](/help/change-the-stream-description) * Stream [permissions](/help/stream-permissions), including [privacy](/help/change-the-privacy-of-a-stream) and [who can send](/help/stream-sending-policy).  `PATCH {{ api_url }}/v1/streams/{stream_id}` 
//
json_success_t*
StreamsAPI_updateStream(apiClient_t *apiClient, int stream_id , char * description , char * new_name , int is_private , int is_announcement_only , int stream_post_policy , int history_public_to_subscribers , one_ofstringinteger_t * message_retention_days )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/streams/{stream_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/streams/{stream_id}");


    // Path Params
    long sizeOfPathParams_stream_id =  + strlen("{ stream_id }");
    if(stream_id == 0){
        goto end;
    }
    char* localVarToReplace_stream_id = malloc(sizeOfPathParams_stream_id);
    snprintf(localVarToReplace_stream_id, sizeOfPathParams_stream_id, "{%s}", "stream_id");

    char localVarBuff_stream_id[256];
    intToStr(localVarBuff_stream_id, stream_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_stream_id, localVarBuff_stream_id);




    // query parameters
    char *keyQuery_description = NULL;
    char * valueQuery_description = NULL;
    keyValuePair_t *keyPairQuery_description = 0;
    if (description)
    {
        keyQuery_description = strdup("description");
        valueQuery_description = strdup((description));
        keyPairQuery_description = keyValuePair_create(keyQuery_description, valueQuery_description);
        list_addElement(localVarQueryParameters,keyPairQuery_description);
    }

    // query parameters
    char *keyQuery_new_name = NULL;
    char * valueQuery_new_name = NULL;
    keyValuePair_t *keyPairQuery_new_name = 0;
    if (new_name)
    {
        keyQuery_new_name = strdup("new_name");
        valueQuery_new_name = strdup((new_name));
        keyPairQuery_new_name = keyValuePair_create(keyQuery_new_name, valueQuery_new_name);
        list_addElement(localVarQueryParameters,keyPairQuery_new_name);
    }

    // query parameters
    char *keyQuery_is_private = NULL;
    char * valueQuery_is_private = NULL;
    keyValuePair_t *keyPairQuery_is_private = 0;
    if (is_private)
    {
        keyQuery_is_private = strdup("is_private");
        valueQuery_is_private = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_is_private, MAX_NUMBER_LENGTH, "%d", is_private);
        keyPairQuery_is_private = keyValuePair_create(keyQuery_is_private, valueQuery_is_private);
        list_addElement(localVarQueryParameters,keyPairQuery_is_private);
    }

    // query parameters
    char *keyQuery_is_announcement_only = NULL;
    char * valueQuery_is_announcement_only = NULL;
    keyValuePair_t *keyPairQuery_is_announcement_only = 0;
    if (is_announcement_only)
    {
        keyQuery_is_announcement_only = strdup("is_announcement_only");
        valueQuery_is_announcement_only = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_is_announcement_only, MAX_NUMBER_LENGTH, "%d", is_announcement_only);
        keyPairQuery_is_announcement_only = keyValuePair_create(keyQuery_is_announcement_only, valueQuery_is_announcement_only);
        list_addElement(localVarQueryParameters,keyPairQuery_is_announcement_only);
    }

    // query parameters
    char *keyQuery_stream_post_policy = NULL;
    char * valueQuery_stream_post_policy = NULL;
    keyValuePair_t *keyPairQuery_stream_post_policy = 0;
    if (stream_post_policy)
    {
        keyQuery_stream_post_policy = strdup("stream_post_policy");
        valueQuery_stream_post_policy = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_stream_post_policy, MAX_NUMBER_LENGTH, "%d", stream_post_policy);
        keyPairQuery_stream_post_policy = keyValuePair_create(keyQuery_stream_post_policy, valueQuery_stream_post_policy);
        list_addElement(localVarQueryParameters,keyPairQuery_stream_post_policy);
    }

    // query parameters
    char *keyQuery_history_public_to_subscribers = NULL;
    char * valueQuery_history_public_to_subscribers = NULL;
    keyValuePair_t *keyPairQuery_history_public_to_subscribers = 0;
    if (history_public_to_subscribers)
    {
        keyQuery_history_public_to_subscribers = strdup("history_public_to_subscribers");
        valueQuery_history_public_to_subscribers = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_history_public_to_subscribers, MAX_NUMBER_LENGTH, "%d", history_public_to_subscribers);
        keyPairQuery_history_public_to_subscribers = keyValuePair_create(keyQuery_history_public_to_subscribers, valueQuery_history_public_to_subscribers);
        list_addElement(localVarQueryParameters,keyPairQuery_history_public_to_subscribers);
    }

    // query parameters
    char *keyQuery_message_retention_days = NULL;
    one_ofstringinteger_t * valueQuery_message_retention_days ;
    keyValuePair_t *keyPairQuery_message_retention_days = 0;
    if (message_retention_days)
    {
        keyQuery_message_retention_days = strdup("message_retention_days");
        valueQuery_message_retention_days = (message_retention_days);
        keyPairQuery_message_retention_days = keyValuePair_create(keyQuery_message_retention_days, &valueQuery_message_retention_days);
        list_addElement(localVarQueryParameters,keyPairQuery_message_retention_days);
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
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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
    free(localVarToReplace_stream_id);
    if(keyQuery_description){
        free(keyQuery_description);
        keyQuery_description = NULL;
    }
    if(valueQuery_description){
        free(valueQuery_description);
        valueQuery_description = NULL;
    }
    if(keyPairQuery_description){
        keyValuePair_free(keyPairQuery_description);
        keyPairQuery_description = NULL;
    }
    if(keyQuery_new_name){
        free(keyQuery_new_name);
        keyQuery_new_name = NULL;
    }
    if(valueQuery_new_name){
        free(valueQuery_new_name);
        valueQuery_new_name = NULL;
    }
    if(keyPairQuery_new_name){
        keyValuePair_free(keyPairQuery_new_name);
        keyPairQuery_new_name = NULL;
    }
    if(keyQuery_is_private){
        free(keyQuery_is_private);
        keyQuery_is_private = NULL;
    }
    if(valueQuery_is_private){
        free(valueQuery_is_private);
        valueQuery_is_private = NULL;
    }
    if(keyPairQuery_is_private){
        keyValuePair_free(keyPairQuery_is_private);
        keyPairQuery_is_private = NULL;
    }
    if(keyQuery_is_announcement_only){
        free(keyQuery_is_announcement_only);
        keyQuery_is_announcement_only = NULL;
    }
    if(valueQuery_is_announcement_only){
        free(valueQuery_is_announcement_only);
        valueQuery_is_announcement_only = NULL;
    }
    if(keyPairQuery_is_announcement_only){
        keyValuePair_free(keyPairQuery_is_announcement_only);
        keyPairQuery_is_announcement_only = NULL;
    }
    if(keyQuery_stream_post_policy){
        free(keyQuery_stream_post_policy);
        keyQuery_stream_post_policy = NULL;
    }
    if(valueQuery_stream_post_policy){
        free(valueQuery_stream_post_policy);
        valueQuery_stream_post_policy = NULL;
    }
    if(keyPairQuery_stream_post_policy){
        keyValuePair_free(keyPairQuery_stream_post_policy);
        keyPairQuery_stream_post_policy = NULL;
    }
    if(keyQuery_history_public_to_subscribers){
        free(keyQuery_history_public_to_subscribers);
        keyQuery_history_public_to_subscribers = NULL;
    }
    if(valueQuery_history_public_to_subscribers){
        free(valueQuery_history_public_to_subscribers);
        valueQuery_history_public_to_subscribers = NULL;
    }
    if(keyPairQuery_history_public_to_subscribers){
        keyValuePair_free(keyPairQuery_history_public_to_subscribers);
        keyPairQuery_history_public_to_subscribers = NULL;
    }
    if(keyQuery_message_retention_days){
        free(keyQuery_message_retention_days);
        keyQuery_message_retention_days = NULL;
    }
    if(keyPairQuery_message_retention_days){
        keyValuePair_free(keyPairQuery_message_retention_days);
        keyPairQuery_message_retention_days = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update subscription settings
//
// This endpoint is used to update the user's personal settings for the streams they are subscribed to, including muting, color, pinning, and per-stream notification settings.  `POST {{ api_url }}/v1/users/me/subscriptions/properties` 
//
json_success_base_t*
StreamsAPI_updateSubscriptionSettings(apiClient_t *apiClient, list_t * subscription_data )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/subscriptions/properties")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/subscriptions/properties");




    // query parameters
    if (subscription_data)
    {
        list_addElement(localVarQueryParameters,subscription_data);
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
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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

// Update subscriptions
//
// Update which streams you are are subscribed to. 
//
json_success_base_t*
StreamsAPI_updateSubscriptions(apiClient_t *apiClient, list_t * _delete , list_t * add )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/subscriptions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/subscriptions");




    // query parameters
    if (_delete)
    {
        list_addElement(localVarQueryParameters,_delete);
    }

    // query parameters
    if (add)
    {
        list_addElement(localVarQueryParameters,add);
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
    cJSON *StreamsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(StreamsAPIlocalVarJSON);
    cJSON_Delete(StreamsAPIlocalVarJSON);
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

