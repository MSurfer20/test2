/*
 * GetMessages_allOf.h
 *
 * 
 */

#ifndef _GetMessages_allOf_H_
#define _GetMessages_allOf_H_


#include <string>
#include "AnyType.h"
#include <list>
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

class GetMessages_allOf : public Object {
public:
	/*! \brief Constructor.
	 */
	GetMessages_allOf();
	GetMessages_allOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetMessages_allOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AnyType getAvatarUrl();

	/*! \brief Set 
	 */
	void setAvatarUrl(AnyType  avatar_url);
	/*! \brief Get 
	 */
	AnyType getClient();

	/*! \brief Set 
	 */
	void setClient(AnyType  client);
	/*! \brief Get 
	 */
	AnyType getContent();

	/*! \brief Set 
	 */
	void setContent(AnyType  content);
	/*! \brief Get 
	 */
	AnyType getContentType();

	/*! \brief Set 
	 */
	void setContentType(AnyType  content_type);
	/*! \brief Get 
	 */
	AnyType getDisplayRecipient();

	/*! \brief Set 
	 */
	void setDisplayRecipient(AnyType  display_recipient);
	/*! \brief Get 
	 */
	AnyType getId();

	/*! \brief Set 
	 */
	void setId(AnyType  id);
	/*! \brief Get 
	 */
	AnyType getIsMeMessage();

	/*! \brief Set 
	 */
	void setIsMeMessage(AnyType  is_me_message);
	/*! \brief Get 
	 */
	AnyType getReactions();

	/*! \brief Set 
	 */
	void setReactions(AnyType  reactions);
	/*! \brief Get 
	 */
	AnyType getRecipientId();

	/*! \brief Set 
	 */
	void setRecipientId(AnyType  recipient_id);
	/*! \brief Get 
	 */
	AnyType getSenderEmail();

	/*! \brief Set 
	 */
	void setSenderEmail(AnyType  sender_email);
	/*! \brief Get 
	 */
	AnyType getSenderFullName();

	/*! \brief Set 
	 */
	void setSenderFullName(AnyType  sender_full_name);
	/*! \brief Get 
	 */
	AnyType getSenderId();

	/*! \brief Set 
	 */
	void setSenderId(AnyType  sender_id);
	/*! \brief Get 
	 */
	AnyType getSenderRealmStr();

	/*! \brief Set 
	 */
	void setSenderRealmStr(AnyType  sender_realm_str);
	/*! \brief Get 
	 */
	AnyType getStreamId();

	/*! \brief Set 
	 */
	void setStreamId(AnyType  stream_id);
	/*! \brief Get 
	 */
	AnyType getSubject();

	/*! \brief Set 
	 */
	void setSubject(AnyType  subject);
	/*! \brief Get 
	 */
	AnyType getTopicLinks();

	/*! \brief Set 
	 */
	void setTopicLinks(AnyType  topic_links);
	/*! \brief Get 
	 */
	AnyType getSubmessages();

	/*! \brief Set 
	 */
	void setSubmessages(AnyType  submessages);
	/*! \brief Get 
	 */
	AnyType getTimestamp();

	/*! \brief Set 
	 */
	void setTimestamp(AnyType  timestamp);
	/*! \brief Get 
	 */
	AnyType getType();

	/*! \brief Set 
	 */
	void setType(AnyType  type);
	/*! \brief Get The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
	 */
	std::list<std::string> getFlags();

	/*! \brief Set The user's [message flags][message-flags] for the message.  [message-flags]: /api/update-message-flags#available-flags 
	 */
	void setFlags(std::list <std::string> flags);
	/*! \brief Get The UNIX timestamp for when the message was last edited, in UTC seconds. 
	 */
	int getLastEditTimestamp();

	/*! \brief Set The UNIX timestamp for when the message was last edited, in UTC seconds. 
	 */
	void setLastEditTimestamp(int  last_edit_timestamp);
	/*! \brief Get Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
	 */
	std::string getMatchContent();

	/*! \brief Set Only present if keyword search was included among the narrow parameters. HTML content of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
	 */
	void setMatchContent(std::string  match_content);
	/*! \brief Get Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
	 */
	std::string getMatchSubject();

	/*! \brief Set Only present if keyword search was included among the narrow parameters. HTML-escaped topic of a queried message that matches the narrow, with `<span class=\"highlight\">` elements wrapping the matches for the search keywords. 
	 */
	void setMatchSubject(std::string  match_subject);

private:
	AnyType avatar_url;
	AnyType client;
	AnyType content;
	AnyType content_type;
	AnyType display_recipient;
	AnyType id;
	AnyType is_me_message;
	AnyType reactions;
	AnyType recipient_id;
	AnyType sender_email;
	AnyType sender_full_name;
	AnyType sender_id;
	AnyType sender_realm_str;
	AnyType stream_id;
	AnyType subject;
	AnyType topic_links;
	AnyType submessages;
	AnyType timestamp;
	AnyType type;
	std::list <std::string>flags;
	int last_edit_timestamp;
	std::string match_content;
	std::string match_subject;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetMessages_allOf_H_ */
