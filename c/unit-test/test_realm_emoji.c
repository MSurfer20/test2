#ifndef realm_emoji_TEST
#define realm_emoji_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realm_emoji_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realm_emoji.h"
realm_emoji_t* instantiate_realm_emoji(int include_optional);



realm_emoji_t* instantiate_realm_emoji(int include_optional) {
  realm_emoji_t* realm_emoji = NULL;
  if (include_optional) {
    realm_emoji = realm_emoji_create(
      "0",
      "0",
      "0",
      1,
      56
    );
  } else {
    realm_emoji = realm_emoji_create(
      "0",
      "0",
      "0",
      1,
      56
    );
  }

  return realm_emoji;
}


#ifdef realm_emoji_MAIN

void test_realm_emoji(int include_optional) {
    realm_emoji_t* realm_emoji_1 = instantiate_realm_emoji(include_optional);

	cJSON* jsonrealm_emoji_1 = realm_emoji_convertToJSON(realm_emoji_1);
	printf("realm_emoji :\n%s\n", cJSON_Print(jsonrealm_emoji_1));
	realm_emoji_t* realm_emoji_2 = realm_emoji_parseFromJSON(jsonrealm_emoji_1);
	cJSON* jsonrealm_emoji_2 = realm_emoji_convertToJSON(realm_emoji_2);
	printf("repeating realm_emoji:\n%s\n", cJSON_Print(jsonrealm_emoji_2));
}

int main() {
  test_realm_emoji(1);
  test_realm_emoji(0);

  printf("Hello world \n");
  return 0;
}

#endif // realm_emoji_MAIN
#endif // realm_emoji_TEST
