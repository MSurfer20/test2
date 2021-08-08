/*
 * MissingArgumentError_allOf.h
 *
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 */

#ifndef _MissingArgumentError_allOf_H_
#define _MissingArgumentError_allOf_H_


#include <string>
#include "AnyType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 *
 *  \ingroup Models
 *
 */

class MissingArgumentError_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	MissingArgumentError_allOf();
	MissingArgumentError_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MissingArgumentError_allOf();

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
	/*! \brief Get It contains the information about the missing parameter. 
	 */
	std::string getVarName();

	/*! \brief Set It contains the information about the missing parameter. 
	 */
	void setVarName(std::string  var_name);

private:
	AnyType result;
	AnyType msg;
	AnyType code;
	std::string var_name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MissingArgumentError_allOf_H_ */
