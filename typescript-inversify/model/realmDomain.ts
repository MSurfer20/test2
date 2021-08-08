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
 * Object containing details of the newly added domain. 
 */
export interface RealmDomain { 
    /**
     * The new allowed domain. 
     */
    domain?: string;
    /**
     * Whether subdomains are allowed for this domain. 
     */
    allow_subdomains?: boolean;
}