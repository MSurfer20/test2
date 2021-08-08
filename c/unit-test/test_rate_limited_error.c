#ifndef rate_limited_error_TEST
#define rate_limited_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define rate_limited_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/rate_limited_error.h"
rate_limited_error_t* instantiate_rate_limited_error(int include_optional);



rate_limited_error_t* instantiate_rate_limited_error(int include_optional) {
  rate_limited_error_t* rate_limited_error = NULL;
  if (include_optional) {
    rate_limited_error = rate_limited_error_create(
      null,
      null,
      null
    );
  } else {
    rate_limited_error = rate_limited_error_create(
      null,
      null,
      null
    );
  }

  return rate_limited_error;
}


#ifdef rate_limited_error_MAIN

void test_rate_limited_error(int include_optional) {
    rate_limited_error_t* rate_limited_error_1 = instantiate_rate_limited_error(include_optional);

	cJSON* jsonrate_limited_error_1 = rate_limited_error_convertToJSON(rate_limited_error_1);
	printf("rate_limited_error :\n%s\n", cJSON_Print(jsonrate_limited_error_1));
	rate_limited_error_t* rate_limited_error_2 = rate_limited_error_parseFromJSON(jsonrate_limited_error_1);
	cJSON* jsonrate_limited_error_2 = rate_limited_error_convertToJSON(rate_limited_error_2);
	printf("repeating rate_limited_error:\n%s\n", cJSON_Print(jsonrate_limited_error_2));
}

int main() {
  test_rate_limited_error(1);
  test_rate_limited_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // rate_limited_error_MAIN
#endif // rate_limited_error_TEST
