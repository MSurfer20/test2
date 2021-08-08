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
 * `{client_name}`: Object containing the details of the user\'s presence on a particular platform with the client\'s platform name being the object key. 
 */
export interface Presence { 
    /**
     * The client\'s platform name. 
     */
    client?: string;
    /**
     * The status of the user on this client. It is either `idle` or `active`. 
     */
    status?: Presence.StatusEnum;
    /**
     * The UNIX timestamp of when this client sent the user\'s presence to the server with the precision of a second. 
     */
    timestamp?: number;
    /**
     * Whether the client is capable of showing mobile/push notifications to the user. 
     */
    pushable?: boolean;
}
export namespace Presence {
    export type StatusEnum = 'idle' | 'active';
    export const StatusEnum = {
        Idle: 'idle' as StatusEnum,
        Active: 'active' as StatusEnum
    }
}