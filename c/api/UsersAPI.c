#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "UsersAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum OP for UsersAPI_setTypingStatus

static char* setTypingStatus_OP_ToString(zulip_rest_api_setTypingStatus_op_e OP){
    char *OPArray[] =  { "NULL", "start", "stop" };
    return OPArray[OP];
}

static zulip_rest_api_setTypingStatus_op_e setTypingStatus_OP_FromString(char* OP){
    int stringToReturn = 0;
    char *OPArray[] =  { "NULL", "start", "stop" };
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
// Function setTypingStatus_OP_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *setTypingStatus_OP_convertToJSON(zulip_rest_api_setTypingStatus_op_e OP) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "op", setTypingStatus_OP_ToString(OP)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function setTypingStatus_OP_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_setTypingStatus_op_e setTypingStatus_OP_parseFromJSON(cJSON* OPJSON) {
    zulip_rest_api_setTypingStatus_op_e OPVariable = 0;
    cJSON *OPVar = cJSON_GetObjectItemCaseSensitive(OPJSON, "op");
    if(!cJSON_IsString(OPVar) || (OPVar->valuestring == NULL))
    {
        goto end;
    }
    OPVariable = setTypingStatus_OP_FromString(OPVar->valuestring);
    return OPVariable;
end:
    return 0;
}
*/

// Functions for enum TYPE for UsersAPI_setTypingStatus

static char* setTypingStatus_TYPE_ToString(zulip_rest_api_setTypingStatus_type_e TYPE){
    char *TYPEArray[] =  { "NULL", "private", "stream" };
    return TYPEArray[TYPE];
}

