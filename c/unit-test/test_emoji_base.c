#ifndef emoji_base_TEST
#define emoji_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define emoji_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/emoji_base.h"
emoji_base_t* instantiate_emoji_base(int include_optional);



emoji_base_t* instantiate_emoji_base(int include_optional) {
  emoji_base_t* emoji_base = NULL;
  if (include_optional) {
    emoji_base = emoji_base_create(
      "0",
      "0",
      "0"
    );
  } else {
    emoji_base = emoji_base_create(
      "0",
      "0",
      "0"
    );
  }

  return emoji_base;
}


#ifdef emoji_base_MAIN

void test_emoji_base(int include_optional) {
    emoji_base_t* emoji_base_1 = instantiate_emoji_base(include_optional);

	cJSON* jsonemoji_base_1 = emoji_base_convertToJSON(emoji_base_1);
	printf("emoji_base :\n%s\n", cJSON_Print(jsonemoji_base_1));
	emoji_base_t* emoji_base_2 = emoji_base_parseFromJSON(jsonemoji_base_1);
	cJSON* jsonemoji_base_2 = emoji_base_convertToJSON(emoji_base_2);
	printf("repeating emoji_base:\n%s\n", cJSON_Print(jsonemoji_base_2));
}

int main() {
  test_emoji_base(1);
  test_emoji_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // emoji_base_MAIN
#endif // emoji_base_TEST
