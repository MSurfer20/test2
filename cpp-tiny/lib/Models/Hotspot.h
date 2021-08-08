
/*
 * Hotspot.h
 *
 * Dictionary containing details of a single hotspot. 
 */

#ifndef TINY_CPP_CLIENT_Hotspot_H_
#define TINY_CPP_CLIENT_Hotspot_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Dictionary containing details of a single hotspot. 
 *
 *  \ingroup Models
 *
 */

class Hotspot{
public:

    /*! \brief Constructor.
	 */
    Hotspot();
    Hotspot(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Hotspot();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The delay after which the user should be shown the hotspot. 
	 */
	long getDelay();

	/*! \brief Set The delay after which the user should be shown the hotspot. 
	 */
	void setDelay(long  delay);
	/*! \brief Get The name of the hotspot. 
	 */
	std::string getName();

	/*! \brief Set The name of the hotspot. 
	 */
	void setName(std::string  name);
	/*! \brief Get The title of the hotspot, as will be displayed to the user. 
	 */
	std::string getTitle();

	/*! \brief Set The title of the hotspot, as will be displayed to the user. 
	 */
	void setTitle(std::string  title);
	/*! \brief Get The description of the hotspot, as will be displayed to the user. 
	 */
	std::string getDescription();

	/*! \brief Set The description of the hotspot, as will be displayed to the user. 
	 */
	void setDescription(std::string  description);


    private:
    long delay{};
    std::string name{};
    std::string title{};
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_Hotspot_H_ */
