/*
 * basic_stream.h
 *
 * 
 */

#ifndef _basic_stream_H_
#define _basic_stream_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct basic_stream_t basic_stream_t;

#include "any_type.h"
#include "basic_stream_all_of.h"
#include "basic_stream_base.h"



typedef struct basic_stream_t {

} basic_stream_t;

basic_stream_t *basic_stream_create(
);

void basic_stream_free(basic_stream_t *basic_stream);

basic_stream_t *basic_stream_parseFromJSON(cJSON *basic_streamJSON);

cJSON *basic_stream_convertToJSON(basic_stream_t *basic_stream);

#endif /* _basic_stream_H_ */

