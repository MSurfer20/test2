#ifndef custom_profile_field_TEST
#define custom_profile_field_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define custom_profile_field_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/custom_profile_field.h"
custom_profile_field_t* instantiate_custom_profile_field(int include_optional);



custom_profile_field_t* instantiate_custom_profile_field(int include_optional) {
  custom_profile_field_t* custom_profile_field = NULL;
  if (include_optional) {
    custom_profile_field = custom_profile_field_create(
      56,
      56,
      56,
      "0",
      "0",
      "0"
    );
  } else {
    custom_profile_field = custom_profile_field_create(
      56,
      56,
      56,
      "0",
      "0",
      "0"
    );
  }

  return custom_profile_field;
}


#ifdef custom_profile_field_MAIN

void test_custom_profile_field(int include_optional) {
    custom_profile_field_t* custom_profile_field_1 = instantiate_custom_profile_field(include_optional);

	cJSON* jsoncustom_profile_field_1 = custom_profile_field_convertToJSON(custom_profile_field_1);
	printf("custom_profile_field :\n%s\n", cJSON_Print(jsoncustom_profile_field_1));
	custom_profile_field_t* custom_profile_field_2 = custom_profile_field_parseFromJSON(jsoncustom_profile_field_1);
	cJSON* jsoncustom_profile_field_2 = custom_profile_field_convertToJSON(custom_profile_field_2);
	printf("repeating custom_profile_field:\n%s\n", cJSON_Print(jsoncustom_profile_field_2));
}

int main() {
  test_custom_profile_field(1);
  test_custom_profile_field(0);

  printf("Hello world \n");
  return 0;
}

#endif // custom_profile_field_MAIN
#endif // custom_profile_field_TEST
