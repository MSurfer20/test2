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
    CodedErrorBase,
    CodedErrorBaseFromJSON,
    CodedErrorBaseToJSON,
    NonExistingStreamErrorAllOf,
    NonExistingStreamErrorAllOfFromJSON,
    NonExistingStreamErrorAllOfToJSON,
} from './';

/**
 * @type NonExistingStreamError
 * @export
 */
export interface NonExistingStreamError extends CodedErrorBase, NonExistingStreamErrorAllOf {
}

export function NonExistingStreamErrorFromJSON(json: any): NonExistingStreamError {
    return {
        ...CodedErrorBaseFromJSON(json),
        ...NonExistingStreamErrorAllOfFromJSON(json),
    };
}

export function NonExistingStreamErrorToJSON(value?: NonExistingStreamError): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...CodedErrorBaseToJSON(value),
        ...NonExistingStreamErrorAllOfToJSON(value),
    };
}
