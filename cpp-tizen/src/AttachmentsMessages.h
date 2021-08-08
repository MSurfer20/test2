/*
 * Attachments_messages.h
 *
 * 
 */

#ifndef _Attachments_messages_H_
#define _Attachments_messages_H_


#include <string>
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

class Attachments_messages : public Object {
public:
	/*! \brief Constructor.
	 */
	Attachments_messages();
	Attachments_messages(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Attachments_messages();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int date_sent;
	int id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Attachments_messages_H_ */
