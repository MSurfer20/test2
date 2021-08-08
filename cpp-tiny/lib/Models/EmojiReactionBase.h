
/*
 * EmojiReactionBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EmojiReactionBase_H_
#define TINY_CPP_CLIENT_EmojiReactionBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EmojiBase.h"
#include "EmojiReactionBase_allOf.h"
#include "EmojiReactionBase_allOf_user.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EmojiReactionBase{
public:

    /*! \brief Constructor.
	 */
    EmojiReactionBase();
    EmojiReactionBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmojiReactionBase();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
	 */
	std::string getEmojiCode();

	/*! \brief Set A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint; for `realm_emoji`, it'll be the ID of the realm emoji. 
	 */
	void setEmojiCode(std::string  emoji_code);
	/*! \brief Get Name of the emoji. 
	 */
	std::string getEmojiName();

	/*! \brief Set Name of the emoji. 
	 */
	void setEmojiName(std::string  emoji_name);
	/*! \brief Get One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
	 */
	std::string getReactionType();

	/*! \brief Set One of the following values:  * `unicode_emoji`: Unicode emoji (`emoji_code` will be its Unicode   codepoint). * `realm_emoji`: [Custom emoji](/help/add-custom-emoji).   (`emoji_code` will be its ID). * `zulip_extra_emoji`: Special emoji included with Zulip.  Exists to   namespace the `zulip` emoji. 
	 */
	void setReactionType(std::string  reaction_type);
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
    std::string emoji_code{};
    std::string emoji_name{};
    std::string reaction_type{};
    int user_id{};
    EmojiReactionBase_allOf_user user;
};
}

#endif /* TINY_CPP_CLIENT_EmojiReactionBase_H_ */
