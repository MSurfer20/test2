/*
 * EmojiReaction.h
 *
 * 
 */

#ifndef _EmojiReaction_H_
#define _EmojiReaction_H_


#include <string>
#include "AnyType.h"
#include "EmojiReactionBase.h"
#include "EmojiReaction_allOf.h"
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

class EmojiReaction : public Object {
public:
	/*! \brief Constructor.
	 */
	EmojiReaction();
	EmojiReaction(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EmojiReaction();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AnyType getEmojiCode();

	/*! \brief Set 
	 */
	void setEmojiCode(AnyType  emoji_code);
	/*! \brief Get 
	 */
	AnyType getEmojiName();

	/*! \brief Set 
	 */
	void setEmojiName(AnyType  emoji_name);
	/*! \brief Get 
	 */
	AnyType getReactionType();

	/*! \brief Set 
	 */
	void setReactionType(AnyType  reaction_type);
	/*! \brief Get 
	 */
	AnyType getUserId();

	/*! \brief Set 
	 */
	void setUserId(AnyType  user_id);
	/*! \brief Get 
	 */
	AnyType getUser();

	/*! \brief Set 
	 */
	void setUser(AnyType  user);

private:
	AnyType emoji_code;
	AnyType emoji_name;
	AnyType reaction_type;
	AnyType user_id;
	AnyType user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EmojiReaction_H_ */
