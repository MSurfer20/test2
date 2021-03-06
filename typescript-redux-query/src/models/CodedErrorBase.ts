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

import {
    CodedErrorBaseAllOf,
    CodedErrorBaseAllOfFromJSON,
    CodedErrorBaseAllOfToJSON,
    JsonErrorBase,
    JsonErrorBaseFromJSON,
    JsonErrorBaseToJSON,
} from './';

/**
 * @type CodedErrorBase
 * @export
 */
export interface CodedErrorBase extends CodedErrorBaseAllOf, JsonErrorBase {
}

export function CodedErrorBaseFromJSON(json: any): CodedErrorBase {
    return {
        ...CodedErrorBaseAllOfFromJSON(json),
        ...JsonErrorBaseFromJSON(json),
    };
}

export function CodedErrorBaseToJSON(value?: CodedErrorBase): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...CodedErrorBaseAllOfToJSON(value),
        ...JsonErrorBaseToJSON(value),
    };
}
