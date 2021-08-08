/* tslint:disable */
/* eslint-disable */
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
import {
    BasicStreamAllOf,
    BasicStreamAllOfFromJSON,
    BasicStreamAllOfFromJSONTyped,
    BasicStreamAllOfToJSON,
    BasicStreamBase,
    BasicStreamBaseFromJSON,
    BasicStreamBaseFromJSONTyped,
    BasicStreamBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface BasicStream
 */
export interface BasicStream {
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    streamId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    name?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    description?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    dateCreated?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    inviteOnly?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    renderedDescription?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    isWebPublic?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    streamPostPolicy?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    messageRetentionDays?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    historyPublicToSubscribers?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    firstMessageId?: any | null;
    /**
     * 
     * @type {any}
     * @memberof BasicStream
     */
    isAnnouncementOnly?: any | null;
}

export function BasicStreamFromJSON(json: any): BasicStream {
    return BasicStreamFromJSONTyped(json, false);
}

export function BasicStreamFromJSONTyped(json: any, ignoreDiscriminator: boolean): BasicStream {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'streamId': !exists(json, 'stream_id') ? undefined : json['stream_id'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'dateCreated': !exists(json, 'date_created') ? undefined : json['date_created'],
        'inviteOnly': !exists(json, 'invite_only') ? undefined : json['invite_only'],
        'renderedDescription': !exists(json, 'rendered_description') ? undefined : json['rendered_description'],
        'isWebPublic': !exists(json, 'is_web_public') ? undefined : json['is_web_public'],
        'streamPostPolicy': !exists(json, 'stream_post_policy') ? undefined : json['stream_post_policy'],
        'messageRetentionDays': !exists(json, 'message_retention_days') ? undefined : json['message_retention_days'],
        'historyPublicToSubscribers': !exists(json, 'history_public_to_subscribers') ? undefined : json['history_public_to_subscribers'],
        'firstMessageId': !exists(json, 'first_message_id') ? undefined : json['first_message_id'],
        'isAnnouncementOnly': !exists(json, 'is_announcement_only') ? undefined : json['is_announcement_only'],
    };
}

export function BasicStreamToJSON(value?: BasicStream | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'stream_id': value.streamId,
        'name': value.name,
        'description': value.description,
        'date_created': value.dateCreated,
        'invite_only': value.inviteOnly,
        'rendered_description': value.renderedDescription,
        'is_web_public': value.isWebPublic,
        'stream_post_policy': value.streamPostPolicy,
        'message_retention_days': value.messageRetentionDays,
        'history_public_to_subscribers': value.historyPublicToSubscribers,
        'first_message_id': value.firstMessageId,
        'is_announcement_only': value.isAnnouncementOnly,
    };
}


