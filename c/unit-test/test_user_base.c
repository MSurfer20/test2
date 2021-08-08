#ifndef user_base_TEST
#define user_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_base.h"
user_base_t* instantiate_user_base(int include_optional);



user_base_t* instantiate_user_base(int include_optional) {
  user_base_t* user_base = NULL;
  if (include_optional) {
    user_base = user_base_create(
      "0",
      1,
      "0",
      56,
      "0",
      1,
      1,
      1,
      zulip_rest_api_user_base_ROLE_100,
      56,
      56,
      56,
      1,
      1,
      "0",
      "0",
      "0",
      list_create()
    );
  } else {
    user_base = user_base_create(
      "0",
      1,
      "0",
      56,
      "0",
      1,
      1,
      1,
      zulip_rest_api_user_base_ROLE_100,
      56,
      56,
      56,
      1,
      1,
      "0",
      "0",
      "0",
      list_create()
    );
  }

  return user_base;
}


#ifdef user_base_MAIN

void test_user_base(int include_optional) {
    user_base_t* user_base_1 = instantiate_user_base(include_optional);

	cJSON* jsonuser_base_1 = user_base_convertToJSON(user_base_1);
	printf("user_base :\n%s\n", cJSON_Print(jsonuser_base_1));
	user_base_t* user_base_2 = user_base_parseFromJSON(jsonuser_base_1);
	cJSON* jsonuser_base_2 = user_base_convertToJSON(user_base_2);
	printf("repeating user_base:\n%s\n", cJSON_Print(jsonuser_base_2));
}

int main() {
  test_user_base(1);
  test_user_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_base_MAIN
#endif // user_base_TEST
