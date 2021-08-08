/*
 * CodedErrorBase_allOf.h
 *
 * 
 */

#ifndef _CodedErrorBase_allOf_H_
#define _CodedErrorBase_allOf_H_


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

class CodedErrorBase_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	CodedErrorBase_allOf();
	CodedErrorBase_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CodedErrorBase_allOf();

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
	/*! \brief Get A string that identifies the error. 
	 */
	std::string getCode();

	/*! \brief Set A string that identifies the error. 
	 */
	void setCode(std::string  code);

private:
	AnyType result;
	AnyType msg;
	std::string code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CodedErrorBase_allOf_H_ */
