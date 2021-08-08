#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/coded_error.h"
#include "../model/draft.h"
#include "../model/json_error.h"
#include "../model/json_success.h"


// Create drafts
//
// Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
//
json_success_t*
DraftsAPI_createDrafts(apiClient_t *apiClient, list_t * drafts );


// Delete a draft
//
// Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
//
json_success_t*
DraftsAPI_deleteDraft(apiClient_t *apiClient, int draft_id );


// Edit a draft
//
// Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
//
json_success_t*
DraftsAPI_editDraft(apiClient_t *apiClient, int draft_id , draft_t * draft );


// Get drafts
//
// Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
//
json_success_t*
DraftsAPI_getDrafts(apiClient_t *apiClient);


