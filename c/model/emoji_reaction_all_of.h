/*
 * emoji_reaction_all_of.h
 *
 * 
 */

#ifndef _emoji_reaction_all_of_H_
#define _emoji_reaction_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct emoji_reaction_all_of_t emoji_reaction_all_of_t;

#include "any_type.h"



typedef struct emoji_reaction_all_of_t {

} emoji_reaction_all_of_t;

emoji_reaction_all_of_t *emoji_reaction_all_of_create(
);

void emoji_reaction_all_of_free(emoji_reaction_all_of_t *emoji_reaction_all_of);

emoji_reaction_all_of_t *emoji_reaction_all_of_parseFromJSON(cJSON *emoji_reaction_all_ofJSON);

cJSON *emoji_reaction_all_of_convertToJSON(emoji_reaction_all_of_t *emoji_reaction_all_of);

#endif /* _emoji_reaction_all_of_H_ */

