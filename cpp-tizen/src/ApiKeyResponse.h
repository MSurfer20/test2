/*
 * ApiKeyResponse.h
 *
 * 
 */

#ifndef _ApiKeyResponse_H_
#define _ApiKeyResponse_H_


#include <string>
#include "AnyType.h"
#include "ApiKeyResponse_allOf.h"
#include "JsonSuccessBase.h"
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

class ApiKeyResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiKeyResponse();
	ApiKeyResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiKeyResponse();

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
	std::string api_key;
	std::string email;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApiKeyResponse_H_ */
