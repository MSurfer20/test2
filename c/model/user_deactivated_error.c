#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_deactivated_error.h"



user_deactivated_error_t *user_deactivated_error_create(
    ) {
    user_deactivated_error_t *user_deactivated_error_local_var = malloc(sizeof(user_deactivated_error_t));
    if (!user_deactivated_error_local_var) {
        return NULL;
    }
    user_deactivated_error_local_var->result = result;
    user_deactivated_error_local_var->msg = msg;
    user_deactivated_error_local_var->code = code;

    return user_deactivated_error_local_var;
}


void user_deactivated_error_free(user_deactivated_error_t *user_deactivated_error) {
    if(NULL == user_deactivated_error){
        return ;
    }
    listEntry_t *listEntry;
    free(user_deactivated_error);
}

cJSON *user_deactivated_error_convertToJSON(user_deactivated_error_t *user_deactivated_error) {
    cJSON *item = cJSON_CreateObject();

    // user_deactivated_error->result
    if (!user_deactivated_error->result) {
        goto fail;
    }
    


    // user_deactivated_error->msg
    if (!user_deactivated_error->msg) {
        goto fail;
    }
    


    // user_deactivated_error->code
    if(user_deactivated_error->code) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_deactivated_error_t *user_deactivated_error_parseFromJSON(cJSON *user_deactivated_errorJSON){

    user_deactivated_error_t *user_deactivated_error_local_var = NULL;

    // user_deactivated_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(user_deactivated_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // user_deactivated_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(user_deactivated_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // user_deactivated_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(user_deactivated_errorJSON, "code");
    }


    user_deactivated_error_local_var = user_deactivated_error_create (
        );

    return user_deactivated_error_local_var;
end:
    return NULL;

}
