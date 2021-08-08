
/*
 * MissingArgumentError.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MissingArgumentError_H_
#define TINY_CPP_CLIENT_MissingArgumentError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "CodedErrorBase.h"
#include "MissingArgumentError_allOf.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MissingArgumentError{
public:

    /*! \brief Constructor.
	 */
    MissingArgumentError();
    MissingArgumentError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MissingArgumentError();


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
	/*! \brief Get It contains the information about the missing parameter. 
	 */
	std::string getVarName();

	/*! \brief Set It contains the information about the missing parameter. 
	 */
	void setVarName(std::string  var_name);


    private:
    AnyType result;
    AnyType msg;
    AnyType code;
    std::string var_name{};
};
}

#endif /* TINY_CPP_CLIENT_MissingArgumentError_H_ */
