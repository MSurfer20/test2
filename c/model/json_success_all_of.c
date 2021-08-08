#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "json_success_all_of.h"



json_success_all_of_t *json_success_all_of_create(
    ) {
    json_success_all_of_t *json_success_all_of_local_var = malloc(sizeof(json_success_all_of_t));
    if (!json_success_all_of_local_var) {
        return NULL;
    }
    json_success_all_of_local_var->result = result;
    json_success_all_of_local_var->msg = msg;

    return json_success_all_of_local_var;
}


void json_success_all_of_free(json_success_all_of_t *json_success_all_of) {
    if(NULL == json_success_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(json_success_all_of);
}

cJSON *json_success_all_of_convertToJSON(json_success_all_of_t *json_success_all_of) {
    cJSON *item = cJSON_CreateObject();

    // json_success_all_of->result
    if(json_success_all_of->result) { 
     } 


    // json_success_all_of->msg
    if(json_success_all_of->msg) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

json_success_all_of_t *json_success_all_of_parseFromJSON(cJSON *json_success_all_ofJSON){

    json_success_all_of_t *json_success_all_of_local_var = NULL;

    // json_success_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(json_success_all_ofJSON, "result");
    }

    // json_success_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(json_success_all_ofJSON, "msg");
    }


    json_success_all_of_local_var = json_success_all_of_create (
        );

    return json_success_all_of_local_var;
end:
    return NULL;

}
