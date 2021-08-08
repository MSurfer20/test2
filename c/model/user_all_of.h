/*
 * user_all_of.h
 *
 * 
 */

#ifndef _user_all_of_H_
#define _user_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_all_of_t user_all_of_t;

#include "any_type.h"



typedef struct user_all_of_t {

} user_all_of_t;

user_all_of_t *user_all_of_create(
);

void user_all_of_free(user_all_of_t *user_all_of);

user_all_of_t *user_all_of_parseFromJSON(cJSON *user_all_ofJSON);

cJSON *user_all_of_convertToJSON(user_all_of_t *user_all_of);

#endif /* _user_all_of_H_ */

