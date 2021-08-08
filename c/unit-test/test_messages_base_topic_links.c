#ifndef messages_base_topic_links_TEST
#define messages_base_topic_links_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define messages_base_topic_links_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/messages_base_topic_links.h"
messages_base_topic_links_t* instantiate_messages_base_topic_links(int include_optional);



messages_base_topic_links_t* instantiate_messages_base_topic_links(int include_optional) {
  messages_base_topic_links_t* messages_base_topic_links = NULL;
  if (include_optional) {
    messages_base_topic_links = messages_base_topic_links_create(
      "0",
      "0"
    );
  } else {
    messages_base_topic_links = messages_base_topic_links_create(
      "0",
      "0"
    );
  }

  return messages_base_topic_links;
}


#ifdef messages_base_topic_links_MAIN

void test_messages_base_topic_links(int include_optional) {
    messages_base_topic_links_t* messages_base_topic_links_1 = instantiate_messages_base_topic_links(include_optional);

	cJSON* jsonmessages_base_topic_links_1 = messages_base_topic_links_convertToJSON(messages_base_topic_links_1);
	printf("messages_base_topic_links :\n%s\n", cJSON_Print(jsonmessages_base_topic_links_1));
	messages_base_topic_links_t* messages_base_topic_links_2 = messages_base_topic_links_parseFromJSON(jsonmessages_base_topic_links_1);
	cJSON* jsonmessages_base_topic_links_2 = messages_base_topic_links_convertToJSON(messages_base_topic_links_2);
	printf("repeating messages_base_topic_links:\n%s\n", cJSON_Print(jsonmessages_base_topic_links_2));
}

int main() {
  test_messages_base_topic_links(1);
  test_messages_base_topic_links(0);

  printf("Hello world \n");
  return 0;
}

#endif // messages_base_topic_links_MAIN
#endif // messages_base_topic_links_TEST
