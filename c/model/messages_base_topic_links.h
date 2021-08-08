/*
 * messages_base_topic_links.h
 *
 * 
 */

#ifndef _messages_base_topic_links_H_
#define _messages_base_topic_links_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct messages_base_topic_links_t messages_base_topic_links_t;




typedef struct messages_base_topic_links_t {
    char *text; // string
    char *url; // string

} messages_base_topic_links_t;

messages_base_topic_links_t *messages_base_topic_links_create(
    char *text,
    char *url
);

void messages_base_topic_links_free(messages_base_topic_links_t *messages_base_topic_links);

messages_base_topic_links_t *messages_base_topic_links_parseFromJSON(cJSON *messages_base_topic_linksJSON);

cJSON *messages_base_topic_links_convertToJSON(messages_base_topic_links_t *messages_base_topic_links);

#endif /* _messages_base_topic_links_H_ */

