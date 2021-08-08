
/*
 * Messages.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Messages_H_
#define TINY_CPP_CLIENT_Messages_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "MessagesBase.h"
#include "Messages_allOf.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Messages{
public:

    /*! \brief Constructor.
	 */
    Messages();
    Messages(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Messages();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_Messages_H_ */
