#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_key_response.h"



api_key_response_t *api_key_response_create(
    char *api_key,
    char *email
    ) {
    api_key_response_t *api_key_response_local_var = malloc(sizeof(api_key_response_t));
    if (!api_key_response_local_var) {
        return NULL;
    }
    api_key_response_local_var->result = result;
    api_key_response_local_var->msg = msg;
    api_key_response_local_var->api_key = api_key;
    api_key_response_local_var->email = email;

    return api_key_response_local_var;
}


void api_key_response_free(api_key_response_t *api_key_response) {
    if(NULL == api_key_response){
        return ;
    }
    listEntry_t *listEntry;
    if (api_key_response->api_key) {
        free(api_key_response->api_key);
        api_key_response->api_key = NULL;
    }
    if (api_key_response->email) {
        free(api_key_response->email);
        api_key_response->email = NULL;
    }
    free(api_key_response);
}

cJSON *api_key_response_convertToJSON(api_key_response_t *api_key_response) {
    cJSON *item = cJSON_CreateObject();

    // api_key_response->result
    if (!api_key_response->result) {
        goto fail;
    }
    


    // api_key_response->msg
    if (!api_key_response->msg) {
        goto fail;
    }
    


    // api_key_response->api_key
    if (!api_key_response->api_key) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "api_key", api_key_response->api_key) == NULL) {
    goto fail; //String
    }


    // api_key_response->email
    if (!api_key_response->email) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "email", api_key_response->email) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

api_key_response_t *api_key_response_parseFromJSON(cJSON *api_key_responseJSON){

    api_key_response_t *api_key_response_local_var = NULL;

    // api_key_response->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(api_key_responseJSON, "result");
    if (!result) {
        goto end;
    }


    // api_key_response->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(api_key_responseJSON, "msg");
    if (!msg) {
        goto end;
    }


    // api_key_response->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(api_key_responseJSON, "api_key");
    if (!api_key) {
        goto end;
    }

    
    if(!cJSON_IsString(api_key))
    {
    goto end; //String
    }

    // api_key_response->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(api_key_responseJSON, "email");
    if (!email) {
        goto end;
    }

    
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }


    api_key_response_local_var = api_key_response_create (
        strdup(api_key->valuestring),
        strdup(email->valuestring)
        );

    return api_key_response_local_var;
end:
    return NULL;

}
