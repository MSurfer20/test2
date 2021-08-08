#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/inline_response_200.h"


// Outgoing webhooks
//
// Outgoing webhooks allows to build or set up Zulip integrations which are notified when certain types of messages are sent in Zulip. 
//
inline_response_200_t*
WebhooksAPI_zulipOutgoingWebhooks(apiClient_t *apiClient);


