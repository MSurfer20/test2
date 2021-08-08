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
 * @param userId The user id of the bot. 
 * @param fullName The full name of the bot. 
 * @param apiKey The API key of the bot which it uses to make API requests. 
 * @param defaultSendingStream The default sending stream of the bot. Null if the bot doesn't have a default sending stream. 
 * @param defaultEventsRegisterStream The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream. 
 * @param defaultAllPublicStreams Whether the bot can send messages to all streams by default. 
 * @param avatarUrl The URL of the bot's avatar. 
 * @param ownerId The user id of the bot's owner.  Null if the bot has no owner. 
 * @param services The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change. 
 */
object BasicBotBases : BaseTable<BasicBotBase>("BasicBotBase") {
    val userId = int("user_id") /* null */ /* The user id of the bot.  */
    val fullName = text("full_name") /* null */ /* The full name of the bot.  */
    val apiKey = text("api_key") /* null */ /* The API key of the bot which it uses to make API requests.  */
    val defaultSendingStream = text("default_sending_stream") /* null */ /* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */
    val defaultEventsRegisterStream = text("default_events_register_stream") /* null */ /* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */
    val defaultAllPublicStreams = boolean("default_all_public_streams") /* null */ /* Whether the bot can send messages to all streams by default.  */
    val avatarUrl = text("avatar_url") /* null */ /* The URL of the bot's avatar.  */
    val ownerId = int("owner_id") /* null */ /* The user id of the bot's owner.  Null if the bot has no owner.  */

    /**
     * Create an entity of type BasicBotBase from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BasicBotBase(
        userId = row[userId]  /* kotlin.Int? */ /* The user id of the bot.  */,
        fullName = row[fullName]  /* kotlin.String? */ /* The full name of the bot.  */,
        apiKey = row[apiKey]  /* kotlin.String? */ /* The API key of the bot which it uses to make API requests.  */,
        defaultSendingStream = row[defaultSendingStream]  /* kotlin.String? */ /* The default sending stream of the bot. Null if the bot doesn't have a default sending stream.  */,
        defaultEventsRegisterStream = row[defaultEventsRegisterStream]  /* kotlin.String? */ /* The default stream for which the bot receives events/register data. Null if the bot doesn't have such a default stream.  */,
        defaultAllPublicStreams = row[defaultAllPublicStreams]  /* kotlin.Boolean? */ /* Whether the bot can send messages to all streams by default.  */,
        avatarUrl = row[avatarUrl]  /* kotlin.String? */ /* The URL of the bot's avatar.  */,
        ownerId = row[ownerId]  /* kotlin.Int? */ /* The user id of the bot's owner.  Null if the bot has no owner.  */,
        services = emptyList() /* kotlin.Array<OneOfLessThanObjectCommaObjectGreaterThan>? */ /* The \"Services\" array contains extra configuration fields only relevant for Outgoing webhook bots and Embedded bots.  It is always a single-element array.  We consider this part of the Zulip API to be unstable; it is used only for UI elements for administering bots and is likely to change.  */
    )

    /**
    * Assign all the columns from the entity of type BasicBotBase to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BasicBotBase()
    * database.update(BasicBotBases, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BasicBotBase) {
        this.apply {
            set(BasicBotBases.userId, entity.userId)
            set(BasicBotBases.fullName, entity.fullName)
            set(BasicBotBases.apiKey, entity.apiKey)
            set(BasicBotBases.defaultSendingStream, entity.defaultSendingStream)
            set(BasicBotBases.defaultEventsRegisterStream, entity.defaultEventsRegisterStream)
            set(BasicBotBases.defaultAllPublicStreams, entity.defaultAllPublicStreams)
            set(BasicBotBases.avatarUrl, entity.avatarUrl)
            set(BasicBotBases.ownerId, entity.ownerId)
        }
    }

}


object BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan : BaseTable<Pair<kotlin.Long, kotlin.Long>>("BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan") {
    val basicBotBase = long("basicBotBase")
    val oneOfLessThanObjectCommaObjectGreaterThan = long("oneOfLessThanObjectCommaObjectGreaterThan")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[basicBotBase] ?: 0, row[oneOfLessThanObjectCommaObjectGreaterThan] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan.basicBotBase, entity.first)
            set(BasicBotBaseOneOfLessThanObjectCommaObjectGreaterThan.oneOfLessThanObjectCommaObjectGreaterThan, entity.second)
        }
    }

}

