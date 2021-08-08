/*
 * DefaultStreamGroup.h
 *
 * Dictionary containing details of a default stream group. 
 */

#ifndef _DefaultStreamGroup_H_
#define _DefaultStreamGroup_H_


#include <string>
#include "BasicStream.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Dictionary containing details of a default stream group. 
 *
 *  \ingroup Models
 *
 */

class DefaultStreamGroup : public Object {
public:
	/*! \brief Constructor.
	 */
	DefaultStreamGroup();
	DefaultStreamGroup(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DefaultStreamGroup();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string name;
	std::string description;
	int id;
	std::list <BasicStream>streams;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DefaultStreamGroup_H_ */
