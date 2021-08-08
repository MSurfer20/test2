/*
 * JsonResponseBase.h
 *
 * 
 */

#ifndef _JsonResponseBase_H_
#define _JsonResponseBase_H_


#include <string>
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

class JsonResponseBase : public Object {
public:
	/*! \brief Constructor.
	 */
	JsonResponseBase();
	JsonResponseBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~JsonResponseBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getResult();

	/*! \brief Set 
	 */
	void setResult(std::string  result);

private:
	std::string result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _JsonResponseBase_H_ */
