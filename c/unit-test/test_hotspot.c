#ifndef hotspot_TEST
#define hotspot_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define hotspot_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/hotspot.h"
hotspot_t* instantiate_hotspot(int include_optional);



hotspot_t* instantiate_hotspot(int include_optional) {
  hotspot_t* hotspot = NULL;
  if (include_optional) {
    hotspot = hotspot_create(
      1.337,
      "0",
      "0",
      "0"
    );
  } else {
    hotspot = hotspot_create(
      1.337,
      "0",
      "0",
      "0"
    );
  }

  return hotspot;
}


#ifdef hotspot_MAIN

void test_hotspot(int include_optional) {
    hotspot_t* hotspot_1 = instantiate_hotspot(include_optional);

	cJSON* jsonhotspot_1 = hotspot_convertToJSON(hotspot_1);
	printf("hotspot :\n%s\n", cJSON_Print(jsonhotspot_1));
	hotspot_t* hotspot_2 = hotspot_parseFromJSON(jsonhotspot_1);
	cJSON* jsonhotspot_2 = hotspot_convertToJSON(hotspot_2);
	printf("repeating hotspot:\n%s\n", cJSON_Print(jsonhotspot_2));
}

int main() {
  test_hotspot(1);
  test_hotspot(0);

  printf("Hello world \n");
  return 0;
}

#endif // hotspot_MAIN
#endif // hotspot_TEST
