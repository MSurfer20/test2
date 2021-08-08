#ifndef invalid_message_error_TEST
#define invalid_message_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invalid_message_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invalid_message_error.h"
invalid_message_error_t* instantiate_invalid_message_error(int include_optional);



invalid_message_error_t* instantiate_invalid_message_error(int include_optional) {
  invalid_message_error_t* invalid_message_error = NULL;
  if (include_optional) {
    invalid_message_error = invalid_message_error_create(
      null,
      null,
      "0"
    );
  } else {
    invalid_message_error = invalid_message_error_create(
      null,
      null,
      "0"
    );
  }

  return invalid_message_error;
}


#ifdef invalid_message_error_MAIN

void test_invalid_message_error(int include_optional) {
    invalid_message_error_t* invalid_message_error_1 = instantiate_invalid_message_error(include_optional);

	cJSON* jsoninvalid_message_error_1 = invalid_message_error_convertToJSON(invalid_message_error_1);
	printf("invalid_message_error :\n%s\n", cJSON_Print(jsoninvalid_message_error_1));
	invalid_message_error_t* invalid_message_error_2 = invalid_message_error_parseFromJSON(jsoninvalid_message_error_1);
	cJSON* jsoninvalid_message_error_2 = invalid_message_error_convertToJSON(invalid_message_error_2);
	printf("repeating invalid_message_error:\n%s\n", cJSON_Print(jsoninvalid_message_error_2));
}

int main() {
  test_invalid_message_error(1);
  test_invalid_message_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // invalid_message_error_MAIN
#endif // invalid_message_error_TEST
