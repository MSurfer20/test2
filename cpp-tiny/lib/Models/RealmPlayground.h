
/*
 * RealmPlayground.h
 *
 * Object containing details about a realm playground. 
 */

#ifndef TINY_CPP_CLIENT_RealmPlayground_H_
#define TINY_CPP_CLIENT_RealmPlayground_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Object containing details about a realm playground. 
 *
 *  \ingroup Models
 *
 */

class RealmPlayground{
public:

    /*! \brief Constructor.
	 */
    RealmPlayground();
    RealmPlayground(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealmPlayground();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique ID for the realm playground. 
	 */
	int getId();

	/*! \brief Set The unique ID for the realm playground. 
	 */
	void setId(int  id);
	/*! \brief Get The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
	 */
	std::string getName();

	/*! \brief Set The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
	 */
	void setName(std::string  name);
	/*! \brief Get The name of the Pygments language lexer for that programming language. 
	 */
	std::string getPygmentsLanguage();

	/*! \brief Set The name of the Pygments language lexer for that programming language. 
	 */
	void setPygmentsLanguage(std::string  pygments_language);
	/*! \brief Get The url prefix for the playground. 
	 */
	std::string getUrlPrefix();

	/*! \brief Set The url prefix for the playground. 
	 */
	void setUrlPrefix(std::string  url_prefix);


    private:
    int id{};
    std::string name{};
    std::string pygments_language{};
    std::string url_prefix{};
};
}

#endif /* TINY_CPP_CLIENT_RealmPlayground_H_ */
