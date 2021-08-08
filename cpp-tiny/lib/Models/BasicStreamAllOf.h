
/*
 * BasicStream_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BasicStream_allOf_H_
#define TINY_CPP_CLIENT_BasicStream_allOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BasicStream_allOf{
public:

    /*! \brief Constructor.
	 */
    BasicStream_allOf();
    BasicStream_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BasicStream_allOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_BasicStream_allOf_H_ */
