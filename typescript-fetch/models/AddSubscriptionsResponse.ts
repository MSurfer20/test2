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
    AddSubscriptionsResponseAllOf,
    AddSubscriptionsResponseAllOfFromJSON,
    AddSubscriptionsResponseAllOfFromJSONTyped,
    AddSubscriptionsResponseAllOfToJSON,
    JsonSuccessBase,
    JsonSuccessBaseFromJSON,
    JsonSuccessBaseFromJSONTyped,
    JsonSuccessBaseToJSON,
} from './';

/**
 * 
 * @export
 * @interface AddSubscriptionsResponse
 */
export interface AddSubscriptionsResponse {
    /**
     * 
     * @type {any}
     * @memberof AddSubscriptionsResponse
     */
    result: any | null;
    /**
     * 
     * @type {any}
     * @memberof AddSubscriptionsResponse
     */
    msg: any | null;
    /**
     * A dictionary where the key is the email address of the user/bot and the
     * value is a list of the names of the streams that were subscribed to as a
     * result of the query.
     * @type {{ [key: string]: Array<string>; }}
     * @memberof AddSubscriptionsResponse
     */
    subscribed?: { [key: string]: Array<string>; };
    /**
     * A dictionary where the key is the email address of the user/bot and the
     * value is a list of the names of the streams that the user/bot is already
     * subscribed to.
     * @type {{ [key: string]: Array<string>; }}
     * @memberof AddSubscriptionsResponse
     */
    alreadySubscribed?: { [key: string]: Array<string>; };
    /**
     * A list of names of streams that the requesting user/bot was not
     * authorized to subscribe to.  Only present if `authorization_errors_fatal=false`.
     * @type {Array<string>}
     * @memberof AddSubscriptionsResponse
     */
    unauthorized?: Array<string>;
}

export function AddSubscriptionsResponseFromJSON(json: any): AddSubscriptionsResponse {
    return AddSubscriptionsResponseFromJSONTyped(json, false);
}

export function AddSubscriptionsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): AddSubscriptionsResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'result': json['result'],
        'msg': json['msg'],
        'subscribed': !exists(json, 'subscribed') ? undefined : json['subscribed'],
        'alreadySubscribed': !exists(json, 'already_subscribed') ? undefined : json['already_subscribed'],
        'unauthorized': !exists(json, 'unauthorized') ? undefined : json['unauthorized'],
    };
}

export function AddSubscriptionsResponseToJSON(value?: AddSubscriptionsResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'result': value.result,
        'msg': value.msg,
        'subscribed': value.subscribed,
        'already_subscribed': value.alreadySubscribed,
        'unauthorized': value.unauthorized,
    };
}


