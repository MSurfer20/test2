
/*
 * Attachments_messages.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Attachments_messages_H_
#define TINY_CPP_CLIENT_Attachments_messages_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Attachments_messages{
public:

    /*! \brief Constructor.
	 */
    Attachments_messages();
    Attachments_messages(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Attachments_messages();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
	 */
	int getDateSent();

	/*! \brief Set Time when the message was sent as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously strangely called `name` and was a floating point number. 
	 */
	void setDateSent(int  date_sent);
	/*! \brief Get The unique message ID.  Messages should always be displayed sorted by ID. 
	 */
	int getId();

	/*! \brief Set The unique message ID.  Messages should always be displayed sorted by ID. 
	 */
	void setId(int  id);


    private:
    int date_sent{};
    int id{};
};
}

#endif /* TINY_CPP_CLIENT_Attachments_messages_H_ */
