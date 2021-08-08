/*
 * non_existing_stream_error.h
 *
 * 
 */

#ifndef _non_existing_stream_error_H_
#define _non_existing_stream_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct non_existing_stream_error_t non_existing_stream_error_t;

#include "any_type.h"
#include "coded_error_base.h"
#include "non_existing_stream_error_all_of.h"



typedef struct non_existing_stream_error_t {
    char *stream; // string

} non_existing_stream_error_t;

non_existing_stream_error_t *non_existing_stream_error_create(
    char *stream
);

void non_existing_stream_error_free(non_existing_stream_error_t *non_existing_stream_error);

non_existing_stream_error_t *non_existing_stream_error_parseFromJSON(cJSON *non_existing_stream_errorJSON);

cJSON *non_existing_stream_error_convertToJSON(non_existing_stream_error_t *non_existing_stream_error);

#endif /* _non_existing_stream_error_H_ */

