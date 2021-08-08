
/*
 * User.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_User_H_
#define TINY_CPP_CLIENT_User_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "UserBase.h"
#include "User_allOf.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class User{
public:

    /*! \brief Constructor.
	 */
    User();
    User(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~User();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AnyType getEmail();

	/*! \brief Set 
	 */
	void setEmail(AnyType  email);
	/*! \brief Get 
	 */
	AnyType getIsBot();

	/*! \brief Set 
	 */
	void setIsBot(AnyType  is_bot);
	/*! \brief Get 
	 */
	AnyType getAvatarUrl();

	/*! \brief Set 
	 */
	void setAvatarUrl(AnyType  avatar_url);
	/*! \brief Get 
	 */
	AnyType getAvatarVersion();

	/*! \brief Set 
	 */
	void setAvatarVersion(AnyType  avatar_version);
	/*! \brief Get 
	 */
	AnyType getFullName();

	/*! \brief Set 
	 */
	void setFullName(AnyType  full_name);
	/*! \brief Get 
	 */
	AnyType getIsAdmin();

	/*! \brief Set 
	 */
	void setIsAdmin(AnyType  is_admin);
	/*! \brief Get 
	 */
	AnyType getIsOwner();

	/*! \brief Set 
	 */
	void setIsOwner(AnyType  is_owner);
	/*! \brief Get 
	 */
	AnyType getIsBillingAdmin();

	/*! \brief Set 
	 */
	void setIsBillingAdmin(AnyType  is_billing_admin);
	/*! \brief Get 
	 */
	AnyType getRole();

	/*! \brief Set 
	 */
	void setRole(AnyType  role);
	/*! \brief Get 
	 */
	AnyType getBotType();

	/*! \brief Set 
	 */
	void setBotType(AnyType  bot_type);
	/*! \brief Get 
	 */
	AnyType getUserId();

	/*! \brief Set 
	 */
	void setUserId(AnyType  user_id);
	/*! \brief Get 
	 */
	AnyType getBotOwnerId();

	/*! \brief Set 
	 */
	void setBotOwnerId(AnyType  bot_owner_id);
	/*! \brief Get 
	 */
	AnyType getIsActive();

	/*! \brief Set 
	 */
	void setIsActive(AnyType  is_active);
	/*! \brief Get 
	 */
	AnyType getIsGuest();

	/*! \brief Set 
	 */
	void setIsGuest(AnyType  is_guest);
	/*! \brief Get 
	 */
	AnyType getTimezone();

	/*! \brief Set 
	 */
	void setTimezone(AnyType  timezone);
	/*! \brief Get 
	 */
	AnyType getDateJoined();

	/*! \brief Set 
	 */
	void setDateJoined(AnyType  date_joined);
	/*! \brief Get 
	 */
	AnyType getDeliveryEmail();

	/*! \brief Set 
	 */
	void setDeliveryEmail(AnyType  delivery_email);
	/*! \brief Get 
	 */
	AnyType getProfileData();

	/*! \brief Set 
	 */
	void setProfileData(AnyType  profile_data);


    private:
    AnyType email;
    AnyType is_bot;
    AnyType avatar_url;
    AnyType avatar_version;
    AnyType full_name;
    AnyType is_admin;
    AnyType is_owner;
    AnyType is_billing_admin;
    AnyType role;
    AnyType bot_type;
    AnyType user_id;
    AnyType bot_owner_id;
    AnyType is_active;
    AnyType is_guest;
    AnyType timezone;
    AnyType date_joined;
    AnyType delivery_email;
    AnyType profile_data;
};
}

#endif /* TINY_CPP_CLIENT_User_H_ */
