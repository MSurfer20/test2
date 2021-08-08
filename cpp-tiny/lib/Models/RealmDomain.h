
/*
 * RealmDomain.h
 *
 * Object containing details of the newly added domain. 
 */

#ifndef TINY_CPP_CLIENT_RealmDomain_H_
#define TINY_CPP_CLIENT_RealmDomain_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Object containing details of the newly added domain. 
 *
 *  \ingroup Models
 *
 */

class RealmDomain{
public:

    /*! \brief Constructor.
	 */
    RealmDomain();
    RealmDomain(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealmDomain();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The new allowed domain. 
	 */
	std::string getDomain();

	/*! \brief Set The new allowed domain. 
	 */
	void setDomain(std::string  domain);
	/*! \brief Get Whether subdomains are allowed for this domain. 
	 */
	bool isAllowSubdomains();

	/*! \brief Set Whether subdomains are allowed for this domain. 
	 */
	void setAllowSubdomains(bool  allow_subdomains);


    private:
    std::string domain{};
    bool allow_subdomains{};
};
}

#endif /* TINY_CPP_CLIENT_RealmDomain_H_ */
