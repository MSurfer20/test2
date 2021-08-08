/*
 * RealmPlayground.h
 *
 * Object containing details about a realm playground. 
 */

#ifndef _RealmPlayground_H_
#define _RealmPlayground_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing details about a realm playground. 
 *
 *  \ingroup Models
 *
 */

class RealmPlayground : public Object {
public:
	/*! \brief Constructor.
	 */
	RealmPlayground();
	RealmPlayground(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealmPlayground();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int id;
	std::string name;
	std::string pygments_language;
	std::string url_prefix;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealmPlayground_H_ */
