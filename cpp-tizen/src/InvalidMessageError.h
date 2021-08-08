/*
 * InvalidMessageError.h
 *
 * 
 */

#ifndef _InvalidMessageError_H_
#define _InvalidMessageError_H_


#include <string>
#include "AnyType.h"
#include "InvalidMessageError_allOf.h"
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

class InvalidMessageError : public Object {
public:
	/*! \brief Constructor.
	 */
	InvalidMessageError();
	InvalidMessageError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InvalidMessageError();

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
	/*! \brief Get The raw content of the message. 
	 */
	std::string getRawContent();

	/*! \brief Set The raw content of the message. 
	 */
	void setRawContent(std::string  raw_content);

private:
	AnyType result;
	AnyType msg;
	std::string raw_content;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InvalidMessageError_H_ */
