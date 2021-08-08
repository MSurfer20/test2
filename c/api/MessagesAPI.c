#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "MessagesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum TYPE for MessagesAPI_sendMessage

static char* sendMessage_TYPE_ToString(zulip_rest_api_sendMessage_type_e TYPE){
    char *TYPEArray[] =  { "NULL", "private", "stream" };
    return TYPEArray[TYPE];
}

static zulip_rest_api_sendMessage_type_e sendMessage_TYPE_FromString(char* TYPE){
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
// Function sendMessage_TYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *sendMessage_TYPE_convertToJSON(zulip_rest_api_sendMessage_type_e TYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "type", sendMessage_TYPE_ToString(TYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function sendMessage_TYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_sendMessage_type_e sendMessage_TYPE_parseFromJSON(cJSON* TYPEJSON) {
    zulip_rest_api_sendMessage_type_e TYPEVariable = 0;
    cJSON *TYPEVar = cJSON_GetObjectItemCaseSensitive(TYPEJSON, "type");
    if(!cJSON_IsString(TYPEVar) || (TYPEVar->valuestring == NULL))
    {
        goto end;
    }
    TYPEVariable = sendMessage_TYPE_FromString(TYPEVar->valuestring);
    return TYPEVariable;
end:
    return 0;
}
*/

// Functions for enum PROPAGATEMODE for MessagesAPI_updateMessage

static char* updateMessage_PROPAGATEMODE_ToString(zulip_rest_api_updateMessage_propagate_mode_e PROPAGATEMODE){
    char *PROPAGATEMODEArray[] =  { "NULL", "change_one", "change_later", "change_all" };
    return PROPAGATEMODEArray[PROPAGATEMODE];
}

