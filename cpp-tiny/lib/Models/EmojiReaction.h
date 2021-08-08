
/*
 * EmojiReaction.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EmojiReaction_H_
#define TINY_CPP_CLIENT_EmojiReaction_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "EmojiReactionBase.h"
#include "EmojiReaction_allOf.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EmojiReaction{
public:

    /*! \brief Constructor.
	 */
    EmojiReaction();
    EmojiReaction(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmojiReaction();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_EmojiReaction_H_ */
