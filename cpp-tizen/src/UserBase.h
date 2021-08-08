/*
 * UserBase.h
 *
 * A dictionary containing basic data on a given Zulip user. 
 */

#ifndef _UserBase_H_
#define _UserBase_H_


#include <string>
#include <list>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A dictionary containing basic data on a given Zulip user. 
 *
 *  \ingroup Models
 *
 */

class UserBase : public Object {
public:
	/*! \brief Constructor.
	 */
	UserBase();
	UserBase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserBase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
	 */
	std::string getEmail();

	/*! \brief Set The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
	 */
	void setEmail(std::string  email);
	/*! \brief Get A boolean specifying whether the user is a bot or full account. 
	 */
	bool getIsBot();

	/*! \brief Set A boolean specifying whether the user is a bot or full account. 
	 */
	void setIsBot(bool  is_bot);
	/*! \brief Get URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
	 */
	std::string getAvatarUrl();

	/*! \brief Set URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
	 */
	void setAvatarUrl(std::string  avatar_url);
	/*! \brief Get Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
	 */
	int getAvatarVersion();

	/*! \brief Set Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
	 */
	void setAvatarVersion(int  avatar_version);
	/*! \brief Get Full name of the user or bot, used for all display purposes. 
	 */
	std::string getFullName();

	/*! \brief Set Full name of the user or bot, used for all display purposes. 
	 */
	void setFullName(std::string  full_name);
	/*! \brief Get A boolean specifying whether the user is an organization administrator. 
	 */
	bool getIsAdmin();

	/*! \brief Set A boolean specifying whether the user is an organization administrator. 
	 */
	void setIsAdmin(bool  is_admin);
	/*! \brief Get A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
	 */
	bool getIsOwner();

	/*! \brief Set A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
	 */
	void setIsOwner(bool  is_owner);
	/*! \brief Get A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
	 */
	bool getIsBillingAdmin();

	/*! \brief Set A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
	 */
	void setIsBillingAdmin(bool  is_billing_admin);
	/*! \brief Get [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
	 */
	int getRole();

	/*! \brief Set [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
	 */
	void setRole(int  role);
	/*! \brief Get An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
	 */
	int getBotType();

	/*! \brief Set An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
	 */
	void setBotType(int  bot_type);
	/*! \brief Get The unique ID of the user. 
	 */
	int getUserId();

	/*! \brief Set The unique ID of the user. 
	 */
	void setUserId(int  user_id);
	/*! \brief Get If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
	 */
	int getBotOwnerId();

	/*! \brief Set If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
	 */
	void setBotOwnerId(int  bot_owner_id);
	/*! \brief Get A boolean specifying whether the user account has been deactivated. 
	 */
	bool getIsActive();

	/*! \brief Set A boolean specifying whether the user account has been deactivated. 
	 */
	void setIsActive(bool  is_active);
	/*! \brief Get A boolean specifying whether the user is a guest user. 
	 */
	bool getIsGuest();

	/*! \brief Set A boolean specifying whether the user is a guest user. 
	 */
	void setIsGuest(bool  is_guest);
	/*! \brief Get The time zone of the user. 
	 */
	std::string getTimezone();

	/*! \brief Set The time zone of the user. 
	 */
	void setTimezone(std::string  timezone);
	/*! \brief Get The time the user account was created. 
	 */
	std::string getDateJoined();

	/*! \brief Set The time the user account was created. 
	 */
	void setDateJoined(std::string  date_joined);
	/*! \brief Get The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
	 */
	std::string getDeliveryEmail();

	/*! \brief Set The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
	 */
	void setDeliveryEmail(std::string  delivery_email);
	/*! \brief Get A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
	 */
	std::map<std::string, std::string> getProfileData();

	/*! \brief Set A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
	 */
	void setProfileData(std::map <std::string, std::string> profile_data);

private:
	std::string email;
	bool is_bot;
	std::string avatar_url;
	int avatar_version;
	std::string full_name;
	bool is_admin;
	bool is_owner;
	bool is_billing_admin;
	int role;
	int bot_type;
	int user_id;
	int bot_owner_id;
	bool is_active;
	bool is_guest;
	std::string timezone;
	std::string date_joined;
	std::string delivery_email;
	std::map <std::string, std::string>profile_data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserBase_H_ */
