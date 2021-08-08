// tslint:disable
/**
 * Zulip REST API
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * A dictionary containing basic data on a given Zulip user. 
 * @export
 * @interface UserBase
 */
export interface UserBase  {
    /**
     * The Zulip API email address of the user or bot.  If you do not have permission to view the email address of the target user, this will be a fake email address that is usable for the Zulip API but nothing else. 
     * @type {string}
     * @memberof UserBase
     */
    email?: string;
    /**
     * A boolean specifying whether the user is a bot or full account. 
     * @type {boolean}
     * @memberof UserBase
     */
    isBot?: boolean;
    /**
     * URL for the user\'s avatar.  Will be `null` if the `client_gravatar` query parameter was set to `True` and the user\'s avatar is hosted by the Gravatar provider (i.e. the user has never uploaded an avatar).  **Changes**: In Zulip 3.0 (feature level 18), if the client has the `user_avatar_url_field_optional` capability, this will be missing at the server\'s sole discretion. 
     * @type {string}
     * @memberof UserBase
     */
    avatarUrl?: string;
    /**
     * Version for the user\'s avatar.  Used for cache-busting requests for the user\'s avatar.  Clients generally shouldn\'t need to use this; most avatar URLs sent by Zulip will already end with `?v={avatar_version}`. 
     * @type {number}
     * @memberof UserBase
     */
    avatarVersion?: number;
    /**
     * Full name of the user or bot, used for all display purposes. 
     * @type {string}
     * @memberof UserBase
     */
    fullName?: string;
    /**
     * A boolean specifying whether the user is an organization administrator. 
     * @type {boolean}
     * @memberof UserBase
     */
    isAdmin?: boolean;
    /**
     * A boolean specifying whether the user is an organization owner. If true, is_admin will also be true.  **Changes**: New in Zulip 3.0 (feature level 8). 
     * @type {boolean}
     * @memberof UserBase
     */
    isOwner?: boolean;
    /**
     * A boolean specifying whether the user is a billing administrator.  **Changes**: New in Zulip 5.0 (feature level 73). 
     * @type {boolean}
     * @memberof UserBase
     */
    isBillingAdmin?: boolean;
    /**
     * [Organization-level role](/help/roles-and-permissions)) of the user. Poosible values are:  * Organization owner => 100 * Organization administrator => 200 * Organization moderator => 300 * Member => 400 * Guest => 600  **Changes**: New in Zulip 4.0 (feature level 59). 
     * @type {number}
     * @memberof UserBase
     */
    role?: UserBaseRoleEnum;
    /**
     * An integer describing the type of bot: * `null` if the user isn\'t a bot. * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
     * @type {number}
     * @memberof UserBase
     */
    botType?: number;
    /**
     * The unique ID of the user. 
     * @type {number}
     * @memberof UserBase
     */
    userId?: number;
    /**
     * If the user is a bot (i.e. `is_bot` is `True`), `bot_owner` is the user ID of the bot\'s owner (usually, whoever created the bot).  Will be null for legacy bots that do not have an owner.  **Changes**: New in Zulip 3.0 (feature level 1).  In previous versions, there was a `bot_owner` field containing the email address of the bot\'s owner. 
     * @type {number}
     * @memberof UserBase
     */
    botOwnerId?: number;
    /**
     * A boolean specifying whether the user account has been deactivated. 
     * @type {boolean}
     * @memberof UserBase
     */
    isActive?: boolean;
    /**
     * A boolean specifying whether the user is a guest user. 
     * @type {boolean}
     * @memberof UserBase
     */
    isGuest?: boolean;
    /**
     * The time zone of the user. 
     * @type {string}
     * @memberof UserBase
     */
    timezone?: string;
    /**
     * The time the user account was created. 
     * @type {string}
     * @memberof UserBase
     */
    dateJoined?: string;
    /**
     * The user\'s real email address.  This field is present only if [email address visibility](/help/restrict-visibility-of-email-addresses) is limited and you are an administrator with access to real email addresses under the configured policy. 
     * @type {string}
     * @memberof UserBase
     */
    deliveryEmail?: string;
    /**
     * A dictionary containing custom profile field data for the user. Each entry maps the integer ID of a custom profile field in the organization to a dictionary containing the user\'s data for that field.  Generally the data includes just a single `value` key; for those custom profile fields supporting Markdown, a `rendered_value` key will also be present. 
     * @type {{ [key: string]: object; }}
     * @memberof UserBase
     */
    profileData?: { [key: string]: object; };
}

export function UserBaseFromJSON(json: any): UserBase {
    return {
        'email': !exists(json, 'email') ? undefined : json['email'],
        'isBot': !exists(json, 'is_bot') ? undefined : json['is_bot'],
        'avatarUrl': !exists(json, 'avatar_url') ? undefined : json['avatar_url'],
        'avatarVersion': !exists(json, 'avatar_version') ? undefined : json['avatar_version'],
        'fullName': !exists(json, 'full_name') ? undefined : json['full_name'],
        'isAdmin': !exists(json, 'is_admin') ? undefined : json['is_admin'],
        'isOwner': !exists(json, 'is_owner') ? undefined : json['is_owner'],
        'isBillingAdmin': !exists(json, 'is_billing_admin') ? undefined : json['is_billing_admin'],
        'role': !exists(json, 'role') ? undefined : json['role'],
        'botType': !exists(json, 'bot_type') ? undefined : json['bot_type'],
        'userId': !exists(json, 'user_id') ? undefined : json['user_id'],
        'botOwnerId': !exists(json, 'bot_owner_id') ? undefined : json['bot_owner_id'],
        'isActive': !exists(json, 'is_active') ? undefined : json['is_active'],
        'isGuest': !exists(json, 'is_guest') ? undefined : json['is_guest'],
        'timezone': !exists(json, 'timezone') ? undefined : json['timezone'],
        'dateJoined': !exists(json, 'date_joined') ? undefined : json['date_joined'],
        'deliveryEmail': !exists(json, 'delivery_email') ? undefined : json['delivery_email'],
        'profileData': !exists(json, 'profile_data') ? undefined : json['profile_data'],
    };
}

export function UserBaseToJSON(value?: UserBase): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'email': value.email,
        'is_bot': value.isBot,
        'avatar_url': value.avatarUrl,
        'avatar_version': value.avatarVersion,
        'full_name': value.fullName,
        'is_admin': value.isAdmin,
        'is_owner': value.isOwner,
        'is_billing_admin': value.isBillingAdmin,
        'role': value.role,
        'bot_type': value.botType,
        'user_id': value.userId,
        'bot_owner_id': value.botOwnerId,
        'is_active': value.isActive,
        'is_guest': value.isGuest,
        'timezone': value.timezone,
        'date_joined': value.dateJoined,
        'delivery_email': value.deliveryEmail,
        'profile_data': value.profileData,
    };
}

/**
* @export
* @enum {string}
*/
export enum UserBaseRoleEnum {
    NUMBER_100 = 100,
    NUMBER_200 = 200,
    NUMBER_300 = 300,
    NUMBER_400 = 400,
    NUMBER_600 = 600
}


