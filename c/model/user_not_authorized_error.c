#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_not_authorized_error.h"



user_not_authorized_error_t *user_not_authorized_error_create(
    ) {
    user_not_authorized_error_t *user_not_authorized_error_local_var = malloc(sizeof(user_not_authorized_error_t));
    if (!user_not_authorized_error_local_var) {
        return NULL;
    }
    user_not_authorized_error_local_var->result = result;
    user_not_authorized_error_local_var->msg = msg;
    user_not_authorized_error_local_var->code = code;

    return user_not_authorized_error_local_var;
}


void user_not_authorized_error_free(user_not_authorized_error_t *user_not_authorized_error) {
    if(NULL == user_not_authorized_error){
        return ;
    }
    listEntry_t *listEntry;
    free(user_not_authorized_error);
}

cJSON *user_not_authorized_error_convertToJSON(user_not_authorized_error_t *user_not_authorized_error) {
    cJSON *item = cJSON_CreateObject();

    // user_not_authorized_error->result
    if (!user_not_authorized_error->result) {
        goto fail;
    }
    


    // user_not_authorized_error->msg
    if (!user_not_authorized_error->msg) {
        goto fail;
    }
    


    // user_not_authorized_error->code
    if(user_not_authorized_error->code) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_not_authorized_error_t *user_not_authorized_error_parseFromJSON(cJSON *user_not_authorized_errorJSON){

    user_not_authorized_error_t *user_not_authorized_error_local_var = NULL;

    // user_not_authorized_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(user_not_authorized_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // user_not_authorized_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(user_not_authorized_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // user_not_authorized_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(user_not_authorized_errorJSON, "code");
    }


    user_not_authorized_error_local_var = user_not_authorized_error_create (
        );

    return user_not_authorized_error_local_var;
end:
    return NULL;

}
