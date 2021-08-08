/*
 * missing_argument_error_all_of.h
 *
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 */

#ifndef _missing_argument_error_all_of_H_
#define _missing_argument_error_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct missing_argument_error_all_of_t missing_argument_error_all_of_t;

#include "any_type.h"



typedef struct missing_argument_error_all_of_t {
    char *var_name; // string

} missing_argument_error_all_of_t;

missing_argument_error_all_of_t *missing_argument_error_all_of_create(
    char *var_name
);

void missing_argument_error_all_of_free(missing_argument_error_all_of_t *missing_argument_error_all_of);

missing_argument_error_all_of_t *missing_argument_error_all_of_parseFromJSON(cJSON *missing_argument_error_all_ofJSON);

cJSON *missing_argument_error_all_of_convertToJSON(missing_argument_error_all_of_t *missing_argument_error_all_of);

#endif /* _missing_argument_error_all_of_H_ */

