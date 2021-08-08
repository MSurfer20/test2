
/*
 * AddSubscriptionsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AddSubscriptionsResponse_H_
#define TINY_CPP_CLIENT_AddSubscriptionsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AddSubscriptionsResponse_allOf.h"
#include "AnyType.h"
#include "JsonSuccessBase.h"
#include <list>
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AddSubscriptionsResponse{
public:

    /*! \brief Constructor.
	 */
    AddSubscriptionsResponse();
    AddSubscriptionsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AddSubscriptionsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Map<std::string, std::string> getSubscribed();

	/*! \brief Set A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that were subscribed to as a result of the query. 
	 */
	void setSubscribed(Map <std::string, std::string> subscribed);
	/*! \brief Get A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
	 */
	Map<std::string, std::string> getAlreadySubscribed();

	/*! \brief Set A dictionary where the key is the email address of the user/bot and the value is a list of the names of the streams that the user/bot is already subscribed to. 
	 */
	void setAlreadySubscribed(Map <std::string, std::string> already_subscribed);
	/*! \brief Get A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
	 */
	std::list<std::string> getUnauthorized();

	/*! \brief Set A list of names of streams that the requesting user/bot was not authorized to subscribe to.  Only present if `authorization_errors_fatal=false`. 
	 */
	void setUnauthorized(std::list <std::string> unauthorized);


    private:
    AnyType result;
    AnyType msg;
    Map<std::string, std::string> subscribed;
    Map<std::string, std::string> already_subscribed;
    std::list<std::string> unauthorized;
};
}

#endif /* TINY_CPP_CLIENT_AddSubscriptionsResponse_H_ */
