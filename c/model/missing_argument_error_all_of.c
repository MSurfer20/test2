#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "missing_argument_error_all_of.h"



missing_argument_error_all_of_t *missing_argument_error_all_of_create(
    char *var_name
    ) {
    missing_argument_error_all_of_t *missing_argument_error_all_of_local_var = malloc(sizeof(missing_argument_error_all_of_t));
    if (!missing_argument_error_all_of_local_var) {
        return NULL;
    }
    missing_argument_error_all_of_local_var->result = result;
    missing_argument_error_all_of_local_var->msg = msg;
    missing_argument_error_all_of_local_var->code = code;
    missing_argument_error_all_of_local_var->var_name = var_name;

    return missing_argument_error_all_of_local_var;
}


void missing_argument_error_all_of_free(missing_argument_error_all_of_t *missing_argument_error_all_of) {
    if(NULL == missing_argument_error_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (missing_argument_error_all_of->var_name) {
        free(missing_argument_error_all_of->var_name);
        missing_argument_error_all_of->var_name = NULL;
    }
    free(missing_argument_error_all_of);
}

cJSON *missing_argument_error_all_of_convertToJSON(missing_argument_error_all_of_t *missing_argument_error_all_of) {
    cJSON *item = cJSON_CreateObject();

    // missing_argument_error_all_of->result
    if(missing_argument_error_all_of->result) { 
     } 


    // missing_argument_error_all_of->msg
    if(missing_argument_error_all_of->msg) { 
     } 


    // missing_argument_error_all_of->code
    if(missing_argument_error_all_of->code) { 
     } 


    // missing_argument_error_all_of->var_name
    if(missing_argument_error_all_of->var_name) { 
    if(cJSON_AddStringToObject(item, "var_name", missing_argument_error_all_of->var_name) == NULL) {
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

missing_argument_error_all_of_t *missing_argument_error_all_of_parseFromJSON(cJSON *missing_argument_error_all_ofJSON){

    missing_argument_error_all_of_t *missing_argument_error_all_of_local_var = NULL;

    // missing_argument_error_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(missing_argument_error_all_ofJSON, "result");
    }

    // missing_argument_error_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(missing_argument_error_all_ofJSON, "msg");
    }

    // missing_argument_error_all_of->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(missing_argument_error_all_ofJSON, "code");
    }

    // missing_argument_error_all_of->var_name
    cJSON *var_name = cJSON_GetObjectItemCaseSensitive(missing_argument_error_all_ofJSON, "var_name");
    if (var_name) { 
    if(!cJSON_IsString(var_name))
    {
    goto end; //String
    }
    }


    missing_argument_error_all_of_local_var = missing_argument_error_all_of_create (
        var_name ? strdup(var_name->valuestring) : NULL
        );

    return missing_argument_error_all_of_local_var;
end:
    return NULL;

}
