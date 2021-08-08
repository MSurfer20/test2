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
 * 
 * @param text The original link text present in the topic. 
 * @param url The expanded target url which the link points to. 
 */
data class MessagesBaseTopicLinks(
    /* The original link text present in the topic.  */
    val text: kotlin.String? = null,
    /* The expanded target url which the link points to.  */
    val url: kotlin.String? = null
) 
