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

/**
 * Object containing details of the newly added domain. 
 * @export
 * @interface RealmDomain
 */
export interface RealmDomain {
    /**
     * The new allowed domain. 
     * @type {string}
     * @memberof RealmDomain
     */
    domain?: string;
    /**
     * Whether subdomains are allowed for this domain. 
     * @type {boolean}
     * @memberof RealmDomain
     */
    allow_subdomains?: boolean;
}
