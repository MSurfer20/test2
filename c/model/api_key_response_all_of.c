#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_key_response_all_of.h"



api_key_response_all_of_t *api_key_response_all_of_create(
    char *api_key,
    char *email
    ) {
    api_key_response_all_of_t *api_key_response_all_of_local_var = malloc(sizeof(api_key_response_all_of_t));
    if (!api_key_response_all_of_local_var) {
        return NULL;
    }
    api_key_response_all_of_local_var->result = result;
    api_key_response_all_of_local_var->msg = msg;
    api_key_response_all_of_local_var->api_key = api_key;
    api_key_response_all_of_local_var->email = email;

    return api_key_response_all_of_local_var;
}


void api_key_response_all_of_free(api_key_response_all_of_t *api_key_response_all_of) {
    if(NULL == api_key_response_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (api_key_response_all_of->api_key) {
        free(api_key_response_all_of->api_key);
        api_key_response_all_of->api_key = NULL;
    }
    if (api_key_response_all_of->email) {
        free(api_key_response_all_of->email);
        api_key_response_all_of->email = NULL;
    }
    free(api_key_response_all_of);
}

cJSON *api_key_response_all_of_convertToJSON(api_key_response_all_of_t *api_key_response_all_of) {
    cJSON *item = cJSON_CreateObject();

    // api_key_response_all_of->result
    if(api_key_response_all_of->result) { 
     } 


    // api_key_response_all_of->msg
    if(api_key_response_all_of->msg) { 
     } 


    // api_key_response_all_of->api_key
    if (!api_key_response_all_of->api_key) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "api_key", api_key_response_all_of->api_key) == NULL) {
    goto fail; //String
    }


    // api_key_response_all_of->email
    if (!api_key_response_all_of->email) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "email", api_key_response_all_of->email) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

api_key_response_all_of_t *api_key_response_all_of_parseFromJSON(cJSON *api_key_response_all_ofJSON){

    api_key_response_all_of_t *api_key_response_all_of_local_var = NULL;

    // api_key_response_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(api_key_response_all_ofJSON, "result");
    }

    // api_key_response_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(api_key_response_all_ofJSON, "msg");
    }

    // api_key_response_all_of->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(api_key_response_all_ofJSON, "api_key");
    if (!api_key) {
        goto end;
    }

    
    if(!cJSON_IsString(api_key))
    {
    goto end; //String
    }

    // api_key_response_all_of->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(api_key_response_all_ofJSON, "email");
    if (!email) {
        goto end;
    }

    
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }


    api_key_response_all_of_local_var = api_key_response_all_of_create (
        strdup(api_key->valuestring),
        strdup(email->valuestring)
        );

    return api_key_response_all_of_local_var;
end:
    return NULL;

}
