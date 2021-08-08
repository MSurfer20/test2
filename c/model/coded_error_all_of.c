#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "coded_error_all_of.h"



coded_error_all_of_t *coded_error_all_of_create(
    ) {
    coded_error_all_of_t *coded_error_all_of_local_var = malloc(sizeof(coded_error_all_of_t));
    if (!coded_error_all_of_local_var) {
        return NULL;
    }
    coded_error_all_of_local_var->result = result;
    coded_error_all_of_local_var->msg = msg;
    coded_error_all_of_local_var->code = code;

    return coded_error_all_of_local_var;
}


void coded_error_all_of_free(coded_error_all_of_t *coded_error_all_of) {
    if(NULL == coded_error_all_of){
        return ;
    }
    listEntry_t *listEntry;
    free(coded_error_all_of);
}

cJSON *coded_error_all_of_convertToJSON(coded_error_all_of_t *coded_error_all_of) {
    cJSON *item = cJSON_CreateObject();

    // coded_error_all_of->result
    if(coded_error_all_of->result) { 
     } 


    // coded_error_all_of->msg
    if(coded_error_all_of->msg) { 
     } 


    // coded_error_all_of->code
    if(coded_error_all_of->code) { 
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

coded_error_all_of_t *coded_error_all_of_parseFromJSON(cJSON *coded_error_all_ofJSON){

    coded_error_all_of_t *coded_error_all_of_local_var = NULL;

    // coded_error_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(coded_error_all_ofJSON, "result");
    }

    // coded_error_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(coded_error_all_ofJSON, "msg");
    }

    // coded_error_all_of->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(coded_error_all_ofJSON, "code");
    }


    coded_error_all_of_local_var = coded_error_all_of_create (
        );

    return coded_error_all_of_local_var;
end:
    return NULL;

}
