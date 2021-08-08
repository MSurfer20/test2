#ifndef emoji_reaction_TEST
#define emoji_reaction_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define emoji_reaction_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/emoji_reaction.h"
emoji_reaction_t* instantiate_emoji_reaction(int include_optional);



emoji_reaction_t* instantiate_emoji_reaction(int include_optional) {
  emoji_reaction_t* emoji_reaction = NULL;
  if (include_optional) {
    emoji_reaction = emoji_reaction_create(
      null,
      null,
      null,
      null,
      null
    );
  } else {
    emoji_reaction = emoji_reaction_create(
      null,
      null,
      null,
      null,
      null
    );
  }

  return emoji_reaction;
}


#ifdef emoji_reaction_MAIN

void test_emoji_reaction(int include_optional) {
    emoji_reaction_t* emoji_reaction_1 = instantiate_emoji_reaction(include_optional);

	cJSON* jsonemoji_reaction_1 = emoji_reaction_convertToJSON(emoji_reaction_1);
	printf("emoji_reaction :\n%s\n", cJSON_Print(jsonemoji_reaction_1));
	emoji_reaction_t* emoji_reaction_2 = emoji_reaction_parseFromJSON(jsonemoji_reaction_1);
	cJSON* jsonemoji_reaction_2 = emoji_reaction_convertToJSON(emoji_reaction_2);
	printf("repeating emoji_reaction:\n%s\n", cJSON_Print(jsonemoji_reaction_2));
}

int main() {
  test_emoji_reaction(1);
  test_emoji_reaction(0);

  printf("Hello world \n");
  return 0;
}

#endif // emoji_reaction_MAIN
#endif // emoji_reaction_TEST
