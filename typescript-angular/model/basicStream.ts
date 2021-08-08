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
import { BasicStreamBase } from './basicStreamBase';
import { BasicStreamAllOf } from './basicStreamAllOf';


export interface BasicStream { 
    stream_id?: any | null;
    name?: any | null;
    description?: any | null;
    date_created?: any | null;
    invite_only?: any | null;
    rendered_description?: any | null;
    is_web_public?: any | null;
    stream_post_policy?: any | null;
    message_retention_days?: any | null;
    history_public_to_subscribers?: any | null;
    first_message_id?: any | null;
    is_announcement_only?: any | null;
}

