#ifndef _DraftsManager_H_
#define _DraftsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CodedError.h"
#include "Draft.h"
#include "JsonError.h"
#include "JsonSuccess.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Drafts Drafts
 * \ingroup Operations
 *  @{
 */
class DraftsManager {
public:
	DraftsManager();
	virtual ~DraftsManager();

/*! \brief Create drafts. *Synchronous*
 *
 * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
 * \param drafts A JSON-encoded list of containing new draft objects. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDraftsSync(char * accessToken,
	std::list<Draft> drafts, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Create drafts. *Asynchronous*
 *
 * Create one or more drafts on the server. These drafts will be automatically synchronized to other clients via `drafts` events.  `POST {{ api_url }}/v1/drafts` 
 * \param drafts A JSON-encoded list of containing new draft objects. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createDraftsAsync(char * accessToken,
	std::list<Draft> drafts, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Delete a draft. *Synchronous*
 *
 * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
 * \param draftId The ID of the draft you want to delete.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteDraftSync(char * accessToken,
	int draftId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Delete a draft. *Asynchronous*
 *
 * Delete a single draft from the server. The deletion will be automatically synchronized to other clients via a `drafts` event.  `DELETE {{ api_url }}/v1/drafts/{draft_id}` 
 * \param draftId The ID of the draft you want to delete.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteDraftAsync(char * accessToken,
	int draftId, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Edit a draft. *Synchronous*
 *
 * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
 * \param draftId The ID of the draft to be edited.  *Required*
 * \param draft A JSON-encoded object containing a replacement draft object for this ID.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool editDraftSync(char * accessToken,
	int draftId, Draft draft, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Edit a draft. *Asynchronous*
 *
 * Edit a draft on the server. The edit will be automatically synchronized to other clients via `drafts` events.  `PATCH {{ api_url }}/v1/drafts/{draft_id}` 
 * \param draftId The ID of the draft to be edited.  *Required*
 * \param draft A JSON-encoded object containing a replacement draft object for this ID.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool editDraftAsync(char * accessToken,
	int draftId, Draft draft, 
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);


/*! \brief Get drafts. *Synchronous*
 *
 * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDraftsSync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);

/*! \brief Get drafts. *Asynchronous*
 *
 * Fetch all drafts for the current user.  `GET {{ api_url }}/v1/drafts` 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getDraftsAsync(char * accessToken,
	
	void(* handler)(JsonSuccess, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://example.zulipchat.com/api/v1";
	}
};
/** @}*/

}
}
#endif /* DraftsManager_H_ */
