#ifndef user_deactivated_error_TEST
#define user_deactivated_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_deactivated_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_deactivated_error.h"
user_deactivated_error_t* instantiate_user_deactivated_error(int include_optional);



user_deactivated_error_t* instantiate_user_deactivated_error(int include_optional) {
  user_deactivated_error_t* user_deactivated_error = NULL;
  if (include_optional) {
    user_deactivated_error = user_deactivated_error_create(
      null,
      null,
      null
    );
  } else {
    user_deactivated_error = user_deactivated_error_create(
      null,
      null,
      null
    );
  }

  return user_deactivated_error;
}


#ifdef user_deactivated_error_MAIN

void test_user_deactivated_error(int include_optional) {
    user_deactivated_error_t* user_deactivated_error_1 = instantiate_user_deactivated_error(include_optional);

	cJSON* jsonuser_deactivated_error_1 = user_deactivated_error_convertToJSON(user_deactivated_error_1);
	printf("user_deactivated_error :\n%s\n", cJSON_Print(jsonuser_deactivated_error_1));
	user_deactivated_error_t* user_deactivated_error_2 = user_deactivated_error_parseFromJSON(jsonuser_deactivated_error_1);
	cJSON* jsonuser_deactivated_error_2 = user_deactivated_error_convertToJSON(user_deactivated_error_2);
	printf("repeating user_deactivated_error:\n%s\n", cJSON_Print(jsonuser_deactivated_error_2));
}

int main() {
  test_user_deactivated_error(1);
  test_user_deactivated_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_deactivated_error_MAIN
#endif // user_deactivated_error_TEST
