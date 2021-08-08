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
 */
export interface BotAllOf { 
    user_id?: any | null;
    full_name?: any | null;
    api_key?: any | null;
    default_sending_stream?: any | null;
    default_events_register_stream?: any | null;
    default_all_public_streams?: any | null;
    avatar_url?: any | null;
    owner_id?: any | null;
    services?: any | null;
    /**
     * The email of the bot. 
     */
    email?: string;
    /**
     * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
     */
    bot_type?: number | null;
    /**
     * A boolean describing whether the user account has been deactivated. 
     */
    is_active?: boolean;
}

