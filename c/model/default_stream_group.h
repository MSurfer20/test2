/*
 * default_stream_group.h
 *
 * Dictionary containing details of a default stream group. 
 */

#ifndef _default_stream_group_H_
#define _default_stream_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct default_stream_group_t default_stream_group_t;

#include "basic_stream.h"



typedef struct default_stream_group_t {
    char *name; // string
    char *description; // string
    int id; //numeric
    list_t *streams; //nonprimitive container

} default_stream_group_t;

default_stream_group_t *default_stream_group_create(
    char *name,
    char *description,
    int id,
    list_t *streams
);

void default_stream_group_free(default_stream_group_t *default_stream_group);

default_stream_group_t *default_stream_group_parseFromJSON(cJSON *default_stream_groupJSON);

cJSON *default_stream_group_convertToJSON(default_stream_group_t *default_stream_group);

#endif /* _default_stream_group_H_ */

