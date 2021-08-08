#ifndef bad_event_queue_id_error_TEST
#define bad_event_queue_id_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bad_event_queue_id_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bad_event_queue_id_error.h"
bad_event_queue_id_error_t* instantiate_bad_event_queue_id_error(int include_optional);



bad_event_queue_id_error_t* instantiate_bad_event_queue_id_error(int include_optional) {
  bad_event_queue_id_error_t* bad_event_queue_id_error = NULL;
  if (include_optional) {
    bad_event_queue_id_error = bad_event_queue_id_error_create(
      null,
      null,
      null,
      "0"
    );
  } else {
    bad_event_queue_id_error = bad_event_queue_id_error_create(
      null,
      null,
      null,
      "0"
    );
  }

  return bad_event_queue_id_error;
}


#ifdef bad_event_queue_id_error_MAIN

void test_bad_event_queue_id_error(int include_optional) {
    bad_event_queue_id_error_t* bad_event_queue_id_error_1 = instantiate_bad_event_queue_id_error(include_optional);

	cJSON* jsonbad_event_queue_id_error_1 = bad_event_queue_id_error_convertToJSON(bad_event_queue_id_error_1);
	printf("bad_event_queue_id_error :\n%s\n", cJSON_Print(jsonbad_event_queue_id_error_1));
	bad_event_queue_id_error_t* bad_event_queue_id_error_2 = bad_event_queue_id_error_parseFromJSON(jsonbad_event_queue_id_error_1);
	cJSON* jsonbad_event_queue_id_error_2 = bad_event_queue_id_error_convertToJSON(bad_event_queue_id_error_2);
	printf("repeating bad_event_queue_id_error:\n%s\n", cJSON_Print(jsonbad_event_queue_id_error_2));
}

int main() {
  test_bad_event_queue_id_error(1);
  test_bad_event_queue_id_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // bad_event_queue_id_error_MAIN
#endif // bad_event_queue_id_error_TEST
