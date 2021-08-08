/*
 * api_key_response_all_of.h
 *
 * 
 */

#ifndef _api_key_response_all_of_H_
#define _api_key_response_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct api_key_response_all_of_t api_key_response_all_of_t;

#include "any_type.h"



typedef struct api_key_response_all_of_t {
    char *api_key; // string
    char *email; // string

} api_key_response_all_of_t;

api_key_response_all_of_t *api_key_response_all_of_create(
    char *api_key,
    char *email
);

void api_key_response_all_of_free(api_key_response_all_of_t *api_key_response_all_of);

api_key_response_all_of_t *api_key_response_all_of_parseFromJSON(cJSON *api_key_response_all_ofJSON);

cJSON *api_key_response_all_of_convertToJSON(api_key_response_all_of_t *api_key_response_all_of);

#endif /* _api_key_response_all_of_H_ */

