
/*
 * InvalidApiKeyError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InvalidApiKeyError_H_
#define TINY_CPP_CLIENT_InvalidApiKeyError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "JsonError.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InvalidApiKeyError{
public:

    /*! \brief Constructor.
	 */
    InvalidApiKeyError();
    InvalidApiKeyError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InvalidApiKeyError();


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


    private:
    AnyType result;
    AnyType msg;
};
}

#endif /* TINY_CPP_CLIENT_InvalidApiKeyError_H_ */
