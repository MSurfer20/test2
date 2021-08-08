#ifndef messages_TEST
#define messages_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define messages_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/messages.h"
messages_t* instantiate_messages(int include_optional);



messages_t* instantiate_messages(int include_optional) {
  messages_t* messages = NULL;
  if (include_optional) {
    messages = messages_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  } else {
    messages = messages_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }

  return messages;
}


#ifdef messages_MAIN

void test_messages(int include_optional) {
    messages_t* messages_1 = instantiate_messages(include_optional);

	cJSON* jsonmessages_1 = messages_convertToJSON(messages_1);
	printf("messages :\n%s\n", cJSON_Print(jsonmessages_1));
	messages_t* messages_2 = messages_parseFromJSON(jsonmessages_1);
	cJSON* jsonmessages_2 = messages_convertToJSON(messages_2);
	printf("repeating messages:\n%s\n", cJSON_Print(jsonmessages_2));
}

int main() {
  test_messages(1);
  test_messages(0);

  printf("Hello world \n");
  return 0;
}

#endif // messages_MAIN
#endif // messages_TEST
