
/*
 * NonExistingStreamError_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_NonExistingStreamError_allOf_H_
#define TINY_CPP_CLIENT_NonExistingStreamError_allOf_H_


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

class NonExistingStreamError_allOf{
public:

    /*! \brief Constructor.
	 */
    NonExistingStreamError_allOf();
    NonExistingStreamError_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NonExistingStreamError_allOf();


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
	/*! \brief Get The name of the stream that could not be found. 
	 */
	std::string getStream();

	/*! \brief Set The name of the stream that could not be found. 
	 */
	void setStream(std::string  stream);


    private:
    AnyType result;
    AnyType msg;
    AnyType code;
    std::string stream{};
};
}

#endif /* TINY_CPP_CLIENT_NonExistingStreamError_allOf_H_ */
