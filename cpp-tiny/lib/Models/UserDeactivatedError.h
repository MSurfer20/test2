
/*
 * UserDeactivatedError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UserDeactivatedError_H_
#define TINY_CPP_CLIENT_UserDeactivatedError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "CodedError.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UserDeactivatedError{
public:

    /*! \brief Constructor.
	 */
    UserDeactivatedError();
    UserDeactivatedError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserDeactivatedError();


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


    private:
    AnyType result;
    AnyType msg;
    AnyType code;
};
}

#endif /* TINY_CPP_CLIENT_UserDeactivatedError_H_ */
