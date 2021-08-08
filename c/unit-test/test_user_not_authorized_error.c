#ifndef user_not_authorized_error_TEST
#define user_not_authorized_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_not_authorized_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_not_authorized_error.h"
user_not_authorized_error_t* instantiate_user_not_authorized_error(int include_optional);



user_not_authorized_error_t* instantiate_user_not_authorized_error(int include_optional) {
  user_not_authorized_error_t* user_not_authorized_error = NULL;
  if (include_optional) {
    user_not_authorized_error = user_not_authorized_error_create(
      null,
      null,
      null
    );
  } else {
    user_not_authorized_error = user_not_authorized_error_create(
      null,
      null,
      null
    );
  }

  return user_not_authorized_error;
}


#ifdef user_not_authorized_error_MAIN

void test_user_not_authorized_error(int include_optional) {
    user_not_authorized_error_t* user_not_authorized_error_1 = instantiate_user_not_authorized_error(include_optional);

	cJSON* jsonuser_not_authorized_error_1 = user_not_authorized_error_convertToJSON(user_not_authorized_error_1);
	printf("user_not_authorized_error :\n%s\n", cJSON_Print(jsonuser_not_authorized_error_1));
	user_not_authorized_error_t* user_not_authorized_error_2 = user_not_authorized_error_parseFromJSON(jsonuser_not_authorized_error_1);
	cJSON* jsonuser_not_authorized_error_2 = user_not_authorized_error_convertToJSON(user_not_authorized_error_2);
	printf("repeating user_not_authorized_error:\n%s\n", cJSON_Print(jsonuser_not_authorized_error_2));
}

int main() {
  test_user_not_authorized_error(1);
  test_user_not_authorized_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_not_authorized_error_MAIN
#endif // user_not_authorized_error_TEST
