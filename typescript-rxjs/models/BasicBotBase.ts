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
 * @export
 * @interface BasicBotBase
 */
export interface BasicBotBase {
    /**
     * The user id of the bot. 
     * @type {number}
     * @memberof BasicBotBase
     */
    user_id?: number;
    /**
     * The full name of the bot. 
     * @type {string}
     * @memberof BasicBotBase
     */
    full_name?: string;
    /**
     * The API key of the bot which it uses to make API requests. 
     * @type {string}
     * @memberof BasicBotBase
     */
    api_key?: string;
    /**
     * The default sending stream of the bot. Null if the bot doesn\'t have a default sending stream. 
     * @type {string}
     * @memberof BasicBotBase
     */
    default_sending_stream?: string | null;
    /**
     * The default stream for which the bot receives events/register data. Null if the bot doesn\'t have such a default stream. 
     * @type {string}
     * @memberof BasicBotBase
     */
    default_events_register_stream?: string | null;
    /**
     * Whether the bot can send messages to all streams by default. 
     * @type {boolean}
     * @memberof BasicBotBase
     */
    default_all_public_streams?: boolean;
    /**
     * The URL of the bot\'s avatar. 
     * @type {string}
     * @memberof BasicBotBase
     */
    avatar_url?: string;
    /**
     * The user id of the bot\'s owner.  Null if the bot has no owner. 
     * @type {number}
     * @memberof BasicBotBase
     */
    owner_id?: number | null;
    /**
     * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
     * @type {Array<object>}
     * @memberof BasicBotBase
     */
    services?: Array<object>;
}
