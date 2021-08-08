
/*
 * ApiKeyResponse_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ApiKeyResponse_allOf_H_
#define TINY_CPP_CLIENT_ApiKeyResponse_allOf_H_


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

class ApiKeyResponse_allOf{
public:

    /*! \brief Constructor.
	 */
    ApiKeyResponse_allOf();
    ApiKeyResponse_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApiKeyResponse_allOf();


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
	/*! \brief Get The API key that can be used to authenticate as the requested user. 
	 */
	std::string getApiKey();

	/*! \brief Set The API key that can be used to authenticate as the requested user. 
	 */
	void setApiKey(std::string  api_key);
	/*! \brief Get The email address of the user who owns the API key 
	 */
	std::string getEmail();

	/*! \brief Set The email address of the user who owns the API key 
	 */
	void setEmail(std::string  email);


    private:
    AnyType result;
    AnyType msg;
    std::string api_key{};
    std::string email{};
};
}

#endif /* TINY_CPP_CLIENT_ApiKeyResponse_allOf_H_ */
