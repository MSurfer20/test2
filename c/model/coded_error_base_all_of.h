/*
 * coded_error_base_all_of.h
 *
 * 
 */

#ifndef _coded_error_base_all_of_H_
#define _coded_error_base_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct coded_error_base_all_of_t coded_error_base_all_of_t;

#include "any_type.h"



typedef struct coded_error_base_all_of_t {
    char *code; // string

} coded_error_base_all_of_t;

coded_error_base_all_of_t *coded_error_base_all_of_create(
    char *code
);

void coded_error_base_all_of_free(coded_error_base_all_of_t *coded_error_base_all_of);

coded_error_base_all_of_t *coded_error_base_all_of_parseFromJSON(cJSON *coded_error_base_all_ofJSON);

cJSON *coded_error_base_all_of_convertToJSON(coded_error_base_all_of_t *coded_error_base_all_of);

#endif /* _coded_error_base_all_of_H_ */

