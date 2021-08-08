/*
 * user_deactivated_error.h
 *
 * 
 */

#ifndef _user_deactivated_error_H_
#define _user_deactivated_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_deactivated_error_t user_deactivated_error_t;

#include "any_type.h"
#include "coded_error.h"



typedef struct user_deactivated_error_t {

} user_deactivated_error_t;

user_deactivated_error_t *user_deactivated_error_create(
);

void user_deactivated_error_free(user_deactivated_error_t *user_deactivated_error);

user_deactivated_error_t *user_deactivated_error_parseFromJSON(cJSON *user_deactivated_errorJSON);

cJSON *user_deactivated_error_convertToJSON(user_deactivated_error_t *user_deactivated_error);

#endif /* _user_deactivated_error_H_ */

