#ifndef subscriptions_TEST
#define subscriptions_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define subscriptions_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/subscriptions.h"
subscriptions_t* instantiate_subscriptions(int include_optional);



subscriptions_t* instantiate_subscriptions(int include_optional) {
  subscriptions_t* subscriptions = NULL;
  if (include_optional) {
    subscriptions = subscriptions_create(
      56,
      "0",
      "0",
      "0",
      56,
      1,
      list_create(),
      1,
      1,
      1,
      1,
      1,
      1,
      "0",
      1,
      1,
      1,
      1,
      zulip_rest_api_subscriptions_ROLE_20,
      "0",
      56,
      56,
      1,
      56,
      56
    );
  } else {
    subscriptions = subscriptions_create(
      56,
      "0",
      "0",
      "0",
      56,
      1,
      list_create(),
      1,
      1,
      1,
      1,
      1,
      1,
      "0",
      1,
      1,
      1,
      1,
      zulip_rest_api_subscriptions_ROLE_20,
      "0",
      56,
      56,
      1,
      56,
      56
    );
  }

  return subscriptions;
}


#ifdef subscriptions_MAIN

void test_subscriptions(int include_optional) {
    subscriptions_t* subscriptions_1 = instantiate_subscriptions(include_optional);

	cJSON* jsonsubscriptions_1 = subscriptions_convertToJSON(subscriptions_1);
	printf("subscriptions :\n%s\n", cJSON_Print(jsonsubscriptions_1));
	subscriptions_t* subscriptions_2 = subscriptions_parseFromJSON(jsonsubscriptions_1);
	cJSON* jsonsubscriptions_2 = subscriptions_convertToJSON(subscriptions_2);
	printf("repeating subscriptions:\n%s\n", cJSON_Print(jsonsubscriptions_2));
}

int main() {
  test_subscriptions(1);
  test_subscriptions(0);

  printf("Hello world \n");
  return 0;
}

#endif // subscriptions_MAIN
#endif // subscriptions_TEST
