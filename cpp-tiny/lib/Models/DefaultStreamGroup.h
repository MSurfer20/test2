
/*
 * DefaultStreamGroup.h
 *
 * Dictionary containing details of a default stream group. 
 */

#ifndef TINY_CPP_CLIENT_DefaultStreamGroup_H_
#define TINY_CPP_CLIENT_DefaultStreamGroup_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BasicStream.h"
#include <list>

namespace Tiny {


/*! \brief Dictionary containing details of a default stream group. 
 *
 *  \ingroup Models
 *
 */

class DefaultStreamGroup{
public:

    /*! \brief Constructor.
	 */
    DefaultStreamGroup();
    DefaultStreamGroup(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DefaultStreamGroup();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Name of the default stream group. 
	 */
	std::string getName();

	/*! \brief Set Name of the default stream group. 
	 */
	void setName(std::string  name);
	/*! \brief Get Description of the default stream group. 
	 */
	std::string getDescription();

	/*! \brief Set Description of the default stream group. 
	 */
	void setDescription(std::string  description);
	/*! \brief Get id of the default stream group. 
	 */
	int getId();

	/*! \brief Set id of the default stream group. 
	 */
	void setId(int  id);
	/*! \brief Get Array containing details about the streams in the default stream group. 
	 */
	std::list<BasicStream> getStreams();

	/*! \brief Set Array containing details about the streams in the default stream group. 
	 */
	void setStreams(std::list <BasicStream> streams);


    private:
    std::string name{};
    std::string description{};
    int id{};
    std::list<BasicStream> streams;
};
}

#endif /* TINY_CPP_CLIENT_DefaultStreamGroup_H_ */
