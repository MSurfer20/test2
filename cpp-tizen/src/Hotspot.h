/*
 * Hotspot.h
 *
 * Dictionary containing details of a single hotspot. 
 */

#ifndef _Hotspot_H_
#define _Hotspot_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Dictionary containing details of a single hotspot. 
 *
 *  \ingroup Models
 *
 */

class Hotspot : public Object {
public:
	/*! \brief Constructor.
	 */
	Hotspot();
	Hotspot(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Hotspot();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The delay after which the user should be shown the hotspot. 
	 */
	long long getDelay();

	/*! \brief Set The delay after which the user should be shown the hotspot. 
	 */
	void setDelay(long long  delay);
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
	long long delay;
	std::string name;
	std::string title;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Hotspot_H_ */
