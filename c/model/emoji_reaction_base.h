/*
 * emoji_reaction_base.h
 *
 * 
 */

#ifndef _emoji_reaction_base_H_
#define _emoji_reaction_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct emoji_reaction_base_t emoji_reaction_base_t;

#include "emoji_base.h"
#include "emoji_reaction_base_all_of.h"
#include "emoji_reaction_base_all_of_user.h"



typedef struct emoji_reaction_base_t {
    char *emoji_code; // string
    char *emoji_name; // string
    char *reaction_type; // string
    int user_id; //numeric
    struct emoji_reaction_base_all_of_user_t *user; //model

} emoji_reaction_base_t;

emoji_reaction_base_t *emoji_reaction_base_create(
    char *emoji_code,
    char *emoji_name,
    char *reaction_type,
    int user_id,
    emoji_reaction_base_all_of_user_t *user
);

void emoji_reaction_base_free(emoji_reaction_base_t *emoji_reaction_base);

emoji_reaction_base_t *emoji_reaction_base_parseFromJSON(cJSON *emoji_reaction_baseJSON);

cJSON *emoji_reaction_base_convertToJSON(emoji_reaction_base_t *emoji_reaction_base);

#endif /* _emoji_reaction_base_H_ */

