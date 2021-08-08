/*
 * JsonErrorBase.h
 *
 * 
 */

#ifndef _JsonErrorBase_H_
#define _JsonErrorBase_H_


#include <string>
#include "JsonErrorBase_allOf.h"
#include "JsonResponseBase.h"
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

class JsonErrorBase : public Object {
public:
	/*! \brief Constructor.
	 */
	JsonErrorBase();
	JsonErrorBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~JsonErrorBase();

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
	/*! \brief Get 
	 */
	std::string getMsg();

	/*! \brief Set 
	 */
	void setMsg(std::string  msg);

private:
	std::string result;
	std::string msg;
	void __init();
	void __cleanup();

};
}
}

#endif /* _JsonErrorBase_H_ */
