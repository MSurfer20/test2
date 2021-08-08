#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "non_existing_stream_error_all_of.h"



non_existing_stream_error_all_of_t *non_existing_stream_error_all_of_create(
    char *stream
    ) {
    non_existing_stream_error_all_of_t *non_existing_stream_error_all_of_local_var = malloc(sizeof(non_existing_stream_error_all_of_t));
    if (!non_existing_stream_error_all_of_local_var) {
        return NULL;
    }
    non_existing_stream_error_all_of_local_var->result = result;
    non_existing_stream_error_all_of_local_var->msg = msg;
    non_existing_stream_error_all_of_local_var->code = code;
    non_existing_stream_error_all_of_local_var->stream = stream;

    return non_existing_stream_error_all_of_local_var;
}


void non_existing_stream_error_all_of_free(non_existing_stream_error_all_of_t *non_existing_stream_error_all_of) {
    if(NULL == non_existing_stream_error_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (non_existing_stream_error_all_of->stream) {
        free(non_existing_stream_error_all_of->stream);
        non_existing_stream_error_all_of->stream = NULL;
    }
    free(non_existing_stream_error_all_of);
}

cJSON *non_existing_stream_error_all_of_convertToJSON(non_existing_stream_error_all_of_t *non_existing_stream_error_all_of) {
    cJSON *item = cJSON_CreateObject();

    // non_existing_stream_error_all_of->result
    if(non_existing_stream_error_all_of->result) { 
     } 


    // non_existing_stream_error_all_of->msg
    if(non_existing_stream_error_all_of->msg) { 
     } 


    // non_existing_stream_error_all_of->code
    if(non_existing_stream_error_all_of->code) { 
     } 


    // non_existing_stream_error_all_of->stream
    if(non_existing_stream_error_all_of->stream) { 
    if(cJSON_AddStringToObject(item, "stream", non_existing_stream_error_all_of->stream) == NULL) {
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

non_existing_stream_error_all_of_t *non_existing_stream_error_all_of_parseFromJSON(cJSON *non_existing_stream_error_all_ofJSON){

    non_existing_stream_error_all_of_t *non_existing_stream_error_all_of_local_var = NULL;

    // non_existing_stream_error_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(non_existing_stream_error_all_ofJSON, "result");
    }

    // non_existing_stream_error_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(non_existing_stream_error_all_ofJSON, "msg");
    }

    // non_existing_stream_error_all_of->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(non_existing_stream_error_all_ofJSON, "code");
    }

    // non_existing_stream_error_all_of->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(non_existing_stream_error_all_ofJSON, "stream");
    if (stream) { 
    if(!cJSON_IsString(stream))
    {
    goto end; //String
    }
    }


    non_existing_stream_error_all_of_local_var = non_existing_stream_error_all_of_create (
        stream ? strdup(stream->valuestring) : NULL
        );

    return non_existing_stream_error_all_of_local_var;
end:
    return NULL;

}
