#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "json_error.h"



json_error_t *json_error_create(
    ) {
    json_error_t *json_error_local_var = malloc(sizeof(json_error_t));
    if (!json_error_local_var) {
        return NULL;
    }
    json_error_local_var->result = result;
    json_error_local_var->msg = msg;

    return json_error_local_var;
}


void json_error_free(json_error_t *json_error) {
    if(NULL == json_error){
        return ;
    }
    listEntry_t *listEntry;
    free(json_error);
}

cJSON *json_error_convertToJSON(json_error_t *json_error) {
    cJSON *item = cJSON_CreateObject();

    // json_error->result
    if (!json_error->result) {
        goto fail;
    }
    


    // json_error->msg
    if (!json_error->msg) {
        goto fail;
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

json_error_t *json_error_parseFromJSON(cJSON *json_errorJSON){

    json_error_t *json_error_local_var = NULL;

    // json_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(json_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // json_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(json_errorJSON, "msg");
    if (!msg) {
        goto end;
    }



    json_error_local_var = json_error_create (
        );

    return json_error_local_var;
end:
    return NULL;

}
