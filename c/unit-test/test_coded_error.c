#ifndef coded_error_TEST
#define coded_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define coded_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/coded_error.h"
coded_error_t* instantiate_coded_error(int include_optional);



coded_error_t* instantiate_coded_error(int include_optional) {
  coded_error_t* coded_error = NULL;
  if (include_optional) {
    coded_error = coded_error_create(
      null,
      null,
      null
    );
  } else {
    coded_error = coded_error_create(
      null,
      null,
      null
    );
  }

  return coded_error;
}


#ifdef coded_error_MAIN

void test_coded_error(int include_optional) {
    coded_error_t* coded_error_1 = instantiate_coded_error(include_optional);

	cJSON* jsoncoded_error_1 = coded_error_convertToJSON(coded_error_1);
	printf("coded_error :\n%s\n", cJSON_Print(jsoncoded_error_1));
	coded_error_t* coded_error_2 = coded_error_parseFromJSON(jsoncoded_error_1);
	cJSON* jsoncoded_error_2 = coded_error_convertToJSON(coded_error_2);
	printf("repeating coded_error:\n%s\n", cJSON_Print(jsoncoded_error_2));
}

int main() {
  test_coded_error(1);
  test_coded_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // coded_error_MAIN
#endif // coded_error_TEST
