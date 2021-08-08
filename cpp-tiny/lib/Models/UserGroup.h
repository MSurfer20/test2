
/*
 * UserGroup.h
 *
 * Object containing the user group&#39;s attributes. 
 */

#ifndef TINY_CPP_CLIENT_UserGroup_H_
#define TINY_CPP_CLIENT_UserGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Object containing the user group's attributes. 
 *
 *  \ingroup Models
 *
 */

class UserGroup{
public:

    /*! \brief Constructor.
	 */
    UserGroup();
    UserGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserGroup();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    std::string description{};
    std::list<int> members;
    int id{};
};
}

#endif /* TINY_CPP_CLIENT_UserGroup_H_ */
