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
 * 
 * @export
 * @interface BasicBotAllOf
 */
export interface BasicBotAllOf  {
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    userId?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    fullName?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    apiKey?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    defaultSendingStream?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    defaultEventsRegisterStream?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    defaultAllPublicStreams?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    avatarUrl?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    ownerId?: any;
    /**
     * 
     * @type {any}
     * @memberof BasicBotAllOf
     */
    services?: any;
}

export function BasicBotAllOfFromJSON(json: any): BasicBotAllOf {
    return {
        'userId': !exists(json, 'user_id') ? undefined : json['user_id'],
        'fullName': !exists(json, 'full_name') ? undefined : json['full_name'],
        'apiKey': !exists(json, 'api_key') ? undefined : json['api_key'],
        'defaultSendingStream': !exists(json, 'default_sending_stream') ? undefined : json['default_sending_stream'],
        'defaultEventsRegisterStream': !exists(json, 'default_events_register_stream') ? undefined : json['default_events_register_stream'],
        'defaultAllPublicStreams': !exists(json, 'default_all_public_streams') ? undefined : json['default_all_public_streams'],
        'avatarUrl': !exists(json, 'avatar_url') ? undefined : json['avatar_url'],
        'ownerId': !exists(json, 'owner_id') ? undefined : json['owner_id'],
        'services': !exists(json, 'services') ? undefined : json['services'],
    };
}

export function BasicBotAllOfToJSON(value?: BasicBotAllOf): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'user_id': value.userId,
        'full_name': value.fullName,
        'api_key': value.apiKey,
        'default_sending_stream': value.defaultSendingStream,
        'default_events_register_stream': value.defaultEventsRegisterStream,
        'default_all_public_streams': value.defaultAllPublicStreams,
        'avatar_url': value.avatarUrl,
        'owner_id': value.ownerId,
        'services': value.services,
    };
}

