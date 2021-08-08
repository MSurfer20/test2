/*
 * Bot.h
 *
 * 
 */

#ifndef _Bot_H_
#define _Bot_H_


#include <string>
#include "AnyType.h"
#include "BasicBotBase.h"
#include "Bot_allOf.h"
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

class Bot : public Object {
public:
	/*! \brief Constructor.
	 */
	Bot();
	Bot(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Bot();

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
	/*! \brief Get The email of the bot. 
	 */
	std::string getEmail();

	/*! \brief Set The email of the bot. 
	 */
	void setEmail(std::string  email);
	/*! \brief Get An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
	 */
	int getBotType();

	/*! \brief Set An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
	 */
	void setBotType(int  bot_type);
	/*! \brief Get A boolean describing whether the user account has been deactivated. 
	 */
	bool getIsActive();

	/*! \brief Set A boolean describing whether the user account has been deactivated. 
	 */
	void setIsActive(bool  is_active);

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
	std::string email;
	int bot_type;
	bool is_active;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Bot_H_ */
