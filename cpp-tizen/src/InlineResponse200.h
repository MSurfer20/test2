/*
 * Inline_response_200.h
 *
 * This is an example of the JSON payload that the Zulip server will &#x60;POST&#x60; to your server 
 */

#ifndef _Inline_response_200_H_
#define _Inline_response_200_H_


#include <string>
#include "MessagesBase.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This is an example of the JSON payload that the Zulip server will `POST` to your server 
 *
 *  \ingroup Models
 *
 */

class Inline_response_200 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_response_200();
	Inline_response_200(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_response_200();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Email of the bot user. 
	 */
	std::string getBotEmail();

	/*! \brief Set Email of the bot user. 
	 */
	void setBotEmail(std::string  bot_email);
	/*! \brief Get The full name of the bot user. 
	 */
	std::string getBotFullName();

	/*! \brief Set The full name of the bot user. 
	 */
	void setBotFullName(std::string  bot_full_name);
	/*! \brief Get The message content, in raw Markdown format (not rendered to HTML). 
	 */
	std::string getData();

	/*! \brief Set The message content, in raw Markdown format (not rendered to HTML). 
	 */
	void setData(std::string  data);
	/*! \brief Get What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
	 */
	std::string getTrigger();

	/*! \brief Set What aspect of the message triggered the outgoing webhook notification. Possible values include `private_message` and `mention`. 
	 */
	void setTrigger(std::string  trigger);
	/*! \brief Get A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
	 */
	std::string getToken();

	/*! \brief Set A string of alphanumeric characters that can be used to authenticate the webhook request (each bot user uses a fixed token). You can get the token used by a given outgoing webhook bot in the `zuliprc` file downloaded when creating the bot. 
	 */
	void setToken(std::string  token);
	/*! \brief Get A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
	 */
	MessagesBase getMessage();

	/*! \brief Set A dict containing details on the message that triggered the outgoing webhook, in the format used by [`GET /messages`](/api/get-messages). 
	 */
	void setMessage(MessagesBase  message);

private:
	std::string bot_email;
	std::string bot_full_name;
	std::string data;
	std::string trigger;
	std::string token;
	MessagesBase message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Inline_response_200_H_ */
