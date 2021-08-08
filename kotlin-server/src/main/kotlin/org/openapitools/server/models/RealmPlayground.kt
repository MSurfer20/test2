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
package org.openapitools.server.models


/**
 * Object containing details about a realm playground. 
 * @param id The unique ID for the realm playground. 
 * @param name The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49). 
 * @param pygmentsLanguage The name of the Pygments language lexer for that programming language. 
 * @param urlPrefix The url prefix for the playground. 
 */
data class RealmPlayground(
    /* The unique ID for the realm playground.  */
    val id: kotlin.Int? = null,
    /* The user-visible display name of the playground.  Clients should display this in UI for picking which playground to open a code block in, to differentiate between multiple configured playground options for a given pygments language.  **Changes**: New in Zulip 4.0 (feature level 49).  */
    val name: kotlin.String? = null,
    /* The name of the Pygments language lexer for that programming language.  */
    val pygmentsLanguage: kotlin.String? = null,
    /* The url prefix for the playground.  */
    val urlPrefix: kotlin.String? = null
) 

