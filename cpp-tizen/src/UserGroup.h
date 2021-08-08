/*
 * UserGroup.h
 *
 * Object containing the user group&#39;s attributes. 
 */

#ifndef _UserGroup_H_
#define _UserGroup_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing the user group's attributes. 
 *
 *  \ingroup Models
 *
 */

class UserGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	UserGroup();
	UserGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the user group. 
	 */
	std::string getName();

	/*! \brief Set The name of the user group. 
	 */
	void setName(std::string  name);
	/*! \brief Get The description of the user group. 
	 */
	std::string getDescription();

	/*! \brief Set The description of the user group. 
	 */
	void setDescription(std::string  description);
	/*! \brief Get Array containing the id of the users who are members of this user group. 
	 */
	std::list<int> getMembers();

	/*! \brief Set Array containing the id of the users who are members of this user group. 
	 */
	void setMembers(std::list <int> members);
	/*! \brief Get The ID of the user group. 
	 */
	int getId();

	/*! \brief Set The ID of the user group. 
	 */
	void setId(int  id);

private:
	std::string name;
	std::string description;
	std::list <int>members;
	int id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserGroup_H_ */
