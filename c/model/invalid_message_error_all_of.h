/*
 * invalid_message_error_all_of.h
 *
 * 
 */

#ifndef _invalid_message_error_all_of_H_
#define _invalid_message_error_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invalid_message_error_all_of_t invalid_message_error_all_of_t;

#include "any_type.h"



typedef struct invalid_message_error_all_of_t {
    char *raw_content; // string

} invalid_message_error_all_of_t;

invalid_message_error_all_of_t *invalid_message_error_all_of_create(
    char *raw_content
);

void invalid_message_error_all_of_free(invalid_message_error_all_of_t *invalid_message_error_all_of);

invalid_message_error_all_of_t *invalid_message_error_all_of_parseFromJSON(cJSON *invalid_message_error_all_ofJSON);

cJSON *invalid_message_error_all_of_convertToJSON(invalid_message_error_all_of_t *invalid_message_error_all_of);

#endif /* _invalid_message_error_all_of_H_ */

