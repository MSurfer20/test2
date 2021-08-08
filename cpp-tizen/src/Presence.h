/*
 * Presence.h
 *
 * &#x60;{client_name}&#x60;: Object containing the details of the user&#39;s presence on a particular platform with the client&#39;s platform name being the object key. 
 */

#ifndef _Presence_H_
#define _Presence_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief `{client_name}`: Object containing the details of the user's presence on a particular platform with the client's platform name being the object key. 
 *
 *  \ingroup Models
 *
 */

class Presence : public Object {
public:
	/*! \brief Constructor.
	 */
	Presence();
	Presence(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Presence();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The client's platform name. 
	 */
	std::string getClient();

	/*! \brief Set The client's platform name. 
	 */
	void setClient(std::string  client);
	/*! \brief Get The status of the user on this client. It is either `idle` or `active`. 
	 */
	std::string getStatus();

	/*! \brief Set The status of the user on this client. It is either `idle` or `active`. 
	 */
	void setStatus(std::string  status);
	/*! \brief Get The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
	 */
	int getTimestamp();

	/*! \brief Set The UNIX timestamp of when this client sent the user's presence to the server with the precision of a second. 
	 */
	void setTimestamp(int  timestamp);
	/*! \brief Get Whether the client is capable of showing mobile/push notifications to the user. 
	 */
	bool getPushable();

	/*! \brief Set Whether the client is capable of showing mobile/push notifications to the user. 
	 */
	void setPushable(bool  pushable);

private:
	std::string client;
	std::string status;
	int timestamp;
	bool pushable;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Presence_H_ */
