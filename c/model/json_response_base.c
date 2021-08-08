#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "json_response_base.h"



json_response_base_t *json_response_base_create(
    char *result
    ) {
    json_response_base_t *json_response_base_local_var = malloc(sizeof(json_response_base_t));
    if (!json_response_base_local_var) {
        return NULL;
    }
    json_response_base_local_var->result = result;

    return json_response_base_local_var;
}


void json_response_base_free(json_response_base_t *json_response_base) {
    if(NULL == json_response_base){
        return ;
    }
    listEntry_t *listEntry;
    if (json_response_base->result) {
        free(json_response_base->result);
        json_response_base->result = NULL;
    }
    free(json_response_base);
}

cJSON *json_response_base_convertToJSON(json_response_base_t *json_response_base) {
    cJSON *item = cJSON_CreateObject();

    // json_response_base->result
    if(json_response_base->result) { 
    if(cJSON_AddStringToObject(item, "result", json_response_base->result) == NULL) {
    goto fail; //String
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

json_response_base_t *json_response_base_parseFromJSON(cJSON *json_response_baseJSON){

    json_response_base_t *json_response_base_local_var = NULL;

    // json_response_base->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(json_response_baseJSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }


    json_response_base_local_var = json_response_base_create (
        result ? strdup(result->valuestring) : NULL
        );

    return json_response_base_local_var;
end:
    return NULL;

}
