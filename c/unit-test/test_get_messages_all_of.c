#ifndef get_messages_all_of_TEST
#define get_messages_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_messages_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_messages_all_of.h"
get_messages_all_of_t* instantiate_get_messages_all_of(int include_optional);



get_messages_all_of_t* instantiate_get_messages_all_of(int include_optional) {
  get_messages_all_of_t* get_messages_all_of = NULL;
  if (include_optional) {
    get_messages_all_of = get_messages_all_of_create(
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
      null,
      list_create(),
      56,
      "0",
      "0"
    );
  } else {
    get_messages_all_of = get_messages_all_of_create(
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
      null,
      list_create(),
      56,
      "0",
      "0"
    );
  }

  return get_messages_all_of;
}


#ifdef get_messages_all_of_MAIN

void test_get_messages_all_of(int include_optional) {
    get_messages_all_of_t* get_messages_all_of_1 = instantiate_get_messages_all_of(include_optional);

	cJSON* jsonget_messages_all_of_1 = get_messages_all_of_convertToJSON(get_messages_all_of_1);
	printf("get_messages_all_of :\n%s\n", cJSON_Print(jsonget_messages_all_of_1));
	get_messages_all_of_t* get_messages_all_of_2 = get_messages_all_of_parseFromJSON(jsonget_messages_all_of_1);
	cJSON* jsonget_messages_all_of_2 = get_messages_all_of_convertToJSON(get_messages_all_of_2);
	printf("repeating get_messages_all_of:\n%s\n", cJSON_Print(jsonget_messages_all_of_2));
}

int main() {
  test_get_messages_all_of(1);
  test_get_messages_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_messages_all_of_MAIN
#endif // get_messages_all_of_TEST
