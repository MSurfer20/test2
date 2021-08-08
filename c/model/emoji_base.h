/*
 * emoji_base.h
 *
 * 
 */

#ifndef _emoji_base_H_
#define _emoji_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct emoji_base_t emoji_base_t;




typedef struct emoji_base_t {
    char *emoji_code; // string
    char *emoji_name; // string
    char *reaction_type; // string

} emoji_base_t;

emoji_base_t *emoji_base_create(
    char *emoji_code,
    char *emoji_name,
    char *reaction_type
);

void emoji_base_free(emoji_base_t *emoji_base);

emoji_base_t *emoji_base_parseFromJSON(cJSON *emoji_baseJSON);

cJSON *emoji_base_convertToJSON(emoji_base_t *emoji_base);

#endif /* _emoji_base_H_ */

