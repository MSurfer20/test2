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
/**
 * 
 * @export
 * @interface MessagesBaseTopicLinks
 */
export interface MessagesBaseTopicLinks {
    /**
     * The original link text present in the topic.
     * @type {string}
     * @memberof MessagesBaseTopicLinks
     */
    text?: string;
    /**
     * The expanded target url which the link points to.
     * @type {string}
     * @memberof MessagesBaseTopicLinks
     */
    url?: string;
}

export function MessagesBaseTopicLinksFromJSON(json: any): MessagesBaseTopicLinks {
    return MessagesBaseTopicLinksFromJSONTyped(json, false);
}

export function MessagesBaseTopicLinksFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessagesBaseTopicLinks {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'text': !exists(json, 'text') ? undefined : json['text'],
        'url': !exists(json, 'url') ? undefined : json['url'],
    };
}

export function MessagesBaseTopicLinksToJSON(value?: MessagesBaseTopicLinks | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'text': value.text,
        'url': value.url,
    };
}


