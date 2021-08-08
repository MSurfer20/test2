#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "rate_limited_error.h"



rate_limited_error_t *rate_limited_error_create(
    ) {
    rate_limited_error_t *rate_limited_error_local_var = malloc(sizeof(rate_limited_error_t));
    if (!rate_limited_error_local_var) {
        return NULL;
    }
    rate_limited_error_local_var->result = result;
    rate_limited_error_local_var->msg = msg;
    rate_limited_error_local_var->code = code;

    return rate_limited_error_local_var;
}


void rate_limited_error_free(rate_limited_error_t *rate_limited_error) {
    if(NULL == rate_limited_error){
        return ;
    }
    listEntry_t *listEntry;
    free(rate_limited_error);
}

cJSON *rate_limited_error_convertToJSON(rate_limited_error_t *rate_limited_error) {
    cJSON *item = cJSON_CreateObject();

    // rate_limited_error->result
    if (!rate_limited_error->result) {
        goto fail;
    }
    


    // rate_limited_error->msg
    if (!rate_limited_error->msg) {
        goto fail;
    }
    


    // rate_limited_error->code
    if(rate_limited_error->code) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

rate_limited_error_t *rate_limited_error_parseFromJSON(cJSON *rate_limited_errorJSON){

    rate_limited_error_t *rate_limited_error_local_var = NULL;

    // rate_limited_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(rate_limited_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // rate_limited_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(rate_limited_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // rate_limited_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(rate_limited_errorJSON, "code");
    }


    rate_limited_error_local_var = rate_limited_error_create (
        );

    return rate_limited_error_local_var;
end:
    return NULL;

}
