/*
 * user_not_authorized_error.h
 *
 * 
 */

#ifndef _user_not_authorized_error_H_
#define _user_not_authorized_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_not_authorized_error_t user_not_authorized_error_t;

#include "any_type.h"
#include "coded_error.h"



typedef struct user_not_authorized_error_t {

} user_not_authorized_error_t;

user_not_authorized_error_t *user_not_authorized_error_create(
);

void user_not_authorized_error_free(user_not_authorized_error_t *user_not_authorized_error);

user_not_authorized_error_t *user_not_authorized_error_parseFromJSON(cJSON *user_not_authorized_errorJSON);

cJSON *user_not_authorized_error_convertToJSON(user_not_authorized_error_t *user_not_authorized_error);

#endif /* _user_not_authorized_error_H_ */

