#ifndef invalid_message_error_all_of_TEST
#define invalid_message_error_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define invalid_message_error_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/invalid_message_error_all_of.h"
invalid_message_error_all_of_t* instantiate_invalid_message_error_all_of(int include_optional);



invalid_message_error_all_of_t* instantiate_invalid_message_error_all_of(int include_optional) {
  invalid_message_error_all_of_t* invalid_message_error_all_of = NULL;
  if (include_optional) {
    invalid_message_error_all_of = invalid_message_error_all_of_create(
      null,
      null,
      "0"
    );
  } else {
    invalid_message_error_all_of = invalid_message_error_all_of_create(
      null,
      null,
      "0"
    );
  }

  return invalid_message_error_all_of;
}


#ifdef invalid_message_error_all_of_MAIN

void test_invalid_message_error_all_of(int include_optional) {
    invalid_message_error_all_of_t* invalid_message_error_all_of_1 = instantiate_invalid_message_error_all_of(include_optional);

	cJSON* jsoninvalid_message_error_all_of_1 = invalid_message_error_all_of_convertToJSON(invalid_message_error_all_of_1);
	printf("invalid_message_error_all_of :\n%s\n", cJSON_Print(jsoninvalid_message_error_all_of_1));
	invalid_message_error_all_of_t* invalid_message_error_all_of_2 = invalid_message_error_all_of_parseFromJSON(jsoninvalid_message_error_all_of_1);
	cJSON* jsoninvalid_message_error_all_of_2 = invalid_message_error_all_of_convertToJSON(invalid_message_error_all_of_2);
	printf("repeating invalid_message_error_all_of:\n%s\n", cJSON_Print(jsoninvalid_message_error_all_of_2));
}

int main() {
  test_invalid_message_error_all_of(1);
  test_invalid_message_error_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // invalid_message_error_all_of_MAIN
#endif // invalid_message_error_all_of_TEST
