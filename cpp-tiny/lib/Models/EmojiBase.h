
/*
 * EmojiBase.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EmojiBase_H_
#define TINY_CPP_CLIENT_EmojiBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EmojiBase{
public:

    /*! \brief Constructor.
	 */
    EmojiBase();
    EmojiBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmojiBase();


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


    private:
    std::string emoji_code{};
    std::string emoji_name{};
    std::string reaction_type{};
};
}

#endif /* TINY_CPP_CLIENT_EmojiBase_H_ */
