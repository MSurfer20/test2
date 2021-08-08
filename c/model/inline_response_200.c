#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200.h"



inline_response_200_t *inline_response_200_create(
    char *bot_email,
    char *bot_full_name,
    char *data,
    char *trigger,
    char *token,
    messages_base_t *message
    ) {
    inline_response_200_t *inline_response_200_local_var = malloc(sizeof(inline_response_200_t));
    if (!inline_response_200_local_var) {
        return NULL;
    }
    inline_response_200_local_var->bot_email = bot_email;
    inline_response_200_local_var->bot_full_name = bot_full_name;
    inline_response_200_local_var->data = data;
    inline_response_200_local_var->trigger = trigger;
    inline_response_200_local_var->token = token;
    inline_response_200_local_var->message = message;

    return inline_response_200_local_var;
}


void inline_response_200_free(inline_response_200_t *inline_response_200) {
    if(NULL == inline_response_200){
        return ;
    }
    listEntry_t *listEntry;
    if (inline_response_200->bot_email) {
        free(inline_response_200->bot_email);
        inline_response_200->bot_email = NULL;
    }
    if (inline_response_200->bot_full_name) {
        free(inline_response_200->bot_full_name);
        inline_response_200->bot_full_name = NULL;
    }
    if (inline_response_200->data) {
        free(inline_response_200->data);
        inline_response_200->data = NULL;
    }
    if (inline_response_200->trigger) {
        free(inline_response_200->trigger);
        inline_response_200->trigger = NULL;
    }
    if (inline_response_200->token) {
        free(inline_response_200->token);
        inline_response_200->token = NULL;
    }
    if (inline_response_200->message) {
        messages_base_free(inline_response_200->message);
        inline_response_200->message = NULL;
    }
    free(inline_response_200);
}

cJSON *inline_response_200_convertToJSON(inline_response_200_t *inline_response_200) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200->bot_email
    if(inline_response_200->bot_email) { 
    if(cJSON_AddStringToObject(item, "bot_email", inline_response_200->bot_email) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200->bot_full_name
    if(inline_response_200->bot_full_name) { 
    if(cJSON_AddStringToObject(item, "bot_full_name", inline_response_200->bot_full_name) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200->data
    if(inline_response_200->data) { 
    if(cJSON_AddStringToObject(item, "data", inline_response_200->data) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200->trigger
    if(inline_response_200->trigger) { 
    if(cJSON_AddStringToObject(item, "trigger", inline_response_200->trigger) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200->token
    if(inline_response_200->token) { 
    if(cJSON_AddStringToObject(item, "token", inline_response_200->token) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200->message
    if(inline_response_200->message) { 
    cJSON *message_local_JSON = messages_base_convertToJSON(inline_response_200->message);
    if(message_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "message", message_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

inline_response_200_t *inline_response_200_parseFromJSON(cJSON *inline_response_200JSON){

    inline_response_200_t *inline_response_200_local_var = NULL;

    // inline_response_200->bot_email
    cJSON *bot_email = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "bot_email");
    if (bot_email) { 
    if(!cJSON_IsString(bot_email))
    {
    goto end; //String
    }
    }

    // inline_response_200->bot_full_name
    cJSON *bot_full_name = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "bot_full_name");
    if (bot_full_name) { 
    if(!cJSON_IsString(bot_full_name))
    {
    goto end; //String
    }
    }

    // inline_response_200->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "data");
    if (data) { 
    if(!cJSON_IsString(data))
    {
    goto end; //String
    }
    }

    // inline_response_200->trigger
    cJSON *trigger = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "trigger");
    if (trigger) { 
    if(!cJSON_IsString(trigger))
    {
    goto end; //String
    }
    }

    // inline_response_200->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "token");
    if (token) { 
    if(!cJSON_IsString(token))
    {
    goto end; //String
    }
    }

    // inline_response_200->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_200JSON, "message");
    messages_base_t *message_local_nonprim = NULL;
    if (message) { 
    message_local_nonprim = messages_base_parseFromJSON(message); //nonprimitive
    }


    inline_response_200_local_var = inline_response_200_create (
        bot_email ? strdup(bot_email->valuestring) : NULL,
        bot_full_name ? strdup(bot_full_name->valuestring) : NULL,
        data ? strdup(data->valuestring) : NULL,
        trigger ? strdup(trigger->valuestring) : NULL,
        token ? strdup(token->valuestring) : NULL,
        message ? message_local_nonprim : NULL
        );

    return inline_response_200_local_var;
end:
    if (message_local_nonprim) {
        messages_base_free(message_local_nonprim);
        message_local_nonprim = NULL;
    }
    return NULL;

}
