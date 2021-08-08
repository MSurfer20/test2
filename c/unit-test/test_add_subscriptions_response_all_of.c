#ifndef add_subscriptions_response_all_of_TEST
#define add_subscriptions_response_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_subscriptions_response_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_subscriptions_response_all_of.h"
add_subscriptions_response_all_of_t* instantiate_add_subscriptions_response_all_of(int include_optional);



add_subscriptions_response_all_of_t* instantiate_add_subscriptions_response_all_of(int include_optional) {
  add_subscriptions_response_all_of_t* add_subscriptions_response_all_of = NULL;
  if (include_optional) {
    add_subscriptions_response_all_of = add_subscriptions_response_all_of_create(
      null,
      null,
      list_create(),
      list_create(),
      list_create()
    );
  } else {
    add_subscriptions_response_all_of = add_subscriptions_response_all_of_create(
      null,
      null,
      list_create(),
      list_create(),
      list_create()
    );
  }

  return add_subscriptions_response_all_of;
}


#ifdef add_subscriptions_response_all_of_MAIN

void test_add_subscriptions_response_all_of(int include_optional) {
    add_subscriptions_response_all_of_t* add_subscriptions_response_all_of_1 = instantiate_add_subscriptions_response_all_of(include_optional);

	cJSON* jsonadd_subscriptions_response_all_of_1 = add_subscriptions_response_all_of_convertToJSON(add_subscriptions_response_all_of_1);
	printf("add_subscriptions_response_all_of :\n%s\n", cJSON_Print(jsonadd_subscriptions_response_all_of_1));
	add_subscriptions_response_all_of_t* add_subscriptions_response_all_of_2 = add_subscriptions_response_all_of_parseFromJSON(jsonadd_subscriptions_response_all_of_1);
	cJSON* jsonadd_subscriptions_response_all_of_2 = add_subscriptions_response_all_of_convertToJSON(add_subscriptions_response_all_of_2);
	printf("repeating add_subscriptions_response_all_of:\n%s\n", cJSON_Print(jsonadd_subscriptions_response_all_of_2));
}

int main() {
  test_add_subscriptions_response_all_of(1);
  test_add_subscriptions_response_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_subscriptions_response_all_of_MAIN
#endif // add_subscriptions_response_all_of_TEST
