/*
 * RealmEmoji.h
 *
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */

#ifndef _RealmEmoji_H_
#define _RealmEmoji_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 *
 *  \ingroup Models
 *
 */

class RealmEmoji : public Object {
public:
	/*! \brief Constructor.
	 */
	RealmEmoji();
	RealmEmoji(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealmEmoji();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID for this emoji, same as the object's key. 
	 */
	std::string getId();

	/*! \brief Set The ID for this emoji, same as the object's key. 
	 */
	void setId(std::string  id);
	/*! \brief Get The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
	 */
	std::string getName();

	/*! \brief Set The user-friendly name for this emoji. Users in the organization can use this emoji by writing this name between colons (`:name  :`). 
	 */
	void setName(std::string  name);
	/*! \brief Get The path relative to the organization's URL where the emoji's image can be found. 
	 */
	std::string getSourceUrl();

	/*! \brief Set The path relative to the organization's URL where the emoji's image can be found. 
	 */
	void setSourceUrl(std::string  source_url);
	/*! \brief Get Whether the emoji has been deactivated or not. 
	 */
	bool getDeactivated();

	/*! \brief Set Whether the emoji has been deactivated or not. 
	 */
	void setDeactivated(bool  deactivated);
	/*! \brief Get The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
	 */
	int getAuthorId();

	/*! \brief Set The user ID of the user who uploaded the custom emoji. Will be null if the uploader is unknown.  **Changes**: New in Zulip 3.0 (feature level 7).  Previously was accessible via and `author` object with an `id` field. 
	 */
	void setAuthorId(int  author_id);

private:
	std::string id;
	std::string name;
	std::string source_url;
	bool deactivated;
	int author_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealmEmoji_H_ */
