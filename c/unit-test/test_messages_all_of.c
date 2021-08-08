#ifndef messages_all_of_TEST
#define messages_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define messages_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/messages_all_of.h"
messages_all_of_t* instantiate_messages_all_of(int include_optional);



messages_all_of_t* instantiate_messages_all_of(int include_optional) {
  messages_all_of_t* messages_all_of = NULL;
  if (include_optional) {
    messages_all_of = messages_all_of_create(
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
    messages_all_of = messages_all_of_create(
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

  return messages_all_of;
}


#ifdef messages_all_of_MAIN

void test_messages_all_of(int include_optional) {
    messages_all_of_t* messages_all_of_1 = instantiate_messages_all_of(include_optional);

	cJSON* jsonmessages_all_of_1 = messages_all_of_convertToJSON(messages_all_of_1);
	printf("messages_all_of :\n%s\n", cJSON_Print(jsonmessages_all_of_1));
	messages_all_of_t* messages_all_of_2 = messages_all_of_parseFromJSON(jsonmessages_all_of_1);
	cJSON* jsonmessages_all_of_2 = messages_all_of_convertToJSON(messages_all_of_2);
	printf("repeating messages_all_of:\n%s\n", cJSON_Print(jsonmessages_all_of_2));
}

int main() {
  test_messages_all_of(1);
  test_messages_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // messages_all_of_MAIN
#endif // messages_all_of_TEST
