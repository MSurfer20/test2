#ifndef coded_error_all_of_TEST
#define coded_error_all_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define coded_error_all_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/coded_error_all_of.h"
coded_error_all_of_t* instantiate_coded_error_all_of(int include_optional);



coded_error_all_of_t* instantiate_coded_error_all_of(int include_optional) {
  coded_error_all_of_t* coded_error_all_of = NULL;
  if (include_optional) {
    coded_error_all_of = coded_error_all_of_create(
      null,
      null,
      null
    );
  } else {
    coded_error_all_of = coded_error_all_of_create(
      null,
      null,
      null
    );
  }

  return coded_error_all_of;
}


#ifdef coded_error_all_of_MAIN

void test_coded_error_all_of(int include_optional) {
    coded_error_all_of_t* coded_error_all_of_1 = instantiate_coded_error_all_of(include_optional);

	cJSON* jsoncoded_error_all_of_1 = coded_error_all_of_convertToJSON(coded_error_all_of_1);
	printf("coded_error_all_of :\n%s\n", cJSON_Print(jsoncoded_error_all_of_1));
	coded_error_all_of_t* coded_error_all_of_2 = coded_error_all_of_parseFromJSON(jsoncoded_error_all_of_1);
	cJSON* jsoncoded_error_all_of_2 = coded_error_all_of_convertToJSON(coded_error_all_of_2);
	printf("repeating coded_error_all_of:\n%s\n", cJSON_Print(jsoncoded_error_all_of_2));
}

int main() {
  test_coded_error_all_of(1);
  test_coded_error_all_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // coded_error_all_of_MAIN
#endif // coded_error_all_of_TEST
