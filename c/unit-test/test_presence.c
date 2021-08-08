#ifndef presence_TEST
#define presence_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define presence_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/presence.h"
presence_t* instantiate_presence(int include_optional);



presence_t* instantiate_presence(int include_optional) {
  presence_t* presence = NULL;
  if (include_optional) {
    presence = presence_create(
      "0",
      zulip_rest_api_presence_STATUS_idle,
      56,
      1
    );
  } else {
    presence = presence_create(
      "0",
      zulip_rest_api_presence_STATUS_idle,
      56,
      1
    );
  }

  return presence;
}


#ifdef presence_MAIN

void test_presence(int include_optional) {
    presence_t* presence_1 = instantiate_presence(include_optional);

	cJSON* jsonpresence_1 = presence_convertToJSON(presence_1);
	printf("presence :\n%s\n", cJSON_Print(jsonpresence_1));
	presence_t* presence_2 = presence_parseFromJSON(jsonpresence_1);
	cJSON* jsonpresence_2 = presence_convertToJSON(presence_2);
	printf("repeating presence:\n%s\n", cJSON_Print(jsonpresence_2));
}

int main() {
  test_presence(1);
  test_presence(0);

  printf("Hello world \n");
  return 0;
}

#endif // presence_MAIN
#endif // presence_TEST
