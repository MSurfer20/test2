#ifndef messages_base_TEST
#define messages_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define messages_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/messages_base.h"
messages_base_t* instantiate_messages_base(int include_optional);

#include "test_one_ofstringarray.c"


messages_base_t* instantiate_messages_base(int include_optional) {
  messages_base_t* messages_base = NULL;
  if (include_optional) {
    messages_base = messages_base_create(
      "0",
      "0",
      "0",
      "0",
      null,
      56,
      1,
      list_create(),
      56,
      "0",
      "0",
      56,
      "0",
      56,
      "0",
      list_create(),
      list_create(),
      56,
      "0"
    );
  } else {
    messages_base = messages_base_create(
      "0",
      "0",
      "0",
      "0",
      null,
      56,
      1,
      list_create(),
      56,
      "0",
      "0",
      56,
      "0",
      56,
      "0",
      list_create(),
      list_create(),
      56,
      "0"
    );
  }

  return messages_base;
}


#ifdef messages_base_MAIN

void test_messages_base(int include_optional) {
    messages_base_t* messages_base_1 = instantiate_messages_base(include_optional);

	cJSON* jsonmessages_base_1 = messages_base_convertToJSON(messages_base_1);
	printf("messages_base :\n%s\n", cJSON_Print(jsonmessages_base_1));
	messages_base_t* messages_base_2 = messages_base_parseFromJSON(jsonmessages_base_1);
	cJSON* jsonmessages_base_2 = messages_base_convertToJSON(messages_base_2);
	printf("repeating messages_base:\n%s\n", cJSON_Print(jsonmessages_base_2));
}

int main() {
  test_messages_base(1);
  test_messages_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // messages_base_MAIN
#endif // messages_base_TEST
