
/*
 * Attachments.h
 *
 * Dictionary containing details of a file uploaded by a user. 
 */

#ifndef TINY_CPP_CLIENT_Attachments_H_
#define TINY_CPP_CLIENT_Attachments_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Attachments_messages.h"
#include <list>

namespace Tiny {


/*! \brief Dictionary containing details of a file uploaded by a user. 
 *
 *  \ingroup Models
 *
 */

class Attachments{
public:

    /*! \brief Constructor.
	 */
    Attachments();
    Attachments(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Attachments();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int id{};
    std::string name{};
    std::string path_id{};
    int size{};
    int create_time{};
    std::list<Attachments_messages> messages;
};
}

#endif /* TINY_CPP_CLIENT_Attachments_H_ */
