/*
 * EmojiReactionBase_allOf.h
 *
 * 
 */

#ifndef _EmojiReactionBase_allOf_H_
#define _EmojiReactionBase_allOf_H_


#include <string>
#include "EmojiReactionBase_allOf_user.h"
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

class EmojiReactionBase_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	EmojiReactionBase_allOf();
	EmojiReactionBase_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EmojiReactionBase_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int user_id;
	EmojiReactionBase_allOf_user user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EmojiReactionBase_allOf_H_ */
