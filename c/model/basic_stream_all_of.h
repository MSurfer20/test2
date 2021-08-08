/*
 * basic_stream_all_of.h
 *
 * 
 */

#ifndef _basic_stream_all_of_H_
#define _basic_stream_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct basic_stream_all_of_t basic_stream_all_of_t;

#include "any_type.h"



typedef struct basic_stream_all_of_t {

} basic_stream_all_of_t;

basic_stream_all_of_t *basic_stream_all_of_create(
);

void basic_stream_all_of_free(basic_stream_all_of_t *basic_stream_all_of);

basic_stream_all_of_t *basic_stream_all_of_parseFromJSON(cJSON *basic_stream_all_ofJSON);

cJSON *basic_stream_all_of_convertToJSON(basic_stream_all_of_t *basic_stream_all_of);

#endif /* _basic_stream_all_of_H_ */

