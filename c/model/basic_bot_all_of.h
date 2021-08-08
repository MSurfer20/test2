/*
 * basic_bot_all_of.h
 *
 * 
 */

#ifndef _basic_bot_all_of_H_
#define _basic_bot_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct basic_bot_all_of_t basic_bot_all_of_t;

#include "any_type.h"



typedef struct basic_bot_all_of_t {

} basic_bot_all_of_t;

basic_bot_all_of_t *basic_bot_all_of_create(
);

void basic_bot_all_of_free(basic_bot_all_of_t *basic_bot_all_of);

basic_bot_all_of_t *basic_bot_all_of_parseFromJSON(cJSON *basic_bot_all_ofJSON);

cJSON *basic_bot_all_of_convertToJSON(basic_bot_all_of_t *basic_bot_all_of);

#endif /* _basic_bot_all_of_H_ */

