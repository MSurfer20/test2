/*
 * json_error_base_all_of.h
 *
 * 
 */

#ifndef _json_error_base_all_of_H_
#define _json_error_base_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_error_base_all_of_t json_error_base_all_of_t;


// Enum RESULT for json_error_base_all_of

typedef enum  { zulip_rest_api_json_error_base_all_of_RESULT_NULL = 0, zulip_rest_api_json_error_base_all_of_RESULT_error } zulip_rest_api_json_error_base_all_of_RESULT_e;

char* json_error_base_all_of_result_ToString(zulip_rest_api_json_error_base_all_of_RESULT_e result);

zulip_rest_api_json_error_base_all_of_RESULT_e json_error_base_all_of_result_FromString(char* result);



typedef struct json_error_base_all_of_t {
    zulip_rest_api_json_error_base_all_of_RESULT_e result; //enum
    char *msg; // string

} json_error_base_all_of_t;

json_error_base_all_of_t *json_error_base_all_of_create(
    zulip_rest_api_json_error_base_all_of_RESULT_e result,
    char *msg
);

void json_error_base_all_of_free(json_error_base_all_of_t *json_error_base_all_of);

json_error_base_all_of_t *json_error_base_all_of_parseFromJSON(cJSON *json_error_base_all_ofJSON);

cJSON *json_error_base_all_of_convertToJSON(json_error_base_all_of_t *json_error_base_all_of);

#endif /* _json_error_base_all_of_H_ */

