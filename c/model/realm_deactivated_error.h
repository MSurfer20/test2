/*
 * realm_deactivated_error.h
 *
 * 
 */

#ifndef _realm_deactivated_error_H_
#define _realm_deactivated_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realm_deactivated_error_t realm_deactivated_error_t;

#include "any_type.h"
#include "coded_error.h"



typedef struct realm_deactivated_error_t {

} realm_deactivated_error_t;

realm_deactivated_error_t *realm_deactivated_error_create(
);

void realm_deactivated_error_free(realm_deactivated_error_t *realm_deactivated_error);

realm_deactivated_error_t *realm_deactivated_error_parseFromJSON(cJSON *realm_deactivated_errorJSON);

cJSON *realm_deactivated_error_convertToJSON(realm_deactivated_error_t *realm_deactivated_error);

#endif /* _realm_deactivated_error_H_ */

