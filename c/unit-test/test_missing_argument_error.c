#ifndef missing_argument_error_TEST
#define missing_argument_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define missing_argument_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/missing_argument_error.h"
missing_argument_error_t* instantiate_missing_argument_error(int include_optional);



missing_argument_error_t* instantiate_missing_argument_error(int include_optional) {
  missing_argument_error_t* missing_argument_error = NULL;
  if (include_optional) {
    missing_argument_error = missing_argument_error_create(
      null,
      null,
      null,
      "0"
    );
  } else {
    missing_argument_error = missing_argument_error_create(
      null,
      null,
      null,
      "0"
    );
  }

  return missing_argument_error;
}


#ifdef missing_argument_error_MAIN

void test_missing_argument_error(int include_optional) {
    missing_argument_error_t* missing_argument_error_1 = instantiate_missing_argument_error(include_optional);

	cJSON* jsonmissing_argument_error_1 = missing_argument_error_convertToJSON(missing_argument_error_1);
	printf("missing_argument_error :\n%s\n", cJSON_Print(jsonmissing_argument_error_1));
	missing_argument_error_t* missing_argument_error_2 = missing_argument_error_parseFromJSON(jsonmissing_argument_error_1);
	cJSON* jsonmissing_argument_error_2 = missing_argument_error_convertToJSON(missing_argument_error_2);
	printf("repeating missing_argument_error:\n%s\n", cJSON_Print(jsonmissing_argument_error_2));
}

int main() {
  test_missing_argument_error(1);
  test_missing_argument_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // missing_argument_error_MAIN
#endif // missing_argument_error_TEST
