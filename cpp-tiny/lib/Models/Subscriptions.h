
/*
 * Subscriptions.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Subscriptions_H_
#define TINY_CPP_CLIENT_Subscriptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Subscriptions{
public:

    /*! \brief Constructor.
	 */
    Subscriptions();
    Subscriptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Subscriptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique ID of a stream. 
	 */
	int getStreamId();

	/*! \brief Set The unique ID of a stream. 
	 */
	void setStreamId(int  stream_id);
	/*! \brief Get The name of a stream. 
	 */
	std::string getName();

	/*! \brief Set The name of a stream. 
	 */
	void setName(std::string  name);
	/*! \brief Get The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
	 */
	std::string getDescription();

	/*! \brief Set The short description of a stream in text/markdown format, intended to be used to prepopulate UI for editing a stream's description. 
	 */
	void setDescription(std::string  description);
	/*! \brief Get A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
	 */
	std::string getRenderedDescription();

	/*! \brief Set A short description of a stream rendered as HTML, intended to be used when displaying the stream description in a UI.  One should use the standard Zulip rendered_markdown CSS when displaying this content so that emoji, LaTeX, and other syntax work correctly.  And any client-side security logic for user-generated message content should be applied when displaying this HTML as though it were the body of a Zulip message. 
	 */
	void setRenderedDescription(std::string  rendered_description);
	/*! \brief Get The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
	 */
	int getDateCreated();

	/*! \brief Set The UNIX timestamp for when the stream was created, in UTC seconds.  **Changes**: New in Zulip 4.0 (feature level 30). 
	 */
	void setDateCreated(int  date_created);
	/*! \brief Get Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
	 */
	bool isInviteOnly();

	/*! \brief Set Specifies whether the stream is private or not. Only people who have been invited can access a private stream. 
	 */
	void setInviteOnly(bool  invite_only);
	/*! \brief Get A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
	 */
	std::list<int> getSubscribers();

	/*! \brief Set A list of user IDs of users who are also subscribed to a given stream. Included only if `include_subscribers` is `true`. 
	 */
	void setSubscribers(std::list <int> subscribers);
	/*! \brief Get A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
	 */
	bool isDesktopNotifications();

	/*! \brief Set A boolean specifying whether desktop notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_desktop_notifications, for this stream. 
	 */
	void setDesktopNotifications(bool  desktop_notifications);
	/*! \brief Get A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
	 */
	bool isEmailNotifications();

	/*! \brief Set A boolean specifying whether email notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_email_notifications, for this stream. 
	 */
	void setEmailNotifications(bool  email_notifications);
	/*! \brief Get A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
	 */
	bool isWildcardMentionsNotify();

	/*! \brief Set A boolean specifying whether wildcard mentions trigger notifications as though they were personal mentions in this stream.  A null value means the value of this setting should be inherited from the user-level default setting, wildcard_mentions_notify, for this stream. 
	 */
	void setWildcardMentionsNotify(bool  wildcard_mentions_notify);
	/*! \brief Get A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
	 */
	bool isPushNotifications();

	/*! \brief Set A boolean specifying whether push notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_push_notifications, for this stream. 
	 */
	void setPushNotifications(bool  push_notifications);
	/*! \brief Get A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
	 */
	bool isAudibleNotifications();

	/*! \brief Set A boolean specifying whether audible notifications are enabled for the given stream.  A null value means the value of this setting should be inherited from the user-level default setting, enable_stream_audible_notifications, for this stream. 
	 */
	void setAudibleNotifications(bool  audible_notifications);
	/*! \brief Get A boolean specifying whether the given stream has been pinned to the top. 
	 */
	bool isPinToTop();

	/*! \brief Set A boolean specifying whether the given stream has been pinned to the top. 
	 */
	void setPinToTop(bool  pin_to_top);
	/*! \brief Get Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
	 */
	std::string getEmailAddress();

	/*! \brief Set Email address of the given stream, used for [sending emails to the stream](/help/message-a-stream-by-email). 
	 */
	void setEmailAddress(std::string  email_address);
	/*! \brief Get Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
	 */
	bool isIsMuted();

	/*! \brief Set Whether the user has muted the stream. Muted streams do not count towards your total unread count and do not show up in `All messages` view (previously known as `Home` view).  **Changes**: Prior to Zulip 2.1, this feature was represented by the more confusingly named `in_home_view` (with the opposite value, `in_home_view=!is_muted`). 
	 */
	void setIsMuted(bool  is_muted);
	/*! \brief Get Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
	 */
	bool isInHomeView();

	/*! \brief Set Legacy property for if the given stream is muted, with inverted meeting.  **Deprecated**; clients should use is_muted where available. 
	 */
	void setInHomeView(bool  in_home_view);
	/*! \brief Get Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
	 */
	bool isIsAnnouncementOnly();

	/*! \brief Set Whether only organization administrators can post to the stream.  **Changes**: Deprecated in Zulip 3.0 (feature level 1), use `stream_post_policy` instead. 
	 */
	void setIsAnnouncementOnly(bool  is_announcement_only);
	/*! \brief Get Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
	 */
	bool isIsWebPublic();

	/*! \brief Set Whether the stream has been configured to allow unauthenticated access to its message history from the web. 
	 */
	void setIsWebPublic(bool  is_web_public);
	/*! \brief Get The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
	 */
	int getRole();

	/*! \brief Set The user's role within the stream (distinct from the user's [organization-level role](/help/roles-and-permissions)). Valid values are:  * 20 => Stream administrator. * 50 => Subscriber.  **Changes**: New in Zulip 4.0 (feature level 31). 
	 */
	void setRole(int  role);
	/*! \brief Get The user's personal color for the stream. 
	 */
	std::string getColor();

	/*! \brief Set The user's personal color for the stream. 
	 */
	void setColor(std::string  color);
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
	bool isHistoryPublicToSubscribers();

	/*! \brief Set Whether the history of the stream is public to its subscribers.  Currently always true for public streams (i.e. invite_only=False implies history_public_to_subscribers=True), but clients should not make that assumption, as we may change that behavior in the future. 
	 */
	void setHistoryPublicToSubscribers(bool  history_public_to_subscribers);
	/*! \brief Get The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
	 */
	int getFirstMessageId();

	/*! \brief Set The id of the first message in the stream.  Intended to help clients determine whether they need to display UI like the \"more topics\" widget that would suggest the stream has older history that can be accessed.  Null is used for streams with no message history. 
	 */
	void setFirstMessageId(int  first_message_id);
	/*! \brief Get The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
	 */
	int getStreamWeeklyTraffic();

	/*! \brief Set The average number of messages sent to the stream in recent weeks, rounded to the nearest integer.  Null means the stream was recently created and there is insufficient data to estimate the average traffic. 
	 */
	void setStreamWeeklyTraffic(int  stream_weekly_traffic);


    private:
    int stream_id{};
    std::string name{};
    std::string description{};
    std::string rendered_description{};
    int date_created{};
    bool invite_only{};
    std::list<int> subscribers;
    bool desktop_notifications{};
    bool email_notifications{};
    bool wildcard_mentions_notify{};
    bool push_notifications{};
    bool audible_notifications{};
    bool pin_to_top{};
    std::string email_address{};
    bool is_muted{};
    bool in_home_view{};
    bool is_announcement_only{};
    bool is_web_public{};
    int role{};
    std::string color{};
    int stream_post_policy{};
    int message_retention_days{};
    bool history_public_to_subscribers{};
    int first_message_id{};
    int stream_weekly_traffic{};
};
}

#endif /* TINY_CPP_CLIENT_Subscriptions_H_ */
