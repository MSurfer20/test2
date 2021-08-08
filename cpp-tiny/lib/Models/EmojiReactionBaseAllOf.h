
/*
 * EmojiReactionBase_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EmojiReactionBase_allOf_H_
#define TINY_CPP_CLIENT_EmojiReactionBase_allOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EmojiReactionBase_allOf_user.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EmojiReactionBase_allOf{
public:

    /*! \brief Constructor.
	 */
    EmojiReactionBase_allOf();
    EmojiReactionBase_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmojiReactionBase_allOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
	 */
	int getUserId();

	/*! \brief Set The ID of the user who added the reaction.  **Changes**: New in Zulip 3.0 (feature level 2). The `user` object is deprecated and will be removed in the future. 
	 */
	void setUserId(int  user_id);
	/*! \brief Get 
	 */
	EmojiReactionBase_allOf_user getUser();

	/*! \brief Set 
	 */
	void setUser(EmojiReactionBase_allOf_user  user);


    private:
    int user_id{};
    EmojiReactionBase_allOf_user user;
};
}

#endif /* TINY_CPP_CLIENT_EmojiReactionBase_allOf_H_ */
