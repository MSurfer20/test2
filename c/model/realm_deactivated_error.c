#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realm_deactivated_error.h"



realm_deactivated_error_t *realm_deactivated_error_create(
    ) {
    realm_deactivated_error_t *realm_deactivated_error_local_var = malloc(sizeof(realm_deactivated_error_t));
    if (!realm_deactivated_error_local_var) {
        return NULL;
    }
    realm_deactivated_error_local_var->result = result;
    realm_deactivated_error_local_var->msg = msg;
    realm_deactivated_error_local_var->code = code;

    return realm_deactivated_error_local_var;
}


void realm_deactivated_error_free(realm_deactivated_error_t *realm_deactivated_error) {
    if(NULL == realm_deactivated_error){
        return ;
    }
    listEntry_t *listEntry;
    free(realm_deactivated_error);
}

cJSON *realm_deactivated_error_convertToJSON(realm_deactivated_error_t *realm_deactivated_error) {
    cJSON *item = cJSON_CreateObject();

    // realm_deactivated_error->result
    if (!realm_deactivated_error->result) {
        goto fail;
    }
    


    // realm_deactivated_error->msg
    if (!realm_deactivated_error->msg) {
        goto fail;
    }
    


    // realm_deactivated_error->code
    if(realm_deactivated_error->code) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realm_deactivated_error_t *realm_deactivated_error_parseFromJSON(cJSON *realm_deactivated_errorJSON){

    realm_deactivated_error_t *realm_deactivated_error_local_var = NULL;

    // realm_deactivated_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(realm_deactivated_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // realm_deactivated_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(realm_deactivated_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // realm_deactivated_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(realm_deactivated_errorJSON, "code");
    }


    realm_deactivated_error_local_var = realm_deactivated_error_create (
        );

    return realm_deactivated_error_local_var;
end:
    return NULL;

}
