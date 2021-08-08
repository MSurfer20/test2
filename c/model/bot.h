/*
 * bot.h
 *
 * 
 */

#ifndef _bot_H_
#define _bot_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bot_t bot_t;

#include "any_type.h"
#include "basic_bot_base.h"
#include "bot_all_of.h"



typedef struct bot_t {
    char *email; // string
    int bot_type; //numeric
    int is_active; //boolean

} bot_t;

bot_t *bot_create(
    char *email,
    int bot_type,
    int is_active
);

void bot_free(bot_t *bot);

bot_t *bot_parseFromJSON(cJSON *botJSON);

cJSON *bot_convertToJSON(bot_t *bot);

#endif /* _bot_H_ */

