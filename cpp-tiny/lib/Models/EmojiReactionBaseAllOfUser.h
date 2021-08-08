
/*
 * EmojiReactionBase_allOf_user.h
 *
 * Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the &#x60;id&#x60; field.  **Note**: In the [events API](/api/get-events), this &#x60;user&#x60; dictionary confusing had the user ID in a field called &#x60;user_id&#x60; instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the &#x60;user_id&#x60; field. 
 */

#ifndef TINY_CPP_CLIENT_EmojiReactionBase_allOf_user_H_
#define TINY_CPP_CLIENT_EmojiReactionBase_allOf_user_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Whether the user is a mirror dummy. Dictionary with data on the user who added the reaction, including the user ID as the `id` field.  **Note**: In the [events API](/api/get-events), this `user` dictionary confusing had the user ID in a field called `user_id` instead.  We recommend ignoring fields other than the user ID.  **Deprecated** and to be removed in a future release once core clients have migrated to use the `user_id` field. 
 *
 *  \ingroup Models
 *
 */

class EmojiReactionBase_allOf_user{
public:

    /*! \brief Constructor.
	 */
    EmojiReactionBase_allOf_user();
    EmojiReactionBase_allOf_user(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmojiReactionBase_allOf_user();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get ID of the user. 
	 */
	int getId();

	/*! \brief Set ID of the user. 
	 */
	void setId(int  id);
	/*! \brief Get Email of the user. 
	 */
	std::string getEmail();

	/*! \brief Set Email of the user. 
	 */
	void setEmail(std::string  email);
	/*! \brief Get Full name of the user. 
	 */
	std::string getFullName();

	/*! \brief Set Full name of the user. 
	 */
	void setFullName(std::string  full_name);
	/*! \brief Get Whether the user is a mirror dummy. 
	 */
	bool isIsMirrorDummy();

	/*! \brief Set Whether the user is a mirror dummy. 
	 */
	void setIsMirrorDummy(bool  is_mirror_dummy);


    private:
    int id{};
    std::string email{};
    std::string full_name{};
    bool is_mirror_dummy{};
};
}

#endif /* TINY_CPP_CLIENT_EmojiReactionBase_allOf_user_H_ */
