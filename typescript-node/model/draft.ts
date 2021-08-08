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

import { RequestFile } from './models';

/**
* A dictionary for representing a message draft. 
*/
export class Draft {
    /**
    * The unique ID of the draft. It will only used whenever the drafts are fetched. This field should not be specified when the draft is being created or edited. 
    */
    'id'?: number;
    /**
    * The type of the draft. Either unaddressed (empty string), \"stream\", or \"private\" (for PMs and private group messages). 
    */
    'type': Draft.TypeEnum;
    /**
    * An array of the tentative target audience IDs. For \"stream\" messages, this should contain exactly 1 ID, the ID of the target stream. For private messages, this should be an array of target user IDs. For unaddressed drafts, this is ignored, and clients should send an empty array. 
    */
    'to': Array<number>;
    /**
    * For stream message drafts, the tentative topic name. For private or unaddressed messages, this will be ignored and should ideally be the empty string. Should not contain null bytes. 
    */
    'topic': string;
    /**
    * The body of the draft. Should not contain null bytes. 
    */
    'content': string;
    /**
    * A Unix timestamp (seconds only) representing when the draft was last edited. When creating a draft, this key need not be present and it will be filled in automatically by the server. 
    */
    'timestamp'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "Draft.TypeEnum"
        },
        {
            "name": "to",
            "baseName": "to",
            "type": "Array<number>"
        },
        {
            "name": "topic",
            "baseName": "topic",
            "type": "string"
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return Draft.attributeTypeMap;
    }
}

export namespace Draft {
    export enum TypeEnum {
        Empty = <any> '',
        Stream = <any> 'stream',
        Private = <any> 'private'
    }
}
