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

export interface Bot {
    user_id?: any;

    full_name?: any;

    api_key?: any;

    default_sending_stream?: any;

    default_events_register_stream?: any;

    default_all_public_streams?: any;

    avatar_url?: any;

    owner_id?: any;

    services?: any;

    /**
     * The email of the bot. 
     */
    email?: string;

    /**
     * An integer describing the type of bot: * `1` for a `Generic` bot. * `2` for an `Incoming webhook` bot. * `3` for an `Outgoing webhook` bot. * `4` for an `Embedded` bot. 
     */
    bot_type?: number;

    /**
     * A boolean describing whether the user account has been deactivated. 
     */
    is_active?: boolean;

}
