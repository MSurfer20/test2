/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* A dictionary containing basic data on a given Zulip user. 
*/
export class UserBase {
    /**
    * The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
    */
    'email'?: string;
    /**
    * A boolean specifying whether the user is a bot or full account. 
    */
    'isBot'?: boolean;
    /**
    * URL for the user's avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user's avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server's sole discretion. 
    */
    'avatarUrl'?: string;
    /**
    * Version for the user's avatar.  Used for cache-busting requests for the user's avatar.  Clients generally shouldn't need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
    */
    'avatarVersion'?: number;
    /**
    * Full name of the user or bot, used for all display purposes. 
    */
    'fullName'?: string;
    /**
    * A boolean specifying whether the user is an organization administrator. 
    */
    'isAdmin'?: boolean;
    /**
    * A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
    */
    'isOwner'?: boolean;
    /**
    * A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
    */
    'isBillingAdmin'?: boolean;
    /**
    * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
    */
    'role'?: UserBaseRoleEnum;
    /**
    * An integer describing the type of bot: * `null` if the user isn't a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
    */
    'botType'?: number;
    /**
    * The unique ID of the user. 
    */
    'userId'?: number;
    /**
    * If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot's owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot's owner. 
    */
    'botOwnerId'?: number;
    /**
    * A boolean specifying whether the user account has been deactivated. 
    */
    'isActive'?: boolean;
    /**
    * A boolean specifying whether the user is a guest user. 
    */
    'isGuest'?: boolean;
    /**
    * The time zone of the user. 
    */
    'timezone'?: string;
    /**
    * The time the user account was created. 
    */
    'dateJoined'?: string;
    /**
    * The user's real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
    */
    'deliveryEmail'?: string;
    /**
    * A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user's data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
    */
    'profileData'?: { [key: string]: any; };

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "email",
            "baseName": "email",
            "type": "string",
            "format": ""
        },
        {
            "name": "isBot",
            "baseName": "is_bot",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "avatarUrl",
            "baseName": "avatar_url",
            "type": "string",
            "format": ""
        },
        {
            "name": "avatarVersion",
            "baseName": "avatar_version",
            "type": "number",
            "format": ""
        },
        {
            "name": "fullName",
            "baseName": "full_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "isAdmin",
            "baseName": "is_admin",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "isOwner",
            "baseName": "is_owner",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "isBillingAdmin",
            "baseName": "is_billing_admin",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "role",
            "baseName": "role",
            "type": "UserBaseRoleEnum",
            "format": ""
        },
        {
            "name": "botType",
            "baseName": "bot_type",
            "type": "number",
            "format": ""
        },
        {
            "name": "userId",
            "baseName": "user_id",
            "type": "number",
            "format": ""
        },
        {
            "name": "botOwnerId",
            "baseName": "bot_owner_id",
            "type": "number",
            "format": ""
        },
        {
            "name": "isActive",
            "baseName": "is_active",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "isGuest",
            "baseName": "is_guest",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "timezone",
            "baseName": "timezone",
            "type": "string",
            "format": ""
        },
        {
            "name": "dateJoined",
            "baseName": "date_joined",
            "type": "string",
            "format": ""
        },
        {
            "name": "deliveryEmail",
            "baseName": "delivery_email",
            "type": "string",
            "format": ""
        },
        {
            "name": "profileData",
            "baseName": "profile_data",
            "type": "{ [key: string]: any; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return UserBase.attributeTypeMap;
    }
    
    public constructor() {
    }
}


export type UserBaseRoleEnum = "100" | "200" | "300" | "400" | "600" ;

