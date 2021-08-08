/*
 * json_error.h
 *
 * 
 */

#ifndef _json_error_H_
#define _json_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_error_t json_error_t;

#include "any_type.h"
#include "json_error_base.h"
#include "json_success_all_of.h"



typedef struct json_error_t {

} json_error_t;

json_error_t *json_error_create(
);

void json_error_free(json_error_t *json_error);

json_error_t *json_error_parseFromJSON(cJSON *json_errorJSON);

cJSON *json_error_convertToJSON(json_error_t *json_error);

#endif /* _json_error_H_ */

