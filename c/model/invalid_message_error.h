/*
 * invalid_message_error.h
 *
 * 
 */

#ifndef _invalid_message_error_H_
#define _invalid_message_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invalid_message_error_t invalid_message_error_t;

#include "any_type.h"
#include "invalid_message_error_all_of.h"
#include "json_success_base.h"



typedef struct invalid_message_error_t {
    char *raw_content; // string

} invalid_message_error_t;

invalid_message_error_t *invalid_message_error_create(
    char *raw_content
);

void invalid_message_error_free(invalid_message_error_t *invalid_message_error);

invalid_message_error_t *invalid_message_error_parseFromJSON(cJSON *invalid_message_errorJSON);

cJSON *invalid_message_error_convertToJSON(invalid_message_error_t *invalid_message_error);

#endif /* _invalid_message_error_H_ */

