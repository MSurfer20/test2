/*
 * json_error_base.h
 *
 * 
 */

#ifndef _json_error_base_H_
#define _json_error_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_error_base_t json_error_base_t;

#include "json_error_base_all_of.h"
#include "json_response_base.h"

// Enum RESULT for json_error_base

typedef enum  { zulip_rest_api_json_error_base_RESULT_NULL = 0, zulip_rest_api_json_error_base_RESULT_error } zulip_rest_api_json_error_base_RESULT_e;

char* json_error_base_result_ToString(zulip_rest_api_json_error_base_RESULT_e result);

zulip_rest_api_json_error_base_RESULT_e json_error_base_result_FromString(char* result);



typedef struct json_error_base_t {
    zulip_rest_api_json_error_base_RESULT_e result; //enum
    char *msg; // string

} json_error_base_t;

json_error_base_t *json_error_base_create(
    zulip_rest_api_json_error_base_RESULT_e result,
    char *msg
);

void json_error_base_free(json_error_base_t *json_error_base);

json_error_base_t *json_error_base_parseFromJSON(cJSON *json_error_baseJSON);

cJSON *json_error_base_convertToJSON(json_error_base_t *json_error_base);

#endif /* _json_error_base_H_ */

