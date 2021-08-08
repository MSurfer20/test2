#ifndef add_subscriptions_response_TEST
#define add_subscriptions_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define add_subscriptions_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/add_subscriptions_response.h"
add_subscriptions_response_t* instantiate_add_subscriptions_response(int include_optional);



add_subscriptions_response_t* instantiate_add_subscriptions_response(int include_optional) {
  add_subscriptions_response_t* add_subscriptions_response = NULL;
  if (include_optional) {
    add_subscriptions_response = add_subscriptions_response_create(
      null,
      null,
      list_create(),
      list_create(),
      list_create()
    );
  } else {
    add_subscriptions_response = add_subscriptions_response_create(
      null,
      null,
      list_create(),
      list_create(),
      list_create()
    );
  }

  return add_subscriptions_response;
}


#ifdef add_subscriptions_response_MAIN

void test_add_subscriptions_response(int include_optional) {
    add_subscriptions_response_t* add_subscriptions_response_1 = instantiate_add_subscriptions_response(include_optional);

	cJSON* jsonadd_subscriptions_response_1 = add_subscriptions_response_convertToJSON(add_subscriptions_response_1);
	printf("add_subscriptions_response :\n%s\n", cJSON_Print(jsonadd_subscriptions_response_1));
	add_subscriptions_response_t* add_subscriptions_response_2 = add_subscriptions_response_parseFromJSON(jsonadd_subscriptions_response_1);
	cJSON* jsonadd_subscriptions_response_2 = add_subscriptions_response_convertToJSON(add_subscriptions_response_2);
	printf("repeating add_subscriptions_response:\n%s\n", cJSON_Print(jsonadd_subscriptions_response_2));
}

int main() {
  test_add_subscriptions_response(1);
  test_add_subscriptions_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // add_subscriptions_response_MAIN
#endif // add_subscriptions_response_TEST
