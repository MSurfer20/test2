#ifndef coded_error_base_TEST
#define coded_error_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define coded_error_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/coded_error_base.h"
coded_error_base_t* instantiate_coded_error_base(int include_optional);



coded_error_base_t* instantiate_coded_error_base(int include_optional) {
  coded_error_base_t* coded_error_base = NULL;
  if (include_optional) {
    coded_error_base = coded_error_base_create(
      null,
      null,
      "0"
    );
  } else {
    coded_error_base = coded_error_base_create(
      null,
      null,
      "0"
    );
  }

  return coded_error_base;
}


#ifdef coded_error_base_MAIN

void test_coded_error_base(int include_optional) {
    coded_error_base_t* coded_error_base_1 = instantiate_coded_error_base(include_optional);

	cJSON* jsoncoded_error_base_1 = coded_error_base_convertToJSON(coded_error_base_1);
	printf("coded_error_base :\n%s\n", cJSON_Print(jsoncoded_error_base_1));
	coded_error_base_t* coded_error_base_2 = coded_error_base_parseFromJSON(jsoncoded_error_base_1);
	cJSON* jsoncoded_error_base_2 = coded_error_base_convertToJSON(coded_error_base_2);
	printf("repeating coded_error_base:\n%s\n", cJSON_Print(jsoncoded_error_base_2));
}

int main() {
  test_coded_error_base(1);
  test_coded_error_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // coded_error_base_MAIN
#endif // coded_error_base_TEST
