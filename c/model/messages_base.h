/*
 * messages_base.h
 *
 * Object containing details of the message. 
 */

#ifndef _messages_base_H_
#define _messages_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct messages_base_t messages_base_t;

#include "emoji_reaction.h"
#include "messages_base_topic_links.h"
#include "one_ofstringarray.h"



typedef struct messages_base_t {
    char *avatar_url; // string
    char *client; // string
    char *content; // string
    char *content_type; // string
    struct one_ofstringarray_t *display_recipient; //model
    int id; //numeric
    int is_me_message; //boolean
    list_t *reactions; //nonprimitive container
    int recipient_id; //numeric
    char *sender_email; // string
    char *sender_full_name; // string
    int sender_id; //numeric
    char *sender_realm_str; // string
    int stream_id; //numeric
    char *subject; // string
    list_t *topic_links; //nonprimitive container
    list_t *submessages; //primitive container
    int timestamp; //numeric
    char *type; // string

} messages_base_t;

messages_base_t *messages_base_create(
    char *avatar_url,
    char *client,
    char *content,
    char *content_type,
    one_ofstringarray_t *display_recipient,
    int id,
    int is_me_message,
    list_t *reactions,
    int recipient_id,
    char *sender_email,
    char *sender_full_name,
    int sender_id,
    char *sender_realm_str,
    int stream_id,
    char *subject,
    list_t *topic_links,
    list_t *submessages,
    int timestamp,
    char *type
);

void messages_base_free(messages_base_t *messages_base);

messages_base_t *messages_base_parseFromJSON(cJSON *messages_baseJSON);

cJSON *messages_base_convertToJSON(messages_base_t *messages_base);

#endif /* _messages_base_H_ */

