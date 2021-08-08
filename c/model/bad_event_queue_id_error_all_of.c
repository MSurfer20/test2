#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "bad_event_queue_id_error_all_of.h"



bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of_create(
    char *queue_id
    ) {
    bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of_local_var = malloc(sizeof(bad_event_queue_id_error_all_of_t));
    if (!bad_event_queue_id_error_all_of_local_var) {
        return NULL;
    }
    bad_event_queue_id_error_all_of_local_var->result = result;
    bad_event_queue_id_error_all_of_local_var->msg = msg;
    bad_event_queue_id_error_all_of_local_var->code = code;
    bad_event_queue_id_error_all_of_local_var->queue_id = queue_id;

    return bad_event_queue_id_error_all_of_local_var;
}


void bad_event_queue_id_error_all_of_free(bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of) {
    if(NULL == bad_event_queue_id_error_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (bad_event_queue_id_error_all_of->queue_id) {
        free(bad_event_queue_id_error_all_of->queue_id);
        bad_event_queue_id_error_all_of->queue_id = NULL;
    }
    free(bad_event_queue_id_error_all_of);
}

cJSON *bad_event_queue_id_error_all_of_convertToJSON(bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of) {
    cJSON *item = cJSON_CreateObject();

    // bad_event_queue_id_error_all_of->result
    if(bad_event_queue_id_error_all_of->result) { 
     } 


    // bad_event_queue_id_error_all_of->msg
    if(bad_event_queue_id_error_all_of->msg) { 
     } 


    // bad_event_queue_id_error_all_of->code
    if(bad_event_queue_id_error_all_of->code) { 
     } 


    // bad_event_queue_id_error_all_of->queue_id
    if(bad_event_queue_id_error_all_of->queue_id) { 
    if(cJSON_AddStringToObject(item, "queue_id", bad_event_queue_id_error_all_of->queue_id) == NULL) {
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

bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of_parseFromJSON(cJSON *bad_event_queue_id_error_all_ofJSON){

    bad_event_queue_id_error_all_of_t *bad_event_queue_id_error_all_of_local_var = NULL;

    // bad_event_queue_id_error_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_error_all_ofJSON, "result");
    }

    // bad_event_queue_id_error_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_error_all_ofJSON, "msg");
    }

    // bad_event_queue_id_error_all_of->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_error_all_ofJSON, "code");
    }

    // bad_event_queue_id_error_all_of->queue_id
    cJSON *queue_id = cJSON_GetObjectItemCaseSensitive(bad_event_queue_id_error_all_ofJSON, "queue_id");
    if (queue_id) { 
    if(!cJSON_IsString(queue_id))
    {
    goto end; //String
    }
    }


    bad_event_queue_id_error_all_of_local_var = bad_event_queue_id_error_all_of_create (
        queue_id ? strdup(queue_id->valuestring) : NULL
        );

    return bad_event_queue_id_error_all_of_local_var;
end:
    return NULL;

}
