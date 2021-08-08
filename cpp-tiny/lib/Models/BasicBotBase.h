
/*
 * BasicBotBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BasicBotBase_H_
#define TINY_CPP_CLIENT_BasicBotBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OneOf<object,object>.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BasicBotBase{
public:

    /*! \brief Constructor.
	 */
    BasicBotBase();
    BasicBotBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BasicBotBase();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The user id of the bot. 
	 */
	int getUserId();

	/*! \brief Set The user id of the bot. 
	 */
	void setUserId(int  user_id);
	/*! \brief Get The full name of the bot. 
	 */
	std::string getFullName();

	/*! \brief Set The full name of the bot. 
	 */
	void setFullName(std::string  full_name);
	/*! \brief Get The API key of the bot which it uses to make API requests. 
	 */
	std::string getApiKey();

	/*! \brief Set The API key of the bot which it uses to make API requests. 
	 */
	void setApiKey(std::string  api_key);
	/*! \brief Get The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
	 */
	std::string getDefaultSendingStream();

	/*! \brief Set The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
	 */
	void setDefaultSendingStream(std::string  default_sending_stream);
	/*! \brief Get The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
	 */
	std::string getDefaultEventsRegisterStream();

	/*! \brief Set The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
	 */
	void setDefaultEventsRegisterStream(std::string  default_events_register_stream);
	/*! \brief Get Whether the bot can send messages to all streams by default. 
	 */
	bool isDefaultAllPublicStreams();

	/*! \brief Set Whether the bot can send messages to all streams by default. 
	 */
	void setDefaultAllPublicStreams(bool  default_all_public_streams);
	/*! \brief Get The URL of the bot's avatar. 
	 */
	std::string getAvatarUrl();

	/*! \brief Set The URL of the bot's avatar. 
	 */
	void setAvatarUrl(std::string  avatar_url);
	/*! \brief Get The user id of the bot's owner.  Null if the bot has no owner. 
	 */
	int getOwnerId();

	/*! \brief Set The user id of the bot's owner.  Null if the bot has no owner. 
	 */
	void setOwnerId(int  owner_id);
	/*! \brief Get The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
	 */
	std::list<OneOf&lt;object,object&gt;> getServices();

	/*! \brief Set The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
	 */
	void setServices(std::list <OneOf&lt;object,object&gt;> services);


    private:
    int user_id{};
    std::string full_name{};
    std::string api_key{};
    std::string default_sending_stream{};
    std::string default_events_register_stream{};
    bool default_all_public_streams{};
    std::string avatar_url{};
    int owner_id{};
    std::list<OneOf&lt;object,object&gt;> services;
};
}

#endif /* TINY_CPP_CLIENT_BasicBotBase_H_ */
