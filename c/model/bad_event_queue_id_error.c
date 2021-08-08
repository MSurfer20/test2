#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bad_event_queue_id_error.h"



bad_event_queue_id_error_t *bad_event_queue_id_error_create(
    char *queue_id
    ) {
    bad_event_queue_id_error_t *bad_event_queue_id_error_local_var = malloc(sizeof(bad_event_queue_id_error_t));
    if (!bad_event_queue_id_error_local_var) {
        return NULL;
    }
    bad_event_queue_id_error_local_var->result = result;
    bad_event_queue_id_error_local_var->msg = msg;
    bad_event_queue_id_error_local_var->code = code;
    bad_event_queue_id_error_local_var->queue_id = queue_id;

    return bad_event_queue_id_error_local_var;
}


void bad_event_queue_id_error_free(bad_event_queue_id_error_t *bad_event_queue_id_error) {
    if(NULL == bad_event_queue_id_error){
        return ;
    }
    listEntry_t *listEntry;
    if (bad_event_queue_id_error->queue_id) {
        free(bad_event_queue_id_error->queue_id);
        bad_event_queue_id_error->queue_id = NULL;
    }
    free(bad_event_queue_id_error);
}

cJSON *bad_event_queue_id_error_convertToJSON(bad_event_queue_id_error_t *bad_event_queue_id_error) {
    cJSON *item = cJSON_CreateObject();

    // bad_event_queue_id_error->result
    if (!bad_event_queue_id_error->result) {
        goto fail;
    }
    


    // bad_event_queue_id_error->msg
    if (!bad_event_queue_id_error->msg) {
        goto fail;
    }
    


    // bad_event_queue_id_error->code
    if(bad_event_queue_id_error->code) { 
     } 


    // bad_event_queue_id_error->queue_id
    if(bad_event_queue_id_error->queue_id) { 
    if(cJSON_AddStringToObject(item, "queue_id", bad_event_queue_id_error->queue_id) == NULL) {
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

bad_event_queue_id_error_t *bad_event_queue_id_error_parseFromJSON(cJSON *bad_event_queue_id_errorJSON){

    bad_event_queue_id_error_t *bad_event_queue_id_error_local_var = NULL;

    // bad_event_queue_id_error->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_errorJSON, "result");
    if (!result) {
        goto end;
    }


    // bad_event_queue_id_error->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_errorJSON, "msg");
    if (!msg) {
        goto end;
    }


    // bad_event_queue_id_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_errorJSON, "code");
    }

    // bad_event_queue_id_error->queue_id
    cJSON *queue_id = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_errorJSON, "queue_id");
    if (queue_id) { 
    if(!cJSON_IsString(queue_id))
    {
    goto end; //String
    }
    }


    bad_event_queue_id_error_local_var = bad_event_queue_id_error_create (
        queue_id ? strdup(queue_id->valuestring) : NULL
        );

    return bad_event_queue_id_error_local_var;
end:
    return NULL;

}