static zulip_rest_api_updateMessage_propagate_mode_e updateMessage_PROPAGATEMODE_FromString(char* PROPAGATEMODE){
    int stringToReturn = 0;
    char *PROPAGATEMODEArray[] =  { "NULL", "change_one", "change_later", "change_all" };
    size_t sizeofArray = sizeof(PROPAGATEMODEArray) / sizeof(PROPAGATEMODEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PROPAGATEMODE, PROPAGATEMODEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function updateMessage_PROPAGATEMODE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *updateMessage_PROPAGATEMODE_convertToJSON(zulip_rest_api_updateMessage_propagate_mode_e PROPAGATEMODE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "propagate_mode", updateMessage_PROPAGATEMODE_ToString(PROPAGATEMODE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function updateMessage_PROPAGATEMODE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_updateMessage_propagate_mode_e updateMessage_PROPAGATEMODE_parseFromJSON(cJSON* PROPAGATEMODEJSON) {
    zulip_rest_api_updateMessage_propagate_mode_e PROPAGATEMODEVariable = 0;
    cJSON *PROPAGATEMODEVar = cJSON_GetObjectItemCaseSensitive(PROPAGATEMODEJSON, "propagate_mode");
    if(!cJSON_IsString(PROPAGATEMODEVar) || (PROPAGATEMODEVar->valuestring == NULL))
    {
        goto end;
    }
    PROPAGATEMODEVariable = updateMessage_PROPAGATEMODE_FromString(PROPAGATEMODEVar->valuestring);
    return PROPAGATEMODEVariable;
end:
    return 0;
}
*/

// Functions for enum OP for MessagesAPI_updateMessageFlags

static char* updateMessageFlags_OP_ToString(zulip_rest_api_updateMessageFlags_op_e OP){
    char *OPArray[] =  { "NULL", "add", "remove" };
    return OPArray[OP];
}

static zulip_rest_api_updateMessageFlags_op_e updateMessageFlags_OP_FromString(char* OP){
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
// Function updateMessageFlags_OP_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *updateMessageFlags_OP_convertToJSON(zulip_rest_api_updateMessageFlags_op_e OP) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "op", updateMessageFlags_OP_ToString(OP)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function updateMessageFlags_OP_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static zulip_rest_api_updateMessageFlags_op_e updateMessageFlags_OP_parseFromJSON(cJSON* OPJSON) {
    zulip_rest_api_updateMessageFlags_op_e OPVariable = 0;
    cJSON *OPVar = cJSON_GetObjectItemCaseSensitive(OPJSON, "op");
    if(!cJSON_IsString(OPVar) || (OPVar->valuestring == NULL))
    {
        goto end;
    }
    OPVariable = updateMessageFlags_OP_FromString(OPVar->valuestring);
    return OPVariable;
end:
    return 0;
}
*/


// Add an emoji reaction
//
// Add an [emoji reaction](/help/emoji-reactions) to a message.  `POST {{ api_url }}/v1/messages/{message_id}/reactions` 
//
json_success_t*
MessagesAPI_addReaction(apiClient_t *apiClient, int message_id , char * emoji_name , char * emoji_code , char * reaction_type )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/{message_id}/reactions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/{message_id}/reactions");


    // Path Params
    long sizeOfPathParams_message_id =  + strlen("{ message_id }");
    if(message_id == 0){
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    snprintf(localVarToReplace_message_id, sizeOfPathParams_message_id, "{%s}", "message_id");

    char localVarBuff_message_id[256];
    intToStr(localVarBuff_message_id, message_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, localVarBuff_message_id);




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
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_message_id);
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

// Check if messages match a narrow
//
// Check whether a set of messages match a [narrow](/api/construct-narrow).  `GET {{ api_url }}/v1/messages/matches_narrow`  For many common narrows (E.g. a topic), clients can write an efficient client-side check to determine whether a newly arrived message belongs in the view.  This endpoint is designed to allow clients to handle more complex narrows for which the client does not (or in the case of full-text search, cannot) implement this check.  The format of the `match_subject` and `match_content` objects is designed to match those of `GET /messages`, so that a client can splice these fields into a `message` object received from `GET /events` and end up with an extended message object identical to how a `GET /messages` for the current narrow would have returned the message. 
//
any_type_t*
MessagesAPI_checkMessagesMatchNarrow(apiClient_t *apiClient, list_t * msg_ids , list_t * narrow )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/matches_narrow")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/matches_narrow");




    // query parameters
    if (msg_ids)
    {
        list_addElement(localVarQueryParameters,msg_ids);
    }

    // query parameters
    if (narrow)
    {
        list_addElement(localVarQueryParameters,narrow);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    any_type_t *elementToReturn = any_type_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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

// Delete a message
//
// Permanently delete a message.  `DELETE {{ api_url }}/v1/messages/{msg_id}`  This API corresponds to the [delete a message completely][delete-completely] feature documented in the Zulip Help Center.  [delete-completely]: /help/edit-or-delete-a-message#delete-a-message-completely 
//
json_success_t*
MessagesAPI_deleteMessage(apiClient_t *apiClient, int message_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/{message_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/{message_id}");


    // Path Params
    long sizeOfPathParams_message_id =  + strlen("{ message_id }");
    if(message_id == 0){
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    snprintf(localVarToReplace_message_id, sizeOfPathParams_message_id, "{%s}", "message_id");

    char localVarBuff_message_id[256];
    intToStr(localVarBuff_message_id, message_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, localVarBuff_message_id);



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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_message_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get public temporary URL
//
// Get a temporary URL for access to the file that doesn't require authentication. 
//
json_success_base_t*
MessagesAPI_getFileTemporaryUrl(apiClient_t *apiClient, int realm_id_str , char * filename )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_uploads/{realm_id_str}/{filename}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_uploads/{realm_id_str}/{filename}");


    // Path Params
    long sizeOfPathParams_realm_id_str =  + strlen(filename)+3 + strlen("{ realm_id_str }");
    if(realm_id_str == 0){
        goto end;
    }
    char* localVarToReplace_realm_id_str = malloc(sizeOfPathParams_realm_id_str);
    snprintf(localVarToReplace_realm_id_str, sizeOfPathParams_realm_id_str, "{%s}", "realm_id_str");

    char localVarBuff_realm_id_str[256];
    intToStr(localVarBuff_realm_id_str, realm_id_str);

    localVarPath = strReplace(localVarPath, localVarToReplace_realm_id_str, localVarBuff_realm_id_str);


    // Path Params
    long sizeOfPathParams_filename =  + strlen(filename)+3 + strlen("{ filename }");
    if(filename == NULL) {
        goto end;
    }
    char* localVarToReplace_filename = malloc(sizeOfPathParams_filename);
    sprintf(localVarToReplace_filename, "{%s}", "filename");

    localVarPath = strReplace(localVarPath, localVarToReplace_filename, filename);


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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_realm_id_str);
    free(localVarToReplace_filename);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get a message's edit history
//
// Fetch the message edit history of a previously edited message.  `GET {{ api_url }}/v1/messages/{message_id}/history`  Note that edit history may be disabled in some organizations; see the [Zulip Help Center documentation on editing messages][edit-settings].  [edit-settings]: /help/view-a-messages-edit-history 
//
json_success_base_t*
MessagesAPI_getMessageHistory(apiClient_t *apiClient, int message_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/{message_id}/history")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/{message_id}/history");


    // Path Params
    long sizeOfPathParams_message_id =  + strlen("{ message_id }");
    if(message_id == 0){
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    snprintf(localVarToReplace_message_id, sizeOfPathParams_message_id, "{%s}", "message_id");

    char localVarBuff_message_id[256];
    intToStr(localVarBuff_message_id, message_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, localVarBuff_message_id);



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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_message_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get messages
//
// Fetch message history from a Zulip server.  `GET {{ api_url }}/v1/messages`  This `GET /api/v1/messages` endpoint is the primary way to fetch message history from a Zulip server.  It is useful both for Zulip clients (e.g. the web, desktop, mobile, and terminal clients) as well as bots, API clients, backup scripts, etc.  By specifying a [narrow filter](/api/construct-narrow), you can use this endpoint to fetch the messages matching any search query that is supported by Zulip's powerful full-text search backend.  When a narrow is not specified, it can be used to fetch a user's message history. (We recommend paginating to 1000 messages at a time.)  In either case, you specify an `anchor` message (or ask the server to calculate the first unread message for you and use that as the anchor), as well as a number of messages before and after the anchor message.  The server returns those messages, sorted by message ID, as well as some metadata that makes it easy for a client to determine whether there are more messages matching the query that were not returned due to the `num_before` and `num_after` limits.  We recommend using `num_before <= 1000` and `num_after <= 1000` to avoid generating very large HTTP responses. A maximum of 5000 messages can be obtained per request; attempting to exceed this will result in an error. 
//
json_success_base_t*
MessagesAPI_getMessages(apiClient_t *apiClient, int num_before , int num_after , one_ofstringinteger_t * anchor , list_t * narrow , int client_gravatar , int apply_markdown , int use_first_unread_anchor )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages");




    // query parameters
    char *keyQuery_anchor = NULL;
    one_ofstringinteger_t * valueQuery_anchor ;
    keyValuePair_t *keyPairQuery_anchor = 0;
    if (anchor)
    {
        keyQuery_anchor = strdup("anchor");
        valueQuery_anchor = (anchor);
        keyPairQuery_anchor = keyValuePair_create(keyQuery_anchor, &valueQuery_anchor);
        list_addElement(localVarQueryParameters,keyPairQuery_anchor);
    }

    // query parameters
    char *keyQuery_num_before = NULL;
    char * valueQuery_num_before = NULL;
    keyValuePair_t *keyPairQuery_num_before = 0;
    if (num_before)
    {
        keyQuery_num_before = strdup("num_before");
        valueQuery_num_before = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_num_before, MAX_NUMBER_LENGTH, "%d", num_before);
        keyPairQuery_num_before = keyValuePair_create(keyQuery_num_before, valueQuery_num_before);
        list_addElement(localVarQueryParameters,keyPairQuery_num_before);
    }

    // query parameters
    char *keyQuery_num_after = NULL;
    char * valueQuery_num_after = NULL;
    keyValuePair_t *keyPairQuery_num_after = 0;
    if (num_after)
    {
        keyQuery_num_after = strdup("num_after");
        valueQuery_num_after = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_num_after, MAX_NUMBER_LENGTH, "%d", num_after);
        keyPairQuery_num_after = keyValuePair_create(keyQuery_num_after, valueQuery_num_after);
        list_addElement(localVarQueryParameters,keyPairQuery_num_after);
    }

    // query parameters
    if (narrow)
    {
        list_addElement(localVarQueryParameters,narrow);
    }

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
    char *keyQuery_apply_markdown = NULL;
    char * valueQuery_apply_markdown = NULL;
    keyValuePair_t *keyPairQuery_apply_markdown = 0;
    if (apply_markdown)
    {
        keyQuery_apply_markdown = strdup("apply_markdown");
        valueQuery_apply_markdown = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_apply_markdown, MAX_NUMBER_LENGTH, "%d", apply_markdown);
        keyPairQuery_apply_markdown = keyValuePair_create(keyQuery_apply_markdown, valueQuery_apply_markdown);
        list_addElement(localVarQueryParameters,keyPairQuery_apply_markdown);
    }

    // query parameters
    char *keyQuery_use_first_unread_anchor = NULL;
    char * valueQuery_use_first_unread_anchor = NULL;
    keyValuePair_t *keyPairQuery_use_first_unread_anchor = 0;
    if (use_first_unread_anchor)
    {
        keyQuery_use_first_unread_anchor = strdup("use_first_unread_anchor");
        valueQuery_use_first_unread_anchor = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_use_first_unread_anchor, MAX_NUMBER_LENGTH, "%d", use_first_unread_anchor);
        keyPairQuery_use_first_unread_anchor = keyValuePair_create(keyQuery_use_first_unread_anchor, valueQuery_use_first_unread_anchor);
        list_addElement(localVarQueryParameters,keyPairQuery_use_first_unread_anchor);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    if(keyQuery_anchor){
        free(keyQuery_anchor);
        keyQuery_anchor = NULL;
    }
    if(keyPairQuery_anchor){
        keyValuePair_free(keyPairQuery_anchor);
        keyPairQuery_anchor = NULL;
    }
    if(keyQuery_num_before){
        free(keyQuery_num_before);
        keyQuery_num_before = NULL;
    }
    if(valueQuery_num_before){
        free(valueQuery_num_before);
        valueQuery_num_before = NULL;
    }
    if(keyPairQuery_num_before){
        keyValuePair_free(keyPairQuery_num_before);
        keyPairQuery_num_before = NULL;
    }
    if(keyQuery_num_after){
        free(keyQuery_num_after);
        keyQuery_num_after = NULL;
    }
    if(valueQuery_num_after){
        free(valueQuery_num_after);
        valueQuery_num_after = NULL;
    }
    if(keyPairQuery_num_after){
        keyValuePair_free(keyPairQuery_num_after);
        keyPairQuery_num_after = NULL;
    }
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
    if(keyQuery_apply_markdown){
        free(keyQuery_apply_markdown);
        keyQuery_apply_markdown = NULL;
    }
    if(valueQuery_apply_markdown){
        free(valueQuery_apply_markdown);
        valueQuery_apply_markdown = NULL;
    }
    if(keyPairQuery_apply_markdown){
        keyValuePair_free(keyPairQuery_apply_markdown);
        keyPairQuery_apply_markdown = NULL;
    }
    if(keyQuery_use_first_unread_anchor){
        free(keyQuery_use_first_unread_anchor);
        keyQuery_use_first_unread_anchor = NULL;
    }
    if(valueQuery_use_first_unread_anchor){
        free(valueQuery_use_first_unread_anchor);
        valueQuery_use_first_unread_anchor = NULL;
    }
    if(keyPairQuery_use_first_unread_anchor){
        keyValuePair_free(keyPairQuery_use_first_unread_anchor);
        keyPairQuery_use_first_unread_anchor = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get a message's raw Markdown
//
// Get the raw content of a message.  `GET {{ api_url }}/v1/messages/{msg_id}`  This is a rarely-used endpoint relevant for clients that primarily work with HTML-rendered messages but might need to occasionally fetch the message's raw Markdown (e.g. for pre-filling a message-editing UI). 
//
json_success_base_t*
MessagesAPI_getRawMessage(apiClient_t *apiClient, int message_id )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/{message_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/{message_id}");


    // Path Params
    long sizeOfPathParams_message_id =  + strlen("{ message_id }");
    if(message_id == 0){
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    snprintf(localVarToReplace_message_id, sizeOfPathParams_message_id, "{%s}", "message_id");

    char localVarBuff_message_id[256];
    intToStr(localVarBuff_message_id, message_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, localVarBuff_message_id);



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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_message_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Mark all messages as read
//
// Marks all of the current user's unread messages as read.  `POST {{ api_url }}/v1/mark_all_as_read` 
//
json_success_t*
MessagesAPI_markAllAsRead(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/mark_all_as_read")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/mark_all_as_read");



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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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

// Mark messages in a stream as read
//
// Mark all the unread messages in a stream as read. 
//
json_success_t*
MessagesAPI_markStreamAsRead(apiClient_t *apiClient, int stream_id )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/mark_stream_as_read")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/mark_stream_as_read");




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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Mark messages in a topic as read
//
// Mark all the unread messages in a topic as read. 
//
json_success_t*
MessagesAPI_markTopicAsRead(apiClient_t *apiClient, int stream_id , char * topic_name )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/mark_topic_as_read")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/mark_topic_as_read");




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
    char *keyQuery_topic_name = NULL;
    char * valueQuery_topic_name = NULL;
    keyValuePair_t *keyPairQuery_topic_name = 0;
    if (topic_name)
    {
        keyQuery_topic_name = strdup("topic_name");
        valueQuery_topic_name = strdup((topic_name));
        keyPairQuery_topic_name = keyValuePair_create(keyQuery_topic_name, valueQuery_topic_name);
        list_addElement(localVarQueryParameters,keyPairQuery_topic_name);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    if(keyQuery_topic_name){
        free(keyQuery_topic_name);
        keyQuery_topic_name = NULL;
    }
    if(valueQuery_topic_name){
        free(valueQuery_topic_name);
        valueQuery_topic_name = NULL;
    }
    if(keyPairQuery_topic_name){
        keyValuePair_free(keyPairQuery_topic_name);
        keyPairQuery_topic_name = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Remove an emoji reaction
//
// Remove an [emoji reaction](/help/emoji-reactions) from a message.  `DELETE {{ api_url }}/v1/messages/{message_id}/reactions` 
//
json_success_t*
MessagesAPI_removeReaction(apiClient_t *apiClient, int message_id , char * emoji_name , char * emoji_code , char * reaction_type )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/{message_id}/reactions")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/{message_id}/reactions");


    // Path Params
    long sizeOfPathParams_message_id =  + strlen("{ message_id }");
    if(message_id == 0){
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    snprintf(localVarToReplace_message_id, sizeOfPathParams_message_id, "{%s}", "message_id");

    char localVarBuff_message_id[256];
    intToStr(localVarBuff_message_id, message_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, localVarBuff_message_id);




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
                    "DELETE");

    if (apiClient->response_code == 200) {
        printf("%s\n","Success.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad request.");
    }
    //nonprimitive not container
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_message_id);
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

// Render message
//
// Render a message to HTML.  `POST {{ api_url }}/v1/messages/render` 
//
json_success_base_t*
MessagesAPI_renderMessage(apiClient_t *apiClient, char * content )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/render")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/render");




    // query parameters
    char *keyQuery_content = NULL;
    char * valueQuery_content = NULL;
    keyValuePair_t *keyPairQuery_content = 0;
    if (content)
    {
        keyQuery_content = strdup("content");
        valueQuery_content = strdup((content));
        keyPairQuery_content = keyValuePair_create(keyQuery_content, valueQuery_content);
        list_addElement(localVarQueryParameters,keyPairQuery_content);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    if(keyQuery_content){
        free(keyQuery_content);
        keyQuery_content = NULL;
    }
    if(valueQuery_content){
        free(valueQuery_content);
        valueQuery_content = NULL;
    }
    if(keyPairQuery_content){
        keyValuePair_free(keyPairQuery_content);
        keyPairQuery_content = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Send a message
//
// Send a stream or a private message.  `POST {{ api_url }}/v1/messages` 
//
json_success_base_t*
MessagesAPI_sendMessage(apiClient_t *apiClient, zulip_rest_api_sendMessage_type_e type , list_t * to , char * content , char * topic , char * queue_id , char * local_id )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages");




    // query parameters
    char *keyQuery_type = NULL;
    zulip_rest_api_sendMessage_type_e valueQuery_type ;
    keyValuePair_t *keyPairQuery_type = 0;
    if (type)
    {
        keyQuery_type = strdup("type");
        valueQuery_type = (type);
        keyPairQuery_type = keyValuePair_create(keyQuery_type, (void *)strdup(sendMessage_TYPE_ToString(
		valueQuery_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_type);
    }

    // query parameters
    if (to)
    {
        list_addElement(localVarQueryParameters,to);
    }

    // query parameters
    char *keyQuery_content = NULL;
    char * valueQuery_content = NULL;
    keyValuePair_t *keyPairQuery_content = 0;
    if (content)
    {
        keyQuery_content = strdup("content");
        valueQuery_content = strdup((content));
        keyPairQuery_content = keyValuePair_create(keyQuery_content, valueQuery_content);
        list_addElement(localVarQueryParameters,keyPairQuery_content);
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
    char *keyQuery_queue_id = NULL;
    char * valueQuery_queue_id = NULL;
    keyValuePair_t *keyPairQuery_queue_id = 0;
    if (queue_id)
    {
        keyQuery_queue_id = strdup("queue_id");
        valueQuery_queue_id = strdup((queue_id));
        keyPairQuery_queue_id = keyValuePair_create(keyQuery_queue_id, valueQuery_queue_id);
        list_addElement(localVarQueryParameters,keyPairQuery_queue_id);
    }

    // query parameters
    char *keyQuery_local_id = NULL;
    char * valueQuery_local_id = NULL;
    keyValuePair_t *keyPairQuery_local_id = 0;
    if (local_id)
    {
        keyQuery_local_id = strdup("local_id");
        valueQuery_local_id = strdup((local_id));
        keyPairQuery_local_id = keyValuePair_create(keyQuery_local_id, valueQuery_local_id);
        list_addElement(localVarQueryParameters,keyPairQuery_local_id);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    if(keyQuery_content){
        free(keyQuery_content);
        keyQuery_content = NULL;
    }
    if(valueQuery_content){
        free(valueQuery_content);
        valueQuery_content = NULL;
    }
    if(keyPairQuery_content){
        keyValuePair_free(keyPairQuery_content);
        keyPairQuery_content = NULL;
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
    if(keyQuery_queue_id){
        free(keyQuery_queue_id);
        keyQuery_queue_id = NULL;
    }
    if(valueQuery_queue_id){
        free(valueQuery_queue_id);
        valueQuery_queue_id = NULL;
    }
    if(keyPairQuery_queue_id){
        keyValuePair_free(keyPairQuery_queue_id);
        keyPairQuery_queue_id = NULL;
    }
    if(keyQuery_local_id){
        free(keyQuery_local_id);
        keyQuery_local_id = NULL;
    }
    if(valueQuery_local_id){
        free(valueQuery_local_id);
        valueQuery_local_id = NULL;
    }
    if(keyPairQuery_local_id){
        keyValuePair_free(keyPairQuery_local_id);
        keyPairQuery_local_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Edit a message
//
// Edit/update the content or topic of a message.  `PATCH {{ api_url }}/v1/messages/{msg_id}`  `{msg_id}` in the above URL should be replaced with the ID of the message you wish you update.  You can [resolve topics](/help/resolve-a-topic) by editing the topic to `✔ {original_topic}`.  **Note**: See [configuring message editing][config-message-editing] for detailed documentation on when users are allowed to edit topics.  [config-message-editing]: /help/configure-message-editing-and-deletion 
//
json_success_t*
MessagesAPI_updateMessage(apiClient_t *apiClient, int message_id , char * topic , zulip_rest_api_updateMessage_propagate_mode_e propagate_mode , int send_notification_to_old_thread , int send_notification_to_new_thread , char * content , int stream_id )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/{message_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/{message_id}");


    // Path Params
    long sizeOfPathParams_message_id =  + strlen("{ message_id }");
    if(message_id == 0){
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    snprintf(localVarToReplace_message_id, sizeOfPathParams_message_id, "{%s}", "message_id");

    char localVarBuff_message_id[256];
    intToStr(localVarBuff_message_id, message_id);

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, localVarBuff_message_id);




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
    char *keyQuery_propagate_mode = NULL;
    zulip_rest_api_updateMessage_propagate_mode_e valueQuery_propagate_mode ;
    keyValuePair_t *keyPairQuery_propagate_mode = 0;
    if (propagate_mode)
    {
        keyQuery_propagate_mode = strdup("propagate_mode");
        valueQuery_propagate_mode = (propagate_mode);
        keyPairQuery_propagate_mode = keyValuePair_create(keyQuery_propagate_mode, (void *)strdup(updateMessage_PROPAGATEMODE_ToString(
		valueQuery_propagate_mode)));
        list_addElement(localVarQueryParameters,keyPairQuery_propagate_mode);
    }

    // query parameters
    char *keyQuery_send_notification_to_old_thread = NULL;
    char * valueQuery_send_notification_to_old_thread = NULL;
    keyValuePair_t *keyPairQuery_send_notification_to_old_thread = 0;
    if (send_notification_to_old_thread)
    {
        keyQuery_send_notification_to_old_thread = strdup("send_notification_to_old_thread");
        valueQuery_send_notification_to_old_thread = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_send_notification_to_old_thread, MAX_NUMBER_LENGTH, "%d", send_notification_to_old_thread);
        keyPairQuery_send_notification_to_old_thread = keyValuePair_create(keyQuery_send_notification_to_old_thread, valueQuery_send_notification_to_old_thread);
        list_addElement(localVarQueryParameters,keyPairQuery_send_notification_to_old_thread);
    }

    // query parameters
    char *keyQuery_send_notification_to_new_thread = NULL;
    char * valueQuery_send_notification_to_new_thread = NULL;
    keyValuePair_t *keyPairQuery_send_notification_to_new_thread = 0;
    if (send_notification_to_new_thread)
    {
        keyQuery_send_notification_to_new_thread = strdup("send_notification_to_new_thread");
        valueQuery_send_notification_to_new_thread = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_send_notification_to_new_thread, MAX_NUMBER_LENGTH, "%d", send_notification_to_new_thread);
        keyPairQuery_send_notification_to_new_thread = keyValuePair_create(keyQuery_send_notification_to_new_thread, valueQuery_send_notification_to_new_thread);
        list_addElement(localVarQueryParameters,keyPairQuery_send_notification_to_new_thread);
    }

    // query parameters
    char *keyQuery_content = NULL;
    char * valueQuery_content = NULL;
    keyValuePair_t *keyPairQuery_content = 0;
    if (content)
    {
        keyQuery_content = strdup("content");
        valueQuery_content = strdup((content));
        keyPairQuery_content = keyValuePair_create(keyQuery_content, valueQuery_content);
        list_addElement(localVarQueryParameters,keyPairQuery_content);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_t *elementToReturn = json_success_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    free(localVarToReplace_message_id);
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
    if(keyQuery_propagate_mode){
        free(keyQuery_propagate_mode);
        keyQuery_propagate_mode = NULL;
    }
    if(keyPairQuery_propagate_mode){
        keyValuePair_free(keyPairQuery_propagate_mode);
        keyPairQuery_propagate_mode = NULL;
    }
    if(keyQuery_send_notification_to_old_thread){
        free(keyQuery_send_notification_to_old_thread);
        keyQuery_send_notification_to_old_thread = NULL;
    }
    if(valueQuery_send_notification_to_old_thread){
        free(valueQuery_send_notification_to_old_thread);
        valueQuery_send_notification_to_old_thread = NULL;
    }
    if(keyPairQuery_send_notification_to_old_thread){
        keyValuePair_free(keyPairQuery_send_notification_to_old_thread);
        keyPairQuery_send_notification_to_old_thread = NULL;
    }
    if(keyQuery_send_notification_to_new_thread){
        free(keyQuery_send_notification_to_new_thread);
        keyQuery_send_notification_to_new_thread = NULL;
    }
    if(valueQuery_send_notification_to_new_thread){
        free(valueQuery_send_notification_to_new_thread);
        valueQuery_send_notification_to_new_thread = NULL;
    }
    if(keyPairQuery_send_notification_to_new_thread){
        keyValuePair_free(keyPairQuery_send_notification_to_new_thread);
        keyPairQuery_send_notification_to_new_thread = NULL;
    }
    if(keyQuery_content){
        free(keyQuery_content);
        keyQuery_content = NULL;
    }
    if(valueQuery_content){
        free(valueQuery_content);
        valueQuery_content = NULL;
    }
    if(keyPairQuery_content){
        keyValuePair_free(keyPairQuery_content);
        keyPairQuery_content = NULL;
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
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update personal message flags
//
// Add or remove personal message flags like `read` and `starred` on a collection of message IDs.  `POST {{ api_url }}/v1/messages/flags`  For updating the `read` flag on common collections of messages, see also the [special endpoints for marking message as read in bulk](/api/mark-all-as-read). 
//
json_success_base_t*
MessagesAPI_updateMessageFlags(apiClient_t *apiClient, list_t * messages , zulip_rest_api_updateMessageFlags_op_e op , char * flag )
{
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/messages/flags")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/messages/flags");




    // query parameters
    if (messages)
    {
        list_addElement(localVarQueryParameters,messages);
    }

    // query parameters
    char *keyQuery_op = NULL;
    zulip_rest_api_updateMessageFlags_op_e valueQuery_op ;
    keyValuePair_t *keyPairQuery_op = 0;
    if (op)
    {
        keyQuery_op = strdup("op");
        valueQuery_op = (op);
        keyPairQuery_op = keyValuePair_create(keyQuery_op, (void *)strdup(updateMessageFlags_OP_ToString(
		valueQuery_op)));
        list_addElement(localVarQueryParameters,keyPairQuery_op);
    }

    // query parameters
    char *keyQuery_flag = NULL;
    char * valueQuery_flag = NULL;
    keyValuePair_t *keyPairQuery_flag = 0;
    if (flag)
    {
        keyQuery_flag = strdup("flag");
        valueQuery_flag = strdup((flag));
        keyPairQuery_flag = keyValuePair_create(keyQuery_flag, valueQuery_flag);
        list_addElement(localVarQueryParameters,keyPairQuery_flag);
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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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
    if(keyQuery_op){
        free(keyQuery_op);
        keyQuery_op = NULL;
    }
    if(keyPairQuery_op){
        keyValuePair_free(keyPairQuery_op);
        keyPairQuery_op = NULL;
    }
    if(keyQuery_flag){
        free(keyQuery_flag);
        keyQuery_flag = NULL;
    }
    if(valueQuery_flag){
        free(valueQuery_flag);
        valueQuery_flag = NULL;
    }
    if(keyPairQuery_flag){
        keyValuePair_free(keyPairQuery_flag);
        keyPairQuery_flag = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Upload a file
//
// Upload a single file and get the corresponding URI.  `POST {{ api_url }}/v1/user_uploads`  Initially, only you will be able to access the link.  To share the uploaded file, you'll need to [send a message][send-message] containing the resulting link.  Users who can already access the link can reshare it with other users by sending additional Zulip messages containing the link.  [uploaded-files]: /help/manage-your-uploaded-files [send-message]: /api/send-message 
//
json_success_base_t*
MessagesAPI_uploadFile(apiClient_t *apiClient, binary_t* filename )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_create();
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user_uploads")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user_uploads");




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
    cJSON *MessagesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    json_success_base_t *elementToReturn = json_success_base_parseFromJSON(MessagesAPIlocalVarJSON);
    cJSON_Delete(MessagesAPIlocalVarJSON);
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

