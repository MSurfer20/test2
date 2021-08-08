#ifndef missing_argument_error_all_of_TEST
#define missing_argument_error_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define missing_argument_error_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/missing_argument_error_all_of.h"
missing_argument_error_all_of_t* instantiate_missing_argument_error_all_of(int include_optional);



missing_argument_error_all_of_t* instantiate_missing_argument_error_all_of(int include_optional) {
  missing_argument_error_all_of_t* missing_argument_error_all_of = NULL;
  if (include_optional) {
    missing_argument_error_all_of = missing_argument_error_all_of_create(
      null,
      null,
      null,
      "0"
    );
  } else {
    missing_argument_error_all_of = missing_argument_error_all_of_create(
      null,
      null,
      null,
      "0"
    );
  }

  return missing_argument_error_all_of;
}


#ifdef missing_argument_error_all_of_MAIN

void test_missing_argument_error_all_of(int include_optional) {
    missing_argument_error_all_of_t* missing_argument_error_all_of_1 = instantiate_missing_argument_error_all_of(include_optional);

	cJSON* jsonmissing_argument_error_all_of_1 = missing_argument_error_all_of_convertToJSON(missing_argument_error_all_of_1);
	printf("missing_argument_error_all_of :\n%s\n", cJSON_Print(jsonmissing_argument_error_all_of_1));
	missing_argument_error_all_of_t* missing_argument_error_all_of_2 = missing_argument_error_all_of_parseFromJSON(jsonmissing_argument_error_all_of_1);
	cJSON* jsonmissing_argument_error_all_of_2 = missing_argument_error_all_of_convertToJSON(missing_argument_error_all_of_2);
	printf("repeating missing_argument_error_all_of:\n%s\n", cJSON_Print(jsonmissing_argument_error_all_of_2));
}

int main() {
  test_missing_argument_error_all_of(1);
  test_missing_argument_error_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // missing_argument_error_all_of_MAIN
#endif // missing_argument_error_all_of_TEST
