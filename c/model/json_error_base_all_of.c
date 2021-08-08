#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "json_error_base_all_of.h"


char* resultjson_error_base_all_of_ToString(zulip_rest_api_json_error_base_all_of_RESULT_e result) {
    char* resultArray[] =  { "NULL", "error" };
	return resultArray[result];
}

zulip_rest_api_json_error_base_all_of_RESULT_e resultjson_error_base_all_of_FromString(char* result){
    int stringToReturn = 0;
    char *resultArray[] =  { "NULL", "error" };
    size_t sizeofArray = sizeof(resultArray) / sizeof(resultArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(result, resultArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

json_error_base_all_of_t *json_error_base_all_of_create(
    zulip_rest_api_json_error_base_all_of_RESULT_e result,
    char *msg
    ) {
    json_error_base_all_of_t *json_error_base_all_of_local_var = malloc(sizeof(json_error_base_all_of_t));
    if (!json_error_base_all_of_local_var) {
        return NULL;
    }
    json_error_base_all_of_local_var->result = result;
    json_error_base_all_of_local_var->msg = msg;

    return json_error_base_all_of_local_var;
}


void json_error_base_all_of_free(json_error_base_all_of_t *json_error_base_all_of) {
    if(NULL == json_error_base_all_of){
        return ;
    }
    listEntry_t *listEntry;
    if (json_error_base_all_of->msg) {
        free(json_error_base_all_of->msg);
        json_error_base_all_of->msg = NULL;
    }
    free(json_error_base_all_of);
}

cJSON *json_error_base_all_of_convertToJSON(json_error_base_all_of_t *json_error_base_all_of) {
    cJSON *item = cJSON_CreateObject();

    // json_error_base_all_of->result
    
    if(cJSON_AddStringToObject(item, "result", resultjson_error_base_all_of_ToString(json_error_base_all_of->result)) == NULL)
    {
    goto fail; //Enum
    }


    // json_error_base_all_of->msg
    if (!json_error_base_all_of->msg) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "msg", json_error_base_all_of->msg) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

json_error_base_all_of_t *json_error_base_all_of_parseFromJSON(cJSON *json_error_base_all_ofJSON){

    json_error_base_all_of_t *json_error_base_all_of_local_var = NULL;

    // json_error_base_all_of->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(json_error_base_all_ofJSON, "result");
    if (!result) {
        goto end;
    }

    zulip_rest_api_json_error_base_all_of_RESULT_e resultVariable;
    
    if(!cJSON_IsString(result))
    {
    goto end; //Enum
    }
    resultVariable = resultjson_error_base_all_of_FromString(result->valuestring);

    // json_error_base_all_of->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(json_error_base_all_ofJSON, "msg");
    if (!msg) {
        goto end;
    }

    
    if(!cJSON_IsString(msg))
    {
    goto end; //String
    }


    json_error_base_all_of_local_var = json_error_base_all_of_create (
        resultVariable,
        strdup(msg->valuestring)
        );

    return json_error_base_all_of_local_var;
end:
    return NULL;

}
