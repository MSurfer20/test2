/*
 * BasicStream.h
 *
 * 
 */

#ifndef _BasicStream_H_
#define _BasicStream_H_


#include <string>
#include "AnyType.h"
#include "BasicStreamBase.h"
#include "BasicStream_allOf.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BasicStream : public Object {
public:
	/*! \brief Constructor.
	 */
	BasicStream();
	BasicStream(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BasicStream();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AnyType getStreamId();

	/*! \brief Set 
	 */
	void setStreamId(AnyType  stream_id);
	/*! \brief Get 
	 */
	AnyType getName();

	/*! \brief Set 
	 */
	void setName(AnyType  name);
	/*! \brief Get 
	 */
	AnyType getDescription();

	/*! \brief Set 
	 */
	void setDescription(AnyType  description);
	/*! \brief Get 
	 */
	AnyType getDateCreated();

	/*! \brief Set 
	 */
	void setDateCreated(AnyType  date_created);
	/*! \brief Get 
	 */
	AnyType getInviteOnly();

	/*! \brief Set 
	 */
	void setInviteOnly(AnyType  invite_only);
	/*! \brief Get 
	 */
	AnyType getRenderedDescription();

	/*! \brief Set 
	 */
	void setRenderedDescription(AnyType  rendered_description);
	/*! \brief Get 
	 */
	AnyType getIsWebPublic();

	/*! \brief Set 
	 */
	void setIsWebPublic(AnyType  is_web_public);
	/*! \brief Get 
	 */
	AnyType getStreamPostPolicy();

	/*! \brief Set 
	 */
	void setStreamPostPolicy(AnyType  stream_post_policy);
	/*! \brief Get 
	 */
	AnyType getMessageRetentionDays();

	/*! \brief Set 
	 */
	void setMessageRetentionDays(AnyType  message_retention_days);
	/*! \brief Get 
	 */
	AnyType getHistoryPublicToSubscribers();

	/*! \brief Set 
	 */
	void setHistoryPublicToSubscribers(AnyType  history_public_to_subscribers);
	/*! \brief Get 
	 */
	AnyType getFirstMessageId();

	/*! \brief Set 
	 */
	void setFirstMessageId(AnyType  first_message_id);
	/*! \brief Get 
	 */
	AnyType getIsAnnouncementOnly();

	/*! \brief Set 
	 */
	void setIsAnnouncementOnly(AnyType  is_announcement_only);

private:
	AnyType stream_id;
	AnyType name;
	AnyType description;
	AnyType date_created;
	AnyType invite_only;
	AnyType rendered_description;
	AnyType is_web_public;
	AnyType stream_post_policy;
	AnyType message_retention_days;
	AnyType history_public_to_subscribers;
	AnyType first_message_id;
	AnyType is_announcement_only;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BasicStream_H_ */
