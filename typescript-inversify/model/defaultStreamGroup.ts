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
import { BasicStream } from './basicStream';


/**
 * Dictionary containing details of a default stream group. 
 */
export interface DefaultStreamGroup { 
    /**
     * Name of the default stream group. 
     */
    name?: string;
    /**
     * Description of the default stream group. 
     */
    description?: string;
    /**
     * id of the default stream group. 
     */
    id?: number;
    /**
     * Array containing details about the streams in the default stream group. 
     */
    streams?: Array<BasicStream>;
}
