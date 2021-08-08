
/*
 * JsonErrorBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_JsonErrorBase_H_
#define TINY_CPP_CLIENT_JsonErrorBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "JsonErrorBase_allOf.h"
#include "JsonResponseBase.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class JsonErrorBase{
public:

    /*! \brief Constructor.
	 */
    JsonErrorBase();
    JsonErrorBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~JsonErrorBase();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string result{};
    std::string msg{};
};
}

#endif /* TINY_CPP_CLIENT_JsonErrorBase_H_ */
