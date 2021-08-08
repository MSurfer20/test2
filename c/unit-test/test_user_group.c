#ifndef user_group_TEST
#define user_group_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_group_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_group.h"
user_group_t* instantiate_user_group(int include_optional);



user_group_t* instantiate_user_group(int include_optional) {
  user_group_t* user_group = NULL;
  if (include_optional) {
    user_group = user_group_create(
      "0",
      "0",
      list_create(),
      56
    );
  } else {
    user_group = user_group_create(
      "0",
      "0",
      list_create(),
      56
    );
  }

  return user_group;
}


#ifdef user_group_MAIN

void test_user_group(int include_optional) {
    user_group_t* user_group_1 = instantiate_user_group(include_optional);

	cJSON* jsonuser_group_1 = user_group_convertToJSON(user_group_1);
	printf("user_group :\n%s\n", cJSON_Print(jsonuser_group_1));
	user_group_t* user_group_2 = user_group_parseFromJSON(jsonuser_group_1);
	cJSON* jsonuser_group_2 = user_group_convertToJSON(user_group_2);
	printf("repeating user_group:\n%s\n", cJSON_Print(jsonuser_group_2));
}

int main() {
  test_user_group(1);
  test_user_group(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_group_MAIN
#endif // user_group_TEST
