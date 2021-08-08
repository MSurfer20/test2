/*
 * UserDeactivatedError.h
 *
 * 
 */

#ifndef _UserDeactivatedError_H_
#define _UserDeactivatedError_H_


#include <string>
#include "AnyType.h"
#include "CodedError.h"
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

class UserDeactivatedError : public Object {
public:
	/*! \brief Constructor.
	 */
	UserDeactivatedError();
	UserDeactivatedError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserDeactivatedError();

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
	/*! \brief Get 
	 */
	AnyType getCode();

	/*! \brief Set 
	 */
	void setCode(AnyType  code);

private:
	AnyType result;
	AnyType msg;
	AnyType code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserDeactivatedError_H_ */
