/*
 * AddSubscriptionsResponse.h
 *
 * 
 */

#ifndef _AddSubscriptionsResponse_H_
#define _AddSubscriptionsResponse_H_


#include <string>
#include "AddSubscriptionsResponse_allOf.h"
#include "AnyType.h"
#include "JsonSuccessBase.h"
#include <list>
#include <map>
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

class AddSubscriptionsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AddSubscriptionsResponse();
	AddSubscriptionsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddSubscriptionsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AnyType getResult();

	/*! \brief Set 
	 */
	void setResult(AnyType  result);
	/*! \brief Get 
	 */
	AnyType getMsg();

	/*! \brief Set 
	 */
	void setMsg(AnyType  msg);
	/*! \brief Get A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
	 */
	std::map<std::string, std::string> getSubscribed();

	/*! \brief Set A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
	 */
	void setSubscribed(std::map <std::string, std::string> subscribed);
	/*! \brief Get A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
	 */
	std::map<std::string, std::string> getAlreadySubscribed();

	/*! \brief Set A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
	 */
	void setAlreadySubscribed(std::map <std::string, std::string> already_subscribed);
	/*! \brief Get A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
	 */
	std::list<std::string> getUnauthorized();

	/*! \brief Set A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
	 */
	void setUnauthorized(std::list <std::string> unauthorized);

private:
	AnyType result;
	AnyType msg;
	std::map <std::string, std::string>subscribed;
	std::map <std::string, std::string>already_subscribed;
	std::list <std::string>unauthorized;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddSubscriptionsResponse_H_ */
