/*
 * non_existing_stream_error_all_of.h
 *
 * 
 */

#ifndef _non_existing_stream_error_all_of_H_
#define _non_existing_stream_error_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct non_existing_stream_error_all_of_t non_existing_stream_error_all_of_t;

#include "any_type.h"



typedef struct non_existing_stream_error_all_of_t {
    char *stream; // string

} non_existing_stream_error_all_of_t;

non_existing_stream_error_all_of_t *non_existing_stream_error_all_of_create(
    char *stream
);

void non_existing_stream_error_all_of_free(non_existing_stream_error_all_of_t *non_existing_stream_error_all_of);

non_existing_stream_error_all_of_t *non_existing_stream_error_all_of_parseFromJSON(cJSON *non_existing_stream_error_all_ofJSON);

cJSON *non_existing_stream_error_all_of_convertToJSON(non_existing_stream_error_all_of_t *non_existing_stream_error_all_of);

#endif /* _non_existing_stream_error_all_of_H_ */