static zulip_rest_api_setTypingStatus_type_e setTypingStatus_TYPE_FromString(char* TYPE){
    int stringToReturn = 0;
    char *TYPEArray[] =  { "NULL", "private", "stream" };
    size_t sizeofArray = sizeof(TYPEArray) / sizeof(TYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TYPE, TYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function setTypingStatus_TYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *setTypingStatus_TYPE_convertToJSON(zulip_rest_api_setTypingStatus_type_e TYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "type", setTypingStatus_TYPE_ToString(TYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function setTypingStatus_TYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_setTypingStatus_type_e setTypingStatus_TYPE_parseFromJSON(cJSON* TYPEJSON) {
    zulip_rest_api_setTypingStatus_type_e TYPEVariable = 0;
    cJSON *TYPEVar = cJSON_GetObjectItemCaseSensitive(TYPEJSON, "type");
    if(!cJSON_IsString(TYPEVar) || (TYPEVar->valuestring == NULL))
    {
        goto end;
    }
    TYPEVariable = setTypingStatus_TYPE_FromString(TYPEVar->valuestring);
    return TYPEVariable;
end:
    return 0;
}
*/

// Functions for enum COLORSCHEME for UsersAPI_updateSettings

static char* updateSettings_COLORSCHEME_ToString(zulip_rest_api_updateSettings_color_scheme_e COLORSCHEME){
    char *COLORSCHEMEArray[] =  { "NULL", "1", "2", "3" };
    return COLORSCHEMEArray[COLORSCHEME];
}

static zulip_rest_api_updateSettings_color_scheme_e updateSettings_COLORSCHEME_FromString(char* COLORSCHEME){
    int stringToReturn = 0;
    char *COLORSCHEMEArray[] =  { "NULL", "1", "2", "3" };
    size_t sizeofArray = sizeof(COLORSCHEMEArray) / sizeof(COLORSCHEMEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(COLORSCHEME, COLORSCHEMEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function updateSettings_COLORSCHEME_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *updateSettings_COLORSCHEME_convertToJSON(zulip_rest_api_updateSettings_color_scheme_e COLORSCHEME) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function updateSettings_COLORSCHEME_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_updateSettings_color_scheme_e updateSettings_COLORSCHEME_parseFromJSON(cJSON* COLORSCHEMEJSON) {
    zulip_rest_api_updateSettings_color_scheme_e COLORSCHEMEVariable = 0;
    return COLORSCHEMEVariable;
end:
    return 0;
}
*/

// Functions for enum DEMOTEINACTIVESTREAMS for UsersAPI_updateSettings

static char* updateSettings_DEMOTEINACTIVESTREAMS_ToString(zulip_rest_api_updateSettings_demote_inactive_streams_e DEMOTEINACTIVESTREAMS){
    char *DEMOTEINACTIVESTREAMSArray[] =  { "NULL", "1", "2", "3" };
    return DEMOTEINACTIVESTREAMSArray[DEMOTEINACTIVESTREAMS];
}

static zulip_rest_api_updateSettings_demote_inactive_streams_e updateSettings_DEMOTEINACTIVESTREAMS_FromString(char* DEMOTEINACTIVESTREAMS){
    int stringToReturn = 0;
    char *DEMOTEINACTIVESTREAMSArray[] =  { "NULL", "1", "2", "3" };
    size_t sizeofArray = sizeof(DEMOTEINACTIVESTREAMSArray) / sizeof(DEMOTEINACTIVESTREAMSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(DEMOTEINACTIVESTREAMS, DEMOTEINACTIVESTREAMSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function updateSettings_DEMOTEINACTIVESTREAMS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *updateSettings_DEMOTEINACTIVESTREAMS_convertToJSON(zulip_rest_api_updateSettings_demote_inactive_streams_e DEMOTEINACTIVESTREAMS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function updateSettings_DEMOTEINACTIVESTREAMS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_updateSettings_demote_inactive_streams_e updateSettings_DEMOTEINACTIVESTREAMS_parseFromJSON(cJSON* DEMOTEINACTIVESTREAMSJSON) {
    zulip_rest_api_updateSettings_demote_inactive_streams_e DEMOTEINACTIVESTREAMSVariable = 0;
    return DEMOTEINACTIVESTREAMSVariable;
end:
    return 0;
}
*/

// Functions for enum DESKTOPICONCOUNTDISPLAY for UsersAPI_updateSettings

static char* updateSettings_DESKTOPICONCOUNTDISPLAY_ToString(zulip_rest_api_updateSettings_desktop_icon_count_display_e DESKTOPICONCOUNTDISPLAY){
    char *DESKTOPICONCOUNTDISPLAYArray[] =  { "NULL", "1", "2", "3" };
    return DESKTOPICONCOUNTDISPLAYArray[DESKTOPICONCOUNTDISPLAY];
}

static zulip_rest_api_updateSettings_desktop_icon_count_display_e updateSettings_DESKTOPICONCOUNTDISPLAY_FromString(char* DESKTOPICONCOUNTDISPLAY){
    int stringToReturn = 0;
    char *DESKTOPICONCOUNTDISPLAYArray[] =  { "NULL", "1", "2", "3" };
    size_t sizeofArray = sizeof(DESKTOPICONCOUNTDISPLAYArray) / sizeof(DESKTOPICONCOUNTDISPLAYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(DESKTOPICONCOUNTDISPLAY, DESKTOPICONCOUNTDISPLAYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function updateSettings_DESKTOPICONCOUNTDISPLAY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *updateSettings_DESKTOPICONCOUNTDISPLAY_convertToJSON(zulip_rest_api_updateSettings_desktop_icon_count_display_e DESKTOPICONCOUNTDISPLAY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function updateSettings_DESKTOPICONCOUNTDISPLAY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_updateSettings_desktop_icon_count_display_e updateSettings_DESKTOPICONCOUNTDISPLAY_parseFromJSON(cJSON* DESKTOPICONCOUNTDISPLAYJSON) {
    zulip_rest_api_updateSettings_desktop_icon_count_display_e DESKTOPICONCOUNTDISPLAYVariable = 0;
    return DESKTOPICONCOUNTDISPLAYVariable;
end:
    return 0;
}
*/


// Create a user
//
// {!can-create-users-only.md!}  Create a new user account via the API.  `POST {{ api_url }}/v1/users` 
//
json_success_base_t*
UsersAPI_createUser(apiClient_t *apiClient, char * email , char * password , char * full_name )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users");




    // query parameters
    char *keyQuery_email = NULL;
    char * valueQuery_email = NULL;
    keyValuePair_t *keyPairQuery_email = 0;
    if (email)
    {
        keyQuery_email = strdup("email");
        valueQuery_email = strdup((email));
        keyPairQuery_email = keyValuePair_create(keyQuery_email, valueQuery_email);
        list_addElement(localVarQueryParameters,keyPairQuery_email);
    }

    // query parameters
    char *keyQuery_password = NULL;
    char * valueQuery_password = NULL;
    keyValuePair_t *keyPairQuery_password = 0;
    if (password)
    {
        keyQuery_password = strdup("password");
        valueQuery_password = strdup((password));
        keyPairQuery_password = keyValuePair_create(keyQuery_password, valueQuery_password);
        list_addElement(localVarQueryParameters,keyPairQuery_password);
    }

    // query parameters
    char *keyQuery_full_name = NULL;
    char * valueQuery_full_name = NULL;
    keyValuePair_t *keyPairQuery_full_name = 0;
    if (full_name)
    {
        keyQuery_full_name = strdup("full_name");
        valueQuery_full_name = strdup((full_name));
        keyPairQuery_full_name = keyValuePair_create(keyQuery_full_name, valueQuery_full_name);
        list_addElement(localVarQueryParameters,keyPairQuery_full_name);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    if(keyQuery_email){
        free(keyQuery_email);
        keyQuery_email = NULL;
    }
    if(valueQuery_email){
        free(valueQuery_email);
        valueQuery_email = NULL;
    }
    if(keyPairQuery_email){
        keyValuePair_free(keyPairQuery_email);
        keyPairQuery_email = NULL;
    }
    if(keyQuery_password){
        free(keyQuery_password);
        keyQuery_password = NULL;
    }
    if(valueQuery_password){
        free(valueQuery_password);
        valueQuery_password = NULL;
    }
    if(keyPairQuery_password){
        keyValuePair_free(keyPairQuery_password);
        keyPairQuery_password = NULL;
    }
    if(keyQuery_full_name){
        free(keyQuery_full_name);
        keyQuery_full_name = NULL;
    }
    if(valueQuery_full_name){
        free(valueQuery_full_name);
        valueQuery_full_name = NULL;
    }
    if(keyPairQuery_full_name){
        keyValuePair_free(keyPairQuery_full_name);
        keyPairQuery_full_name = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a user group
//
// Create a new [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/create` 
//
json_success_t*
UsersAPI_createUserGroup(apiClient_t *apiClient, char * name , char * description , list_t * members )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_groups/create")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_groups/create");




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
    if (members)
    {
        list_addElement(localVarQueryParameters,members);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Deactivate own user
//
// Deactivates the user's account.  See also the administrative endpoint for [deactivating another user](/api/deactivate-user).  `DELETE {{ api_url }}/v1/users/me`  This endpoint is primarily useful to Zulip clients providing a user settings UI. 
//
json_success_t*
UsersAPI_deactivateOwnUser(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me");



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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

// Deactivate a user
//
// [Deactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `DELETE {{ api_url }}/v1/users/{user_id}` 
//
json_success_t*
UsersAPI_deactivateUser(apiClient_t *apiClient, int user_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{user_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{user_id}");


    // Path Params
    long sizeOfPathParams_user_id =  + strlen("{ user_id }");
    if(user_id == 0){
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    snprintf(localVarToReplace_user_id, sizeOfPathParams_user_id, "{%s}", "user_id");

    char localVarBuff_user_id[256];
    intToStr(localVarBuff_user_id, user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, localVarBuff_user_id);



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
        printf("%s\n","Success");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request");
    }
    //nonprimitive not container
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get attachments
//
// Fetch metadata on files uploaded by the requesting user.  `GET {{ api_url }}/v1/attachments` 
//
json_success_base_t*
UsersAPI_getAttachments(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/attachments")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/attachments");



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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

// Get own user
//
// Get basic data about the user/bot that requests this endpoint.  `GET {{ api_url }}/v1/users/me` 
//
json_success_base_t*
UsersAPI_getOwnUser(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me");



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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

// Get a user
//
// Fetch details for a single user in the organization.  `GET {{ api_url }}/v1/users/{user_id}`  You can also fetch details on [all users in the organization](/api/get-users) or [by email](/api/get-user-by-email).  *This endpoint is new in Zulip Server 3.0 (feature level 1).* 
//
json_success_base_t*
UsersAPI_getUser(apiClient_t *apiClient, int user_id , int client_gravatar , int include_custom_profile_fields )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{user_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{user_id}");


    // Path Params
    long sizeOfPathParams_user_id =  + strlen("{ user_id }");
    if(user_id == 0){
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    snprintf(localVarToReplace_user_id, sizeOfPathParams_user_id, "{%s}", "user_id");

    char localVarBuff_user_id[256];
    intToStr(localVarBuff_user_id, user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, localVarBuff_user_id);




    // query parameters
    char *keyQuery_client_gravatar = NULL;
    char * valueQuery_client_gravatar = NULL;
    keyValuePair_t *keyPairQuery_client_gravatar = 0;
    if (client_gravatar)
    {
        keyQuery_client_gravatar = strdup("client_gravatar");
        valueQuery_client_gravatar = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_client_gravatar, MAX_NUMBER_LENGTH, "%d", client_gravatar);
        keyPairQuery_client_gravatar = keyValuePair_create(keyQuery_client_gravatar, valueQuery_client_gravatar);
        list_addElement(localVarQueryParameters,keyPairQuery_client_gravatar);
    }

    // query parameters
    char *keyQuery_include_custom_profile_fields = NULL;
    char * valueQuery_include_custom_profile_fields = NULL;
    keyValuePair_t *keyPairQuery_include_custom_profile_fields = 0;
    if (include_custom_profile_fields)
    {
        keyQuery_include_custom_profile_fields = strdup("include_custom_profile_fields");
        valueQuery_include_custom_profile_fields = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_custom_profile_fields, MAX_NUMBER_LENGTH, "%d", include_custom_profile_fields);
        keyPairQuery_include_custom_profile_fields = keyValuePair_create(keyQuery_include_custom_profile_fields, valueQuery_include_custom_profile_fields);
        list_addElement(localVarQueryParameters,keyPairQuery_include_custom_profile_fields);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_id);
    if(keyQuery_client_gravatar){
        free(keyQuery_client_gravatar);
        keyQuery_client_gravatar = NULL;
    }
    if(valueQuery_client_gravatar){
        free(valueQuery_client_gravatar);
        valueQuery_client_gravatar = NULL;
    }
    if(keyPairQuery_client_gravatar){
        keyValuePair_free(keyPairQuery_client_gravatar);
        keyPairQuery_client_gravatar = NULL;
    }
    if(keyQuery_include_custom_profile_fields){
        free(keyQuery_include_custom_profile_fields);
        keyQuery_include_custom_profile_fields = NULL;
    }
    if(valueQuery_include_custom_profile_fields){
        free(valueQuery_include_custom_profile_fields);
        valueQuery_include_custom_profile_fields = NULL;
    }
    if(keyPairQuery_include_custom_profile_fields){
        keyValuePair_free(keyPairQuery_include_custom_profile_fields);
        keyPairQuery_include_custom_profile_fields = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get a user by email
//
// Fetch details for a single user in the organization given a Zulip display email address.  `GET {{ api_url }}/v1/users/{email}`  Note that this endpoint uses Zulip display emails addresses for organizations that have configured limited [email address visibility](/help/restrict-visibility-of-email-addresses).  You can also fetch details on [all users in the organization](/api/get-users) or [by user ID](/api/get-user).  Fetching by user ID is generally recommended when possible, as users can [change their email address](/help/change-your-email-address).  *This endpoint is new in Zulip Server 4.0 (feature level 39).* 
//
json_success_base_t*
UsersAPI_getUserByEmail(apiClient_t *apiClient, char * email , int client_gravatar , int include_custom_profile_fields )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{email}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{email}");


    // Path Params
    long sizeOfPathParams_email = strlen(email)+3 + strlen("{ email }");
    if(email == NULL) {
        goto end;
    }
    char* localVarToReplace_email = malloc(sizeOfPathParams_email);
    sprintf(localVarToReplace_email, "{%s}", "email");

    localVarPath = strReplace(localVarPath, localVarToReplace_email, email);



    // query parameters
    char *keyQuery_client_gravatar = NULL;
    char * valueQuery_client_gravatar = NULL;
    keyValuePair_t *keyPairQuery_client_gravatar = 0;
    if (client_gravatar)
    {
        keyQuery_client_gravatar = strdup("client_gravatar");
        valueQuery_client_gravatar = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_client_gravatar, MAX_NUMBER_LENGTH, "%d", client_gravatar);
        keyPairQuery_client_gravatar = keyValuePair_create(keyQuery_client_gravatar, valueQuery_client_gravatar);
        list_addElement(localVarQueryParameters,keyPairQuery_client_gravatar);
    }

    // query parameters
    char *keyQuery_include_custom_profile_fields = NULL;
    char * valueQuery_include_custom_profile_fields = NULL;
    keyValuePair_t *keyPairQuery_include_custom_profile_fields = 0;
    if (include_custom_profile_fields)
    {
        keyQuery_include_custom_profile_fields = strdup("include_custom_profile_fields");
        valueQuery_include_custom_profile_fields = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_custom_profile_fields, MAX_NUMBER_LENGTH, "%d", include_custom_profile_fields);
        keyPairQuery_include_custom_profile_fields = keyValuePair_create(keyQuery_include_custom_profile_fields, valueQuery_include_custom_profile_fields);
        list_addElement(localVarQueryParameters,keyPairQuery_include_custom_profile_fields);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_email);
    if(keyQuery_client_gravatar){
        free(keyQuery_client_gravatar);
        keyQuery_client_gravatar = NULL;
    }
    if(valueQuery_client_gravatar){
        free(valueQuery_client_gravatar);
        valueQuery_client_gravatar = NULL;
    }
    if(keyPairQuery_client_gravatar){
        keyValuePair_free(keyPairQuery_client_gravatar);
        keyPairQuery_client_gravatar = NULL;
    }
    if(keyQuery_include_custom_profile_fields){
        free(keyQuery_include_custom_profile_fields);
        keyQuery_include_custom_profile_fields = NULL;
    }
    if(valueQuery_include_custom_profile_fields){
        free(valueQuery_include_custom_profile_fields);
        valueQuery_include_custom_profile_fields = NULL;
    }
    if(keyPairQuery_include_custom_profile_fields){
        keyValuePair_free(keyPairQuery_include_custom_profile_fields);
        keyPairQuery_include_custom_profile_fields = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get user groups
//
// {!api-members-only.md!}  Fetches all of the user groups in the organization.  `GET {{ api_url }}/v1/user_groups` 
//
json_success_base_t*
UsersAPI_getUserGroups(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_groups")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_groups");



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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

// Get user presence
//
// Get the presence status for a specific user.  This endpoint is most useful for embedding data about a user's presence status in other sites (E.g. an employee directory).  Full Zulip clients like mobile/desktop apps will want to use the main presence endpoint, which returns data for all active users in the organization, instead.  `GET {{ api_url }}/v1/users/{user_id_or_email}/presence`  See [Zulip's developer documentation](https://zulip.readthedocs.io/en/latest/subsystems/presence.html) for details on the data model for presence in Zulip. 
//
json_success_base_t*
UsersAPI_getUserPresence(apiClient_t *apiClient, char * user_id_or_email )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{user_id_or_email}/presence")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{user_id_or_email}/presence");


    // Path Params
    long sizeOfPathParams_user_id_or_email = strlen(user_id_or_email)+3 + strlen("{ user_id_or_email }");
    if(user_id_or_email == NULL) {
        goto end;
    }
    char* localVarToReplace_user_id_or_email = malloc(sizeOfPathParams_user_id_or_email);
    sprintf(localVarToReplace_user_id_or_email, "{%s}", "user_id_or_email");

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id_or_email, user_id_or_email);


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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_id_or_email);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get all users
//
// Retrieve details on all users in the organization.  Optionally includes values of [custom profile field](/help/add-custom-profile-fields).  `GET {{ api_url }}/v1/users`  You can also [fetch details on a single user](/api/get-user). 
//
json_success_base_t*
UsersAPI_getUsers(apiClient_t *apiClient, int client_gravatar , int include_custom_profile_fields )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users");




    // query parameters
    char *keyQuery_client_gravatar = NULL;
    char * valueQuery_client_gravatar = NULL;
    keyValuePair_t *keyPairQuery_client_gravatar = 0;
    if (client_gravatar)
    {
        keyQuery_client_gravatar = strdup("client_gravatar");
        valueQuery_client_gravatar = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_client_gravatar, MAX_NUMBER_LENGTH, "%d", client_gravatar);
        keyPairQuery_client_gravatar = keyValuePair_create(keyQuery_client_gravatar, valueQuery_client_gravatar);
        list_addElement(localVarQueryParameters,keyPairQuery_client_gravatar);
    }

    // query parameters
    char *keyQuery_include_custom_profile_fields = NULL;
    char * valueQuery_include_custom_profile_fields = NULL;
    keyValuePair_t *keyPairQuery_include_custom_profile_fields = 0;
    if (include_custom_profile_fields)
    {
        keyQuery_include_custom_profile_fields = strdup("include_custom_profile_fields");
        valueQuery_include_custom_profile_fields = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_include_custom_profile_fields, MAX_NUMBER_LENGTH, "%d", include_custom_profile_fields);
        keyPairQuery_include_custom_profile_fields = keyValuePair_create(keyQuery_include_custom_profile_fields, valueQuery_include_custom_profile_fields);
        list_addElement(localVarQueryParameters,keyPairQuery_include_custom_profile_fields);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    if(keyQuery_client_gravatar){
        free(keyQuery_client_gravatar);
        keyQuery_client_gravatar = NULL;
    }
    if(valueQuery_client_gravatar){
        free(valueQuery_client_gravatar);
        valueQuery_client_gravatar = NULL;
    }
    if(keyPairQuery_client_gravatar){
        keyValuePair_free(keyPairQuery_client_gravatar);
        keyPairQuery_client_gravatar = NULL;
    }
    if(keyQuery_include_custom_profile_fields){
        free(keyQuery_include_custom_profile_fields);
        keyQuery_include_custom_profile_fields = NULL;
    }
    if(valueQuery_include_custom_profile_fields){
        free(valueQuery_include_custom_profile_fields);
        valueQuery_include_custom_profile_fields = NULL;
    }
    if(keyPairQuery_include_custom_profile_fields){
        keyValuePair_free(keyPairQuery_include_custom_profile_fields);
        keyPairQuery_include_custom_profile_fields = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Mute a user
//
// This endpoint [mutes a user](/help/mute-a-user).  Messages sent by users you've muted will be automatically marked as read and hidden.  `POST {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  Muted users should be implemented by clients as follows:  * The server will immediately mark all messages sent by the muted   user as read.  This will automatically clear any existing mobile   push notifications related to the muted user. * The server will mark any new messages sent by the muted user as read   for your account, which prevents all email and mobile push notifications. * Clients should exclude muted users from presence lists or other UI   for viewing or composing 1:1 private messages. 1:1 private messages sent by   muted users should be hidden everywhere in the Zulip UI. * Stream messages and group private messages sent by the muted   user should avoid displaying the content and name/avatar,   but should display that N messages by a muted user were   hidden (so that it is possible to interpret the messages by   other users who are talking with the muted user). * Group private message conversations including the muted user   should display muted users as \"Muted user\", rather than   showing their name, in lists of such conversations, along with using   a blank grey avatar where avatars are displayed. * Administrative/settings UI elements for showing \"All users that exist   on this stream or realm\", e.g. for organization   administration or showing stream subscribers, should display   the user's name as normal.  **Changes**: New in Zulip 4.0 (feature level 48). 
//
json_success_t*
UsersAPI_muteUser(apiClient_t *apiClient, int muted_user_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/muted_users/{muted_user_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/muted_users/{muted_user_id}");


    // Path Params
    long sizeOfPathParams_muted_user_id =  + strlen("{ muted_user_id }");
    if(muted_user_id == 0){
        goto end;
    }
    char* localVarToReplace_muted_user_id = malloc(sizeOfPathParams_muted_user_id);
    snprintf(localVarToReplace_muted_user_id, sizeOfPathParams_muted_user_id, "{%s}", "muted_user_id");

    char localVarBuff_muted_user_id[256];
    intToStr(localVarBuff_muted_user_id, muted_user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_muted_user_id, localVarBuff_muted_user_id);



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_muted_user_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Reactivate a user
//
// [Reactivates a user](https://zulip.com/help/deactivate-or-reactivate-a-user) given their user ID.  `POST {{ api_url }}/v1/users/{user_id}/reactivate` 
//
any_type_t*
UsersAPI_reactivateUser(apiClient_t *apiClient, int user_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{user_id}/reactivate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{user_id}/reactivate");


    // Path Params
    long sizeOfPathParams_user_id =  + strlen("{ user_id }");
    if(user_id == 0){
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    snprintf(localVarToReplace_user_id, sizeOfPathParams_user_id, "{%s}", "user_id");

    char localVarBuff_user_id[256];
    intToStr(localVarBuff_user_id, user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, localVarBuff_user_id);



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
        printf("%s\n","Success");
    }
    //nonprimitive not container
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    any_type_t *elementToReturn = any_type_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a user group
//
// Delete a [user group](/help/user-groups).  `DELETE {{ api_url }}/v1/user_groups/{user_group_id}` 
//
json_success_t*
UsersAPI_removeUserGroup(apiClient_t *apiClient, int user_group_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_groups/{user_group_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_groups/{user_group_id}");


    // Path Params
    long sizeOfPathParams_user_group_id =  + strlen("{ user_group_id }");
    if(user_group_id == 0){
        goto end;
    }
    char* localVarToReplace_user_group_id = malloc(sizeOfPathParams_user_group_id);
    snprintf(localVarToReplace_user_group_id, sizeOfPathParams_user_group_id, "{%s}", "user_group_id");

    char localVarBuff_user_group_id[256];
    intToStr(localVarBuff_user_group_id, user_group_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_group_id, localVarBuff_user_group_id);



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_group_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Set \"typing\" status
//
// Notify other users whether the current user is typing a message.  `POST {{ api_url }}/v1/typing`  Clients implementing Zulip's typing notifications protocol should work as follows:  * Send a request to this endpoint with `op=\"start\"` when a user starts typing a message,   and also every `TYPING_STARTED_WAIT_PERIOD=10` seconds that the user continues to   actively type or otherwise interact with the compose UI (E.g. interacting with the   compose box emoji picker). * Send a request to this endpoint with `op=\"stop\"` when a user pauses using the   compose UI for at least `TYPING_STOPPED_WAIT_PERIOD=5` seconds or cancels   the compose action (if it had previously sent a \"start\" operation for that   compose action). * Start displaying \"Sender is typing\" for a given conversation when the client   receives an `op=\"start\"` event from the [events API](/api/get-events). * Continue displaying \"Sender is typing\" until they receive an `op=\"stop\"` event   from the [events API](/api/get-events) or `TYPING_STARTED_EXPIRY_PERIOD=15`   seconds have passed without a new `op=\"start\"` event for that conversation. * Clients that support displaying stream typing notifications (new in Zulip 4.0)   should indicate they support processing stream typing events via the   `stream_typing_notifications` in the `client_capabilities` parameter to `/register`.  This protocol is designed to allow the server-side typing notifications implementation to be stateless while being resilient; network failures cannot result in a user being incorrectly displayed as perpetually typing.  See [the typing notification docs](https://zulip.readthedocs.io/en/latest/subsystems/typing-indicators.html) for additional design details on Zulip's typing notifications protocol. 
//
json_success_t*
UsersAPI_setTypingStatus(apiClient_t *apiClient, zulip_rest_api_setTypingStatus_op_e op , list_t * to , zulip_rest_api_setTypingStatus_type_e type , char * topic )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/typing")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/typing");




    // query parameters
    char *keyQuery_type = NULL;
    zulip_rest_api_setTypingStatus_type_e valueQuery_type ;
    keyValuePair_t *keyPairQuery_type = 0;
    if (type)
    {
        keyQuery_type = strdup("type");
        valueQuery_type = (type);
        keyPairQuery_type = keyValuePair_create(keyQuery_type, (void *)strdup(setTypingStatus_TYPE_ToString(
		valueQuery_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_type);
    }

    // query parameters
    char *keyQuery_op = NULL;
    zulip_rest_api_setTypingStatus_op_e valueQuery_op ;
    keyValuePair_t *keyPairQuery_op = 0;
    if (op)
    {
        keyQuery_op = strdup("op");
        valueQuery_op = (op);
        keyPairQuery_op = keyValuePair_create(keyQuery_op, (void *)strdup(setTypingStatus_OP_ToString(
		valueQuery_op)));
        list_addElement(localVarQueryParameters,keyPairQuery_op);
    }

    // query parameters
    if (to)
    {
        list_addElement(localVarQueryParameters,to);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    if(keyQuery_type){
        free(keyQuery_type);
        keyQuery_type = NULL;
    }
    if(keyPairQuery_type){
        keyValuePair_free(keyPairQuery_type);
        keyPairQuery_type = NULL;
    }
    if(keyQuery_op){
        free(keyQuery_op);
        keyQuery_op = NULL;
    }
    if(keyPairQuery_op){
        keyValuePair_free(keyPairQuery_op);
        keyPairQuery_op = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Unmute a user
//
// This endpoint unmutes a user.  `DELETE {{ api_url }}/v1/users/me/muted_users/{muted_user_id}`  **Changes**: New in Zulip 4.0 (feature level 48). 
//
json_success_t*
UsersAPI_unmuteUser(apiClient_t *apiClient, int muted_user_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/muted_users/{muted_user_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/muted_users/{muted_user_id}");


    // Path Params
    long sizeOfPathParams_muted_user_id =  + strlen("{ muted_user_id }");
    if(muted_user_id == 0){
        goto end;
    }
    char* localVarToReplace_muted_user_id = malloc(sizeOfPathParams_muted_user_id);
    snprintf(localVarToReplace_muted_user_id, sizeOfPathParams_muted_user_id, "{%s}", "muted_user_id");

    char localVarBuff_muted_user_id[256];
    intToStr(localVarBuff_muted_user_id, muted_user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_muted_user_id, localVarBuff_muted_user_id);



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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_muted_user_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update settings
//
// This endpoint is used to edit the current user's settings.  `PATCH {{ api_url }}/v1/settings`  **Changes**: Prior to Zulip 5.0 (feature level 80), this endpoint only supported the `full_name`, `email`, `old_password`, and `new_password` parameters. Notification settings were managed by `PATCH /settings/notifications`, and all other settings by `PATCH /settings/display`. The feature level 80 migration to merge these endpoints did not change how request parameters are encoded. Note, however, that it did change the handling of any invalid parameters present in a request to change notification or display settings, since the merged endpoint uses the new response format that was introduced for `/settings` in Zulip 5.0 (feature level 78).  The `/settings/display` and `/settings/notifications` endpoints are now deprecated aliases for this endpoint for backwards-compatibility, and will be removed once clients have migrated to use this endpoint. 
//
json_success_base_t*
UsersAPI_updateSettings(apiClient_t *apiClient, char * full_name , char * email , char * old_password , char * new_password , int twenty_four_hour_time , int dense_mode , int starred_message_counts , int fluid_layout_width , int high_contrast_mode , int color_scheme , int enable_drafts_synchronization , int translate_emoticons , char * default_language , char * default_view , int left_side_userlist , char * emojiset , int demote_inactive_streams , char * timezone , int enable_stream_desktop_notifications , int enable_stream_email_notifications , int enable_stream_push_notifications , int enable_stream_audible_notifications , char * notification_sound , int enable_desktop_notifications , int enable_sounds , int email_notifications_batching_period_seconds , int enable_offline_email_notifications , int enable_offline_push_notifications , int enable_online_push_notifications , int enable_digest_emails , int enable_marketing_emails , int enable_login_emails , int message_content_in_email_notifications , int pm_content_in_desktop_notifications , int wildcard_mentions_notify , int desktop_icon_count_display , int realm_name_in_notifications , int presence_enabled , int enter_sends )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/settings")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/settings");




    // query parameters
    char *keyQuery_full_name = NULL;
    char * valueQuery_full_name = NULL;
    keyValuePair_t *keyPairQuery_full_name = 0;
    if (full_name)
    {
        keyQuery_full_name = strdup("full_name");
        valueQuery_full_name = strdup((full_name));
        keyPairQuery_full_name = keyValuePair_create(keyQuery_full_name, valueQuery_full_name);
        list_addElement(localVarQueryParameters,keyPairQuery_full_name);
    }

    // query parameters
    char *keyQuery_email = NULL;
    char * valueQuery_email = NULL;
    keyValuePair_t *keyPairQuery_email = 0;
    if (email)
    {
        keyQuery_email = strdup("email");
        valueQuery_email = strdup((email));
        keyPairQuery_email = keyValuePair_create(keyQuery_email, valueQuery_email);
        list_addElement(localVarQueryParameters,keyPairQuery_email);
    }

    // query parameters
    char *keyQuery_old_password = NULL;
    char * valueQuery_old_password = NULL;
    keyValuePair_t *keyPairQuery_old_password = 0;
    if (old_password)
    {
        keyQuery_old_password = strdup("old_password");
        valueQuery_old_password = strdup((old_password));
        keyPairQuery_old_password = keyValuePair_create(keyQuery_old_password, valueQuery_old_password);
        list_addElement(localVarQueryParameters,keyPairQuery_old_password);
    }

    // query parameters
    char *keyQuery_new_password = NULL;
    char * valueQuery_new_password = NULL;
    keyValuePair_t *keyPairQuery_new_password = 0;
    if (new_password)
    {
        keyQuery_new_password = strdup("new_password");
        valueQuery_new_password = strdup((new_password));
        keyPairQuery_new_password = keyValuePair_create(keyQuery_new_password, valueQuery_new_password);
        list_addElement(localVarQueryParameters,keyPairQuery_new_password);
    }

    // query parameters
    char *keyQuery_twenty_four_hour_time = NULL;
    char * valueQuery_twenty_four_hour_time = NULL;
    keyValuePair_t *keyPairQuery_twenty_four_hour_time = 0;
    if (twenty_four_hour_time)
    {
        keyQuery_twenty_four_hour_time = strdup("twenty_four_hour_time");
        valueQuery_twenty_four_hour_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_twenty_four_hour_time, MAX_NUMBER_LENGTH, "%d", twenty_four_hour_time);
        keyPairQuery_twenty_four_hour_time = keyValuePair_create(keyQuery_twenty_four_hour_time, valueQuery_twenty_four_hour_time);
        list_addElement(localVarQueryParameters,keyPairQuery_twenty_four_hour_time);
    }

    // query parameters
    char *keyQuery_dense_mode = NULL;
    char * valueQuery_dense_mode = NULL;
    keyValuePair_t *keyPairQuery_dense_mode = 0;
    if (dense_mode)
    {
        keyQuery_dense_mode = strdup("dense_mode");
        valueQuery_dense_mode = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_dense_mode, MAX_NUMBER_LENGTH, "%d", dense_mode);
        keyPairQuery_dense_mode = keyValuePair_create(keyQuery_dense_mode, valueQuery_dense_mode);
        list_addElement(localVarQueryParameters,keyPairQuery_dense_mode);
    }

    // query parameters
    char *keyQuery_starred_message_counts = NULL;
    char * valueQuery_starred_message_counts = NULL;
    keyValuePair_t *keyPairQuery_starred_message_counts = 0;
    if (starred_message_counts)
    {
        keyQuery_starred_message_counts = strdup("starred_message_counts");
        valueQuery_starred_message_counts = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_starred_message_counts, MAX_NUMBER_LENGTH, "%d", starred_message_counts);
        keyPairQuery_starred_message_counts = keyValuePair_create(keyQuery_starred_message_counts, valueQuery_starred_message_counts);
        list_addElement(localVarQueryParameters,keyPairQuery_starred_message_counts);
    }

    // query parameters
    char *keyQuery_fluid_layout_width = NULL;
    char * valueQuery_fluid_layout_width = NULL;
    keyValuePair_t *keyPairQuery_fluid_layout_width = 0;
    if (fluid_layout_width)
    {
        keyQuery_fluid_layout_width = strdup("fluid_layout_width");
        valueQuery_fluid_layout_width = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_fluid_layout_width, MAX_NUMBER_LENGTH, "%d", fluid_layout_width);
        keyPairQuery_fluid_layout_width = keyValuePair_create(keyQuery_fluid_layout_width, valueQuery_fluid_layout_width);
        list_addElement(localVarQueryParameters,keyPairQuery_fluid_layout_width);
    }

    // query parameters
    char *keyQuery_high_contrast_mode = NULL;
    char * valueQuery_high_contrast_mode = NULL;
    keyValuePair_t *keyPairQuery_high_contrast_mode = 0;
    if (high_contrast_mode)
    {
        keyQuery_high_contrast_mode = strdup("high_contrast_mode");
        valueQuery_high_contrast_mode = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_high_contrast_mode, MAX_NUMBER_LENGTH, "%d", high_contrast_mode);
        keyPairQuery_high_contrast_mode = keyValuePair_create(keyQuery_high_contrast_mode, valueQuery_high_contrast_mode);
        list_addElement(localVarQueryParameters,keyPairQuery_high_contrast_mode);
    }

    // query parameters
    char *keyQuery_color_scheme = NULL;
    char * valueQuery_color_scheme = NULL;
    keyValuePair_t *keyPairQuery_color_scheme = 0;
    if (color_scheme)
    {
        keyQuery_color_scheme = strdup("color_scheme");
        valueQuery_color_scheme = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_color_scheme, MAX_NUMBER_LENGTH, "%d", color_scheme);
        keyPairQuery_color_scheme = keyValuePair_create(keyQuery_color_scheme, (void *)strdup(updateSettings_COLORSCHEME_ToString(
		valueQuery_color_scheme)));
        list_addElement(localVarQueryParameters,keyPairQuery_color_scheme);
    }

    // query parameters
    char *keyQuery_enable_drafts_synchronization = NULL;
    char * valueQuery_enable_drafts_synchronization = NULL;
    keyValuePair_t *keyPairQuery_enable_drafts_synchronization = 0;
    if (enable_drafts_synchronization)
    {
        keyQuery_enable_drafts_synchronization = strdup("enable_drafts_synchronization");
        valueQuery_enable_drafts_synchronization = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_drafts_synchronization, MAX_NUMBER_LENGTH, "%d", enable_drafts_synchronization);
        keyPairQuery_enable_drafts_synchronization = keyValuePair_create(keyQuery_enable_drafts_synchronization, valueQuery_enable_drafts_synchronization);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_drafts_synchronization);
    }

    // query parameters
    char *keyQuery_translate_emoticons = NULL;
    char * valueQuery_translate_emoticons = NULL;
    keyValuePair_t *keyPairQuery_translate_emoticons = 0;
    if (translate_emoticons)
    {
        keyQuery_translate_emoticons = strdup("translate_emoticons");
        valueQuery_translate_emoticons = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_translate_emoticons, MAX_NUMBER_LENGTH, "%d", translate_emoticons);
        keyPairQuery_translate_emoticons = keyValuePair_create(keyQuery_translate_emoticons, valueQuery_translate_emoticons);
        list_addElement(localVarQueryParameters,keyPairQuery_translate_emoticons);
    }

    // query parameters
    char *keyQuery_default_language = NULL;
    char * valueQuery_default_language = NULL;
    keyValuePair_t *keyPairQuery_default_language = 0;
    if (default_language)
    {
        keyQuery_default_language = strdup("default_language");
        valueQuery_default_language = strdup((default_language));
        keyPairQuery_default_language = keyValuePair_create(keyQuery_default_language, valueQuery_default_language);
        list_addElement(localVarQueryParameters,keyPairQuery_default_language);
    }

    // query parameters
    char *keyQuery_default_view = NULL;
    char * valueQuery_default_view = NULL;
    keyValuePair_t *keyPairQuery_default_view = 0;
    if (default_view)
    {
        keyQuery_default_view = strdup("default_view");
        valueQuery_default_view = strdup((default_view));
        keyPairQuery_default_view = keyValuePair_create(keyQuery_default_view, valueQuery_default_view);
        list_addElement(localVarQueryParameters,keyPairQuery_default_view);
    }

    // query parameters
    char *keyQuery_left_side_userlist = NULL;
    char * valueQuery_left_side_userlist = NULL;
    keyValuePair_t *keyPairQuery_left_side_userlist = 0;
    if (left_side_userlist)
    {
        keyQuery_left_side_userlist = strdup("left_side_userlist");
        valueQuery_left_side_userlist = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_left_side_userlist, MAX_NUMBER_LENGTH, "%d", left_side_userlist);
        keyPairQuery_left_side_userlist = keyValuePair_create(keyQuery_left_side_userlist, valueQuery_left_side_userlist);
        list_addElement(localVarQueryParameters,keyPairQuery_left_side_userlist);
    }

    // query parameters
    char *keyQuery_emojiset = NULL;
    char * valueQuery_emojiset = NULL;
    keyValuePair_t *keyPairQuery_emojiset = 0;
    if (emojiset)
    {
        keyQuery_emojiset = strdup("emojiset");
        valueQuery_emojiset = strdup((emojiset));
        keyPairQuery_emojiset = keyValuePair_create(keyQuery_emojiset, valueQuery_emojiset);
        list_addElement(localVarQueryParameters,keyPairQuery_emojiset);
    }

    // query parameters
    char *keyQuery_demote_inactive_streams = NULL;
    char * valueQuery_demote_inactive_streams = NULL;
    keyValuePair_t *keyPairQuery_demote_inactive_streams = 0;
    if (demote_inactive_streams)
    {
        keyQuery_demote_inactive_streams = strdup("demote_inactive_streams");
        valueQuery_demote_inactive_streams = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_demote_inactive_streams, MAX_NUMBER_LENGTH, "%d", demote_inactive_streams);
        keyPairQuery_demote_inactive_streams = keyValuePair_create(keyQuery_demote_inactive_streams, (void *)strdup(updateSettings_DEMOTEINACTIVESTREAMS_ToString(
		valueQuery_demote_inactive_streams)));
        list_addElement(localVarQueryParameters,keyPairQuery_demote_inactive_streams);
    }

    // query parameters
    char *keyQuery_timezone = NULL;
    char * valueQuery_timezone = NULL;
    keyValuePair_t *keyPairQuery_timezone = 0;
    if (timezone)
    {
        keyQuery_timezone = strdup("timezone");
        valueQuery_timezone = strdup((timezone));
        keyPairQuery_timezone = keyValuePair_create(keyQuery_timezone, valueQuery_timezone);
        list_addElement(localVarQueryParameters,keyPairQuery_timezone);
    }

    // query parameters
    char *keyQuery_enable_stream_desktop_notifications = NULL;
    char * valueQuery_enable_stream_desktop_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_stream_desktop_notifications = 0;
    if (enable_stream_desktop_notifications)
    {
        keyQuery_enable_stream_desktop_notifications = strdup("enable_stream_desktop_notifications");
        valueQuery_enable_stream_desktop_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_stream_desktop_notifications, MAX_NUMBER_LENGTH, "%d", enable_stream_desktop_notifications);
        keyPairQuery_enable_stream_desktop_notifications = keyValuePair_create(keyQuery_enable_stream_desktop_notifications, valueQuery_enable_stream_desktop_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_stream_desktop_notifications);
    }

    // query parameters
    char *keyQuery_enable_stream_email_notifications = NULL;
    char * valueQuery_enable_stream_email_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_stream_email_notifications = 0;
    if (enable_stream_email_notifications)
    {
        keyQuery_enable_stream_email_notifications = strdup("enable_stream_email_notifications");
        valueQuery_enable_stream_email_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_stream_email_notifications, MAX_NUMBER_LENGTH, "%d", enable_stream_email_notifications);
        keyPairQuery_enable_stream_email_notifications = keyValuePair_create(keyQuery_enable_stream_email_notifications, valueQuery_enable_stream_email_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_stream_email_notifications);
    }

    // query parameters
    char *keyQuery_enable_stream_push_notifications = NULL;
    char * valueQuery_enable_stream_push_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_stream_push_notifications = 0;
    if (enable_stream_push_notifications)
    {
        keyQuery_enable_stream_push_notifications = strdup("enable_stream_push_notifications");
        valueQuery_enable_stream_push_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_stream_push_notifications, MAX_NUMBER_LENGTH, "%d", enable_stream_push_notifications);
        keyPairQuery_enable_stream_push_notifications = keyValuePair_create(keyQuery_enable_stream_push_notifications, valueQuery_enable_stream_push_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_stream_push_notifications);
    }

    // query parameters
    char *keyQuery_enable_stream_audible_notifications = NULL;
    char * valueQuery_enable_stream_audible_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_stream_audible_notifications = 0;
    if (enable_stream_audible_notifications)
    {
        keyQuery_enable_stream_audible_notifications = strdup("enable_stream_audible_notifications");
        valueQuery_enable_stream_audible_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_stream_audible_notifications, MAX_NUMBER_LENGTH, "%d", enable_stream_audible_notifications);
        keyPairQuery_enable_stream_audible_notifications = keyValuePair_create(keyQuery_enable_stream_audible_notifications, valueQuery_enable_stream_audible_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_stream_audible_notifications);
    }

    // query parameters
    char *keyQuery_notification_sound = NULL;
    char * valueQuery_notification_sound = NULL;
    keyValuePair_t *keyPairQuery_notification_sound = 0;
    if (notification_sound)
    {
        keyQuery_notification_sound = strdup("notification_sound");
        valueQuery_notification_sound = strdup((notification_sound));
        keyPairQuery_notification_sound = keyValuePair_create(keyQuery_notification_sound, valueQuery_notification_sound);
        list_addElement(localVarQueryParameters,keyPairQuery_notification_sound);
    }

    // query parameters
    char *keyQuery_enable_desktop_notifications = NULL;
    char * valueQuery_enable_desktop_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_desktop_notifications = 0;
    if (enable_desktop_notifications)
    {
        keyQuery_enable_desktop_notifications = strdup("enable_desktop_notifications");
        valueQuery_enable_desktop_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_desktop_notifications, MAX_NUMBER_LENGTH, "%d", enable_desktop_notifications);
        keyPairQuery_enable_desktop_notifications = keyValuePair_create(keyQuery_enable_desktop_notifications, valueQuery_enable_desktop_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_desktop_notifications);
    }

    // query parameters
    char *keyQuery_enable_sounds = NULL;
    char * valueQuery_enable_sounds = NULL;
    keyValuePair_t *keyPairQuery_enable_sounds = 0;
    if (enable_sounds)
    {
        keyQuery_enable_sounds = strdup("enable_sounds");
        valueQuery_enable_sounds = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_sounds, MAX_NUMBER_LENGTH, "%d", enable_sounds);
        keyPairQuery_enable_sounds = keyValuePair_create(keyQuery_enable_sounds, valueQuery_enable_sounds);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_sounds);
    }

    // query parameters
    char *keyQuery_email_notifications_batching_period_seconds = NULL;
    char * valueQuery_email_notifications_batching_period_seconds = NULL;
    keyValuePair_t *keyPairQuery_email_notifications_batching_period_seconds = 0;
    if (email_notifications_batching_period_seconds)
    {
        keyQuery_email_notifications_batching_period_seconds = strdup("email_notifications_batching_period_seconds");
        valueQuery_email_notifications_batching_period_seconds = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_email_notifications_batching_period_seconds, MAX_NUMBER_LENGTH, "%d", email_notifications_batching_period_seconds);
        keyPairQuery_email_notifications_batching_period_seconds = keyValuePair_create(keyQuery_email_notifications_batching_period_seconds, valueQuery_email_notifications_batching_period_seconds);
        list_addElement(localVarQueryParameters,keyPairQuery_email_notifications_batching_period_seconds);
    }

    // query parameters
    char *keyQuery_enable_offline_email_notifications = NULL;
    char * valueQuery_enable_offline_email_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_offline_email_notifications = 0;
    if (enable_offline_email_notifications)
    {
        keyQuery_enable_offline_email_notifications = strdup("enable_offline_email_notifications");
        valueQuery_enable_offline_email_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_offline_email_notifications, MAX_NUMBER_LENGTH, "%d", enable_offline_email_notifications);
        keyPairQuery_enable_offline_email_notifications = keyValuePair_create(keyQuery_enable_offline_email_notifications, valueQuery_enable_offline_email_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_offline_email_notifications);
    }

    // query parameters
    char *keyQuery_enable_offline_push_notifications = NULL;
    char * valueQuery_enable_offline_push_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_offline_push_notifications = 0;
    if (enable_offline_push_notifications)
    {
        keyQuery_enable_offline_push_notifications = strdup("enable_offline_push_notifications");
        valueQuery_enable_offline_push_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_offline_push_notifications, MAX_NUMBER_LENGTH, "%d", enable_offline_push_notifications);
        keyPairQuery_enable_offline_push_notifications = keyValuePair_create(keyQuery_enable_offline_push_notifications, valueQuery_enable_offline_push_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_offline_push_notifications);
    }

    // query parameters
    char *keyQuery_enable_online_push_notifications = NULL;
    char * valueQuery_enable_online_push_notifications = NULL;
    keyValuePair_t *keyPairQuery_enable_online_push_notifications = 0;
    if (enable_online_push_notifications)
    {
        keyQuery_enable_online_push_notifications = strdup("enable_online_push_notifications");
        valueQuery_enable_online_push_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_online_push_notifications, MAX_NUMBER_LENGTH, "%d", enable_online_push_notifications);
        keyPairQuery_enable_online_push_notifications = keyValuePair_create(keyQuery_enable_online_push_notifications, valueQuery_enable_online_push_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_online_push_notifications);
    }

    // query parameters
    char *keyQuery_enable_digest_emails = NULL;
    char * valueQuery_enable_digest_emails = NULL;
    keyValuePair_t *keyPairQuery_enable_digest_emails = 0;
    if (enable_digest_emails)
    {
        keyQuery_enable_digest_emails = strdup("enable_digest_emails");
        valueQuery_enable_digest_emails = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_digest_emails, MAX_NUMBER_LENGTH, "%d", enable_digest_emails);
        keyPairQuery_enable_digest_emails = keyValuePair_create(keyQuery_enable_digest_emails, valueQuery_enable_digest_emails);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_digest_emails);
    }

    // query parameters
    char *keyQuery_enable_marketing_emails = NULL;
    char * valueQuery_enable_marketing_emails = NULL;
    keyValuePair_t *keyPairQuery_enable_marketing_emails = 0;
    if (enable_marketing_emails)
    {
        keyQuery_enable_marketing_emails = strdup("enable_marketing_emails");
        valueQuery_enable_marketing_emails = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_marketing_emails, MAX_NUMBER_LENGTH, "%d", enable_marketing_emails);
        keyPairQuery_enable_marketing_emails = keyValuePair_create(keyQuery_enable_marketing_emails, valueQuery_enable_marketing_emails);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_marketing_emails);
    }

    // query parameters
    char *keyQuery_enable_login_emails = NULL;
    char * valueQuery_enable_login_emails = NULL;
    keyValuePair_t *keyPairQuery_enable_login_emails = 0;
    if (enable_login_emails)
    {
        keyQuery_enable_login_emails = strdup("enable_login_emails");
        valueQuery_enable_login_emails = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enable_login_emails, MAX_NUMBER_LENGTH, "%d", enable_login_emails);
        keyPairQuery_enable_login_emails = keyValuePair_create(keyQuery_enable_login_emails, valueQuery_enable_login_emails);
        list_addElement(localVarQueryParameters,keyPairQuery_enable_login_emails);
    }

    // query parameters
    char *keyQuery_message_content_in_email_notifications = NULL;
    char * valueQuery_message_content_in_email_notifications = NULL;
    keyValuePair_t *keyPairQuery_message_content_in_email_notifications = 0;
    if (message_content_in_email_notifications)
    {
        keyQuery_message_content_in_email_notifications = strdup("message_content_in_email_notifications");
        valueQuery_message_content_in_email_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_message_content_in_email_notifications, MAX_NUMBER_LENGTH, "%d", message_content_in_email_notifications);
        keyPairQuery_message_content_in_email_notifications = keyValuePair_create(keyQuery_message_content_in_email_notifications, valueQuery_message_content_in_email_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_message_content_in_email_notifications);
    }

    // query parameters
    char *keyQuery_pm_content_in_desktop_notifications = NULL;
    char * valueQuery_pm_content_in_desktop_notifications = NULL;
    keyValuePair_t *keyPairQuery_pm_content_in_desktop_notifications = 0;
    if (pm_content_in_desktop_notifications)
    {
        keyQuery_pm_content_in_desktop_notifications = strdup("pm_content_in_desktop_notifications");
        valueQuery_pm_content_in_desktop_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pm_content_in_desktop_notifications, MAX_NUMBER_LENGTH, "%d", pm_content_in_desktop_notifications);
        keyPairQuery_pm_content_in_desktop_notifications = keyValuePair_create(keyQuery_pm_content_in_desktop_notifications, valueQuery_pm_content_in_desktop_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_pm_content_in_desktop_notifications);
    }

    // query parameters
    char *keyQuery_wildcard_mentions_notify = NULL;
    char * valueQuery_wildcard_mentions_notify = NULL;
    keyValuePair_t *keyPairQuery_wildcard_mentions_notify = 0;
    if (wildcard_mentions_notify)
    {
        keyQuery_wildcard_mentions_notify = strdup("wildcard_mentions_notify");
        valueQuery_wildcard_mentions_notify = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_wildcard_mentions_notify, MAX_NUMBER_LENGTH, "%d", wildcard_mentions_notify);
        keyPairQuery_wildcard_mentions_notify = keyValuePair_create(keyQuery_wildcard_mentions_notify, valueQuery_wildcard_mentions_notify);
        list_addElement(localVarQueryParameters,keyPairQuery_wildcard_mentions_notify);
    }

    // query parameters
    char *keyQuery_desktop_icon_count_display = NULL;
    char * valueQuery_desktop_icon_count_display = NULL;
    keyValuePair_t *keyPairQuery_desktop_icon_count_display = 0;
    if (desktop_icon_count_display)
    {
        keyQuery_desktop_icon_count_display = strdup("desktop_icon_count_display");
        valueQuery_desktop_icon_count_display = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_desktop_icon_count_display, MAX_NUMBER_LENGTH, "%d", desktop_icon_count_display);
        keyPairQuery_desktop_icon_count_display = keyValuePair_create(keyQuery_desktop_icon_count_display, (void *)strdup(updateSettings_DESKTOPICONCOUNTDISPLAY_ToString(
		valueQuery_desktop_icon_count_display)));
        list_addElement(localVarQueryParameters,keyPairQuery_desktop_icon_count_display);
    }

    // query parameters
    char *keyQuery_realm_name_in_notifications = NULL;
    char * valueQuery_realm_name_in_notifications = NULL;
    keyValuePair_t *keyPairQuery_realm_name_in_notifications = 0;
    if (realm_name_in_notifications)
    {
        keyQuery_realm_name_in_notifications = strdup("realm_name_in_notifications");
        valueQuery_realm_name_in_notifications = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_realm_name_in_notifications, MAX_NUMBER_LENGTH, "%d", realm_name_in_notifications);
        keyPairQuery_realm_name_in_notifications = keyValuePair_create(keyQuery_realm_name_in_notifications, valueQuery_realm_name_in_notifications);
        list_addElement(localVarQueryParameters,keyPairQuery_realm_name_in_notifications);
    }

    // query parameters
    char *keyQuery_presence_enabled = NULL;
    char * valueQuery_presence_enabled = NULL;
    keyValuePair_t *keyPairQuery_presence_enabled = 0;
    if (presence_enabled)
    {
        keyQuery_presence_enabled = strdup("presence_enabled");
        valueQuery_presence_enabled = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_presence_enabled, MAX_NUMBER_LENGTH, "%d", presence_enabled);
        keyPairQuery_presence_enabled = keyValuePair_create(keyQuery_presence_enabled, valueQuery_presence_enabled);
        list_addElement(localVarQueryParameters,keyPairQuery_presence_enabled);
    }

    // query parameters
    char *keyQuery_enter_sends = NULL;
    char * valueQuery_enter_sends = NULL;
    keyValuePair_t *keyPairQuery_enter_sends = 0;
    if (enter_sends)
    {
        keyQuery_enter_sends = strdup("enter_sends");
        valueQuery_enter_sends = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_enter_sends, MAX_NUMBER_LENGTH, "%d", enter_sends);
        keyPairQuery_enter_sends = keyValuePair_create(keyQuery_enter_sends, valueQuery_enter_sends);
        list_addElement(localVarQueryParameters,keyPairQuery_enter_sends);
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
        printf("%s\n","Success");
    }
    //nonprimitive not container
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    if(keyQuery_full_name){
        free(keyQuery_full_name);
        keyQuery_full_name = NULL;
    }
    if(valueQuery_full_name){
        free(valueQuery_full_name);
        valueQuery_full_name = NULL;
    }
    if(keyPairQuery_full_name){
        keyValuePair_free(keyPairQuery_full_name);
        keyPairQuery_full_name = NULL;
    }
    if(keyQuery_email){
        free(keyQuery_email);
        keyQuery_email = NULL;
    }
    if(valueQuery_email){
        free(valueQuery_email);
        valueQuery_email = NULL;
    }
    if(keyPairQuery_email){
        keyValuePair_free(keyPairQuery_email);
        keyPairQuery_email = NULL;
    }
    if(keyQuery_old_password){
        free(keyQuery_old_password);
        keyQuery_old_password = NULL;
    }
    if(valueQuery_old_password){
        free(valueQuery_old_password);
        valueQuery_old_password = NULL;
    }
    if(keyPairQuery_old_password){
        keyValuePair_free(keyPairQuery_old_password);
        keyPairQuery_old_password = NULL;
    }
    if(keyQuery_new_password){
        free(keyQuery_new_password);
        keyQuery_new_password = NULL;
    }
    if(valueQuery_new_password){
        free(valueQuery_new_password);
        valueQuery_new_password = NULL;
    }
    if(keyPairQuery_new_password){
        keyValuePair_free(keyPairQuery_new_password);
        keyPairQuery_new_password = NULL;
    }
    if(keyQuery_twenty_four_hour_time){
        free(keyQuery_twenty_four_hour_time);
        keyQuery_twenty_four_hour_time = NULL;
    }
    if(valueQuery_twenty_four_hour_time){
        free(valueQuery_twenty_four_hour_time);
        valueQuery_twenty_four_hour_time = NULL;
    }
    if(keyPairQuery_twenty_four_hour_time){
        keyValuePair_free(keyPairQuery_twenty_four_hour_time);
        keyPairQuery_twenty_four_hour_time = NULL;
    }
    if(keyQuery_dense_mode){
        free(keyQuery_dense_mode);
        keyQuery_dense_mode = NULL;
    }
    if(valueQuery_dense_mode){
        free(valueQuery_dense_mode);
        valueQuery_dense_mode = NULL;
    }
    if(keyPairQuery_dense_mode){
        keyValuePair_free(keyPairQuery_dense_mode);
        keyPairQuery_dense_mode = NULL;
    }
    if(keyQuery_starred_message_counts){
        free(keyQuery_starred_message_counts);
        keyQuery_starred_message_counts = NULL;
    }
    if(valueQuery_starred_message_counts){
        free(valueQuery_starred_message_counts);
        valueQuery_starred_message_counts = NULL;
    }
    if(keyPairQuery_starred_message_counts){
        keyValuePair_free(keyPairQuery_starred_message_counts);
        keyPairQuery_starred_message_counts = NULL;
    }
    if(keyQuery_fluid_layout_width){
        free(keyQuery_fluid_layout_width);
        keyQuery_fluid_layout_width = NULL;
    }
    if(valueQuery_fluid_layout_width){
        free(valueQuery_fluid_layout_width);
        valueQuery_fluid_layout_width = NULL;
    }
    if(keyPairQuery_fluid_layout_width){
        keyValuePair_free(keyPairQuery_fluid_layout_width);
        keyPairQuery_fluid_layout_width = NULL;
    }
    if(keyQuery_high_contrast_mode){
        free(keyQuery_high_contrast_mode);
        keyQuery_high_contrast_mode = NULL;
    }
    if(valueQuery_high_contrast_mode){
        free(valueQuery_high_contrast_mode);
        valueQuery_high_contrast_mode = NULL;
    }
    if(keyPairQuery_high_contrast_mode){
        keyValuePair_free(keyPairQuery_high_contrast_mode);
        keyPairQuery_high_contrast_mode = NULL;
    }
    if(keyQuery_color_scheme){
        free(keyQuery_color_scheme);
        keyQuery_color_scheme = NULL;
    }
    if(valueQuery_color_scheme){
        free(valueQuery_color_scheme);
        valueQuery_color_scheme = NULL;
    }
    if(keyPairQuery_color_scheme){
        keyValuePair_free(keyPairQuery_color_scheme);
        keyPairQuery_color_scheme = NULL;
    }
    if(keyQuery_enable_drafts_synchronization){
        free(keyQuery_enable_drafts_synchronization);
        keyQuery_enable_drafts_synchronization = NULL;
    }
    if(valueQuery_enable_drafts_synchronization){
        free(valueQuery_enable_drafts_synchronization);
        valueQuery_enable_drafts_synchronization = NULL;
    }
    if(keyPairQuery_enable_drafts_synchronization){
        keyValuePair_free(keyPairQuery_enable_drafts_synchronization);
        keyPairQuery_enable_drafts_synchronization = NULL;
    }
    if(keyQuery_translate_emoticons){
        free(keyQuery_translate_emoticons);
        keyQuery_translate_emoticons = NULL;
    }
    if(valueQuery_translate_emoticons){
        free(valueQuery_translate_emoticons);
        valueQuery_translate_emoticons = NULL;
    }
    if(keyPairQuery_translate_emoticons){
        keyValuePair_free(keyPairQuery_translate_emoticons);
        keyPairQuery_translate_emoticons = NULL;
    }
    if(keyQuery_default_language){
        free(keyQuery_default_language);
        keyQuery_default_language = NULL;
    }
    if(valueQuery_default_language){
        free(valueQuery_default_language);
        valueQuery_default_language = NULL;
    }
    if(keyPairQuery_default_language){
        keyValuePair_free(keyPairQuery_default_language);
        keyPairQuery_default_language = NULL;
    }
    if(keyQuery_default_view){
        free(keyQuery_default_view);
        keyQuery_default_view = NULL;
    }
    if(valueQuery_default_view){
        free(valueQuery_default_view);
        valueQuery_default_view = NULL;
    }
    if(keyPairQuery_default_view){
        keyValuePair_free(keyPairQuery_default_view);
        keyPairQuery_default_view = NULL;
    }
    if(keyQuery_left_side_userlist){
        free(keyQuery_left_side_userlist);
        keyQuery_left_side_userlist = NULL;
    }
    if(valueQuery_left_side_userlist){
        free(valueQuery_left_side_userlist);
        valueQuery_left_side_userlist = NULL;
    }
    if(keyPairQuery_left_side_userlist){
        keyValuePair_free(keyPairQuery_left_side_userlist);
        keyPairQuery_left_side_userlist = NULL;
    }
    if(keyQuery_emojiset){
        free(keyQuery_emojiset);
        keyQuery_emojiset = NULL;
    }
    if(valueQuery_emojiset){
        free(valueQuery_emojiset);
        valueQuery_emojiset = NULL;
    }
    if(keyPairQuery_emojiset){
        keyValuePair_free(keyPairQuery_emojiset);
        keyPairQuery_emojiset = NULL;
    }
    if(keyQuery_demote_inactive_streams){
        free(keyQuery_demote_inactive_streams);
        keyQuery_demote_inactive_streams = NULL;
    }
    if(valueQuery_demote_inactive_streams){
        free(valueQuery_demote_inactive_streams);
        valueQuery_demote_inactive_streams = NULL;
    }
    if(keyPairQuery_demote_inactive_streams){
        keyValuePair_free(keyPairQuery_demote_inactive_streams);
        keyPairQuery_demote_inactive_streams = NULL;
    }
    if(keyQuery_timezone){
        free(keyQuery_timezone);
        keyQuery_timezone = NULL;
    }
    if(valueQuery_timezone){
        free(valueQuery_timezone);
        valueQuery_timezone = NULL;
    }
    if(keyPairQuery_timezone){
        keyValuePair_free(keyPairQuery_timezone);
        keyPairQuery_timezone = NULL;
    }
    if(keyQuery_enable_stream_desktop_notifications){
        free(keyQuery_enable_stream_desktop_notifications);
        keyQuery_enable_stream_desktop_notifications = NULL;
    }
    if(valueQuery_enable_stream_desktop_notifications){
        free(valueQuery_enable_stream_desktop_notifications);
        valueQuery_enable_stream_desktop_notifications = NULL;
    }
    if(keyPairQuery_enable_stream_desktop_notifications){
        keyValuePair_free(keyPairQuery_enable_stream_desktop_notifications);
        keyPairQuery_enable_stream_desktop_notifications = NULL;
    }
    if(keyQuery_enable_stream_email_notifications){
        free(keyQuery_enable_stream_email_notifications);
        keyQuery_enable_stream_email_notifications = NULL;
    }
    if(valueQuery_enable_stream_email_notifications){
        free(valueQuery_enable_stream_email_notifications);
        valueQuery_enable_stream_email_notifications = NULL;
    }
    if(keyPairQuery_enable_stream_email_notifications){
        keyValuePair_free(keyPairQuery_enable_stream_email_notifications);
        keyPairQuery_enable_stream_email_notifications = NULL;
    }
    if(keyQuery_enable_stream_push_notifications){
        free(keyQuery_enable_stream_push_notifications);
        keyQuery_enable_stream_push_notifications = NULL;
    }
    if(valueQuery_enable_stream_push_notifications){
        free(valueQuery_enable_stream_push_notifications);
        valueQuery_enable_stream_push_notifications = NULL;
    }
    if(keyPairQuery_enable_stream_push_notifications){
        keyValuePair_free(keyPairQuery_enable_stream_push_notifications);
        keyPairQuery_enable_stream_push_notifications = NULL;
    }
    if(keyQuery_enable_stream_audible_notifications){
        free(keyQuery_enable_stream_audible_notifications);
        keyQuery_enable_stream_audible_notifications = NULL;
    }
    if(valueQuery_enable_stream_audible_notifications){
        free(valueQuery_enable_stream_audible_notifications);
        valueQuery_enable_stream_audible_notifications = NULL;
    }
    if(keyPairQuery_enable_stream_audible_notifications){
        keyValuePair_free(keyPairQuery_enable_stream_audible_notifications);
        keyPairQuery_enable_stream_audible_notifications = NULL;
    }
    if(keyQuery_notification_sound){
        free(keyQuery_notification_sound);
        keyQuery_notification_sound = NULL;
    }
    if(valueQuery_notification_sound){
        free(valueQuery_notification_sound);
        valueQuery_notification_sound = NULL;
    }
    if(keyPairQuery_notification_sound){
        keyValuePair_free(keyPairQuery_notification_sound);
        keyPairQuery_notification_sound = NULL;
    }
    if(keyQuery_enable_desktop_notifications){
        free(keyQuery_enable_desktop_notifications);
        keyQuery_enable_desktop_notifications = NULL;
    }
    if(valueQuery_enable_desktop_notifications){
        free(valueQuery_enable_desktop_notifications);
        valueQuery_enable_desktop_notifications = NULL;
    }
    if(keyPairQuery_enable_desktop_notifications){
        keyValuePair_free(keyPairQuery_enable_desktop_notifications);
        keyPairQuery_enable_desktop_notifications = NULL;
    }
    if(keyQuery_enable_sounds){
        free(keyQuery_enable_sounds);
        keyQuery_enable_sounds = NULL;
    }
    if(valueQuery_enable_sounds){
        free(valueQuery_enable_sounds);
        valueQuery_enable_sounds = NULL;
    }
    if(keyPairQuery_enable_sounds){
        keyValuePair_free(keyPairQuery_enable_sounds);
        keyPairQuery_enable_sounds = NULL;
    }
    if(keyQuery_email_notifications_batching_period_seconds){
        free(keyQuery_email_notifications_batching_period_seconds);
        keyQuery_email_notifications_batching_period_seconds = NULL;
    }
    if(valueQuery_email_notifications_batching_period_seconds){
        free(valueQuery_email_notifications_batching_period_seconds);
        valueQuery_email_notifications_batching_period_seconds = NULL;
    }
    if(keyPairQuery_email_notifications_batching_period_seconds){
        keyValuePair_free(keyPairQuery_email_notifications_batching_period_seconds);
        keyPairQuery_email_notifications_batching_period_seconds = NULL;
    }
    if(keyQuery_enable_offline_email_notifications){
        free(keyQuery_enable_offline_email_notifications);
        keyQuery_enable_offline_email_notifications = NULL;
    }
    if(valueQuery_enable_offline_email_notifications){
        free(valueQuery_enable_offline_email_notifications);
        valueQuery_enable_offline_email_notifications = NULL;
    }
    if(keyPairQuery_enable_offline_email_notifications){
        keyValuePair_free(keyPairQuery_enable_offline_email_notifications);
        keyPairQuery_enable_offline_email_notifications = NULL;
    }
    if(keyQuery_enable_offline_push_notifications){
        free(keyQuery_enable_offline_push_notifications);
        keyQuery_enable_offline_push_notifications = NULL;
    }
    if(valueQuery_enable_offline_push_notifications){
        free(valueQuery_enable_offline_push_notifications);
        valueQuery_enable_offline_push_notifications = NULL;
    }
    if(keyPairQuery_enable_offline_push_notifications){
        keyValuePair_free(keyPairQuery_enable_offline_push_notifications);
        keyPairQuery_enable_offline_push_notifications = NULL;
    }
    if(keyQuery_enable_online_push_notifications){
        free(keyQuery_enable_online_push_notifications);
        keyQuery_enable_online_push_notifications = NULL;
    }
    if(valueQuery_enable_online_push_notifications){
        free(valueQuery_enable_online_push_notifications);
        valueQuery_enable_online_push_notifications = NULL;
    }
    if(keyPairQuery_enable_online_push_notifications){
        keyValuePair_free(keyPairQuery_enable_online_push_notifications);
        keyPairQuery_enable_online_push_notifications = NULL;
    }
    if(keyQuery_enable_digest_emails){
        free(keyQuery_enable_digest_emails);
        keyQuery_enable_digest_emails = NULL;
    }
    if(valueQuery_enable_digest_emails){
        free(valueQuery_enable_digest_emails);
        valueQuery_enable_digest_emails = NULL;
    }
    if(keyPairQuery_enable_digest_emails){
        keyValuePair_free(keyPairQuery_enable_digest_emails);
        keyPairQuery_enable_digest_emails = NULL;
    }
    if(keyQuery_enable_marketing_emails){
        free(keyQuery_enable_marketing_emails);
        keyQuery_enable_marketing_emails = NULL;
    }
    if(valueQuery_enable_marketing_emails){
        free(valueQuery_enable_marketing_emails);
        valueQuery_enable_marketing_emails = NULL;
    }
    if(keyPairQuery_enable_marketing_emails){
        keyValuePair_free(keyPairQuery_enable_marketing_emails);
        keyPairQuery_enable_marketing_emails = NULL;
    }
    if(keyQuery_enable_login_emails){
        free(keyQuery_enable_login_emails);
        keyQuery_enable_login_emails = NULL;
    }
    if(valueQuery_enable_login_emails){
        free(valueQuery_enable_login_emails);
        valueQuery_enable_login_emails = NULL;
    }
    if(keyPairQuery_enable_login_emails){
        keyValuePair_free(keyPairQuery_enable_login_emails);
        keyPairQuery_enable_login_emails = NULL;
    }
    if(keyQuery_message_content_in_email_notifications){
        free(keyQuery_message_content_in_email_notifications);
        keyQuery_message_content_in_email_notifications = NULL;
    }
    if(valueQuery_message_content_in_email_notifications){
        free(valueQuery_message_content_in_email_notifications);
        valueQuery_message_content_in_email_notifications = NULL;
    }
    if(keyPairQuery_message_content_in_email_notifications){
        keyValuePair_free(keyPairQuery_message_content_in_email_notifications);
        keyPairQuery_message_content_in_email_notifications = NULL;
    }
    if(keyQuery_pm_content_in_desktop_notifications){
        free(keyQuery_pm_content_in_desktop_notifications);
        keyQuery_pm_content_in_desktop_notifications = NULL;
    }
    if(valueQuery_pm_content_in_desktop_notifications){
        free(valueQuery_pm_content_in_desktop_notifications);
        valueQuery_pm_content_in_desktop_notifications = NULL;
    }
    if(keyPairQuery_pm_content_in_desktop_notifications){
        keyValuePair_free(keyPairQuery_pm_content_in_desktop_notifications);
        keyPairQuery_pm_content_in_desktop_notifications = NULL;
    }
    if(keyQuery_wildcard_mentions_notify){
        free(keyQuery_wildcard_mentions_notify);
        keyQuery_wildcard_mentions_notify = NULL;
    }
    if(valueQuery_wildcard_mentions_notify){
        free(valueQuery_wildcard_mentions_notify);
        valueQuery_wildcard_mentions_notify = NULL;
    }
    if(keyPairQuery_wildcard_mentions_notify){
        keyValuePair_free(keyPairQuery_wildcard_mentions_notify);
        keyPairQuery_wildcard_mentions_notify = NULL;
    }
    if(keyQuery_desktop_icon_count_display){
        free(keyQuery_desktop_icon_count_display);
        keyQuery_desktop_icon_count_display = NULL;
    }
    if(valueQuery_desktop_icon_count_display){
        free(valueQuery_desktop_icon_count_display);
        valueQuery_desktop_icon_count_display = NULL;
    }
    if(keyPairQuery_desktop_icon_count_display){
        keyValuePair_free(keyPairQuery_desktop_icon_count_display);
        keyPairQuery_desktop_icon_count_display = NULL;
    }
    if(keyQuery_realm_name_in_notifications){
        free(keyQuery_realm_name_in_notifications);
        keyQuery_realm_name_in_notifications = NULL;
    }
    if(valueQuery_realm_name_in_notifications){
        free(valueQuery_realm_name_in_notifications);
        valueQuery_realm_name_in_notifications = NULL;
    }
    if(keyPairQuery_realm_name_in_notifications){
        keyValuePair_free(keyPairQuery_realm_name_in_notifications);
        keyPairQuery_realm_name_in_notifications = NULL;
    }
    if(keyQuery_presence_enabled){
        free(keyQuery_presence_enabled);
        keyQuery_presence_enabled = NULL;
    }
    if(valueQuery_presence_enabled){
        free(valueQuery_presence_enabled);
        valueQuery_presence_enabled = NULL;
    }
    if(keyPairQuery_presence_enabled){
        keyValuePair_free(keyPairQuery_presence_enabled);
        keyPairQuery_presence_enabled = NULL;
    }
    if(keyQuery_enter_sends){
        free(keyQuery_enter_sends);
        keyQuery_enter_sends = NULL;
    }
    if(valueQuery_enter_sends){
        free(valueQuery_enter_sends);
        valueQuery_enter_sends = NULL;
    }
    if(keyPairQuery_enter_sends){
        keyValuePair_free(keyPairQuery_enter_sends);
        keyPairQuery_enter_sends = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update your status
//
// Change your [status](/help/status-and-availability).  `POST {{ api_url }}/v1/users/me/status`  A request to this endpoint will only change the parameters passed. For example, passing just `status_text` requests a change in the status text, but will leave the status emoji unchanged.  Clients that wish to set the user's status to a specific value should pass all supported parameters. 
//
json_success_t*
UsersAPI_updateStatus(apiClient_t *apiClient, char * status_text , int away , char * emoji_name , char * emoji_code , char * reaction_type )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/me/status")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/me/status");




    // query parameters
    char *keyQuery_status_text = NULL;
    char * valueQuery_status_text = NULL;
    keyValuePair_t *keyPairQuery_status_text = 0;
    if (status_text)
    {
        keyQuery_status_text = strdup("status_text");
        valueQuery_status_text = strdup((status_text));
        keyPairQuery_status_text = keyValuePair_create(keyQuery_status_text, valueQuery_status_text);
        list_addElement(localVarQueryParameters,keyPairQuery_status_text);
    }

    // query parameters
    char *keyQuery_away = NULL;
    char * valueQuery_away = NULL;
    keyValuePair_t *keyPairQuery_away = 0;
    if (away)
    {
        keyQuery_away = strdup("away");
        valueQuery_away = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_away, MAX_NUMBER_LENGTH, "%d", away);
        keyPairQuery_away = keyValuePair_create(keyQuery_away, valueQuery_away);
        list_addElement(localVarQueryParameters,keyPairQuery_away);
    }

    // query parameters
    char *keyQuery_emoji_name = NULL;
    char * valueQuery_emoji_name = NULL;
    keyValuePair_t *keyPairQuery_emoji_name = 0;
    if (emoji_name)
    {
        keyQuery_emoji_name = strdup("emoji_name");
        valueQuery_emoji_name = strdup((emoji_name));
        keyPairQuery_emoji_name = keyValuePair_create(keyQuery_emoji_name, valueQuery_emoji_name);
        list_addElement(localVarQueryParameters,keyPairQuery_emoji_name);
    }

    // query parameters
    char *keyQuery_emoji_code = NULL;
    char * valueQuery_emoji_code = NULL;
    keyValuePair_t *keyPairQuery_emoji_code = 0;
    if (emoji_code)
    {
        keyQuery_emoji_code = strdup("emoji_code");
        valueQuery_emoji_code = strdup((emoji_code));
        keyPairQuery_emoji_code = keyValuePair_create(keyQuery_emoji_code, valueQuery_emoji_code);
        list_addElement(localVarQueryParameters,keyPairQuery_emoji_code);
    }

    // query parameters
    char *keyQuery_reaction_type = NULL;
    char * valueQuery_reaction_type = NULL;
    keyValuePair_t *keyPairQuery_reaction_type = 0;
    if (reaction_type)
    {
        keyQuery_reaction_type = strdup("reaction_type");
        valueQuery_reaction_type = strdup((reaction_type));
        keyPairQuery_reaction_type = keyValuePair_create(keyQuery_reaction_type, valueQuery_reaction_type);
        list_addElement(localVarQueryParameters,keyPairQuery_reaction_type);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    if(keyQuery_status_text){
        free(keyQuery_status_text);
        keyQuery_status_text = NULL;
    }
    if(valueQuery_status_text){
        free(valueQuery_status_text);
        valueQuery_status_text = NULL;
    }
    if(keyPairQuery_status_text){
        keyValuePair_free(keyPairQuery_status_text);
        keyPairQuery_status_text = NULL;
    }
    if(keyQuery_away){
        free(keyQuery_away);
        keyQuery_away = NULL;
    }
    if(valueQuery_away){
        free(valueQuery_away);
        valueQuery_away = NULL;
    }
    if(keyPairQuery_away){
        keyValuePair_free(keyPairQuery_away);
        keyPairQuery_away = NULL;
    }
    if(keyQuery_emoji_name){
        free(keyQuery_emoji_name);
        keyQuery_emoji_name = NULL;
    }
    if(valueQuery_emoji_name){
        free(valueQuery_emoji_name);
        valueQuery_emoji_name = NULL;
    }
    if(keyPairQuery_emoji_name){
        keyValuePair_free(keyPairQuery_emoji_name);
        keyPairQuery_emoji_name = NULL;
    }
    if(keyQuery_emoji_code){
        free(keyQuery_emoji_code);
        keyQuery_emoji_code = NULL;
    }
    if(valueQuery_emoji_code){
        free(valueQuery_emoji_code);
        valueQuery_emoji_code = NULL;
    }
    if(keyPairQuery_emoji_code){
        keyValuePair_free(keyPairQuery_emoji_code);
        keyPairQuery_emoji_code = NULL;
    }
    if(keyQuery_reaction_type){
        free(keyQuery_reaction_type);
        keyQuery_reaction_type = NULL;
    }
    if(valueQuery_reaction_type){
        free(valueQuery_reaction_type);
        valueQuery_reaction_type = NULL;
    }
    if(keyPairQuery_reaction_type){
        keyValuePair_free(keyPairQuery_reaction_type);
        keyPairQuery_reaction_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update a user
//
// Administrative endpoint to update the details of another user in the organization.  `PATCH {{ api_url }}/v1/users/{user_id}`  Supports everything an administrator can do to edit details of another user's account, including editing full name, [role](/help/roles-and-permissions), and [custom profile fields](/help/add-custom-profile-fields). 
//
json_success_t*
UsersAPI_updateUser(apiClient_t *apiClient, int user_id , char * full_name , int role , list_t * profile_data )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/{user_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/{user_id}");


    // Path Params
    long sizeOfPathParams_user_id =  + strlen("{ user_id }");
    if(user_id == 0){
        goto end;
    }
    char* localVarToReplace_user_id = malloc(sizeOfPathParams_user_id);
    snprintf(localVarToReplace_user_id, sizeOfPathParams_user_id, "{%s}", "user_id");

    char localVarBuff_user_id[256];
    intToStr(localVarBuff_user_id, user_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_id, localVarBuff_user_id);




    // query parameters
    char *keyQuery_full_name = NULL;
    char * valueQuery_full_name = NULL;
    keyValuePair_t *keyPairQuery_full_name = 0;
    if (full_name)
    {
        keyQuery_full_name = strdup("full_name");
        valueQuery_full_name = strdup((full_name));
        keyPairQuery_full_name = keyValuePair_create(keyQuery_full_name, valueQuery_full_name);
        list_addElement(localVarQueryParameters,keyPairQuery_full_name);
    }

    // query parameters
    char *keyQuery_role = NULL;
    char * valueQuery_role = NULL;
    keyValuePair_t *keyPairQuery_role = 0;
    if (role)
    {
        keyQuery_role = strdup("role");
        valueQuery_role = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_role, MAX_NUMBER_LENGTH, "%d", role);
        keyPairQuery_role = keyValuePair_create(keyQuery_role, valueQuery_role);
        list_addElement(localVarQueryParameters,keyPairQuery_role);
    }

    // query parameters
    if (profile_data)
    {
        list_addElement(localVarQueryParameters,profile_data);
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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_id);
    if(keyQuery_full_name){
        free(keyQuery_full_name);
        keyQuery_full_name = NULL;
    }
    if(valueQuery_full_name){
        free(valueQuery_full_name);
        valueQuery_full_name = NULL;
    }
    if(keyPairQuery_full_name){
        keyValuePair_free(keyPairQuery_full_name);
        keyPairQuery_full_name = NULL;
    }
    if(keyQuery_role){
        free(keyQuery_role);
        keyQuery_role = NULL;
    }
    if(valueQuery_role){
        free(valueQuery_role);
        valueQuery_role = NULL;
    }
    if(keyPairQuery_role){
        keyValuePair_free(keyPairQuery_role);
        keyPairQuery_role = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update a user group
//
// Update the name or description of a [user group](/help/user-groups).  `PATCH {{ api_url }}/v1/user_groups/{user_group_id}` 
//
json_success_t*
UsersAPI_updateUserGroup(apiClient_t *apiClient, int user_group_id , char * name , char * description )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_groups/{user_group_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_groups/{user_group_id}");


    // Path Params
    long sizeOfPathParams_user_group_id =  + strlen("{ user_group_id }");
    if(user_group_id == 0){
        goto end;
    }
    char* localVarToReplace_user_group_id = malloc(sizeOfPathParams_user_group_id);
    snprintf(localVarToReplace_user_group_id, sizeOfPathParams_user_group_id, "{%s}", "user_group_id");

    char localVarBuff_user_group_id[256];
    intToStr(localVarBuff_user_group_id, user_group_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_group_id, localVarBuff_user_group_id);




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
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_group_id);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update user group members
//
// Update the members of a [user group](/help/user-groups).  `POST {{ api_url }}/v1/user_groups/{user_group_id}/members` 
//
json_success_t*
UsersAPI_updateUserGroupMembers(apiClient_t *apiClient, int user_group_id , list_t * _delete , list_t * add )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_groups/{user_group_id}/members")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_groups/{user_group_id}/members");


    // Path Params
    long sizeOfPathParams_user_group_id =  + strlen("{ user_group_id }");
    if(user_group_id == 0){
        goto end;
    }
    char* localVarToReplace_user_group_id = malloc(sizeOfPathParams_user_group_id);
    snprintf(localVarToReplace_user_group_id, sizeOfPathParams_user_group_id, "{%s}", "user_group_id");

    char localVarBuff_user_group_id[256];
    intToStr(localVarBuff_user_group_id, user_group_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_user_group_id, localVarBuff_user_group_id);




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
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    //nonprimitive not container
    cJSON *UsersAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(UsersAPIlocalVarJSON);
    cJSON_Delete(UsersAPIlocalVarJSON);
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
    free(localVarToReplace_user_group_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

