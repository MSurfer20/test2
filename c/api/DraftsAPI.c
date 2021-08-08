#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "DraftsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Create drafts
//
// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
//
json_success_t*
DraftsAPI_createDrafts(apiClient_t *apiClient, list_t * drafts )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/drafts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/drafts");




    // query parameters
    if (drafts)
    {
        list_addElement(localVarQueryParameters,drafts);
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
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *DraftsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(DraftsAPIlocalVarJSON);
    cJSON_Delete(DraftsAPIlocalVarJSON);
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

// Delete a draft
//
// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
//
json_success_t*
DraftsAPI_deleteDraft(apiClient_t *apiClient, int draft_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/drafts/{draft_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/drafts/{draft_id}");


    // Path Params
    long sizeOfPathParams_draft_id =  + strlen("{ draft_id }");
    if(draft_id == 0){
        goto end;
    }
    char* localVarToReplace_draft_id = malloc(sizeOfPathParams_draft_id);
    snprintf(localVarToReplace_draft_id, sizeOfPathParams_draft_id, "{%s}", "draft_id");

    char localVarBuff_draft_id[256];
    intToStr(localVarBuff_draft_id, draft_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_draft_id, localVarBuff_draft_id);



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
    if (apiClient->response_code == 404) {
        printf("%s\n","Not Found.");
    }
    //nonprimitive not container
    cJSON *DraftsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(DraftsAPIlocalVarJSON);
    cJSON_Delete(DraftsAPIlocalVarJSON);
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
    free(localVarToReplace_draft_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Edit a draft
//
// Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
//
json_success_t*
DraftsAPI_editDraft(apiClient_t *apiClient, int draft_id , draft_t * draft )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/drafts/{draft_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/drafts/{draft_id}");


    // Path Params
    long sizeOfPathParams_draft_id =  + strlen("{ draft_id }");
    if(draft_id == 0){
        goto end;
    }
    char* localVarToReplace_draft_id = malloc(sizeOfPathParams_draft_id);
    snprintf(localVarToReplace_draft_id, sizeOfPathParams_draft_id, "{%s}", "draft_id");

    char localVarBuff_draft_id[256];
    intToStr(localVarBuff_draft_id, draft_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_draft_id, localVarBuff_draft_id);




    // query parameters
    char *keyQuery_draft = NULL;
    draft_t * valueQuery_draft ;
    keyValuePair_t *keyPairQuery_draft = 0;
    if (draft)
    {
        keyQuery_draft = strdup("draft");
        valueQuery_draft = (draft);
        keyPairQuery_draft = keyValuePair_create(keyQuery_draft, &valueQuery_draft);
        list_addElement(localVarQueryParameters,keyPairQuery_draft);
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
    if (apiClient->response_code == 404) {
        printf("%s\n","Not Found.");
    }
    //nonprimitive not container
    cJSON *DraftsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(DraftsAPIlocalVarJSON);
    cJSON_Delete(DraftsAPIlocalVarJSON);
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
    free(localVarToReplace_draft_id);
    if(keyQuery_draft){
        free(keyQuery_draft);
        keyQuery_draft = NULL;
    }
    if(keyPairQuery_draft){
        keyValuePair_free(keyPairQuery_draft);
        keyPairQuery_draft = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get drafts
//
// Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
//
json_success_t*
DraftsAPI_getDrafts(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/drafts")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/drafts");



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
    cJSON *DraftsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(DraftsAPIlocalVarJSON);
    cJSON_Delete(DraftsAPIlocalVarJSON);
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

