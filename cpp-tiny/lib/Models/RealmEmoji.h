
/*
 * RealmEmoji.h
 *
 * &#x60;{emoji_id}&#x60;: Object containing details about the emoji with  the specified ID. It has the following properties: 
 */

#ifndef TINY_CPP_CLIENT_RealmEmoji_H_
#define TINY_CPP_CLIENT_RealmEmoji_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief `{emoji_id}`: Object containing details about the emoji with  the specified ID. It has the following properties: 
 *
 *  \ingroup Models
 *
 */

class RealmEmoji{
public:

    /*! \brief Constructor.
	 */
    RealmEmoji();
    RealmEmoji(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealmEmoji();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	bool isDeactivated();

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
    std::string id{};
    std::string name{};
    std::string source_url{};
    bool deactivated{};
    int author_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealmEmoji_H_ */
