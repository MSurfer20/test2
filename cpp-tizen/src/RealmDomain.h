/*
 * RealmDomain.h
 *
 * Object containing details of the newly added domain. 
 */

#ifndef _RealmDomain_H_
#define _RealmDomain_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing details of the newly added domain. 
 *
 *  \ingroup Models
 *
 */

class RealmDomain : public Object {
public:
	/*! \brief Constructor.
	 */
	RealmDomain();
	RealmDomain(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealmDomain();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The new allowed domain. 
	 */
	std::string getDomain();

	/*! \brief Set The new allowed domain. 
	 */
	void setDomain(std::string  domain);
	/*! \brief Get Whether subdomains are allowed for this domain. 
	 */
	bool getAllowSubdomains();

	/*! \brief Set Whether subdomains are allowed for this domain. 
	 */
	void setAllowSubdomains(bool  allow_subdomains);

private:
	std::string domain;
	bool allow_subdomains;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealmDomain_H_ */
