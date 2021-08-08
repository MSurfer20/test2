/*
 * EmojiReactionBase.h
 *
 * 
 */

#ifndef _EmojiReactionBase_H_
#define _EmojiReactionBase_H_


#include <string>
#include "EmojiReactionBase_user.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EmojiReactionBase : public Object {
public:
	/*! \brief Constructor.
	 */
	EmojiReactionBase();
	EmojiReactionBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EmojiReactionBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
	 */
	std::string getEmojiCode();

	/*! \brief Set A unique identifier, defining the specific emoji codepoint requested, within the namespace of the `reaction_type`.  For example, for `unicode_emoji`, this will be an encoding of the Unicode codepoint. 
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
	EmojiReactionBase_user getUser();

	/*! \brief Set 
	 */
	void setUser(EmojiReactionBase_user  user);

private:
	std::string emoji_code;
	std::string emoji_name;
	std::string reaction_type;
	int user_id;
	EmojiReactionBase_user user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EmojiReactionBase_H_ */
