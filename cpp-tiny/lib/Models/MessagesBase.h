
/*
 * MessagesBase.h
 *
 * Object containing details of the message. 
 */

#ifndef TINY_CPP_CLIENT_MessagesBase_H_
#define TINY_CPP_CLIENT_MessagesBase_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EmojiReaction.h"
#include "MessagesBase_topic_links.h"
#include "OneOf<string,array>.h"
#include <list>

namespace Tiny {


/*! \brief Object containing details of the message. 
 *
 *  \ingroup Models
 *
 */

class MessagesBase{
public:

    /*! \brief Constructor.
	 */
    MessagesBase();
    MessagesBase(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessagesBase();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
	 */
	std::string getAvatarUrl();

	/*! \brief Set The URL of the user's avatar.  Can be null only if client_gravatar was passed, which means that the user has not uploaded an avatar in Zulip, and the client should compute the gravatar URL by hashing the user's email address itself for this user. 
	 */
	void setAvatarUrl(std::string  avatar_url);
	/*! \brief Get A Zulip \"client\" string, describing what Zulip client sent the message. 
	 */
	std::string getClient();

	/*! \brief Set A Zulip \"client\" string, describing what Zulip client sent the message. 
	 */
	void setClient(std::string  client);
	/*! \brief Get The content/body of the message. 
	 */
	std::string getContent();

	/*! \brief Set The content/body of the message. 
	 */
	void setContent(std::string  content);
	/*! \brief Get The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
	 */
	std::string getContentType();

	/*! \brief Set The HTTP `content_type` for the message content.  This will be `text/html` or `text/x-markdown`, depending on whether `apply_markdown` was set. 
	 */
	void setContentType(std::string  content_type);
	/*! \brief Get Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
	 */
	OneOf&lt;string,array&gt; getDisplayRecipient();

	/*! \brief Set Data on the recipient of the message; either the name of a stream or a dictionary containing basic data on the users who received the message. 
	 */
	void setDisplayRecipient(OneOf&lt;string,array&gt;  display_recipient);
	/*! \brief Get The unique message ID.  Messages should always be displayed sorted by ID. 
	 */
	int getId();

	/*! \brief Set The unique message ID.  Messages should always be displayed sorted by ID. 
	 */
	void setId(int  id);
	/*! \brief Get Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
	 */
	bool isIsMeMessage();

	/*! \brief Set Whether the message is a [/me status message][status-messages]  [status-messages]: /help/format-your-message-using-markdown#status-messages 
	 */
	void setIsMeMessage(bool  is_me_message);
	/*! \brief Get Data on any reactions to the message. 
	 */
	std::list<EmojiReaction> getReactions();

	/*! \brief Set Data on any reactions to the message. 
	 */
	void setReactions(std::list <EmojiReaction> reactions);
	/*! \brief Get A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
	 */
	int getRecipientId();

	/*! \brief Set A unique ID for the set of users receiving the message (either a stream or group of users).  Useful primarily for hashing. 
	 */
	void setRecipientId(int  recipient_id);
	/*! \brief Get The Zulip display email address of the message's sender. 
	 */
	std::string getSenderEmail();

	/*! \brief Set The Zulip display email address of the message's sender. 
	 */
	void setSenderEmail(std::string  sender_email);
	/*! \brief Get The full name of the message's sender. 
	 */
	std::string getSenderFullName();

	/*! \brief Set The full name of the message's sender. 
	 */
	void setSenderFullName(std::string  sender_full_name);
	/*! \brief Get The user ID of the message's sender. 
	 */
	int getSenderId();

	/*! \brief Set The user ID of the message's sender. 
	 */
	void setSenderId(int  sender_id);
	/*! \brief Get A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
	 */
	std::string getSenderRealmStr();

	/*! \brief Set A string identifier for the realm the sender is in.  Unique only within the context of a given Zulip server.  E.g. on `example.zulip.com`, this will be `example`. 
	 */
	void setSenderRealmStr(std::string  sender_realm_str);
	/*! \brief Get Only present for stream messages; the ID of the stream. 
	 */
	int getStreamId();

	/*! \brief Set Only present for stream messages; the ID of the stream. 
	 */
	void setStreamId(int  stream_id);
	/*! \brief Get The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
	 */
	std::string getSubject();

	/*! \brief Set The `topic` of the message.  Currently always `\"\"` for private messages, though this could change if Zulip adds support for topics in private message conversations.  The field name is a legacy holdover from when topics were called \"subjects\" and will eventually change. 
	 */
	void setSubject(std::string  subject);
	/*! \brief Get Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
	 */
	std::list<MessagesBase_topic_links> getTopicLinks();

	/*! \brief Set Data on any links to be included in the `topic` line (these are generated by [custom linkification filters](/help/add-a-custom-linkifier) that match content in the message's topic.)  **Changes**: This field contained a list of urls before   Zulip 4.0 (feature level 46).  New in Zulip 3.0 (feature level 1): Previously, this field was called `subject_links`; clients are recommended to rename `subject_links` to `topic_links` if present for compatibility with older Zulip servers. 
	 */
	void setTopicLinks(std::list <MessagesBase_topic_links> topic_links);
	/*! \brief Get Data used for certain experimental Zulip integrations. 
	 */
	std::list<std::string> getSubmessages();

	/*! \brief Set Data used for certain experimental Zulip integrations. 
	 */
	void setSubmessages(std::list <std::string> submessages);
	/*! \brief Get The UNIX timestamp for when the message was sent, in UTC seconds. 
	 */
	int getTimestamp();

	/*! \brief Set The UNIX timestamp for when the message was sent, in UTC seconds. 
	 */
	void setTimestamp(int  timestamp);
	/*! \brief Get The type of the message: `stream` or `private`. 
	 */
	std::string getType();

	/*! \brief Set The type of the message: `stream` or `private`. 
	 */
	void setType(std::string  type);


    private:
    std::string avatar_url{};
    std::string client{};
    std::string content{};
    std::string content_type{};
    OneOf&lt;string,array&gt; display_recipient;
    int id{};
    bool is_me_message{};
    std::list<EmojiReaction> reactions;
    int recipient_id{};
    std::string sender_email{};
    std::string sender_full_name{};
    int sender_id{};
    std::string sender_realm_str{};
    int stream_id{};
    std::string subject{};
    std::list<MessagesBase_topic_links> topic_links;
    std::list<std::string> submessages;
    int timestamp{};
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_MessagesBase_H_ */
