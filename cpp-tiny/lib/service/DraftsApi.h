#ifndef TINY_CPP_CLIENT_DraftsApi_H_
#define TINY_CPP_CLIENT_DraftsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "AbstractService.h"
#include "Helpers.h"
#include <list>

#include "CodedError.h"
#include "Draft.h"
#include "JsonError.h"
#include "JsonSuccess.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DraftsApi : public AbstractService {
public:
    DraftsApi() = default;

    virtual ~DraftsApi() = default;

    /**
    * Create drafts.
    *
    * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
    * \param drafts A JSON-encoded list of containing new draft objects. 
    */
    Response<
                JsonSuccess
        >
    createDrafts(
            std::list<Draft> drafts
            
            
    );
    /**
    * Delete a draft.
    *
    * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
    * \param draftId The ID of the draft you want to delete.  *Required*
    */
    Response<
                JsonSuccess
        >
    deleteDraft(
            
            int draftId
            
    );
    /**
    * Edit a draft.
    *
    * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
    * \param draftId The ID of the draft to be edited.  *Required*
    * \param draft A JSON-encoded object containing a replacement draft object for this ID.  *Required*
    */
    Response<
                JsonSuccess
        >
    editDraft(
            
            int draftId
            , 
            
            Draft draft
            
    );
    /**
    * Get drafts.
    *
    * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
    */
    Response<
                JsonSuccess
        >
    getDrafts(
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DraftsApi_H_ */