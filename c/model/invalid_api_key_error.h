/*
 * invalid_api_key_error.h
 *
 * 
 */

#ifndef _invalid_api_key_error_H_
#define _invalid_api_key_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invalid_api_key_error_t invalid_api_key_error_t;

#include "any_type.h"
#include "json_error.h"



typedef struct invalid_api_key_error_t {

} invalid_api_key_error_t;

invalid_api_key_error_t *invalid_api_key_error_create(
);

void invalid_api_key_error_free(invalid_api_key_error_t *invalid_api_key_error);

invalid_api_key_error_t *invalid_api_key_error_parseFromJSON(cJSON *invalid_api_key_errorJSON);

cJSON *invalid_api_key_error_convertToJSON(invalid_api_key_error_t *invalid_api_key_error);

#endif /* _invalid_api_key_error_H_ */

