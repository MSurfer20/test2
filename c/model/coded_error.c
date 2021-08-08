#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "coded_error.h"



coded_error_t *coded_error_create(
    ) {
    coded_error_t *coded_error_local_var = malloc(sizeof(coded_error_t));
    if (!coded_error_local_var) {
        return NULL;
    }
    coded_error_local_var->result = result;
    coded_error_local_var->msg = msg;
    coded_error_local_var->code = code;

    return coded_error_local_var;
}


void coded_error_free(coded_error_t *coded_error) {
    if(NULL == coded_error){
        return ;
    }
    listEntry_t *listEntry;
    free(coded_error);
}

cJSON *coded_error_convertToJSON(coded_error_t *coded_error) {
    cJSON *item = cJSON_CreateObject();

    // coded_error->result
    if (!coded_error->result) {
        goto fail;
    }
    


    // coded_error->msg
    if (!coded_error->msg) {
        goto fail;
    }
    


    // coded_error->code
    if(coded_error->code) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

coded_error_t *coded_error_parseFromJSON(cJSON *coded_errorJSON){

    coded_error_t *coded_error_local_var = NULL;

    // coded_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(coded_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // coded_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(coded_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // coded_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(coded_errorJSON, "code");
    }


    coded_error_local_var = coded_error_create (
        );

    return coded_error_local_var;
end:
    return NULL;

}
