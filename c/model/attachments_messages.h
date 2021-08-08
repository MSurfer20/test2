/*
 * attachments_messages.h
 *
 * 
 */

#ifndef _attachments_messages_H_
#define _attachments_messages_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct attachments_messages_t attachments_messages_t;




typedef struct attachments_messages_t {
    int date_sent; //numeric
    int id; //numeric

} attachments_messages_t;

attachments_messages_t *attachments_messages_create(
    int date_sent,
    int id
);

void attachments_messages_free(attachments_messages_t *attachments_messages);

attachments_messages_t *attachments_messages_parseFromJSON(cJSON *attachments_messagesJSON);

cJSON *attachments_messages_convertToJSON(attachments_messages_t *attachments_messages);

#endif /* _attachments_messages_H_ */

