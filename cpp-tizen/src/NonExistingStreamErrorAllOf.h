/*
 * NonExistingStreamError_allOf.h
 *
 * 
 */

#ifndef _NonExistingStreamError_allOf_H_
#define _NonExistingStreamError_allOf_H_


#include <string>
#include "AnyType.h"
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

class NonExistingStreamError_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	NonExistingStreamError_allOf();
	NonExistingStreamError_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NonExistingStreamError_allOf();

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
	/*! \brief Get The name of the stream that could not be found. 
	 */
	std::string getStream();

	/*! \brief Set The name of the stream that could not be found. 
	 */
	void setStream(std::string  stream);

private:
	AnyType result;
	AnyType msg;
	AnyType code;
	std::string stream;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NonExistingStreamError_allOf_H_ */
