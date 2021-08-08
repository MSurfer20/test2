/*
 * coded_error_base.h
 *
 * 
 */

#ifndef _coded_error_base_H_
#define _coded_error_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct coded_error_base_t coded_error_base_t;

#include "any_type.h"
#include "coded_error_base_all_of.h"
#include "json_error_base.h"



typedef struct coded_error_base_t {
    char *code; // string

} coded_error_base_t;

coded_error_base_t *coded_error_base_create(
    char *code
);

void coded_error_base_free(coded_error_base_t *coded_error_base);

coded_error_base_t *coded_error_base_parseFromJSON(cJSON *coded_error_baseJSON);

cJSON *coded_error_base_convertToJSON(coded_error_base_t *coded_error_base);

#endif /* _coded_error_base_H_ */

