/*
 * json_success_all_of.h
 *
 * 
 */

#ifndef _json_success_all_of_H_
#define _json_success_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct json_success_all_of_t json_success_all_of_t;

#include "any_type.h"



typedef struct json_success_all_of_t {

} json_success_all_of_t;

json_success_all_of_t *json_success_all_of_create(
);

void json_success_all_of_free(json_success_all_of_t *json_success_all_of);

json_success_all_of_t *json_success_all_of_parseFromJSON(cJSON *json_success_all_ofJSON);

cJSON *json_success_all_of_convertToJSON(json_success_all_of_t *json_success_all_of);

#endif /* _json_success_all_of_H_ */

