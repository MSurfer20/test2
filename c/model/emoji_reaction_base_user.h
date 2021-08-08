/*
 * emoji_reaction_base_user.h
 *
 * Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
 */

#ifndef _emoji_reaction_base_user_H_
#define _emoji_reaction_base_user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct emoji_reaction_base_user_t emoji_reaction_base_user_t;




typedef struct emoji_reaction_base_user_t {
    int id; //numeric
    char *email; // string
    char *full_name; // string
    int is_mirror_dummy; //boolean

} emoji_reaction_base_user_t;

emoji_reaction_base_user_t *emoji_reaction_base_user_create(
    int id,
    char *email,
    char *full_name,
    int is_mirror_dummy
);

void emoji_reaction_base_user_free(emoji_reaction_base_user_t *emoji_reaction_base_user);

emoji_reaction_base_user_t *emoji_reaction_base_user_parseFromJSON(cJSON *emoji_reaction_base_userJSON);

cJSON *emoji_reaction_base_user_convertToJSON(emoji_reaction_base_user_t *emoji_reaction_base_user);

#endif /* _emoji_reaction_base_user_H_ */

