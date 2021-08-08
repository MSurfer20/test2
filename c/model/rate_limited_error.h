/*
 * rate_limited_error.h
 *
 * 
 */

#ifndef _rate_limited_error_H_
#define _rate_limited_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct rate_limited_error_t rate_limited_error_t;

#include "any_type.h"
#include "coded_error.h"



typedef struct rate_limited_error_t {

} rate_limited_error_t;

rate_limited_error_t *rate_limited_error_create(
);

void rate_limited_error_free(rate_limited_error_t *rate_limited_error);

rate_limited_error_t *rate_limited_error_parseFromJSON(cJSON *rate_limited_errorJSON);

cJSON *rate_limited_error_convertToJSON(rate_limited_error_t *rate_limited_error);

#endif /* _rate_limited_error_H_ */

