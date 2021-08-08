#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "non_existing_stream_error.h"



non_existing_stream_error_t *non_existing_stream_error_create(
    char *stream
    ) {
    non_existing_stream_error_t *non_existing_stream_error_local_var = malloc(sizeof(non_existing_stream_error_t));
    if (!non_existing_stream_error_local_var) {
        return NULL;
    }
    non_existing_stream_error_local_var->result = result;
    non_existing_stream_error_local_var->msg = msg;
    non_existing_stream_error_local_var->code = code;
    non_existing_stream_error_local_var->stream = stream;

    return non_existing_stream_error_local_var;
}


void non_existing_stream_error_free(non_existing_stream_error_t *non_existing_stream_error) {
    if(NULL == non_existing_stream_error){
        return ;
    }
    listEntry_t *listEntry;
    if (non_existing_stream_error->stream) {
        free(non_existing_stream_error->stream);
        non_existing_stream_error->stream = NULL;
    }
    free(non_existing_stream_error);
}

cJSON *non_existing_stream_error_convertToJSON(non_existing_stream_error_t *non_existing_stream_error) {
    cJSON *item = cJSON_CreateObject();

    // non_existing_stream_error->result
    if (!non_existing_stream_error->result) {
        goto fail;
    }
    


    // non_existing_stream_error->msg
    if (!non_existing_stream_error->msg) {
        goto fail;
    }
    


    // non_existing_stream_error->code
    if(non_existing_stream_error->code) { 
     } 


    // non_existing_stream_error->stream
    if(non_existing_stream_error->stream) { 
    if(cJSON_AddStringToObject(item, "stream", non_existing_stream_error->stream) == NULL) {
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

non_existing_stream_error_t *non_existing_stream_error_parseFromJSON(cJSON *non_existing_stream_errorJSON){

    non_existing_stream_error_t *non_existing_stream_error_local_var = NULL;

    // non_existing_stream_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(non_existing_stream_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // non_existing_stream_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(non_existing_stream_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // non_existing_stream_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(non_existing_stream_errorJSON, "code");
    }

    // non_existing_stream_error->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(non_existing_stream_errorJSON, "stream");
    if (stream) { 
    if(!cJSON_IsString(stream))
    {
    goto end; //String
    }
    }


    non_existing_stream_error_local_var = non_existing_stream_error_create (
        stream ? strdup(stream->valuestring) : NULL
        );

    return non_existing_stream_error_local_var;
end:
    return NULL;

}
