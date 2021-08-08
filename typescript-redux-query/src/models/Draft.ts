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
 * A dictionary for representing a message draft. 
 * @export
 * @interface Draft
 */
export interface Draft  {
    /**
     * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
     * @type {number}
     * @memberof Draft
     */
    id?: number;
    /**
     * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
     * @type {string}
     * @memberof Draft
     */
    type: DraftTypeEnum;
    /**
     * An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
     * @type {Array<number>}
     * @memberof Draft
     */
    to: Array<number>;
    /**
     * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
     * @type {string}
     * @memberof Draft
     */
    topic: string;
    /**
     * The body of the draft. Should not contain null bytes. 
     * @type {string}
     * @memberof Draft
     */
    content: string;
    /**
     * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
     * @type {number}
     * @memberof Draft
     */
    timestamp?: number;
}

export function DraftFromJSON(json: any): Draft {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'type': json['type'],
        'to': json['to'],
        'topic': json['topic'],
        'content': json['content'],
        'timestamp': !exists(json, 'timestamp') ? undefined : json['timestamp'],
    };
}

export function DraftToJSON(value?: Draft): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'type': value.type,
        'to': value.to,
        'topic': value.topic,
        'content': value.content,
        'timestamp': value.timestamp,
    };
}

/**
* @export
* @enum {string}
*/
export enum DraftTypeEnum {
    Empty = '',
    Stream = 'stream',
    Private = 'private'
}

