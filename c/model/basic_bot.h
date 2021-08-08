/*
 * basic_bot.h
 *
 * 
 */

#ifndef _basic_bot_H_
#define _basic_bot_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct basic_bot_t basic_bot_t;

#include "any_type.h"
#include "basic_bot_all_of.h"
#include "basic_bot_base.h"



typedef struct basic_bot_t {

} basic_bot_t;

basic_bot_t *basic_bot_create(
);

void basic_bot_free(basic_bot_t *basic_bot);

basic_bot_t *basic_bot_parseFromJSON(cJSON *basic_botJSON);

cJSON *basic_bot_convertToJSON(basic_bot_t *basic_bot);

#endif /* _basic_bot_H_ */

