/*
 * api_key_response.h
 *
 * 
 */

#ifndef _api_key_response_H_
#define _api_key_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_key_response_t api_key_response_t;

#include "any_type.h"
#include "api_key_response_all_of.h"
#include "json_success_base.h"



typedef struct api_key_response_t {
    char *api_key; // string
    char *email; // string

} api_key_response_t;

api_key_response_t *api_key_response_create(
    char *api_key,
    char *email
);

void api_key_response_free(api_key_response_t *api_key_response);

api_key_response_t *api_key_response_parseFromJSON(cJSON *api_key_responseJSON);

cJSON *api_key_response_convertToJSON(api_key_response_t *api_key_response);

#endif /* _api_key_response_H_ */

