#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "coded_error_base.h"



coded_error_base_t *coded_error_base_create(
    char *code
    ) {
    coded_error_base_t *coded_error_base_local_var = malloc(sizeof(coded_error_base_t));
    if (!coded_error_base_local_var) {
        return NULL;
    }
    coded_error_base_local_var->result = result;
    coded_error_base_local_var->msg = msg;
    coded_error_base_local_var->code = code;

    return coded_error_base_local_var;
}


void coded_error_base_free(coded_error_base_t *coded_error_base) {
    if(NULL == coded_error_base){
        return ;
    }
    listEntry_t *listEntry;
    if (coded_error_base->code) {
        free(coded_error_base->code);
        coded_error_base->code = NULL;
    }
    free(coded_error_base);
}

cJSON *coded_error_base_convertToJSON(coded_error_base_t *coded_error_base) {
    cJSON *item = cJSON_CreateObject();

    // coded_error_base->result
    if (!coded_error_base->result) {
        goto fail;
    }
    


    // coded_error_base->msg
    if (!coded_error_base->msg) {
        goto fail;
    }
    


    // coded_error_base->code
    if(coded_error_base->code) { 
    if(cJSON_AddStringToObject(item, "code", coded_error_base->code) == NULL) {
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

coded_error_base_t *coded_error_base_parseFromJSON(cJSON *coded_error_baseJSON){

    coded_error_base_t *coded_error_base_local_var = NULL;

    // coded_error_base->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(coded_error_baseJSON, "result");
    if (!result) {
        goto end;
    }


    // coded_error_base->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(coded_error_baseJSON, "msg");
    if (!msg) {
        goto end;
    }


    // coded_error_base->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(coded_error_baseJSON, "code");
    if (code) { 
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }
    }


    coded_error_base_local_var = coded_error_base_create (
        code ? strdup(code->valuestring) : NULL
        );

    return coded_error_base_local_var;
end:
    return NULL;

}
