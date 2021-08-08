#ifndef default_stream_group_TEST
#define default_stream_group_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define default_stream_group_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/default_stream_group.h"
default_stream_group_t* instantiate_default_stream_group(int include_optional);



default_stream_group_t* instantiate_default_stream_group(int include_optional) {
  default_stream_group_t* default_stream_group = NULL;
  if (include_optional) {
    default_stream_group = default_stream_group_create(
      "0",
      "0",
      56,
      list_create()
    );
  } else {
    default_stream_group = default_stream_group_create(
      "0",
      "0",
      56,
      list_create()
    );
  }

  return default_stream_group;
}


#ifdef default_stream_group_MAIN

void test_default_stream_group(int include_optional) {
    default_stream_group_t* default_stream_group_1 = instantiate_default_stream_group(include_optional);

	cJSON* jsondefault_stream_group_1 = default_stream_group_convertToJSON(default_stream_group_1);
	printf("default_stream_group :\n%s\n", cJSON_Print(jsondefault_stream_group_1));
	default_stream_group_t* default_stream_group_2 = default_stream_group_parseFromJSON(jsondefault_stream_group_1);
	cJSON* jsondefault_stream_group_2 = default_stream_group_convertToJSON(default_stream_group_2);
	printf("repeating default_stream_group:\n%s\n", cJSON_Print(jsondefault_stream_group_2));
}

int main() {
  test_default_stream_group(1);
  test_default_stream_group(0);

  printf("Hello world \n");
  return 0;
}

#endif // default_stream_group_MAIN
#endif // default_stream_group_TEST
