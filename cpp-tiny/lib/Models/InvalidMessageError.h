
/*
 * InvalidMessageError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InvalidMessageError_H_
#define TINY_CPP_CLIENT_InvalidMessageError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "InvalidMessageError_allOf.h"
#include "JsonSuccessBase.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InvalidMessageError{
public:

    /*! \brief Constructor.
	 */
    InvalidMessageError();
    InvalidMessageError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InvalidMessageError();


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
	/*! \brief Get The raw content of the message. 
	 */
	std::string getRawContent();

	/*! \brief Set The raw content of the message. 
	 */
	void setRawContent(std::string  raw_content);


    private:
    AnyType result;
    AnyType msg;
    std::string raw_content{};
};
}

#endif /* TINY_CPP_CLIENT_InvalidMessageError_H_ */
