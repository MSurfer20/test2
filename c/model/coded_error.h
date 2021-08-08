/*
 * coded_error.h
 *
 * 
 */

#ifndef _coded_error_H_
#define _coded_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct coded_error_t coded_error_t;

#include "any_type.h"
#include "coded_error_all_of.h"
#include "coded_error_base.h"



typedef struct coded_error_t {

} coded_error_t;

coded_error_t *coded_error_create(
);

void coded_error_free(coded_error_t *coded_error);

coded_error_t *coded_error_parseFromJSON(cJSON *coded_errorJSON);

cJSON *coded_error_convertToJSON(coded_error_t *coded_error);

#endif /* _coded_error_H_ */

