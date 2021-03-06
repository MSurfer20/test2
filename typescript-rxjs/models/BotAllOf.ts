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

/**
 * Object containing details of a bot. 
 * @export
 * @interface BotAllOf
 */
export interface BotAllOf {
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    user_id?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    full_name?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    api_key?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    default_sending_stream?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    default_events_register_stream?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    default_all_public_streams?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    avatar_url?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    owner_id?: any | null;
    /**
     * @type {any}
     * @memberof BotAllOf
     */
    services?: any | null;
    /**
     * The email of the bot. 
     * @type {string}
     * @memberof BotAllOf
     */
    email?: string;
    /**
     * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
     * @type {number}
     * @memberof BotAllOf
     */
    bot_type?: number | null;
    /**
     * A boolean describing whether the user account has been deactivated. 
     * @type {boolean}
     * @memberof BotAllOf
     */
    is_active?: boolean;
}
