#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invalid_api_key_error.h"



invalid_api_key_error_t *invalid_api_key_error_create(
    ) {
    invalid_api_key_error_t *invalid_api_key_error_local_var = malloc(sizeof(invalid_api_key_error_t));
    if (!invalid_api_key_error_local_var) {
        return NULL;
    }
    invalid_api_key_error_local_var->result = result;
    invalid_api_key_error_local_var->msg = msg;

    return invalid_api_key_error_local_var;
}


void invalid_api_key_error_free(invalid_api_key_error_t *invalid_api_key_error) {
    if(NULL == invalid_api_key_error){
        return ;
    }
    listEntry_t *listEntry;
    free(invalid_api_key_error);
}

cJSON *invalid_api_key_error_convertToJSON(invalid_api_key_error_t *invalid_api_key_error) {
    cJSON *item = cJSON_CreateObject();

    // invalid_api_key_error->result
    if (!invalid_api_key_error->result) {
        goto fail;
    }
    


    // invalid_api_key_error->msg
    if (!invalid_api_key_error->msg) {
        goto fail;
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

invalid_api_key_error_t *invalid_api_key_error_parseFromJSON(cJSON *invalid_api_key_errorJSON){

    invalid_api_key_error_t *invalid_api_key_error_local_var = NULL;

    // invalid_api_key_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(invalid_api_key_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // invalid_api_key_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(invalid_api_key_errorJSON, "msg");
    if (!msg) {
        goto end;
    }



    invalid_api_key_error_local_var = invalid_api_key_error_create (
        );

    return invalid_api_key_error_local_var;
end:
    return NULL;

}
