#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invalid_message_error.h"



invalid_message_error_t *invalid_message_error_create(
    char *raw_content
    ) {
    invalid_message_error_t *invalid_message_error_local_var = malloc(sizeof(invalid_message_error_t));
    if (!invalid_message_error_local_var) {
        return NULL;
    }
    invalid_message_error_local_var->result = result;
    invalid_message_error_local_var->msg = msg;
    invalid_message_error_local_var->raw_content = raw_content;

    return invalid_message_error_local_var;
}


void invalid_message_error_free(invalid_message_error_t *invalid_message_error) {
    if(NULL == invalid_message_error){
        return ;
    }
    listEntry_t *listEntry;
    if (invalid_message_error->raw_content) {
        free(invalid_message_error->raw_content);
        invalid_message_error->raw_content = NULL;
    }
    free(invalid_message_error);
}

cJSON *invalid_message_error_convertToJSON(invalid_message_error_t *invalid_message_error) {
    cJSON *item = cJSON_CreateObject();

    // invalid_message_error->result
    if (!invalid_message_error->result) {
        goto fail;
    }
    


    // invalid_message_error->msg
    if (!invalid_message_error->msg) {
        goto fail;
    }
    


    // invalid_message_error->raw_content
    if(invalid_message_error->raw_content) { 
    if(cJSON_AddStringToObject(item, "raw_content", invalid_message_error->raw_content) == NULL) {
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

invalid_message_error_t *invalid_message_error_parseFromJSON(cJSON *invalid_message_errorJSON){

    invalid_message_error_t *invalid_message_error_local_var = NULL;

    // invalid_message_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(invalid_message_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // invalid_message_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(invalid_message_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // invalid_message_error->raw_content
    cJSON *raw_content = cJSON_GetObjectItemCaseSensitive(invalid_message_errorJSON, "raw_content");
    if (raw_content) { 
    if(!cJSON_IsString(raw_content))
    {
    goto end; //String
    }
    }


    invalid_message_error_local_var = invalid_message_error_create (
        raw_content ? strdup(raw_content->valuestring) : NULL
        );

    return invalid_message_error_local_var;
end:
    return NULL;

}
