/*
 * Attachments.h
 *
 * Dictionary containing details of a file uploaded by a user. 
 */

#ifndef _Attachments_H_
#define _Attachments_H_


#include <string>
#include "Attachments_messages.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Dictionary containing details of a file uploaded by a user. 
 *
 *  \ingroup Models
 *
 */

class Attachments : public Object {
public:
	/*! \brief Constructor.
	 */
	Attachments();
	Attachments(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Attachments();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique ID for the attachment. 
	 */
	int getId();

	/*! \brief Set The unique ID for the attachment. 
	 */
	void setId(int  id);
	/*! \brief Get Name of the uploaded file. 
	 */
	std::string getName();

	/*! \brief Set Name of the uploaded file. 
	 */
	void setName(std::string  name);
	/*! \brief Get A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
	 */
	std::string getPathId();

	/*! \brief Set A representation of the path of the file within the repository of user-uploaded files.  If the `path_id` of a file is `{realm_id}/ab/cdef/temp_file.py`, its URL will be: `{server_url}/user_uploads/{realm_id}/ab/cdef/temp_file.py`. 
	 */
	void setPathId(std::string  path_id);
	/*! \brief Get Size of the file in bytes. 
	 */
	int getSize();

	/*! \brief Set Size of the file in bytes. 
	 */
	void setSize(int  size);
	/*! \brief Get Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
	 */
	int getCreateTime();

	/*! \brief Set Time when the attachment was uploaded as a UNIX timestamp multiplied by 1000 (matching the format of getTime() in JavaScript).  **Changes**: Changed in Zulip 2.2 (feature level 22).  This field was previously a floating point number. 
	 */
	void setCreateTime(int  create_time);
	/*! \brief Get Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
	 */
	std::list<Attachments_messages> getMessages();

	/*! \brief Set Contains basic details on any Zulip messages that have been sent referencing this [uploaded file](/api/upload-file). This includes messages sent by any user in the Zulip organization who sent a message containing a link to the uploaded file. 
	 */
	void setMessages(std::list <Attachments_messages> messages);

private:
	int id;
	std::string name;
	std::string path_id;
	int size;
	int create_time;
	std::list <Attachments_messages>messages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Attachments_H_ */
