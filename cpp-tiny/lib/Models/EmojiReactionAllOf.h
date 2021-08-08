
/*
 * EmojiReaction_allOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EmojiReaction_allOf_H_
#define TINY_CPP_CLIENT_EmojiReaction_allOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EmojiReaction_allOf{
public:

    /*! \brief Constructor.
	 */
    EmojiReaction_allOf();
    EmojiReaction_allOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EmojiReaction_allOf();


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

#endif /* TINY_CPP_CLIENT_EmojiReaction_allOf_H_ */
