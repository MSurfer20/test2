#ifndef attachments_TEST
#define attachments_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define attachments_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/attachments.h"
attachments_t* instantiate_attachments(int include_optional);



attachments_t* instantiate_attachments(int include_optional) {
  attachments_t* attachments = NULL;
  if (include_optional) {
    attachments = attachments_create(
      56,
      "0",
      "0",
      56,
      56,
      list_create()
    );
  } else {
    attachments = attachments_create(
      56,
      "0",
      "0",
      56,
      56,
      list_create()
    );
  }

  return attachments;
}


#ifdef attachments_MAIN

void test_attachments(int include_optional) {
    attachments_t* attachments_1 = instantiate_attachments(include_optional);

	cJSON* jsonattachments_1 = attachments_convertToJSON(attachments_1);
	printf("attachments :\n%s\n", cJSON_Print(jsonattachments_1));
	attachments_t* attachments_2 = attachments_parseFromJSON(jsonattachments_1);
	cJSON* jsonattachments_2 = attachments_convertToJSON(attachments_2);
	printf("repeating attachments:\n%s\n", cJSON_Print(jsonattachments_2));
}

int main() {
  test_attachments(1);
  test_attachments(0);

  printf("Hello world \n");
  return 0;
}

#endif // attachments_MAIN
#endif // attachments_TEST
