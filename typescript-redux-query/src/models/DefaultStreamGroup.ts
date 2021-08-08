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
import {
    BasicStream,
    BasicStreamFromJSON,
    BasicStreamToJSON,
} from './';

/**
 * Dictionary containing details of a default stream group. 
 * @export
 * @interface DefaultStreamGroup
 */
export interface DefaultStreamGroup  {
    /**
     * Name of the default stream group. 
     * @type {string}
     * @memberof DefaultStreamGroup
     */
    name?: string;
    /**
     * Description of the default stream group. 
     * @type {string}
     * @memberof DefaultStreamGroup
     */
    description?: string;
    /**
     * id of the default stream group. 
     * @type {number}
     * @memberof DefaultStreamGroup
     */
    id?: number;
    /**
     * Array containing details about the streams in the default stream group. 
     * @type {Array<BasicStream>}
     * @memberof DefaultStreamGroup
     */
    streams?: Array<BasicStream>;
}

export function DefaultStreamGroupFromJSON(json: any): DefaultStreamGroup {
    return {
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'id': !exists(json, 'id') ? undefined : json['id'],
        'streams': !exists(json, 'streams') ? undefined : (json['streams'] as Array<any>).map(BasicStreamFromJSON),
    };
}

export function DefaultStreamGroupToJSON(value?: DefaultStreamGroup): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
        'description': value.description,
        'id': value.id,
        'streams': value.streams === undefined ? undefined : (value.streams as Array<any>).map(BasicStreamToJSON),
    };
}


