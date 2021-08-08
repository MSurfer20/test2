/*
 * JsonSuccess_allOf.h
 *
 * 
 */

#ifndef _JsonSuccess_allOf_H_
#define _JsonSuccess_allOf_H_


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

class JsonSuccess_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	JsonSuccess_allOf();
	JsonSuccess_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~JsonSuccess_allOf();

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

private:
	AnyType result;
	AnyType msg;
	void __init();
	void __cleanup();

};
}
}

#endif /* _JsonSuccess_allOf_H_ */
