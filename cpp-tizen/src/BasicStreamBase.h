/*
 * BasicStreamBase.h
 *
 * Object containing basic details about the stream. 
 */

#ifndef _BasicStreamBase_H_
#define _BasicStreamBase_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing basic details about the stream. 
 *
 *  \ingroup Models
 *
 */

class BasicStreamBase : public Object {
public:
	/*! \brief Constructor.
	 */
	BasicStreamBase();
	BasicStreamBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BasicStreamBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique ID of the stream. 
	 */
	int getStreamId();

	/*! \brief Set The unique ID of the stream. 
	 */
	void setStreamId(int  stream_id);
	/*! \brief Get The name of the stream. 
	 */
	std::string getName();

	/*! \brief Set The name of the stream. 
	 */
	void setName(std::string  name);
	/*! \brief Get The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
	 */
	std::string getDescription();

	/*! \brief Set The short description of the stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
	 */
	void setDescription(std::string  description);
	/*! \brief Get The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
	 */
	int getDateCreated();

	/*! \brief Set The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
	 */
	void setDateCreated(int  date_created);
	/*! \brief Get Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
	 */
	bool getInviteOnly();

	/*! \brief Set Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
	 */
	void setInviteOnly(bool  invite_only);
	/*! \brief Get The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
	 */
	std::string getRenderedDescription();

	/*! \brief Set The short description of the stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
	 */
	void setRenderedDescription(std::string  rendered_description);
	/*! \brief Get Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
	 */
	bool getIsWebPublic();

	/*! \brief Set Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
	 */
	void setIsWebPublic(bool  is_web_public);
	/*! \brief Get Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
	 */
	int getStreamPostPolicy();

	/*! \brief Set Policy for which users can post messages to the stream.  * 1 => Any user can post. * 2 => Only administrators can post. * 3 => Only full members can post. * 4 => Only moderators can post.  **Changes**: New in Zulip 3.0, replacing the previous `is_announcement_only` boolean. 
	 */
	void setStreamPostPolicy(int  stream_post_policy);
	/*! \brief Get Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
	 */
	int getMessageRetentionDays();

	/*! \brief Set Number of days that messages sent to this stream will be stored before being automatically deleted by the [message retention policy](/help/message-retention-policy).  There are two special values:  * `null`, the default, means the stream will inherit the organization   level setting. * `-1` encodes retaining messages in this stream forever.  **Changes**: New in Zulip 3.0 (feature level 17). 
	 */
	void setMessageRetentionDays(int  message_retention_days);
	/*! \brief Get Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
	 */
	bool getHistoryPublicToSubscribers();

	/*! \brief Set Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
	 */
	void setHistoryPublicToSubscribers(bool  history_public_to_subscribers);
	/*! \brief Get The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
	 */
	int getFirstMessageId();

	/*! \brief Set The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
	 */
	void setFirstMessageId(int  first_message_id);
	/*! \brief Get Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
	 */
	bool getIsAnnouncementOnly();

	/*! \brief Set Whether the given stream is announcement only or not.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
	 */
	void setIsAnnouncementOnly(bool  is_announcement_only);

private:
	int stream_id;
	std::string name;
	std::string description;
	int date_created;
	bool invite_only;
	std::string rendered_description;
	bool is_web_public;
	int stream_post_policy;
	int message_retention_days;
	bool history_public_to_subscribers;
	int first_message_id;
	bool is_announcement_only;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BasicStreamBase_H_ */
