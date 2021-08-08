#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "json_error_base.h"


char* resultjson_error_base_ToString(zulip_rest_api_json_error_base_RESULT_e result) {
    char* resultArray[] =  { "NULL", "error" };
	return resultArray[result];
}

zulip_rest_api_json_error_base_RESULT_e resultjson_error_base_FromString(char* result){
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

json_error_base_t *json_error_base_create(
    zulip_rest_api_json_error_base_RESULT_e result,
    char *msg
    ) {
    json_error_base_t *json_error_base_local_var = malloc(sizeof(json_error_base_t));
    if (!json_error_base_local_var) {
        return NULL;
    }
    json_error_base_local_var->result = result;
    json_error_base_local_var->msg = msg;

    return json_error_base_local_var;
}


void json_error_base_free(json_error_base_t *json_error_base) {
    if(NULL == json_error_base){
        return ;
    }
    listEntry_t *listEntry;
    if (json_error_base->msg) {
        free(json_error_base->msg);
        json_error_base->msg = NULL;
    }
    free(json_error_base);
}

cJSON *json_error_base_convertToJSON(json_error_base_t *json_error_base) {
    cJSON *item = cJSON_CreateObject();

    // json_error_base->result
    
    if(cJSON_AddStringToObject(item, "result", resultjson_error_base_ToString(json_error_base->result)) == NULL)
    {
    goto fail; //Enum
    }


    // json_error_base->msg
    if (!json_error_base->msg) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "msg", json_error_base->msg) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

json_error_base_t *json_error_base_parseFromJSON(cJSON *json_error_baseJSON){

    json_error_base_t *json_error_base_local_var = NULL;

    // json_error_base->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(json_error_baseJSON, "result");
    if (!result) {
        goto end;
    }

    zulip_rest_api_json_error_base_RESULT_e resultVariable;
    
    if(!cJSON_IsString(result))
    {
    goto end; //Enum
    }
    resultVariable = resultjson_error_base_FromString(result->valuestring);

    // json_error_base->msg
    cJSON *msg = cJSON_GetObjectItemCaseSensitive(json_error_baseJSON, "msg");
    if (!msg) {
        goto end;
    }

    
    if(!cJSON_IsString(msg))
    {
    goto end; //String
    }


    json_error_base_local_var = json_error_base_create (
        resultVariable,
        strdup(msg->valuestring)
        );

    return json_error_base_local_var;
end:
    return NULL;

}
