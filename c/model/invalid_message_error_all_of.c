#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invalid_message_error_all_of.h"



invalid_message_error_all_of_t *invalid_message_error_all_of_create(
    char *raw_content
    ) {
    invalid_message_error_all_of_t *invalid_message_error_all_of_local_var = malloc(sizeof(invalid_message_error_all_of_t));
    if (!invalid_message_error_all_of_local_var) {
        return NULL;
    }
    invalid_message_error_all_of_local_var->result = result;
    invalid_message_error_all_of_local_var->msg = msg;
    invalid_message_error_all_of_local_var->raw_content = raw_content;

    return invalid_message_error_all_of_local_var;
}


void invalid_message_error_all_of_free(invalid_message_error_all_of_t *invalid_message_error_all_of) {
    if(NULL == invalid_message_error_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (invalid_message_error_all_of->raw_content) {
        free(invalid_message_error_all_of->raw_content);
        invalid_message_error_all_of->raw_content = NULL;
    }
    free(invalid_message_error_all_of);
}

cJSON *invalid_message_error_all_of_convertToJSON(invalid_message_error_all_of_t *invalid_message_error_all_of) {
    cJSON *item = cJSON_CreateObject();

    // invalid_message_error_all_of->result
    if(invalid_message_error_all_of->result) { 
     } 


    // invalid_message_error_all_of->msg
    if(invalid_message_error_all_of->msg) { 
     } 


    // invalid_message_error_all_of->raw_content
    if(invalid_message_error_all_of->raw_content) { 
    if(cJSON_AddStringToObject(item, "raw_content", invalid_message_error_all_of->raw_content) == NULL) {
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

invalid_message_error_all_of_t *invalid_message_error_all_of_parseFromJSON(cJSON *invalid_message_error_all_ofJSON){

    invalid_message_error_all_of_t *invalid_message_error_all_of_local_var = NULL;

    // invalid_message_error_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(invalid_message_error_all_ofJSON, "result");
    }

    // invalid_message_error_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(invalid_message_error_all_ofJSON, "msg");
    }

    // invalid_message_error_all_of->raw_content
    cJSON *raw_content = cJSON_GetObjectItemCaseSensitive(invalid_message_error_all_ofJSON, "raw_content");
    if (raw_content) { 
    if(!cJSON_IsString(raw_content))
    {
    goto end; //String
    }
    }


    invalid_message_error_all_of_local_var = invalid_message_error_all_of_create (
        raw_content ? strdup(raw_content->valuestring) : NULL
        );

    return invalid_message_error_all_of_local_var;
end:
    return NULL;

}
