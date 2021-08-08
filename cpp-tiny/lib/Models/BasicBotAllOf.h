
/*
 * BasicBot_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BasicBot_allOf_H_
#define TINY_CPP_CLIENT_BasicBot_allOf_H_


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

class BasicBot_allOf{
public:

    /*! \brief Constructor.
	 */
    BasicBot_allOf();
    BasicBot_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BasicBot_allOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AnyType getUserId();

	/*! \brief Set 
	 */
	void setUserId(AnyType  user_id);
	/*! \brief Get 
	 */
	AnyType getFullName();

	/*! \brief Set 
	 */
	void setFullName(AnyType  full_name);
	/*! \brief Get 
	 */
	AnyType getApiKey();

	/*! \brief Set 
	 */
	void setApiKey(AnyType  api_key);
	/*! \brief Get 
	 */
	AnyType getDefaultSendingStream();

	/*! \brief Set 
	 */
	void setDefaultSendingStream(AnyType  default_sending_stream);
	/*! \brief Get 
	 */
	AnyType getDefaultEventsRegisterStream();

	/*! \brief Set 
	 */
	void setDefaultEventsRegisterStream(AnyType  default_events_register_stream);
	/*! \brief Get 
	 */
	AnyType getDefaultAllPublicStreams();

	/*! \brief Set 
	 */
	void setDefaultAllPublicStreams(AnyType  default_all_public_streams);
	/*! \brief Get 
	 */
	AnyType getAvatarUrl();

	/*! \brief Set 
	 */
	void setAvatarUrl(AnyType  avatar_url);
	/*! \brief Get 
	 */
	AnyType getOwnerId();

	/*! \brief Set 
	 */
	void setOwnerId(AnyType  owner_id);
	/*! \brief Get 
	 */
	AnyType getServices();

	/*! \brief Set 
	 */
	void setServices(AnyType  services);


    private:
    AnyType user_id;
    AnyType full_name;
    AnyType api_key;
    AnyType default_sending_stream;
    AnyType default_events_register_stream;
    AnyType default_all_public_streams;
    AnyType avatar_url;
    AnyType owner_id;
    AnyType services;
};
}

#endif /* TINY_CPP_CLIENT_BasicBot_allOf_H_ */
