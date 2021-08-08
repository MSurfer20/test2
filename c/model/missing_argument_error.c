#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "missing_argument_error.h"



missing_argument_error_t *missing_argument_error_create(
    char *var_name
    ) {
    missing_argument_error_t *missing_argument_error_local_var = malloc(sizeof(missing_argument_error_t));
    if (!missing_argument_error_local_var) {
        return NULL;
    }
    missing_argument_error_local_var->result = result;
    missing_argument_error_local_var->msg = msg;
    missing_argument_error_local_var->code = code;
    missing_argument_error_local_var->var_name = var_name;

    return missing_argument_error_local_var;
}


void missing_argument_error_free(missing_argument_error_t *missing_argument_error) {
    if(NULL == missing_argument_error){
        return ;
    }
    listEntry_t *listEntry;
    if (missing_argument_error->var_name) {
        free(missing_argument_error->var_name);
        missing_argument_error->var_name = NULL;
    }
    free(missing_argument_error);
}

cJSON *missing_argument_error_convertToJSON(missing_argument_error_t *missing_argument_error) {
    cJSON *item = cJSON_CreateObject();

    // missing_argument_error->result
    if (!missing_argument_error->result) {
        goto fail;
    }
    


    // missing_argument_error->msg
    if (!missing_argument_error->msg) {
        goto fail;
    }
    


    // missing_argument_error->code
    if(missing_argument_error->code) { 
     } 


    // missing_argument_error->var_name
    if(missing_argument_error->var_name) { 
    if(cJSON_AddStringToObject(item, "var_name", missing_argument_error->var_name) == NULL) {
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

missing_argument_error_t *missing_argument_error_parseFromJSON(cJSON *missing_argument_errorJSON){

    missing_argument_error_t *missing_argument_error_local_var = NULL;

    // missing_argument_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(missing_argument_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // missing_argument_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(missing_argument_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // missing_argument_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(missing_argument_errorJSON, "code");
    }

    // missing_argument_error->var_name
    cJSON *var_name = cJSON_GetObjectItemCaseSensitive(missing_argument_errorJSON, "var_name");
    if (var_name) { 
    if(!cJSON_IsString(var_name))
    {
    goto end; //String
    }
    }


    missing_argument_error_local_var = missing_argument_error_create (
        var_name ? strdup(var_name->valuestring) : NULL
        );

    return missing_argument_error_local_var;
end:
    return NULL;

}
