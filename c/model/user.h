/*
 * user.h
 *
 * 
 */

#ifndef _user_H_
#define _user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_t user_t;

#include "any_type.h"
#include "user_all_of.h"
#include "user_base.h"



typedef struct user_t {

} user_t;

user_t *user_create(
);

void user_free(user_t *user);

user_t *user_parseFromJSON(cJSON *userJSON);

cJSON *user_convertToJSON(user_t *user);

#endif /* _user_H_ */

