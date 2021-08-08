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

import * as models from './models';

export interface BasicBotBase {
    /**
     * The user id of the bot. 
     */
    "user_id"?: number;
    /**
     * The full name of the bot. 
     */
    "full_name"?: string;
    /**
     * The API key of the bot which it uses to make API requests. 
     */
    "api_key"?: string;
    /**
     * The default sending stream of the bot. Null if the bot doesn\'t have a default sending stream. 
     */
    "default_sending_stream"?: string;
    /**
     * The default stream for which the bot receives events/register data. Null if the bot doesn\'t have such a default stream. 
     */
    "default_events_register_stream"?: string;
    /**
     * Whether the bot can send messages to all streams by default. 
     */
    "default_all_public_streams"?: boolean;
    /**
     * The URL of the bot\'s avatar. 
     */
    "avatar_url"?: string;
    /**
     * The user id of the bot\'s owner.  Null if the bot has no owner. 
     */
    "owner_id"?: number;
    /**
     * The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
     */
    "services"?: Array<object>;
}

