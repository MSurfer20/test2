
/*
 * CodedErrorBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CodedErrorBase_H_
#define TINY_CPP_CLIENT_CodedErrorBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "CodedErrorBase_allOf.h"
#include "JsonErrorBase.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CodedErrorBase{
public:

    /*! \brief Constructor.
	 */
    CodedErrorBase();
    CodedErrorBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CodedErrorBase();


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
	/*! \brief Get A string that identifies the error. 
	 */
	std::string getCode();

	/*! \brief Set A string that identifies the error. 
	 */
	void setCode(std::string  code);


    private:
    AnyType result;
    AnyType msg;
    std::string code{};
};
}

#endif /* TINY_CPP_CLIENT_CodedErrorBase_H_ */
