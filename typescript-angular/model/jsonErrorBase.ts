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
import { JsonResponseBase } from './jsonResponseBase';
import { JsonErrorBaseAllOf } from './jsonErrorBaseAllOf';


export interface JsonErrorBase { 
    result: JsonErrorBase.ResultEnum;
    msg: string;
}
export namespace JsonErrorBase {
    export type ResultEnum = 'error';
    export const ResultEnum = {
        Error: 'error' as ResultEnum
    };
}


