
/*
 * BadEventQueueIdError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BadEventQueueIdError_H_
#define TINY_CPP_CLIENT_BadEventQueueIdError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "BadEventQueueIdError_allOf.h"
#include "CodedErrorBase.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BadEventQueueIdError{
public:

    /*! \brief Constructor.
	 */
    BadEventQueueIdError();
    BadEventQueueIdError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BadEventQueueIdError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string queue_id{};
};
}

#endif /* TINY_CPP_CLIENT_BadEventQueueIdError_H_ */
