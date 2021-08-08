/*
 * json_response_base.h
 *
 * 
 */

#ifndef _json_response_base_H_
#define _json_response_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_response_base_t json_response_base_t;




typedef struct json_response_base_t {
    char *result; // string

} json_response_base_t;

json_response_base_t *json_response_base_create(
    char *result
);

void json_response_base_free(json_response_base_t *json_response_base);

json_response_base_t *json_response_base_parseFromJSON(cJSON *json_response_baseJSON);

cJSON *json_response_base_convertToJSON(json_response_base_t *json_response_base);

#endif /* _json_response_base_H_ */

