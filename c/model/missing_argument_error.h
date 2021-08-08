/*
 * missing_argument_error.h
 *
 * 
 */

#ifndef _missing_argument_error_H_
#define _missing_argument_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct missing_argument_error_t missing_argument_error_t;

#include "any_type.h"
#include "coded_error_base.h"
#include "missing_argument_error_all_of.h"



typedef struct missing_argument_error_t {
    char *var_name; // string

} missing_argument_error_t;

missing_argument_error_t *missing_argument_error_create(
    char *var_name
);

void missing_argument_error_free(missing_argument_error_t *missing_argument_error);

missing_argument_error_t *missing_argument_error_parseFromJSON(cJSON *missing_argument_errorJSON);

cJSON *missing_argument_error_convertToJSON(missing_argument_error_t *missing_argument_error);

#endif /* _missing_argument_error_H_ */

