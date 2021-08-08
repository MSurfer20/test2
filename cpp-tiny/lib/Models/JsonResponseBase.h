
/*
 * JsonResponseBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_JsonResponseBase_H_
#define TINY_CPP_CLIENT_JsonResponseBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class JsonResponseBase{
public:

    /*! \brief Constructor.
	 */
    JsonResponseBase();
    JsonResponseBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~JsonResponseBase();


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


    private:
    std::string result{};
};
}

#endif /* TINY_CPP_CLIENT_JsonResponseBase_H_ */
