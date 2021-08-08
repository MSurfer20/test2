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

export interface BasicStreamAllOf {
    stream_id?: any;

    name?: any;

    description?: any;

    date_created?: any;

    invite_only?: any;

    rendered_description?: any;

    is_web_public?: any;

    stream_post_policy?: any;

    message_retention_days?: any;

    history_public_to_subscribers?: any;

    first_message_id?: any;

    is_announcement_only?: any;

}
