/*
 * json_success.h
 *
 * 
 */

#ifndef _json_success_H_
#define _json_success_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_success_t json_success_t;

#include "any_type.h"
#include "json_success_all_of.h"
#include "json_success_base.h"



typedef struct json_success_t {

} json_success_t;

json_success_t *json_success_create(
);

void json_success_free(json_success_t *json_success);

json_success_t *json_success_parseFromJSON(cJSON *json_successJSON);

cJSON *json_success_convertToJSON(json_success_t *json_success);

#endif /* _json_success_H_ */

