/*
 * BadEventQueueIdError.h
 *
 * 
 */

#ifndef _BadEventQueueIdError_H_
#define _BadEventQueueIdError_H_


#include <string>
#include "AnyType.h"
#include "BadEventQueueIdError_allOf.h"
#include "CodedErrorBase.h"
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

class BadEventQueueIdError : public Object {
public:
	/*! \brief Constructor.
	 */
	BadEventQueueIdError();
	BadEventQueueIdError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BadEventQueueIdError();

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
	/*! \brief Get The string that identifies the invalid event queue. 
	 */
	std::string getQueueId();

	/*! \brief Set The string that identifies the invalid event queue. 
	 */
	void setQueueId(std::string  queue_id);

private:
	AnyType result;
	AnyType msg;
	AnyType code;
	std::string queue_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BadEventQueueIdError_H_ */
