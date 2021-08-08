/*
 * json_success_base.h
 *
 * 
 */

#ifndef _json_success_base_H_
#define _json_success_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_success_base_t json_success_base_t;

#include "json_response_base.h"
#include "json_success_base_all_of.h"

// Enum RESULT for json_success_base

typedef enum  { zulip_rest_api_json_success_base_RESULT_NULL = 0, zulip_rest_api_json_success_base_RESULT_success } zulip_rest_api_json_success_base_RESULT_e;

char* json_success_base_result_ToString(zulip_rest_api_json_success_base_RESULT_e result);

zulip_rest_api_json_success_base_RESULT_e json_success_base_result_FromString(char* result);



typedef struct json_success_base_t {
    zulip_rest_api_json_success_base_RESULT_e result; //enum
    char *msg; // string

} json_success_base_t;

json_success_base_t *json_success_base_create(
    zulip_rest_api_json_success_base_RESULT_e result,
    char *msg
);

void json_success_base_free(json_success_base_t *json_success_base);

json_success_base_t *json_success_base_parseFromJSON(cJSON *json_success_baseJSON);

cJSON *json_success_base_convertToJSON(json_success_base_t *json_success_base);

#endif /* _json_success_base_H_ */

