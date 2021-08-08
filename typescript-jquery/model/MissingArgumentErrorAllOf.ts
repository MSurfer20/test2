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

import * as models from './models';

/**
 * ## Missing request parameter(s)  A typical failed JSON response for when a required request parameter is not supplied 
 */
export interface MissingArgumentErrorAllOf {
    result?: any;

    msg?: any;

    code?: any;

    /**
     * It contains the information about the missing parameter. 
     */
    var_name?: string;

}
