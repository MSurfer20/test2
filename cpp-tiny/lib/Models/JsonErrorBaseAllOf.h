
/*
 * JsonErrorBase_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_JsonErrorBase_allOf_H_
#define TINY_CPP_CLIENT_JsonErrorBase_allOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class JsonErrorBase_allOf{
public:

    /*! \brief Constructor.
	 */
    JsonErrorBase_allOf();
    JsonErrorBase_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~JsonErrorBase_allOf();


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

#endif /* TINY_CPP_CLIENT_JsonErrorBase_allOf_H_ */
