/*
 * bot_all_of.h
 *
 * Object containing details of a bot. 
 */

#ifndef _bot_all_of_H_
#define _bot_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bot_all_of_t bot_all_of_t;

#include "any_type.h"



typedef struct bot_all_of_t {
    char *email; // string
    int bot_type; //numeric
    int is_active; //boolean

} bot_all_of_t;

bot_all_of_t *bot_all_of_create(
    char *email,
    int bot_type,
    int is_active
);

void bot_all_of_free(bot_all_of_t *bot_all_of);

bot_all_of_t *bot_all_of_parseFromJSON(cJSON *bot_all_ofJSON);

cJSON *bot_all_of_convertToJSON(bot_all_of_t *bot_all_of);

#endif /* _bot_all_of_H_ */

