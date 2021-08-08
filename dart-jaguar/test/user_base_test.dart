import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for UserBase
void main() {
  var instance = new UserBase();

  group('test UserBase', () {
    // The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
    // String email (default value: null)
    test('to test the property `email`', () async {
      // TODO
    });

    // A boolean specifying whether the user is a bot or full account. 
    // bool isBot (default value: null)
    test('to test the property `isBot`', () async {
      // TODO
    });

    // URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
    // String avatarUrl (default value: null)
    test('to test the property `avatarUrl`', () async {
      // TODO
    });

    // Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
    // int avatarVersion (default value: null)
    test('to test the property `avatarVersion`', () async {
      // TODO
    });

    // Full name of the user or bot, used for all display purposes. 
    // String fullName (default value: null)
    test('to test the property `fullName`', () async {
      // TODO
    });

    // A boolean specifying whether the user is an organization administrator. 
    // bool isAdmin (default value: null)
    test('to test the property `isAdmin`', () async {
      // TODO
    });

    // A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
    // bool isOwner (default value: null)
    test('to test the property `isOwner`', () async {
      // TODO
    });

    // A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
    // bool isBillingAdmin (default value: null)
    test('to test the property `isBillingAdmin`', () async {
      // TODO
    });

    // [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
    // int role (default value: null)
    test('to test the property `role`', () async {
      // TODO
    });

    // An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    // int botType (default value: null)
    test('to test the property `botType`', () async {
      // TODO
    });

    // The unique ID of the user. 
    // int userId (default value: null)
    test('to test the property `userId`', () async {
      // TODO
    });

    // If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
    // int botOwnerId (default value: null)
    test('to test the property `botOwnerId`', () async {
      // TODO
    });

    // A boolean specifying whether the user account has been deactivated. 
    // bool isActive (default value: null)
    test('to test the property `isActive`', () async {
      // TODO
    });

    // A boolean specifying whether the user is a guest user. 
    // bool isGuest (default value: null)
    test('to test the property `isGuest`', () async {
      // TODO
    });

    // The time zone of the user. 
    // String timezone (default value: null)
    test('to test the property `timezone`', () async {
      // TODO
    });

    // The time the user account was created. 
    // String dateJoined (default value: null)
    test('to test the property `dateJoined`', () async {
      // TODO
    });

    // The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
    // String deliveryEmail (default value: null)
    test('to test the property `deliveryEmail`', () async {
      // TODO
    });

    // A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
    // Map<String, Object> profileData (default value: const {})
    test('to test the property `profileData`', () async {
      // TODO
    });


  });

}
