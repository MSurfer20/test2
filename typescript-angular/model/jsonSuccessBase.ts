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
import { JsonSuccessBaseAllOf } from './jsonSuccessBaseAllOf';


export interface JsonSuccessBase { 
    result: JsonSuccessBase.ResultEnum;
    msg: string;
}
export namespace JsonSuccessBase {
    export type ResultEnum = 'success';
    export const ResultEnum = {
        Success: 'success' as ResultEnum
    };
}

