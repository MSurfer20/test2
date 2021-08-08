#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "json_success.h"



json_success_t *json_success_create(
    ) {
    json_success_t *json_success_local_var = malloc(sizeof(json_success_t));
    if (!json_success_local_var) {
        return NULL;
    }
    json_success_local_var->result = result;
    json_success_local_var->msg = msg;

    return json_success_local_var;
}


void json_success_free(json_success_t *json_success) {
    if(NULL == json_success){
        return ;
    }
    listEntry_t *listEntry;
    free(json_success);
}

cJSON *json_success_convertToJSON(json_success_t *json_success) {
    cJSON *item = cJSON_CreateObject();

    // json_success->result
    if (!json_success->result) {
        goto fail;
    }
    


    // json_success->msg
    if (!json_success->msg) {
        goto fail;
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

json_success_t *json_success_parseFromJSON(cJSON *json_successJSON){

    json_success_t *json_success_local_var = NULL;

    // json_success->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(json_successJSON, "result");
    if (!result) {
        goto end;
    }


    // json_success->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(json_successJSON, "msg");
    if (!msg) {
        goto end;
    }



    json_success_local_var = json_success_create (
        );

    return json_success_local_var;
end:
    return NULL;

}
