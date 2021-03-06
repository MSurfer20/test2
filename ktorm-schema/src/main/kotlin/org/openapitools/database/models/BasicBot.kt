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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param userId 
 * @param fullName 
 * @param apiKey 
 * @param defaultSendingStream 
 * @param defaultEventsRegisterStream 
 * @param defaultAllPublicStreams 
 * @param avatarUrl 
 * @param ownerId 
 * @param services 
 */
object BasicBots : BaseTable<BasicBot>("BasicBot") {
    val userId = blob("user_id") /* null */
    val fullName = blob("full_name") /* null */
    val apiKey = blob("api_key") /* null */
    val defaultSendingStream = blob("default_sending_stream") /* null */
    val defaultEventsRegisterStream = blob("default_events_register_stream") /* null */
    val defaultAllPublicStreams = blob("default_all_public_streams") /* null */
    val avatarUrl = blob("avatar_url") /* null */
    val ownerId = blob("owner_id") /* null */
    val services = blob("services") /* null */

    /**
     * Create an entity of type BasicBot from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BasicBot(
        userId = row[userId]  /* kotlin.Any? */,
        fullName = row[fullName]  /* kotlin.Any? */,
        apiKey = row[apiKey]  /* kotlin.Any? */,
        defaultSendingStream = row[defaultSendingStream]  /* kotlin.Any? */,
        defaultEventsRegisterStream = row[defaultEventsRegisterStream]  /* kotlin.Any? */,
        defaultAllPublicStreams = row[defaultAllPublicStreams]  /* kotlin.Any? */,
        avatarUrl = row[avatarUrl]  /* kotlin.Any? */,
        ownerId = row[ownerId]  /* kotlin.Any? */,
        services = row[services]  /* kotlin.Any? */
    )

    /**
    * Assign all the columns from the entity of type BasicBot to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BasicBot()
    * database.update(BasicBots, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BasicBot) {
        this.apply {
            set(BasicBots.userId, entity.userId)
            set(BasicBots.fullName, entity.fullName)
            set(BasicBots.apiKey, entity.apiKey)
            set(BasicBots.defaultSendingStream, entity.defaultSendingStream)
            set(BasicBots.defaultEventsRegisterStream, entity.defaultEventsRegisterStream)
            set(BasicBots.defaultAllPublicStreams, entity.defaultAllPublicStreams)
            set(BasicBots.avatarUrl, entity.avatarUrl)
            set(BasicBots.ownerId, entity.ownerId)
            set(BasicBots.services, entity.services)
        }
    }

}


