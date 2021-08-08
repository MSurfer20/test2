/*
 * emoji_reaction.h
 *
 * 
 */

#ifndef _emoji_reaction_H_
#define _emoji_reaction_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct emoji_reaction_t emoji_reaction_t;

#include "any_type.h"
#include "emoji_reaction_all_of.h"
#include "emoji_reaction_base.h"



typedef struct emoji_reaction_t {

} emoji_reaction_t;

emoji_reaction_t *emoji_reaction_create(
);

void emoji_reaction_free(emoji_reaction_t *emoji_reaction);

emoji_reaction_t *emoji_reaction_parseFromJSON(cJSON *emoji_reactionJSON);

cJSON *emoji_reaction_convertToJSON(emoji_reaction_t *emoji_reaction);

#endif /* _emoji_reaction_H_ */

