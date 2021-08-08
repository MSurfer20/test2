
/*
 * InvalidMessageError_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InvalidMessageError_allOf_H_
#define TINY_CPP_CLIENT_InvalidMessageError_allOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InvalidMessageError_allOf{
public:

    /*! \brief Constructor.
	 */
    InvalidMessageError_allOf();
    InvalidMessageError_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InvalidMessageError_allOf();


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

#endif /* TINY_CPP_CLIENT_InvalidMessageError_allOf_H_ */
