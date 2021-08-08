import 'package:jaguar_serializer/jaguar_serializer.dart';


part 'user_base.jser.dart';

class UserBase {
   /* The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else.  */
  @Alias('email', isNullable: false,  )
  final String email;
   /* A boolean specifying whether the user is a bot or full account.  */
  @Alias('is_bot', isNullable: false,  )
  final bool isBot;
   /* URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion.  */
  @Alias('avatar_url', isNullable: true,  )
  final String avatarUrl;
   /* Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`.  */
  @Alias('avatar_version', isNullable: false,  )
  final int avatarVersion;
   /* Full name of the user or bot, used for all display purposes.  */
  @Alias('full_name', isNullable: false,  )
  final String fullName;
   /* A boolean specifying whether the user is an organization administrator.  */
  @Alias('is_admin', isNullable: false,  )
  final bool isAdmin;
   /* A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8).  */
  @Alias('is_owner', isNullable: false,  )
  final bool isOwner;
   /* A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73).  */
  @Alias('is_billing_admin', isNullable: false,  )
  final bool isBillingAdmin;
   /* [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59).  */
  @Alias('role', isNullable: false,
          
             processor:  const intFieldProcessor(),
          
  )
  final int role;
  //enum roleEnum {  100,  200,  300,  400,  600,  }; /* An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot.  */
  @Alias('bot_type', isNullable: true,  )
  final int botType;
   /* The unique ID of the user.  */
  @Alias('user_id', isNullable: false,  )
  final int userId;
   /* If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner.  */
  @Alias('bot_owner_id', isNullable: true,  )
  final int botOwnerId;
   /* A boolean specifying whether the user account has been deactivated.  */
  @Alias('is_active', isNullable: false,  )
  final bool isActive;
   /* A boolean specifying whether the user is a guest user.  */
  @Alias('is_guest', isNullable: false,  )
  final bool isGuest;
   /* The time zone of the user.  */
  @Alias('timezone', isNullable: false,  )
  final String timezone;
   /* The time the user account was created.  */
  @Alias('date_joined', isNullable: false,  )
  final String dateJoined;
   /* The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy.  */
  @Alias('delivery_email', isNullable: false,  )
  final String deliveryEmail;
   /* A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present.  */
  @Alias('profile_data', isNullable: false,  )
  final Map<String, Object> profileData;
  

  UserBase(
      

{
     this.email = null,  
     this.isBot = null,  
     this.avatarUrl = null,  
     this.avatarVersion = null,  
     this.fullName = null,  
     this.isAdmin = null,  
     this.isOwner = null,  
     this.isBillingAdmin = null,  
     this.role = null,  
     this.botType = null,  
     this.userId = null,  
     this.botOwnerId = null,  
     this.isActive = null,  
     this.isGuest = null,  
     this.timezone = null,  
     this.dateJoined = null,  
     this.deliveryEmail = null,  
     this.profileData = const {} 
    
    }
  );

  @override
  String toString() {
    return 'UserBase[email=$email, isBot=$isBot, avatarUrl=$avatarUrl, avatarVersion=$avatarVersion, fullName=$fullName, isAdmin=$isAdmin, isOwner=$isOwner, isBillingAdmin=$isBillingAdmin, role=$role, botType=$botType, userId=$userId, botOwnerId=$botOwnerId, isActive=$isActive, isGuest=$isGuest, timezone=$timezone, dateJoined=$dateJoined, deliveryEmail=$deliveryEmail, profileData=$profileData, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserBaseSerializer extends Serializer<UserBase> with _$UserBaseSerializer {

}

