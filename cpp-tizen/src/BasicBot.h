/*
 * BasicBot.h
 *
 * 
 */

#ifndef _BasicBot_H_
#define _BasicBot_H_


#include <string>
#include "AnyType.h"
#include "BasicBotBase.h"
#include "BasicBot_allOf.h"
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

class BasicBot : public Object {
public:
	/*! \brief Constructor.
	 */
	BasicBot();
	BasicBot(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BasicBot();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _BasicBot_H_ */
